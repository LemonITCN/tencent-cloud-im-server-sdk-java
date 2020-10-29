package cn.lemonit.tencent_cloud_im_server_sdk.utils;

import org.springframework.web.client.RestTemplate;

public class RestTemplateUtil {

    private static RestTemplate restTemplateInstance;

    public static RestTemplate getInstance() {
        if (restTemplateInstance == null) {
            restTemplateInstance = new RestTemplate();
        }
        return restTemplateInstance;
    }

}
