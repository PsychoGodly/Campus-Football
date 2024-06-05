package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.n1;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdxp extends zzbsy {
    private final Context zza;
    private final zzfuu zzb;
    private final zzdyh zzc;
    private final zzclp zzd;
    private final ArrayDeque zze;
    private final zzfep zzf;
    private final zzbtz zzg;
    private final zzdye zzh;

    public zzdxp(Context context, zzfuu zzfuu, zzbtz zzbtz, zzclp zzclp, zzdyh zzdyh, ArrayDeque arrayDeque, zzdye zzdye, zzfep zzfep, byte[] bArr) {
        zzbar.zzc(context);
        this.zza = context;
        this.zzb = zzfuu;
        this.zzg = zzbtz;
        this.zzc = zzdyh;
        this.zzd = zzclp;
        this.zze = arrayDeque;
        this.zzh = zzdye;
        this.zzf = zzfep;
    }

    private final synchronized zzdxm zzk(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzdxm zzdxm = (zzdxm) it.next();
            if (zzdxm.zzc.equals(str)) {
                it.remove();
                return zzdxm;
            }
        }
        return null;
    }

    private static zzfut zzl(zzfut zzfut, zzfda zzfda, zzbmf zzbmf, zzfen zzfen, zzfec zzfec) {
        zzblv zza2 = zzbmf.zza("AFMA_getAdDictionary", zzbmc.zza, zzdxg.zza);
        zzfem.zzd(zzfut, zzfec);
        zzfcf zza3 = zzfda.zzb(zzfcu.BUILD_URL, zzfut).zzf(zza2).zza();
        zzfem.zzc(zza3, zzfen, zzfec);
        return zza3;
    }

    private static zzfut zzm(zzbtn zzbtn, zzfda zzfda, zzeqf zzeqf) {
        zzdxa zzdxa = new zzdxa(zzeqf);
        return zzfda.zzb(zzfcu.GMS_SIGNALS, zzfuj.zzh(zzbtn.zza)).zzf(zzdxa).zze(zzdxb.zza).zza();
    }

    private final synchronized void zzn(zzdxm zzdxm) {
        zzo();
        this.zze.addLast(zzdxm);
    }

    private final synchronized void zzo() {
        int intValue = ((Long) zzbcr.zzd.zze()).intValue();
        while (this.zze.size() >= intValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzp(zzfut zzfut, zzbtj zzbtj) {
        zzfuj.zzq(zzfuj.zzm(zzfut, new zzdxj(this), zzbzn.zza), new zzdxl(this, zzbtj), zzbzn.zzf);
    }

    public final zzfut zzb(zzbtn zzbtn, int i10) {
        if (!((Boolean) zzbcr.zza.zze()).booleanValue()) {
            return zzfuj.zzg(new Exception("Split request is disabled."));
        }
        zzfaq zzfaq = zzbtn.zzi;
        if (zzfaq == null) {
            return zzfuj.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfaq.zzc == 0 || zzfaq.zzd == 0) {
            return zzfuj.zzg(new Exception("Caching is disabled."));
        }
        zzbmf zzb2 = t.h().zzb(this.zza, zzbzg.zza(), this.zzf);
        zzeqf zzp = this.zzd.zzp(zzbtn, i10);
        zzfda zzc2 = zzp.zzc();
        zzfut zzm = zzm(zzbtn, zzc2, zzp);
        zzfen zzd2 = zzp.zzd();
        zzfec zza2 = zzfeb.zza(this.zza, 9);
        zzfut zzl = zzl(zzm, zzc2, zzb2, zzd2, zza2);
        return zzc2.zza(zzfcu.GET_URL_AND_CACHE_KEY, zzm, zzl).zza(new zzdxf(this, zzl, zzm, zzbtn, zza2)).zza();
    }

    public final zzfut zzc(zzbtn zzbtn, int i10) {
        zzfec zzfec;
        zzfcf zzfcf;
        zzbtn zzbtn2 = zzbtn;
        zzbmf zzb2 = t.h().zzb(this.zza, zzbzg.zza(), this.zzf);
        zzeqf zzp = this.zzd.zzp(zzbtn2, i10);
        zzblv zza2 = zzb2.zza("google.afma.response.normalize", zzdxo.zza, zzbmc.zzb);
        zzdxm zzdxm = null;
        if (!((Boolean) zzbcr.zza.zze()).booleanValue()) {
            String str = zzbtn2.zzj;
            if (str != null && !str.isEmpty()) {
                n1.a("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            zzdxm = zzk(zzbtn2.zzh);
            if (zzdxm == null) {
                n1.a("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        zzdxm zzdxm2 = zzdxm;
        if (zzdxm2 == null) {
            zzfec = zzfeb.zza(this.zza, 9);
        } else {
            zzfec = zzdxm2.zze;
        }
        zzfec zzfec2 = zzfec;
        zzfen zzd2 = zzp.zzd();
        zzd2.zzd(zzbtn2.zza.getStringArrayList("ad_types"));
        zzdyg zzdyg = new zzdyg(zzbtn2.zzg, zzd2, zzfec2);
        zzdyd zzdyd = new zzdyd(this.zza, zzbtn2.zzb.zza, this.zzg, i10, (byte[]) null);
        zzfda zzc2 = zzp.zzc();
        zzfec zza3 = zzfeb.zza(this.zza, 11);
        if (zzdxm2 == null) {
            zzfut zzm = zzm(zzbtn2, zzc2, zzp);
            zzfut zzl = zzl(zzm, zzc2, zzb2, zzd2, zzfec2);
            zzfec zza4 = zzfeb.zza(this.zza, 10);
            zzfcf zza5 = zzc2.zza(zzfcu.HTTP, zzl, zzm).zza(new zzdxd(zzm, zzl)).zze(zzdyg).zze(new zzfei(zza4)).zze(zzdyd).zza();
            zzfem.zza(zza5, zzd2, zza4);
            zzfem.zzd(zza5, zza3);
            zzfcf = zzc2.zza(zzfcu.PRE_PROCESS, zzm, zzl, zza5).zza(new zzdxe(zza5, zzm, zzl)).zzf(zza2).zza();
        } else {
            zzdyf zzdyf = new zzdyf(zzdxm2.zzb, zzdxm2.zza);
            zzfec zza6 = zzfeb.zza(this.zza, 10);
            zzfcf zza7 = zzc2.zzb(zzfcu.HTTP, zzfuj.zzh(zzdyf)).zze(zzdyg).zze(new zzfei(zza6)).zze(zzdyd).zza();
            zzfem.zza(zza7, zzd2, zza6);
            zzfut zzh2 = zzfuj.zzh(zzdxm2);
            zzfem.zzd(zza7, zza3);
            zzfcf = zzc2.zza(zzfcu.PRE_PROCESS, zza7, zzh2).zza(new zzdxi(zza7, zzh2)).zzf(zza2).zza();
        }
        zzfem.zza(zzfcf, zzd2, zza3);
        return zzfcf;
    }

    public final zzfut zzd(zzbtn zzbtn, int i10) {
        zzbmf zzb2 = t.h().zzb(this.zza, zzbzg.zza(), this.zzf);
        if (!((Boolean) zzbcw.zza.zze()).booleanValue()) {
            return zzfuj.zzg(new Exception("Signal collection disabled."));
        }
        zzeqf zzp = this.zzd.zzp(zzbtn, i10);
        zzepq zza2 = zzp.zza();
        zzblv zza3 = zzb2.zza("google.afma.request.getSignals", zzbmc.zza, zzbmc.zzb);
        zzfec zza4 = zzfeb.zza(this.zza, 22);
        zzfcf zza5 = zzp.zzc().zzb(zzfcu.GET_SIGNALS, zzfuj.zzh(zzbtn.zza)).zze(new zzfei(zza4)).zzf(new zzdxh(zza2)).zzb(zzfcu.JS_SIGNALS).zzf(zza3).zza();
        zzfen zzd2 = zzp.zzd();
        zzd2.zzd(zzbtn.zza.getStringArrayList("ad_types"));
        zzfem.zzb(zza5, zzd2, zza4);
        if (((Boolean) zzbck.zze.zze()).booleanValue()) {
            zzdyh zzdyh = this.zzc;
            zzdyh.getClass();
            zza5.zzc(new zzdxc(zzdyh), this.zzb);
        }
        return zza5;
    }

    public final void zze(zzbtn zzbtn, zzbtj zzbtj) {
        zzp(zzb(zzbtn, Binder.getCallingUid()), zzbtj);
    }

    public final void zzf(zzbtn zzbtn, zzbtj zzbtj) {
        zzp(zzd(zzbtn, Binder.getCallingUid()), zzbtj);
    }

    public final void zzg(zzbtn zzbtn, zzbtj zzbtj) {
        zzfut zzc2 = zzc(zzbtn, Binder.getCallingUid());
        zzp(zzc2, zzbtj);
        if (((Boolean) zzbck.zzc.zze()).booleanValue()) {
            zzdyh zzdyh = this.zzc;
            zzdyh.getClass();
            zzc2.zzc(new zzdxc(zzdyh), this.zzb);
        }
    }

    public final void zzh(String str, zzbtj zzbtj) {
        zzp(zzi(str), zzbtj);
    }

    public final zzfut zzi(String str) {
        if (!((Boolean) zzbcr.zza.zze()).booleanValue()) {
            return zzfuj.zzg(new Exception("Split request is disabled."));
        }
        zzdxk zzdxk = new zzdxk(this);
        if (zzk(str) == null) {
            return zzfuj.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzfuj.zzh(zzdxk);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzj(zzfut zzfut, zzfut zzfut2, zzbtn zzbtn, zzfec zzfec) throws Exception {
        String zzc2 = ((zzbtq) zzfut.get()).zzc();
        String str = zzbtn.zzh;
        zzn(new zzdxm((zzbtq) zzfut.get(), (JSONObject) zzfut2.get(), str, zzc2, zzfec));
        return new ByteArrayInputStream(zzc2.getBytes(zzfnh.zzc));
    }
}
