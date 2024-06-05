package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzkg {
    private final zzno zza;
    private final List zzb = new ArrayList();
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final zzkf zze;
    private final HashMap zzf;
    private final Set zzg;
    /* access modifiers changed from: private */
    public final zzlb zzh;
    /* access modifiers changed from: private */
    public final zzdv zzi;
    private boolean zzj;
    private zzgi zzk;
    private zzum zzl = new zzum(0);

    public zzkg(zzkf zzkf, zzlb zzlb, zzdv zzdv, zzno zzno) {
        this.zza = zzno;
        this.zze = zzkf;
        this.zzh = zzlb;
        this.zzi = zzdv;
        this.zzf = new HashMap();
        this.zzg = new HashSet();
    }

    private final void zzp(int i10, int i11) {
        while (i10 < this.zzb.size()) {
            ((zzke) this.zzb.get(i10)).zzd += i11;
            i10++;
        }
    }

    private final void zzq(zzke zzke) {
        zzkd zzkd = (zzkd) this.zzf.get(zzke);
        if (zzkd != null) {
            zzkd.zza.zzi(zzkd.zzb);
        }
    }

    private final void zzr() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzke zzke = (zzke) it.next();
            if (zzke.zzc.isEmpty()) {
                zzq(zzke);
                it.remove();
            }
        }
    }

    private final void zzs(zzke zzke) {
        if (zzke.zze && zzke.zzc.isEmpty()) {
            zzkd zzkd = (zzkd) this.zzf.remove(zzke);
            Objects.requireNonNull(zzkd);
            zzkd.zza.zzp(zzkd.zzb);
            zzkd.zza.zzs(zzkd.zzc);
            zzkd.zza.zzr(zzkd.zzc);
            this.zzg.remove(zzke);
        }
    }

    private final void zzt(zzke zzke) {
        zzsn zzsn = zzke.zza;
        zzjw zzjw = new zzjw(this);
        zzkc zzkc = new zzkc(this, zzke);
        this.zzf.put(zzke, new zzkd(zzsn, zzjw, zzkc));
        zzsn.zzh(new Handler(zzew.zzE(), (Handler.Callback) null), zzkc);
        zzsn.zzg(new Handler(zzew.zzE(), (Handler.Callback) null), zzkc);
        zzsn.zzm(zzjw, this.zzk, this.zza);
    }

    private final void zzu(int i10, int i11) {
        while (true) {
            i11--;
            if (i11 >= i10) {
                zzke zzke = (zzke) this.zzb.remove(i11);
                this.zzd.remove(zzke.zzb);
                zzp(i11, -zzke.zza.zzB().zzc());
                zzke.zze = true;
                if (this.zzj) {
                    zzs(zzke);
                }
            } else {
                return;
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzcn zzb() {
        if (this.zzb.isEmpty()) {
            return zzcn.zza;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzb.size(); i11++) {
            zzke zzke = (zzke) this.zzb.get(i11);
            zzke.zzd = i10;
            i10 += zzke.zza.zzB().zzc();
        }
        return new zzkl(this.zzb, this.zzl, (byte[]) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzsu zzsu, zzcn zzcn) {
        this.zze.zzh();
    }

    public final void zzf(zzgi zzgi) {
        zzdl.zzf(!this.zzj);
        this.zzk = zzgi;
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzke zzke = (zzke) this.zzb.get(i10);
            zzt(zzke);
            this.zzg.add(zzke);
        }
        this.zzj = true;
    }

    public final void zzg() {
        for (zzkd zzkd : this.zzf.values()) {
            try {
                zzkd.zza.zzp(zzkd.zzb);
            } catch (RuntimeException e10) {
                zzee.zzc("MediaSourceList", "Failed to release child source.", e10);
            }
            zzkd.zza.zzs(zzkd.zzc);
            zzkd.zza.zzr(zzkd.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzh(zzsq zzsq) {
        zzke zzke = (zzke) this.zzc.remove(zzsq);
        Objects.requireNonNull(zzke);
        zzke.zza.zzF(zzsq);
        zzke.zzc.remove(((zzsk) zzsq).zza);
        if (!this.zzc.isEmpty()) {
            zzr();
        }
        zzs(zzke);
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final zzcn zzj(int i10, List list, zzum zzum) {
        if (!list.isEmpty()) {
            this.zzl = zzum;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                zzke zzke = (zzke) list.get(i11 - i10);
                if (i11 > 0) {
                    zzke zzke2 = (zzke) this.zzb.get(i11 - 1);
                    zzke.zzc(zzke2.zzd + zzke2.zza.zzB().zzc());
                } else {
                    zzke.zzc(0);
                }
                zzp(i11, zzke.zza.zzB().zzc());
                this.zzb.add(i11, zzke);
                this.zzd.put(zzke.zzb, zzke);
                if (this.zzj) {
                    zzt(zzke);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzke);
                    } else {
                        zzq(zzke);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzcn zzk(int i10, int i11, int i12, zzum zzum) {
        zzdl.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzcn zzl(int i10, int i11, zzum zzum) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11 && i11 <= zza()) {
            z10 = true;
        }
        zzdl.zzd(z10);
        this.zzl = zzum;
        zzu(i10, i11);
        return zzb();
    }

    public final zzcn zzm(List list, zzum zzum) {
        zzu(0, this.zzb.size());
        return zzj(this.zzb.size(), list, zzum);
    }

    public final zzcn zzn(zzum zzum) {
        int zza2 = zza();
        if (zzum.zzc() != zza2) {
            zzum = zzum.zzf().zzg(0, zza2);
        }
        this.zzl = zzum;
        return zzb();
    }

    public final zzsq zzo(zzss zzss, zzwt zzwt, long j10) {
        Object obj = zzss.zza;
        int i10 = zzkl.zzc;
        Object obj2 = ((Pair) obj).first;
        zzss zzc2 = zzss.zzc(((Pair) obj).second);
        zzke zzke = (zzke) this.zzd.get(obj2);
        Objects.requireNonNull(zzke);
        this.zzg.add(zzke);
        zzkd zzkd = (zzkd) this.zzf.get(zzke);
        if (zzkd != null) {
            zzkd.zza.zzk(zzkd.zzb);
        }
        zzke.zzc.add(zzc2);
        zzsk zzG = zzke.zza.zzH(zzc2, zzwt, j10);
        this.zzc.put(zzG, zzke);
        zzr();
        return zzG;
    }
}
