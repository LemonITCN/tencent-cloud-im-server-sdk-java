package cn.lemonit.tencent_cloud_im_server_sdk.model.group;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RespAddGroupMember_GroupMemberItem extends ReqAddGroupMember_GroupMemberItem {
    private Integer Result;
}
