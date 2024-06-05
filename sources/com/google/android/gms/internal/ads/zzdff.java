package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.t1;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.x1;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.ads.internal.util.z0;
import com.google.android.gms.common.internal.q;
import java.lang.ref.WeakReference;
import java.util.Map;
import m5.e;
import m5.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdff implements zzdgq {
    private t1 zzA;
    private final Context zza;
    private final zzdgt zzb;
    private final JSONObject zzc;
    private final zzdlf zzd;
    private final zzdgi zze;
    private final zzapw zzf;
    /* access modifiers changed from: private */
    public final zzcvg zzg;
    /* access modifiers changed from: private */
    public final zzcum zzh;
    /* access modifiers changed from: private */
    public final zzdca zzi;
    private final zzeyc zzj;
    private final zzbzg zzk;
    private final zzeyx zzl;
    private final zzcng zzm;
    private final zzdhm zzn;
    private final e zzo;
    private final zzdbw zzp;
    private final zzfff zzq;
    private final zzfen zzr;
    private boolean zzs = false;
    private boolean zzt;
    private boolean zzu = false;
    private boolean zzv = false;
    private Point zzw = new Point();
    private Point zzx = new Point();
    private long zzy = 0;
    private long zzz = 0;

    public zzdff(Context context, zzdgt zzdgt, JSONObject jSONObject, zzdlf zzdlf, zzdgi zzdgi, zzapw zzapw, zzcvg zzcvg, zzcum zzcum, zzdca zzdca, zzeyc zzeyc, zzbzg zzbzg, zzeyx zzeyx, zzcng zzcng, zzdhm zzdhm, e eVar, zzdbw zzdbw, zzfff zzfff, zzfen zzfen) {
        this.zza = context;
        this.zzb = zzdgt;
        this.zzc = jSONObject;
        this.zzd = zzdlf;
        this.zze = zzdgi;
        this.zzf = zzapw;
        this.zzg = zzcvg;
        this.zzh = zzcum;
        this.zzi = zzdca;
        this.zzj = zzeyc;
        this.zzk = zzbzg;
        this.zzl = zzeyx;
        this.zzm = zzcng;
        this.zzn = zzdhm;
        this.zzo = eVar;
        this.zzp = zzdbw;
        this.zzq = zzfff;
        this.zzr = zzfen;
    }

    private final String zzD(View view, Map map) {
        if (!(map == null || view == null)) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int zzc2 = this.zze.zzc();
        if (zzc2 == 1) {
            return "1099";
        }
        if (zzc2 == 2) {
            return "2099";
        }
        if (zzc2 != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzE(String str) {
        JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    private final boolean zzF() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzG(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z10) {
        q.f("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) a0.c().zzb(zzbar.zzda)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z10);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            t.r();
            DisplayMetrics P = b2.P((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", x.b().zzb(context, P.widthPixels));
                jSONObject7.put("height", x.b().zzb(context, P.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) a0.c().zzb(zzbar.zzhM)).booleanValue()) {
                this.zzd.zzi("/clickRecorded", new zzdfc(this, (zzdfb) null));
            } else {
                this.zzd.zzi("/logScionEvent", new zzdfa(this, (zzdez) null));
            }
            this.zzd.zzi("/nativeImpression", new zzdfe(this, (zzdfd) null));
            zzbzq.zza(this.zzd.zzd("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzs) {
                return true;
            }
            this.zzs = t.u().n(this.zza, this.zzk.zza, this.zzj.zzD.toString(), this.zzl.zzf);
            return true;
        } catch (JSONException e10) {
            zzbza.zzh("Unable to create impression JSON.", e10);
            return false;
        }
    }

    public final boolean zzA() {
        if (zza() == 0) {
            return true;
        }
        if (!((Boolean) a0.c().zzb(zzbar.zzjF)).booleanValue()) {
            return true;
        }
        return this.zzl.zzi.zzj;
    }

    public final boolean zzB() {
        return zzF();
    }

    public final boolean zzC(Bundle bundle) {
        if (!zzE("impression_reporting")) {
            zzbza.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        return zzG((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, x.b().zzk(bundle, (JSONObject) null), false);
    }

    public final int zza() {
        if (this.zzl.zzi == null) {
            return 0;
        }
        if (!((Boolean) a0.c().zzb(zzbar.zzjF)).booleanValue()) {
            return 0;
        }
        return this.zzl.zzi.zzi;
    }

    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject d10 = z0.d(this.zza, map, map2, view, scaleType);
        JSONObject g10 = z0.g(this.zza, view);
        JSONObject f10 = z0.f(view);
        JSONObject e10 = z0.e(this.zza, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", d10);
            jSONObject.put("ad_view_signal", g10);
            jSONObject.put("scroll_view_signal", f10);
            jSONObject.put("lock_screen_signal", e10);
            return jSONObject;
        } catch (JSONException e11) {
            zzbza.zzh("Unable to create native ad view signals JSON.", e11);
            return null;
        }
    }

    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject zze2 = zze(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzv && zzF()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (zze2 != null) {
                jSONObject.put("nas", zze2);
            }
        } catch (JSONException e10) {
            zzbza.zzh("Unable to create native click meta data JSON.", e10);
        }
        return jSONObject;
    }

    public final void zzg() {
        try {
            t1 t1Var = this.zzA;
            if (t1Var != null) {
                t1Var.zze();
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzh() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzb();
        }
    }

    public final void zzi() {
        this.zzd.zzf();
    }

    public final void zzj(x1 x1Var) {
        try {
            if (!this.zzu) {
                if (x1Var == null) {
                    zzdgi zzdgi = this.zze;
                    if (zzdgi.zzk() != null) {
                        this.zzu = true;
                        this.zzq.zzc(zzdgi.zzk().zzf(), this.zzr);
                        zzg();
                        return;
                    }
                }
                this.zzu = true;
                this.zzq.zzc(x1Var.zzf(), this.zzr);
                zzg();
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzk(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) {
        View view3 = view2;
        Map map3 = map;
        JSONObject d10 = z0.d(this.zza, map, map2, view2, scaleType);
        JSONObject g10 = z0.g(this.zza, view2);
        JSONObject f10 = z0.f(view2);
        JSONObject e10 = z0.e(this.zza, view2);
        View view4 = view;
        String zzD = zzD(view, map);
        zzn(true == ((Boolean) a0.c().zzb(zzbar.zzdf)).booleanValue() ? view3 : view4, g10, d10, f10, e10, zzD, z0.c(zzD, this.zza, this.zzx, this.zzw), (JSONObject) null, z10, false);
    }

    public final void zzl(String str) {
        zzn((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, (JSONObject) null, (JSONObject) null, false, false);
    }

    public final void zzm(Bundle bundle) {
        if (bundle == null) {
            zzbza.zze("Click data is null. No click is reported.");
        } else if (!zzE("click_reporting")) {
            zzbza.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzn((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bundle2 != null ? bundle2.getString("asset_id") : null, (JSONObject) null, x.b().zzk(bundle, (JSONObject) null), false, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzn(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z10, boolean z11) {
        String str2;
        q.f("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z12 = false;
            jSONObject7.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzz()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z10);
            zzbdl zzbdl = this.zzl.zzi;
            jSONObject8.put("custom_mute_requested", zzbdl != null && zzbdl.zzg);
            jSONObject8.put("custom_mute_enabled", !this.zze.zzG().isEmpty() && this.zze.zzk() != null);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.zzo.a());
            if (this.zzv && zzF()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z11) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.zzb.zzc(this.zze.zzz()) != null) {
                z12 = true;
            }
            jSONObject8.put("has_custom_click_handler", z12);
            try {
                JSONObject optJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.zzf.zzc().zze(this.zza, optJSONObject.optString("click_string"), view);
            } catch (Exception e10) {
                zzbza.zzh("Exception obtaining click signals", e10);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) a0.c().zzb(zzbar.zzeg)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) a0.c().zzb(zzbar.zzhQ)).booleanValue() && m.l()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) a0.c().zzb(zzbar.zzhR)).booleanValue() && m.l()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long a10 = this.zzo.a();
            jSONObject9.put("time_from_last_touch_down", a10 - this.zzy);
            jSONObject9.put("time_from_last_touch", a10 - this.zzz);
            jSONObject7.put("touch_signal", jSONObject9);
            zzbzq.zza(this.zzd.zzd("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e11) {
            zzbza.zzh("Unable to create click JSON.", e11);
        }
    }

    public final void zzo(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) {
        JSONObject jSONObject;
        View view3 = view2;
        Map map3 = map;
        boolean z11 = false;
        if (this.zzc.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) a0.c().zzb(zzbar.zzjF)).booleanValue()) {
                z11 = true;
            }
        }
        if (!z11) {
            if (!this.zzv) {
                zzbza.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzF()) {
                zzbza.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject d10 = z0.d(this.zza, map3, map2, view3, scaleType);
        JSONObject g10 = z0.g(this.zza, view3);
        JSONObject f10 = z0.f(view2);
        JSONObject e10 = z0.e(this.zza, view3);
        String zzD = zzD(view, map3);
        JSONObject c10 = z0.c(zzD, this.zza, this.zzx, this.zzw);
        if (z11) {
            try {
                JSONObject jSONObject2 = this.zzc;
                Point point = this.zzx;
                Point point2 = this.zzw;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i10);
                    } catch (Exception e11) {
                        e = e11;
                        zzbza.zzh("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        zzn(view2, g10, d10, f10, e10, zzD, c10, (JSONObject) null, z10, true);
                    }
                } catch (Exception e12) {
                    e = e12;
                    jSONObject = null;
                    zzbza.zzh("Error occurred while grabbing custom click gesture signals.", e);
                    jSONObject2.put("custom_click_gesture_signal", jSONObject);
                    zzn(view2, g10, d10, f10, e10, zzD, c10, (JSONObject) null, z10, true);
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e13) {
                zzbza.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e13);
                t.q().zzu(e13, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzn(view2, g10, d10, f10, e10, zzD, c10, (JSONObject) null, z10, true);
    }

    public final void zzp() {
        q.f("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzbzq.zza(this.zzd.zzd("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        String str;
        JSONObject d10 = z0.d(this.zza, map, map2, view, scaleType);
        JSONObject g10 = z0.g(this.zza, view);
        JSONObject f10 = z0.f(view);
        JSONObject e10 = z0.e(this.zza, view);
        if (((Boolean) a0.c().zzb(zzbar.zzda)).booleanValue()) {
            try {
                str = this.zzf.zzc().zzh(this.zza, view, (Activity) null);
            } catch (Exception unused) {
                zzbza.zzg("Exception getting data.");
            }
            zzG(g10, d10, f10, e10, str, (JSONObject) null, z0.h(this.zza, this.zzj));
        }
        str = null;
        zzG(g10, d10, f10, e10, str, (JSONObject) null, z0.h(this.zza, this.zzj));
    }

    public final void zzr() {
        zzG((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, (JSONObject) null, false);
    }

    public final void zzs(View view, MotionEvent motionEvent, View view2) {
        this.zzw = z0.a(motionEvent, view2);
        long a10 = this.zzo.a();
        this.zzz = a10;
        if (motionEvent.getAction() == 0) {
            this.zzy = a10;
            this.zzx = this.zzw;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzw;
        obtain.setLocation((float) point.x, (float) point.y);
        this.zzf.zzd(obtain);
        obtain.recycle();
    }

    public final void zzt(Bundle bundle) {
        if (bundle == null) {
            zzbza.zze("Touch event data is null. No touch event is reported.");
        } else if (!zzE("touch_reporting")) {
            zzbza.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            int i10 = bundle.getInt("duration_ms");
            this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i10);
        }
    }

    public final void zzu(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzbza.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdhm zzdhm = this.zzn;
        if (view != null) {
            view.setOnClickListener(zzdhm);
            view.setClickable(true);
            zzdhm.zzc = new WeakReference(view);
        }
    }

    public final void zzv() {
        this.zzv = true;
    }

    public final void zzw(t1 t1Var) {
        this.zzA = t1Var;
    }

    public final void zzx(zzbfr zzbfr) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzbza.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            this.zzn.zzc(zzbfr);
        }
    }

    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzw = new Point();
        this.zzx = new Point();
        if (!this.zzt) {
            this.zzp.zza(view);
            this.zzt = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean i10 = z0.i(this.zzk.zzc);
        if (map != null) {
            for (Map.Entry value : map.entrySet()) {
                View view2 = (View) ((WeakReference) value.getValue()).get();
                if (view2 != null) {
                    if (i10) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry value2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) value2.getValue()).get();
                if (view3 != null) {
                    if (i10) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    public final void zzz(View view, Map map) {
        this.zzw = new Point();
        this.zzx = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzt = false;
    }
}
