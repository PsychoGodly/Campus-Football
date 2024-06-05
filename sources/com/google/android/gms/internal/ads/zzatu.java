package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.t;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzatu {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzauj zze;
    private final zzaur zzf;
    private final Object zzg = new Object();
    private final ArrayList zzh = new ArrayList();
    private final ArrayList zzi = new ArrayList();
    private final ArrayList zzj = new ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private int zzn;
    private String zzo = MaxReward.DEFAULT_LABEL;
    private String zzp = MaxReward.DEFAULT_LABEL;
    private String zzq = MaxReward.DEFAULT_LABEL;

    public zzatu(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = z10;
        this.zze = new zzauj(i13);
        this.zzf = new zzaur(i14, i15, i16);
    }

    private final void zzp(String str, boolean z10, float f10, float f11, float f12, float f13) {
        if (str != null && str.length() >= this.zzc) {
            synchronized (this.zzg) {
                this.zzh.add(str);
                this.zzk += str.length();
                if (z10) {
                    this.zzi.add(str);
                    this.zzj.add(new zzauf(f10, f11, f12, f13, this.zzi.size() - 1));
                }
            }
        }
    }

    private static final String zzq(ArrayList arrayList, int i10) {
        if (arrayList.isEmpty()) {
            return MaxReward.DEFAULT_LABEL;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            sb2.append((String) arrayList.get(i11));
            sb2.append(' ');
            i11++;
            if (sb2.length() > 100) {
                break;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String sb3 = sb2.toString();
        if (sb3.length() < 100) {
            return sb3;
        }
        return sb3.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzatu)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzatu) obj).zzo;
        return str != null && str.equals(this.zzo);
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        int i10 = this.zzl;
        int i11 = this.zzn;
        int i12 = this.zzk;
        String zzq2 = zzq(this.zzh, 100);
        String zzq3 = zzq(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        return "ActivityContent fetchId: " + i10 + " score:" + i11 + " total_length:" + i12 + "\n text: " + zzq2 + "\n viewableText" + zzq3 + "\n signture: " + str + "\n viewableSignture: " + str2 + "\n viewableSignatureForVertical: " + str3;
    }

    /* access modifiers changed from: package-private */
    public final int zza(int i10, int i11) {
        return this.zzd ? this.zzb : (i10 * this.zza) + (i11 * this.zzb);
    }

    public final int zzb() {
        return this.zzn;
    }

    /* access modifiers changed from: package-private */
    public final int zzc() {
        return this.zzk;
    }

    public final String zzd() {
        return this.zzo;
    }

    public final String zze() {
        return this.zzp;
    }

    public final String zzf() {
        return this.zzq;
    }

    public final void zzg() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zzh() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzi() {
        synchronized (this.zzg) {
            this.zzn -= 100;
        }
    }

    public final void zzj(int i10) {
        this.zzl = i10;
    }

    public final void zzk(String str, boolean z10, float f10, float f11, float f12, float f13) {
        zzp(str, z10, f10, f11, f12, f13);
    }

    public final void zzl(String str, boolean z10, float f10, float f11, float f12, float f13) {
        zzp(str, z10, f10, f11, f12, f13);
        synchronized (this.zzg) {
            if (this.zzm < 0) {
                zzbza.zze("ActivityContent: negative number of WebViews.");
            }
            zzm();
        }
    }

    public final void zzm() {
        synchronized (this.zzg) {
            int zza2 = zza(this.zzk, this.zzl);
            if (zza2 > this.zzn) {
                this.zzn = zza2;
                if (!t.q().zzh().zzM()) {
                    this.zzo = this.zze.zza(this.zzh);
                    this.zzp = this.zze.zza(this.zzi);
                }
                if (!t.q().zzh().zzN()) {
                    this.zzq = this.zzf.zza(this.zzi, this.zzj);
                }
            }
        }
    }

    public final void zzn() {
        synchronized (this.zzg) {
            int zza2 = zza(this.zzk, this.zzl);
            if (zza2 > this.zzn) {
                this.zzn = zza2;
            }
        }
    }

    public final boolean zzo() {
        boolean z10;
        synchronized (this.zzg) {
            z10 = this.zzm == 0;
        }
        return z10;
    }
}
