/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.lemonit.tencent_cloud_im_server_sdk.model.common;

import cn.lemonit.tencent_cloud_im_server_sdk.enums.common.MessageType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 文本消息消息体
 */
@Getter
@Setter
@NoArgsConstructor
public class MessageBodyText extends MessageBody<MessageBodyContentText> {

    public MessageBodyText(MessageBodyContentText MsgContent) {
        super();
        this.setMsgType(MessageType.TIMTextElem);
        this.setMsgContent(MsgContent);
    }
}
