package cn.lemonit.tencent_cloud_im_server_sdk;

import cn.lemonit.tencent_cloud_im_server_sdk.service.GroupManageService;
import cn.lemonit.tencent_cloud_im_server_sdk.service.UserManageService;
import cn.lemonit.tencent_cloud_im_server_sdk.utils.UserSigUtil;
import lombok.Getter;

import java.util.Date;

@Getter
public class IMClient {

    private long appId;
    private String appKey;
    private String userId;
    private String sig;
    private Long expireLength;
    private Long expiredAtTimestamp = 0L;

    private IMClient() {
    }

    private static final String URL_FORMAT = "https://console.tim.qq.com/v4/%s/%s?sdkappid=%d&identifier=%s&usersig=%s&random=%d&contenttype=json";

    public static IMClient newInstance(long appId, String appKey, String userId, long expireLength) {
        IMClient imClient = new IMClient();
        imClient.appId = appId;
        imClient.appKey = appKey;
        imClient.userId = userId;
        imClient.expireLength = expireLength;

        return imClient;
    }

    public String getSig() {
        // 当前没有sig或者 还有十分钟过期的时候，更换SIG
        if (expiredAtTimestamp == 0 || (new Date().getTime() >= (expiredAtTimestamp - 1000 * 60 * 10))) {
            this.sig = UserSigUtil.genUserSig(appId, appKey, userId, this.expireLength);
            this.expiredAtTimestamp = new Date().getTime() + this.expireLength;
            System.out.printf("创建新的用户授权 USER ID：[%s], SIG: [%s]\n", this.userId, this.sig);
        }
        return sig;
    }

    /**
     * 根据业务名称和命令生成网络请求URL
     * 生成URL中会包含用户授权
     *
     * @param serviceName 业务名称
     * @param commandName 命令名称
     * @return 完整的网络请求URL
     */
    public String createUrl(String serviceName, String commandName) {
        return String.format(URL_FORMAT, serviceName, commandName, this.getAppId(), this.getUserId(), this.getSig(), this.generateRandomNumber());
    }

    private Integer generateRandomNumber() {
        return ((Double) Math.floor(Math.random() * 10000000)).intValue();
    }

    private UserManageService userManageService;
    private GroupManageService groupManageService;

    public UserManageService getUserManageService() {
        if (this.userManageService == null) {
            this.userManageService = new UserManageService(this);
        }
        return userManageService;
    }

    public GroupManageService getGroupManageService() {
        if (this.groupManageService == null) {
            this.groupManageService = new GroupManageService(this);
        }
        return groupManageService;
    }
}
