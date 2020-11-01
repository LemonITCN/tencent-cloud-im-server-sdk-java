package cn.lemonit.tencent_cloud_im_server_sdk.service;

import cn.lemonit.tencent_cloud_im_server_sdk.exceptions.ServiceException;
import cn.lemonit.tencent_cloud_im_server_sdk.model.common.ApiResponse;
import cn.lemonit.tencent_cloud_im_server_sdk.utils.JsonUtil;
import cn.lemonit.tencent_cloud_im_server_sdk.utils.RestTemplateUtil;
import org.springframework.http.ResponseEntity;

public class BaseService {

    protected <T extends ApiResponse> T post(String url, Class<T> responseBodyType, Object request) throws ServiceException {
        System.out.println("请求数据：" + JsonUtil.gsonObj().toJson(request));
        return processResponse(url, RestTemplateUtil.getInstance().postForEntity(url, request, responseBodyType));
    }

    protected <T extends ApiResponse> T processResponse(String url, ResponseEntity<T> response) throws ServiceException {
        if (response.getBody().getErrorCode().equals("0")) {
            return response.getBody();
        } else {
            ApiResponse respBody = response.getBody();
            throw new ServiceException(url, respBody.getActionStatus(), respBody.getErrorInfo(), respBody.getErrorCode());
        }
    }

}
