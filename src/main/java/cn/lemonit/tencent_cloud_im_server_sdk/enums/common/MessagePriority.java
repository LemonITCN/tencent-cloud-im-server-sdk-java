package cn.lemonit.tencent_cloud_im_server_sdk.enums.common;

/**
 * 消息的优先级
 */
public enum MessagePriority {
    High("High"),
    Normal("Normal"),
    Low("Low"),
    Lowest("Lowest");
    private String code;

    MessagePriority(String code) {
        this.code = code;
    }
}
