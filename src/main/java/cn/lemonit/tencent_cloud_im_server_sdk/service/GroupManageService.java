package cn.lemonit.tencent_cloud_im_server_sdk.service;

import cn.lemonit.tencent_cloud_im_server_sdk.IMClient;
import cn.lemonit.tencent_cloud_im_server_sdk.exceptions.ServiceException;
import cn.lemonit.tencent_cloud_im_server_sdk.model.group.ReqQueryAllGroup;
import cn.lemonit.tencent_cloud_im_server_sdk.model.group.RespQueryAllGroup;

public class GroupManageService extends BaseService {
    private static final String SERVICE_NAME = "group_open_http_svc";
    private static final String COMMAND_GET_APP_ID_GROUP_LIST = "get_appid_group_list";

    private final IMClient imClient;

    public GroupManageService(IMClient imClient) {
        this.imClient = imClient;
    }

    /**
     * App 管理员可以通过该接口获取 App 中所有群组的 ID。
     *
     * @param reqQueryAllGroup 获取列表筛选条件
     * @return 查询结果
     * @throws ServiceException 接口异常
     */
    public RespQueryAllGroup getAppIdGroupList(ReqQueryAllGroup reqQueryAllGroup) throws ServiceException {
        String url = imClient.createUrl(SERVICE_NAME, COMMAND_GET_APP_ID_GROUP_LIST);
        return post(url, RespQueryAllGroup.class, reqQueryAllGroup);
    }
}
