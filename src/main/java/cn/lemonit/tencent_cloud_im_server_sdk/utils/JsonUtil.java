package cn.lemonit.tencent_cloud_im_server_sdk.utils;

import com.google.gson.Gson;

public class JsonUtil {

    private static Gson gson;

    public static Gson gsonObj() {
        if (gson == null) {
            gson = new Gson();
        }
        return gson;
    }

}
