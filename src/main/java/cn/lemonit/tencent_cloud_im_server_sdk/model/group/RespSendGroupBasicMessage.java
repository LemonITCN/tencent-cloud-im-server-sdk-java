package cn.lemonit.tencent_cloud_im_server_sdk.model.group;

import cn.lemonit.tencent_cloud_im_server_sdk.model.common.ApiResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RespSendGroupBasicMessage extends ApiResponse {
    /**
     * 消息发送的时间戳，对应后台 server 时间
     */
    private Long MsgTime;
    /**
     * 消息序列号，唯一标示一条消息
     */
    private Long MsgSeq;
}
