package cn.lemonit.tencent_cloud_im_server_sdk.model.group;

import cn.lemonit.tencent_cloud_im_server_sdk.model.common.ApiResponse;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class RespAddGroupMember extends ApiResponse {
    private List<RespAddGroupMember_GroupMemberItem> MemberList;
}
