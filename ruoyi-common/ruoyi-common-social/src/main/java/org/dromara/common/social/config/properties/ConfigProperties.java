package org.dromara.common.social.config.properties;

import lombok.Data;

@Data
public class ConfigProperties {

    /**
     * 应用 ID
     */
    private String clientId;

    /**
     * 应用密钥
     */
    private String clientSecret;

    /**
     * 回调地址
     */
    private String redirectUri;

    /**
     * 是否获取unionId
     */
    private boolean unionId;

    /**
     * Coding 企业名称
     */
    private String codingGroupName;

    /**
     * 支付宝公钥
     */
    private String alipayPublicKey;

    /**
     * 企业微信应用ID
     */
    private String agentId;

    /**
     * stackoverflow api key
     */
    private String stackOverflowKey;

    /**
     * 设备ID
     */
    private String deviceId;

    /**
     * 客户端系统类型
     */
    private String clientOsType;

}
