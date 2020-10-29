package cn.lemonit.tencent_cloud_im_server_sdk.service;

import cn.lemonit.tencent_cloud_im_server_sdk.IMClient;

public class UserManageService {
    private static final String SERVICE_NAME = "im_open_login_svc";

    private final IMClient imClient;

    public UserManageService(IMClient imClient) {
        this.imClient = imClient;
    }
}
