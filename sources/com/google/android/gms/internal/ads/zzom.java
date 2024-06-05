package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzom {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private final zzol zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zzok zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzom(zzol zzol) {
        this.zza = zzol;
        int i10 = zzew.zza;
        try {
            this.zzn = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
    }

    private final long zzl(long j10) {
        return (j10 * 1000000) / ((long) this.zzg);
    }

    private final long zzm() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        if (this.zzx != -9223372036854775807L) {
            return Math.min(this.zzA, this.zzz + ((((SystemClock.elapsedRealtime() * 1000) - this.zzx) * ((long) this.zzg)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        long j10 = 0;
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.zzh) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.zzu = this.zzs;
                }
                playState = 2;
            }
            playbackHeadPosition += this.zzu;
        }
        if (zzew.zza <= 29) {
            if (playbackHeadPosition != 0) {
                j10 = playbackHeadPosition;
            } else if (this.zzs > 0 && playState == 3) {
                if (this.zzy == -9223372036854775807L) {
                    this.zzy = SystemClock.elapsedRealtime();
                }
                return this.zzs;
            }
            this.zzy = -9223372036854775807L;
            playbackHeadPosition = j10;
        }
        if (this.zzs > playbackHeadPosition) {
            this.zzt++;
        }
        this.zzs = playbackHeadPosition;
        return playbackHeadPosition + (this.zzt << 32);
    }

    private final void zzn() {
        this.zzl = 0;
        this.zzw = 0;
        this.zzv = 0;
        this.zzm = 0;
        this.zzC = 0;
        this.zzF = 0;
        this.zzk = false;
    }

    public final int zza(long j10) {
        return this.zze - ((int) (j10 - (zzm() * ((long) this.zzd))));
    }

    public final long zzb(boolean z10) {
        long j10;
        Method method;
        zzom zzom = this;
        AudioTrack audioTrack = zzom.zzc;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long zzl2 = zzom.zzl(zzm());
            if (zzl2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - zzom.zzm >= 30000) {
                    long[] jArr = zzom.zzb;
                    int i10 = zzom.zzv;
                    jArr[i10] = zzl2 - nanoTime;
                    zzom.zzv = (i10 + 1) % 10;
                    int i11 = zzom.zzw;
                    if (i11 < 10) {
                        zzom.zzw = i11 + 1;
                    }
                    zzom.zzm = nanoTime;
                    zzom.zzl = 0;
                    int i12 = 0;
                    while (true) {
                        int i13 = zzom.zzw;
                        if (i12 >= i13) {
                            break;
                        }
                        zzom.zzl += zzom.zzb[i12] / ((long) i13);
                        i12++;
                    }
                }
                if (!zzom.zzh) {
                    zzok zzok = zzom.zzf;
                    Objects.requireNonNull(zzok);
                    if (zzok.zzg(nanoTime)) {
                        long zzb2 = zzok.zzb();
                        long zza2 = zzok.zza();
                        if (Math.abs(zzb2 - nanoTime) > 5000000) {
                            zzpa zzpa = (zzpa) zzom.zza;
                            zzee.zze("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + zza2 + ", " + zzb2 + ", " + nanoTime + ", " + zzl2 + ", " + zzpa.zza.zzF() + ", " + zzpa.zza.zzG());
                            zzok.zzd();
                        } else {
                            zzok zzok2 = zzok;
                            if (Math.abs(zzom.zzl(zza2) - zzl2) > 5000000) {
                                zzpa zzpa2 = (zzpa) zzom.zza;
                                zzee.zze("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + zza2 + ", " + zzb2 + ", " + nanoTime + ", " + zzl2 + ", " + zzpa2.zza.zzF() + ", " + zzpa2.zza.zzG());
                                zzok2.zzd();
                            } else {
                                zzok2.zzc();
                            }
                        }
                        zzom = this;
                    }
                    if (zzom.zzq && (method = zzom.zzn) != null && nanoTime - zzom.zzr >= 500000) {
                        try {
                            AudioTrack audioTrack2 = zzom.zzc;
                            Objects.requireNonNull(audioTrack2);
                            int i14 = zzew.zza;
                            long intValue = (long) ((Integer) method.invoke(audioTrack2, new Object[0])).intValue();
                            long j11 = zzom.zzi;
                            Long.signum(intValue);
                            long j12 = (intValue * 1000) - j11;
                            zzom.zzo = j12;
                            long max = Math.max(j12, 0);
                            zzom.zzo = max;
                            if (max > 5000000) {
                                zzee.zze("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                                zzom.zzo = 0;
                            }
                        } catch (Exception unused) {
                            zzom.zzn = null;
                        }
                        zzom.zzr = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zzok zzok3 = zzom.zzf;
        Objects.requireNonNull(zzok3);
        boolean zzf2 = zzok3.zzf();
        if (zzf2) {
            j10 = zzom.zzl(zzok3.zza()) + zzew.zzs(nanoTime2 - zzok3.zzb(), zzom.zzj);
        } else {
            if (zzom.zzw == 0) {
                j10 = zzom.zzl(zzm());
            } else {
                j10 = zzom.zzl + nanoTime2;
            }
            if (!z10) {
                j10 = Math.max(0, j10 - zzom.zzo);
            }
        }
        if (zzom.zzD != zzf2) {
            zzom.zzF = zzom.zzC;
            zzom.zzE = zzom.zzB;
        }
        long j13 = nanoTime2 - zzom.zzF;
        if (j13 < 1000000) {
            long j14 = (j13 * 1000) / 1000000;
            j10 = ((j10 * j14) + ((1000 - j14) * (zzom.zzE + zzew.zzs(j13, zzom.zzj)))) / 1000;
        }
        if (!zzom.zzk) {
            long j15 = zzom.zzB;
            if (j10 > j15) {
                zzom.zzk = true;
                int i15 = zzew.zza;
                long currentTimeMillis = System.currentTimeMillis() - zzew.zzz(zzew.zzu(zzew.zzz(j10 - j15), zzom.zzj));
                zzpf zzpf = ((zzpa) zzom.zza).zza;
                if (zzpf.zzq != null) {
                    ((zzpk) zzpf.zzq).zza.zzc.zzr(currentTimeMillis);
                }
            }
        }
        zzom.zzC = nanoTime2;
        zzom.zzB = j10;
        zzom.zzD = zzf2;
        return j10;
    }

    public final void zzc(long j10) {
        this.zzz = zzm();
        this.zzx = SystemClock.elapsedRealtime() * 1000;
        this.zzA = j10;
    }

    public final void zzd() {
        zzn();
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(android.media.AudioTrack r4, boolean r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            r3.zzc = r4
            r3.zzd = r7
            r3.zze = r8
            com.google.android.gms.internal.ads.zzok r0 = new com.google.android.gms.internal.ads.zzok
            r0.<init>(r4)
            r3.zzf = r0
            int r4 = r4.getSampleRate()
            r3.zzg = r4
            r4 = 6
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0025
            int r5 = com.google.android.gms.internal.ads.zzew.zza
            r2 = 23
            if (r5 >= r2) goto L_0x0025
            r5 = 5
            if (r6 == r5) goto L_0x0026
            if (r6 != r4) goto L_0x0025
            r6 = 6
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r3.zzh = r0
            boolean r4 = com.google.android.gms.internal.ads.zzew.zzW(r6)
            r3.zzq = r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x003c
            int r8 = r8 / r7
            long r7 = (long) r8
            long r7 = r3.zzl(r7)
            goto L_0x003d
        L_0x003c:
            r7 = r5
        L_0x003d:
            r3.zzi = r7
            r7 = 0
            r3.zzs = r7
            r3.zzt = r7
            r3.zzu = r7
            r3.zzp = r1
            r3.zzx = r5
            r3.zzy = r5
            r3.zzr = r7
            r3.zzo = r7
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.zzj = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzom.zze(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void zzf() {
        zzok zzok = this.zzf;
        Objects.requireNonNull(zzok);
        zzok.zze();
    }

    public final boolean zzg(long j10) {
        if (j10 > zzm()) {
            return true;
        }
        if (!this.zzh) {
            return false;
        }
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 2 && zzm() == 0;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j10) {
        return this.zzy != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final boolean zzj(long j10) {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            } else if (playState == 1) {
                if (zzm() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z10 = this.zzp;
        boolean zzg2 = zzg(j10);
        this.zzp = zzg2;
        if (z10 && !zzg2 && playState != 1) {
            zzol zzol = this.zza;
            int i10 = this.zze;
            long zzz2 = zzew.zzz(this.zzi);
            zzpa zzpa = (zzpa) zzol;
            if (zzpa.zza.zzq != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzpf zzpf = zzpa.zza;
                ((zzpk) zzpf.zzq).zza.zzc.zzt(i10, zzz2, elapsedRealtime - zzpf.zzU);
            }
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx != -9223372036854775807L) {
            return false;
        }
        zzok zzok = this.zzf;
        Objects.requireNonNull(zzok);
        zzok.zze();
        return true;
    }
}
