package cn.lemonit.tencent_cloud_im_server_sdk.service;

import cn.lemonit.tencent_cloud_im_server_sdk.Common;
import cn.lemonit.tencent_cloud_im_server_sdk.model.group.ReqQueryAllGroup;
import cn.lemonit.tencent_cloud_im_server_sdk.model.group.RespQueryAllGroup;
import cn.lemonit.tencent_cloud_im_server_sdk.utils.JsonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("群组管理")
class GroupManageServiceTest {

    @Test
    @DisplayName("获取 App 中的所有群组")
    void getAppIdGroupList() {
        assertDoesNotThrow(() -> {
            RespQueryAllGroup result = Common.createClient().getGroupManageService().getAppIdGroupList(
                    ReqQueryAllGroup.builder()
                            .Limit(10)
                            .Next(0).build()
            );
            System.out.println("请求结果：" + JsonUtil.gsonObj().toJson(result));
        });
    }
}