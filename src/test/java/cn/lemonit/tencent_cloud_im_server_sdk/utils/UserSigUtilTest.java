package cn.lemonit.tencent_cloud_im_server_sdk.utils;

import cn.lemonit.tencent_cloud_im_server_sdk.Common;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("腾讯云用户SIG工具类测试")
class UserSigUtilTest {

    @Test
    @DisplayName("测试生成的SIG是长度大于0的字符串")
    void genUserSig() {
        String sig = UserSigUtil.genUserSig(Common.APP_ID, Common.APP_KEY, Common.ADMIN_USER_ID, Common.SIG_EXPIRE_LENGTH);
        assertTrue(sig.length() > 0);
    }
}