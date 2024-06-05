package com.startapp.sdk.adsbase;

import com.startapp.p0;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
public class AdsConstants {

    /* renamed from: a  reason: collision with root package name */
    public static final String f16771a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f16772b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f16773c = "trackdownload";

    /* renamed from: d  reason: collision with root package name */
    public static final String f16774d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f16775e = "https://imp.startappservice.com/tracking/adImpression";

    /* renamed from: f  reason: collision with root package name */
    public static final Boolean f16776f;

    /* renamed from: g  reason: collision with root package name */
    public static final Boolean f16777g;

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f16778h = {"back_", "back_dark", "browser_icon_dark", "forward_", "forward_dark", "x_dark"};

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f16779i = {"empty_star", "filled_star", "half_star"};

    /* compiled from: Sta */
    public enum AdApiType {
        HTML,
        JSON
    }

    static {
        String str = "get";
        StringBuilder a10 = p0.a(str);
        a10.append("ads");
        f16771a = a10.toString();
        StringBuilder a11 = p0.a(str);
        a11.append("htmlad");
        f16772b = a11.toString();
        StringBuilder a12 = p0.a(str);
        a12.append("adsmetadata");
        f16774d = a12.toString();
        Boolean bool = Boolean.FALSE;
        f16776f = bool;
        f16777g = bool;
    }

    public static String a(AdApiType adApiType, AdPreferences.Placement placement) {
        String str;
        String str2;
        String str3;
        int ordinal = adApiType.ordinal();
        String str4 = null;
        if (ordinal == 0) {
            str3 = f16772b;
            str2 = MetaData.f17070k.a(placement);
        } else if (ordinal != 1) {
            str = null;
            return str4 + str;
        } else {
            str3 = f16771a;
            str2 = MetaData.f17070k.a(placement);
        }
        String str5 = str3;
        str4 = str2;
        str = str5;
        return str4 + str;
    }
}
