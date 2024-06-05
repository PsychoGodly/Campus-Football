package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzra extends zzha {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private float zzA;
    private ArrayDeque zzB;
    private zzqz zzC;
    private zzqx zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private zzqp zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private ByteBuffer zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private boolean zzY;
    private int zzZ;
    protected zzhb zza;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private long zzaf;
    private long zzag;
    private boolean zzah;
    private boolean zzai;
    private boolean zzaj;
    private long zzak;
    private long zzal;
    private int zzam;
    private zzqa zzan;
    private zzqa zzao;
    private final zzqt zzc;
    private final zzrc zzd;
    private final float zze;
    private final zzgr zzf = new zzgr(0, 0);
    private final zzgr zzg = new zzgr(0, 0);
    private final zzgr zzh = new zzgr(2, 0);
    private final zzqo zzi;
    private final zzet zzj;
    private final ArrayList zzk;
    private final MediaCodec.BufferInfo zzl;
    private final long[] zzm;
    private final long[] zzn;
    private final long[] zzo;
    private zzaf zzp;
    private zzaf zzq;
    private MediaCrypto zzr;
    private boolean zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    private zzqu zzw;
    private zzaf zzx;
    private MediaFormat zzy;
    private boolean zzz;

    public zzra(int i10, zzqt zzqt, zzrc zzrc, boolean z10, float f10) {
        super(i10);
        this.zzc = zzqt;
        Objects.requireNonNull(zzrc);
        this.zzd = zzrc;
        this.zze = f10;
        zzqo zzqo = new zzqo();
        this.zzi = zzqo;
        this.zzj = new zzet(10);
        this.zzk = new ArrayList();
        this.zzl = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzm = new long[10];
        this.zzn = new long[10];
        this.zzo = new long[10];
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        zzqo.zzi(0);
        zzqo.zzb.order(ByteOrder.nativeOrder());
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzZ = 0;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzP = -9223372036854775807L;
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        this.zzaa = 0;
        this.zzab = 0;
    }

    private final void zzT() {
        this.zzX = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzW = false;
        this.zzV = false;
    }

    private final void zzU() throws zzhj {
        if (this.zzac) {
            this.zzaa = 1;
            this.zzab = 3;
            return;
        }
        zzaq();
        zzan();
    }

    private final void zzaA() {
        this.zzR = -1;
        this.zzS = null;
    }

    private final void zzaB() throws zzhj {
        try {
            throw null;
        } catch (MediaCryptoException e10) {
            throw zzbe(e10, this.zzp, false, 6006);
        }
    }

    private final boolean zzaC() throws zzhj {
        if (this.zzac) {
            this.zzaa = 1;
            if (this.zzG || this.zzI) {
                this.zzab = 3;
                return false;
            }
            this.zzab = 2;
        } else {
            zzaB();
        }
        return true;
    }

    private final boolean zzaD() throws zzhj {
        zzqu zzqu = this.zzw;
        if (zzqu == null || this.zzaa == 2 || this.zzah) {
            return false;
        }
        if (this.zzQ < 0) {
            int zza2 = zzqu.zza();
            this.zzQ = zza2;
            if (zza2 < 0) {
                return false;
            }
            this.zzg.zzb = this.zzw.zzf(zza2);
            this.zzg.zzb();
        }
        if (this.zzaa == 1) {
            if (!this.zzN) {
                this.zzad = true;
                this.zzw.zzj(this.zzQ, 0, 0, 0, 4);
                zzaz();
            }
            this.zzaa = 2;
            return false;
        } else if (this.zzL) {
            this.zzL = false;
            this.zzg.zzb.put(zzb);
            this.zzw.zzj(this.zzQ, 0, 38, 0, 0);
            zzaz();
            this.zzac = true;
            return true;
        } else {
            if (this.zzZ == 1) {
                for (int i10 = 0; i10 < this.zzx.zzo.size(); i10++) {
                    this.zzg.zzb.put((byte[]) this.zzx.zzo.get(i10));
                }
                this.zzZ = 2;
            }
            int position = this.zzg.zzb.position();
            zzjo zzh2 = zzh();
            try {
                int zzbd = zzbd(zzh2, this.zzg, 0);
                if (zzG()) {
                    this.zzag = this.zzaf;
                }
                if (zzbd == -3) {
                    return false;
                }
                if (zzbd == -5) {
                    if (this.zzZ == 2) {
                        this.zzg.zzb();
                        this.zzZ = 1;
                    }
                    zzS(zzh2);
                    return true;
                }
                zzgr zzgr = this.zzg;
                if (zzgr.zzg()) {
                    if (this.zzZ == 2) {
                        zzgr.zzb();
                        this.zzZ = 1;
                    }
                    this.zzah = true;
                    if (!this.zzac) {
                        zzay();
                        return false;
                    }
                    try {
                        if (!this.zzN) {
                            this.zzad = true;
                            this.zzw.zzj(this.zzQ, 0, 0, 0, 4);
                            zzaz();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e10) {
                        throw zzbe(e10, this.zzp, false, zzew.zzl(e10.getErrorCode()));
                    }
                } else if (this.zzac || zzgr.zzh()) {
                    boolean zzk2 = zzgr.zzk();
                    if (zzk2) {
                        zzgr.zza.zzb(position);
                    }
                    if (this.zzF && !zzk2) {
                        ByteBuffer byteBuffer = this.zzg.zzb;
                        byte[] bArr = zzaar.zza;
                        int position2 = byteBuffer.position();
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            int i13 = i11 + 1;
                            if (i13 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            byte b10 = byteBuffer.get(i11) & 255;
                            if (i12 == 3) {
                                if (b10 == 1) {
                                    if ((byteBuffer.get(i13) & Ascii.US) == 7) {
                                        ByteBuffer duplicate = byteBuffer.duplicate();
                                        duplicate.position(i11 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer.position(0);
                                        byteBuffer.put(duplicate);
                                        break;
                                    }
                                    b10 = 1;
                                }
                            } else if (b10 == 0) {
                                i12++;
                            }
                            if (b10 != 0) {
                                i12 = 0;
                            }
                            i11 = i13;
                        }
                        if (this.zzg.zzb.position() == 0) {
                            return true;
                        }
                        this.zzF = false;
                    }
                    zzgr zzgr2 = this.zzg;
                    long j10 = zzgr2.zzd;
                    zzqp zzqp = this.zzO;
                    if (zzqp != null) {
                        j10 = zzqp.zzb(this.zzp, zzgr2);
                        this.zzaf = Math.max(this.zzaf, this.zzO.zza(this.zzp));
                    }
                    long j11 = j10;
                    if (this.zzg.zzf()) {
                        this.zzk.add(Long.valueOf(j11));
                    }
                    if (this.zzaj) {
                        this.zzj.zzd(j11, this.zzp);
                        this.zzaj = false;
                    }
                    this.zzaf = Math.max(this.zzaf, j11);
                    this.zzg.zzj();
                    zzgr zzgr3 = this.zzg;
                    if (zzgr3.zze()) {
                        zzam(zzgr3);
                    }
                    zzad(this.zzg);
                    if (zzk2) {
                        try {
                            this.zzw.zzk(this.zzQ, 0, this.zzg.zza, j11, 0);
                        } catch (MediaCodec.CryptoException e11) {
                            throw zzbe(e11, this.zzp, false, zzew.zzl(e11.getErrorCode()));
                        }
                    } else {
                        this.zzw.zzj(this.zzQ, 0, this.zzg.zzb.limit(), j11, 0);
                    }
                    zzaz();
                    this.zzac = true;
                    this.zzZ = 0;
                    this.zza.zzc++;
                    return true;
                } else {
                    zzgr.zzb();
                    if (this.zzZ == 2) {
                        this.zzZ = 1;
                    }
                    return true;
                }
            } catch (zzgq e12) {
                zzX(e12);
                zzaF(0);
                zzab();
                return true;
            }
        }
    }

    private final boolean zzaE() {
        return this.zzR >= 0;
    }

    private final boolean zzaF(int i10) throws zzhj {
        zzjo zzh2 = zzh();
        this.zzf.zzb();
        int zzbd = zzbd(zzh2, this.zzf, i10 | 4);
        if (zzbd == -5) {
            zzS(zzh2);
            return true;
        } else if (zzbd != -4 || !this.zzf.zzg()) {
            return false;
        } else {
            this.zzah = true;
            zzay();
            return false;
        }
    }

    private final boolean zzaG(long j10) {
        return this.zzt == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.zzt;
    }

    private final boolean zzaH(zzaf zzaf2) throws zzhj {
        if (!(zzew.zza < 23 || this.zzw == null || this.zzab == 3 || zzbc() == 0)) {
            float zzP2 = zzP(this.zzv, zzaf2, zzJ());
            float f10 = this.zzA;
            if (f10 == zzP2) {
                return true;
            }
            if (zzP2 == -1.0f) {
                zzU();
                return false;
            } else if (f10 == -1.0f && zzP2 <= this.zze) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", zzP2);
                this.zzw.zzp(bundle);
                this.zzA = zzP2;
            }
        }
        return true;
    }

    private final void zzab() {
        try {
            this.zzw.zzi();
        } finally {
            zzar();
        }
    }

    protected static boolean zzaw(zzaf zzaf2) {
        return zzaf2.zzF == 0;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b8, code lost:
        if ("stvm8".equals(r5) == false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c8, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L_0x01cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02c7 A[SYNTHETIC, Splitter:B:160:0x02c7] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzax(com.google.android.gms.internal.ads.zzqx r17, android.media.MediaCrypto r18) throws java.lang.Exception {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            java.lang.String r1 = "createCodec:"
            java.lang.String r2 = r0.zza
            int r3 = com.google.android.gms.internal.ads.zzew.zza
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 23
            if (r3 >= r5) goto L_0x0013
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x001f
        L_0x0013:
            float r6 = r8.zzv
            com.google.android.gms.internal.ads.zzaf r7 = r8.zzp
            com.google.android.gms.internal.ads.zzaf[] r9 = r16.zzJ()
            float r6 = r8.zzP(r6, r7, r9)
        L_0x001f:
            float r7 = r8.zze
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r4 = r6
        L_0x0027:
            com.google.android.gms.internal.ads.zzaf r6 = r8.zzp
            r8.zzap(r6)
            long r6 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.internal.ads.zzaf r9 = r8.zzp
            r10 = 0
            com.google.android.gms.internal.ads.zzqs r9 = r8.zzV(r0, r9, r10, r4)
            r11 = 31
            if (r3 < r11) goto L_0x0042
            com.google.android.gms.internal.ads.zzno r12 = r16.zzl()
            com.google.android.gms.internal.ads.zzqy.zza(r9, r12)
        L_0x0042:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x02cb }
            r12.<init>()     // Catch:{ all -> 0x02cb }
            r12.append(r1)     // Catch:{ all -> 0x02cb }
            r12.append(r2)     // Catch:{ all -> 0x02cb }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x02cb }
            android.os.Trace.beginSection(r12)     // Catch:{ all -> 0x02cb }
            r12 = 0
            if (r3 < r5) goto L_0x007a
            if (r3 < r11) goto L_0x007a
            com.google.android.gms.internal.ads.zzaf r1 = r9.zzc     // Catch:{ all -> 0x02cb }
            java.lang.String r1 = r1.zzm     // Catch:{ all -> 0x02cb }
            int r1 = com.google.android.gms.internal.ads.zzbt.zzb(r1)     // Catch:{ all -> 0x02cb }
            java.lang.String r10 = "DMCodecAdapterFactory"
            java.lang.String r11 = com.google.android.gms.internal.ads.zzew.zzO(r1)     // Catch:{ all -> 0x02cb }
            java.lang.String r13 = "Creating an asynchronous MediaCodec adapter for track type "
            java.lang.String r11 = r13.concat(r11)     // Catch:{ all -> 0x02cb }
            com.google.android.gms.internal.ads.zzee.zzd(r10, r11)     // Catch:{ all -> 0x02cb }
            com.google.android.gms.internal.ads.zzqf r10 = new com.google.android.gms.internal.ads.zzqf     // Catch:{ all -> 0x02cb }
            r10.<init>(r1, r12)     // Catch:{ all -> 0x02cb }
            com.google.android.gms.internal.ads.zzqh r1 = r10.zzc(r9)     // Catch:{ all -> 0x02cb }
            goto L_0x00af
        L_0x007a:
            com.google.android.gms.internal.ads.zzqx r11 = r9.zza     // Catch:{ IOException -> 0x02c4, RuntimeException -> 0x02c2 }
            java.util.Objects.requireNonNull(r11)
            java.lang.String r11 = r11.zza     // Catch:{ IOException -> 0x02c4, RuntimeException -> 0x02c2 }
            java.lang.String r1 = r1.concat(r11)     // Catch:{ IOException -> 0x02c4, RuntimeException -> 0x02c2 }
            android.os.Trace.beginSection(r1)     // Catch:{ IOException -> 0x02c4, RuntimeException -> 0x02c2 }
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r11)     // Catch:{ IOException -> 0x02c4, RuntimeException -> 0x02c2 }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x02c4, RuntimeException -> 0x02c2 }
            java.lang.String r11 = "configureCodec"
            android.os.Trace.beginSection(r11)     // Catch:{ IOException -> 0x02bf, RuntimeException -> 0x02bd }
            android.media.MediaFormat r11 = r9.zzb     // Catch:{ IOException -> 0x02bf, RuntimeException -> 0x02bd }
            android.view.Surface r13 = r9.zzd     // Catch:{ IOException -> 0x02bf, RuntimeException -> 0x02bd }
            r1.configure(r11, r13, r10, r12)     // Catch:{ IOException -> 0x02bf, RuntimeException -> 0x02bd }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x02bf, RuntimeException -> 0x02bd }
            java.lang.String r11 = "startCodec"
            android.os.Trace.beginSection(r11)     // Catch:{ IOException -> 0x02bf, RuntimeException -> 0x02bd }
            r1.start()     // Catch:{ IOException -> 0x02bf, RuntimeException -> 0x02bd }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x02bf, RuntimeException -> 0x02bd }
            com.google.android.gms.internal.ads.zzrr r11 = new com.google.android.gms.internal.ads.zzrr     // Catch:{ IOException -> 0x02bf, RuntimeException -> 0x02bd }
            r11.<init>(r1, r10)     // Catch:{ IOException -> 0x02bf, RuntimeException -> 0x02bd }
            r1 = r11
        L_0x00af:
            r8.zzw = r1     // Catch:{ all -> 0x02cb }
            android.os.Trace.endSection()
            long r10 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.internal.ads.zzaf r1 = r8.zzp
            boolean r1 = r0.zze(r1)
            r13 = 2
            r14 = 1
            if (r1 != 0) goto L_0x00d9
            java.lang.Object[] r1 = new java.lang.Object[r13]
            com.google.android.gms.internal.ads.zzaf r15 = r8.zzp
            java.lang.String r15 = com.google.android.gms.internal.ads.zzaf.zzd(r15)
            r1[r12] = r15
            r1[r14] = r2
            java.lang.String r15 = "Format exceeds selected codec's capabilities [%s, %s]"
            java.lang.String r1 = com.google.android.gms.internal.ads.zzew.zzI(r15, r1)
            java.lang.String r15 = "MediaCodecRenderer"
            com.google.android.gms.internal.ads.zzee.zze(r15, r1)
        L_0x00d9:
            r8.zzD = r0
            r8.zzA = r4
            com.google.android.gms.internal.ads.zzaf r1 = r8.zzp
            r8.zzx = r1
            java.lang.String r1 = "OMX.Exynos.avc.dec.secure"
            r4 = 25
            if (r3 > r4) goto L_0x0111
            boolean r15 = r1.equals(r2)
            if (r15 == 0) goto L_0x0111
            java.lang.String r15 = com.google.android.gms.internal.ads.zzew.zzd
            java.lang.String r12 = "SM-T585"
            boolean r12 = r15.startsWith(r12)
            if (r12 != 0) goto L_0x010f
            java.lang.String r12 = "SM-A510"
            boolean r12 = r15.startsWith(r12)
            if (r12 != 0) goto L_0x010f
            java.lang.String r12 = "SM-A520"
            boolean r12 = r15.startsWith(r12)
            if (r12 != 0) goto L_0x010f
            java.lang.String r12 = "SM-J700"
            boolean r12 = r15.startsWith(r12)
            if (r12 == 0) goto L_0x0111
        L_0x010f:
            r12 = 2
            goto L_0x014a
        L_0x0111:
            r12 = 24
            if (r3 >= r12) goto L_0x0149
            java.lang.String r12 = "OMX.Nvidia.h264.decode"
            boolean r12 = r12.equals(r2)
            if (r12 != 0) goto L_0x0125
            java.lang.String r12 = "OMX.Nvidia.h264.decode.secure"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x0149
        L_0x0125:
            java.lang.String r12 = com.google.android.gms.internal.ads.zzew.zzb
            java.lang.String r15 = "flounder"
            boolean r15 = r15.equals(r12)
            if (r15 != 0) goto L_0x0147
            java.lang.String r15 = "flounder_lte"
            boolean r15 = r15.equals(r12)
            if (r15 != 0) goto L_0x0147
            java.lang.String r15 = "grouper"
            boolean r15 = r15.equals(r12)
            if (r15 != 0) goto L_0x0147
            java.lang.String r15 = "tilapia"
            boolean r12 = r15.equals(r12)
            if (r12 == 0) goto L_0x0149
        L_0x0147:
            r12 = 1
            goto L_0x014a
        L_0x0149:
            r12 = 0
        L_0x014a:
            r8.zzE = r12
            com.google.android.gms.internal.ads.zzaf r12 = r8.zzx
            r15 = 21
            if (r3 >= r15) goto L_0x0164
            java.util.List r12 = r12.zzo
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x0164
            java.lang.String r12 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x0164
            r12 = 1
            goto L_0x0165
        L_0x0164:
            r12 = 0
        L_0x0165:
            r8.zzF = r12
            r12 = 19
            if (r3 != r12) goto L_0x0185
            java.lang.String r14 = com.google.android.gms.internal.ads.zzew.zzd
            java.lang.String r13 = "SM-G800"
            boolean r13 = r14.startsWith(r13)
            if (r13 == 0) goto L_0x0185
            java.lang.String r13 = "OMX.Exynos.avc.dec"
            boolean r13 = r13.equals(r2)
            if (r13 != 0) goto L_0x0183
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0185
        L_0x0183:
            r1 = 1
            goto L_0x0186
        L_0x0185:
            r1 = 0
        L_0x0186:
            r8.zzG = r1
            r1 = 29
            if (r3 != r1) goto L_0x0196
            java.lang.String r13 = "c2.android.aac.decoder"
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L_0x0196
            r13 = 1
            goto L_0x0197
        L_0x0196:
            r13 = 0
        L_0x0197:
            r8.zzH = r13
            if (r3 > r5) goto L_0x01a6
            java.lang.String r5 = "OMX.google.vorbis.decoder"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x01a4
            goto L_0x01a6
        L_0x01a4:
            r5 = 1
            goto L_0x01cc
        L_0x01a6:
            if (r3 > r12) goto L_0x01cb
            java.lang.String r5 = com.google.android.gms.internal.ads.zzew.zzb
            java.lang.String r12 = "hb2000"
            boolean r12 = r12.equals(r5)
            if (r12 != 0) goto L_0x01ba
            java.lang.String r12 = "stvm8"
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x01cb
        L_0x01ba:
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x01a4
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x01cb
            goto L_0x01a4
        L_0x01cb:
            r5 = 0
        L_0x01cc:
            r8.zzI = r5
            if (r3 != r15) goto L_0x01da
            java.lang.String r5 = "OMX.google.aac.decoder"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x01da
            r5 = 1
            goto L_0x01db
        L_0x01da:
            r5 = 0
        L_0x01db:
            r8.zzJ = r5
            if (r3 >= r15) goto L_0x0225
            java.lang.String r5 = "OMX.SEC.mp3.dec"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0225
            java.lang.String r5 = com.google.android.gms.internal.ads.zzew.zzc
            java.lang.String r12 = "samsung"
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x0225
            java.lang.String r5 = com.google.android.gms.internal.ads.zzew.zzb
            java.lang.String r12 = "baffin"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x0223
            java.lang.String r12 = "grand"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x0223
            java.lang.String r12 = "fortuna"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x0223
            java.lang.String r12 = "gprimelte"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x0223
            java.lang.String r12 = "j2y18lte"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x0223
            java.lang.String r12 = "ms01"
            boolean r5 = r5.startsWith(r12)
            if (r5 == 0) goto L_0x0225
        L_0x0223:
            r5 = 1
            goto L_0x0226
        L_0x0225:
            r5 = 0
        L_0x0226:
            r8.zzK = r5
            java.lang.String r5 = r0.zza
            if (r3 > r4) goto L_0x0237
            java.lang.String r4 = "OMX.rk.video_decoder.avc"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0235
            goto L_0x0237
        L_0x0235:
            r12 = 1
            goto L_0x0283
        L_0x0237:
            if (r3 > r1) goto L_0x0269
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0235
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0235
            java.lang.String r1 = "OMX.bcm.vdec.avc.tunnel"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0235
            java.lang.String r1 = "OMX.bcm.vdec.avc.tunnel.secure"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0235
            java.lang.String r1 = "OMX.bcm.vdec.hevc.tunnel"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0235
            java.lang.String r1 = "OMX.bcm.vdec.hevc.tunnel.secure"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0235
        L_0x0269:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzew.zzc
            java.lang.String r3 = "Amazon"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0282
            java.lang.String r1 = com.google.android.gms.internal.ads.zzew.zzd
            java.lang.String r3 = "AFTS"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0282
            boolean r1 = r0.zzf
            if (r1 == 0) goto L_0x0282
            goto L_0x0235
        L_0x0282:
            r12 = 0
        L_0x0283:
            r8.zzN = r12
            com.google.android.gms.internal.ads.zzqu r1 = r8.zzw
            r1.zzr()
            java.lang.String r0 = r0.zza
            java.lang.String r1 = "c2.android.mp3.decoder"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x029b
            com.google.android.gms.internal.ads.zzqp r0 = new com.google.android.gms.internal.ads.zzqp
            r0.<init>()
            r8.zzO = r0
        L_0x029b:
            int r0 = r16.zzbc()
            r1 = 2
            if (r0 != r1) goto L_0x02ab
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r3
            r8.zzP = r0
        L_0x02ab:
            com.google.android.gms.internal.ads.zzhb r0 = r8.zza
            int r1 = r0.zza
            r3 = 1
            int r1 = r1 + r3
            r0.zza = r1
            long r6 = r10 - r6
            r1 = r16
            r3 = r9
            r4 = r10
            r1.zzY(r2, r3, r4, r6)
            return
        L_0x02bd:
            r0 = move-exception
            goto L_0x02c0
        L_0x02bf:
            r0 = move-exception
        L_0x02c0:
            r10 = r1
            goto L_0x02c5
        L_0x02c2:
            r0 = move-exception
            goto L_0x02c5
        L_0x02c4:
            r0 = move-exception
        L_0x02c5:
            if (r10 == 0) goto L_0x02ca
            r10.release()     // Catch:{ all -> 0x02cb }
        L_0x02ca:
            throw r0     // Catch:{ all -> 0x02cb }
        L_0x02cb:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzra.zzax(com.google.android.gms.internal.ads.zzqx, android.media.MediaCrypto):void");
    }

    private final void zzay() throws zzhj {
        int i10 = this.zzab;
        if (i10 == 1) {
            zzab();
        } else if (i10 == 2) {
            zzab();
            zzaB();
        } else if (i10 != 3) {
            this.zzai = true;
            zzae();
        } else {
            zzaq();
            zzan();
        }
    }

    private final void zzaz() {
        this.zzQ = -1;
        this.zzg.zzb = null;
    }

    public void zzD(float f10, float f11) throws zzhj {
        this.zzu = f10;
        this.zzv = f11;
        zzaH(this.zzx);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.google.android.gms.internal.ads.zzra} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.ads.zzra} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.gms.internal.ads.zzra} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: com.google.android.gms.internal.ads.zzra} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: com.google.android.gms.internal.ads.zzqu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: com.google.android.gms.internal.ads.zzra} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: android.media.MediaFormat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: com.google.android.gms.internal.ads.zzra} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v26, resolved type: com.google.android.gms.internal.ads.zzra} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v27, resolved type: com.google.android.gms.internal.ads.zzra} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v71, resolved type: com.google.android.gms.internal.ads.zzra} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: com.google.android.gms.internal.ads.zzra} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v82, resolved type: com.google.android.gms.internal.ads.zzra} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v31, resolved type: com.google.android.gms.internal.ads.zzaf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v86, resolved type: com.google.android.gms.internal.ads.zzra} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v87, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v88, resolved type: com.google.android.gms.internal.ads.zzra} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v90, resolved type: com.google.android.gms.internal.ads.zzra} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v91, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v93, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v94, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v95, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v38, resolved type: com.google.android.gms.internal.ads.zzaf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v39, resolved type: com.google.android.gms.internal.ads.zzra} */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:84|85|(1:87)(0)|88|260|(1:195)|199|210|211) */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0260, code lost:
        if (r15.zzq != null) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02ac, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        zzay();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02af, code lost:
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02b1, code lost:
        r1 = r1;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02b3, code lost:
        if (r15.zzai != false) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02b5, code lost:
        zzaq();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02b8, code lost:
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02bc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x032d, code lost:
        r0 = e;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0150, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        zzay();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0155, code lost:
        if (r15.zzai != false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0157, code lost:
        zzaq();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x015a, code lost:
        r2 = r9;
        r1 = r15;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x02ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0150 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01a3 A[Catch:{ IllegalStateException -> 0x0352 }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x030e A[Catch:{ IllegalStateException -> 0x034f }, LOOP:2: B:75:0x0139->B:193:0x030e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0318 A[Catch:{ IllegalStateException -> 0x034f }, LOOP:4: B:195:0x0318->B:198:0x0322, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x030d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0315 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x016a A[Catch:{ IllegalStateException -> 0x0352 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzL(long r24, long r26) throws com.google.android.gms.internal.ads.zzhj {
        /*
            r23 = this;
            r15 = r23
            r14 = 1
            r13 = 0
            boolean r0 = r15.zzai     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x000c
            r23.zzae()     // Catch:{ IllegalStateException -> 0x0352 }
            return
        L_0x000c:
            com.google.android.gms.internal.ads.zzaf r0 = r15.zzp     // Catch:{ IllegalStateException -> 0x0352 }
            r11 = 2
            if (r0 != 0) goto L_0x0019
            boolean r0 = r15.zzaF(r11)     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            r23.zzan()     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r15.zzV     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = "bypassRender"
            int r1 = com.google.android.gms.internal.ads.zzew.zza     // Catch:{ IllegalStateException -> 0x0352 }
            android.os.Trace.beginSection(r0)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0027:
            boolean r0 = r15.zzai     // Catch:{ IllegalStateException -> 0x0352 }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.zzdl.zzf(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzqo r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r1 = r0.zzp()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x007b
            java.nio.ByteBuffer r7 = r0.zzb     // Catch:{ IllegalStateException -> 0x0352 }
            int r8 = r15.zzR     // Catch:{ IllegalStateException -> 0x0352 }
            int r10 = r0.zzl()     // Catch:{ IllegalStateException -> 0x0352 }
            long r11 = r0.zzd     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r16 = r0.zzf()     // Catch:{ IllegalStateException -> 0x0352 }
            r6 = 0
            r9 = 0
            boolean r0 = r0.zzg()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzaf r4 = r15.zzq     // Catch:{ IllegalStateException -> 0x0352 }
            r1 = r23
            r2 = r24
            r17 = r4
            r4 = r26
            r13 = r16
            r14 = r0
            r15 = r17
            boolean r0 = r1.zzaf(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0075 }
            if (r0 == 0) goto L_0x006f
            r15 = r23
            com.google.android.gms.internal.ads.zzqo r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x0352 }
            long r0 = r0.zzm()     // Catch:{ IllegalStateException -> 0x0352 }
            r15.zzao(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzqo r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x0352 }
            r0.zzb()     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x007b
        L_0x006f:
            r15 = r23
            r13 = 0
            r14 = 1
            goto L_0x0121
        L_0x0075:
            r0 = move-exception
            r2 = 1
            r19 = 0
            goto L_0x02be
        L_0x007b:
            boolean r0 = r15.zzah     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0085
            r14 = 1
            r15.zzai = r14     // Catch:{ IllegalStateException -> 0x0352 }
            r13 = 0
            goto L_0x0121
        L_0x0085:
            r14 = 1
            boolean r0 = r15.zzW     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0099
            com.google.android.gms.internal.ads.zzqo r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzgr r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r0.zzo(r1)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzdl.zzf(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            r13 = 0
            r15.zzW = r13     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x009a
        L_0x0099:
            r13 = 0
        L_0x009a:
            boolean r0 = r15.zzX     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.zzqo r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r0.zzp()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x0027
            r23.zzT()     // Catch:{ IllegalStateException -> 0x0352 }
            r15.zzX = r13     // Catch:{ IllegalStateException -> 0x0352 }
            r23.zzan()     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r15.zzV     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0121
        L_0x00b2:
            boolean r0 = r15.zzah     // Catch:{ IllegalStateException -> 0x0352 }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.zzdl.zzf(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzjo r0 = r23.zzh()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzgr r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x0352 }
            r1.zzb()     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x00c1:
            com.google.android.gms.internal.ads.zzgr r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x0352 }
            r1.zzb()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzgr r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x0352 }
            int r1 = r15.zzbd(r0, r1, r13)     // Catch:{ IllegalStateException -> 0x0352 }
            r2 = -5
            if (r1 == r2) goto L_0x0101
            r2 = -4
            if (r1 == r2) goto L_0x00d3
            goto L_0x0104
        L_0x00d3:
            com.google.android.gms.internal.ads.zzgr r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r1 = r1.zzg()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x00de
            r15.zzah = r14     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x0104
        L_0x00de:
            boolean r1 = r15.zzaj     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x00ef
            com.google.android.gms.internal.ads.zzaf r1 = r15.zzp     // Catch:{ IllegalStateException -> 0x0352 }
            java.util.Objects.requireNonNull(r1)
            r15.zzq = r1     // Catch:{ IllegalStateException -> 0x0352 }
            r2 = 0
            r15.zzaa(r1, r2)     // Catch:{ IllegalStateException -> 0x0352 }
            r15.zzaj = r13     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x00ef:
            com.google.android.gms.internal.ads.zzgr r1 = r15.zzh     // Catch:{ IllegalStateException -> 0x0352 }
            r1.zzj()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzqo r1 = r15.zzi     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzgr r2 = r15.zzh     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r1 = r1.zzo(r2)     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 != 0) goto L_0x00c1
            r15.zzW = r14     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x0104
        L_0x0101:
            r15.zzS(r0)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0104:
            com.google.android.gms.internal.ads.zzqo r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r1 = r0.zzp()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x010f
            r0.zzj()     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x010f:
            com.google.android.gms.internal.ads.zzqo r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r0.zzp()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r15.zzah     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r15.zzX     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0121
            goto L_0x0027
        L_0x0121:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x0352 }
            r1 = r15
            r2 = 1
            r19 = 0
            goto L_0x0347
        L_0x012a:
            com.google.android.gms.internal.ads.zzqu r0 = r15.zzw     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0335
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0330 }
            java.lang.String r0 = "drainAndFeed"
            int r1 = com.google.android.gms.internal.ads.zzew.zza     // Catch:{ IllegalStateException -> 0x0330 }
            android.os.Trace.beginSection(r0)     // Catch:{ IllegalStateException -> 0x0330 }
        L_0x0139:
            boolean r0 = r23.zzaE()     // Catch:{ IllegalStateException -> 0x0330 }
            if (r0 != 0) goto L_0x026b
            boolean r0 = r15.zzJ     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0160
            boolean r0 = r15.zzad     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0160
            com.google.android.gms.internal.ads.zzqu r0 = r15.zzw     // Catch:{ IllegalStateException -> 0x0150 }
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x0150 }
            int r0 = r0.zzb(r1)     // Catch:{ IllegalStateException -> 0x0150 }
            goto L_0x0168
        L_0x0150:
            r23.zzay()     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r15.zzai     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x015a
            r23.zzaq()     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x015a:
            r2 = r9
            r1 = r15
            r19 = 0
            goto L_0x0318
        L_0x0160:
            com.google.android.gms.internal.ads.zzqu r0 = r15.zzw     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x0352 }
            int r0 = r0.zzb(r1)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0168:
            if (r0 >= 0) goto L_0x01a3
            r1 = -2
            if (r0 != r1) goto L_0x0193
            r15.zzae = r14     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzqu r0 = r15.zzw     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaFormat r0 = r0.zzc()     // Catch:{ IllegalStateException -> 0x0352 }
            int r1 = r15.zzE     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x018e
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x0352 }
            r2 = 32
            if (r1 != r2) goto L_0x018e
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 != r2) goto L_0x018e
            r15.zzM = r14     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x01ae
        L_0x018e:
            r15.zzy = r0     // Catch:{ IllegalStateException -> 0x0352 }
            r15.zzz = r14     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x01ae
        L_0x0193:
            boolean r0 = r15.zzN     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x015a
            boolean r0 = r15.zzah     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x019f
            int r0 = r15.zzaa     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != r11) goto L_0x015a
        L_0x019f:
            r23.zzay()     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x015a
        L_0x01a3:
            boolean r1 = r15.zzM     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x01b6
            r15.zzM = r13     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzqu r1 = r15.zzw     // Catch:{ IllegalStateException -> 0x0352 }
            r1.zzn(r0, r13)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x01ae:
            r2 = r9
            r1 = r15
            r16 = 2
            r19 = 0
            goto L_0x0307
        L_0x01b6:
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x0352 }
            int r2 = r1.size     // Catch:{ IllegalStateException -> 0x0352 }
            if (r2 != 0) goto L_0x01c6
            int r1 = r1.flags     // Catch:{ IllegalStateException -> 0x0352 }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x01c6
            r23.zzay()     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x015a
        L_0x01c6:
            r15.zzR = r0     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzqu r1 = r15.zzw     // Catch:{ IllegalStateException -> 0x0352 }
            java.nio.ByteBuffer r0 = r1.zzg(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            r15.zzS = r0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x01e5
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x0352 }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x0352 }
            r0.position(r1)     // Catch:{ IllegalStateException -> 0x0352 }
            java.nio.ByteBuffer r0 = r15.zzS     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaCodec$BufferInfo r1 = r15.zzl     // Catch:{ IllegalStateException -> 0x0352 }
            int r2 = r1.offset     // Catch:{ IllegalStateException -> 0x0352 }
            int r1 = r1.size     // Catch:{ IllegalStateException -> 0x0352 }
            int r2 = r2 + r1
            r0.limit(r2)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x01e5:
            boolean r0 = r15.zzK     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0206
            android.media.MediaCodec$BufferInfo r0 = r15.zzl     // Catch:{ IllegalStateException -> 0x0352 }
            long r1 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0352 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0206
            int r1 = r0.flags     // Catch:{ IllegalStateException -> 0x0352 }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0206
            long r1 = r15.zzaf     // Catch:{ IllegalStateException -> 0x0352 }
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0206
            r0.presentationTimeUs = r1     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0206:
            android.media.MediaCodec$BufferInfo r0 = r15.zzl     // Catch:{ IllegalStateException -> 0x0352 }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0352 }
            java.util.ArrayList r2 = r15.zzk     // Catch:{ IllegalStateException -> 0x0352 }
            int r2 = r2.size()     // Catch:{ IllegalStateException -> 0x0352 }
            r3 = 0
        L_0x0211:
            if (r3 >= r2) goto L_0x022d
            java.util.ArrayList r4 = r15.zzk     // Catch:{ IllegalStateException -> 0x0352 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalStateException -> 0x0352 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ IllegalStateException -> 0x0352 }
            long r4 = r4.longValue()     // Catch:{ IllegalStateException -> 0x0352 }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x022a
            java.util.ArrayList r0 = r15.zzk     // Catch:{ IllegalStateException -> 0x0352 }
            r0.remove(r3)     // Catch:{ IllegalStateException -> 0x0352 }
            r0 = 1
            goto L_0x022e
        L_0x022a:
            int r3 = r3 + 1
            goto L_0x0211
        L_0x022d:
            r0 = 0
        L_0x022e:
            r15.zzT = r0     // Catch:{ IllegalStateException -> 0x0352 }
            long r0 = r15.zzag     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaCodec$BufferInfo r2 = r15.zzl     // Catch:{ IllegalStateException -> 0x0352 }
            long r2 = r2.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0352 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x023c
            r0 = 1
            goto L_0x023d
        L_0x023c:
            r0 = 0
        L_0x023d:
            r15.zzU = r0     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzet r0 = r15.zzj     // Catch:{ IllegalStateException -> 0x0352 }
            java.lang.Object r0 = r0.zzc(r2)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzaf r0 = (com.google.android.gms.internal.ads.zzaf) r0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x0255
            boolean r1 = r15.zzz     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x0255
            com.google.android.gms.internal.ads.zzet r0 = r15.zzj     // Catch:{ IllegalStateException -> 0x0352 }
            java.lang.Object r0 = r0.zzb()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.zzaf r0 = (com.google.android.gms.internal.ads.zzaf) r0     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0255:
            if (r0 == 0) goto L_0x025a
            r15.zzq = r0     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x0262
        L_0x025a:
            boolean r0 = r15.zzz     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x026b
            com.google.android.gms.internal.ads.zzaf r0 = r15.zzq     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x026b
        L_0x0262:
            com.google.android.gms.internal.ads.zzaf r0 = r15.zzq     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaFormat r1 = r15.zzy     // Catch:{ IllegalStateException -> 0x0352 }
            r15.zzaa(r0, r1)     // Catch:{ IllegalStateException -> 0x0352 }
            r15.zzz = r13     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x026b:
            boolean r0 = r15.zzJ     // Catch:{ IllegalStateException -> 0x0330 }
            if (r0 == 0) goto L_0x02c7
            boolean r0 = r15.zzad     // Catch:{ IllegalStateException -> 0x02c2 }
            if (r0 == 0) goto L_0x02c7
            com.google.android.gms.internal.ads.zzqu r6 = r15.zzw     // Catch:{ IllegalStateException -> 0x02a8 }
            java.nio.ByteBuffer r7 = r15.zzS     // Catch:{ IllegalStateException -> 0x02a8 }
            int r8 = r15.zzR     // Catch:{ IllegalStateException -> 0x02a8 }
            android.media.MediaCodec$BufferInfo r0 = r15.zzl     // Catch:{ IllegalStateException -> 0x02a8 }
            int r12 = r0.flags     // Catch:{ IllegalStateException -> 0x02a8 }
            r16 = 1
            long r4 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x02a8 }
            boolean r0 = r15.zzT     // Catch:{ IllegalStateException -> 0x02a8 }
            boolean r2 = r15.zzU     // Catch:{ IllegalStateException -> 0x02a8 }
            com.google.android.gms.internal.ads.zzaf r3 = r15.zzq     // Catch:{ IllegalStateException -> 0x02a8 }
            r1 = r23
            r17 = r2
            r18 = r3
            r2 = r24
            r19 = r4
            r4 = r26
            r21 = r9
            r9 = r12
            r10 = r16
            r16 = 2
            r11 = r19
            r19 = 0
            r13 = r0
            r14 = r17
            r15 = r18
            boolean r0 = r1.zzaf(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x02ac }
            goto L_0x02eb
        L_0x02a8:
            r21 = r9
            r19 = 0
        L_0x02ac:
            r23.zzay()     // Catch:{ IllegalStateException -> 0x02bc }
            r15 = r23
            boolean r0 = r15.zzai     // Catch:{ IllegalStateException -> 0x032d }
            if (r0 == 0) goto L_0x02b8
            r23.zzaq()     // Catch:{ IllegalStateException -> 0x032d }
        L_0x02b8:
            r1 = r15
        L_0x02b9:
            r2 = r21
            goto L_0x0318
        L_0x02bc:
            r0 = move-exception
            r2 = 1
        L_0x02be:
            r1 = r23
            goto L_0x0357
        L_0x02c2:
            r0 = move-exception
            r19 = 0
            goto L_0x032e
        L_0x02c7:
            r21 = r9
            r16 = 2
            r19 = 0
            com.google.android.gms.internal.ads.zzqu r6 = r15.zzw     // Catch:{ IllegalStateException -> 0x032d }
            java.nio.ByteBuffer r7 = r15.zzS     // Catch:{ IllegalStateException -> 0x032d }
            int r8 = r15.zzR     // Catch:{ IllegalStateException -> 0x032d }
            android.media.MediaCodec$BufferInfo r0 = r15.zzl     // Catch:{ IllegalStateException -> 0x032d }
            int r9 = r0.flags     // Catch:{ IllegalStateException -> 0x032d }
            r10 = 1
            long r11 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x032d }
            boolean r13 = r15.zzT     // Catch:{ IllegalStateException -> 0x032d }
            boolean r14 = r15.zzU     // Catch:{ IllegalStateException -> 0x032d }
            com.google.android.gms.internal.ads.zzaf r0 = r15.zzq     // Catch:{ IllegalStateException -> 0x032d }
            r1 = r23
            r2 = r24
            r4 = r26
            r15 = r0
            boolean r0 = r1.zzaf(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0329 }
        L_0x02eb:
            if (r0 == 0) goto L_0x0315
            r1 = r23
            android.media.MediaCodec$BufferInfo r0 = r1.zzl     // Catch:{ IllegalStateException -> 0x034f }
            long r2 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x034f }
            r1.zzao(r2)     // Catch:{ IllegalStateException -> 0x034f }
            android.media.MediaCodec$BufferInfo r0 = r1.zzl     // Catch:{ IllegalStateException -> 0x034f }
            int r0 = r0.flags     // Catch:{ IllegalStateException -> 0x034f }
            r0 = r0 & 4
            r23.zzaA()     // Catch:{ IllegalStateException -> 0x034f }
            if (r0 == 0) goto L_0x0305
            r23.zzay()     // Catch:{ IllegalStateException -> 0x034f }
            goto L_0x02b9
        L_0x0305:
            r2 = r21
        L_0x0307:
            boolean r0 = r1.zzaG(r2)     // Catch:{ IllegalStateException -> 0x034f }
            if (r0 != 0) goto L_0x030e
            goto L_0x0318
        L_0x030e:
            r15 = r1
            r9 = r2
            r11 = 2
            r13 = 0
            r14 = 1
            goto L_0x0139
        L_0x0315:
            r1 = r23
            goto L_0x02b9
        L_0x0318:
            boolean r0 = r23.zzaD()     // Catch:{ IllegalStateException -> 0x034f }
            if (r0 == 0) goto L_0x0324
            boolean r0 = r1.zzaG(r2)     // Catch:{ IllegalStateException -> 0x034f }
            if (r0 != 0) goto L_0x0318
        L_0x0324:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x034f }
            r2 = 1
            goto L_0x0347
        L_0x0329:
            r0 = move-exception
            r1 = r23
            goto L_0x0350
        L_0x032d:
            r0 = move-exception
        L_0x032e:
            r1 = r15
            goto L_0x0350
        L_0x0330:
            r0 = move-exception
            r1 = r15
            r19 = 0
            goto L_0x0350
        L_0x0335:
            r1 = r15
            r19 = 0
            com.google.android.gms.internal.ads.zzhb r0 = r1.zza     // Catch:{ IllegalStateException -> 0x034f }
            int r2 = r0.zzd     // Catch:{ IllegalStateException -> 0x034f }
            int r3 = r23.zzd(r24)     // Catch:{ IllegalStateException -> 0x034f }
            int r2 = r2 + r3
            r0.zzd = r2     // Catch:{ IllegalStateException -> 0x034f }
            r2 = 1
            r1.zzaF(r2)     // Catch:{ IllegalStateException -> 0x034d }
        L_0x0347:
            com.google.android.gms.internal.ads.zzhb r0 = r1.zza     // Catch:{ IllegalStateException -> 0x034d }
            r0.zza()     // Catch:{ IllegalStateException -> 0x034d }
            return
        L_0x034d:
            r0 = move-exception
            goto L_0x0357
        L_0x034f:
            r0 = move-exception
        L_0x0350:
            r2 = 1
            goto L_0x0357
        L_0x0352:
            r0 = move-exception
            r1 = r15
            r2 = 1
            r19 = 0
        L_0x0357:
            int r3 = com.google.android.gms.internal.ads.zzew.zza
            r4 = 21
            if (r3 < r4) goto L_0x0362
            boolean r5 = r0 instanceof android.media.MediaCodec.CodecException
            if (r5 == 0) goto L_0x0362
            goto L_0x0377
        L_0x0362:
            java.lang.StackTraceElement[] r5 = r0.getStackTrace()
            int r6 = r5.length
            if (r6 <= 0) goto L_0x03a0
            r5 = r5[r19]
            java.lang.String r5 = r5.getClassName()
            java.lang.String r6 = "android.media.MediaCodec"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x03a0
        L_0x0377:
            r1.zzX(r0)
            if (r3 < r4) goto L_0x038b
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x038b
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r3 = r3.isRecoverable()
            if (r3 == 0) goto L_0x038b
            r14 = 1
            goto L_0x038c
        L_0x038b:
            r14 = 0
        L_0x038c:
            if (r14 == 0) goto L_0x0391
            r23.zzaq()
        L_0x0391:
            com.google.android.gms.internal.ads.zzqx r2 = r1.zzD
            com.google.android.gms.internal.ads.zzqv r0 = r1.zzak(r0, r2)
            com.google.android.gms.internal.ads.zzaf r2 = r1.zzp
            r3 = 4003(0xfa3, float:5.61E-42)
            com.google.android.gms.internal.ads.zzhj r0 = r1.zzbe(r0, r2, r14, r3)
            throw r0
        L_0x03a0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzra.zzL(long, long):void");
    }

    public boolean zzM() {
        return this.zzai;
    }

    public boolean zzN() {
        if (this.zzp != null) {
            if (zzI() || zzaE()) {
                return true;
            }
            if (this.zzP == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.zzP) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int zzO(zzaf zzaf2) throws zzhj {
        try {
            return zzQ(this.zzd, zzaf2);
        } catch (zzrj e10) {
            throw zzbe(e10, zzaf2, false, 4002);
        }
    }

    /* access modifiers changed from: protected */
    public float zzP(float f10, zzaf zzaf2, zzaf[] zzafArr) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract int zzQ(zzrc zzrc, zzaf zzaf2) throws zzrj;

    /* access modifiers changed from: protected */
    public zzhc zzR(zzqx zzqx, zzaf zzaf2, zzaf zzaf3) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        if (zzaC() == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008c, code lost:
        if (zzaC() == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a0, code lost:
        if (zzaC() == false) goto L_0x00bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d5 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.zzhc zzS(com.google.android.gms.internal.ads.zzjo r12) throws com.google.android.gms.internal.ads.zzhj {
        /*
            r11 = this;
            r0 = 1
            r11.zzaj = r0
            com.google.android.gms.internal.ads.zzaf r4 = r12.zza
            java.util.Objects.requireNonNull(r4)
            java.lang.String r1 = r4.zzm
            r2 = 0
            if (r1 == 0) goto L_0x0103
            com.google.android.gms.internal.ads.zzqa r12 = r12.zzb
            r11.zzao = r12
            r11.zzp = r4
            boolean r1 = r11.zzV
            r3 = 0
            if (r1 == 0) goto L_0x001b
            r11.zzX = r0
            return r3
        L_0x001b:
            com.google.android.gms.internal.ads.zzqu r1 = r11.zzw
            if (r1 != 0) goto L_0x0025
            r11.zzB = r3
            r11.zzan()
            return r3
        L_0x0025:
            com.google.android.gms.internal.ads.zzqx r3 = r11.zzD
            com.google.android.gms.internal.ads.zzaf r5 = r11.zzx
            com.google.android.gms.internal.ads.zzqa r6 = r11.zzan
            r7 = 23
            if (r6 != r12) goto L_0x00d6
            if (r12 == r6) goto L_0x0033
            r12 = 1
            goto L_0x0034
        L_0x0033:
            r12 = 0
        L_0x0034:
            if (r12 == 0) goto L_0x003d
            int r6 = com.google.android.gms.internal.ads.zzew.zza
            if (r6 < r7) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r6 = 0
            goto L_0x003e
        L_0x003d:
            r6 = 1
        L_0x003e:
            com.google.android.gms.internal.ads.zzdl.zzf(r6)
            com.google.android.gms.internal.ads.zzhc r6 = r11.zzR(r3, r5, r4)
            int r7 = r6.zzd
            r8 = 3
            r9 = 16
            r10 = 2
            if (r7 == 0) goto L_0x00b8
            if (r7 == r0) goto L_0x008f
            if (r7 == r10) goto L_0x0063
            boolean r0 = r11.zzaH(r4)
            if (r0 != 0) goto L_0x0058
            goto L_0x0095
        L_0x0058:
            r11.zzx = r4
            if (r12 == 0) goto L_0x00bb
            boolean r12 = r11.zzaC()
            if (r12 != 0) goto L_0x00bb
            goto L_0x00bc
        L_0x0063:
            boolean r7 = r11.zzaH(r4)
            if (r7 != 0) goto L_0x006a
            goto L_0x0095
        L_0x006a:
            r11.zzY = r0
            r11.zzZ = r0
            int r7 = r11.zzE
            if (r7 == r10) goto L_0x0082
            if (r7 != r0) goto L_0x0081
            int r7 = r4.zzr
            int r9 = r5.zzr
            if (r7 != r9) goto L_0x0081
            int r7 = r4.zzs
            int r9 = r5.zzs
            if (r7 != r9) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            r11.zzL = r0
            r11.zzx = r4
            if (r12 == 0) goto L_0x00bb
            boolean r12 = r11.zzaC()
            if (r12 != 0) goto L_0x00bb
            goto L_0x00bc
        L_0x008f:
            boolean r7 = r11.zzaH(r4)
            if (r7 != 0) goto L_0x0098
        L_0x0095:
            r10 = 16
            goto L_0x00bc
        L_0x0098:
            r11.zzx = r4
            if (r12 == 0) goto L_0x00a3
            boolean r12 = r11.zzaC()
            if (r12 != 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00a3:
            boolean r12 = r11.zzac
            if (r12 == 0) goto L_0x00bb
            r11.zzaa = r0
            boolean r12 = r11.zzG
            if (r12 != 0) goto L_0x00b5
            boolean r12 = r11.zzI
            if (r12 == 0) goto L_0x00b2
            goto L_0x00b5
        L_0x00b2:
            r11.zzab = r0
            goto L_0x00bb
        L_0x00b5:
            r11.zzab = r8
            goto L_0x00bc
        L_0x00b8:
            r11.zzU()
        L_0x00bb:
            r10 = 0
        L_0x00bc:
            int r12 = r6.zzd
            if (r12 == 0) goto L_0x00d5
            com.google.android.gms.internal.ads.zzqu r12 = r11.zzw
            if (r12 != r1) goto L_0x00c8
            int r12 = r11.zzab
            if (r12 != r8) goto L_0x00d5
        L_0x00c8:
            com.google.android.gms.internal.ads.zzhc r12 = new com.google.android.gms.internal.ads.zzhc
            java.lang.String r2 = r3.zza
            r0 = 0
            r1 = r12
            r3 = r5
            r5 = r0
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r12
        L_0x00d5:
            return r6
        L_0x00d6:
            if (r12 == 0) goto L_0x00f2
            if (r6 != 0) goto L_0x00db
            goto L_0x00f2
        L_0x00db:
            java.util.UUID r12 = com.google.android.gms.internal.ads.zzo.zza
            boolean r0 = r12.equals(r12)
            if (r0 == 0) goto L_0x00f2
            int r0 = com.google.android.gms.internal.ads.zzew.zza
            if (r0 < r7) goto L_0x00f2
            java.util.UUID r0 = com.google.android.gms.internal.ads.zzo.zze
            boolean r1 = r0.equals(r12)
            if (r1 != 0) goto L_0x00f2
            r0.equals(r12)
        L_0x00f2:
            r11.zzU()
            com.google.android.gms.internal.ads.zzhc r12 = new com.google.android.gms.internal.ads.zzhc
            java.lang.String r2 = r3.zza
            r0 = 0
            r6 = 128(0x80, float:1.794E-43)
            r1 = r12
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r12
        L_0x0103:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.gms.internal.ads.zzhj r12 = r11.zzbe(r12, r4, r2, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzra.zzS(com.google.android.gms.internal.ads.zzjo):com.google.android.gms.internal.ads.zzhc");
    }

    /* access modifiers changed from: protected */
    public abstract zzqs zzV(zzqx zzqx, zzaf zzaf2, MediaCrypto mediaCrypto, float f10);

    /* access modifiers changed from: protected */
    public abstract List zzW(zzrc zzrc, zzaf zzaf2, boolean z10) throws zzrj;

    /* access modifiers changed from: protected */
    public void zzX(Exception exc) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzY(String str, zzqs zzqs, long j10, long j11) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzZ(String str) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzaa(zzaf zzaf2, MediaFormat mediaFormat) throws zzhj {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzac() {
    }

    /* access modifiers changed from: protected */
    public void zzad(zzgr zzgr) throws zzhj {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzae() throws zzhj {
    }

    /* access modifiers changed from: protected */
    public abstract boolean zzaf(long j10, long j11, zzqu zzqu, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzaf zzaf2) throws zzhj;

    /* access modifiers changed from: protected */
    public boolean zzag(zzaf zzaf2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final float zzah() {
        return this.zzu;
    }

    /* access modifiers changed from: protected */
    public final long zzai() {
        return this.zzal;
    }

    /* access modifiers changed from: protected */
    public final zzqu zzaj() {
        return this.zzw;
    }

    /* access modifiers changed from: protected */
    public zzqv zzak(Throwable th, zzqx zzqx) {
        return new zzqv(th, zzqx);
    }

    /* access modifiers changed from: protected */
    public final zzqx zzal() {
        return this.zzD;
    }

    /* access modifiers changed from: protected */
    public void zzam(zzgr zzgr) throws zzhj {
    }

    /* access modifiers changed from: protected */
    public final void zzan() throws zzhj {
        zzaf zzaf2;
        if (this.zzw == null && !this.zzV && (zzaf2 = this.zzp) != null) {
            if (this.zzao != null || !zzag(zzaf2)) {
                zzqa zzqa = this.zzao;
                this.zzan = zzqa;
                zzaf zzaf3 = this.zzp;
                String str = zzaf3.zzm;
                if (zzqa == null || !zzqb.zza) {
                    try {
                        if (this.zzB == null) {
                            List zzW2 = zzW(this.zzd, zzaf3, false);
                            zzW2.isEmpty();
                            this.zzB = new ArrayDeque();
                            if (!zzW2.isEmpty()) {
                                this.zzB.add((zzqx) zzW2.get(0));
                            }
                            this.zzC = null;
                        }
                        if (!this.zzB.isEmpty()) {
                            zzqx zzqx = (zzqx) this.zzB.peekFirst();
                            while (this.zzw == null) {
                                zzqx zzqx2 = (zzqx) this.zzB.peekFirst();
                                if (zzav(zzqx2)) {
                                    try {
                                        zzax(zzqx2, (MediaCrypto) null);
                                    } catch (Exception e10) {
                                        if (zzqx2 == zzqx) {
                                            zzee.zze("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                                            Thread.sleep(50);
                                            zzax(zzqx2, (MediaCrypto) null);
                                        } else {
                                            throw e10;
                                        }
                                    } catch (Exception e11) {
                                        zzee.zzf("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(zzqx2)), e11);
                                        this.zzB.removeFirst();
                                        zzqz zzqz = new zzqz(this.zzp, (Throwable) e11, false, zzqx2);
                                        zzX(zzqz);
                                        zzqz zzqz2 = this.zzC;
                                        if (zzqz2 == null) {
                                            this.zzC = zzqz;
                                        } else {
                                            this.zzC = zzqz.zza(zzqz2, zzqz);
                                        }
                                        if (this.zzB.isEmpty()) {
                                            throw this.zzC;
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                            this.zzB = null;
                            return;
                        }
                        throw new zzqz(this.zzp, (Throwable) null, false, -49999);
                    } catch (zzrj e12) {
                        throw new zzqz(this.zzp, (Throwable) e12, false, -49998);
                    } catch (zzqz e13) {
                        throw zzbe(e13, this.zzp, false, 4001);
                    }
                } else {
                    zzpr zza2 = zzqa.zza();
                    throw zzbe(zza2, this.zzp, false, zza2.zza);
                }
            } else {
                zzaf zzaf4 = this.zzp;
                zzT();
                String str2 = zzaf4.zzm;
                if ("audio/mp4a-latm".equals(str2) || "audio/mpeg".equals(str2) || "audio/opus".equals(str2)) {
                    this.zzi.zzn(32);
                } else {
                    this.zzi.zzn(1);
                }
                this.zzV = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void zzao(long j10) {
        while (true) {
            int i10 = this.zzam;
            if (i10 != 0 && j10 >= this.zzo[0]) {
                long[] jArr = this.zzm;
                this.zzak = jArr[0];
                this.zzal = this.zzn[0];
                int i11 = i10 - 1;
                this.zzam = i11;
                System.arraycopy(jArr, 1, jArr, 0, i11);
                long[] jArr2 = this.zzn;
                System.arraycopy(jArr2, 1, jArr2, 0, this.zzam);
                long[] jArr3 = this.zzo;
                System.arraycopy(jArr3, 1, jArr3, 0, this.zzam);
                zzac();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void zzap(zzaf zzaf2) throws zzhj {
    }

    /* access modifiers changed from: protected */
    public final void zzaq() {
        try {
            zzqu zzqu = this.zzw;
            if (zzqu != null) {
                zzqu.zzl();
                this.zza.zzb++;
                zzZ(this.zzD.zza);
            }
        } finally {
            this.zzw = null;
            this.zzr = null;
            this.zzan = null;
            zzas();
        }
    }

    /* access modifiers changed from: protected */
    public void zzar() {
        zzaz();
        zzaA();
        this.zzP = -9223372036854775807L;
        this.zzad = false;
        this.zzac = false;
        this.zzL = false;
        this.zzM = false;
        this.zzT = false;
        this.zzU = false;
        this.zzk.clear();
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        zzqp zzqp = this.zzO;
        if (zzqp != null) {
            zzqp.zzc();
        }
        this.zzaa = 0;
        this.zzab = 0;
        this.zzZ = this.zzY ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public final void zzas() {
        zzar();
        this.zzO = null;
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzae = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzN = false;
        this.zzY = false;
        this.zzZ = 0;
        this.zzs = false;
    }

    /* access modifiers changed from: protected */
    public final boolean zzat() throws zzhj {
        boolean zzau = zzau();
        if (zzau) {
            zzan();
        }
        return zzau;
    }

    /* access modifiers changed from: protected */
    public final boolean zzau() {
        if (this.zzw == null) {
            return false;
        }
        int i10 = this.zzab;
        if (i10 == 3 || this.zzG || ((this.zzH && !this.zzae) || (this.zzI && this.zzad))) {
            zzaq();
            return true;
        }
        if (i10 == 2) {
            int i11 = zzew.zza;
            zzdl.zzf(i11 >= 23);
            if (i11 >= 23) {
                try {
                    zzaB();
                } catch (zzhj e10) {
                    zzee.zzf("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    zzaq();
                    return true;
                }
            }
        }
        zzab();
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean zzav(zzqx zzqx) {
        return true;
    }

    public final int zze() {
        return 8;
    }

    /* access modifiers changed from: protected */
    public void zzs() {
        this.zzp = null;
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        this.zzam = 0;
        zzau();
    }

    /* access modifiers changed from: protected */
    public void zzt(boolean z10, boolean z11) throws zzhj {
        this.zza = new zzhb();
    }

    /* access modifiers changed from: protected */
    public void zzu(long j10, boolean z10) throws zzhj {
        this.zzah = false;
        this.zzai = false;
        if (this.zzV) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzW = false;
        } else {
            zzat();
        }
        zzet zzet = this.zzj;
        if (zzet.zza() > 0) {
            this.zzaj = true;
        }
        zzet.zze();
        int i10 = this.zzam;
        if (i10 != 0) {
            int i11 = i10 - 1;
            this.zzal = this.zzn[i11];
            this.zzak = this.zzm[i11];
            this.zzam = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void zzv() {
        try {
            zzT();
            zzaq();
        } finally {
            this.zzao = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzy(zzaf[] zzafArr, long j10, long j11) throws zzhj {
        boolean z10 = true;
        if (this.zzal == -9223372036854775807L) {
            if (this.zzak != -9223372036854775807L) {
                z10 = false;
            }
            zzdl.zzf(z10);
            this.zzak = j10;
            this.zzal = j11;
            return;
        }
        int i10 = this.zzam;
        if (i10 == 10) {
            zzee.zze("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.zzn[9]);
        } else {
            this.zzam = i10 + 1;
        }
        long[] jArr = this.zzm;
        int i11 = this.zzam - 1;
        jArr[i11] = j10;
        this.zzn[i11] = j11;
        this.zzo[i11] = this.zzaf;
    }
}
