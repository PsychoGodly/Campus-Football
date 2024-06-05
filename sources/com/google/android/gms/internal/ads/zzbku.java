package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbku implements zzbkm, zzbkk {
    private final zzcei zza;

    public zzbku(Context context, zzbzg zzbzg, zzapw zzapw, a aVar) throws zzcet {
        t.B();
        zzcei zza2 = zzceu.zza(context, zzcfx.zza(), MaxReward.DEFAULT_LABEL, false, false, (zzapw) null, (zzbbt) null, zzbzg, (zzbbj) null, (l) null, (a) null, zzawe.zza(), (zzeyc) null, (zzeyf) null);
        this.zza = zza2;
        ((View) zza2).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        x.b();
        if (zzbyt.zzv()) {
            runnable.run();
        } else {
            b2.f14773i.post(runnable);
        }
    }

    public final void zza(String str) {
        zzs(new zzbkp(this, str));
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        zzbkj.zzc(this, str, str2);
    }

    public final void zzc() {
        this.zza.destroy();
    }

    public final /* synthetic */ void zzd(String str, Map map) {
        zzbkj.zza(this, str, map);
    }

    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbkj.zzb(this, str, jSONObject);
    }

    public final void zzf(String str) {
        zzs(new zzbkq(this, str));
    }

    public final void zzg(String str) {
        zzs(new zzbks(this, str));
    }

    public final void zzh(String str) {
        zzs(new zzbkr(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final boolean zzi() {
        return this.zza.zzaz();
    }

    public final zzblt zzj() {
        return new zzblt(this);
    }

    public final void zzk(zzbla zzbla) {
        this.zza.zzN().zzG(new zzbkn(zzbla, (byte[]) null));
    }

    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbkj.zzd(this, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    public final void zzq(String str, zzbhp zzbhp) {
        this.zza.zzad(str, new zzbkt(this, zzbhp));
    }

    public final void zzr(String str, zzbhp zzbhp) {
        this.zza.zzav(str, new zzbko(zzbhp));
    }
}
