package cn.lemonit.tencent_cloud_im_server_sdk.enums.group;

public enum GroupType {
    /**
     * 公开群
     */
    Public("Public"),
    /**
     * 私密群
     */
    Private("Private"),
    /**
     * 聊天室
     */
    ChatRoom("ChatRoom"),
    /**
     * 音视频聊天室
     */
    AVChatRoom("AVChatRoom"),
    /**
     * 在线成员广播大群
     */
    BChatRoom("BChatRoom");

    private String code;

    public String getCode() {
        return code;
    }

    GroupType(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return this.code;
    }
}
