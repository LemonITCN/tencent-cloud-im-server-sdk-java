package cn.lemonit.tencent_cloud_im_server_sdk.model.group;

import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReqRemoveGroupMember {
    /**
     * 要操作的群组
     * 必填
     */
    private String GroupId;
    /**
     * 是否静默删除
     * 0表示非静默删人，1表示静默删人。静默即删除成员时不通知群里所有成员，只通知被删除群成员。不填写该字段时默认为0
     * 选填
     */
    private Integer Silence;
    /**
     * 踢出用户原因
     * 选填
     */
    private String Reason;
    /**
     * 要删除的群成员列表，最多500个
     */
    private List<String> MemberToDel_Account;
}
