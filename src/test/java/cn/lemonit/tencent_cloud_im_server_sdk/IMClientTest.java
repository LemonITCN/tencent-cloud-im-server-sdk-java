package cn.lemonit.tencent_cloud_im_server_sdk;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IMClientTest {

    @Test
    @DisplayName("测试创建请求客户端")
    void newInstance() {
        assertDoesNotThrow(() -> {
            IMClient imClient = Common.createClient();
            assertNotNull(imClient);
        });
    }

    @Test
    @DisplayName("测试生成服务调用的URL")
    void createUrl() {
        String url = Common.createClient().createUrl("SERVICE", "COMMAND");
        System.out.println("URL:" + url);
        assertFalse(url.contains("null") && url.contains("%s"));
    }
}