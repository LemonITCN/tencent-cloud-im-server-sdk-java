package cn.lemonit.tencent_cloud_im_server_sdk.enums.common;

import lombok.Getter;

/**
 * 消息回调禁止开关，只对单条消息有效
 */
@Getter
public enum ForbidCallbackControl {
    /**
     * 表示禁止发消息前回调
     */
    ForbidBeforeSendMsgCallback("ForbidBeforeSendMsgCallback"),
    /**
     * 表示禁止发消息后回调
     */
    ForbidAfterSendMsgCallback("ForbidBeforeSendMsgCallback");

    private String code;

    ForbidCallbackControl(String code) {
        this.code = code;
    }
}
