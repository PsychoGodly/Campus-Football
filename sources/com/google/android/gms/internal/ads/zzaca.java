package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaca implements zzzu {
    public static final zzaab zza = zzabz.zza;
    private final byte[] zzb;
    private final zzen zzc;
    private final zzaac zzd;
    private zzzx zze;
    private zzabb zzf;
    private int zzg;
    private zzbq zzh;
    private zzaah zzi;
    private int zzj;
    private int zzk;
    private zzaby zzl;
    private int zzm;
    private long zzn;

    public zzaca() {
        this(0);
    }

    private final long zze(zzen zzen, boolean z10) {
        boolean z11;
        Objects.requireNonNull(this.zzi);
        int zzc2 = zzen.zzc();
        while (zzc2 <= zzen.zzd() - 16) {
            zzen.zzF(zzc2);
            if (zzaad.zzc(zzen, this.zzi, this.zzk, this.zzd)) {
                zzen.zzF(zzc2);
                return this.zzd.zza;
            }
            zzc2++;
        }
        if (z10) {
            while (zzc2 <= zzen.zzd() - this.zzj) {
                zzen.zzF(zzc2);
                try {
                    z11 = zzaad.zzc(zzen, this.zzi, this.zzk, this.zzd);
                } catch (IndexOutOfBoundsException unused) {
                    z11 = false;
                }
                if (zzen.zzc() <= zzen.zzd() && z11) {
                    zzen.zzF(zzc2);
                    return this.zzd.zza;
                }
                zzc2++;
            }
            zzen.zzF(zzen.zzd());
            return -1;
        }
        zzen.zzF(zzc2);
        return -1;
    }

    private final void zzf() {
        zzaah zzaah = this.zzi;
        int i10 = zzew.zza;
        this.zzf.zzs((this.zzn * 1000000) / ((long) zzaah.zze), 1, this.zzm, 0, (zzaba) null);
    }

    public final int zza(zzzv zzzv, zzaau zzaau) throws IOException {
        boolean zzn2;
        zzaax zzaax;
        zzzv zzzv2 = zzzv;
        int i10 = this.zzg;
        boolean z10 = true;
        if (i10 == 0) {
            zzzv.zzj();
            long zze2 = zzzv.zze();
            zzbq zza2 = zzaae.zza(zzzv2, true);
            ((zzzk) zzzv2).zzo((int) (zzzv.zze() - zze2), false);
            this.zzh = zza2;
            this.zzg = 1;
            return 0;
        } else if (i10 == 1) {
            ((zzzk) zzzv2).zzm(this.zzb, 0, 42, false);
            zzzv.zzj();
            this.zzg = 2;
            return 0;
        } else if (i10 == 2) {
            zzen zzen = new zzen(4);
            ((zzzk) zzzv2).zzn(zzen.zzH(), 0, 4, false);
            if (zzen.zzs() == 1716281667) {
                this.zzg = 3;
                return 0;
            }
            throw zzbu.zza("Failed to read FLAC stream marker.", (Throwable) null);
        } else if (i10 == 3) {
            zzaah zzaah = this.zzi;
            do {
                zzzv.zzj();
                zzem zzem = new zzem(new byte[4], 4);
                zzzk zzzk = (zzzk) zzzv2;
                zzzk.zzm(zzem.zza, 0, 4, false);
                zzn2 = zzem.zzn();
                int zzd2 = zzem.zzd(7);
                int zzd3 = zzem.zzd(24) + 4;
                if (zzd2 == 0) {
                    byte[] bArr = new byte[38];
                    zzzk.zzn(bArr, 0, 38, false);
                    zzaah = new zzaah(bArr, 4);
                } else if (zzaah == null) {
                    throw new IllegalArgumentException();
                } else if (zzd2 == 3) {
                    zzen zzen2 = new zzen(zzd3);
                    zzzk.zzn(zzen2.zzH(), 0, zzd3, false);
                    zzaah = zzaah.zzf(zzaae.zzb(zzen2));
                } else if (zzd2 == 4) {
                    zzen zzen3 = new zzen(zzd3);
                    zzzk.zzn(zzen3.zzH(), 0, zzd3, false);
                    zzen3.zzG(4);
                    zzaah = zzaah.zzg(Arrays.asList(zzabh.zzc(zzen3, false, false).zzb));
                } else if (zzd2 == 6) {
                    zzen zzen4 = new zzen(zzd3);
                    zzzk.zzn(zzen4.zzH(), 0, zzd3, false);
                    zzen4.zzG(4);
                    zzaah = zzaah.zze(zzfqk.zzp(zzacu.zzb(zzen4)));
                } else {
                    zzzk.zzo(zzd3, false);
                }
                int i11 = zzew.zza;
                this.zzi = zzaah;
            } while (!zzn2);
            Objects.requireNonNull(zzaah);
            this.zzj = Math.max(zzaah.zzc, 6);
            this.zzf.zzk(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        } else if (i10 != 4) {
            Objects.requireNonNull(this.zzf);
            zzaah zzaah2 = this.zzi;
            Objects.requireNonNull(zzaah2);
            zzaby zzaby = this.zzl;
            if (zzaby != null && zzaby.zze()) {
                return zzaby.zza(zzzv2, zzaau);
            }
            if (this.zzn == -1) {
                this.zzn = zzaad.zzb(zzzv2, zzaah2);
                return 0;
            }
            zzen zzen5 = this.zzc;
            int zzd4 = zzen5.zzd();
            if (zzd4 < 32768) {
                int zza3 = zzzv2.zza(zzen5.zzH(), zzd4, 32768 - zzd4);
                if (zza3 != -1) {
                    z10 = false;
                }
                if (!z10) {
                    this.zzc.zzE(zzd4 + zza3);
                } else if (this.zzc.zza() == 0) {
                    zzf();
                    return -1;
                }
            } else {
                z10 = false;
            }
            zzen zzen6 = this.zzc;
            int zzc2 = zzen6.zzc();
            int i12 = this.zzm;
            int i13 = this.zzj;
            if (i12 < i13) {
                zzen6.zzG(Math.min(i13 - i12, zzen6.zza()));
            }
            long zze3 = zze(this.zzc, z10);
            zzen zzen7 = this.zzc;
            int zzc3 = zzen7.zzc() - zzc2;
            zzen7.zzF(zzc2);
            zzaaz.zzb(this.zzf, this.zzc, zzc3);
            this.zzm += zzc3;
            if (zze3 != -1) {
                zzf();
                this.zzm = 0;
                this.zzn = zze3;
            }
            zzen zzen8 = this.zzc;
            if (zzen8.zza() >= 16) {
                return 0;
            }
            int zza4 = zzen8.zza();
            System.arraycopy(zzen8.zzH(), zzen8.zzc(), zzen8.zzH(), 0, zza4);
            this.zzc.zzF(0);
            this.zzc.zzE(zza4);
            return 0;
        } else {
            zzzv.zzj();
            zzen zzen9 = new zzen(2);
            ((zzzk) zzzv2).zzm(zzen9.zzH(), 0, 2, false);
            int zzo = zzen9.zzo();
            if ((zzo >> 2) == 16382) {
                zzzv.zzj();
                this.zzk = zzo;
                zzzx zzzx = this.zze;
                int i14 = zzew.zza;
                long zzf2 = zzzv.zzf();
                long zzd5 = zzzv.zzd();
                zzaah zzaah3 = this.zzi;
                Objects.requireNonNull(zzaah3);
                if (zzaah3.zzk != null) {
                    zzaax = new zzaaf(zzaah3, zzf2);
                } else if (zzd5 == -1 || zzaah3.zzj <= 0) {
                    zzaax = new zzaaw(zzaah3.zza(), 0);
                } else {
                    zzaby zzaby2 = new zzaby(zzaah3, this.zzk, zzf2, zzd5);
                    this.zzl = zzaby2;
                    zzaax = zzaby2.zzb();
                }
                zzzx.zzN(zzaax);
                this.zzg = 5;
                return 0;
            }
            zzzv.zzj();
            throw zzbu.zza("First frame does not start with sync code.", (Throwable) null);
        }
    }

    public final void zzb(zzzx zzzx) {
        this.zze = zzzx;
        this.zzf = zzzx.zzv(0, 1);
        zzzx.zzC();
    }

    public final void zzc(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.zzg = 0;
        } else {
            zzaby zzaby = this.zzl;
            if (zzaby != null) {
                zzaby.zzd(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.zzn = j12;
        this.zzm = 0;
        this.zzc.zzC(0);
    }

    public final boolean zzd(zzzv zzzv) throws IOException {
        zzaae.zza(zzzv, false);
        zzen zzen = new zzen(4);
        ((zzzk) zzzv).zzm(zzen.zzH(), 0, 4, false);
        if (zzen.zzs() == 1716281667) {
            return true;
        }
        return false;
    }

    public zzaca(int i10) {
        this.zzb = new byte[42];
        this.zzc = new zzen(new byte[32768], 0);
        this.zzd = new zzaac();
        this.zzg = 0;
    }
}
