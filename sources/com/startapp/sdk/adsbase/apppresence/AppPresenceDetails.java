package com.startapp.sdk.adsbase.apppresence;

import java.io.Serializable;

/* compiled from: Sta */
public class AppPresenceDetails implements Serializable {
    private static final long serialVersionUID = 1;
    private int adAttempt;
    private boolean appPresence = false;
    private boolean isShown = true;
    private int minAppVersion;
    private String packageName;
    private String trackingUrl;

    public AppPresenceDetails(String str, String str2, int i10, int i11) {
        this.trackingUrl = str;
        this.packageName = str2;
        this.adAttempt = i10;
        this.minAppVersion = i11;
    }

    public void a(String str) {
        this.trackingUrl = str;
    }

    public String b() {
        return this.packageName;
    }

    public String c() {
        return this.trackingUrl;
    }

    public boolean d() {
        return this.appPresence;
    }

    public boolean e() {
        return this.isShown;
    }

    public void a(boolean z10) {
        this.appPresence = z10;
    }

    public void b(boolean z10) {
        this.isShown = z10;
    }

    public int a() {
        return this.minAppVersion;
    }
}
