package cn.lemonit.tencent_cloud_im_server_sdk.model.group;

import cn.lemonit.tencent_cloud_im_server_sdk.model.common.CustomKeyValue;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class ReqCreateGroupMember {
    private String Member_Account;
    private String Role;
    private List<CustomKeyValue> AppMemberDefinedData;
}
