package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.a;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.z5;

/* compiled from: Sta */
public class t8 implements Runnable, g2<Throwable, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final c7 f17303a;

    /* renamed from: b  reason: collision with root package name */
    public final a3 f17304b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17305c;

    /* renamed from: d  reason: collision with root package name */
    public final h2<String, z5.a, Throwable, Void> f17306d;

    /* renamed from: e  reason: collision with root package name */
    public z5.a f17307e;

    /* renamed from: f  reason: collision with root package name */
    public Throwable f17308f;

    public t8(c7 c7Var, a3 a3Var, String str, h2<String, z5.a, Throwable, Void> h2Var) {
        this.f17303a = c7Var;
        this.f17304b = a3Var;
        this.f17305c = str;
        this.f17306d = h2Var;
    }

    public Object a(Object obj) {
        this.f17308f = (Throwable) obj;
        return null;
    }

    public void run() {
        try {
            z5.a a10 = a(this.f17303a, this.f17304b, this.f17305c, (g2<Throwable, Void>) this);
            this.f17307e = a10;
            h2<String, z5.a, Throwable, Void> h2Var = this.f17306d;
            if (h2Var != null) {
                h2Var.a(this.f17305c, a10, this.f17308f);
            }
        } catch (Throwable th) {
            h2<String, z5.a, Throwable, Void> h2Var2 = this.f17306d;
            if (h2Var2 != null) {
                h2Var2.a(this.f17305c, this.f17307e, this.f17308f);
            }
            throw th;
        }
    }

    public static String a(String str, TrackingParams trackingParams) {
        StringBuilder sb2 = new StringBuilder(str);
        String a10 = a.a(str, (String) null);
        if (a10 != null) {
            sb2.append(a.c(a10));
        }
        if (trackingParams != null && (a10 != null || j9.c(str))) {
            sb2.append(trackingParams.e());
        }
        if (trackingParams != null && trackingParams.f()) {
            sb2.append("&isPubImp=true");
        }
        return sb2.toString();
    }

    public static Pair<String, Boolean> a(Context context, String str, TrackingParams trackingParams, h2<String, z5.a, Throwable, Void> h2Var) {
        String a10 = a(str, trackingParams);
        return new Pair<>(a10, Boolean.valueOf(a(context, a10, h2Var)));
    }

    public static boolean a(Context context, String str, h2<String, z5.a, Throwable, Void> h2Var) {
        try {
            ComponentLocator a10 = ComponentLocator.a(context);
            a10.r().execute(new t8(a10.s(), a10.m(), str, h2Var));
            return true;
        } catch (Throwable th) {
            i3.a(th);
            if (h2Var == null) {
                return false;
            }
            h2Var.a(str, null, th);
            return false;
        }
    }

    public static z5.a a(c7 c7Var, a3 a3Var, String str, g2<Throwable, Void> g2Var) {
        u8 u8Var = new u8();
        try {
            u8Var.J = c7Var.a((Object) u8Var);
        } catch (Throwable th) {
            i3.a(th);
        }
        a3Var.getClass();
        try {
            return a3Var.a(str, u8Var, g2Var);
        } catch (Throwable th2) {
            if (a3Var.a(1)) {
                i3.a(th2);
            }
            return null;
        }
    }
}
