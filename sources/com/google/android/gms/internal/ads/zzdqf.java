package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.n1;
import java.util.Collections;
import java.util.List;
import o4.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdqf implements e, zzcxj, a, zzcuo, zzcvi, zzcvj, zzcwc, zzcur, zzfdb {
    private final List zza;
    private final zzdpt zzb;
    private long zzc;

    public zzdqf(zzdpt zzdpt, zzcgd zzcgd) {
        this.zzb = zzdpt;
        this.zza = Collections.singletonList(zzcgd);
    }

    private final void zze(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    public final void onAdClicked() {
        zze(a.class, "onAdClicked", new Object[0]);
    }

    public final void onAppEvent(String str, String str2) {
        zze(e.class, "onAppEvent", str, str2);
    }

    public final void zza(c3 c3Var) {
        zze(zzcur.class, "onAdFailedToLoad", Integer.valueOf(c3Var.f14427a), c3Var.f14428b, c3Var.f14429c);
    }

    public final void zzb(zzeyo zzeyo) {
    }

    public final void zzbA(zzbtn zzbtn) {
        this.zzc = t.b().b();
        zze(zzcxj.class, "onAdRequest", new Object[0]);
    }

    public final void zzbB(zzfcu zzfcu, String str) {
        zze(zzfct.class, "onTaskCreated", str);
    }

    public final void zzbC(zzfcu zzfcu, String str, Throwable th) {
        zze(zzfct.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    public final void zzbn(Context context) {
        zze(zzcvj.class, "onDestroy", context);
    }

    public final void zzbp(Context context) {
        zze(zzcvj.class, "onPause", context);
    }

    public final void zzbq(Context context) {
        zze(zzcvj.class, "onResume", context);
    }

    public final void zzbr() {
        zze(zzcuo.class, "onRewardedVideoStarted", new Object[0]);
    }

    public final void zzc(zzfcu zzfcu, String str) {
        zze(zzfct.class, "onTaskStarted", str);
    }

    public final void zzd(zzfcu zzfcu, String str) {
        zze(zzfct.class, "onTaskSucceeded", str);
    }

    public final void zzj() {
        zze(zzcuo.class, "onAdClosed", new Object[0]);
    }

    public final void zzl() {
        zze(zzcvi.class, "onAdImpression", new Object[0]);
    }

    public final void zzm() {
        zze(zzcuo.class, "onAdLeftApplication", new Object[0]);
    }

    public final void zzn() {
        long b10 = t.b().b() - this.zzc;
        n1.a("Ad Request Latency : " + b10);
        zze(zzcwc.class, "onAdLoaded", new Object[0]);
    }

    public final void zzo() {
        zze(zzcuo.class, "onAdOpened", new Object[0]);
    }

    public final void zzp(zzbud zzbud, String str, String str2) {
        zze(zzcuo.class, "onRewarded", zzbud, str, str2);
    }

    public final void zzq() {
        zze(zzcuo.class, "onRewardedVideoCompleted", new Object[0]);
    }
}
