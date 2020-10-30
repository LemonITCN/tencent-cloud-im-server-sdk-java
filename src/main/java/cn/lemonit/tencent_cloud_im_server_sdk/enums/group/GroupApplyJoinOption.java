package cn.lemonit.tencent_cloud_im_server_sdk.enums.group;

/**
 * 申请加群处理方式
 */
public enum GroupApplyJoinOption {
    /**
     * 自由加入
     */
    FreeAccess("FreeAccess"),
    /**
     * 需要验证
     */
    NeedPermission("NeedPermission"),
    /**
     * 禁止加群
     */
    DisableApply("DisableApply");

    private String code;

    GroupApplyJoinOption(String code) {
        this.code = code;
    }
}
