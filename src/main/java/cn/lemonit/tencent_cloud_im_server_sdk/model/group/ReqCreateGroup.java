package cn.lemonit.tencent_cloud_im_server_sdk.model.group;

import cn.lemonit.tencent_cloud_im_server_sdk.enums.group.GroupApplyJoinOption;
import cn.lemonit.tencent_cloud_im_server_sdk.enums.group.GroupType;
import cn.lemonit.tencent_cloud_im_server_sdk.model.common.CustomKeyValue;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class ReqCreateGroup {
    /**
     * 群主 ID，自动添加到群成员中。如果不填，群没有群主
     * 选填
     */
    private String Owner_Account;
    /**
     * 群组形态，包括 Public（陌生人社交群），Private（即 Work，好友工作群），ChatRoom（即 Meeting，会议群），AVChatRoom（直播群）
     * 必填
     */
    private GroupType Type;
    /**
     * 为了使得群组 ID 更加简单，便于记忆传播，腾讯云支持 App 在通过 REST API 创建群组时 自定义群组 ID
     * 选填
     */
    private String GroupId;
    /**
     * 群名称，最长30字节，使用 UTF-8 编码，1个汉字占3个字节
     * 必填
     */
    private String Name;
    /**
     * 群简介，最长240字节，使用 UTF-8 编码，1个汉字占3个字节
     * 选填
     */
    private String Introduction;
    /**
     * 群公告，最长300字节，使用 UTF-8 编码，1个汉字占3个字节
     * 选填
     */
    private String Notification;
    /**
     * 群头像 URL，最长100字节
     * 选填
     */
    private String FaceUrl;
    /**
     * 最大群成员数量，缺省时的默认值：私有群是200，公开群是2000，聊天室是6000，音视频聊天室和在线成员广播大群无限制
     * 选填
     */
    private Integer MaxMemberCount;
    /**
     * 申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群），不填默认为 NeedPermission（需要验证）
     * 仅当创建支持申请加群的 群组 时，该字段有效
     */
    private GroupApplyJoinOption ApplyJoinOption;
    private List<CustomKeyValue> AppDefinedData;
    private List<ReqCreateGroupMember> MemberList;
}
