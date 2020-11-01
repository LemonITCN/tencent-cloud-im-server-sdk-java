package cn.lemonit.tencent_cloud_im_server_sdk.service;

import cn.lemonit.tencent_cloud_im_server_sdk.Common;
import cn.lemonit.tencent_cloud_im_server_sdk.enums.group.GroupApplyJoinOption;
import cn.lemonit.tencent_cloud_im_server_sdk.enums.group.GroupType;
import cn.lemonit.tencent_cloud_im_server_sdk.model.common.MessageBodyContentText;
import cn.lemonit.tencent_cloud_im_server_sdk.model.common.MessageBodyText;
import cn.lemonit.tencent_cloud_im_server_sdk.model.group.*;
import cn.lemonit.tencent_cloud_im_server_sdk.utils.JsonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@DisplayName("群组管理")
class GroupManageServiceTest {

    @Test
    @DisplayName("获取 App 中的所有群组")
    void getAppIdGroupList() {
        assertDoesNotThrow(() -> {
            RespQueryAllGroup result = Common.createClient().getGroupManageService().getAppIdGroupList(
                    ReqQueryAllGroup.builder()
                            .Limit(10)
                            .Next(0L).build()
            );
            System.out.println("请求结果：" + JsonUtil.gsonObj().toJson(result));
        });
    }

    @Test
    @DisplayName("创建群组")
    void createGroup() {
        assertDoesNotThrow(() -> {
            RespCreateGroup result = Common.createClient().getGroupManageService().createGroup(
                    ReqCreateGroup.builder()
                            .Name("Test")
                            .GroupId("test")
                            .Type(GroupType.ChatRoom)
                            .ApplyJoinOption(GroupApplyJoinOption.FreeAccess)
                            .build());
            System.out.println("请求结果：" + JsonUtil.gsonObj().toJson(result));
        });
    }

    @Test
    @DisplayName("增加群成员")
    void addGroupMember() {
        assertDoesNotThrow(() -> {
            RespAddGroupMember result = Common.createClient().getGroupManageService().addGroupMember(
                    ReqAddGroupMember.builder()
                            .Silence(1)
                            .GroupId("test")
                            .MemberList(Collections.singletonList(
                                    ReqAddGroupMember_GroupMemberItem.builder().Member_Account("administrator").build())
                            ).build());
            System.out.println("请求结果：" + JsonUtil.gsonObj().toJson(result));
        });
    }

    @Test
    @DisplayName("删除增加群成员")
    void removeGroupMember() {
        assertDoesNotThrow(() -> {
            RespRemoveGroupMember result = Common.createClient().getGroupManageService().removeGroupMember(
                    ReqRemoveGroupMember.builder()
                            .Silence(1).GroupId("test")
                            .MemberToDel_Account(Collections.singletonList("administrator")).build());
            System.out.println("请求结果：" + JsonUtil.gsonObj().toJson(result));
        });
    }

    @Test
    @DisplayName("在群组中发送普通消息")
    void sendGroupMessage() {
        assertDoesNotThrow(() -> {
            RespSendGroupBasicMessage result = Common.createClient().getGroupManageService().sendGroupMessage(
                    ReqSendGroupMessage.builder()
                            .GroupId("test")
                            .Random(((Double) (Math.random() * 1000)).intValue())
                            .MsgBody(Collections.singletonList(new MessageBodyText(
                                    MessageBodyContentText.builder().Text("").build()
                            ))).build());
            System.out.println("请求结果：" + JsonUtil.gsonObj().toJson(result));
        });
    }

    @Test
    @DisplayName("在群组中发送系统通知")
    void sendGroupSystemNotification() {
        assertDoesNotThrow(() -> {
            RespSendGroupSystemNotification result = Common.createClient().getGroupManageService().sendGroupSystemNotification(
                    ReqSendGroupSystemNotification.builder()
                            .GroupId("test")
                            .Content("{\"content\":\"notification\"}")
                            .build());
            System.out.println("请求结果：" + JsonUtil.gsonObj().toJson(result));
        });
    }

    @Test
    @DisplayName("解散群组")
    void destroyGroup() {
        assertDoesNotThrow(() -> {
            RespDestroyGroup result = Common.createClient().getGroupManageService().destroyGroup(
                    ReqDestroyGroup.builder()
                            .GroupId("test")
                            .build());
            System.out.println("请求结果：" + JsonUtil.gsonObj().toJson(result));
        });
    }
}