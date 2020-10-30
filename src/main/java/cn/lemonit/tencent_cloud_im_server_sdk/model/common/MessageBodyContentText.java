package cn.lemonit.tencent_cloud_im_server_sdk.model.common;

import lombok.*;

/**
 * 文本类消息内容
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageBodyContentText extends MessageBodyContent {
    /**
     * 文本消息内容
     */
    private String Text;
}
