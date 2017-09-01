package com.xie.aop;

/**
 * Created by xieyang on 17/9/2.
 */
public class ProxyConfig {

    private boolean proxyTargetClass = false;

    public void setProxyTargetClass(boolean proxyTargetClass) {
        this.proxyTargetClass = proxyTargetClass;
    }

    /**
     * Return whether to proxy the target class directly as well as any interfaces.
     */
    public boolean isProxyTargetClass() {
        return this.proxyTargetClass;
    }
}
