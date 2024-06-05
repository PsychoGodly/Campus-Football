package com.startapp;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.applovin.mediation.MaxReward;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public abstract class k2 {

    /* renamed from: a  reason: collision with root package name */
    public Intent f15995a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f15996b;

    /* renamed from: c  reason: collision with root package name */
    public AdInformationObject f15997c = null;

    /* renamed from: d  reason: collision with root package name */
    public BroadcastReceiver f15998d = new a();

    /* renamed from: e  reason: collision with root package name */
    public String[] f15999e;

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f16000f;

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f16001g = {true};

    /* renamed from: h  reason: collision with root package name */
    public String f16002h;

    /* renamed from: i  reason: collision with root package name */
    public String[] f16003i;

    /* renamed from: j  reason: collision with root package name */
    public String[] f16004j;

    /* renamed from: k  reason: collision with root package name */
    public String[] f16005k;

    /* renamed from: l  reason: collision with root package name */
    public Ad f16006l;

    /* renamed from: m  reason: collision with root package name */
    public String f16007m;

    /* renamed from: n  reason: collision with root package name */
    public AdPreferences.Placement f16008n;

    /* renamed from: o  reason: collision with root package name */
    public AdInformationOverrides f16009o;

    /* renamed from: p  reason: collision with root package name */
    public String f16010p;

    /* renamed from: q  reason: collision with root package name */
    public Long f16011q;

    /* renamed from: r  reason: collision with root package name */
    public Boolean[] f16012r = null;

    /* renamed from: s  reason: collision with root package name */
    public int f16013s = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f16014t = false;

    /* renamed from: u  reason: collision with root package name */
    public Long f16015u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f16016v = false;

    /* compiled from: Sta */
    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            k2.this.b();
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            k2.this.f15996b.finish();
        }
    }

    public void a(Configuration configuration) {
    }

    public abstract void a(Bundle bundle);

    public boolean a(int i10) {
        boolean[] zArr = this.f16001g;
        if (zArr == null || i10 < 0 || i10 >= zArr.length) {
            return true;
        }
        return zArr[i10];
    }

    public boolean a(int i10, KeyEvent keyEvent) {
        return false;
    }

    public void b() {
        this.f15996b.runOnUiThread(new b());
    }

    public void b(Bundle bundle) {
    }

    public boolean c() {
        return false;
    }

    public void d() {
        if (this.f15998d != null) {
            w4.a((Context) this.f15996b).a(this.f15998d);
        }
        this.f15998d = null;
    }

    public abstract void e();

    public abstract void f();

    public void g() {
    }

    public void h() {
        w4.a((Context) this.f15996b).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
    }

    public String a() {
        try {
            String[] strArr = this.f16003i;
            if (strArr == null || strArr.length <= 0) {
                return MaxReward.DEFAULT_LABEL;
            }
            return com.startapp.sdk.adsbase.a.a(strArr[0], (String) null);
        } catch (Throwable th) {
            i3.a(th);
            return MaxReward.DEFAULT_LABEL;
        }
    }

    public void a(String str) {
        String str2;
        if (str == null || (str2 = this.f16010p) == null || str2.length() <= 0) {
            this.f16007m = str;
        } else {
            this.f16007m = str.replaceAll("startapp_adtag_placeholder", this.f16010p);
        }
    }
}
