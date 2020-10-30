package cn.lemonit.tencent_cloud_im_server_sdk.model.common;

import lombok.*;

/**
 * 离线推送信息定义
 * 苹果APNS
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PushInfoApns {
    /**
     * Android 离线推送声音文件路径。
     */
    private String Sound;
    /**
     * 这个字段缺省或者为0表示需要计数，为1表示本条消息不需要计数，即右上角图标数字不增加。
     */
    private Integer BadgeMode;
    /**
     * 该字段用于标识 APNs 推送的标题，若填写则会覆盖最上层 Title。
     */
    private String Title;
    /**
     * 该字段用于标识 APNs 推送的子标题。
     */
    private String SubTitle;
    /**
     * 该字段用于标识 APNs 携带的图片地址，当客户端拿到该字段时，可以通过下载图片资源的方式将图片展示在弹窗上。
     */
    private String Image;

}
