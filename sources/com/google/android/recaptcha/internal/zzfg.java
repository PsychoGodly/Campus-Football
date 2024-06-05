package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzfg implements zzik {
    private final zzff zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzfg(zzff zzff) {
        byte[] bArr = zzgw.zzd;
        this.zza = zzff;
        zzff.zzc = this;
    }

    private final void zzP(Object obj, zzil zzil, zzfz zzfz) throws IOException {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzil.zzh(obj, this, zzfz);
            if (this.zzb != this.zzc) {
                throw zzgy.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    private final void zzQ(Object obj, zzil zzil, zzfz zzfz) throws IOException {
        int zzn = this.zza.zzn();
        zzff zzff = this.zza;
        if (zzff.zza < zzff.zzb) {
            int zze = zzff.zze(zzn);
            this.zza.zza++;
            zzil.zzh(obj, this, zzfz);
            this.zza.zzz(0);
            zzff zzff2 = this.zza;
            zzff2.zza--;
            zzff2.zzA(zze);
            return;
        }
        throw new zzgy("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzR(int i10) throws IOException {
        if (this.zza.zzd() != i10) {
            throw zzgy.zzj();
        }
    }

    private final void zzS(int i10) throws IOException {
        if ((this.zzb & 7) != i10) {
            throw zzgy.zza();
        }
    }

    private static final void zzT(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw zzgy.zzg();
        }
    }

    private static final void zzU(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw zzgy.zzg();
        }
    }

    public static zzfg zzq(zzff zzff) {
        zzfg zzfg = zzff.zzc;
        return zzfg != null ? zzfg : new zzfg(zzff);
    }

    public final void zzA(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzhn) {
            zzhn zzhn = (zzhn) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzhn.zzf(this.zza.zzo());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzhn.zzf(this.zza.zzo());
                } while (this.zza.zzd() < zzd2);
            } else {
                throw zzgy.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < zzd3);
            } else {
                throw zzgy.zza();
            }
        }
    }

    public final void zzB(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgg) {
            zzgg zzgg = (zzgg) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzgg.zze(this.zza.zzc());
                } while (this.zza.zzd() < zzd2);
            } else if (i10 == 5) {
                do {
                    zzgg.zze(this.zza.zzc());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else {
                throw zzgy.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < zzd3);
            } else if (i11 == 5) {
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else {
                throw zzgy.zza();
            }
        }
    }

    @Deprecated
    public final void zzC(List list, zzil zzil, zzfz zzfz) throws IOException {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) == 3) {
            do {
                Object zze = zzil.zze();
                zzP(zze, zzil, zzfz);
                zzil.zzf(zze);
                list.add(zze);
                if (!this.zza.zzC() && this.zzd == 0) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == i10);
            this.zzd = zzm;
            return;
        }
        throw zzgy.zza();
    }

    public final void zzD(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgp) {
            zzgp zzgp = (zzgp) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgp.zzg(this.zza.zzh());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    zzgp.zzg(this.zza.zzh());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgy.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                int zzd3 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzgy.zza();
            }
        }
    }

    public final void zzE(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzhn) {
            zzhn zzhn = (zzhn) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzhn.zzf(this.zza.zzp());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    zzhn.zzf(this.zza.zzp());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgy.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                int zzd3 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzgy.zza();
            }
        }
    }

    public final void zzF(List list, zzil zzil, zzfz zzfz) throws IOException {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) == 2) {
            do {
                Object zze = zzil.zze();
                zzQ(zze, zzil, zzfz);
                zzil.zzf(zze);
                list.add(zze);
                if (!this.zza.zzC() && this.zzd == 0) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == i10);
            this.zzd = zzm;
            return;
        }
        throw zzgy.zza();
    }

    public final void zzG(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgp) {
            zzgp zzgp = (zzgp) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzgp.zzg(this.zza.zzk());
                } while (this.zza.zzd() < zzd2);
            } else if (i10 == 5) {
                do {
                    zzgp.zzg(this.zza.zzk());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else {
                throw zzgy.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < zzd3);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else {
                throw zzgy.zza();
            }
        }
    }

    public final void zzH(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzhn) {
            zzhn zzhn = (zzhn) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzhn.zzf(this.zza.zzt());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzhn.zzf(this.zza.zzt());
                } while (this.zza.zzd() < zzd2);
            } else {
                throw zzgy.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < zzd3);
            } else {
                throw zzgy.zza();
            }
        }
    }

    public final void zzI(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgp) {
            zzgp zzgp = (zzgp) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgp.zzg(this.zza.zzl());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    zzgp.zzg(this.zza.zzl());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgy.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                int zzd3 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzgy.zza();
            }
        }
    }

    public final void zzJ(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzhn) {
            zzhn zzhn = (zzhn) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzhn.zzf(this.zza.zzu());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    zzhn.zzf(this.zza.zzu());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgy.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                int zzd3 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzgy.zza();
            }
        }
    }

    public final void zzK(List list, boolean z10) throws IOException {
        int zzm;
        int zzm2;
        if ((this.zzb & 7) != 2) {
            throw zzgy.zza();
        } else if ((list instanceof zzhg) && !z10) {
            zzhg zzhg = (zzhg) list;
            do {
                zzhg.zzi(zzp());
                if (!this.zza.zzC()) {
                    zzm2 = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
        } else {
            do {
                list.add(z10 ? zzs() : zzr());
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
        }
    }

    public final void zzL(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgp) {
            zzgp zzgp = (zzgp) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgp.zzg(this.zza.zzn());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    zzgp.zzg(this.zza.zzn());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgy.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                int zzd3 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzgy.zza();
            }
        }
    }

    public final void zzM(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzhn) {
            zzhn zzhn = (zzhn) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzhn.zzf(this.zza.zzv());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    zzhn.zzf(this.zza.zzv());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgy.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                int zzd3 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzgy.zza();
            }
        }
    }

    public final boolean zzN() throws IOException {
        zzS(0);
        return this.zza.zzD();
    }

    public final boolean zzO() throws IOException {
        int i10;
        if (this.zza.zzC() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i10);
    }

    public final double zza() throws IOException {
        zzS(1);
        return this.zza.zzb();
    }

    public final float zzb() throws IOException {
        zzS(5);
        return this.zza.zzc();
    }

    public final int zzc() throws IOException {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            i10 = this.zza.zzm();
            this.zzb = i10;
        }
        return (i10 == 0 || i10 == this.zzc) ? a.e.API_PRIORITY_OTHER : i10 >>> 3;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() throws IOException {
        zzS(0);
        return this.zza.zzf();
    }

    public final int zzf() throws IOException {
        zzS(5);
        return this.zza.zzg();
    }

    public final int zzg() throws IOException {
        zzS(0);
        return this.zza.zzh();
    }

    public final int zzh() throws IOException {
        zzS(5);
        return this.zza.zzk();
    }

    public final int zzi() throws IOException {
        zzS(0);
        return this.zza.zzl();
    }

    public final int zzj() throws IOException {
        zzS(0);
        return this.zza.zzn();
    }

    public final long zzk() throws IOException {
        zzS(1);
        return this.zza.zzo();
    }

    public final long zzl() throws IOException {
        zzS(0);
        return this.zza.zzp();
    }

    public final long zzm() throws IOException {
        zzS(1);
        return this.zza.zzt();
    }

    public final long zzn() throws IOException {
        zzS(0);
        return this.zza.zzu();
    }

    public final long zzo() throws IOException {
        zzS(0);
        return this.zza.zzv();
    }

    public final zzez zzp() throws IOException {
        zzS(2);
        return this.zza.zzw();
    }

    public final String zzr() throws IOException {
        zzS(2);
        return this.zza.zzx();
    }

    public final String zzs() throws IOException {
        zzS(2);
        return this.zza.zzy();
    }

    public final void zzt(Object obj, zzil zzil, zzfz zzfz) throws IOException {
        zzS(3);
        zzP(obj, zzil, zzfz);
    }

    public final void zzu(Object obj, zzil zzil, zzfz zzfz) throws IOException {
        zzS(2);
        zzQ(obj, zzil, zzfz);
    }

    public final void zzv(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzeo) {
            zzeo zzeo = (zzeo) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzeo.zze(this.zza.zzD());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    zzeo.zze(this.zza.zzD());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgy.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                int zzd3 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzgy.zza();
            }
        }
    }

    public final void zzw(List list) throws IOException {
        int zzm;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        throw zzgy.zza();
    }

    public final void zzx(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzft) {
            zzft zzft = (zzft) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzft.zze(this.zza.zzb());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzft.zze(this.zza.zzb());
                } while (this.zza.zzd() < zzd2);
            } else {
                throw zzgy.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < zzd3);
            } else {
                throw zzgy.zza();
            }
        }
    }

    public final void zzy(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgp) {
            zzgp zzgp = (zzgp) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgp.zzg(this.zza.zzf());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else if (i10 == 2) {
                int zzd2 = this.zza.zzd() + this.zza.zzn();
                do {
                    zzgp.zzg(this.zza.zzf());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgy.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else if (i11 == 2) {
                int zzd3 = this.zza.zzd() + this.zza.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < zzd3);
                zzR(zzd3);
            } else {
                throw zzgy.zza();
            }
        }
    }

    public final void zzz(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgp) {
            zzgp zzgp = (zzgp) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzgp.zzg(this.zza.zzg());
                } while (this.zza.zzd() < zzd2);
            } else if (i10 == 5) {
                do {
                    zzgp.zzg(this.zza.zzg());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else {
                throw zzgy.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd3 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < zzd3);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                this.zzd = zzm;
            } else {
                throw zzgy.zza();
            }
        }
    }
}
