package cn.lemonit.tencent_cloud_im_server_sdk.enums.common;

/**
 * 消息类型
 */
public enum MessageType {
    TIMTextElem("TIMTextElem"),
    TIMLocationElem("TIMLocationElem"),
    TIMFaceElem("TIMFaceElem"),
    TIMCustomElem("TIMCustomElem"),
    TIMSoundElem("TIMSoundElem"),
    TIMImageElem("TIMImageElem"),
    TIMFileElem("TIMFileElem"),
    TIMVideoFileElem("TIMVideoFileElem");
    
    private String code;

    MessageType(String code) {
        this.code = code;
    }
}
