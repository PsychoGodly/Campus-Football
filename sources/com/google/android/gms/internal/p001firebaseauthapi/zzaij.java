package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaij  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaij implements zzalc {
    private final zzaia zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzaij(zzaia zzaia) {
        zzaia zzaia2 = (zzaia) zzajf.zza(zzaia, "input");
        this.zza = zzaia2;
        zzaia2.zzd = this;
    }

    public final double zza() throws IOException {
        zzb(1);
        return this.zza.zza();
    }

    public final float zzb() throws IOException {
        zzb(5);
        return this.zza.zzb();
    }

    public final int zzc() throws IOException {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i11 = this.zzb;
        return (i11 == 0 || i11 == this.zzc) ? a.e.API_PRIORITY_OTHER : i11 >>> 3;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() throws IOException {
        zzb(0);
        return this.zza.zzd();
    }

    public final int zzf() throws IOException {
        zzb(5);
        return this.zza.zze();
    }

    public final int zzg() throws IOException {
        zzb(0);
        return this.zza.zzf();
    }

    public final int zzh() throws IOException {
        zzb(5);
        return this.zza.zzg();
    }

    public final int zzi() throws IOException {
        zzb(0);
        return this.zza.zzh();
    }

    public final int zzj() throws IOException {
        zzb(0);
        return this.zza.zzj();
    }

    public final long zzk() throws IOException {
        zzb(1);
        return this.zza.zzk();
    }

    public final long zzl() throws IOException {
        zzb(0);
        return this.zza.zzl();
    }

    public final long zzm() throws IOException {
        zzb(1);
        return this.zza.zzn();
    }

    public final long zzn() throws IOException {
        zzb(0);
        return this.zza.zzo();
    }

    public final long zzo() throws IOException {
        zzb(0);
        return this.zza.zzp();
    }

    public final zzahp zzp() throws IOException {
        zzb(2);
        return this.zza.zzq();
    }

    public final String zzq() throws IOException {
        zzb(2);
        return this.zza.zzr();
    }

    public final String zzr() throws IOException {
        zzb(2);
        return this.zza.zzs();
    }

    public final boolean zzs() throws IOException {
        zzb(0);
        return this.zza.zzu();
    }

    public final boolean zzt() throws IOException {
        int i10;
        if (this.zza.zzt() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zze(i10);
    }

    private final <T> void zzd(T t10, zzalf<T> zzalf, zzaio zzaio) throws IOException {
        int zzj = this.zza.zzj();
        zzaia zzaia = this.zza;
        if (zzaia.zza < zzaia.zzb) {
            int zzb2 = zzaia.zzb(zzj);
            this.zza.zza++;
            zzalf.zza(t10, this, zzaio);
            this.zza.zzc(0);
            zzaia zzaia2 = this.zza;
            zzaia2.zza--;
            zzaia2.zzd(zzb2);
            return;
        }
        throw new zzaji("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static zzaij zza(zzaia zzaia) {
        zzaij zzaij = zzaia.zzd;
        if (zzaij != null) {
            return zzaij;
        }
        return new zzaij(zzaia);
    }

    private final <T> T zzb(zzalf<T> zzalf, zzaio zzaio) throws IOException {
        T zza2 = zzalf.zza();
        zzd(zza2, zzalf, zzaio);
        zzalf.zzc(zza2);
        return zza2;
    }

    public final void zze(List<Integer> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzajd) {
            zzajd zzajd = (zzajd) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzajd.zzc(this.zza.zze());
                } while (this.zza.zzc() < zzc2);
            } else if (i10 == 5) {
                do {
                    zzajd.zzc(this.zza.zze());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else {
                throw zzaji.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzc(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < zzc3);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else {
                throw zzaji.zza();
            }
        }
    }

    public final void zzf(List<Long> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzajy) {
            zzajy zzajy = (zzajy) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzajy.zza(this.zza.zzk());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzajy.zza(this.zza.zzk());
                } while (this.zza.zzc() < zzc2);
            } else {
                throw zzaji.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzk()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzd(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Long.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < zzc3);
            } else {
                throw zzaji.zza();
            }
        }
    }

    public final void zzg(List<Float> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzajb) {
            zzajb zzajb = (zzajb) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzajb.zza(this.zza.zzb());
                } while (this.zza.zzc() < zzc2);
            } else if (i10 == 5) {
                do {
                    zzajb.zza(this.zza.zzb());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else {
                throw zzaji.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzc(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < zzc3);
            } else if (i11 == 5) {
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else {
                throw zzaji.zza();
            }
        }
    }

    public final void zzh(List<Integer> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzajd) {
            zzajd zzajd = (zzajd) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzajd.zzc(this.zza.zzf());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajd.zzc(this.zza.zzf());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzaji.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzaji.zza();
            }
        }
    }

    public final void zzi(List<Long> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzajy) {
            zzajy zzajy = (zzajy) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzajy.zza(this.zza.zzl());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajy.zza(this.zza.zzl());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzaji.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzaji.zza();
            }
        }
    }

    public final void zzj(List<Integer> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzajd) {
            zzajd zzajd = (zzajd) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzajd.zzc(this.zza.zzg());
                } while (this.zza.zzc() < zzc2);
            } else if (i10 == 5) {
                do {
                    zzajd.zzc(this.zza.zzg());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else {
                throw zzaji.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzc(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < zzc3);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else {
                throw zzaji.zza();
            }
        }
    }

    public final void zzk(List<Long> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzajy) {
            zzajy zzajy = (zzajy) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzajy.zza(this.zza.zzn());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzajy.zza(this.zza.zzn());
                } while (this.zza.zzc() < zzc2);
            } else {
                throw zzaji.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzd(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < zzc3);
            } else {
                throw zzaji.zza();
            }
        }
    }

    public final void zzl(List<Integer> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzajd) {
            zzajd zzajd = (zzajd) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzajd.zzc(this.zza.zzh());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajd.zzc(this.zza.zzh());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzaji.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzaji.zza();
            }
        }
    }

    public final void zzm(List<Long> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzajy) {
            zzajy zzajy = (zzajy) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzajy.zza(this.zza.zzo());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajy.zza(this.zza.zzo());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzaji.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzaji.zza();
            }
        }
    }

    public final void zzn(List<String> list) throws IOException {
        zza(list, false);
    }

    public final void zzo(List<String> list) throws IOException {
        zza(list, true);
    }

    public final void zzp(List<Integer> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzajd) {
            zzajd zzajd = (zzajd) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzajd.zzc(this.zza.zzj());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajd.zzc(this.zza.zzj());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzaji.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzaji.zza();
            }
        }
    }

    public final void zzq(List<Long> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzajy) {
            zzajy zzajy = (zzajy) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzajy.zza(this.zza.zzp());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajy.zza(this.zza.zzp());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzaji.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzaji.zza();
            }
        }
    }

    private final Object zza(zzamr zzamr, Class<?> cls, zzaio zzaio) throws IOException {
        switch (zzaii.zza[zzamr.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzalb.zza().zza(cls), zzaio);
            case 11:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case 14:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final <T> void zzc(T t10, zzalf<T> zzalf, zzaio zzaio) throws IOException {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzalf.zza(t10, this, zzaio);
            if (this.zzb != this.zzc) {
                throw zzaji.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    public final <T> void zzb(T t10, zzalf<T> zzalf, zzaio zzaio) throws IOException {
        zzb(2);
        zzd(t10, zzalf, zzaio);
    }

    public final void zzb(List<zzahp> list) throws IOException {
        int zzi;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (!this.zza.zzt()) {
                    zzi = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzaji.zza();
    }

    public final void zzd(List<Integer> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzajd) {
            zzajd zzajd = (zzajd) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzajd.zzc(this.zza.zzd());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajd.zzc(this.zza.zzd());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzaji.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzd()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzd()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzaji.zza();
            }
        }
    }

    public final <T> void zzb(List<T> list, zzalf<T> zzalf, zzaio zzaio) throws IOException {
        int zzi;
        int i10 = this.zzb;
        if ((i10 & 7) == 2) {
            do {
                list.add(zzb(zzalf, zzaio));
                if (!this.zza.zzt() && this.zzd == 0) {
                    zzi = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi == i10);
            this.zzd = zzi;
            return;
        }
        throw zzaji.zza();
    }

    public final void zzc(List<Double> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzaim) {
            zzaim zzaim = (zzaim) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzaim.zza(this.zza.zza());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc2 = this.zza.zzc() + zzj;
                do {
                    zzaim.zza(this.zza.zza());
                } while (this.zza.zzc() < zzc2);
            } else {
                throw zzaji.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzd(zzj2);
                int zzc3 = this.zza.zzc() + zzj2;
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                } while (this.zza.zzc() < zzc3);
            } else {
                throw zzaji.zza();
            }
        }
    }

    private final void zzb(int i10) throws IOException {
        if ((this.zzb & 7) != i10) {
            throw zzaji.zza();
        }
    }

    private final <T> T zza(zzalf<T> zzalf, zzaio zzaio) throws IOException {
        T zza2 = zzalf.zza();
        zzc(zza2, zzalf, zzaio);
        zzalf.zzc(zza2);
        return zza2;
    }

    public final <T> void zza(T t10, zzalf<T> zzalf, zzaio zzaio) throws IOException {
        zzb(3);
        zzc(t10, zzalf, zzaio);
    }

    public final void zza(List<Boolean> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzahn) {
            zzahn zzahn = (zzahn) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzahn.zza(this.zza.zzu());
                    if (!this.zza.zzt()) {
                        zzi2 = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
            } else if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    zzahn.zza(this.zza.zzu());
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
            } else {
                throw zzaji.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzu()));
                    if (!this.zza.zzt()) {
                        zzi = this.zza.zzi();
                    } else {
                        return;
                    }
                } while (zzi == this.zzb);
                this.zzd = zzi;
            } else if (i11 == 2) {
                int zzc3 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Boolean.valueOf(this.zza.zzu()));
                } while (this.zza.zzc() < zzc3);
                zza(zzc3);
            } else {
                throw zzaji.zza();
            }
        }
    }

    private static void zzd(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw zzaji.zzg();
        }
    }

    private static void zzc(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw zzaji.zzg();
        }
    }

    @Deprecated
    public final <T> void zza(List<T> list, zzalf<T> zzalf, zzaio zzaio) throws IOException {
        int zzi;
        int i10 = this.zzb;
        if ((i10 & 7) == 3) {
            do {
                list.add(zza(zzalf, zzaio));
                if (!this.zza.zzt() && this.zzd == 0) {
                    zzi = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi == i10);
            this.zzd = zzi;
            return;
        }
        throw zzaji.zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (zzt() != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        throw new com.google.android.gms.internal.p001firebaseauthapi.zzaji("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.p001firebaseauthapi.zzake<K, V> r9, com.google.android.gms.internal.p001firebaseauthapi.zzaio r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.zzb((int) r0)
            com.google.android.gms.internal.firebase-auth-api.zzaia r1 = r7.zza
            int r1 = r1.zzj()
            com.google.android.gms.internal.firebase-auth-api.zzaia r2 = r7.zza
            int r1 = r2.zzb(r1)
            K r2 = r9.zzb
            V r3 = r9.zzd
        L_0x0014:
            int r4 = r7.zzc()     // Catch:{ all -> 0x0064 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005b
            com.google.android.gms.internal.firebase-auth-api.zzaia r5 = r7.zza     // Catch:{ all -> 0x0064 }
            boolean r5 = r5.zzt()     // Catch:{ all -> 0x0064 }
            if (r5 != 0) goto L_0x005b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0046
            if (r4 == r0) goto L_0x0039
            boolean r4 = r7.zzt()     // Catch:{ zzajl -> 0x004e }
            if (r4 == 0) goto L_0x0033
            goto L_0x0014
        L_0x0033:
            com.google.android.gms.internal.firebase-auth-api.zzaji r4 = new com.google.android.gms.internal.firebase-auth-api.zzaji     // Catch:{ zzajl -> 0x004e }
            r4.<init>((java.lang.String) r6)     // Catch:{ zzajl -> 0x004e }
            throw r4     // Catch:{ zzajl -> 0x004e }
        L_0x0039:
            com.google.android.gms.internal.firebase-auth-api.zzamr r4 = r9.zzc     // Catch:{ zzajl -> 0x004e }
            V r5 = r9.zzd     // Catch:{ zzajl -> 0x004e }
            java.lang.Class r5 = r5.getClass()     // Catch:{ zzajl -> 0x004e }
            java.lang.Object r3 = r7.zza((com.google.android.gms.internal.p001firebaseauthapi.zzamr) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.p001firebaseauthapi.zzaio) r10)     // Catch:{ zzajl -> 0x004e }
            goto L_0x0014
        L_0x0046:
            com.google.android.gms.internal.firebase-auth-api.zzamr r4 = r9.zza     // Catch:{ zzajl -> 0x004e }
            r5 = 0
            java.lang.Object r2 = r7.zza((com.google.android.gms.internal.p001firebaseauthapi.zzamr) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.p001firebaseauthapi.zzaio) r5)     // Catch:{ zzajl -> 0x004e }
            goto L_0x0014
        L_0x004e:
            boolean r4 = r7.zzt()     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x0055
            goto L_0x0014
        L_0x0055:
            com.google.android.gms.internal.firebase-auth-api.zzaji r8 = new com.google.android.gms.internal.firebase-auth-api.zzaji     // Catch:{ all -> 0x0064 }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0064 }
            throw r8     // Catch:{ all -> 0x0064 }
        L_0x005b:
            r8.put(r2, r3)     // Catch:{ all -> 0x0064 }
            com.google.android.gms.internal.firebase-auth-api.zzaia r8 = r7.zza
            r8.zzd(r1)
            return
        L_0x0064:
            r8 = move-exception
            com.google.android.gms.internal.firebase-auth-api.zzaia r9 = r7.zza
            r9.zzd(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzaij.zza(java.util.Map, com.google.android.gms.internal.firebase-auth-api.zzake, com.google.android.gms.internal.firebase-auth-api.zzaio):void");
    }

    private final void zza(List<String> list, boolean z10) throws IOException {
        int zzi;
        int zzi2;
        if ((this.zzb & 7) != 2) {
            throw zzaji.zza();
        } else if (!(list instanceof zzajt) || z10) {
            do {
                list.add(z10 ? zzr() : zzq());
                if (!this.zza.zzt()) {
                    zzi = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
        } else {
            zzajt zzajt = (zzajt) list;
            do {
                zzajt.zza(zzp());
                if (!this.zza.zzt()) {
                    zzi2 = this.zza.zzi();
                } else {
                    return;
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
        }
    }

    private final void zza(int i10) throws IOException {
        if (this.zza.zzc() != i10) {
            throw zzaji.zzi();
        }
    }
}
