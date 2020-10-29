package cn.lemonit.tencent_cloud_im_server_sdk;

public class Common {
    public static final Long APP_ID = 1400441476L;
    public static final String APP_KEY = "1bd57d3e40e685c36ddc3fd8b53aef31d3fe6b7a2706a433d10ce7dfbaa6c231";
    public static final String ADMIN_USER_ID = "administrator";
    public static final Long SIG_EXPIRE_LENGTH = 60 * 60 * 24 * 11 * 1000L;

    public static IMClient createClient() {
        return IMClient.newInstance(APP_ID, APP_KEY, ADMIN_USER_ID, SIG_EXPIRE_LENGTH);
    }
}
