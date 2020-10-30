package cn.lemonit.tencent_cloud_im_server_sdk.model.common;

import lombok.*;

/**
 * 自定义键值对对象
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomKeyValue {
    /**
     * 自定义的字段 Key
     */
    private String Key;
    /**
     * 自定义字段的值
     */
    private String Value;
}
