package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.t;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdwq {
    public zzfut zza;
    /* access modifiers changed from: private */
    public final zzcxh zzb;
    private final zzdvy zzc;
    private final zzfda zzd;
    private final zzeyx zze;
    private final zzbzg zzf;
    private final zzfep zzg;
    private final zzfen zzh;
    private final Context zzi;
    private final zzfuu zzj;

    zzdwq(zzcxh zzcxh, zzdvy zzdvy, zzfda zzfda, zzeyx zzeyx, zzbzg zzbzg, zzfep zzfep, zzfen zzfen, Context context, zzfuu zzfuu) {
        this.zzb = zzcxh;
        this.zzc = zzdvy;
        this.zzd = zzfda;
        this.zze = zzeyx;
        this.zzf = zzbzg;
        this.zzg = zzfep;
        this.zzh = zzfen;
        this.zzi = context;
        this.zzj = zzfuu;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbsv zza(zzbtn zzbtn, zzdyb zzdyb) {
        Context context = this.zzi;
        zzdyb.zzc.put("Content-Type", zzdyb.zze);
        zzdyb.zzc.put("User-Agent", t.r().B(context, zzbtn.zzb.zza));
        String str = zzdyb.zza;
        int i10 = zzdyb.zzb;
        Map map = zzdyb.zzc;
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzbsv(str, i10, bundle, zzdyb.zzd, zzdyb.zzf, zzbtn.zzd, zzbtn.zzh);
    }

    public final zzfut zzc(zzbtn zzbtn, JSONObject jSONObject, zzbtq zzbtq) {
        this.zzb.zzbA(zzbtn);
        zzfcf zza2 = this.zzd.zzb(zzfcu.PROXY, zzfuj.zzl(this.zzd.zzb(zzfcu.PREPARE_HTTP_REQUEST, zzfuj.zzh(new zzdyf(jSONObject, zzbtq))).zze(new zzdyg(zzbtn.zzg, this.zzh, zzfeb.zza(this.zzi, 9))).zza(), new zzdwo(this, zzbtn), this.zzj)).zzf(new zzdwl(this.zzc)).zza();
        this.zza = zza2;
        zzfut zzm = zzfuj.zzm(this.zzd.zzb(zzfcu.PRE_PROCESS, zza2).zze(new zzdwn(jSONObject, zzbtq)).zzf(t.h().zza(this.zzi, this.zzf, this.zzg).zza("google.afma.response.normalize", zzdxo.zza, zzbmc.zzb)).zza(), new zzdwm(this), this.zzj);
        zzfuj.zzq(zzm, new zzdwp(this), this.zzj);
        return zzm;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzd(InputStream inputStream) throws Exception {
        return zzfuj.zzh(new zzeyo(new zzeyl(this.zze), zzeyn.zza(new InputStreamReader(inputStream))));
    }
}
