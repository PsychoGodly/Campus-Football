package com.startapp.sdk.adsbase.consent;

import java.io.Serializable;

/* compiled from: Sta */
public final class ConsentData implements Serializable {
    private static final long serialVersionUID = 4245437752472461229L;
    private Boolean apc;
    private String infoDialogClickUrl;
    private String infoDialogDParam;
    private String infoDialogImpressionUrl;
    private Long timeStamp;
    private Integer type;

    public void a(Integer num) {
        this.type = num;
    }

    public void b(String str) {
        this.infoDialogDParam = str;
    }

    public String c() {
        return this.infoDialogDParam;
    }

    public String d() {
        return this.infoDialogImpressionUrl;
    }

    public Long e() {
        return this.timeStamp;
    }

    public Integer f() {
        return this.type;
    }

    public void a(Long l10) {
        this.timeStamp = l10;
    }

    public String b() {
        return this.infoDialogClickUrl;
    }

    public void c(String str) {
        this.infoDialogImpressionUrl = str;
    }

    public Boolean a() {
        return this.apc;
    }

    public void a(Boolean bool) {
        this.apc = bool;
    }

    public void a(String str) {
        this.infoDialogClickUrl = str;
    }
}
