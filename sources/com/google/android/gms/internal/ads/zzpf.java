package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzpf implements zzoi {
    private static final Object zza = new Object();
    private static ExecutorService zzb;
    private static int zzc;
    private long zzA;
    private long zzB;
    private long zzC;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private long zzG;
    private float zzH;
    private ByteBuffer zzI;
    private int zzJ;
    private ByteBuffer zzK;
    private byte[] zzL;
    private int zzM;
    private boolean zzN;
    private boolean zzO;
    /* access modifiers changed from: private */
    public boolean zzP;
    private boolean zzQ;
    private int zzR;
    private zzl zzS;
    private zzor zzT;
    /* access modifiers changed from: private */
    public long zzU;
    private boolean zzV;
    private boolean zzW;
    private final zzov zzX;
    private final zznq zzd;
    private final zzon zze;
    private final zzpo zzf;
    private final zzfqk zzg;
    private final zzfqk zzh;
    private final zzdo zzi;
    private final zzom zzj = new zzom(new zzpa(this, (zzoz) null));
    private final ArrayDeque zzk;
    private zzpd zzl;
    private final zzoy zzm;
    private final zzoy zzn;
    private final zzos zzo;
    private zzno zzp;
    /* access modifiers changed from: private */
    public zzof zzq;
    private zzou zzr;
    private zzou zzs;
    private zzdb zzt;
    /* access modifiers changed from: private */
    public AudioTrack zzu;
    private zzk zzv;
    private zzox zzw;
    private zzox zzx;
    private final zzby zzy;
    private long zzz;

    /* synthetic */ zzpf(zzot zzot, zzpe zzpe) {
        this.zzd = zzot.zzb;
        this.zzX = zzot.zzc;
        int i10 = zzew.zza;
        this.zzo = zzot.zza;
        zzdo zzdo = new zzdo(zzdm.zza);
        this.zzi = zzdo;
        zzdo.zze();
        zzon zzon = new zzon();
        this.zze = zzon;
        zzpo zzpo = new zzpo();
        this.zzf = zzpo;
        this.zzg = zzfqk.zzr(new zzdi(), zzon, zzpo);
        this.zzh = zzfqk.zzp(new zzpn());
        this.zzH = 1.0f;
        this.zzv = zzk.zza;
        this.zzR = 0;
        this.zzS = new zzl(0, 0.0f);
        zzby zzby = zzby.zza;
        this.zzx = new zzox(zzby, false, 0, 0, (zzow) null);
        this.zzy = zzby;
        this.zzk = new ArrayDeque();
        this.zzm = new zzoy(100);
        this.zzn = new zzoy(100);
    }

    static /* synthetic */ void zzD(AudioTrack audioTrack, zzdo zzdo) {
        try {
            audioTrack.flush();
            audioTrack.release();
            zzdo.zze();
            synchronized (zza) {
                int i10 = zzc - 1;
                zzc = i10;
                if (i10 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            zzdo.zze();
            synchronized (zza) {
                int i11 = zzc - 1;
                zzc = i11;
                if (i11 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    public final long zzF() {
        zzou zzou = this.zzs;
        return zzou.zzc == 0 ? this.zzz / ((long) zzou.zzb) : this.zzA;
    }

    /* access modifiers changed from: private */
    public final long zzG() {
        zzou zzou = this.zzs;
        return zzou.zzc == 0 ? this.zzB / ((long) zzou.zzd) : this.zzC;
    }

    private final AudioTrack zzH(zzou zzou) throws zzoe {
        try {
            return zzou.zzb(false, this.zzv, this.zzR);
        } catch (zzoe e10) {
            zzof zzof = this.zzq;
            if (zzof != null) {
                zzof.zza(e10);
            }
            throw e10;
        }
    }

    private final zzox zzI() {
        zzox zzox = this.zzw;
        if (zzox != null) {
            return zzox;
        }
        return !this.zzk.isEmpty() ? (zzox) this.zzk.getLast() : this.zzx;
    }

    private final void zzJ(long j10) {
        zzby zzby;
        boolean z10;
        if (zzT()) {
            zzov zzov = this.zzX;
            zzby = zzI().zza;
            zzov.zzc(zzby);
        } else {
            zzby = zzby.zza;
        }
        zzby zzby2 = zzby;
        if (zzT()) {
            zzov zzov2 = this.zzX;
            z10 = zzI().zzb;
            zzov2.zzd(z10);
        } else {
            z10 = false;
        }
        this.zzk.add(new zzox(zzby2, z10, Math.max(0, j10), this.zzs.zza(zzG()), (zzow) null));
        zzO();
        zzof zzof = this.zzq;
        if (zzof != null) {
            ((zzpk) zzof).zza.zzc.zzs(z10);
        }
    }

    private final void zzK() {
        if (!this.zzO) {
            this.zzO = true;
            this.zzj.zzc(zzG());
            this.zzu.stop();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r0 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0.hasRemaining() != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r2.zzt.zze(r2.zzI);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        r0 = r2.zzI;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzL(long r3) throws com.google.android.gms.internal.ads.zzoh {
        /*
            r2 = this;
            com.google.android.gms.internal.ads.zzdb r0 = r2.zzt
            boolean r0 = r0.zzh()
            if (r0 == 0) goto L_0x003a
        L_0x0008:
            com.google.android.gms.internal.ads.zzdb r0 = r2.zzt
            boolean r0 = r0.zzg()
            if (r0 != 0) goto L_0x0039
        L_0x0010:
            com.google.android.gms.internal.ads.zzdb r0 = r2.zzt
            java.nio.ByteBuffer r0 = r0.zzb()
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L_0x0026
            r2.zzP(r0, r3)
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L_0x0010
            return
        L_0x0026:
            java.nio.ByteBuffer r0 = r2.zzI
            if (r0 == 0) goto L_0x0039
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x0031
            goto L_0x0039
        L_0x0031:
            com.google.android.gms.internal.ads.zzdb r0 = r2.zzt
            java.nio.ByteBuffer r1 = r2.zzI
            r0.zze(r1)
            goto L_0x0008
        L_0x0039:
            return
        L_0x003a:
            java.nio.ByteBuffer r0 = r2.zzI
            if (r0 != 0) goto L_0x0040
            java.nio.ByteBuffer r0 = com.google.android.gms.internal.ads.zzde.zza
        L_0x0040:
            r2.zzP(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpf.zzL(long):void");
    }

    private final void zzM(zzby zzby, boolean z10) {
        zzox zzI2 = zzI();
        if (!zzby.equals(zzI2.zza) || z10 != zzI2.zzb) {
            zzox zzox = new zzox(zzby, z10, -9223372036854775807L, -9223372036854775807L, (zzow) null);
            if (zzR()) {
                this.zzw = zzox;
            } else {
                this.zzx = zzox;
            }
        }
    }

    private final void zzN() {
        if (zzR()) {
            if (zzew.zza >= 21) {
                this.zzu.setVolume(this.zzH);
                return;
            }
            AudioTrack audioTrack = this.zzu;
            float f10 = this.zzH;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    private final void zzO() {
        zzdb zzdb = this.zzs.zzi;
        this.zzt = zzdb;
        zzdb.zzc();
    }

    private final void zzP(ByteBuffer byteBuffer, long j10) throws zzoh {
        int i10;
        zzof zzof;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzK;
            boolean z10 = true;
            if (byteBuffer2 != null) {
                zzdl.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzK = byteBuffer;
                if (zzew.zza < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.zzL;
                    if (bArr == null || bArr.length < remaining) {
                        this.zzL = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.zzL, 0, remaining);
                    byteBuffer.position(position);
                    this.zzM = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i11 = zzew.zza;
            if (i11 < 21) {
                int zza2 = this.zzj.zza(this.zzB);
                if (zza2 > 0) {
                    i10 = this.zzu.write(this.zzL, this.zzM, Math.min(remaining2, zza2));
                    if (i10 > 0) {
                        this.zzM += i10;
                        byteBuffer.position(byteBuffer.position() + i10);
                    }
                } else {
                    i10 = 0;
                }
            } else {
                i10 = this.zzu.write(byteBuffer, remaining2, 1);
            }
            this.zzU = SystemClock.elapsedRealtime();
            if (i10 < 0) {
                if (((i11 < 24 || i10 != -6) && i10 != -32) || this.zzC <= 0) {
                    z10 = false;
                }
                zzoh zzoh = new zzoh(i10, this.zzs.zza, z10);
                zzof zzof2 = this.zzq;
                if (zzof2 != null) {
                    zzof2.zza(zzoh);
                }
                if (!zzoh.zzb) {
                    this.zzn.zzb(zzoh);
                    return;
                }
                throw zzoh;
            }
            this.zzn.zza();
            if (zzS(this.zzu)) {
                if (this.zzC > 0) {
                    this.zzW = false;
                }
                if (this.zzP && (zzof = this.zzq) != null && i10 < remaining2 && !this.zzW) {
                    zzpl zzpl = ((zzpk) zzof).zza;
                    if (zzpl.zzl != null) {
                        zzpl.zzl.zza();
                    }
                }
            }
            int i12 = this.zzs.zzc;
            if (i12 == 0) {
                this.zzB += (long) i10;
            }
            if (i10 == remaining2) {
                if (i12 != 0) {
                    if (byteBuffer != this.zzI) {
                        z10 = false;
                    }
                    zzdl.zzf(z10);
                    this.zzC += ((long) this.zzD) * ((long) this.zzJ);
                }
                this.zzK = null;
            }
        }
    }

    private final boolean zzQ() throws zzoh {
        if (!this.zzt.zzh()) {
            ByteBuffer byteBuffer = this.zzK;
            if (byteBuffer == null) {
                return true;
            }
            zzP(byteBuffer, Long.MIN_VALUE);
            return this.zzK == null;
        }
        this.zzt.zzd();
        zzL(Long.MIN_VALUE);
        if (!this.zzt.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.zzK;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    private final boolean zzR() {
        return this.zzu != null;
    }

    private static boolean zzS(AudioTrack audioTrack) {
        return zzew.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzT() {
        if (!"audio/raw".equals(this.zzs.zza.zzm)) {
            return false;
        }
        int i10 = this.zzs.zza.zzB;
        return true;
    }

    public final int zza(zzaf zzaf) {
        if (!"audio/raw".equals(zzaf.zzm)) {
            if (!this.zzV) {
                int i10 = zzew.zza;
            }
            return this.zzd.zza(zzaf) != null ? 2 : 0;
        } else if (!zzew.zzW(zzaf.zzB)) {
            int i11 = zzaf.zzB;
            zzee.zze("DefaultAudioSink", "Invalid PCM encoding: " + i11);
            return 0;
        } else if (zzaf.zzB != 2) {
            return 1;
        } else {
            return 2;
        }
    }

    public final long zzb(boolean z10) {
        long j10;
        if (!zzR() || this.zzF) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzj.zzb(z10), this.zzs.zza(zzG()));
        while (!this.zzk.isEmpty() && min >= ((zzox) this.zzk.getFirst()).zzd) {
            this.zzx = (zzox) this.zzk.remove();
        }
        zzox zzox = this.zzx;
        long j11 = min - zzox.zzd;
        if (zzox.zza.equals(zzby.zza)) {
            j10 = this.zzx.zzc + j11;
        } else if (this.zzk.isEmpty()) {
            j10 = this.zzX.zza(j11) + this.zzx.zzc;
        } else {
            zzox zzox2 = (zzox) this.zzk.getFirst();
            j10 = zzox2.zzc - zzew.zzs(zzox2.zzd - min, this.zzx.zza.zzc);
        }
        return j10 + this.zzs.zza(this.zzX.zzb());
    }

    public final zzby zzc() {
        return zzI().zza;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(com.google.android.gms.internal.ads.zzaf r19, int r20, int[] r21) throws com.google.android.gms.internal.ads.zzod {
        /*
            r18 = this;
            r1 = r18
            r3 = r19
            java.lang.String r0 = r3.zzm
            java.lang.String r2 = "audio/raw"
            boolean r0 = r2.equals(r0)
            r2 = 8
            r5 = -1
            if (r0 == 0) goto L_0x0098
            int r0 = r3.zzB
            boolean r0 = com.google.android.gms.internal.ads.zzew.zzW(r0)
            com.google.android.gms.internal.ads.zzdl.zzd(r0)
            int r0 = r3.zzB
            int r6 = r3.zzz
            int r0 = com.google.android.gms.internal.ads.zzew.zzo(r0, r6)
            com.google.android.gms.internal.ads.zzfqh r6 = new com.google.android.gms.internal.ads.zzfqh
            r6.<init>()
            com.google.android.gms.internal.ads.zzfqk r7 = r1.zzg
            r6.zzh(r7)
            com.google.android.gms.internal.ads.zzov r7 = r1.zzX
            com.google.android.gms.internal.ads.zzde[] r7 = r7.zze()
            r6.zzg(r7)
            com.google.android.gms.internal.ads.zzdb r7 = new com.google.android.gms.internal.ads.zzdb
            com.google.android.gms.internal.ads.zzfqk r6 = r6.zzi()
            r7.<init>(r6)
            com.google.android.gms.internal.ads.zzdb r6 = r1.zzt
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0048
            com.google.android.gms.internal.ads.zzdb r7 = r1.zzt
        L_0x0048:
            com.google.android.gms.internal.ads.zzpo r6 = r1.zzf
            int r8 = r3.zzC
            int r9 = r3.zzD
            r6.zzq(r8, r9)
            int r6 = com.google.android.gms.internal.ads.zzew.zza
            r8 = 21
            if (r6 >= r8) goto L_0x0068
            int r6 = r3.zzz
            if (r6 != r2) goto L_0x0068
            if (r21 != 0) goto L_0x0068
            r6 = 6
            int[] r8 = new int[r6]
            r9 = 0
        L_0x0061:
            if (r9 >= r6) goto L_0x006a
            r8[r9] = r9
            int r9 = r9 + 1
            goto L_0x0061
        L_0x0068:
            r8 = r21
        L_0x006a:
            com.google.android.gms.internal.ads.zzon r6 = r1.zze
            r6.zzo(r8)
            com.google.android.gms.internal.ads.zzdc r6 = new com.google.android.gms.internal.ads.zzdc
            int r8 = r3.zzA
            int r9 = r3.zzz
            int r10 = r3.zzB
            r6.<init>(r8, r9, r10)
            com.google.android.gms.internal.ads.zzdc r6 = r7.zza(r6)     // Catch:{ zzdd -> 0x0090 }
            int r8 = r6.zzd
            int r9 = r6.zzb
            int r6 = r6.zzc
            int r10 = com.google.android.gms.internal.ads.zzew.zzj(r6)
            int r6 = com.google.android.gms.internal.ads.zzew.zzo(r8, r6)
            r11 = r7
            r7 = r9
            r9 = 0
            goto L_0x00c3
        L_0x0090:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.zzod r0 = new com.google.android.gms.internal.ads.zzod
            r0.<init>((java.lang.Throwable) r2, (com.google.android.gms.internal.ads.zzaf) r3)
            throw r0
        L_0x0098:
            com.google.android.gms.internal.ads.zzdb r0 = new com.google.android.gms.internal.ads.zzdb
            com.google.android.gms.internal.ads.zzfqk r6 = com.google.android.gms.internal.ads.zzfqk.zzo()
            r0.<init>(r6)
            int r6 = r3.zzA
            int r7 = com.google.android.gms.internal.ads.zzew.zza
            com.google.android.gms.internal.ads.zznq r7 = r1.zzd
            android.util.Pair r7 = r7.zza(r3)
            if (r7 == 0) goto L_0x01a0
            java.lang.Object r8 = r7.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r7 = r7.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r9 = 2
            r11 = r0
            r10 = r7
            r0 = -1
            r7 = r6
            r6 = -1
        L_0x00c3:
            java.lang.String r12 = ") for: "
            if (r8 == 0) goto L_0x017f
            if (r10 == 0) goto L_0x015e
            int r12 = android.media.AudioTrack.getMinBufferSize(r7, r10, r8)
            r13 = -2
            r14 = 1
            if (r12 == r13) goto L_0x00d3
            r13 = 1
            goto L_0x00d4
        L_0x00d3:
            r13 = 0
        L_0x00d4:
            com.google.android.gms.internal.ads.zzdl.zzf(r13)
            if (r6 == r5) goto L_0x00db
            r13 = r6
            goto L_0x00dc
        L_0x00db:
            r13 = 1
        L_0x00dc:
            int r15 = r3.zzi
            r4 = 250000(0x3d090, float:3.50325E-40)
            if (r9 == 0) goto L_0x0120
            r16 = 1000000(0xf4240, double:4.940656E-318)
            if (r9 == r14) goto L_0x010d
            r14 = 5
            if (r8 != r14) goto L_0x00f0
            r4 = 500000(0x7a120, float:7.00649E-40)
            r8 = 5
            goto L_0x00f1
        L_0x00f0:
            r14 = r8
        L_0x00f1:
            if (r15 == r5) goto L_0x00fa
            java.math.RoundingMode r8 = java.math.RoundingMode.CEILING
            int r2 = com.google.android.gms.internal.ads.zzfsp.zza(r15, r2, r8)
            goto L_0x00fe
        L_0x00fa:
            int r2 = com.google.android.gms.internal.ads.zzph.zzb(r8)
        L_0x00fe:
            r21 = r6
            long r5 = (long) r4
            r4 = r14
            long r14 = (long) r2
            long r5 = r5 * r14
            long r5 = r5 / r16
            int r2 = com.google.android.gms.internal.ads.zzfsr.zza(r5)
            r14 = r4
            goto L_0x0134
        L_0x010d:
            r21 = r6
            int r2 = com.google.android.gms.internal.ads.zzph.zzb(r8)
            long r4 = (long) r2
            r14 = 50000000(0x2faf080, double:2.47032823E-316)
            long r4 = r4 * r14
            long r4 = r4 / r16
            int r2 = com.google.android.gms.internal.ads.zzfsr.zza(r4)
            goto L_0x0133
        L_0x0120:
            r21 = r6
            int r2 = r12 * 4
            int r4 = com.google.android.gms.internal.ads.zzph.zza(r4, r7, r13)
            r5 = 750000(0xb71b0, float:1.050974E-39)
            int r5 = com.google.android.gms.internal.ads.zzph.zza(r5, r7, r13)
            int r2 = com.google.android.gms.internal.ads.zzew.zzf(r2, r4, r5)
        L_0x0133:
            r14 = r8
        L_0x0134:
            double r4 = (double) r2
            int r2 = (int) r4
            int r2 = java.lang.Math.max(r12, r2)
            int r2 = r2 + r13
            r4 = -1
            int r2 = r2 + r4
            int r2 = r2 / r13
            int r12 = r2 * r13
            r2 = 0
            r1.zzV = r2
            com.google.android.gms.internal.ads.zzou r13 = new com.google.android.gms.internal.ads.zzou
            r2 = r13
            r3 = r19
            r4 = r0
            r5 = r9
            r6 = r21
            r8 = r10
            r9 = r14
            r10 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r18.zzR()
            if (r0 == 0) goto L_0x015b
            r1.zzr = r13
            return
        L_0x015b:
            r1.zzs = r13
            return
        L_0x015e:
            com.google.android.gms.internal.ads.zzod r0 = new com.google.android.gms.internal.ads.zzod
            java.lang.String r2 = java.lang.String.valueOf(r19)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Invalid output channel config (mode="
            r4.append(r5)
            r4.append(r9)
            r4.append(r12)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.<init>((java.lang.String) r2, (com.google.android.gms.internal.ads.zzaf) r3)
            throw r0
        L_0x017f:
            com.google.android.gms.internal.ads.zzod r0 = new com.google.android.gms.internal.ads.zzod
            java.lang.String r2 = java.lang.String.valueOf(r19)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Invalid output encoding (mode="
            r4.append(r5)
            r4.append(r9)
            r4.append(r12)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.<init>((java.lang.String) r2, (com.google.android.gms.internal.ads.zzaf) r3)
            throw r0
        L_0x01a0:
            com.google.android.gms.internal.ads.zzod r0 = new com.google.android.gms.internal.ads.zzod
            java.lang.String r2 = java.lang.String.valueOf(r19)
            java.lang.String r4 = "Unable to configure passthrough for: "
            java.lang.String r2 = r4.concat(r2)
            r0.<init>((java.lang.String) r2, (com.google.android.gms.internal.ads.zzaf) r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpf.zzd(com.google.android.gms.internal.ads.zzaf, int, int[]):void");
    }

    public final void zze() {
        if (zzR()) {
            this.zzz = 0;
            this.zzA = 0;
            this.zzB = 0;
            this.zzC = 0;
            this.zzW = false;
            this.zzD = 0;
            this.zzx = new zzox(zzI().zza, zzI().zzb, 0, 0, (zzow) null);
            this.zzG = 0;
            this.zzw = null;
            this.zzk.clear();
            this.zzI = null;
            this.zzJ = 0;
            this.zzK = null;
            this.zzO = false;
            this.zzN = false;
            this.zzf.zzp();
            zzO();
            if (this.zzj.zzh()) {
                this.zzu.pause();
            }
            if (zzS(this.zzu)) {
                zzpd zzpd = this.zzl;
                Objects.requireNonNull(zzpd);
                zzpd.zzb(this.zzu);
            }
            if (zzew.zza < 21 && !this.zzQ) {
                this.zzR = 0;
            }
            zzou zzou = this.zzr;
            if (zzou != null) {
                this.zzs = zzou;
                this.zzr = null;
            }
            this.zzj.zzd();
            AudioTrack audioTrack = this.zzu;
            zzdo zzdo = this.zzi;
            zzdo.zzc();
            synchronized (zza) {
                if (zzb == null) {
                    zzb = zzew.zzR("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.execute(new zzoo(audioTrack, zzdo));
            }
            this.zzu = null;
        }
        this.zzn.zza();
        this.zzm.zza();
    }

    public final void zzf() {
        this.zzE = true;
    }

    public final void zzg() {
        this.zzP = false;
        if (zzR() && this.zzj.zzk()) {
            this.zzu.pause();
        }
    }

    public final void zzh() {
        this.zzP = true;
        if (zzR()) {
            this.zzj.zzf();
            this.zzu.play();
        }
    }

    public final void zzi() throws zzoh {
        if (!this.zzN && zzR() && zzQ()) {
            zzK();
            this.zzN = true;
        }
    }

    public final void zzj() {
        zze();
        zzfqk zzfqk = this.zzg;
        int size = zzfqk.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzde) zzfqk.get(i10)).zzf();
        }
        zzfqk zzfqk2 = this.zzh;
        int size2 = zzfqk2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((zzde) zzfqk2.get(i11)).zzf();
        }
        zzdb zzdb = this.zzt;
        if (zzdb != null) {
            zzdb.zzf();
        }
        this.zzP = false;
        this.zzV = false;
    }

    public final void zzk(zzk zzk2) {
        if (!this.zzv.equals(zzk2)) {
            this.zzv = zzk2;
            zze();
        }
    }

    public final void zzl(int i10) {
        if (this.zzR != i10) {
            this.zzR = i10;
            this.zzQ = i10 != 0;
            zze();
        }
    }

    public final void zzm(zzl zzl2) {
        if (!this.zzS.equals(zzl2)) {
            int i10 = zzl2.zza;
            if (this.zzu != null) {
                int i11 = this.zzS.zza;
            }
            this.zzS = zzl2;
        }
    }

    public final void zzn(zzof zzof) {
        this.zzq = zzof;
    }

    public final void zzo(zzby zzby) {
        zzM(new zzby(zzew.zza(zzby.zzc, 0.1f, 8.0f), zzew.zza(zzby.zzd, 0.1f, 8.0f)), zzI().zzb);
    }

    public final void zzp(zzno zzno) {
        this.zzp = zzno;
    }

    public final void zzq(AudioDeviceInfo audioDeviceInfo) {
        zzor zzor;
        if (audioDeviceInfo == null) {
            zzor = null;
        } else {
            zzor = new zzor(audioDeviceInfo);
        }
        this.zzT = zzor;
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzop.zza(audioTrack, zzor);
        }
    }

    public final void zzr(boolean z10) {
        zzM(zzI().zza, z10);
    }

    public final void zzs(float f10) {
        if (this.zzH != f10) {
            this.zzH = f10;
            zzN();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:42|43|44|45|(3:47|48|49)|178|179|(0)|182) */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x023a, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02ad, code lost:
        r1.zzD = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02af, code lost:
        if (r0 == 0) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02b2, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0394, code lost:
        r1.zzV = true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:178:0x038c */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0394 A[Catch:{ zzoe -> 0x009c, zzoe -> 0x0398 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:50:0x00d4=Splitter:B:50:0x00d4, B:178:0x038c=Splitter:B:178:0x038c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzt(java.nio.ByteBuffer r25, long r26, int r28) throws com.google.android.gms.internal.ads.zzoe, com.google.android.gms.internal.ads.zzoh {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            r3 = r26
            r5 = r28
            java.nio.ByteBuffer r0 = r1.zzI
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0013
            if (r2 != r0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            com.google.android.gms.internal.ads.zzdl.zzd(r0)
            com.google.android.gms.internal.ads.zzou r0 = r1.zzr
            r8 = 0
            if (r0 == 0) goto L_0x007f
            boolean r0 = r24.zzQ()
            if (r0 != 0) goto L_0x0023
            return r6
        L_0x0023:
            com.google.android.gms.internal.ads.zzou r0 = r1.zzr
            com.google.android.gms.internal.ads.zzou r9 = r1.zzs
            int r10 = r9.zzc
            int r11 = r0.zzc
            if (r10 != r11) goto L_0x006f
            int r10 = r9.zzg
            int r11 = r0.zzg
            if (r10 != r11) goto L_0x006f
            int r10 = r9.zze
            int r11 = r0.zze
            if (r10 != r11) goto L_0x006f
            int r10 = r9.zzf
            int r11 = r0.zzf
            if (r10 != r11) goto L_0x006f
            int r9 = r9.zzd
            int r10 = r0.zzd
            if (r9 != r10) goto L_0x006f
            r1.zzs = r0
            r1.zzr = r8
            android.media.AudioTrack r0 = r1.zzu
            boolean r0 = zzS(r0)
            if (r0 == 0) goto L_0x007c
            android.media.AudioTrack r0 = r1.zzu
            int r0 = r0.getPlayState()
            r9 = 3
            if (r0 != r9) goto L_0x005f
            android.media.AudioTrack r0 = r1.zzu
            r0.setOffloadEndOfStream()
        L_0x005f:
            android.media.AudioTrack r0 = r1.zzu
            com.google.android.gms.internal.ads.zzou r9 = r1.zzs
            com.google.android.gms.internal.ads.zzaf r9 = r9.zza
            int r10 = r9.zzC
            int r9 = r9.zzD
            r0.setOffloadDelayPadding(r10, r9)
            r1.zzW = r7
            goto L_0x007c
        L_0x006f:
            r24.zzK()
            boolean r0 = r24.zzu()
            if (r0 == 0) goto L_0x0079
            return r6
        L_0x0079:
            r24.zze()
        L_0x007c:
            r1.zzJ(r3)
        L_0x007f:
            boolean r0 = r24.zzR()
            r9 = 31
            if (r0 == 0) goto L_0x0089
            goto L_0x013e
        L_0x0089:
            com.google.android.gms.internal.ads.zzdo r0 = r1.zzi     // Catch:{ zzoe -> 0x0398 }
            boolean r0 = r0.zzd()     // Catch:{ zzoe -> 0x0398 }
            if (r0 != 0) goto L_0x0092
            return r6
        L_0x0092:
            com.google.android.gms.internal.ads.zzou r0 = r1.zzs     // Catch:{ zzoe -> 0x009c }
            java.util.Objects.requireNonNull(r0)
            android.media.AudioTrack r0 = r1.zzH(r0)     // Catch:{ zzoe -> 0x009c }
            goto L_0x00d4
        L_0x009c:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.internal.ads.zzou r0 = r1.zzs     // Catch:{ zzoe -> 0x0398 }
            int r12 = r0.zzh     // Catch:{ zzoe -> 0x0398 }
            r13 = 1000000(0xf4240, float:1.401298E-39)
            if (r12 <= r13) goto L_0x038c
            com.google.android.gms.internal.ads.zzou r12 = new com.google.android.gms.internal.ads.zzou     // Catch:{ zzoe -> 0x0398 }
            com.google.android.gms.internal.ads.zzaf r15 = r0.zza     // Catch:{ zzoe -> 0x0398 }
            int r13 = r0.zzb     // Catch:{ zzoe -> 0x0398 }
            int r14 = r0.zzc     // Catch:{ zzoe -> 0x0398 }
            int r8 = r0.zzd     // Catch:{ zzoe -> 0x0398 }
            int r6 = r0.zze     // Catch:{ zzoe -> 0x0398 }
            int r7 = r0.zzf     // Catch:{ zzoe -> 0x0398 }
            int r10 = r0.zzg     // Catch:{ zzoe -> 0x0398 }
            r22 = 1000000(0xf4240, float:1.401298E-39)
            com.google.android.gms.internal.ads.zzdb r0 = r0.zzi     // Catch:{ zzoe -> 0x0398 }
            r17 = r14
            r14 = r12
            r16 = r13
            r18 = r8
            r19 = r6
            r20 = r7
            r21 = r10
            r23 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ zzoe -> 0x0398 }
            android.media.AudioTrack r0 = r1.zzH(r12)     // Catch:{ zzoe -> 0x0374 }
            r1.zzs = r12     // Catch:{ zzoe -> 0x0374 }
        L_0x00d4:
            r1.zzu = r0     // Catch:{ zzoe -> 0x0398 }
            boolean r0 = zzS(r0)     // Catch:{ zzoe -> 0x0398 }
            if (r0 == 0) goto L_0x00fb
            android.media.AudioTrack r0 = r1.zzu     // Catch:{ zzoe -> 0x0398 }
            com.google.android.gms.internal.ads.zzpd r6 = r1.zzl     // Catch:{ zzoe -> 0x0398 }
            if (r6 != 0) goto L_0x00e9
            com.google.android.gms.internal.ads.zzpd r6 = new com.google.android.gms.internal.ads.zzpd     // Catch:{ zzoe -> 0x0398 }
            r6.<init>(r1)     // Catch:{ zzoe -> 0x0398 }
            r1.zzl = r6     // Catch:{ zzoe -> 0x0398 }
        L_0x00e9:
            com.google.android.gms.internal.ads.zzpd r6 = r1.zzl     // Catch:{ zzoe -> 0x0398 }
            r6.zza(r0)     // Catch:{ zzoe -> 0x0398 }
            android.media.AudioTrack r0 = r1.zzu     // Catch:{ zzoe -> 0x0398 }
            com.google.android.gms.internal.ads.zzou r6 = r1.zzs     // Catch:{ zzoe -> 0x0398 }
            com.google.android.gms.internal.ads.zzaf r6 = r6.zza     // Catch:{ zzoe -> 0x0398 }
            int r7 = r6.zzC     // Catch:{ zzoe -> 0x0398 }
            int r6 = r6.zzD     // Catch:{ zzoe -> 0x0398 }
            r0.setOffloadDelayPadding(r7, r6)     // Catch:{ zzoe -> 0x0398 }
        L_0x00fb:
            int r0 = com.google.android.gms.internal.ads.zzew.zza     // Catch:{ zzoe -> 0x0398 }
            if (r0 < r9) goto L_0x0108
            com.google.android.gms.internal.ads.zzno r6 = r1.zzp     // Catch:{ zzoe -> 0x0398 }
            if (r6 == 0) goto L_0x0108
            android.media.AudioTrack r7 = r1.zzu     // Catch:{ zzoe -> 0x0398 }
            com.google.android.gms.internal.ads.zzoq.zza(r7, r6)     // Catch:{ zzoe -> 0x0398 }
        L_0x0108:
            android.media.AudioTrack r6 = r1.zzu     // Catch:{ zzoe -> 0x0398 }
            int r6 = r6.getAudioSessionId()     // Catch:{ zzoe -> 0x0398 }
            r1.zzR = r6     // Catch:{ zzoe -> 0x0398 }
            com.google.android.gms.internal.ads.zzom r10 = r1.zzj     // Catch:{ zzoe -> 0x0398 }
            android.media.AudioTrack r11 = r1.zzu     // Catch:{ zzoe -> 0x0398 }
            com.google.android.gms.internal.ads.zzou r6 = r1.zzs     // Catch:{ zzoe -> 0x0398 }
            int r7 = r6.zzc     // Catch:{ zzoe -> 0x0398 }
            r8 = 2
            if (r7 != r8) goto L_0x011d
            r12 = 1
            goto L_0x011e
        L_0x011d:
            r12 = 0
        L_0x011e:
            int r13 = r6.zzg     // Catch:{ zzoe -> 0x0398 }
            int r14 = r6.zzd     // Catch:{ zzoe -> 0x0398 }
            int r15 = r6.zzh     // Catch:{ zzoe -> 0x0398 }
            r10.zze(r11, r12, r13, r14, r15)     // Catch:{ zzoe -> 0x0398 }
            r24.zzN()     // Catch:{ zzoe -> 0x0398 }
            com.google.android.gms.internal.ads.zzl r6 = r1.zzS     // Catch:{ zzoe -> 0x0398 }
            int r6 = r6.zza     // Catch:{ zzoe -> 0x0398 }
            com.google.android.gms.internal.ads.zzor r6 = r1.zzT     // Catch:{ zzoe -> 0x0398 }
            if (r6 == 0) goto L_0x013b
            r7 = 23
            if (r0 < r7) goto L_0x013b
            android.media.AudioTrack r0 = r1.zzu     // Catch:{ zzoe -> 0x0398 }
            com.google.android.gms.internal.ads.zzop.zza(r0, r6)     // Catch:{ zzoe -> 0x0398 }
        L_0x013b:
            r6 = 1
            r1.zzF = r6     // Catch:{ zzoe -> 0x0398 }
        L_0x013e:
            com.google.android.gms.internal.ads.zzoy r0 = r1.zzm
            r0.zza()
            boolean r0 = r1.zzF
            r6 = 0
            if (r0 == 0) goto L_0x015e
            long r10 = java.lang.Math.max(r6, r3)
            r1.zzG = r10
            r8 = 0
            r1.zzE = r8
            r1.zzF = r8
            r1.zzJ(r3)
            boolean r0 = r1.zzP
            if (r0 == 0) goto L_0x015e
            r24.zzh()
        L_0x015e:
            com.google.android.gms.internal.ads.zzom r0 = r1.zzj
            long r10 = r24.zzG()
            boolean r0 = r0.zzj(r10)
            if (r0 != 0) goto L_0x016c
            r8 = 0
            return r8
        L_0x016c:
            java.nio.ByteBuffer r0 = r1.zzI
            if (r0 != 0) goto L_0x0347
            java.nio.ByteOrder r0 = r25.order()
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r0 != r8) goto L_0x017a
            r0 = 1
            goto L_0x017b
        L_0x017a:
            r0 = 0
        L_0x017b:
            com.google.android.gms.internal.ads.zzdl.zzd(r0)
            boolean r0 = r25.hasRemaining()
            if (r0 != 0) goto L_0x0186
            r8 = 1
            return r8
        L_0x0186:
            com.google.android.gms.internal.ads.zzou r0 = r1.zzs
            int r8 = r0.zzc
            if (r8 == 0) goto L_0x02b3
            int r8 = r1.zzD
            if (r8 != 0) goto L_0x02b3
            int r0 = r0.zzg
            r8 = 1024(0x400, float:1.435E-42)
            r10 = -2
            r11 = 16
            r12 = -1
            switch(r0) {
                case 5: goto L_0x02a8;
                case 6: goto L_0x02a8;
                case 7: goto L_0x0242;
                case 8: goto L_0x0242;
                case 9: goto L_0x022c;
                case 10: goto L_0x0229;
                case 11: goto L_0x0226;
                case 12: goto L_0x0226;
                case 13: goto L_0x019b;
                case 14: goto L_0x01d6;
                case 15: goto L_0x01d3;
                case 16: goto L_0x0229;
                case 17: goto L_0x01b8;
                case 18: goto L_0x02a8;
                case 19: goto L_0x019b;
                case 20: goto L_0x01b2;
                default: goto L_0x019b;
            }
        L_0x019b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected audio encoding: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01b2:
            int r0 = com.google.android.gms.internal.ads.zzaas.zza(r25)
            goto L_0x023a
        L_0x01b8:
            int r0 = com.google.android.gms.internal.ads.zzyy.zza
            byte[] r0 = new byte[r11]
            int r8 = r25.position()
            r2.get(r0)
            r2.position(r8)
            com.google.android.gms.internal.ads.zzem r8 = new com.google.android.gms.internal.ads.zzem
            r8.<init>(r0, r11)
            com.google.android.gms.internal.ads.zzyx r0 = com.google.android.gms.internal.ads.zzyy.zza(r8)
            int r0 = r0.zzc
            goto L_0x023a
        L_0x01d3:
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x023a
        L_0x01d6:
            int r0 = com.google.android.gms.internal.ads.zzyv.zza
            int r0 = r25.position()
            int r8 = r25.limit()
            int r8 = r8 + -10
            r9 = r0
        L_0x01e3:
            if (r9 > r8) goto L_0x01f6
            int r13 = r9 + 4
            int r13 = com.google.android.gms.internal.ads.zzew.zzk(r2, r13)
            r13 = r13 & r10
            r14 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r13 != r14) goto L_0x01f3
            int r9 = r9 - r0
            goto L_0x01f7
        L_0x01f3:
            int r9 = r9 + 1
            goto L_0x01e3
        L_0x01f6:
            r9 = -1
        L_0x01f7:
            if (r9 != r12) goto L_0x01fb
            r0 = 0
            goto L_0x023a
        L_0x01fb:
            int r0 = r25.position()
            int r0 = r0 + r9
            int r0 = r0 + 7
            byte r0 = r2.get(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r8 = r25.position()
            int r8 = r8 + r9
            r9 = 187(0xbb, float:2.62E-43)
            if (r0 != r9) goto L_0x0214
            r0 = 9
            goto L_0x0216
        L_0x0214:
            r0 = 8
        L_0x0216:
            r9 = 40
            int r8 = r8 + r0
            byte r0 = r2.get(r8)
            int r0 = r0 >> 4
            r0 = r0 & 7
            int r0 = r9 << r0
            int r0 = r0 * 16
            goto L_0x023a
        L_0x0226:
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x023a
        L_0x0229:
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x023a
        L_0x022c:
            int r0 = r25.position()
            int r0 = com.google.android.gms.internal.ads.zzew.zzk(r2, r0)
            int r0 = com.google.android.gms.internal.ads.zzaao.zzc(r0)
            if (r0 == r12) goto L_0x023c
        L_0x023a:
            r10 = 1
            goto L_0x02ad
        L_0x023c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0242:
            int r0 = com.google.android.gms.internal.ads.zzzr.zza
            int r0 = r25.position()
            byte r8 = r2.get(r0)
            if (r8 == r10) goto L_0x028f
            if (r8 == r12) goto L_0x0278
            if (r8 == r9) goto L_0x0266
            int r8 = r0 + 4
            byte r8 = r2.get(r8)
            r9 = 1
            r8 = r8 & r9
            int r8 = r8 << 6
            int r0 = r0 + 5
            byte r0 = r2.get(r0)
            r0 = r0 & 252(0xfc, float:3.53E-43)
            r9 = 2
            goto L_0x028b
        L_0x0266:
            r9 = 2
            int r8 = r0 + 5
            byte r8 = r2.get(r8)
            r8 = r8 & 7
            int r8 = r8 << 4
            int r0 = r0 + 6
            byte r0 = r2.get(r0)
            goto L_0x0289
        L_0x0278:
            r9 = 2
            int r8 = r0 + 4
            byte r8 = r2.get(r8)
            r8 = r8 & 7
            int r8 = r8 << 4
            int r0 = r0 + 7
            byte r0 = r2.get(r0)
        L_0x0289:
            r0 = r0 & 60
        L_0x028b:
            int r0 = r0 >> r9
            r0 = r0 | r8
            r10 = 1
            goto L_0x02a4
        L_0x028f:
            r9 = 2
            int r8 = r0 + 5
            byte r8 = r2.get(r8)
            r10 = 1
            r8 = r8 & r10
            int r8 = r8 << 6
            int r0 = r0 + 4
            byte r0 = r2.get(r0)
            r0 = r0 & 252(0xfc, float:3.53E-43)
            int r0 = r0 >> r9
            r0 = r0 | r8
        L_0x02a4:
            int r0 = r0 + r10
            int r0 = r0 * 32
            goto L_0x02ad
        L_0x02a8:
            r10 = 1
            int r0 = com.google.android.gms.internal.ads.zzyv.zza(r25)
        L_0x02ad:
            r1.zzD = r0
            if (r0 == 0) goto L_0x02b2
            goto L_0x02b3
        L_0x02b2:
            return r10
        L_0x02b3:
            com.google.android.gms.internal.ads.zzox r0 = r1.zzw
            if (r0 == 0) goto L_0x02c5
            boolean r0 = r24.zzQ()
            if (r0 != 0) goto L_0x02bf
            r8 = 0
            return r8
        L_0x02bf:
            r1.zzJ(r3)
            r8 = 0
            r1.zzw = r8
        L_0x02c5:
            long r8 = r1.zzG
            com.google.android.gms.internal.ads.zzou r0 = r1.zzs
            long r10 = r24.zzF()
            com.google.android.gms.internal.ads.zzpo r12 = r1.zzf
            long r12 = r12.zzo()
            long r10 = r10 - r12
            com.google.android.gms.internal.ads.zzaf r0 = r0.zza
            int r0 = r0.zzA
            long r12 = (long) r0
            r14 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r10 * r14
            long r10 = r10 / r12
            long r8 = r8 + r10
            boolean r0 = r1.zzE
            if (r0 != 0) goto L_0x0300
            long r10 = r8 - r3
            long r10 = java.lang.Math.abs(r10)
            r12 = 200000(0x30d40, double:9.8813E-319)
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0300
            com.google.android.gms.internal.ads.zzof r0 = r1.zzq
            if (r0 == 0) goto L_0x02fd
            com.google.android.gms.internal.ads.zzog r10 = new com.google.android.gms.internal.ads.zzog
            r10.<init>(r3, r8)
            r0.zza(r10)
        L_0x02fd:
            r10 = 1
            r1.zzE = r10
        L_0x0300:
            boolean r0 = r1.zzE
            if (r0 == 0) goto L_0x0327
            boolean r0 = r24.zzQ()
            r10 = 0
            if (r0 != 0) goto L_0x030c
            return r10
        L_0x030c:
            long r8 = r3 - r8
            long r11 = r1.zzG
            long r11 = r11 + r8
            r1.zzG = r11
            r1.zzE = r10
            r1.zzJ(r3)
            com.google.android.gms.internal.ads.zzof r0 = r1.zzq
            if (r0 == 0) goto L_0x0327
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0327
            com.google.android.gms.internal.ads.zzpk r0 = (com.google.android.gms.internal.ads.zzpk) r0
            com.google.android.gms.internal.ads.zzpl r0 = r0.zza
            r0.zzab()
        L_0x0327:
            com.google.android.gms.internal.ads.zzou r0 = r1.zzs
            int r0 = r0.zzc
            if (r0 != 0) goto L_0x0338
            long r6 = r1.zzz
            int r0 = r25.remaining()
            long r8 = (long) r0
            long r6 = r6 + r8
            r1.zzz = r6
            goto L_0x0343
        L_0x0338:
            long r6 = r1.zzA
            int r0 = r1.zzD
            long r8 = (long) r0
            long r10 = (long) r5
            long r8 = r8 * r10
            long r6 = r6 + r8
            r1.zzA = r6
        L_0x0343:
            r1.zzI = r2
            r1.zzJ = r5
        L_0x0347:
            r1.zzL(r3)
            java.nio.ByteBuffer r0 = r1.zzI
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x035a
            r2 = 0
            r1.zzI = r2
            r2 = 0
            r1.zzJ = r2
            r3 = 1
            return r3
        L_0x035a:
            r2 = 0
            r3 = 1
            com.google.android.gms.internal.ads.zzom r0 = r1.zzj
            long r4 = r24.zzG()
            boolean r0 = r0.zzi(r4)
            if (r0 == 0) goto L_0x0373
            java.lang.String r0 = "DefaultAudioSink"
            java.lang.String r2 = "Resetting stalled audio track"
            com.google.android.gms.internal.ads.zzee.zze(r0, r2)
            r24.zze()
            return r3
        L_0x0373:
            return r2
        L_0x0374:
            r0 = move-exception
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.String r3 = "addSuppressed"
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x038c }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r7 = 0
            r5[r7] = r6     // Catch:{ Exception -> 0x038c }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch:{ Exception -> 0x038c }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x038c }
            r3[r7] = r0     // Catch:{ Exception -> 0x038c }
            r2.invoke(r11, r3)     // Catch:{ Exception -> 0x038c }
        L_0x038c:
            com.google.android.gms.internal.ads.zzou r0 = r1.zzs     // Catch:{ zzoe -> 0x0398 }
            boolean r0 = r0.zzc()     // Catch:{ zzoe -> 0x0398 }
            if (r0 == 0) goto L_0x0397
            r2 = 1
            r1.zzV = r2     // Catch:{ zzoe -> 0x0398 }
        L_0x0397:
            throw r11     // Catch:{ zzoe -> 0x0398 }
        L_0x0398:
            r0 = move-exception
            boolean r2 = r0.zzb
            if (r2 != 0) goto L_0x03a4
            com.google.android.gms.internal.ads.zzoy r2 = r1.zzm
            r2.zzb(r0)
            r2 = 0
            return r2
        L_0x03a4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpf.zzt(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean zzu() {
        return zzR() && this.zzj.zzg(zzG());
    }

    public final boolean zzv() {
        return !zzR() || (this.zzN && !zzu());
    }

    public final boolean zzw(zzaf zzaf) {
        return zza(zzaf) != 0;
    }
}
