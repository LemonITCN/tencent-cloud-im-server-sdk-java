package cn.lemonit.tencent_cloud_im_server_sdk.model.group;

import cn.lemonit.tencent_cloud_im_server_sdk.enums.common.ForbidCallbackControl;
import cn.lemonit.tencent_cloud_im_server_sdk.enums.common.MessagePriority;
import cn.lemonit.tencent_cloud_im_server_sdk.model.common.MessageBody;
import cn.lemonit.tencent_cloud_im_server_sdk.model.common.OfflinePushInfo;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ReqSendGroupMessage {
    /**
     * 群组ID
     */
    private String GroupId;
    /**
     * 指定消息发送者
     * 选填
     */
    private String From_Account;
    /**
     * 消息的优先级
     */
    private MessagePriority MsgPriority;
    /**
     * 随机数字，五分钟数字相同认为是重复消息
     */
    private Integer Random;
    /**
     * 1表示消息仅发送在线成员，默认0表示发送所有成员，AVChatRoom(直播群)不支持该参数
     */
    private Integer OnlineOnlyFlag;
    /**
     * 消息回调禁止开关，只对单条消息有效，
     * ForbidBeforeSendMsgCallback 表示禁止发消息前回调，
     * ForbidAfterSendMsgCallback 表示禁止发消息后回调
     * 选填
     */
    private List<ForbidCallbackControl> ForbidCallbackControl;
    /**
     * 消息体
     * 列表
     * 必填
     */
    private List<MessageBody> MsgBody;
    /**
     * 离线推送信息配置
     */
    private OfflinePushInfo OfflinePushInfo;

}
