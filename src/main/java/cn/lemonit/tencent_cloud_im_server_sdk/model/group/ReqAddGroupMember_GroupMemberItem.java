package cn.lemonit.tencent_cloud_im_server_sdk.model.group;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReqAddGroupMember_GroupMemberItem {
    /**
     * 要添加的群成员ID（必填）
     */
    private String Member_Account;

}
