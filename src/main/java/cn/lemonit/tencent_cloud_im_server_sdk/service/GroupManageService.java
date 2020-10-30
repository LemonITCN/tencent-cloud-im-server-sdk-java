package cn.lemonit.tencent_cloud_im_server_sdk.service;

import cn.lemonit.tencent_cloud_im_server_sdk.IMClient;
import cn.lemonit.tencent_cloud_im_server_sdk.exceptions.ServiceException;
import cn.lemonit.tencent_cloud_im_server_sdk.model.group.*;

public class GroupManageService extends BaseService {
    private static final String SERVICE_NAME = "group_open_http_svc";
    private static final String COMMAND_GET_APP_ID_GROUP_LIST = "get_appid_group_list";
    private static final String COMMAND_CREATE_GROUP = "create_group";
    private static final String COMMAND_ADD_GROUP_MEMBER = "add_group_member";
    private static final String COMMAND_REMOVE_GROUP_MEMBER = "delete_group_member";

    private final IMClient imClient;

    public GroupManageService(IMClient imClient) {
        this.imClient = imClient;
    }

    /**
     * App 管理员可以通过该接口获取 App 中所有群组的 ID。
     *
     * @param reqQueryAllGroup 获取列表筛选条件
     * @return 查询结果
     * @throws ServiceException 接口异常
     */
    public RespQueryAllGroup getAppIdGroupList(ReqQueryAllGroup reqQueryAllGroup) throws ServiceException {
        String url = imClient.createUrl(SERVICE_NAME, COMMAND_GET_APP_ID_GROUP_LIST);
        return post(url, RespQueryAllGroup.class, reqQueryAllGroup);
    }

    /**
     * App 管理员可以通过该接口创建群组。
     * 以下视频将帮助您快速了解如何通过 REST API 创建群组：
     *
     * @param reqCreateGroup 群组创建参数配置
     * @return 创建结果
     * @throws ServiceException 接口异常
     */
    public RespCreateGroup createGroup(ReqCreateGroup reqCreateGroup) throws ServiceException {
        String url = imClient.createUrl(SERVICE_NAME, COMMAND_CREATE_GROUP);
        return post(url, RespCreateGroup.class, reqCreateGroup);
    }
    // TODO 获取群详细资料
    // TODO 获取群成员详细资料
    // TODO 修改群基础资料

    /**
     * 增加群成员
     *
     * @param reqAddGroupMember 请求参数
     * @return 添加结果
     * @throws ServiceException 接口异常
     */
    public RespAddGroupMember addGroupMember(ReqAddGroupMember reqAddGroupMember) throws ServiceException {
        String url = imClient.createUrl(SERVICE_NAME, COMMAND_ADD_GROUP_MEMBER);
        return post(url, RespAddGroupMember.class, reqAddGroupMember);
    }

    /**
     * 删除群成员
     *
     * @param reqRemoveGroupMember 请求参数
     * @return 删除结果
     * @throws ServiceException 接口异常
     */
    public RespRemoveGroupMember removeGroupMember(ReqRemoveGroupMember reqRemoveGroupMember) throws ServiceException {
        String url = imClient.createUrl(SERVICE_NAME, COMMAND_REMOVE_GROUP_MEMBER);
        return post(url, RespRemoveGroupMember.class, reqRemoveGroupMember);
    }
    // TODO 修改群成员资料
    // TODO 解散群组
    // TODO 获取用户所加入的群组
    // TODO 查询用户在群组中的身份
    // TODO 批量禁言和取消禁言
    // TODO 获取被禁言群成员列表
    // TODO 在群组中发送普通消息
    // TODO 在群组中发送系统通知
    // TODO 撤回群消息
    // TODO 转让群主
    // TODO 导入群基础资料
    // TODO 导入群消息
    // TODO 导入群成员
    // TODO 设置成员未读消息计数
    // TODO 删除指定用户发送的消息
    // TODO 拉取群历史消息
    // TODO 获取直播群在线人数
}
