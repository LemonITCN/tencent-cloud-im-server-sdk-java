package cn.lemonit.tencent_cloud_im_server_sdk.enums.group;

public enum GroupType {
    /**
     * 公开群
     */
    PUBLIC("Public"),
    /**
     * 私密群
     */
    PRIVATE("Private"),
    /**
     * 聊天室
     */
    CHATROOM("ChatRoom"),
    /**
     * 音视频聊天室
     */
    AVCHATROOM("AVChatRoom"),
    /**
     * 在线成员广播大群
     */
    BCHATROOM("BChatRoom");

    private String code;

    public String getCode() {
        return code;
    }

    GroupType(String code) {
        this.code = code;
    }
}
