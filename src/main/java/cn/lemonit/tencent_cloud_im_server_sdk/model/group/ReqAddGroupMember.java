package cn.lemonit.tencent_cloud_im_server_sdk.model.group;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class ReqAddGroupMember {

    /**
     * 要操作的群组
     * 必填
     */
    private String GroupId;
    /**
     * 是否静默加人。0：非静默加人；1：静默加人。不填该字段默认为0
     * 选填
     */
    private Integer Silence;
    /**
     * 成员列表，一次最多添加500个成员
     * 必填
     */
    private List<ReqAddGroupMember_GroupMemberItem> MemberList;
}
