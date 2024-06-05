package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgpn implements zzgsh {
    private final zzgpm zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgpn(zzgpm zzgpm) {
        zzgqw.zzf(zzgpm, "input");
        this.zza = zzgpm;
        zzgpm.zzc = this;
    }

    private final void zzP(Object obj, zzgsp zzgsp, zzgpy zzgpy) throws IOException {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzgsp.zzh(obj, this, zzgpy);
            if (this.zzb != this.zzc) {
                throw zzgqy.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    private final void zzQ(Object obj, zzgsp zzgsp, zzgpy zzgpy) throws IOException {
        int zzn = this.zza.zzn();
        zzgpm zzgpm = this.zza;
        if (zzgpm.zza < zzgpm.zzb) {
            int zze = zzgpm.zze(zzn);
            this.zza.zza++;
            zzgsp.zzh(obj, this, zzgpy);
            this.zza.zzz(0);
            zzgpm zzgpm2 = this.zza;
            zzgpm2.zza--;
            zzgpm2.zzA(zze);
            return;
        }
        throw new zzgqy("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzR(int i10) throws IOException {
        if (this.zza.zzd() != i10) {
            throw zzgqy.zzj();
        }
    }

    private final void zzS(int i10) throws IOException {
        if ((this.zzb & 7) != i10) {
            throw zzgqy.zza();
        }
    }

    private static final void zzT(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw zzgqy.zzg();
        }
    }

    private static final void zzU(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw zzgqy.zzg();
        }
    }

    public static zzgpn zzq(zzgpm zzgpm) {
        zzgpn zzgpn = zzgpm.zzc;
        return zzgpn != null ? zzgpn : new zzgpn(zzgpm);
    }

    public final void zzA(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgrl) {
            zzgrl zzgrl = (zzgrl) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzgrl.zzg(this.zza.zzo());
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
                    zzgrl.zzg(this.zza.zzo());
                } while (this.zza.zzd() < zzd2);
            } else {
                throw zzgqy.zza();
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
                throw zzgqy.zza();
            }
        }
    }

    public final void zzB(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgqf) {
            zzgqf zzgqf = (zzgqf) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzgqf.zze(this.zza.zzc());
                } while (this.zza.zzd() < zzd2);
            } else if (i10 == 5) {
                do {
                    zzgqf.zze(this.zza.zzc());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else {
                throw zzgqy.zza();
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
                throw zzgqy.zza();
            }
        }
    }

    @Deprecated
    public final void zzC(List list, zzgsp zzgsp, zzgpy zzgpy) throws IOException {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) == 3) {
            do {
                Object zze = zzgsp.zze();
                zzP(zze, zzgsp, zzgpy);
                zzgsp.zzf(zze);
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
        throw zzgqy.zza();
    }

    public final void zzD(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgqn) {
            zzgqn zzgqn = (zzgqn) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgqn.zzh(this.zza.zzh());
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
                    zzgqn.zzh(this.zza.zzh());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgqy.zza();
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
                throw zzgqy.zza();
            }
        }
    }

    public final void zzE(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgrl) {
            zzgrl zzgrl = (zzgrl) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgrl.zzg(this.zza.zzp());
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
                    zzgrl.zzg(this.zza.zzp());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgqy.zza();
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
                throw zzgqy.zza();
            }
        }
    }

    public final void zzF(List list, zzgsp zzgsp, zzgpy zzgpy) throws IOException {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) == 2) {
            do {
                Object zze = zzgsp.zze();
                zzQ(zze, zzgsp, zzgpy);
                zzgsp.zzf(zze);
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
        throw zzgqy.zza();
    }

    public final void zzG(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgqn) {
            zzgqn zzgqn = (zzgqn) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzgqn.zzh(this.zza.zzk());
                } while (this.zza.zzd() < zzd2);
            } else if (i10 == 5) {
                do {
                    zzgqn.zzh(this.zza.zzk());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else {
                throw zzgqy.zza();
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
                throw zzgqy.zza();
            }
        }
    }

    public final void zzH(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgrl) {
            zzgrl zzgrl = (zzgrl) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzgrl.zzg(this.zza.zzt());
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
                    zzgrl.zzg(this.zza.zzt());
                } while (this.zza.zzd() < zzd2);
            } else {
                throw zzgqy.zza();
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
                throw zzgqy.zza();
            }
        }
    }

    public final void zzI(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgqn) {
            zzgqn zzgqn = (zzgqn) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgqn.zzh(this.zza.zzl());
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
                    zzgqn.zzh(this.zza.zzl());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgqy.zza();
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
                throw zzgqy.zza();
            }
        }
    }

    public final void zzJ(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgrl) {
            zzgrl zzgrl = (zzgrl) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgrl.zzg(this.zza.zzu());
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
                    zzgrl.zzg(this.zza.zzu());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgqy.zza();
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
                throw zzgqy.zza();
            }
        }
    }

    public final void zzK(List list, boolean z10) throws IOException {
        int zzm;
        int zzm2;
        if ((this.zzb & 7) != 2) {
            throw zzgqy.zza();
        } else if ((list instanceof zzgre) && !z10) {
            zzgre zzgre = (zzgre) list;
            do {
                zzgre.zzi(zzp());
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
        if (list instanceof zzgqn) {
            zzgqn zzgqn = (zzgqn) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgqn.zzh(this.zza.zzn());
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
                    zzgqn.zzh(this.zza.zzn());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgqy.zza();
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
                throw zzgqy.zza();
            }
        }
    }

    public final void zzM(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgrl) {
            zzgrl zzgrl = (zzgrl) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgrl.zzg(this.zza.zzv());
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
                    zzgrl.zzg(this.zza.zzv());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgqy.zza();
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
                throw zzgqy.zza();
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

    public final zzgpe zzp() throws IOException {
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

    public final void zzt(Object obj, zzgsp zzgsp, zzgpy zzgpy) throws IOException {
        zzS(3);
        zzP(obj, zzgsp, zzgpy);
    }

    public final void zzu(Object obj, zzgsp zzgsp, zzgpy zzgpy) throws IOException {
        zzS(2);
        zzQ(obj, zzgsp, zzgpy);
    }

    public final void zzv(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgos) {
            zzgos zzgos = (zzgos) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgos.zze(this.zza.zzD());
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
                    zzgos.zze(this.zza.zzD());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgqy.zza();
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
                throw zzgqy.zza();
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
        throw zzgqy.zza();
    }

    public final void zzx(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgpv) {
            zzgpv zzgpv = (zzgpv) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzgpv.zze(this.zza.zzb());
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
                    zzgpv.zze(this.zza.zzb());
                } while (this.zza.zzd() < zzd2);
            } else {
                throw zzgqy.zza();
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
                throw zzgqy.zza();
            }
        }
    }

    public final void zzy(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgqn) {
            zzgqn zzgqn = (zzgqn) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzgqn.zzh(this.zza.zzf());
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
                    zzgqn.zzh(this.zza.zzf());
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
            } else {
                throw zzgqy.zza();
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
                throw zzgqy.zza();
            }
        }
    }

    public final void zzz(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzgqn) {
            zzgqn zzgqn = (zzgqn) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd2 = this.zza.zzd() + zzn;
                do {
                    zzgqn.zzh(this.zza.zzg());
                } while (this.zza.zzd() < zzd2);
            } else if (i10 == 5) {
                do {
                    zzgqn.zzh(this.zza.zzg());
                    if (!this.zza.zzC()) {
                        zzm2 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
            } else {
                throw zzgqy.zza();
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
                throw zzgqy.zza();
            }
        }
    }
}
