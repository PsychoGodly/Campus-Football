package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.startapp.sdk.adsbase.a;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class j4 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f15967a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15968b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f15969c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f15970d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f15971e;

    /* renamed from: f  reason: collision with root package name */
    public Context f15972f;

    /* renamed from: g  reason: collision with root package name */
    public TrackingParams f15973g;

    public j4(Context context, Runnable runnable, TrackingParams trackingParams, boolean z10) {
        this(context, runnable, trackingParams);
        this.f15968b = z10;
    }

    @JavascriptInterface
    public void closeAd() {
        if (!this.f15967a) {
            this.f15967a = true;
            this.f15969c.run();
        }
    }

    @JavascriptInterface
    public void enableScroll(String str) {
        Runnable runnable = this.f15971e;
        if (runnable != null) {
            runnable.run();
        }
    }

    @JavascriptInterface
    public void externalLinks(String str) {
        if (this.f15968b) {
            Map<Activity, Integer> map = j9.f15982a;
            a.a(this.f15972f, str, (String) null);
            return;
        }
        a.b(this.f15972f, str, (String) null);
    }

    @JavascriptInterface
    public void openApp(String str, String str2, String str3) {
        if (str != null && !TextUtils.isEmpty(str)) {
            a.a(this.f15972f, str, this.f15973g);
        }
        Intent a10 = j9.a(this.f15972f, str2);
        if (!(a10 == null || str3 == null)) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String valueOf = String.valueOf(keys.next());
                    a10.putExtra(valueOf, String.valueOf(jSONObject.get(valueOf)));
                }
            } catch (JSONException unused) {
            }
        }
        if (a10 != null) {
            try {
                this.f15972f.startActivity(a10);
            } catch (Throwable th) {
                i3.a(th);
            }
        }
        Runnable runnable = this.f15970d;
        if (runnable != null) {
            runnable.run();
        }
    }

    public j4(Context context, Runnable runnable, TrackingParams trackingParams) {
        this.f15967a = false;
        this.f15968b = true;
        this.f15969c = null;
        this.f15970d = null;
        this.f15971e = null;
        this.f15969c = runnable;
        this.f15972f = context;
        this.f15973g = trackingParams;
    }

    public j4(Context context, Runnable runnable, Runnable runnable2, TrackingParams trackingParams) {
        this(context, runnable, trackingParams);
        this.f15970d = runnable2;
    }
}
