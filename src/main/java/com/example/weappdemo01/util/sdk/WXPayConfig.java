package com.example.weappdemo01.util.sdk;

import java.io.InputStream;

public abstract class WXPayConfig {



    /**
     *
     */
    public abstract String getAppID();


    /**
     *
     */
    public abstract String getMchID();


    /**
     *
     */
    public abstract String getKey();


    /**
     *
     */
    public abstract InputStream getCertStream();

    /**
     *
     * @return
     */
    public int getHttpConnectTimeoutMs() {
        return 6*1000;
    }

    /**
     *
     * @return
     */
    public int getHttpReadTimeoutMs() {
        return 8*1000;
    }

    /**
     * @return
     */
    public abstract IWXPayDomain getWXPayDomain();

    /**

     * @return
     */
    public boolean shouldAutoReport() {
        return true;
    }

    /**
     * @return
     */
    public int getReportWorkerNum() {
        return 6;
    }


    /**
     *
     * @return
     */
    public int getReportQueueMaxSize() {
        return 10000;
    }

    /**
     * @return
     */
    public int getReportBatchSize() {
        return 10;
    }

}
