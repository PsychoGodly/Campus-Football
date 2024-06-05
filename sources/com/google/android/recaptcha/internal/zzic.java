package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzic implements zzil {
    private final zzhy zza;
    private final zzjf zzb;
    private final boolean zzc;
    private final zzga zzd;

    private zzic(zzjf zzjf, zzga zzga, zzhy zzhy) {
        this.zzb = zzjf;
        this.zzc = zzga.zzj(zzhy);
        this.zzd = zzga;
        this.zza = zzhy;
    }

    static zzic zzc(zzjf zzjf, zzga zzga, zzhy zzhy) {
        return new zzic(zzjf, zzga, zzhy);
    }

    public final int zza(Object obj) {
        zzjf zzjf = this.zzb;
        int zzb2 = zzjf.zzb(zzjf.zzd(obj));
        return this.zzc ? zzb2 + this.zzd.zzb(obj).zzb() : zzb2;
    }

    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zzb(obj).zza.hashCode() : hashCode;
    }

    public final Object zze() {
        zzhy zzhy = this.zza;
        if (zzhy instanceof zzgo) {
            return ((zzgo) zzhy).zzs();
        }
        return zzhy.zzV().zzk();
    }

    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zzf(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zzin.zzE(this.zzb, obj, obj2);
        if (this.zzc) {
            zzin.zzD(this.zzd, obj, obj2);
        }
    }

    public final void zzh(Object obj, zzik zzik, zzfz zzfz) throws IOException {
        boolean z10;
        zzjf zzjf = this.zzb;
        zzga zzga = this.zzd;
        Object zzc2 = zzjf.zzc(obj);
        zzge zzc3 = zzga.zzc(obj);
        while (zzik.zzc() != Integer.MAX_VALUE) {
            int zzd2 = zzik.zzd();
            if (zzd2 != 11) {
                if ((zzd2 & 7) == 2) {
                    Object zzd3 = zzga.zzd(zzfz, this.zza, zzd2 >>> 3);
                    if (zzd3 != null) {
                        zzga.zzg(zzik, zzd3, zzfz, zzc3);
                    } else {
                        z10 = zzjf.zzr(zzc2, zzik);
                    }
                } else {
                    z10 = zzik.zzO();
                }
                if (!z10) {
                    zzjf.zzn(obj, zzc2);
                    return;
                }
            } else {
                int i10 = 0;
                Object obj2 = null;
                zzez zzez = null;
                while (true) {
                    try {
                        if (zzik.zzc() == Integer.MAX_VALUE) {
                            break;
                        }
                        int zzd4 = zzik.zzd();
                        if (zzd4 == 16) {
                            i10 = zzik.zzj();
                            obj2 = zzga.zzd(zzfz, this.zza, i10);
                        } else if (zzd4 == 26) {
                            if (obj2 != null) {
                                zzga.zzg(zzik, obj2, zzfz, zzc3);
                            } else {
                                zzez = zzik.zzp();
                            }
                        } else if (!zzik.zzO()) {
                            break;
                        }
                    } catch (Throwable th) {
                        zzjf.zzn(obj, zzc2);
                        throw th;
                    }
                }
                if (zzik.zzd() != 12) {
                    throw zzgy.zzb();
                } else if (zzez != null) {
                    if (obj2 != null) {
                        zzga.zzh(zzez, obj2, zzfz, zzc3);
                    } else {
                        zzjf.zzk(zzc2, i10, zzez);
                    }
                }
            }
        }
        zzjf.zzn(obj, zzc2);
    }

    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzem zzem) throws IOException {
        zzgo zzgo = (zzgo) obj;
        zzjg zzjg = zzgo.zzc;
        if (zzjg == zzjg.zzc()) {
            zzjg = zzjg.zzf();
            zzgo.zzc = zzjg;
        }
        ((zzgk) obj).zzi();
        Object obj2 = null;
        while (i10 < i11) {
            int zzj = zzen.zzj(bArr, i10, zzem);
            int i12 = zzem.zza;
            if (i12 == 11) {
                int i13 = 0;
                zzez zzez = null;
                while (zzj < i11) {
                    zzj = zzen.zzj(bArr, zzj, zzem);
                    int i14 = zzem.zza;
                    int i15 = i14 >>> 3;
                    int i16 = i14 & 7;
                    if (i15 != 2) {
                        if (i15 == 3) {
                            if (obj2 != null) {
                                int i17 = zzih.zza;
                                throw null;
                            } else if (i16 == 2) {
                                zzj = zzen.zza(bArr, zzj, zzem);
                                zzez = (zzez) zzem.zzc;
                            }
                        }
                    } else if (i16 == 0) {
                        zzj = zzen.zzj(bArr, zzj, zzem);
                        i13 = zzem.zza;
                        obj2 = this.zzd.zzd(zzem.zzd, this.zza, i13);
                    }
                    if (i14 == 12) {
                        break;
                    }
                    zzj = zzen.zzp(i14, bArr, zzj, i11, zzem);
                }
                if (zzez != null) {
                    zzjg.zzj((i13 << 3) | 2, zzez);
                }
                i10 = zzj;
            } else if ((i12 & 7) == 2) {
                obj2 = this.zzd.zzd(zzem.zzd, this.zza, i12 >>> 3);
                if (obj2 == null) {
                    i10 = zzen.zzi(i12, bArr, zzj, i11, zzjg, zzem);
                } else {
                    int i18 = zzih.zza;
                    throw null;
                }
            } else {
                i10 = zzen.zzp(i12, bArr, zzj, i11, zzem);
            }
        }
        if (i10 != i11) {
            throw zzgy.zzg();
        }
    }

    public final void zzj(Object obj, zzjx zzjx) throws IOException {
        Iterator zzf = this.zzd.zzb(obj).zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzgd zzgd = (zzgd) entry.getKey();
            if (zzgd.zze() == zzjw.MESSAGE) {
                zzgd.zzg();
                zzgd.zzf();
                if (entry instanceof zzhb) {
                    zzjx.zzw(zzgd.zza(), ((zzhb) entry).zza().zzb());
                } else {
                    zzjx.zzw(zzgd.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzjf zzjf = this.zzb;
        zzjf.zzp(zzjf.zzd(obj), zzjx);
    }

    public final boolean zzk(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    public final boolean zzl(Object obj) {
        return this.zzd.zzb(obj).zzk();
    }
}
