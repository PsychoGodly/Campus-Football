package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.impl.mediation.g;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxReward;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class de extends be implements h8 {
    private boolean A;

    /* renamed from: v  reason: collision with root package name */
    private final Bundle f7227v;

    /* renamed from: w  reason: collision with root package name */
    private final AtomicReference f7228w;

    /* renamed from: x  reason: collision with root package name */
    private final AtomicBoolean f7229x;

    /* renamed from: y  reason: collision with root package name */
    private final AtomicBoolean f7230y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f7231z;

    public de(int i10, Map map, JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(i10, map, jSONObject, jSONObject2, (g) null, kVar);
        this.f7227v = new Bundle();
        this.f7230y = new AtomicBoolean();
        this.f7228w = new AtomicReference();
        this.f7229x = new AtomicBoolean();
    }

    private long d0() {
        long a10 = a("ad_expiration_ms", -1);
        return a10 < 0 ? b("ad_expiration_ms", ((Long) this.f8971a.a(qe.f10973k7)).longValue()) : a10;
    }

    public void a(boolean z10) {
        this.f7231z = z10;
    }

    public void c0() {
        this.f7229x.set(true);
    }

    public long e0() {
        return a("ahdm", ((Long) this.f8971a.a(qe.f10966d7)).longValue());
    }

    public long f0() {
        long a10 = a("ad_hidden_on_ad_dismiss_callback_delay_ms", -1);
        if (a10 >= 0) {
            return a10;
        }
        return b("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f8971a.a(qe.f10981s7)).longValue());
    }

    public long g0() {
        long a10 = a("ad_hidden_timeout_ms", -1);
        if (a10 >= 0) {
            return a10;
        }
        return b("ad_hidden_timeout_ms", ((Long) this.f8971a.a(qe.f10978p7)).longValue());
    }

    public long getTimeToLiveMillis() {
        return d0() - (SystemClock.elapsedRealtime() - J());
    }

    public ch h0() {
        return (ch) this.f7228w.getAndSet((Object) null);
    }

    public long i0() {
        if (J() > 0) {
            return SystemClock.elapsedRealtime() - J();
        }
        return -1;
    }

    public Bundle j0() {
        return this.f7227v;
    }

    public long k0() {
        long a10 = a("fullscreen_display_delay_ms", -1);
        if (a10 >= 0) {
            return a10;
        }
        return ((Long) this.f8971a.a(qe.f10964b7)).longValue();
    }

    public String l0() {
        return b("mcode", MaxReward.DEFAULT_LABEL);
    }

    public AtomicBoolean m0() {
        return this.f7230y;
    }

    public boolean n0() {
        return this.f7231z;
    }

    public boolean o0() {
        return this.f7229x.get();
    }

    public boolean p0() {
        if (a("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f8971a.a(qe.f10979q7)).booleanValue();
    }

    public boolean q0() {
        if (a("schedule_ad_hidden_on_single_task_app_relaunch", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_single_task_app_relaunch", (Boolean) this.f8971a.a(qe.f10980r7)).booleanValue();
    }

    public boolean r0() {
        return a("susaode", (Boolean) this.f8971a.a(qe.f10965c7)).booleanValue();
    }

    public void setExpired() {
        this.A = true;
    }

    public void a(ch chVar) {
        this.f7228w.set(chVar);
    }

    public void a(Bundle bundle) {
        Bundle bundle2;
        super.a(bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("applovin_ad_view_info")) != null) {
            this.f7227v.putBundle("applovin_ad_view_info", bundle2);
        }
    }

    private de(de deVar, g gVar) {
        super(deVar.I(), deVar.i(), deVar.a(), deVar.g(), gVar, deVar.f8971a);
        this.f7227v = new Bundle();
        this.f7230y = new AtomicBoolean();
        this.f7228w = deVar.f7228w;
        this.f7229x = deVar.f7229x;
    }

    public be a(g gVar) {
        return new de(this, gVar);
    }
}
