package cn.lemonit.tencent_cloud_im_server_sdk.model.common;

import cn.lemonit.tencent_cloud_im_server_sdk.enums.common.MessageType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 消息体
 *
 * @param <T> 消息内容
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class MessageBody<T extends MessageBodyContent> {
    private MessageType MsgType;
    private T MsgContent;
}
