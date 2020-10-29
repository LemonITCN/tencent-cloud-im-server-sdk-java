package cn.lemonit.tencent_cloud_im_server_sdk.model.common;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ApiResponse {
    /**
     * 请求处理的结果，OK 表示处理成功，FAIL 表示失败，如果为 FAIL，ErrorInfo 带上失败原因
     */
    private String ActionStatus;
    /**
     * 失败原因
     */
    private String ErrorInfo;
    /**
     * 错误码，0为成功，其他为失败，可查询 错误码表 得到具体的原因
     * 错误码表URL： https://cloud.tencent.com/document/product/269/1671
     */
    private String ErrorCode;
}
