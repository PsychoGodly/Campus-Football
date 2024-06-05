package com.startapp;

import com.unity3d.services.UnityAdsConstants;
import java.util.regex.Pattern;

/* compiled from: Sta */
public class n8 {

    /* renamed from: a  reason: collision with root package name */
    public final Pattern f16183a = Pattern.compile("\\+");

    /* renamed from: b  reason: collision with root package name */
    public final Pattern f16184b = Pattern.compile(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH);

    /* renamed from: c  reason: collision with root package name */
    public final Pattern f16185c = Pattern.compile("=");

    public n8() {
        Pattern.compile("_");
        Pattern.compile("\\*");
        Pattern.compile("#");
    }

    public String a(String str) {
        return this.f16185c.matcher(this.f16184b.matcher(this.f16183a.matcher(str).replaceAll("_")).replaceAll("*")).replaceAll("#");
    }
}
