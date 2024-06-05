package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: Sta */
public class k7 {

    /* renamed from: l  reason: collision with root package name */
    public static final boolean f16038l = MetaData.f17070k.Z();

    /* renamed from: a  reason: collision with root package name */
    public final Handler f16039a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public final Context f16040b;

    /* renamed from: c  reason: collision with root package name */
    public final AdPreferences.Placement f16041c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f16042d;

    /* renamed from: e  reason: collision with root package name */
    public final TrackingParams f16043e;

    /* renamed from: f  reason: collision with root package name */
    public long f16044f;

    /* renamed from: g  reason: collision with root package name */
    public long f16045g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16046h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f16047i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicInteger f16048j = new AtomicInteger();

    /* renamed from: k  reason: collision with root package name */
    public WeakReference<a> f16049k = new WeakReference<>((Object) null);

    /* compiled from: Sta */
    public interface a {
        void onSent(String str);
    }

    public k7(Context context, AdPreferences.Placement placement, String[] strArr, TrackingParams trackingParams, long j10) {
        this.f16040b = h0.b(context);
        this.f16041c = placement;
        this.f16042d = strArr;
        this.f16043e = trackingParams;
        this.f16044f = j10;
    }

    public void a(a aVar) {
        this.f16049k = new WeakReference<>(aVar);
    }

    public void b() {
        if (this.f16046h && this.f16047i) {
            this.f16039a.removeCallbacksAndMessages((Object) null);
            this.f16044f -= System.currentTimeMillis() - this.f16045g;
            this.f16047i = false;
        }
    }

    public void c() {
        if (a()) {
            return;
        }
        if (f16038l) {
            long j10 = this.f16044f;
            if (!this.f16047i) {
                this.f16047i = true;
                if (!this.f16046h) {
                    this.f16046h = true;
                }
                this.f16045g = System.currentTimeMillis();
                this.f16039a.postDelayed(new j7(this), j10);
                return;
            }
            return;
        }
        b((String) null, (JSONObject) null);
    }

    public void a(String str, JSONObject jSONObject) {
        b(str, jSONObject);
        this.f16046h = false;
        this.f16039a.removeCallbacksAndMessages((Object) null);
        this.f16047i = false;
        this.f16045g = 0;
    }

    public void b(String str, JSONObject jSONObject) {
        int i10 = 0;
        int i11 = 1;
        if (this.f16048j.compareAndSet(0, 1)) {
            String str2 = null;
            if (str == null) {
                Context context = this.f16040b;
                String[] strArr = this.f16042d;
                TrackingParams trackingParams = this.f16043e;
                if (!(context == null || strArr == null)) {
                    h3.a(context, (List<String>) Arrays.asList(strArr), trackingParams);
                }
                a aVar = (a) this.f16049k.get();
                if (aVar != null) {
                    String[] strArr2 = this.f16042d;
                    if (strArr2 != null && strArr2.length > 0) {
                        str2 = com.startapp.sdk.adsbase.a.a(strArr2[0], (String) null);
                    }
                    aVar.onSent(str2);
                }
                try {
                    e0 d10 = ComponentLocator.a(this.f16040b).d();
                    AdPreferences.Placement placement = this.f16041c;
                    Map<AdPreferences.Placement, Integer> map = d10.f15773c;
                    Integer num = map.get(placement);
                    if (num != null) {
                        i10 = num.intValue();
                    }
                    map.put(placement, Integer.valueOf(i10 + 1));
                } catch (Throwable th) {
                    i3.a(th);
                }
            } else {
                Context context2 = this.f16040b;
                String[] strArr3 = this.f16042d;
                TrackingParams trackingParams2 = this.f16043e;
                if (trackingParams2 != null) {
                    str2 = trackingParams2.a();
                }
                com.startapp.sdk.adsbase.a.a(context2, strArr3, str2, 0, str, jSONObject);
            }
        } else {
            int incrementAndGet = this.f16048j.incrementAndGet();
            AnalyticsConfig analyticsConfig = MetaData.f17070k.analytics;
            if (analyticsConfig != null) {
                if (str != null) {
                    i11 = 2;
                }
                ComponentInfoEventConfig i12 = analyticsConfig.i();
                if (i12 != null && i12.a((long) i11)) {
                    i3 i3Var = new i3(j3.f15951d);
                    i3Var.f15914d = "SI.repImp";
                    i3Var.f15919i = "reason=" + str;
                    i3Var.f15915e = String.valueOf(incrementAndGet);
                    i3Var.a();
                }
            }
        }
    }

    public boolean a() {
        return this.f16048j.get() != 0;
    }
}
