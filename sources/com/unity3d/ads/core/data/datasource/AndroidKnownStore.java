package com.unity3d.ads.core.data.datasource;

/* compiled from: AndroidKnownStore.kt */
public enum AndroidKnownStore {
    GOOGLE("com.android.vending"),
    GOOGLE_MARKET("com.google.market"),
    AMAZON("com.amazon.venezia"),
    SAMSUNG("com.sec.android.app.samsungapps"),
    XIAOMI("com.xiaomi.market"),
    HUAWEI("com.huawei.appmarket"),
    OPPO("com.oppo.market"),
    VIVO("com.bbk.appstore"),
    UNKNOWN("unknown");
    
    private final String packageName;

    private AndroidKnownStore(String str) {
        this.packageName = str;
    }

    public final String getPackageName() {
        return this.packageName;
    }
}
