package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaeu implements zzzu {
    public static final zzaab zza = zzaeq.zza;
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */
    public static final byte[] zzc = zzew.zzab("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] zzd = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] zze = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    /* access modifiers changed from: private */
    public static final UUID zzf = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */
    public static final Map zzg;
    private long zzA;
    private zzaet zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    private zzef zzJ;
    private zzef zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzzx zzai;
    private final zzaep zzh;
    private final zzaew zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzen zzl;
    private final zzen zzm;
    private final zzen zzn;
    private final zzen zzo;
    private final zzen zzp;
    private final zzen zzq;
    private final zzen zzr;
    private final zzen zzs;
    private final zzen zzt;
    private final zzen zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(hashMap);
    }

    public zzaeu() {
        this(0);
    }

    protected static final int zzn(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected static final boolean zzo(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    private final int zzp(zzzv zzzv, zzaet zzaet, int i10, boolean z10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(zzaet.zzb)) {
            zzx(zzzv, zzb, i10);
            int i12 = this.zzaa;
            zzw();
            return i12;
        } else if ("S_TEXT/ASS".equals(zzaet.zzb)) {
            zzx(zzzv, zzd, i10);
            int i13 = this.zzaa;
            zzw();
            return i13;
        } else if ("S_TEXT/WEBVTT".equals(zzaet.zzb)) {
            zzx(zzzv, zze, i10);
            int i14 = this.zzaa;
            zzw();
            return i14;
        } else {
            zzabb zzabb = zzaet.zzV;
            boolean z11 = true;
            if (!this.zzac) {
                if (zzaet.zzg) {
                    this.zzV &= -1073741825;
                    int i15 = 128;
                    if (!this.zzad) {
                        ((zzzk) zzzv).zzn(this.zzn.zzH(), 0, 1, false);
                        this.zzZ++;
                        if ((this.zzn.zzH()[0] & 128) != 128) {
                            this.zzag = this.zzn.zzH()[0];
                            this.zzad = true;
                        } else {
                            throw zzbu.zza("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b10 = this.zzag;
                    if ((b10 & 1) == 1) {
                        byte b11 = b10 & 2;
                        this.zzV |= 1073741824;
                        if (!this.zzah) {
                            ((zzzk) zzzv).zzn(this.zzs.zzH(), 0, 8, false);
                            this.zzZ += 8;
                            this.zzah = true;
                            byte[] zzH2 = this.zzn.zzH();
                            if (b11 != 2) {
                                i15 = 0;
                            }
                            zzH2[0] = (byte) (i15 | 8);
                            this.zzn.zzF(0);
                            zzabb.zzr(this.zzn, 1, 1);
                            this.zzaa++;
                            this.zzs.zzF(0);
                            zzabb.zzr(this.zzs, 8, 1);
                            this.zzaa += 8;
                        }
                        if (b11 == 2) {
                            if (!this.zzae) {
                                ((zzzk) zzzv).zzn(this.zzn.zzH(), 0, 1, false);
                                this.zzZ++;
                                this.zzn.zzF(0);
                                this.zzaf = this.zzn.zzk();
                                this.zzae = true;
                            }
                            int i16 = this.zzaf * 4;
                            this.zzn.zzC(i16);
                            ((zzzk) zzzv).zzn(this.zzn.zzH(), 0, i16, false);
                            this.zzZ += i16;
                            int i17 = (this.zzaf >> 1) + 1;
                            int i18 = (i17 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzv;
                            if (byteBuffer == null || byteBuffer.capacity() < i18) {
                                this.zzv = ByteBuffer.allocate(i18);
                            }
                            this.zzv.position(0);
                            this.zzv.putShort((short) i17);
                            int i19 = 0;
                            int i20 = 0;
                            while (true) {
                                i11 = this.zzaf;
                                if (i19 >= i11) {
                                    break;
                                }
                                int zzn2 = this.zzn.zzn();
                                if (i19 % 2 == 0) {
                                    this.zzv.putShort((short) (zzn2 - i20));
                                } else {
                                    this.zzv.putInt(zzn2 - i20);
                                }
                                i19++;
                                i20 = zzn2;
                            }
                            int i21 = (i10 - this.zzZ) - i20;
                            if ((i11 & 1) == 1) {
                                this.zzv.putInt(i21);
                            } else {
                                this.zzv.putShort((short) i21);
                                this.zzv.putInt(0);
                            }
                            this.zzt.zzD(this.zzv.array(), i18);
                            zzabb.zzr(this.zzt, i18, 1);
                            this.zzaa += i18;
                        }
                    }
                } else {
                    byte[] bArr = zzaet.zzh;
                    if (bArr != null) {
                        this.zzq.zzD(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(zzaet.zzb) ? zzaet.zzf > 0 : z10) {
                    this.zzV |= 268435456;
                    this.zzu.zzC(0);
                    int zzd2 = (this.zzq.zzd() + i10) - this.zzZ;
                    this.zzn.zzC(4);
                    this.zzn.zzH()[0] = (byte) ((zzd2 >> 24) & 255);
                    this.zzn.zzH()[1] = (byte) ((zzd2 >> 16) & 255);
                    this.zzn.zzH()[2] = (byte) ((zzd2 >> 8) & 255);
                    this.zzn.zzH()[3] = (byte) (zzd2 & 255);
                    zzabb.zzr(this.zzn, 4, 2);
                    this.zzaa += 4;
                }
                this.zzac = true;
            }
            int zzd3 = i10 + this.zzq.zzd();
            if (!"V_MPEG4/ISO/AVC".equals(zzaet.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzaet.zzb)) {
                if (zzaet.zzS != null) {
                    if (this.zzq.zzd() != 0) {
                        z11 = false;
                    }
                    zzdl.zzf(z11);
                    zzaet.zzS.zzd(zzzv);
                }
                while (true) {
                    int i22 = this.zzZ;
                    if (i22 >= zzd3) {
                        break;
                    }
                    int zzq2 = zzq(zzzv, zzabb, zzd3 - i22);
                    this.zzZ += zzq2;
                    this.zzaa += zzq2;
                }
            } else {
                byte[] zzH3 = this.zzm.zzH();
                zzH3[0] = 0;
                zzH3[1] = 0;
                zzH3[2] = 0;
                int i23 = zzaet.zzW;
                int i24 = 4 - i23;
                while (this.zzZ < zzd3) {
                    int i25 = this.zzab;
                    if (i25 == 0) {
                        int min = Math.min(i23, this.zzq.zza());
                        ((zzzk) zzzv).zzn(zzH3, i24 + min, i23 - min, false);
                        if (min > 0) {
                            this.zzq.zzB(zzH3, i24, min);
                        }
                        this.zzZ += i23;
                        this.zzm.zzF(0);
                        this.zzab = this.zzm.zzn();
                        this.zzl.zzF(0);
                        zzaaz.zzb(zzabb, this.zzl, 4);
                        this.zzaa += 4;
                    } else {
                        int zzq3 = zzq(zzzv, zzabb, i25);
                        this.zzZ += zzq3;
                        this.zzaa += zzq3;
                        this.zzab -= zzq3;
                    }
                }
            }
            if ("A_VORBIS".equals(zzaet.zzb)) {
                this.zzo.zzF(0);
                zzaaz.zzb(zzabb, this.zzo, 4);
                this.zzaa += 4;
            }
            int i26 = this.zzaa;
            zzw();
            return i26;
        }
    }

    private final int zzq(zzzv zzzv, zzabb zzabb, int i10) throws IOException {
        int zza2 = this.zzq.zza();
        if (zza2 <= 0) {
            return zzaaz.zza(zzabb, zzzv, i10, false);
        }
        int min = Math.min(i10, zza2);
        zzaaz.zzb(zzabb, this.zzq, min);
        return min;
    }

    private final long zzr(long j10) throws zzbu {
        long j11 = this.zzy;
        if (j11 != -9223372036854775807L) {
            return zzew.zzw(j10, j11, 1000);
        }
        throw zzbu.zza("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    private final void zzs(int i10) throws zzbu {
        if (this.zzJ == null || this.zzK == null) {
            throw zzbu.zza("Element " + i10 + " must be in a Cues", (Throwable) null);
        }
    }

    private final void zzt(int i10) throws zzbu {
        if (this.zzB == null) {
            throw zzbu.zza("Element " + i10 + " must be in a TrackEntry", (Throwable) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e0 A[EDGE_INSN: B:59:0x00e0->B:48:0x00e0 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzu(com.google.android.gms.internal.ads.zzaet r18, long r19, int r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.android.gms.internal.ads.zzabc r2 = r1.zzS
            r9 = 1
            if (r2 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.zzabb r3 = r1.zzV
            com.google.android.gms.internal.ads.zzaba r8 = r1.zzi
            r1 = r2
            r2 = r3
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r1.zzc(r2, r3, r5, r6, r7, r8)
            goto L_0x0121
        L_0x001c:
            java.lang.String r2 = r1.zzb
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r2 = r3.equals(r2)
            java.lang.String r4 = "S_TEXT/WEBVTT"
            java.lang.String r5 = "S_TEXT/ASS"
            r6 = 0
            r7 = 2
            if (r2 != 0) goto L_0x003c
            java.lang.String r2 = r1.zzb
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x003c
            java.lang.String r2 = r1.zzb
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0058
        L_0x003c:
            int r2 = r0.zzR
            java.lang.String r8 = "MatroskaExtractor"
            if (r2 <= r9) goto L_0x0048
            java.lang.String r2 = "Skipping subtitle sample in laced block."
            com.google.android.gms.internal.ads.zzee.zze(r8, r2)
            goto L_0x0058
        L_0x0048:
            long r10 = r0.zzP
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x005c
            java.lang.String r2 = "Skipping subtitle sample with no duration."
            com.google.android.gms.internal.ads.zzee.zze(r8, r2)
        L_0x0058:
            r2 = r22
            goto L_0x00f3
        L_0x005c:
            java.lang.String r2 = r1.zzb
            com.google.android.gms.internal.ads.zzen r8 = r0.zzr
            byte[] r8 = r8.zzH()
            int r12 = r2.hashCode()
            r13 = 738597099(0x2c0618eb, float:1.9056378E-12)
            if (r12 == r13) goto L_0x0088
            r5 = 1045209816(0x3e4ca2d8, float:0.19983995)
            if (r12 == r5) goto L_0x0080
            r4 = 1422270023(0x54c61e47, float:6.807292E12)
            if (r12 == r4) goto L_0x0078
            goto L_0x0090
        L_0x0078:
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0090
            r2 = 0
            goto L_0x0091
        L_0x0080:
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0090
            r2 = 2
            goto L_0x0091
        L_0x0088:
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0090
            r2 = 1
            goto L_0x0091
        L_0x0090:
            r2 = -1
        L_0x0091:
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x00b3
            if (r2 == r9) goto L_0x00a8
            if (r2 != r7) goto L_0x00a2
            r2 = 25
            java.lang.String r5 = "%02d:%02d:%02d.%03d"
            byte[] r3 = zzy(r10, r5, r3)
            goto L_0x00bb
        L_0x00a2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x00a8:
            r2 = 21
            r3 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r5 = "%01d:%02d:%02d:%02d"
            byte[] r3 = zzy(r10, r5, r3)
            goto L_0x00bb
        L_0x00b3:
            r2 = 19
            java.lang.String r5 = "%02d:%02d:%02d,%03d"
            byte[] r3 = zzy(r10, r5, r3)
        L_0x00bb:
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r6, r8, r2, r4)
            com.google.android.gms.internal.ads.zzen r2 = r0.zzr
            int r2 = r2.zzc()
        L_0x00c5:
            com.google.android.gms.internal.ads.zzen r3 = r0.zzr
            int r3 = r3.zzd()
            if (r2 >= r3) goto L_0x00e0
            com.google.android.gms.internal.ads.zzen r3 = r0.zzr
            byte[] r3 = r3.zzH()
            byte r3 = r3[r2]
            if (r3 != 0) goto L_0x00dd
            com.google.android.gms.internal.ads.zzen r3 = r0.zzr
            r3.zzE(r2)
            goto L_0x00e0
        L_0x00dd:
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x00e0:
            com.google.android.gms.internal.ads.zzabb r2 = r1.zzV
            com.google.android.gms.internal.ads.zzen r3 = r0.zzr
            int r4 = r3.zzd()
            com.google.android.gms.internal.ads.zzaaz.zzb(r2, r3, r4)
            com.google.android.gms.internal.ads.zzen r2 = r0.zzr
            int r2 = r2.zzd()
            int r2 = r22 + r2
        L_0x00f3:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r21 & r3
            if (r3 == 0) goto L_0x0111
            int r3 = r0.zzR
            if (r3 <= r9) goto L_0x0103
            com.google.android.gms.internal.ads.zzen r3 = r0.zzu
            r3.zzC(r6)
            goto L_0x0111
        L_0x0103:
            com.google.android.gms.internal.ads.zzen r3 = r0.zzu
            int r3 = r3.zzd()
            com.google.android.gms.internal.ads.zzabb r4 = r1.zzV
            com.google.android.gms.internal.ads.zzen r5 = r0.zzu
            r4.zzr(r5, r3, r7)
            int r2 = r2 + r3
        L_0x0111:
            r14 = r2
            com.google.android.gms.internal.ads.zzabb r10 = r1.zzV
            com.google.android.gms.internal.ads.zzaba r1 = r1.zzi
            r11 = r19
            r13 = r21
            r15 = r23
            r16 = r1
            r10.zzs(r11, r13, r14, r15, r16)
        L_0x0121:
            r0.zzM = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeu.zzu(com.google.android.gms.internal.ads.zzaet, long, int, int, int):void");
    }

    private final void zzv(zzzv zzzv, int i10) throws IOException {
        if (this.zzn.zzd() < i10) {
            if (this.zzn.zzb() < i10) {
                zzen zzen = this.zzn;
                int zzb2 = zzen.zzb();
                zzen.zzz(Math.max(zzb2 + zzb2, i10));
            }
            ((zzzk) zzzv).zzn(this.zzn.zzH(), this.zzn.zzd(), i10 - this.zzn.zzd(), false);
            this.zzn.zzE(i10);
        }
    }

    private final void zzw() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = 0;
        this.zzah = false;
        this.zzq.zzC(0);
    }

    private final void zzx(zzzv zzzv, byte[] bArr, int i10) throws IOException {
        int length = bArr.length;
        int i11 = length + i10;
        if (this.zzr.zzb() < i11) {
            zzen zzen = this.zzr;
            byte[] copyOf = Arrays.copyOf(bArr, i11 + i10);
            zzen.zzD(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzH(), 0, length);
        }
        ((zzzk) zzzv).zzn(this.zzr.zzH(), length, i10, false);
        this.zzr.zzF(0);
        this.zzr.zzE(i11);
    }

    private static byte[] zzy(long j10, String str, long j11) {
        zzdl.zzd(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        return zzew.zzab(String.format(Locale.US, str, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))}));
    }

    private static int[] zzz(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    public final int zza(zzzv zzzv, zzaau zzaau) throws IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (this.zzh.zzc(zzzv)) {
                long zzf2 = zzzv.zzf();
                if (this.zzF) {
                    this.zzH = zzf2;
                    zzaau.zza = this.zzG;
                    this.zzF = false;
                    return 1;
                } else if (this.zzC) {
                    long j10 = this.zzH;
                    if (j10 != -1) {
                        zzaau.zza = j10;
                        this.zzH = -1;
                        return 1;
                    }
                }
            } else {
                for (int i10 = 0; i10 < this.zzj.size(); i10++) {
                    zzaet zzaet = (zzaet) this.zzj.valueAt(i10);
                    Objects.requireNonNull(zzaet.zzV);
                    zzabc zzabc = zzaet.zzS;
                    if (zzabc != null) {
                        zzabc.zza(zzaet.zzV, zzaet.zzi);
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    public final void zzb(zzzx zzzx) {
        this.zzai = zzzx;
    }

    public final void zzc(long j10, long j11) {
        this.zzI = -9223372036854775807L;
        this.zzN = 0;
        this.zzh.zzb();
        this.zzi.zze();
        zzw();
        for (int i10 = 0; i10 < this.zzj.size(); i10++) {
            zzabc zzabc = ((zzaet) this.zzj.valueAt(i10)).zzS;
            if (zzabc != null) {
                zzabc.zzb();
            }
        }
    }

    public final boolean zzd(zzzv zzzv) throws IOException {
        return new zzaev().zza(zzzv);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x027e, code lost:
        throw com.google.android.gms.internal.ads.zzbu.zza("EBML lacing sample size out of range.", (java.lang.Throwable) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(int r20, int r21, com.google.android.gms.internal.ads.zzzv r22) throws java.io.IOException {
        /*
            r19 = this;
            r7 = r19
            r0 = r20
            r1 = r21
            r8 = r22
            r2 = 161(0xa1, float:2.26E-43)
            r3 = 0
            r4 = 4
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            if (r0 == r2) goto L_0x0112
            if (r0 == r5) goto L_0x0112
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto L_0x00dc
            r2 = 16877(0x41ed, float:2.365E-41)
            if (r0 == r2) goto L_0x00b2
            r2 = 16981(0x4255, float:2.3795E-41)
            if (r0 == r2) goto L_0x00a2
            r2 = 18402(0x47e2, float:2.5787E-41)
            if (r0 == r2) goto L_0x008d
            r2 = 21419(0x53ab, float:3.0014E-41)
            if (r0 == r2) goto L_0x0067
            r2 = 25506(0x63a2, float:3.5742E-41)
            if (r0 == r2) goto L_0x0057
            r2 = 30322(0x7672, float:4.249E-41)
            if (r0 != r2) goto L_0x0041
            r19.zzt(r20)
            com.google.android.gms.internal.ads.zzaet r0 = r7.zzB
            byte[] r2 = new byte[r1]
            r0.zzu = r2
            r0 = r8
            com.google.android.gms.internal.ads.zzzk r0 = (com.google.android.gms.internal.ads.zzzk) r0
            r0.zzn(r2, r10, r1, r10)
            return
        L_0x0041:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected id: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.zza(r0, r3)
            throw r0
        L_0x0057:
            r19.zzt(r20)
            com.google.android.gms.internal.ads.zzaet r0 = r7.zzB
            byte[] r2 = new byte[r1]
            r0.zzj = r2
            r0 = r8
            com.google.android.gms.internal.ads.zzzk r0 = (com.google.android.gms.internal.ads.zzzk) r0
            r0.zzn(r2, r10, r1, r10)
            return
        L_0x0067:
            com.google.android.gms.internal.ads.zzen r0 = r7.zzp
            byte[] r0 = r0.zzH()
            java.util.Arrays.fill(r0, r10)
            com.google.android.gms.internal.ads.zzen r0 = r7.zzp
            byte[] r0 = r0.zzH()
            int r2 = 4 - r1
            r3 = r8
            com.google.android.gms.internal.ads.zzzk r3 = (com.google.android.gms.internal.ads.zzzk) r3
            r3.zzn(r0, r2, r1, r10)
            com.google.android.gms.internal.ads.zzen r0 = r7.zzp
            r0.zzF(r10)
            com.google.android.gms.internal.ads.zzen r0 = r7.zzp
            long r0 = r0.zzs()
            int r1 = (int) r0
            r7.zzD = r1
            return
        L_0x008d:
            byte[] r2 = new byte[r1]
            r3 = r8
            com.google.android.gms.internal.ads.zzzk r3 = (com.google.android.gms.internal.ads.zzzk) r3
            r3.zzn(r2, r10, r1, r10)
            r19.zzt(r20)
            com.google.android.gms.internal.ads.zzaet r0 = r7.zzB
            com.google.android.gms.internal.ads.zzaba r1 = new com.google.android.gms.internal.ads.zzaba
            r1.<init>(r9, r2, r10, r10)
            r0.zzi = r1
            return
        L_0x00a2:
            r19.zzt(r20)
            com.google.android.gms.internal.ads.zzaet r0 = r7.zzB
            byte[] r2 = new byte[r1]
            r0.zzh = r2
            r0 = r8
            com.google.android.gms.internal.ads.zzzk r0 = (com.google.android.gms.internal.ads.zzzk) r0
            r0.zzn(r2, r10, r1, r10)
            return
        L_0x00b2:
            r19.zzt(r20)
            com.google.android.gms.internal.ads.zzaet r0 = r7.zzB
            int r2 = r0.zzX
            r3 = 1685485123(0x64767643, float:1.8185683E22)
            if (r2 == r3) goto L_0x00d1
            int r2 = r0.zzX
            r3 = 1685480259(0x64766343, float:1.8180206E22)
            if (r2 != r3) goto L_0x00ca
            goto L_0x00d1
        L_0x00ca:
            r0 = r8
            com.google.android.gms.internal.ads.zzzk r0 = (com.google.android.gms.internal.ads.zzzk) r0
            r0.zzo(r1, r10)
            return
        L_0x00d1:
            byte[] r2 = new byte[r1]
            r0.zzM = r2
            r0 = r8
            com.google.android.gms.internal.ads.zzzk r0 = (com.google.android.gms.internal.ads.zzzk) r0
            r0.zzn(r2, r10, r1, r10)
            return
        L_0x00dc:
            int r0 = r7.zzN
            if (r0 == r6) goto L_0x00e1
            return
        L_0x00e1:
            android.util.SparseArray r0 = r7.zzj
            int r2 = r7.zzT
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.ads.zzaet r0 = (com.google.android.gms.internal.ads.zzaet) r0
            int r2 = r7.zzW
            if (r2 != r4) goto L_0x010b
            java.lang.String r0 = r0.zzb
            java.lang.String r2 = "V_VP9"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x010b
            com.google.android.gms.internal.ads.zzen r0 = r7.zzu
            r0.zzC(r1)
            com.google.android.gms.internal.ads.zzen r0 = r7.zzu
            byte[] r0 = r0.zzH()
            r2 = r8
            com.google.android.gms.internal.ads.zzzk r2 = (com.google.android.gms.internal.ads.zzzk) r2
            r2.zzn(r0, r10, r1, r10)
            return
        L_0x010b:
            r0 = r8
            com.google.android.gms.internal.ads.zzzk r0 = (com.google.android.gms.internal.ads.zzzk) r0
            r0.zzo(r1, r10)
            return
        L_0x0112:
            int r2 = r7.zzN
            r11 = 8
            if (r2 != 0) goto L_0x0137
            com.google.android.gms.internal.ads.zzaew r2 = r7.zzi
            long r12 = r2.zzd(r8, r10, r9, r11)
            int r2 = (int) r12
            r7.zzT = r2
            com.google.android.gms.internal.ads.zzaew r2 = r7.zzi
            int r2 = r2.zza()
            r7.zzU = r2
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.zzP = r12
            r7.zzN = r9
            com.google.android.gms.internal.ads.zzen r2 = r7.zzn
            r2.zzC(r10)
        L_0x0137:
            android.util.SparseArray r2 = r7.zzj
            int r12 = r7.zzT
            java.lang.Object r2 = r2.get(r12)
            r12 = r2
            com.google.android.gms.internal.ads.zzaet r12 = (com.google.android.gms.internal.ads.zzaet) r12
            if (r12 != 0) goto L_0x0151
            int r0 = r7.zzU
            int r0 = r1 - r0
            r1 = r8
            com.google.android.gms.internal.ads.zzzk r1 = (com.google.android.gms.internal.ads.zzzk) r1
            r1.zzo(r0, r10)
            r7.zzN = r10
            return
        L_0x0151:
            java.util.Objects.requireNonNull(r12.zzV)
            int r2 = r7.zzN
            if (r2 != r9) goto L_0x02dd
            r2 = 3
            r7.zzv(r8, r2)
            com.google.android.gms.internal.ads.zzen r13 = r7.zzn
            byte[] r13 = r13.zzH()
            byte r13 = r13[r6]
            r13 = r13 & 6
            int r13 = r13 >> r9
            r14 = 255(0xff, float:3.57E-43)
            if (r13 != 0) goto L_0x017e
            r7.zzR = r9
            int[] r2 = r7.zzS
            int[] r2 = zzz(r2, r9)
            r7.zzS = r2
            int r3 = r7.zzU
            int r1 = r1 - r3
            int r1 = r1 + -3
            r2[r10] = r1
            goto L_0x028f
        L_0x017e:
            r7.zzv(r8, r4)
            com.google.android.gms.internal.ads.zzen r15 = r7.zzn
            byte[] r15 = r15.zzH()
            byte r15 = r15[r2]
            r15 = r15 & r14
            int r15 = r15 + r9
            r7.zzR = r15
            int[] r4 = r7.zzS
            int[] r4 = zzz(r4, r15)
            r7.zzS = r4
            if (r13 != r6) goto L_0x01a4
            int r2 = r7.zzU
            int r1 = r1 - r2
            int r1 = r1 + -4
            int r2 = r7.zzR
            int r1 = r1 / r2
            java.util.Arrays.fill(r4, r10, r2, r1)
            goto L_0x028f
        L_0x01a4:
            if (r13 != r9) goto L_0x01dc
            r2 = 0
            r3 = 0
            r4 = 4
        L_0x01a9:
            int r13 = r7.zzR
            int r13 = r13 + -1
            if (r2 >= r13) goto L_0x01d1
            int[] r13 = r7.zzS
            r13[r2] = r10
        L_0x01b3:
            int r4 = r4 + r9
            r7.zzv(r8, r4)
            com.google.android.gms.internal.ads.zzen r13 = r7.zzn
            byte[] r13 = r13.zzH()
            int r15 = r4 + -1
            byte r13 = r13[r15]
            r13 = r13 & r14
            int[] r15 = r7.zzS
            r16 = r15[r2]
            int r16 = r16 + r13
            r15[r2] = r16
            if (r13 == r14) goto L_0x01b3
            int r3 = r3 + r16
            int r2 = r2 + 1
            goto L_0x01a9
        L_0x01d1:
            int[] r2 = r7.zzS
            int r15 = r7.zzU
            int r1 = r1 - r15
            int r1 = r1 - r4
            int r1 = r1 - r3
            r2[r13] = r1
            goto L_0x028f
        L_0x01dc:
            if (r13 != r2) goto L_0x02d6
            r2 = 0
            r4 = 4
            r13 = 0
        L_0x01e1:
            int r15 = r7.zzR
            int r15 = r15 + -1
            if (r2 >= r15) goto L_0x0286
            int[] r15 = r7.zzS
            r15[r2] = r10
            int r4 = r4 + 1
            r7.zzv(r8, r4)
            com.google.android.gms.internal.ads.zzen r15 = r7.zzn
            byte[] r15 = r15.zzH()
            int r16 = r4 + -1
            byte r15 = r15[r16]
            if (r15 == 0) goto L_0x027f
            r15 = 0
        L_0x01fd:
            if (r15 >= r11) goto L_0x0250
            int r17 = 7 - r15
            int r5 = r9 << r17
            com.google.android.gms.internal.ads.zzen r6 = r7.zzn
            byte[] r6 = r6.zzH()
            byte r6 = r6[r16]
            r6 = r6 & r5
            if (r6 == 0) goto L_0x0246
            int r4 = r4 + r15
            r7.zzv(r8, r4)
            com.google.android.gms.internal.ads.zzen r6 = r7.zzn
            byte[] r6 = r6.zzH()
            int r18 = r16 + 1
            byte r6 = r6[r16]
            r6 = r6 & r14
            int r5 = ~r5
            r5 = r5 & r6
            long r5 = (long) r5
            r9 = r18
        L_0x0222:
            if (r9 >= r4) goto L_0x0238
            long r5 = r5 << r11
            com.google.android.gms.internal.ads.zzen r11 = r7.zzn
            byte[] r11 = r11.zzH()
            int r16 = r9 + 1
            byte r9 = r11[r9]
            r9 = r9 & r14
            long r10 = (long) r9
            long r5 = r5 | r10
            r9 = r16
            r10 = 0
            r11 = 8
            goto L_0x0222
        L_0x0238:
            if (r2 <= 0) goto L_0x0252
            r9 = 1
            int r15 = r15 * 7
            int r15 = r15 + 6
            long r9 = r9 << r15
            r15 = -1
            long r9 = r9 + r15
            long r5 = r5 - r9
            goto L_0x0252
        L_0x0246:
            int r15 = r15 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            r11 = 8
            goto L_0x01fd
        L_0x0250:
            r5 = 0
        L_0x0252:
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0278
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x0278
            int[] r9 = r7.zzS
            int r6 = (int) r5
            if (r2 == 0) goto L_0x026a
            int r5 = r2 + -1
            r5 = r9[r5]
            int r6 = r6 + r5
        L_0x026a:
            r9[r2] = r6
            int r13 = r13 + r6
            int r2 = r2 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            r11 = 8
            goto L_0x01e1
        L_0x0278:
            java.lang.String r0 = "EBML lacing sample size out of range."
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.zza(r0, r3)
            throw r0
        L_0x027f:
            java.lang.String r0 = "No valid varint length mask found"
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.zza(r0, r3)
            throw r0
        L_0x0286:
            int[] r2 = r7.zzS
            int r3 = r7.zzU
            int r1 = r1 - r3
            int r1 = r1 - r4
            int r1 = r1 - r13
            r2[r15] = r1
        L_0x028f:
            com.google.android.gms.internal.ads.zzen r1 = r7.zzn
            byte[] r1 = r1.zzH()
            r2 = 0
            byte r1 = r1[r2]
            r2 = 8
            int r1 = r1 << r2
            com.google.android.gms.internal.ads.zzen r2 = r7.zzn
            byte[] r2 = r2.zzH()
            r3 = 1
            byte r2 = r2[r3]
            r2 = r2 & r14
            long r3 = r7.zzI
            r1 = r1 | r2
            long r1 = (long) r1
            long r1 = r7.zzr(r1)
            long r3 = r3 + r1
            r7.zzO = r3
            int r1 = r12.zzd
            r2 = 2
            if (r1 == r2) goto L_0x02cd
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x02cb
            com.google.android.gms.internal.ads.zzen r0 = r7.zzn
            byte[] r0 = r0.zzH()
            byte r0 = r0[r2]
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L_0x02c9
            r0 = 163(0xa3, float:2.28E-43)
            goto L_0x02cd
        L_0x02c9:
            r0 = 163(0xa3, float:2.28E-43)
        L_0x02cb:
            r1 = 0
            goto L_0x02ce
        L_0x02cd:
            r1 = 1
        L_0x02ce:
            r7.zzV = r1
            r7.zzN = r2
            r1 = 0
            r7.zzQ = r1
            goto L_0x02dd
        L_0x02d6:
            java.lang.String r0 = "Unexpected lacing value: 2"
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.zza(r0, r3)
            throw r0
        L_0x02dd:
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x0310
        L_0x02e1:
            int r0 = r7.zzQ
            int r1 = r7.zzR
            if (r0 >= r1) goto L_0x030c
            int[] r1 = r7.zzS
            r0 = r1[r0]
            r1 = 0
            int r5 = r7.zzp(r8, r12, r0, r1)
            long r0 = r7.zzO
            int r2 = r7.zzQ
            int r3 = r12.zze
            int r2 = r2 * r3
            int r2 = r2 / 1000
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r7.zzV
            r6 = 0
            r0 = r19
            r1 = r12
            r0.zzu(r1, r2, r4, r5, r6)
            int r0 = r7.zzQ
            r1 = 1
            int r0 = r0 + r1
            r7.zzQ = r0
            goto L_0x02e1
        L_0x030c:
            r0 = 0
            r7.zzN = r0
            return
        L_0x0310:
            r1 = 1
        L_0x0311:
            int r0 = r7.zzQ
            int r2 = r7.zzR
            if (r0 >= r2) goto L_0x0327
            int[] r2 = r7.zzS
            r3 = r2[r0]
            int r3 = r7.zzp(r8, r12, r3, r1)
            r2[r0] = r3
            int r0 = r7.zzQ
            int r0 = r0 + r1
            r7.zzQ = r0
            goto L_0x0311
        L_0x0327:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeu.zzg(int, int, com.google.android.gms.internal.ads.zzzv):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01e8, code lost:
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L_0x0315;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzh(int r22) throws com.google.android.gms.internal.ads.zzbu {
        /*
            r21 = this;
            r7 = r21
            r0 = r22
            com.google.android.gms.internal.ads.zzzx r1 = r7.zzai
            com.google.android.gms.internal.ads.zzdl.zzb(r1)
            r1 = 160(0xa0, float:2.24E-43)
            r2 = 8
            java.lang.String r3 = "A_OPUS"
            r4 = 2
            r5 = 0
            if (r0 == r1) goto L_0x0334
            r1 = 174(0xae, float:2.44E-43)
            r10 = -1
            if (r0 == r1) goto L_0x018a
            r1 = 19899(0x4dbb, float:2.7884E-41)
            r2 = -1
            r4 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r0 == r1) goto L_0x0172
            r1 = 25152(0x6240, float:3.5245E-41)
            if (r0 == r1) goto L_0x013f
            r1 = 28032(0x6d80, float:3.9281E-41)
            if (r0 == r1) goto L_0x0129
            r1 = 357149030(0x1549a966, float:4.072526E-26)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == r1) goto L_0x0111
            r1 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r0 == r1) goto L_0x00fb
            if (r0 == r4) goto L_0x003d
            goto L_0x0181
        L_0x003d:
            boolean r0 = r7.zzC
            if (r0 != 0) goto L_0x00f5
            com.google.android.gms.internal.ads.zzzx r0 = r7.zzai
            com.google.android.gms.internal.ads.zzef r1 = r7.zzJ
            com.google.android.gms.internal.ads.zzef r4 = r7.zzK
            long r14 = r7.zzx
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L_0x00e8
            long r2 = r7.zzA
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x00e8
            if (r1 == 0) goto L_0x00e8
            int r2 = r1.zza()
            if (r2 == 0) goto L_0x00e8
            if (r4 == 0) goto L_0x00e8
            int r2 = r4.zza()
            int r3 = r1.zza()
            if (r2 == r3) goto L_0x0069
            goto L_0x00e8
        L_0x0069:
            int r2 = r1.zza()
            int[] r3 = new int[r2]
            long[] r12 = new long[r2]
            long[] r13 = new long[r2]
            long[] r14 = new long[r2]
            r15 = 0
        L_0x0076:
            if (r15 >= r2) goto L_0x008b
            long r16 = r1.zzb(r15)
            r14[r15] = r16
            long r8 = r7.zzx
            long r18 = r4.zzb(r15)
            long r8 = r8 + r18
            r12[r15] = r8
            int r15 = r15 + 1
            goto L_0x0076
        L_0x008b:
            r9 = 0
        L_0x008c:
            int r1 = r2 + -1
            if (r9 >= r1) goto L_0x00a6
            int r1 = r9 + 1
            r17 = r12[r1]
            r19 = r12[r9]
            long r10 = r17 - r19
            int r4 = (int) r10
            r3[r9] = r4
            r10 = r14[r1]
            r17 = r14[r9]
            long r10 = r10 - r17
            r13[r9] = r10
            r9 = r1
            r10 = -1
            goto L_0x008c
        L_0x00a6:
            long r8 = r7.zzx
            long r10 = r7.zzw
            long r8 = r8 + r10
            r10 = r12[r1]
            long r8 = r8 - r10
            int r2 = (int) r8
            r3[r1] = r2
            long r8 = r7.zzA
            r10 = r14[r1]
            long r8 = r8 - r10
            r13[r1] = r8
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x00e2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Discarding last cue point with unexpected duration: "
            r2.append(r4)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "MatroskaExtractor"
            com.google.android.gms.internal.ads.zzee.zze(r4, r2)
            int[] r3 = java.util.Arrays.copyOf(r3, r1)
            long[] r12 = java.util.Arrays.copyOf(r12, r1)
            long[] r13 = java.util.Arrays.copyOf(r13, r1)
            long[] r14 = java.util.Arrays.copyOf(r14, r1)
        L_0x00e2:
            com.google.android.gms.internal.ads.zzzi r1 = new com.google.android.gms.internal.ads.zzzi
            r1.<init>(r3, r12, r13, r14)
            goto L_0x00ef
        L_0x00e8:
            com.google.android.gms.internal.ads.zzaaw r1 = new com.google.android.gms.internal.ads.zzaaw
            long r2 = r7.zzA
            r1.<init>(r2, r5)
        L_0x00ef:
            r0.zzN(r1)
            r0 = 1
            r7.zzC = r0
        L_0x00f5:
            r0 = 0
            r7.zzJ = r0
            r7.zzK = r0
            return
        L_0x00fb:
            r0 = 0
            android.util.SparseArray r1 = r7.zzj
            int r1 = r1.size()
            if (r1 == 0) goto L_0x010a
            com.google.android.gms.internal.ads.zzzx r0 = r7.zzai
            r0.zzC()
            return
        L_0x010a:
            java.lang.String r1 = "No valid tracks were found"
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.zza(r1, r0)
            throw r0
        L_0x0111:
            long r0 = r7.zzy
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x011c
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r7.zzy = r0
        L_0x011c:
            long r0 = r7.zzz
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x0181
            long r0 = r7.zzr(r0)
            r7.zzA = r0
            return
        L_0x0129:
            r21.zzt(r22)
            com.google.android.gms.internal.ads.zzaet r0 = r7.zzB
            boolean r1 = r0.zzg
            if (r1 == 0) goto L_0x0181
            byte[] r0 = r0.zzh
            if (r0 != 0) goto L_0x0137
            goto L_0x0181
        L_0x0137:
            java.lang.String r0 = "Combining encryption and compression is not supported"
            r1 = 0
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.zza(r0, r1)
            throw r0
        L_0x013f:
            r21.zzt(r22)
            com.google.android.gms.internal.ads.zzaet r0 = r7.zzB
            boolean r1 = r0.zzg
            if (r1 == 0) goto L_0x0181
            com.google.android.gms.internal.ads.zzaba r1 = r0.zzi
            if (r1 == 0) goto L_0x016a
            com.google.android.gms.internal.ads.zzx r1 = new com.google.android.gms.internal.ads.zzx
            r2 = 1
            com.google.android.gms.internal.ads.zzw[] r2 = new com.google.android.gms.internal.ads.zzw[r2]
            com.google.android.gms.internal.ads.zzw r3 = new com.google.android.gms.internal.ads.zzw
            java.util.UUID r4 = com.google.android.gms.internal.ads.zzo.zza
            com.google.android.gms.internal.ads.zzaet r5 = r7.zzB
            com.google.android.gms.internal.ads.zzaba r5 = r5.zzi
            byte[] r5 = r5.zzb
            java.lang.String r6 = "video/webm"
            r8 = 0
            r3.<init>(r4, r8, r6, r5)
            r4 = 0
            r2[r4] = r3
            r1.<init>(r8, r2)
            r0.zzk = r1
            return
        L_0x016a:
            r8 = 0
            java.lang.String r0 = "Encrypted Track found but ContentEncKeyID was not found"
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.zza(r0, r8)
            throw r0
        L_0x0172:
            int r0 = r7.zzD
            r1 = -1
            if (r0 == r1) goto L_0x0182
            long r5 = r7.zzE
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0182
            if (r0 != r4) goto L_0x0181
            r7.zzG = r5
        L_0x0181:
            return
        L_0x0182:
            java.lang.String r0 = "Mandatory element SeekID or SeekPosition not found"
            r1 = 0
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.zza(r0, r1)
            throw r0
        L_0x018a:
            r1 = -1
            com.google.android.gms.internal.ads.zzaet r0 = r7.zzB
            com.google.android.gms.internal.ads.zzdl.zzb(r0)
            java.lang.String r5 = r0.zzb
            if (r5 == 0) goto L_0x032c
            int r6 = r5.hashCode()
            switch(r6) {
                case -2095576542: goto L_0x030a;
                case -2095575984: goto L_0x0300;
                case -1985379776: goto L_0x02f5;
                case -1784763192: goto L_0x02ea;
                case -1730367663: goto L_0x02df;
                case -1482641358: goto L_0x02d4;
                case -1482641357: goto L_0x02c9;
                case -1373388978: goto L_0x02be;
                case -933872740: goto L_0x02b3;
                case -538363189: goto L_0x02a8;
                case -538363109: goto L_0x029d;
                case -425012669: goto L_0x0291;
                case -356037306: goto L_0x0285;
                case 62923557: goto L_0x0279;
                case 62923603: goto L_0x026d;
                case 62927045: goto L_0x0261;
                case 82318131: goto L_0x0256;
                case 82338133: goto L_0x024b;
                case 82338134: goto L_0x0240;
                case 99146302: goto L_0x0234;
                case 444813526: goto L_0x0228;
                case 542569478: goto L_0x021c;
                case 635596514: goto L_0x0210;
                case 725948237: goto L_0x0204;
                case 725957860: goto L_0x01f8;
                case 738597099: goto L_0x01ec;
                case 855502857: goto L_0x01e2;
                case 1045209816: goto L_0x01d6;
                case 1422270023: goto L_0x01ca;
                case 1809237540: goto L_0x01bf;
                case 1950749482: goto L_0x01b3;
                case 1950789798: goto L_0x01a7;
                case 1951062397: goto L_0x019d;
                default: goto L_0x019b;
            }
        L_0x019b:
            goto L_0x0314
        L_0x019d:
            boolean r2 = r5.equals(r3)
            if (r2 == 0) goto L_0x0314
            r2 = 11
            goto L_0x0315
        L_0x01a7:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 22
            goto L_0x0315
        L_0x01b3:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 17
            goto L_0x0315
        L_0x01bf:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 3
            goto L_0x0315
        L_0x01ca:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 27
            goto L_0x0315
        L_0x01d6:
            java.lang.String r2 = "S_TEXT/WEBVTT"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 29
            goto L_0x0315
        L_0x01e2:
            java.lang.String r3 = "V_MPEGH/ISO/HEVC"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0314
            goto L_0x0315
        L_0x01ec:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 28
            goto L_0x0315
        L_0x01f8:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 24
            goto L_0x0315
        L_0x0204:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 25
            goto L_0x0315
        L_0x0210:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 26
            goto L_0x0315
        L_0x021c:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 20
            goto L_0x0315
        L_0x0228:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 10
            goto L_0x0315
        L_0x0234:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 31
            goto L_0x0315
        L_0x0240:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 1
            goto L_0x0315
        L_0x024b:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 0
            goto L_0x0315
        L_0x0256:
            java.lang.String r2 = "V_AV1"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 2
            goto L_0x0315
        L_0x0261:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 19
            goto L_0x0315
        L_0x026d:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 16
            goto L_0x0315
        L_0x0279:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 13
            goto L_0x0315
        L_0x0285:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 21
            goto L_0x0315
        L_0x0291:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 30
            goto L_0x0315
        L_0x029d:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 7
            goto L_0x0315
        L_0x02a8:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 5
            goto L_0x0315
        L_0x02b3:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 32
            goto L_0x0315
        L_0x02be:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 9
            goto L_0x0315
        L_0x02c9:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 15
            goto L_0x0315
        L_0x02d4:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 14
            goto L_0x0315
        L_0x02df:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 12
            goto L_0x0315
        L_0x02ea:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 18
            goto L_0x0315
        L_0x02f5:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 23
            goto L_0x0315
        L_0x0300:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 4
            goto L_0x0315
        L_0x030a:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 6
            goto L_0x0315
        L_0x0314:
            r2 = -1
        L_0x0315:
            switch(r2) {
                case 0: goto L_0x031a;
                case 1: goto L_0x031a;
                case 2: goto L_0x031a;
                case 3: goto L_0x031a;
                case 4: goto L_0x031a;
                case 5: goto L_0x031a;
                case 6: goto L_0x031a;
                case 7: goto L_0x031a;
                case 8: goto L_0x031a;
                case 9: goto L_0x031a;
                case 10: goto L_0x031a;
                case 11: goto L_0x031a;
                case 12: goto L_0x031a;
                case 13: goto L_0x031a;
                case 14: goto L_0x031a;
                case 15: goto L_0x031a;
                case 16: goto L_0x031a;
                case 17: goto L_0x031a;
                case 18: goto L_0x031a;
                case 19: goto L_0x031a;
                case 20: goto L_0x031a;
                case 21: goto L_0x031a;
                case 22: goto L_0x031a;
                case 23: goto L_0x031a;
                case 24: goto L_0x031a;
                case 25: goto L_0x031a;
                case 26: goto L_0x031a;
                case 27: goto L_0x031a;
                case 28: goto L_0x031a;
                case 29: goto L_0x031a;
                case 30: goto L_0x031a;
                case 31: goto L_0x031a;
                case 32: goto L_0x031a;
                default: goto L_0x0318;
            }
        L_0x0318:
            r0 = 0
            goto L_0x0329
        L_0x031a:
            com.google.android.gms.internal.ads.zzzx r1 = r7.zzai
            int r2 = r0.zzc
            r0.zze(r1, r2)
            android.util.SparseArray r1 = r7.zzj
            int r2 = r0.zzc
            r1.put(r2, r0)
            goto L_0x0318
        L_0x0329:
            r7.zzB = r0
            return
        L_0x032c:
            r0 = 0
            java.lang.String r1 = "CodecId is missing in TrackEntry element"
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.zza(r1, r0)
            throw r0
        L_0x0334:
            int r0 = r7.zzN
            if (r0 == r4) goto L_0x0339
            return
        L_0x0339:
            android.util.SparseArray r0 = r7.zzj
            int r1 = r7.zzT
            java.lang.Object r0 = r0.get(r1)
            r8 = r0
            com.google.android.gms.internal.ads.zzaet r8 = (com.google.android.gms.internal.ads.zzaet) r8
            java.util.Objects.requireNonNull(r8.zzV)
            long r0 = r7.zzY
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x036f
            java.lang.String r0 = r8.zzb
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x036f
            com.google.android.gms.internal.ads.zzen r0 = r7.zzu
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            long r2 = r7.zzY
            java.nio.ByteBuffer r1 = r1.putLong(r2)
            byte[] r1 = r1.array()
            int r2 = r1.length
            r0.zzD(r1, r2)
        L_0x036f:
            r0 = 0
            r4 = 0
        L_0x0371:
            int r1 = r7.zzR
            if (r4 >= r1) goto L_0x037d
            int[] r1 = r7.zzS
            r1 = r1[r4]
            int r0 = r0 + r1
            int r4 = r4 + 1
            goto L_0x0371
        L_0x037d:
            r4 = 0
        L_0x037e:
            int r1 = r7.zzR
            if (r4 >= r1) goto L_0x03ae
            long r1 = r7.zzO
            int r3 = r8.zze
            int r3 = r3 * r4
            int r3 = r3 / 1000
            long r5 = (long) r3
            long r2 = r1 + r5
            int r1 = r7.zzV
            if (r4 != 0) goto L_0x039a
            boolean r4 = r7.zzX
            if (r4 != 0) goto L_0x0397
            r1 = r1 | 1
        L_0x0397:
            r4 = r1
            r9 = 0
            goto L_0x039c
        L_0x039a:
            r9 = r4
            r4 = r1
        L_0x039c:
            int[] r1 = r7.zzS
            r5 = r1[r9]
            int r10 = r0 - r5
            r0 = r21
            r1 = r8
            r6 = r10
            r0.zzu(r1, r2, r4, r5, r6)
            r0 = 1
            int r4 = r9 + 1
            r0 = r10
            goto L_0x037e
        L_0x03ae:
            r1 = 0
            r7.zzN = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeu.zzh(int):void");
    }

    /* access modifiers changed from: protected */
    public final void zzi(int i10, double d10) throws zzbu {
        if (i10 == 181) {
            zzt(i10);
            this.zzB.zzP = (int) d10;
        } else if (i10 != 17545) {
            switch (i10) {
                case 21969:
                    zzt(i10);
                    this.zzB.zzC = (float) d10;
                    return;
                case 21970:
                    zzt(i10);
                    this.zzB.zzD = (float) d10;
                    return;
                case 21971:
                    zzt(i10);
                    this.zzB.zzE = (float) d10;
                    return;
                case 21972:
                    zzt(i10);
                    this.zzB.zzF = (float) d10;
                    return;
                case 21973:
                    zzt(i10);
                    this.zzB.zzG = (float) d10;
                    return;
                case 21974:
                    zzt(i10);
                    this.zzB.zzH = (float) d10;
                    return;
                case 21975:
                    zzt(i10);
                    this.zzB.zzI = (float) d10;
                    return;
                case 21976:
                    zzt(i10);
                    this.zzB.zzJ = (float) d10;
                    return;
                case 21977:
                    zzt(i10);
                    this.zzB.zzK = (float) d10;
                    return;
                case 21978:
                    zzt(i10);
                    this.zzB.zzL = (float) d10;
                    return;
                default:
                    switch (i10) {
                        case 30323:
                            zzt(i10);
                            this.zzB.zzr = (float) d10;
                            return;
                        case 30324:
                            zzt(i10);
                            this.zzB.zzs = (float) d10;
                            return;
                        case 30325:
                            zzt(i10);
                            this.zzB.zzt = (float) d10;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.zzz = (long) d10;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzj(int i10, long j10) throws zzbu {
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        zzt(i10);
                        this.zzB.zzd = (int) j10;
                        return;
                    case 136:
                        zzt(i10);
                        zzaet zzaet = this.zzB;
                        if (j10 == 1) {
                            z10 = true;
                        }
                        zzaet.zzU = z10;
                        return;
                    case 155:
                        this.zzP = zzr(j10);
                        return;
                    case 159:
                        zzt(i10);
                        this.zzB.zzN = (int) j10;
                        return;
                    case 176:
                        zzt(i10);
                        this.zzB.zzl = (int) j10;
                        return;
                    case 179:
                        zzs(i10);
                        this.zzJ.zzc(zzr(j10));
                        return;
                    case 186:
                        zzt(i10);
                        this.zzB.zzm = (int) j10;
                        return;
                    case 215:
                        zzt(i10);
                        this.zzB.zzc = (int) j10;
                        return;
                    case 231:
                        this.zzI = zzr(j10);
                        return;
                    case 238:
                        this.zzW = (int) j10;
                        return;
                    case 241:
                        if (!this.zzL) {
                            zzs(i10);
                            this.zzK.zzc(j10);
                            this.zzL = true;
                            return;
                        }
                        return;
                    case 251:
                        this.zzX = true;
                        return;
                    case 16871:
                        zzt(i10);
                        this.zzB.zzX = (int) j10;
                        return;
                    case 16980:
                        if (j10 != 3) {
                            throw zzbu.zza("ContentCompAlgo " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j10 < 1 || j10 > 2) {
                            throw zzbu.zza("DocTypeReadVersion " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j10 != 1) {
                            throw zzbu.zza("EBMLReadVersion " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j10 != 5) {
                            throw zzbu.zza("ContentEncAlgo " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j10 != 1) {
                            throw zzbu.zza("AESSettingsCipherMode " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.zzE = j10 + this.zzx;
                        return;
                    case 21432:
                        int i11 = (int) j10;
                        zzt(i10);
                        if (i11 == 0) {
                            this.zzB.zzv = 0;
                            return;
                        } else if (i11 == 1) {
                            this.zzB.zzv = 2;
                            return;
                        } else if (i11 == 3) {
                            this.zzB.zzv = 1;
                            return;
                        } else if (i11 == 15) {
                            this.zzB.zzv = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        zzt(i10);
                        this.zzB.zzn = (int) j10;
                        return;
                    case 21682:
                        zzt(i10);
                        this.zzB.zzp = (int) j10;
                        return;
                    case 21690:
                        zzt(i10);
                        this.zzB.zzo = (int) j10;
                        return;
                    case 21930:
                        zzt(i10);
                        zzaet zzaet2 = this.zzB;
                        if (j10 == 1) {
                            z10 = true;
                        }
                        zzaet2.zzT = z10;
                        return;
                    case 21998:
                        zzt(i10);
                        this.zzB.zzf = (int) j10;
                        return;
                    case 22186:
                        zzt(i10);
                        this.zzB.zzQ = j10;
                        return;
                    case 22203:
                        zzt(i10);
                        this.zzB.zzR = j10;
                        return;
                    case 25188:
                        zzt(i10);
                        this.zzB.zzO = (int) j10;
                        return;
                    case 30114:
                        this.zzY = j10;
                        return;
                    case 30321:
                        zzt(i10);
                        int i12 = (int) j10;
                        if (i12 == 0) {
                            this.zzB.zzq = 0;
                            return;
                        } else if (i12 == 1) {
                            this.zzB.zzq = 1;
                            return;
                        } else if (i12 == 2) {
                            this.zzB.zzq = 2;
                            return;
                        } else if (i12 == 3) {
                            this.zzB.zzq = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        zzt(i10);
                        this.zzB.zze = (int) j10;
                        return;
                    case 2807729:
                        this.zzy = j10;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                zzt(i10);
                                int i13 = (int) j10;
                                if (i13 == 1) {
                                    this.zzB.zzz = 2;
                                    return;
                                } else if (i13 == 2) {
                                    this.zzB.zzz = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                zzt(i10);
                                int zzb2 = zzq.zzb((int) j10);
                                if (zzb2 != -1) {
                                    this.zzB.zzy = zzb2;
                                    return;
                                }
                                return;
                            case 21947:
                                zzt(i10);
                                this.zzB.zzw = true;
                                int zza2 = zzq.zza((int) j10);
                                if (zza2 != -1) {
                                    this.zzB.zzx = zza2;
                                    return;
                                }
                                return;
                            case 21948:
                                zzt(i10);
                                this.zzB.zzA = (int) j10;
                                return;
                            case 21949:
                                zzt(i10);
                                this.zzB.zzB = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j10 != 1) {
                throw zzbu.zza("ContentEncodingScope " + j10 + " not supported", (Throwable) null);
            }
        } else if (j10 != 0) {
            throw zzbu.zza("ContentEncodingOrder " + j10 + " not supported", (Throwable) null);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzk(int i10, long j10, long j11) throws zzbu {
        zzdl.zzb(this.zzai);
        if (i10 == 160) {
            this.zzX = false;
            this.zzY = 0;
        } else if (i10 == 174) {
            this.zzB = new zzaet();
        } else if (i10 == 187) {
            this.zzL = false;
        } else if (i10 == 19899) {
            this.zzD = -1;
            this.zzE = -1;
        } else if (i10 == 20533) {
            zzt(i10);
            this.zzB.zzg = true;
        } else if (i10 == 21968) {
            zzt(i10);
            this.zzB.zzw = true;
        } else if (i10 == 408125543) {
            long j12 = this.zzx;
            if (j12 == -1 || j12 == j10) {
                this.zzx = j10;
                this.zzw = j11;
                return;
            }
            throw zzbu.zza("Multiple Segment elements not supported", (Throwable) null);
        } else if (i10 == 475249515) {
            this.zzJ = new zzef(32);
            this.zzK = new zzef(32);
        } else if (i10 != 524531317 || this.zzC) {
        } else {
            if (!this.zzk || this.zzG == -1) {
                this.zzai.zzN(new zzaaw(this.zzA, 0));
                this.zzC = true;
                return;
            }
            this.zzF = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzl(int i10, String str) throws zzbu {
        if (i10 == 134) {
            zzt(i10);
            this.zzB.zzb = str;
        } else if (i10 != 17026) {
            if (i10 == 21358) {
                zzt(i10);
                this.zzB.zza = str;
            } else if (i10 == 2274716) {
                zzt(i10);
                this.zzB.zzY = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw zzbu.zza("DocType " + str + " not supported", (Throwable) null);
        }
    }

    public zzaeu(int i10) {
        zzaen zzaen = new zzaen();
        this.zzx = -1;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzG = -1;
        this.zzH = -1;
        this.zzI = -9223372036854775807L;
        this.zzh = zzaen;
        zzaen.zza(new zzaes(this, (zzaer) null));
        this.zzk = true;
        this.zzi = new zzaew();
        this.zzj = new SparseArray();
        this.zzn = new zzen(4);
        this.zzo = new zzen(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzen(4);
        this.zzl = new zzen(zzaar.zza);
        this.zzm = new zzen(4);
        this.zzq = new zzen();
        this.zzr = new zzen();
        this.zzs = new zzen(8);
        this.zzt = new zzen();
        this.zzu = new zzen();
        this.zzS = new int[1];
    }
}
