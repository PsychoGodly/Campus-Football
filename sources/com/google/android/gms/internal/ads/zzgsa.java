package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgsa implements zzgsp {
    private final zzgrw zza;
    private final zzgtg zzb;
    private final boolean zzc;
    private final zzgpz zzd;

    private zzgsa(zzgtg zzgtg, zzgpz zzgpz, zzgrw zzgrw) {
        this.zzb = zzgtg;
        this.zzc = zzgpz.zzh(zzgrw);
        this.zzd = zzgpz;
        this.zza = zzgrw;
    }

    static zzgsa zzc(zzgtg zzgtg, zzgpz zzgpz, zzgrw zzgrw) {
        return new zzgsa(zzgtg, zzgpz, zzgrw);
    }

    public final int zza(Object obj) {
        zzgtg zzgtg = this.zzb;
        int zzb2 = zzgtg.zzb(zzgtg.zzd(obj));
        if (!this.zzc) {
            return zzb2;
        }
        this.zzd.zza(obj);
        throw null;
    }

    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    public final Object zze() {
        zzgrw zzgrw = this.zza;
        if (zzgrw instanceof zzgqm) {
            return ((zzgqm) zzgrw).zzaD();
        }
        return zzgrw.zzaO().zzan();
    }

    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zzgsr.zzF(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgsr.zzE(this.zzd, obj, obj2);
        }
    }

    public final void zzh(Object obj, zzgsh zzgsh, zzgpy zzgpy) throws IOException {
        boolean z10;
        zzgtg zzgtg = this.zzb;
        zzgpz zzgpz = this.zzd;
        Object zzc2 = zzgtg.zzc(obj);
        zzgqd zzb2 = zzgpz.zzb(obj);
        while (zzgsh.zzc() != Integer.MAX_VALUE) {
            int zzd2 = zzgsh.zzd();
            if (zzd2 != 11) {
                if ((zzd2 & 7) == 2) {
                    Object zzc3 = zzgpz.zzc(zzgpy, this.zza, zzd2 >>> 3);
                    if (zzc3 != null) {
                        zzgpz.zzf(zzgsh, zzc3, zzgpy, zzb2);
                    } else {
                        z10 = zzgtg.zzp(zzc2, zzgsh);
                    }
                } else {
                    z10 = zzgsh.zzO();
                }
                if (!z10) {
                    zzgtg.zzn(obj, zzc2);
                    return;
                }
            } else {
                int i10 = 0;
                Object obj2 = null;
                zzgpe zzgpe = null;
                while (true) {
                    try {
                        if (zzgsh.zzc() == Integer.MAX_VALUE) {
                            break;
                        }
                        int zzd3 = zzgsh.zzd();
                        if (zzd3 == 16) {
                            i10 = zzgsh.zzj();
                            obj2 = zzgpz.zzc(zzgpy, this.zza, i10);
                        } else if (zzd3 == 26) {
                            if (obj2 != null) {
                                zzgpz.zzf(zzgsh, obj2, zzgpy, zzb2);
                            } else {
                                zzgpe = zzgsh.zzp();
                            }
                        } else if (!zzgsh.zzO()) {
                            break;
                        }
                    } catch (Throwable th) {
                        zzgtg.zzn(obj, zzc2);
                        throw th;
                    }
                }
                if (zzgsh.zzd() != 12) {
                    throw zzgqy.zzb();
                } else if (zzgpe != null) {
                    if (obj2 != null) {
                        zzgpz.zzg(zzgpe, obj2, zzgpy, zzb2);
                    } else {
                        zzgtg.zzk(zzc2, i10, zzgpe);
                    }
                }
            }
        }
        zzgtg.zzn(obj, zzc2);
    }

    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgoq zzgoq) throws IOException {
        zzgqm zzgqm = (zzgqm) obj;
        if (zzgqm.zzc == zzgth.zzc()) {
            zzgqm.zzc = zzgth.zzf();
        }
        zzgqj zzgqj = (zzgqj) obj;
        throw null;
    }

    public final boolean zzj(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    public final void zzm(Object obj, zzgpu zzgpu) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
