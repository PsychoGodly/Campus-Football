package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.client.a0;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdlf {
    /* access modifiers changed from: private */
    public final zzdks zza = new zzdks();
    private final a zzb;
    private final zzceu zzc;
    private final Context zzd;
    private final zzdpi zze;
    private final zzfdk zzf;
    private final Executor zzg;
    private final zzapw zzh;
    private final zzbzg zzi;
    private final zzbid zzj;
    private final zzeaf zzk;
    private final zzfff zzl;
    private zzfut zzm;

    zzdlf(zzdlc zzdlc) {
        this.zzd = zzdlc.zzc;
        this.zzg = zzdlc.zzg;
        this.zzh = zzdlc.zzh;
        this.zzi = zzdlc.zzi;
        this.zzb = zzdlc.zza;
        this.zzc = zzdlc.zzb;
        this.zzj = new zzbid();
        this.zzk = zzdlc.zzf;
        this.zzl = zzdlc.zzj;
        this.zze = zzdlc.zzd;
        this.zzf = zzdlc.zze;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcei zza(zzcei zzcei) {
        zzcei zzcei2 = zzcei;
        zzcei2.zzad("/result", this.zzj);
        zzcfv zzN = zzcei.zzN();
        zzdks zzdks = this.zza;
        b bVar = r2;
        b bVar2 = new b(this.zzd, (zzbwb) null, (zzbst) null);
        zzN.zzM((com.google.android.gms.ads.internal.client.a) null, zzdks, zzdks, zzdks, zzdks, false, (zzbhr) null, bVar, (zzbqg) null, (zzbwb) null, this.zzk, this.zzl, this.zze, this.zzf, (zzbih) null, (zzdcc) null, (zzbig) null, (zzbia) null);
        return zzcei2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzc(String str, JSONObject jSONObject, zzcei zzcei) throws Exception {
        return this.zzj.zzb(zzcei, str, jSONObject);
    }

    public final synchronized zzfut zzd(String str, JSONObject jSONObject) {
        zzfut zzfut = this.zzm;
        if (zzfut == null) {
            return zzfuj.zzh((Object) null);
        }
        return zzfuj.zzm(zzfut, new zzdkt(this, str, jSONObject), this.zzg);
    }

    public final synchronized void zze(zzeyc zzeyc, zzeyf zzeyf) {
        zzfut zzfut = this.zzm;
        if (zzfut != null) {
            zzfuj.zzq(zzfut, new zzdkz(this, zzeyc, zzeyf), this.zzg);
        }
    }

    public final synchronized void zzf() {
        zzfut zzfut = this.zzm;
        if (zzfut != null) {
            zzfuj.zzq(zzfut, new zzdkv(this), this.zzg);
            this.zzm = null;
        }
    }

    public final synchronized void zzg(String str, Map map) {
        zzfut zzfut = this.zzm;
        if (zzfut != null) {
            zzfuj.zzq(zzfut, new zzdky(this, "sendMessageToNativeJs", map), this.zzg);
        }
    }

    public final synchronized void zzh() {
        Context context = this.zzd;
        zzbzg zzbzg = this.zzi;
        zzbaj zzbaj = zzbar.zzdm;
        zzfut zzl2 = zzfuj.zzl(zzfuj.zzk(new zzcer(context, this.zzh, zzbzg, this.zzb, (String) a0.c().zzb(zzbaj)), zzbzn.zze), new zzdku(this), this.zzg);
        this.zzm = zzl2;
        zzbzq.zza(zzl2, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzi(String str, zzbhp zzbhp) {
        zzfut zzfut = this.zzm;
        if (zzfut != null) {
            zzfuj.zzq(zzfut, new zzdkw(this, str, zzbhp), this.zzg);
        }
    }

    public final void zzj(WeakReference weakReference, String str, zzbhp zzbhp) {
        zzi(str, new zzdle(this, weakReference, str, zzbhp, (zzdld) null));
    }

    public final synchronized void zzk(String str, zzbhp zzbhp) {
        zzfut zzfut = this.zzm;
        if (zzfut != null) {
            zzfuj.zzq(zzfut, new zzdkx(this, str, zzbhp), this.zzg);
        }
    }
}
