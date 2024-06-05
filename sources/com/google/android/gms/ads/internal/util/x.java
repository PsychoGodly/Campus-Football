package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzdse;
import com.google.android.gms.internal.ads.zzdsf;
import com.google.android.gms.internal.ads.zzfut;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m5.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private final Object f14918a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private String f14919b = MaxReward.DEFAULT_LABEL;

    /* renamed from: c  reason: collision with root package name */
    private String f14920c = MaxReward.DEFAULT_LABEL;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14921d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14922e = false;

    /* renamed from: f  reason: collision with root package name */
    protected String f14923f = MaxReward.DEFAULT_LABEL;

    /* renamed from: g  reason: collision with root package name */
    private zzdsf f14924g;

    protected static final String o(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", t.r().B(context, str2));
        zzfut b10 = new q0(context).b(0, str, hashMap, (byte[]) null);
        try {
            return (String) b10.get((long) ((Integer) a0.c().zzb(zzbar.zzep)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e10) {
            zzbza.zzh("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e10);
            b10.cancel(true);
            return null;
        } catch (InterruptedException e11) {
            zzbza.zzh("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e11);
            b10.cancel(true);
            return null;
        } catch (Exception e12) {
            zzbza.zzh("Error retrieving a response from: ".concat(String.valueOf(str)), e12);
            return null;
        }
    }

    private final Uri p(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f14918a) {
            if (TextUtils.isEmpty(this.f14919b)) {
                t.r();
                try {
                    str5 = new String(k.d(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    zzbza.zze("Error reading from internal storage.");
                    str5 = MaxReward.DEFAULT_LABEL;
                }
                this.f14919b = str5;
                if (TextUtils.isEmpty(str5)) {
                    t.r();
                    this.f14919b = UUID.randomUUID().toString();
                    t.r();
                    String str6 = this.f14919b;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e10) {
                        zzbza.zzh("Error writing to file in internal storage.", e10);
                    }
                }
            }
            str4 = this.f14919b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final zzdsf a() {
        return this.f14924g;
    }

    public final String b() {
        String str;
        synchronized (this.f14918a) {
            str = this.f14920c;
        }
        return str;
    }

    public final void c(Context context) {
        zzdsf zzdsf;
        if (((Boolean) a0.c().zzb(zzbar.zziu)).booleanValue() && (zzdsf = this.f14924g) != null) {
            zzdsf.zzh(new u(this, context), zzdse.DEBUG_MENU);
        }
    }

    public final void d(Context context, String str, String str2) {
        t.r();
        b2.r(context, p(context, (String) a0.c().zzb(zzbar.zzel), str, str2));
    }

    public final void e(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = p(context, (String) a0.c().zzb(zzbar.zzeo), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        t.r();
        b2.h(context, str, buildUpon.build().toString());
    }

    public final void f(boolean z10) {
        synchronized (this.f14918a) {
            this.f14922e = z10;
            if (((Boolean) a0.c().zzb(zzbar.zziu)).booleanValue()) {
                t.q().zzh().c(z10);
                zzdsf zzdsf = this.f14924g;
                if (zzdsf != null) {
                    zzdsf.zzj(z10);
                }
            }
        }
    }

    public final void g(zzdsf zzdsf) {
        this.f14924g = zzdsf;
    }

    public final void h(boolean z10) {
        synchronized (this.f14918a) {
            this.f14921d = z10;
        }
    }

    /* access modifiers changed from: protected */
    public final void i(Context context, String str, boolean z10, boolean z11) {
        if (!(context instanceof Activity)) {
            zzbza.zzi("Can not create dialog without Activity Context");
        } else {
            b2.f14773i.post(new w(this, context, str, z10, z11));
        }
    }

    public final boolean j(Context context, String str, String str2) {
        String o10 = o(context, p(context, (String) a0.c().zzb(zzbar.zzen), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o10)) {
            zzbza.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(new JSONObject(o10.trim()).optString("debug_mode"));
            f(equals);
            if (((Boolean) a0.c().zzb(zzbar.zziu)).booleanValue()) {
                p1 zzh = t.q().zzh();
                if (true != equals) {
                    str = MaxReward.DEFAULT_LABEL;
                }
                zzh.zzA(str);
            }
            return equals;
        } catch (JSONException e10) {
            zzbza.zzk("Fail to get debug mode response json.", e10);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074 A[Catch:{ JSONException -> 0x0083 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzem
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = r3.p(r4, r0, r5, r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = o(r4, r0, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r6 == 0) goto L_0x0025
            java.lang.String r4 = "Not linked for in app preview."
            com.google.android.gms.internal.ads.zzbza.zze(r4)
            return r0
        L_0x0025:
            java.lang.String r4 = r4.trim()
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0083 }
            r6.<init>(r4)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r4 = "gct"
            java.lang.String r4 = r6.optString(r4)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r1 = "status"
            java.lang.String r6 = r6.optString(r1)     // Catch:{ JSONException -> 0x0083 }
            r3.f14923f = r6     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.internal.ads.zzbaj r6 = com.google.android.gms.internal.ads.zzbar.zziu     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ JSONException -> 0x0083 }
            java.lang.Object r6 = r1.zzb(r6)     // Catch:{ JSONException -> 0x0083 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = r6.booleanValue()     // Catch:{ JSONException -> 0x0083 }
            r1 = 1
            if (r6 == 0) goto L_0x0079
            java.lang.String r6 = "0"
            java.lang.String r2 = r3.f14923f     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x0083 }
            if (r6 != 0) goto L_0x0066
            java.lang.String r6 = "2"
            java.lang.String r2 = r3.f14923f     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x0083 }
            if (r6 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r6 = 0
            goto L_0x0067
        L_0x0066:
            r6 = 1
        L_0x0067:
            r3.f(r6)     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.internal.ads.zzbyj r2 = com.google.android.gms.ads.internal.t.q()     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.ads.internal.util.p1 r2 = r2.zzh()     // Catch:{ JSONException -> 0x0083 }
            if (r6 != 0) goto L_0x0076
            java.lang.String r5 = ""
        L_0x0076:
            r2.zzA(r5)     // Catch:{ JSONException -> 0x0083 }
        L_0x0079:
            java.lang.Object r5 = r3.f14918a
            monitor-enter(r5)
            r3.f14920c = r4     // Catch:{ all -> 0x0080 }
            monitor-exit(r5)     // Catch:{ all -> 0x0080 }
            return r1
        L_0x0080:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0080 }
            throw r4
        L_0x0083:
            r4 = move-exception
            java.lang.String r5 = "Fail to get in app preview response json."
            com.google.android.gms.internal.ads.zzbza.zzk(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.x.k(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final boolean l() {
        boolean z10;
        synchronized (this.f14918a) {
            z10 = this.f14922e;
        }
        return z10;
    }

    public final boolean m() {
        boolean z10;
        synchronized (this.f14918a) {
            z10 = this.f14921d;
        }
        return z10;
    }

    public final boolean n(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !m()) {
            return false;
        }
        zzbza.zze("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }
}
