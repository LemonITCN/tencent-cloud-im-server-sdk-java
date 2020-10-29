package cn.lemonit.tencent_cloud_im_server_sdk.exceptions;

import lombok.Getter;

@Getter
public class ServiceException extends Exception {
    /**
     * 本次请求的完整URL
     */
    private String url;
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

    public ServiceException(String url, String actionStatus, String errorInfo, String errorCode) {
        super("ErrorCode: " + errorCode + ",Error Info: " + errorInfo);
        System.out.println("创建了ServiceException，Url: " + url);
        this.url = url;
        ActionStatus = actionStatus;
        ErrorInfo = errorInfo;
        ErrorCode = errorCode;
    }
}
