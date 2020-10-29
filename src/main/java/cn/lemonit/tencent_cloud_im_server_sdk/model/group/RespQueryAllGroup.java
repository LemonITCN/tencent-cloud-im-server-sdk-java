package cn.lemonit.tencent_cloud_im_server_sdk.model.group;

import cn.lemonit.tencent_cloud_im_server_sdk.model.common.ApiResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

class GroupIdData {

}

@Getter
@Setter
public class RespQueryAllGroup extends ApiResponse {
    /**
     * App 当前的群组总数。如果仅需要返回特定群组形态的群组，
     * 可以通过 GroupType 进行过滤，但此时返回的 TotalCount 的含义就变成了 App 中该群组形态的群组总数；
     * 例如：假设 App 旗下总共 50000 个群组，其中有 20000 个为公开群组，
     * 如果将请求包体中的 GroupType 设置为 Public，那么不论 Limit 和 Offset 怎样设置，
     * 应答包体中的 TotalCount 都为 20000，且 GroupIdList 中的群组全部为公开群组
     */
    private Integer TotalCount;
    /**
     * 获取到的群组 ID 的集合
     */
    private List<GroupIdData> GroupIdList;
    /**
     * 分页拉取的标志
     */
    private Integer Next;
}
