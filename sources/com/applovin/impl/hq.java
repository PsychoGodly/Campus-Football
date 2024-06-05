package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import java.util.HashSet;
import java.util.Set;

public class hq {

    /* renamed from: a  reason: collision with root package name */
    public final Set f8357a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Set f8358b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private Uri f8359c;

    /* renamed from: d  reason: collision with root package name */
    private Uri f8360d;

    /* renamed from: e  reason: collision with root package name */
    private int f8361e;

    /* renamed from: f  reason: collision with root package name */
    private int f8362f;

    public static hq a(fs fsVar, k kVar) {
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (kVar != null) {
            fs c10 = fsVar.c("StaticResource");
            if (c10 == null || !URLUtil.isValidUrl(c10.d())) {
                kVar.L();
                if (!t.a()) {
                    return null;
                }
                kVar.L().b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
                return null;
            }
            hq hqVar = new hq();
            hqVar.f8359c = Uri.parse(c10.d());
            fs b10 = fsVar.b("IconClickThrough");
            if (b10 != null && URLUtil.isValidUrl(b10.d())) {
                hqVar.f8360d = Uri.parse(b10.d());
            }
            String str = (String) fsVar.a().get("width");
            int i10 = 0;
            int parseInt = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
            String str2 = (String) fsVar.a().get("height");
            if (str2 != null && Integer.parseInt(str2) > 0) {
                i10 = Integer.parseInt(str2);
            }
            int intValue = ((Integer) kVar.a(oj.W4)).intValue();
            if (parseInt <= 0 || i10 <= 0) {
                hqVar.f8362f = intValue;
                hqVar.f8361e = intValue;
            } else {
                double d10 = (double) (((float) parseInt) / ((float) i10));
                int min = Math.min(Math.max(parseInt, i10), intValue);
                if (parseInt >= i10) {
                    hqVar.f8361e = min;
                    hqVar.f8362f = (int) (((double) min) / d10);
                } else {
                    hqVar.f8362f = min;
                    hqVar.f8361e = (int) (((double) min) * d10);
                }
            }
            return hqVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    public Uri b() {
        return this.f8360d;
    }

    public int c() {
        return this.f8362f;
    }

    public Uri d() {
        return this.f8359c;
    }

    public Set e() {
        return this.f8358b;
    }

    public int f() {
        return this.f8361e;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + d() + "', clickUri='" + b() + "', width=" + f() + ", height=" + c() + "}";
    }

    public Set a() {
        return this.f8357a;
    }

    public static ImageView a(Uri uri, Context context, k kVar) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        ImageViewUtils.setImageUri(imageView, uri, kVar);
        return imageView;
    }
}
