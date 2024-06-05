package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzafx implements zzzu {
    public static final zzaab zza = zzaft.zza;
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzaf zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzzx zzD;
    private zzabb[] zzE;
    private zzabb[] zzF;
    private boolean zzG;
    private final List zzd;
    private final SparseArray zze;
    private final zzen zzf;
    private final zzen zzg;
    private final zzen zzh;
    private final byte[] zzi;
    private final zzen zzj;
    private final zzacs zzk;
    private final zzen zzl;
    private final ArrayDeque zzm;
    private final ArrayDeque zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    private zzen zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private zzafw zzy;
    private int zzz;

    static {
        zzad zzad = new zzad();
        zzad.zzS("application/x-emsg");
        zzc = zzad.zzY();
    }

    public zzafx() {
        this(0, (zzeu) null);
    }

    private static int zze(int i10) throws zzbu {
        if (i10 >= 0) {
            return i10;
        }
        throw zzbu.zza("Unexpected negative value: " + i10, (Throwable) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzx zzf(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L_0x0008:
            if (r3 >= r0) goto L_0x00b9
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.zzafi r5 = (com.google.android.gms.internal.ads.zzafi) r5
            int r6 = r5.zzd
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto L_0x00b5
            if (r4 != 0) goto L_0x001e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x001e:
            com.google.android.gms.internal.ads.zzen r5 = r5.zza
            byte[] r5 = r5.zzH()
            com.google.android.gms.internal.ads.zzen r6 = new com.google.android.gms.internal.ads.zzen
            r6.<init>((byte[]) r5)
            int r8 = r6.zzd()
            r9 = 32
            if (r8 >= r9) goto L_0x0033
        L_0x0031:
            r6 = r2
            goto L_0x0099
        L_0x0033:
            r6.zzF(r1)
            int r8 = r6.zze()
            int r9 = r6.zza()
            int r9 = r9 + 4
            if (r8 == r9) goto L_0x0043
            goto L_0x0031
        L_0x0043:
            int r8 = r6.zze()
            if (r8 == r7) goto L_0x004a
            goto L_0x0031
        L_0x004a:
            int r7 = r6.zze()
            int r7 = com.google.android.gms.internal.ads.zzafj.zze(r7)
            r8 = 1
            if (r7 <= r8) goto L_0x006c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            com.google.android.gms.internal.ads.zzee.zze(r7, r6)
            goto L_0x0031
        L_0x006c:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.zzr()
            long r12 = r6.zzr()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L_0x0084
            int r8 = r6.zzn()
            int r8 = r8 * 16
            r6.zzG(r8)
        L_0x0084:
            int r8 = r6.zzn()
            int r10 = r6.zza()
            if (r8 == r10) goto L_0x008f
            goto L_0x0031
        L_0x008f:
            byte[] r10 = new byte[r8]
            r6.zzB(r10, r1, r8)
            com.google.android.gms.internal.ads.zzagd r6 = new com.google.android.gms.internal.ads.zzagd
            r6.<init>(r9, r7, r10)
        L_0x0099:
            if (r6 != 0) goto L_0x009d
            r6 = r2
            goto L_0x00a1
        L_0x009d:
            java.util.UUID r6 = r6.zza
        L_0x00a1:
            if (r6 != 0) goto L_0x00ab
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            com.google.android.gms.internal.ads.zzee.zze(r5, r6)
            goto L_0x00b5
        L_0x00ab:
            com.google.android.gms.internal.ads.zzw r7 = new com.google.android.gms.internal.ads.zzw
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r2, r8, r5)
            r4.add(r7)
        L_0x00b5:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x00b9:
            if (r4 != 0) goto L_0x00bc
            return r2
        L_0x00bc:
            com.google.android.gms.internal.ads.zzx r14 = new com.google.android.gms.internal.ads.zzx
            r14.<init>((java.util.List) r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafx.zzf(java.util.List):com.google.android.gms.internal.ads.zzx");
    }

    private final void zzg() {
        this.zzo = 0;
        this.zzr = 0;
    }

    private static void zzh(zzen zzen, int i10, zzagi zzagi) throws zzbu {
        zzen.zzF(i10 + 8);
        int zze2 = zzen.zze() & 16777215;
        if ((zze2 & 1) == 0) {
            boolean z10 = (zze2 & 2) != 0;
            int zzn2 = zzen.zzn();
            if (zzn2 == 0) {
                Arrays.fill(zzagi.zzl, 0, zzagi.zze, false);
                return;
            }
            int i11 = zzagi.zze;
            if (zzn2 == i11) {
                Arrays.fill(zzagi.zzl, 0, zzn2, z10);
                zzagi.zza(zzen.zza());
                zzen zzen2 = zzagi.zzn;
                zzen.zzB(zzen2.zzH(), 0, zzen2.zzd());
                zzagi.zzn.zzF(0);
                zzagi.zzo = false;
                return;
            }
            throw zzbu.zza("Senc sample count " + zzn2 + " is different from fragment sample count" + i11, (Throwable) null);
        }
        throw zzbu.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private final void zzi(long j10) throws zzbu {
        zzafx zzafx;
        int i10;
        zzafh zzafh;
        int i11;
        SparseArray sparseArray;
        byte[] bArr;
        int i12;
        byte[] bArr2;
        byte[] bArr3;
        int i13;
        boolean z10;
        zzagi zzagi;
        zzafh zzafh2;
        int i14;
        int i15;
        byte[] bArr4;
        zzafh zzafh3;
        int i16;
        int i17;
        List list;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z11;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        long j11;
        zzafs zzafs;
        int i27;
        int i28;
        int i29;
        int i30;
        zzafx zzafx2 = this;
        while (!zzafx2.zzm.isEmpty() && ((zzafh) zzafx2.zzm.peek()).zza == j10) {
            zzafh zzafh4 = (zzafh) zzafx2.zzm.pop();
            int i31 = zzafh4.zzd;
            int i32 = 12;
            int i33 = 8;
            if (i31 == 1836019574) {
                zzx zzf2 = zzf(zzafh4.zzb);
                zzafh zza2 = zzafh4.zza(1836475768);
                Objects.requireNonNull(zza2);
                SparseArray sparseArray2 = new SparseArray();
                int size = zza2.zzb.size();
                long j12 = -9223372036854775807L;
                int i34 = 0;
                while (i34 < size) {
                    zzafi zzafi = (zzafi) zza2.zzb.get(i34);
                    int i35 = zzafi.zzd;
                    if (i35 == 1953654136) {
                        zzen zzen = zzafi.zza;
                        zzen.zzF(i32);
                        Pair create = Pair.create(Integer.valueOf(zzen.zze()), new zzafs(zzen.zze() - 1, zzen.zze(), zzen.zze(), zzen.zze()));
                        sparseArray2.put(((Integer) create.first).intValue(), (zzafs) create.second);
                    } else if (i35 == 1835362404) {
                        zzen zzen2 = zzafi.zza;
                        zzen2.zzF(8);
                        j12 = zzafj.zze(zzen2.zze()) == 0 ? zzen2.zzs() : zzen2.zzt();
                    }
                    i34++;
                    i32 = 12;
                }
                List zzc2 = zzafr.zzc(zzafh4, new zzaaj(), j12, zzf2, false, false, new zzafu(zzafx2));
                int size2 = zzc2.size();
                if (zzafx2.zze.size() == 0) {
                    for (int i36 = 0; i36 < size2; i36++) {
                        zzagj zzagj = (zzagj) zzc2.get(i36);
                        zzagg zzagg = zzagj.zza;
                        zzafx2.zze.put(zzagg.zza, new zzafw(zzafx2.zzD.zzv(i36, zzagg.zzb), zzagj, zzj(sparseArray2, zzagg.zza)));
                        zzafx2.zzw = Math.max(zzafx2.zzw, zzagg.zze);
                    }
                    zzafx2.zzD.zzC();
                } else {
                    zzdl.zzf(zzafx2.zze.size() == size2);
                    for (int i37 = 0; i37 < size2; i37++) {
                        zzagj zzagj2 = (zzagj) zzc2.get(i37);
                        zzagg zzagg2 = zzagj2.zza;
                        ((zzafw) zzafx2.zze.get(zzagg2.zza)).zzh(zzagj2, zzj(sparseArray2, zzagg2.zza));
                    }
                }
            } else {
                if (i31 == 1836019558) {
                    SparseArray sparseArray3 = zzafx2.zze;
                    byte[] bArr5 = zzafx2.zzi;
                    int size3 = zzafh4.zzc.size();
                    int i38 = 0;
                    while (i38 < size3) {
                        zzafh zzafh5 = (zzafh) zzafh4.zzc.get(i38);
                        if (zzafh5.zzd == 1953653094) {
                            zzafi zzb2 = zzafh5.zzb(1952868452);
                            Objects.requireNonNull(zzb2);
                            zzen zzen3 = zzb2.zza;
                            zzen3.zzF(i33);
                            int zze2 = zzen3.zze() & 16777215;
                            zzafw zzafw = (zzafw) sparseArray3.get(zzen3.zze());
                            if (zzafw == null) {
                                zzafw = null;
                            } else {
                                if ((zze2 & 1) != 0) {
                                    long zzt2 = zzen3.zzt();
                                    zzagi zzagi2 = zzafw.zzb;
                                    zzagi2.zzb = zzt2;
                                    zzagi2.zzc = zzt2;
                                }
                                zzafs zzafs2 = zzafw.zze;
                                if ((zze2 & 2) != 0) {
                                    i27 = zzen3.zze() - 1;
                                } else {
                                    i27 = zzafs2.zza;
                                }
                                if ((zze2 & 8) != 0) {
                                    i28 = zzen3.zze();
                                } else {
                                    i28 = zzafs2.zzb;
                                }
                                if ((zze2 & 16) != 0) {
                                    i29 = zzen3.zze();
                                } else {
                                    i29 = zzafs2.zzc;
                                }
                                if ((zze2 & 32) != 0) {
                                    i30 = zzen3.zze();
                                } else {
                                    i30 = zzafs2.zzd;
                                }
                                zzafw.zzb.zza = new zzafs(i27, i28, i29, i30);
                            }
                            if (zzafw != null) {
                                zzagi zzagi3 = zzafw.zzb;
                                long j13 = zzagi3.zzp;
                                boolean z12 = zzagi3.zzq;
                                zzafw.zzi();
                                zzafw.zzl = true;
                                zzafi zzb3 = zzafh5.zzb(1952867444);
                                if (zzb3 != null) {
                                    zzen zzen4 = zzb3.zza;
                                    zzen4.zzF(i33);
                                    zzagi3.zzp = zzafj.zze(zzen4.zze()) == 1 ? zzen4.zzt() : zzen4.zzs();
                                    zzagi3.zzq = true;
                                } else {
                                    zzagi3.zzp = j13;
                                    zzagi3.zzq = z12;
                                }
                                List list2 = zzafh5.zzb;
                                int size4 = list2.size();
                                int i39 = 0;
                                int i40 = 0;
                                int i41 = 0;
                                while (true) {
                                    i12 = 1953658222;
                                    if (i39 >= size4) {
                                        break;
                                    }
                                    zzafi zzafi2 = (zzafi) list2.get(i39);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (zzafi2.zzd == 1953658222) {
                                        zzen zzen5 = zzafi2.zza;
                                        zzen5.zzF(12);
                                        int zzn2 = zzen5.zzn();
                                        if (zzn2 > 0) {
                                            i41 += zzn2;
                                            i40++;
                                        }
                                    }
                                    i39++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                zzafw.zzh = 0;
                                zzafw.zzg = 0;
                                zzafw.zzf = 0;
                                zzagi zzagi4 = zzafw.zzb;
                                zzagi4.zzd = i40;
                                zzagi4.zze = i41;
                                if (zzagi4.zzg.length < i40) {
                                    zzagi4.zzf = new long[i40];
                                    zzagi4.zzg = new int[i40];
                                }
                                if (zzagi4.zzh.length < i41) {
                                    int i42 = (i41 * 125) / 100;
                                    zzagi4.zzh = new int[i42];
                                    zzagi4.zzi = new long[i42];
                                    zzagi4.zzj = new boolean[i42];
                                    zzagi4.zzl = new boolean[i42];
                                }
                                int i43 = 0;
                                int i44 = 0;
                                int i45 = 0;
                                while (true) {
                                    long j14 = 0;
                                    if (i43 >= size4) {
                                        break;
                                    }
                                    zzafi zzafi3 = (zzafi) list2.get(i43);
                                    if (zzafi3.zzd == i12) {
                                        zzen zzen6 = zzafi3.zza;
                                        zzen6.zzF(8);
                                        int zze3 = zzen6.zze() & 16777215;
                                        list = list2;
                                        zzagg zzagg3 = zzafw.zzd.zza;
                                        i17 = size3;
                                        zzagi zzagi5 = zzafw.zzb;
                                        i16 = size4;
                                        zzafs zzafs3 = zzagi5.zza;
                                        int i46 = zzew.zza;
                                        int i47 = i44 + 1;
                                        zzagi5.zzg[i44] = zzen6.zzn();
                                        long[] jArr = zzagi5.zzf;
                                        zzafh3 = zzafh4;
                                        bArr4 = bArr5;
                                        long j15 = zzagi5.zzb;
                                        jArr[i44] = j15;
                                        if ((zze3 & 1) != 0) {
                                            i15 = i43;
                                            jArr[i44] = j15 + ((long) zzen6.zze());
                                        } else {
                                            i15 = i43;
                                        }
                                        boolean z13 = (zze3 & 4) != 0;
                                        int i48 = zzafs3.zzd;
                                        if (z13) {
                                            i48 = zzen6.zze();
                                        }
                                        int i49 = zze3 & 256;
                                        int i50 = zze3 & 512;
                                        int i51 = zze3 & 1024;
                                        int i52 = zze3 & 2048;
                                        int i53 = i48;
                                        long[] jArr2 = zzagg3.zzh;
                                        if (jArr2 != null) {
                                            i14 = i38;
                                            zzafh2 = zzafh5;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j14 = ((long[]) zzew.zzH(zzagg3.zzi))[0];
                                            }
                                        } else {
                                            i14 = i38;
                                            zzafh2 = zzafh5;
                                        }
                                        int[] iArr = zzagi5.zzh;
                                        long[] jArr3 = zzagi5.zzi;
                                        boolean[] zArr = zzagi5.zzj;
                                        zzagi = zzagi3;
                                        int i54 = zzagi5.zzg[i44] + i45;
                                        boolean[] zArr2 = zArr;
                                        long j16 = zzagg3.zzc;
                                        long[] jArr4 = jArr3;
                                        long j17 = zzagi5.zzp;
                                        int[] iArr2 = iArr;
                                        int i55 = i45;
                                        while (i55 < i54) {
                                            if (i49 != 0) {
                                                i18 = i49;
                                                i19 = zzen6.zze();
                                            } else {
                                                i18 = i49;
                                                i19 = zzafs3.zzb;
                                            }
                                            zze(i19);
                                            if (i50 != 0) {
                                                i20 = i50;
                                                i21 = zzen6.zze();
                                            } else {
                                                i20 = i50;
                                                i21 = zzafs3.zzc;
                                            }
                                            zze(i21);
                                            if (i51 != 0) {
                                                z11 = z13;
                                                i22 = zzen6.zze();
                                            } else {
                                                z11 = z13;
                                                if (i55 == 0) {
                                                    if (z13) {
                                                        i22 = i53;
                                                        i55 = 0;
                                                    } else {
                                                        i55 = 0;
                                                    }
                                                }
                                                i22 = zzafs3.zzd;
                                            }
                                            if (i52 != 0) {
                                                i25 = i54;
                                                i24 = i51;
                                                i23 = i52;
                                                i26 = zzen6.zze();
                                            } else {
                                                i25 = i54;
                                                i24 = i51;
                                                i23 = i52;
                                                i26 = 0;
                                            }
                                            long zzw2 = zzew.zzw((((long) i26) + j17) - j14, 1000000, j16);
                                            jArr4[i55] = zzw2;
                                            if (!zzagi5.zzq) {
                                                zzafs = zzafs3;
                                                j11 = j16;
                                                jArr4[i55] = zzw2 + zzafw.zzd.zzh;
                                            } else {
                                                zzafs = zzafs3;
                                                j11 = j16;
                                            }
                                            iArr2[i55] = i21;
                                            zArr2[i55] = 1 == (((i22 >> 16) & 1) ^ 1);
                                            j17 += (long) i19;
                                            i55++;
                                            zzafs3 = zzafs;
                                            j16 = j11;
                                            i49 = i18;
                                            i50 = i20;
                                            z13 = z11;
                                            i54 = i25;
                                            i51 = i24;
                                            i52 = i23;
                                        }
                                        zzagi5.zzp = j17;
                                        i44 = i47;
                                        i45 = i54;
                                    } else {
                                        i15 = i43;
                                        zzafh3 = zzafh4;
                                        bArr4 = bArr5;
                                        zzagi = zzagi3;
                                        list = list2;
                                        i17 = size3;
                                        i14 = i38;
                                        i16 = size4;
                                        zzafh2 = zzafh5;
                                        int i56 = i45;
                                    }
                                    i43 = i15 + 1;
                                    list2 = list;
                                    size3 = i17;
                                    size4 = i16;
                                    zzafh4 = zzafh3;
                                    bArr5 = bArr4;
                                    i38 = i14;
                                    zzafh5 = zzafh2;
                                    zzagi3 = zzagi;
                                    i12 = 1953658222;
                                }
                                zzafh = zzafh4;
                                byte[] bArr6 = bArr5;
                                i11 = size3;
                                i10 = i38;
                                zzagg zzagg4 = zzafw.zzd.zza;
                                zzagi zzagi6 = zzagi3;
                                zzafs zzafs4 = zzagi6.zza;
                                Objects.requireNonNull(zzafs4);
                                zzagh zza3 = zzagg4.zza(zzafs4.zza);
                                zzafh zzafh6 = zzafh5;
                                zzafi zzb4 = zzafh6.zzb(1935763834);
                                if (zzb4 != null) {
                                    Objects.requireNonNull(zza3);
                                    zzen zzen7 = zzb4.zza;
                                    int i57 = zza3.zzd;
                                    zzen7.zzF(8);
                                    if ((zzen7.zze() & 1) == 1) {
                                        zzen7.zzG(8);
                                    }
                                    int zzk2 = zzen7.zzk();
                                    int zzn3 = zzen7.zzn();
                                    int i58 = zzagi6.zze;
                                    if (zzn3 <= i58) {
                                        if (zzk2 == 0) {
                                            boolean[] zArr3 = zzagi6.zzl;
                                            i13 = 0;
                                            for (int i59 = 0; i59 < zzn3; i59++) {
                                                int zzk3 = zzen7.zzk();
                                                i13 += zzk3;
                                                zArr3[i59] = zzk3 > i57;
                                            }
                                            z10 = false;
                                        } else {
                                            boolean z14 = zzk2 > i57;
                                            i13 = zzk2 * zzn3;
                                            z10 = false;
                                            Arrays.fill(zzagi6.zzl, 0, zzn3, z14);
                                        }
                                        Arrays.fill(zzagi6.zzl, zzn3, zzagi6.zze, z10);
                                        if (i13 > 0) {
                                            zzagi6.zza(i13);
                                        }
                                    } else {
                                        throw zzbu.zza("Saiz sample count " + zzn3 + " is greater than fragment sample count" + i58, (Throwable) null);
                                    }
                                }
                                zzafi zzb5 = zzafh6.zzb(1935763823);
                                if (zzb5 != null) {
                                    zzen zzen8 = zzb5.zza;
                                    zzen8.zzF(8);
                                    int zze4 = zzen8.zze();
                                    if ((zze4 & 1) == 1) {
                                        zzen8.zzG(8);
                                    }
                                    int zzn4 = zzen8.zzn();
                                    if (zzn4 == 1) {
                                        zzagi6.zzc += zzafj.zze(zze4) == 0 ? zzen8.zzs() : zzen8.zzt();
                                    } else {
                                        throw zzbu.zza("Unexpected saio entry count: " + zzn4, (Throwable) null);
                                    }
                                }
                                zzafi zzb6 = zzafh6.zzb(1936027235);
                                if (zzb6 != null) {
                                    zzh(zzb6.zza, 0, zzagi6);
                                }
                                String str = zza3 != null ? zza3.zzb : null;
                                zzen zzen9 = null;
                                zzen zzen10 = null;
                                for (int i60 = 0; i60 < zzafh6.zzb.size(); i60++) {
                                    zzafi zzafi4 = (zzafi) zzafh6.zzb.get(i60);
                                    zzen zzen11 = zzafi4.zza;
                                    int i61 = zzafi4.zzd;
                                    if (i61 == 1935828848) {
                                        zzen11.zzF(12);
                                        if (zzen11.zze() == 1936025959) {
                                            zzen9 = zzen11;
                                        }
                                    } else if (i61 == 1936158820) {
                                        zzen11.zzF(12);
                                        if (zzen11.zze() == 1936025959) {
                                            zzen10 = zzen11;
                                        }
                                    }
                                }
                                if (zzen9 != null && zzen10 != null) {
                                    zzen9.zzF(8);
                                    int zze5 = zzafj.zze(zzen9.zze());
                                    zzen9.zzG(4);
                                    if (zze5 == 1) {
                                        zzen9.zzG(4);
                                    }
                                    if (zzen9.zze() == 1) {
                                        zzen10.zzF(8);
                                        int zze6 = zzafj.zze(zzen10.zze());
                                        zzen10.zzG(4);
                                        if (zze6 == 1) {
                                            if (zzen10.zzs() == 0) {
                                                throw zzbu.zzc("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (zze6 >= 2) {
                                            zzen10.zzG(4);
                                        }
                                        if (zzen10.zzs() == 1) {
                                            zzen10.zzG(1);
                                            int zzk4 = zzen10.zzk();
                                            int i62 = (zzk4 & 240) >> 4;
                                            int i63 = zzk4 & 15;
                                            if (zzen10.zzk() == 1) {
                                                int zzk5 = zzen10.zzk();
                                                byte[] bArr7 = new byte[16];
                                                zzen10.zzB(bArr7, 0, 16);
                                                if (zzk5 == 0) {
                                                    int zzk6 = zzen10.zzk();
                                                    byte[] bArr8 = new byte[zzk6];
                                                    zzen10.zzB(bArr8, 0, zzk6);
                                                    bArr3 = bArr8;
                                                } else {
                                                    bArr3 = null;
                                                }
                                                zzagi6.zzk = true;
                                                zzagi6.zzm = new zzagh(true, str, zzk5, bArr7, i62, i63, bArr3);
                                            }
                                        } else {
                                            throw zzbu.zzc("Entry count in sgpd != 1 (unsupported).");
                                        }
                                    } else {
                                        throw zzbu.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                }
                                int size5 = zzafh6.zzb.size();
                                int i64 = 0;
                                while (i64 < size5) {
                                    zzafi zzafi5 = (zzafi) zzafh6.zzb.get(i64);
                                    if (zzafi5.zzd == 1970628964) {
                                        zzen zzen12 = zzafi5.zza;
                                        zzen12.zzF(8);
                                        bArr2 = bArr6;
                                        zzen12.zzB(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zzb)) {
                                            zzh(zzen12, 16, zzagi6);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i64++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                bArr5 = bArr;
                                size3 = i11;
                                zzafh4 = zzafh;
                                i33 = 8;
                                i38 = i10 + 1;
                                sparseArray3 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray3;
                        zzafh = zzafh4;
                        i11 = size3;
                        i10 = i38;
                        bArr = bArr5;
                        bArr5 = bArr;
                        size3 = i11;
                        zzafh4 = zzafh;
                        i33 = 8;
                        i38 = i10 + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzx zzf3 = zzf(zzafh4.zzb);
                    zzafx = this;
                    if (zzf3 != null) {
                        int size6 = zzafx.zze.size();
                        for (int i65 = 0; i65 < size6; i65++) {
                            zzafw zzafw2 = (zzafw) zzafx.zze.valueAt(i65);
                            zzagg zzagg5 = zzafw2.zzd.zza;
                            zzafs zzafs5 = zzafw2.zzb.zza;
                            int i66 = zzew.zza;
                            zzagh zza4 = zzagg5.zza(zzafs5.zza);
                            zzx zzb7 = zzf3.zzb(zza4 != null ? zza4.zzb : null);
                            zzad zzb8 = zzafw2.zzd.zza.zzf.zzb();
                            zzb8.zzB(zzb7);
                            zzafw2.zza.zzk(zzb8.zzY());
                        }
                    }
                    if (zzafx.zzv != -9223372036854775807L) {
                        int size7 = zzafx.zze.size();
                        for (int i67 = 0; i67 < size7; i67++) {
                            zzafw zzafw3 = (zzafw) zzafx.zze.valueAt(i67);
                            long j18 = zzafx.zzv;
                            int i68 = zzafw3.zzf;
                            while (true) {
                                zzagi zzagi7 = zzafw3.zzb;
                                if (i68 >= zzagi7.zze || zzagi7.zzi[i68] >= j18) {
                                } else {
                                    if (zzagi7.zzj[i68]) {
                                        zzafw3.zzi = i68;
                                    }
                                    i68++;
                                }
                            }
                        }
                        zzafx.zzv = -9223372036854775807L;
                    }
                } else {
                    zzafx = zzafx2;
                    zzafh zzafh7 = zzafh4;
                    if (!zzafx.zzm.isEmpty()) {
                        ((zzafh) zzafx.zzm.peek()).zzc(zzafh7);
                    }
                }
                zzafx2 = zzafx;
            }
        }
        zzafx zzafx3 = zzafx2;
        zzg();
    }

    private static final zzafs zzj(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (zzafs) sparseArray.valueAt(0);
        }
        zzafs zzafs = (zzafs) sparseArray.get(i10);
        Objects.requireNonNull(zzafs);
        return zzafs;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: com.google.android.gms.internal.ads.zzafw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v72, resolved type: com.google.android.gms.internal.ads.zzafw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzzv r34, com.google.android.gms.internal.ads.zzaau r35) throws java.io.IOException {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
        L_0x0004:
            int r2 = r0.zzo
            r3 = 1701671783(0x656d7367, float:7.0083103E22)
            r4 = 1936286840(0x73696478, float:1.8491255E31)
            r5 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x053b
            java.lang.String r10 = "FragmentedMp4Extractor"
            if (r2 == r8) goto L_0x02fb
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 3
            if (r2 == r5) goto L_0x029b
            com.google.android.gms.internal.ads.zzafw r2 = r0.zzy
            if (r2 != 0) goto L_0x0099
            android.util.SparseArray r2 = r0.zze
            int r13 = r2.size()
            r14 = r3
            r3 = r7
            r4 = 0
        L_0x002b:
            if (r4 >= r13) goto L_0x0061
            java.lang.Object r16 = r2.valueAt(r4)
            r5 = r16
            com.google.android.gms.internal.ads.zzafw r5 = (com.google.android.gms.internal.ads.zzafw) r5
            boolean r16 = r5.zzl
            if (r16 != 0) goto L_0x0043
            int r11 = r5.zzf
            com.google.android.gms.internal.ads.zzagj r6 = r5.zzd
            int r6 = r6.zzb
            if (r11 == r6) goto L_0x005d
        L_0x0043:
            boolean r6 = r5.zzl
            if (r6 == 0) goto L_0x0052
            int r6 = r5.zzh
            com.google.android.gms.internal.ads.zzagi r11 = r5.zzb
            int r11 = r11.zzd
            if (r6 != r11) goto L_0x0052
            goto L_0x005d
        L_0x0052:
            long r18 = r5.zzd()
            int r6 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x005d
            r3 = r5
            r14 = r18
        L_0x005d:
            int r4 = r4 + 1
            r5 = 2
            goto L_0x002b
        L_0x0061:
            if (r3 != 0) goto L_0x007e
            long r2 = r0.zzt
            long r4 = r34.zzf()
            long r2 = r2 - r4
            int r3 = (int) r2
            if (r3 < 0) goto L_0x0077
            r2 = r1
            com.google.android.gms.internal.ads.zzzk r2 = (com.google.android.gms.internal.ads.zzzk) r2
            r2.zzo(r3, r9)
            r33.zzg()
            goto L_0x0004
        L_0x0077:
            java.lang.String r1 = "Offset to end of mdat was negative."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r1, r7)
            throw r1
        L_0x007e:
            long r4 = r3.zzd()
            long r13 = r34.zzf()
            long r4 = r4 - r13
            int r2 = (int) r4
            if (r2 >= 0) goto L_0x0090
            java.lang.String r2 = "Ignoring negative offset to sample data."
            com.google.android.gms.internal.ads.zzee.zze(r10, r2)
            r2 = 0
        L_0x0090:
            r4 = r1
            com.google.android.gms.internal.ads.zzzk r4 = (com.google.android.gms.internal.ads.zzzk) r4
            r4.zzo(r2, r9)
            r0.zzy = r3
            r2 = r3
        L_0x0099:
            int r3 = r0.zzo
            r4 = 6
            if (r3 != r12) goto L_0x0134
            int r3 = r2.zzb()
            r0.zzz = r3
            int r5 = r2.zzf
            int r6 = r2.zzi
            if (r5 >= r6) goto L_0x00e1
            com.google.android.gms.internal.ads.zzzk r1 = (com.google.android.gms.internal.ads.zzzk) r1
            r1.zzo(r3, r9)
            com.google.android.gms.internal.ads.zzagh r1 = r2.zzf()
            if (r1 != 0) goto L_0x00b6
            goto L_0x00d4
        L_0x00b6:
            com.google.android.gms.internal.ads.zzagi r3 = r2.zzb
            com.google.android.gms.internal.ads.zzen r3 = r3.zzn
            int r1 = r1.zzd
            if (r1 == 0) goto L_0x00c1
            r3.zzG(r1)
        L_0x00c1:
            com.google.android.gms.internal.ads.zzagi r1 = r2.zzb
            int r5 = r2.zzf
            boolean r1 = r1.zzb(r5)
            if (r1 == 0) goto L_0x00d4
            int r1 = r3.zzo()
            int r1 = r1 * 6
            r3.zzG(r1)
        L_0x00d4:
            boolean r1 = r2.zzk()
            if (r1 != 0) goto L_0x00dc
            r0.zzy = r7
        L_0x00dc:
            r0.zzo = r12
        L_0x00de:
            r1 = 0
            goto L_0x029a
        L_0x00e1:
            com.google.android.gms.internal.ads.zzagj r5 = r2.zzd
            com.google.android.gms.internal.ads.zzagg r5 = r5.zza
            int r5 = r5.zzg
            if (r5 != r8) goto L_0x00f5
            int r3 = r3 + -8
            r0.zzz = r3
            r3 = r1
            com.google.android.gms.internal.ads.zzzk r3 = (com.google.android.gms.internal.ads.zzzk) r3
            r5 = 8
            r3.zzo(r5, r9)
        L_0x00f5:
            com.google.android.gms.internal.ads.zzagj r3 = r2.zzd
            com.google.android.gms.internal.ads.zzagg r3 = r3.zza
            com.google.android.gms.internal.ads.zzaf r3 = r3.zzf
            java.lang.String r3 = r3.zzm
            java.lang.String r5 = "audio/ac4"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0122
            int r3 = r0.zzz
            r5 = 7
            int r3 = r2.zzc(r3, r5)
            r0.zzA = r3
            int r3 = r0.zzz
            com.google.android.gms.internal.ads.zzen r6 = r0.zzj
            com.google.android.gms.internal.ads.zzyy.zzb(r3, r6)
            com.google.android.gms.internal.ads.zzabb r3 = r2.zza
            com.google.android.gms.internal.ads.zzen r6 = r0.zzj
            r3.zzq(r6, r5)
            int r3 = r0.zzA
            int r3 = r3 + r5
            r0.zzA = r3
            goto L_0x012a
        L_0x0122:
            int r3 = r0.zzz
            int r3 = r2.zzc(r3, r9)
            r0.zzA = r3
        L_0x012a:
            int r5 = r0.zzz
            int r5 = r5 + r3
            r0.zzz = r5
            r3 = 4
            r0.zzo = r3
            r0.zzB = r9
        L_0x0134:
            com.google.android.gms.internal.ads.zzagj r3 = r2.zzd
            com.google.android.gms.internal.ads.zzagg r3 = r3.zza
            com.google.android.gms.internal.ads.zzabb r5 = r2.zza
            long r10 = r2.zze()
            int r6 = r3.zzj
            if (r6 != 0) goto L_0x0153
        L_0x0142:
            int r3 = r0.zzA
            int r4 = r0.zzz
            if (r3 >= r4) goto L_0x0237
            int r4 = r4 - r3
            int r3 = r5.zze(r1, r4, r9)
            int r4 = r0.zzA
            int r4 = r4 + r3
            r0.zzA = r4
            goto L_0x0142
        L_0x0153:
            com.google.android.gms.internal.ads.zzen r13 = r0.zzg
            byte[] r13 = r13.zzH()
            r13[r9] = r9
            r13[r8] = r9
            r14 = 2
            r13[r14] = r9
            int r14 = r6 + 1
            r15 = 4
            int r6 = 4 - r6
        L_0x0165:
            int r15 = r0.zzA
            int r12 = r0.zzz
            if (r15 >= r12) goto L_0x0237
            int r12 = r0.zzB
            java.lang.String r15 = "video/hevc"
            if (r12 != 0) goto L_0x01d8
            r12 = r1
            com.google.android.gms.internal.ads.zzzk r12 = (com.google.android.gms.internal.ads.zzzk) r12
            r12.zzn(r13, r6, r14, r9)
            com.google.android.gms.internal.ads.zzen r12 = r0.zzg
            r12.zzF(r9)
            com.google.android.gms.internal.ads.zzen r12 = r0.zzg
            int r12 = r12.zze()
            if (r12 <= 0) goto L_0x01d1
            int r12 = r12 + -1
            r0.zzB = r12
            com.google.android.gms.internal.ads.zzen r12 = r0.zzf
            r12.zzF(r9)
            com.google.android.gms.internal.ads.zzen r12 = r0.zzf
            r9 = 4
            r5.zzq(r12, r9)
            com.google.android.gms.internal.ads.zzen r12 = r0.zzg
            r5.zzq(r12, r8)
            com.google.android.gms.internal.ads.zzabb[] r12 = r0.zzF
            int r12 = r12.length
            if (r12 <= 0) goto L_0x01c2
            com.google.android.gms.internal.ads.zzaf r12 = r3.zzf
            java.lang.String r12 = r12.zzm
            byte r17 = r13[r9]
            byte[] r9 = com.google.android.gms.internal.ads.zzaar.zza
            java.lang.String r9 = "video/avc"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x01b4
            r9 = r17 & 31
            if (r9 == r4) goto L_0x01b2
            goto L_0x01b4
        L_0x01b2:
            r9 = 1
            goto L_0x01c3
        L_0x01b4:
            boolean r9 = r15.equals(r12)
            if (r9 == 0) goto L_0x01c2
            r9 = r17 & 126(0x7e, float:1.77E-43)
            int r9 = r9 >> r8
            r12 = 39
            if (r9 != r12) goto L_0x01c2
            goto L_0x01b2
        L_0x01c2:
            r9 = 0
        L_0x01c3:
            r0.zzC = r9
            int r9 = r0.zzA
            int r9 = r9 + 5
            r0.zzA = r9
            int r9 = r0.zzz
            int r9 = r9 + r6
            r0.zzz = r9
            goto L_0x0233
        L_0x01d1:
            java.lang.String r1 = "Invalid NAL length"
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r1, r7)
            throw r1
        L_0x01d8:
            boolean r9 = r0.zzC
            if (r9 == 0) goto L_0x0221
            com.google.android.gms.internal.ads.zzen r9 = r0.zzh
            r9.zzC(r12)
            com.google.android.gms.internal.ads.zzen r9 = r0.zzh
            byte[] r9 = r9.zzH()
            int r12 = r0.zzB
            r4 = r1
            com.google.android.gms.internal.ads.zzzk r4 = (com.google.android.gms.internal.ads.zzzk) r4
            r8 = 0
            r4.zzn(r9, r8, r12, r8)
            com.google.android.gms.internal.ads.zzen r4 = r0.zzh
            int r8 = r0.zzB
            r5.zzq(r4, r8)
            int r4 = r0.zzB
            com.google.android.gms.internal.ads.zzen r8 = r0.zzh
            byte[] r9 = r8.zzH()
            int r8 = r8.zzd()
            int r8 = com.google.android.gms.internal.ads.zzaar.zzb(r9, r8)
            com.google.android.gms.internal.ads.zzen r9 = r0.zzh
            com.google.android.gms.internal.ads.zzaf r12 = r3.zzf
            java.lang.String r12 = r12.zzm
            boolean r12 = r15.equals(r12)
            r9.zzF(r12)
            com.google.android.gms.internal.ads.zzen r9 = r0.zzh
            r9.zzE(r8)
            com.google.android.gms.internal.ads.zzen r8 = r0.zzh
            com.google.android.gms.internal.ads.zzabb[] r9 = r0.zzF
            com.google.android.gms.internal.ads.zzzh.zza(r10, r8, r9)
            goto L_0x0227
        L_0x0221:
            r4 = 0
            int r8 = r5.zze(r1, r12, r4)
            r4 = r8
        L_0x0227:
            int r8 = r0.zzA
            int r8 = r8 + r4
            r0.zzA = r8
            int r8 = r0.zzB
            int r8 = r8 - r4
            r0.zzB = r8
            r4 = 6
            r8 = 1
        L_0x0233:
            r9 = 0
            r12 = 3
            goto L_0x0165
        L_0x0237:
            int r20 = r2.zza()
            com.google.android.gms.internal.ads.zzagh r1 = r2.zzf()
            if (r1 == 0) goto L_0x0246
            com.google.android.gms.internal.ads.zzaba r1 = r1.zzc
            r23 = r1
            goto L_0x0248
        L_0x0246:
            r23 = r7
        L_0x0248:
            int r1 = r0.zzz
            r22 = 0
            r17 = r5
            r18 = r10
            r21 = r1
            r17.zzs(r18, r20, r21, r22, r23)
        L_0x0255:
            java.util.ArrayDeque r1 = r0.zzn
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x028d
            java.util.ArrayDeque r1 = r0.zzn
            java.lang.Object r1 = r1.removeFirst()
            com.google.android.gms.internal.ads.zzafv r1 = (com.google.android.gms.internal.ads.zzafv) r1
            int r3 = r0.zzu
            int r4 = r1.zzc
            int r3 = r3 - r4
            r0.zzu = r3
            long r3 = r1.zza
            boolean r5 = r1.zzb
            if (r5 == 0) goto L_0x0273
            long r3 = r3 + r10
        L_0x0273:
            com.google.android.gms.internal.ads.zzabb[] r5 = r0.zzE
            int r6 = r5.length
            r8 = 0
        L_0x0277:
            if (r8 >= r6) goto L_0x0255
            r12 = r5[r8]
            r15 = 1
            int r9 = r1.zzc
            int r13 = r0.zzu
            r18 = 0
            r17 = r13
            r13 = r3
            r16 = r9
            r12.zzs(r13, r15, r16, r17, r18)
            int r8 = r8 + 1
            goto L_0x0277
        L_0x028d:
            boolean r1 = r2.zzk()
            if (r1 != 0) goto L_0x0295
            r0.zzy = r7
        L_0x0295:
            r1 = 3
            r0.zzo = r1
            goto L_0x00de
        L_0x029a:
            return r1
        L_0x029b:
            android.util.SparseArray r2 = r0.zze
            int r2 = r2.size()
            r6 = r7
            r5 = 0
        L_0x02a3:
            if (r5 >= r2) goto L_0x02c6
            android.util.SparseArray r8 = r0.zze
            java.lang.Object r8 = r8.valueAt(r5)
            com.google.android.gms.internal.ads.zzafw r8 = (com.google.android.gms.internal.ads.zzafw) r8
            com.google.android.gms.internal.ads.zzagi r8 = r8.zzb
            boolean r9 = r8.zzo
            if (r9 == 0) goto L_0x02c3
            long r8 = r8.zzc
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 >= 0) goto L_0x02c3
            android.util.SparseArray r3 = r0.zze
            java.lang.Object r3 = r3.valueAt(r5)
            r6 = r3
            com.google.android.gms.internal.ads.zzafw r6 = (com.google.android.gms.internal.ads.zzafw) r6
            r3 = r8
        L_0x02c3:
            int r5 = r5 + 1
            goto L_0x02a3
        L_0x02c6:
            if (r6 != 0) goto L_0x02cd
            r2 = 3
            r0.zzo = r2
            goto L_0x0004
        L_0x02cd:
            long r8 = r34.zzf()
            long r3 = r3 - r8
            int r2 = (int) r3
            if (r2 < 0) goto L_0x02f4
            r3 = r1
            com.google.android.gms.internal.ads.zzzk r3 = (com.google.android.gms.internal.ads.zzzk) r3
            r4 = 0
            r3.zzo(r2, r4)
            com.google.android.gms.internal.ads.zzagi r2 = r6.zzb
            com.google.android.gms.internal.ads.zzen r5 = r2.zzn
            byte[] r6 = r5.zzH()
            int r5 = r5.zzd()
            r3.zzn(r6, r4, r5, r4)
            com.google.android.gms.internal.ads.zzen r3 = r2.zzn
            r3.zzF(r4)
            r2.zzo = r4
            goto L_0x0004
        L_0x02f4:
            java.lang.String r1 = "Offset to encryption data was negative."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r1, r7)
            throw r1
        L_0x02fb:
            long r5 = r0.zzq
            int r2 = (int) r5
            int r5 = r0.zzr
            int r2 = r2 - r5
            com.google.android.gms.internal.ads.zzen r5 = r0.zzs
            if (r5 == 0) goto L_0x052b
            byte[] r6 = r5.zzH()
            r8 = r1
            com.google.android.gms.internal.ads.zzzk r8 = (com.google.android.gms.internal.ads.zzzk) r8
            r9 = 8
            r11 = 0
            r8.zzn(r6, r9, r2, r11)
            com.google.android.gms.internal.ads.zzafi r2 = new com.google.android.gms.internal.ads.zzafi
            int r6 = r0.zzp
            r2.<init>(r6, r5)
            long r5 = r34.zzf()
            java.util.ArrayDeque r8 = r0.zzm
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0332
            java.util.ArrayDeque r3 = r0.zzm
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zzafh r3 = (com.google.android.gms.internal.ads.zzafh) r3
            r3.zzd(r2)
            goto L_0x0532
        L_0x0332:
            int r8 = r2.zzd
            if (r8 != r4) goto L_0x03fc
            com.google.android.gms.internal.ads.zzen r2 = r2.zza
            r3 = 8
            r2.zzF(r3)
            int r3 = r2.zze()
            int r3 = com.google.android.gms.internal.ads.zzafj.zze(r3)
            r4 = 4
            r2.zzG(r4)
            long r14 = r2.zzs()
            if (r3 != 0) goto L_0x0358
            long r3 = r2.zzs()
            long r8 = r2.zzs()
            goto L_0x0360
        L_0x0358:
            long r3 = r2.zzt()
            long r8 = r2.zzt()
        L_0x0360:
            long r5 = r5 + r8
            r10 = 1000000(0xf4240, double:4.940656E-318)
            r8 = r3
            r12 = r14
            long r19 = com.google.android.gms.internal.ads.zzew.zzw(r8, r10, r12)
            r8 = 2
            r2.zzG(r8)
            int r12 = r2.zzo()
            int[] r13 = new int[r12]
            long[] r10 = new long[r12]
            long[] r11 = new long[r12]
            long[] r8 = new long[r12]
            r21 = r19
            r9 = 0
        L_0x037d:
            if (r9 >= r12) goto L_0x03d3
            int r17 = r2.zze()
            r23 = -2147483648(0xffffffff80000000, float:-0.0)
            r23 = r17 & r23
            if (r23 != 0) goto L_0x03cb
            long r23 = r2.zzs()
            r25 = 2147483647(0x7fffffff, float:NaN)
            r17 = r17 & r25
            r13[r9] = r17
            r10[r9] = r5
            r8[r9] = r21
            long r3 = r3 + r23
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r7 = r8
            r24 = r9
            r8 = r3
            r25 = r3
            r3 = r10
            r4 = r11
            r10 = r21
            r17 = r12
            r1 = r13
            r12 = r14
            long r21 = com.google.android.gms.internal.ads.zzew.zzw(r8, r10, r12)
            r8 = r7[r24]
            long r8 = r21 - r8
            r4[r24] = r8
            r8 = 4
            r2.zzG(r8)
            r9 = r1[r24]
            long r9 = (long) r9
            long r5 = r5 + r9
            int r9 = r24 + 1
            r13 = r1
            r10 = r3
            r11 = r4
            r8 = r7
            r12 = r17
            r3 = r25
            r7 = 0
            r1 = r34
            goto L_0x037d
        L_0x03cb:
            java.lang.String r1 = "Unhandled indirect reference"
            r2 = 0
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r1, r2)
            throw r1
        L_0x03d3:
            r7 = r8
            r3 = r10
            r4 = r11
            r1 = r13
            java.lang.Long r2 = java.lang.Long.valueOf(r19)
            com.google.android.gms.internal.ads.zzzi r5 = new com.google.android.gms.internal.ads.zzzi
            r5.<init>(r1, r3, r4, r7)
            android.util.Pair r1 = android.util.Pair.create(r2, r5)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.zzx = r2
            com.google.android.gms.internal.ads.zzzx r2 = r0.zzD
            java.lang.Object r1 = r1.second
            com.google.android.gms.internal.ads.zzaax r1 = (com.google.android.gms.internal.ads.zzaax) r1
            r2.zzN(r1)
            r1 = 1
            r0.zzG = r1
            goto L_0x0528
        L_0x03fc:
            if (r8 != r3) goto L_0x0528
            com.google.android.gms.internal.ads.zzen r1 = r2.zza
            com.google.android.gms.internal.ads.zzabb[] r2 = r0.zzE
            int r2 = r2.length
            if (r2 == 0) goto L_0x0528
            r2 = 8
            r1.zzF(r2)
            int r2 = r1.zze()
            int r2 = com.google.android.gms.internal.ads.zzafj.zze(r2)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x046a
            r5 = 1
            if (r2 == r5) goto L_0x0432
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Skipping unsupported emsg version: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.ads.zzee.zze(r10, r1)
            goto L_0x0528
        L_0x0432:
            long r5 = r1.zzs()
            long r11 = r1.zzt()
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r5
            long r7 = com.google.android.gms.internal.ads.zzew.zzw(r11, r13, r15)
            long r11 = r1.zzs()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r5 = com.google.android.gms.internal.ads.zzew.zzw(r11, r13, r15)
            long r9 = r1.zzs()
            r2 = 0
            java.lang.String r11 = r1.zzv(r2)
            java.util.Objects.requireNonNull(r11)
            java.lang.String r12 = r1.zzv(r2)
            java.util.Objects.requireNonNull(r12)
            r28 = r5
            r30 = r9
            r26 = r11
            r27 = r12
            r5 = r3
            r12 = r7
            goto L_0x04af
        L_0x046a:
            r2 = 0
            java.lang.String r11 = r1.zzv(r2)
            java.util.Objects.requireNonNull(r11)
            java.lang.String r12 = r1.zzv(r2)
            java.util.Objects.requireNonNull(r12)
            long r13 = r1.zzs()
            long r5 = r1.zzs()
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r9 = r13
            long r15 = com.google.android.gms.internal.ads.zzew.zzw(r5, r7, r9)
            long r5 = r0.zzx
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0493
            long r5 = r5 + r15
            r19 = r5
            goto L_0x0495
        L_0x0493:
            r19 = r3
        L_0x0495:
            long r5 = r1.zzs()
            r7 = 1000(0x3e8, double:4.94E-321)
            r9 = r13
            long r5 = com.google.android.gms.internal.ads.zzew.zzw(r5, r7, r9)
            long r9 = r1.zzs()
            r28 = r5
            r30 = r9
            r26 = r11
            r27 = r12
            r5 = r15
            r12 = r19
        L_0x04af:
            int r2 = r1.zza()
            byte[] r2 = new byte[r2]
            int r7 = r1.zza()
            r8 = 0
            r1.zzB(r2, r8, r7)
            com.google.android.gms.internal.ads.zzacr r1 = new com.google.android.gms.internal.ads.zzacr
            r25 = r1
            r32 = r2
            r25.<init>(r26, r27, r28, r30, r32)
            com.google.android.gms.internal.ads.zzen r2 = new com.google.android.gms.internal.ads.zzen
            com.google.android.gms.internal.ads.zzacs r7 = r0.zzk
            byte[] r1 = r7.zza(r1)
            r2.<init>((byte[]) r1)
            int r1 = r2.zza()
            com.google.android.gms.internal.ads.zzabb[] r7 = r0.zzE
            int r8 = r7.length
            r9 = 0
        L_0x04d9:
            if (r9 >= r8) goto L_0x04e7
            r10 = r7[r9]
            r11 = 0
            r2.zzF(r11)
            r10.zzq(r2, r1)
            int r9 = r9 + 1
            goto L_0x04d9
        L_0x04e7:
            int r2 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x04fc
            java.util.ArrayDeque r2 = r0.zzn
            com.google.android.gms.internal.ads.zzafv r3 = new com.google.android.gms.internal.ads.zzafv
            r4 = 1
            r3.<init>(r5, r4, r1)
            r2.addLast(r3)
            int r2 = r0.zzu
            int r2 = r2 + r1
            r0.zzu = r2
            goto L_0x0528
        L_0x04fc:
            java.util.ArrayDeque r2 = r0.zzn
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0515
            java.util.ArrayDeque r2 = r0.zzn
            com.google.android.gms.internal.ads.zzafv r3 = new com.google.android.gms.internal.ads.zzafv
            r4 = 0
            r3.<init>(r12, r4, r1)
            r2.addLast(r3)
            int r2 = r0.zzu
            int r2 = r2 + r1
            r0.zzu = r2
            goto L_0x0528
        L_0x0515:
            com.google.android.gms.internal.ads.zzabb[] r2 = r0.zzE
            int r3 = r2.length
            r4 = 0
        L_0x0519:
            if (r4 >= r3) goto L_0x0528
            r5 = r2[r4]
            r8 = 1
            r10 = 0
            r11 = 0
            r6 = r12
            r9 = r1
            r5.zzs(r6, r8, r9, r10, r11)
            int r4 = r4 + 1
            goto L_0x0519
        L_0x0528:
            r1 = r34
            goto L_0x0532
        L_0x052b:
            r3 = r1
            com.google.android.gms.internal.ads.zzzk r3 = (com.google.android.gms.internal.ads.zzzk) r3
            r5 = 0
            r3.zzo(r2, r5)
        L_0x0532:
            long r2 = r34.zzf()
            r0.zzi(r2)
            goto L_0x0004
        L_0x053b:
            r5 = 0
            int r2 = r0.zzr
            if (r2 != 0) goto L_0x0568
            com.google.android.gms.internal.ads.zzen r2 = r0.zzl
            byte[] r2 = r2.zzH()
            r6 = 8
            r7 = 1
            boolean r2 = r1.zzn(r2, r5, r6, r7)
            if (r2 != 0) goto L_0x0551
            r1 = -1
            return r1
        L_0x0551:
            r0.zzr = r6
            com.google.android.gms.internal.ads.zzen r2 = r0.zzl
            r2.zzF(r5)
            com.google.android.gms.internal.ads.zzen r2 = r0.zzl
            long r5 = r2.zzs()
            r0.zzq = r5
            com.google.android.gms.internal.ads.zzen r2 = r0.zzl
            int r2 = r2.zze()
            r0.zzp = r2
        L_0x0568:
            long r5 = r0.zzq
            r7 = 1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x058d
            com.google.android.gms.internal.ads.zzen r2 = r0.zzl
            byte[] r2 = r2.zzH()
            r5 = r1
            com.google.android.gms.internal.ads.zzzk r5 = (com.google.android.gms.internal.ads.zzzk) r5
            r6 = 8
            r7 = 0
            r5.zzn(r2, r6, r6, r7)
            int r2 = r0.zzr
            int r2 = r2 + r6
            r0.zzr = r2
            com.google.android.gms.internal.ads.zzen r2 = r0.zzl
            long r5 = r2.zzt()
            r0.zzq = r5
            goto L_0x05c0
        L_0x058d:
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x05c0
            long r5 = r34.zzd()
            r7 = -1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x05b1
            java.util.ArrayDeque r2 = r0.zzm
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x05b0
            java.util.ArrayDeque r2 = r0.zzm
            java.lang.Object r2 = r2.peek()
            com.google.android.gms.internal.ads.zzafh r2 = (com.google.android.gms.internal.ads.zzafh) r2
            long r5 = r2.zza
            goto L_0x05b1
        L_0x05b0:
            r5 = r7
        L_0x05b1:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x05c0
            long r7 = r34.zzf()
            long r5 = r5 - r7
            int r2 = r0.zzr
            long r7 = (long) r2
            long r5 = r5 + r7
            r0.zzq = r5
        L_0x05c0:
            long r5 = r0.zzq
            int r2 = r0.zzr
            long r7 = (long) r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0745
            long r5 = r34.zzf()
            long r5 = r5 - r7
            int r2 = r0.zzp
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            r8 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 == r8) goto L_0x05da
            if (r2 != r7) goto L_0x05ed
        L_0x05da:
            boolean r2 = r0.zzG
            if (r2 != 0) goto L_0x05ed
            com.google.android.gms.internal.ads.zzzx r2 = r0.zzD
            com.google.android.gms.internal.ads.zzaaw r9 = new com.google.android.gms.internal.ads.zzaaw
            long r10 = r0.zzw
            r9.<init>(r10, r5)
            r2.zzN(r9)
            r2 = 1
            r0.zzG = r2
        L_0x05ed:
            int r2 = r0.zzp
            if (r2 != r8) goto L_0x060b
            android.util.SparseArray r2 = r0.zze
            int r2 = r2.size()
            r9 = 0
        L_0x05f8:
            if (r9 >= r2) goto L_0x060b
            android.util.SparseArray r10 = r0.zze
            java.lang.Object r10 = r10.valueAt(r9)
            com.google.android.gms.internal.ads.zzafw r10 = (com.google.android.gms.internal.ads.zzafw) r10
            com.google.android.gms.internal.ads.zzagi r10 = r10.zzb
            r10.zzc = r5
            r10.zzb = r5
            int r9 = r9 + 1
            goto L_0x05f8
        L_0x060b:
            int r2 = r0.zzp
            if (r2 != r7) goto L_0x061c
            r7 = 0
            r0.zzy = r7
            long r2 = r0.zzq
            long r5 = r5 + r2
            r0.zzt = r5
            r2 = 2
            r0.zzo = r2
            goto L_0x0004
        L_0x061c:
            r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r5) goto L_0x071e
            r5 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r5) goto L_0x071e
            r5 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r5) goto L_0x071e
            r5 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r5) goto L_0x071e
            r5 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r5) goto L_0x071e
            if (r2 == r8) goto L_0x071e
            r5 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r5) goto L_0x071e
            r5 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r5) goto L_0x071e
            r5 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r5) goto L_0x0648
            goto L_0x071e
        L_0x0648:
            r5 = 1751411826(0x68646c72, float:4.3148E24)
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == r5) goto L_0x06e7
            r5 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r5) goto L_0x06e7
            r5 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r5) goto L_0x06e7
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r4) goto L_0x06e7
            r4 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r4) goto L_0x06e7
            r4 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r4) goto L_0x06e7
            r4 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r4) goto L_0x06e7
            if (r2 != r3) goto L_0x06d2
            goto L_0x06e7
        L_0x06d2:
            long r2 = r0.zzq
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x06e0
            r2 = 0
            r0.zzs = r2
            r2 = 1
            r0.zzo = r2
            goto L_0x0004
        L_0x06e0:
            java.lang.String r1 = "Skipping atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zzc(r1)
            throw r1
        L_0x06e7:
            int r2 = r0.zzr
            r3 = 8
            if (r2 != r3) goto L_0x0717
            long r4 = r0.zzq
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0710
            com.google.android.gms.internal.ads.zzen r2 = new com.google.android.gms.internal.ads.zzen
            long r4 = r0.zzq
            int r5 = (int) r4
            r2.<init>((int) r5)
            com.google.android.gms.internal.ads.zzen r4 = r0.zzl
            byte[] r4 = r4.zzH()
            byte[] r5 = r2.zzH()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r3)
            r0.zzs = r2
            r2 = 1
            r0.zzo = r2
            goto L_0x0004
        L_0x0710:
            java.lang.String r1 = "Leaf atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zzc(r1)
            throw r1
        L_0x0717:
            java.lang.String r1 = "Leaf atom defines extended atom size (unsupported)."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zzc(r1)
            throw r1
        L_0x071e:
            long r3 = r34.zzf()
            long r5 = r0.zzq
            long r3 = r3 + r5
            java.util.ArrayDeque r5 = r0.zzm
            com.google.android.gms.internal.ads.zzafh r6 = new com.google.android.gms.internal.ads.zzafh
            r7 = -8
            long r3 = r3 + r7
            r6.<init>(r2, r3)
            r5.push(r6)
            long r5 = r0.zzq
            int r2 = r0.zzr
            long r7 = (long) r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0740
            r0.zzi(r3)
            goto L_0x0004
        L_0x0740:
            r33.zzg()
            goto L_0x0004
        L_0x0745:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zzc(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafx.zza(com.google.android.gms.internal.ads.zzzv, com.google.android.gms.internal.ads.zzaau):int");
    }

    public final void zzb(zzzx zzzx) {
        this.zzD = zzzx;
        zzg();
        zzabb[] zzabbArr = new zzabb[2];
        this.zzE = zzabbArr;
        int i10 = 0;
        zzabb[] zzabbArr2 = (zzabb[]) zzew.zzaf(zzabbArr, 0);
        this.zzE = zzabbArr2;
        for (zzabb zzk2 : zzabbArr2) {
            zzk2.zzk(zzc);
        }
        this.zzF = new zzabb[this.zzd.size()];
        int i11 = 100;
        while (i10 < this.zzF.length) {
            int i12 = i11 + 1;
            zzabb zzv2 = this.zzD.zzv(i11, 3);
            zzv2.zzk((zzaf) this.zzd.get(i10));
            this.zzF[i10] = zzv2;
            i10++;
            i11 = i12;
        }
    }

    public final void zzc(long j10, long j11) {
        int size = this.zze.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzafw) this.zze.valueAt(i10)).zzi();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j11;
        this.zzm.clear();
        zzg();
    }

    public final boolean zzd(zzzv zzzv) throws IOException {
        return zzagf.zza(zzzv);
    }

    public zzafx(int i10, zzeu zzeu) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzacs();
        this.zzl = new zzen(16);
        this.zzf = new zzen(zzaar.zza);
        this.zzg = new zzen(5);
        this.zzh = new zzen();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzen(bArr);
        this.zzm = new ArrayDeque();
        this.zzn = new ArrayDeque();
        this.zze = new SparseArray();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zzzx.zza;
        this.zzE = new zzabb[0];
        this.zzF = new zzabb[0];
    }
}
