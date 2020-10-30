package cn.lemonit.tencent_cloud_im_server_sdk.model.group;

import cn.lemonit.tencent_cloud_im_server_sdk.model.common.ApiResponse;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RespCreateGroup extends ApiResponse {
    private String GroupId;
}
