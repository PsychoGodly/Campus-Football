package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.startapp.sdk.adsbase.model.AdPreferences;
import n4.h;
import n4.w;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class h5 {

    /* renamed from: a  reason: collision with root package name */
    private final h[] f14473a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14474b;

    public h5(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, w.f20956a);
        String string = obtainAttributes.getString(w.f20957b);
        String string2 = obtainAttributes.getString(w.f20958c);
        boolean z10 = !TextUtils.isEmpty(string);
        boolean z11 = !TextUtils.isEmpty(string2);
        if (z10 && !z11) {
            this.f14473a = c(string);
        } else if (!z10 && z11) {
            this.f14473a = c(string2);
        } else if (z10) {
            obtainAttributes.recycle();
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            obtainAttributes.recycle();
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        String string3 = obtainAttributes.getString(w.f20959d);
        this.f14474b = string3;
        obtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static h[] c(String str) {
        int i10;
        int i11;
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        h[] hVarArr = new h[length];
        for (int i12 = 0; i12 < split.length; i12++) {
            String trim = split[i12].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    if ("FULL_WIDTH".equals(split2[0])) {
                        i10 = -1;
                    } else {
                        i10 = Integer.parseInt(split2[0]);
                    }
                    if ("AUTO_HEIGHT".equals(split2[1])) {
                        i11 = -2;
                    } else {
                        i11 = Integer.parseInt(split2[1]);
                    }
                    hVarArr[i12] = new h(i10, i11);
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
            } else if (AdPreferences.TYPE_BANNER.equals(trim)) {
                hVarArr[i12] = h.f20927i;
            } else if ("LARGE_BANNER".equals(trim)) {
                hVarArr[i12] = h.f20929k;
            } else if ("FULL_BANNER".equals(trim)) {
                hVarArr[i12] = h.f20928j;
            } else if ("LEADERBOARD".equals(trim)) {
                hVarArr[i12] = h.f20930l;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                hVarArr[i12] = h.f20931m;
            } else if ("SMART_BANNER".equals(trim)) {
                hVarArr[i12] = h.f20933o;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                hVarArr[i12] = h.f20932n;
            } else if ("FLUID".equals(trim)) {
                hVarArr[i12] = h.f20934p;
            } else if ("ICON".equals(trim)) {
                hVarArr[i12] = h.f20937s;
            } else {
                throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
            }
        }
        if (length != 0) {
            return hVarArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public final String a() {
        return this.f14474b;
    }

    public final h[] b(boolean z10) {
        if (z10 || this.f14473a.length == 1) {
            return this.f14473a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
