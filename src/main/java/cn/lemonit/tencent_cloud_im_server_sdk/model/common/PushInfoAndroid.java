package cn.lemonit.tencent_cloud_im_server_sdk.model.common;

import lombok.*;

/**
 * 离线推送信息定义
 * 安卓
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PushInfoAndroid {
    /**
     * Android 离线推送声音文件路径。
     */
    private String Sound;
    /**
     * 华为手机 EMUI 10.0 及以上的通知渠道字段。
     */
    private String HuaWeiChannelID;
    /**
     * 小米手机 MIUI 10 及以上的通知类别（Channel）适配字段。
     */
    private String XiaoMiChannelID;
    /**
     * OPPO 手机 Android 8.0 及以上的 NotificationChannel 通知适配字段。
     */
    private String OPPOChannelID;
    /**
     * Google 手机 Android 8.0 及以上的通知渠道字段。Google 推送新接口（上传证书文件）支持 channel id ，旧接口（填写服务器密钥）不支持。
     */
    private String GoogleChannelID;

}
