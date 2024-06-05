package com.startapp.sdk.adsbase.adrules;

import com.startapp.d9;
import java.io.Serializable;

/* compiled from: Sta */
public class AdaptMetaData implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static transient AdaptMetaData f16908a = new AdaptMetaData();
    @d9(complex = true)
    private AdRules adRules = new AdRules();
    private String adaptMetaDataUpdateVersion = "4.10.12";

    private AdaptMetaData() {
    }

    public AdRules a() {
        return this.adRules;
    }
}
