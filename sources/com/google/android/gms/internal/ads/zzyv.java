package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzyv {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        int i10 = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) <= 10) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i10 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return zzb[i10] * 256;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i10 = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i10 + i10;
        }
        byte b10 = bArr[4];
        return zzf((b10 & 192) >> 6, b10 & 63);
    }

    public static zzaf zzc(zzen zzen, String str, String str2, zzx zzx) {
        zzem zzem = new zzem();
        zzem.zzh(zzen);
        int i10 = zzc[zzem.zzd(2)];
        zzem.zzl(8);
        int i11 = zze[zzem.zzd(3)];
        if (zzem.zzd(1) != 0) {
            i11++;
        }
        int i12 = zzf[zzem.zzd(5)] * 1000;
        zzem.zze();
        zzen.zzF(zzem.zzb());
        zzad zzad = new zzad();
        zzad.zzH(str);
        zzad.zzS("audio/ac3");
        zzad.zzw(i11);
        zzad.zzT(i10);
        zzad.zzB(zzx);
        zzad.zzK(str2);
        zzad.zzv(i12);
        zzad.zzO(i12);
        return zzad.zzY();
    }

    public static zzaf zzd(zzen zzen, String str, String str2, zzx zzx) {
        String str3;
        zzem zzem = new zzem();
        zzem.zzh(zzen);
        int zzd2 = zzem.zzd(13) * 1000;
        zzem.zzl(3);
        int i10 = zzc[zzem.zzd(2)];
        zzem.zzl(10);
        int i11 = zze[zzem.zzd(3)];
        if (zzem.zzd(1) != 0) {
            i11++;
        }
        zzem.zzl(3);
        int zzd3 = zzem.zzd(4);
        zzem.zzl(1);
        if (zzd3 > 0) {
            zzem.zzm(6);
            if (zzem.zzd(1) != 0) {
                i11 += 2;
            }
            zzem.zzl(1);
        }
        if (zzem.zza() > 7) {
            zzem.zzl(7);
            if (zzem.zzd(1) != 0) {
                str3 = "audio/eac3-joc";
                zzem.zze();
                zzen.zzF(zzem.zzb());
                zzad zzad = new zzad();
                zzad.zzH(str);
                zzad.zzS(str3);
                zzad.zzw(i11);
                zzad.zzT(i10);
                zzad.zzB(zzx);
                zzad.zzK(str2);
                zzad.zzO(zzd2);
                return zzad.zzY();
            }
        }
        str3 = "audio/eac3";
        zzem.zze();
        zzen.zzF(zzem.zzb());
        zzad zzad2 = new zzad();
        zzad2.zzH(str);
        zzad2.zzS(str3);
        zzad2.zzw(i11);
        zzad2.zzT(i10);
        zzad2.zzB(zzx);
        zzad2.zzK(str2);
        zzad2.zzO(zzd2);
        return zzad2.zzY();
    }

    public static zzyu zze(zzem zzem) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        zzem zzem2 = zzem;
        int zzc2 = zzem.zzc();
        zzem2.zzl(40);
        int zzd2 = zzem2.zzd(5);
        zzem2.zzj(zzc2);
        int i21 = -1;
        if (zzd2 > 10) {
            zzem2.zzl(16);
            int zzd3 = zzem2.zzd(2);
            if (zzd3 == 0) {
                i21 = 0;
            } else if (zzd3 == 1) {
                i21 = 1;
            } else if (zzd3 == 2) {
                i21 = 2;
            }
            zzem2.zzl(3);
            int zzd4 = zzem2.zzd(11) + 1;
            int zzd5 = zzem2.zzd(2);
            if (zzd5 == 3) {
                i18 = zzd[zzem2.zzd(2)];
                i17 = 3;
                i16 = 6;
            } else {
                int zzd6 = zzem2.zzd(2);
                int i22 = zzb[zzd6];
                i17 = zzd6;
                i18 = zzc[zzd5];
                i16 = i22;
            }
            int i23 = zzd4 + zzd4;
            int i24 = (i23 * i18) / (i16 * 32);
            int zzd7 = zzem2.zzd(3);
            boolean zzn = zzem.zzn();
            int i25 = zze[zzd7] + (zzn ? 1 : 0);
            zzem2.zzl(10);
            if (zzem.zzn()) {
                zzem2.zzl(8);
            }
            if (zzd7 == 0) {
                zzem2.zzl(5);
                if (zzem.zzn()) {
                    zzem2.zzl(8);
                }
                i19 = 0;
                zzd7 = 0;
            } else {
                i19 = zzd7;
            }
            if (i21 == 1) {
                if (zzem.zzn()) {
                    zzem2.zzl(16);
                }
                i20 = 1;
            } else {
                i20 = i21;
            }
            if (zzem.zzn()) {
                if (i19 > 2) {
                    zzem2.zzl(2);
                }
                if ((i19 & 1) != 0 && i19 > 2) {
                    zzem2.zzl(6);
                }
                if ((i19 & 4) != 0) {
                    zzem2.zzl(6);
                }
                if (zzn && zzem.zzn()) {
                    zzem2.zzl(5);
                }
                if (i20 == 0) {
                    if (zzem.zzn()) {
                        zzem2.zzl(6);
                    }
                    if (i19 == 0 && zzem.zzn()) {
                        zzem2.zzl(6);
                    }
                    if (zzem.zzn()) {
                        zzem2.zzl(6);
                    }
                    int zzd8 = zzem2.zzd(2);
                    if (zzd8 == 1) {
                        zzem2.zzl(5);
                    } else if (zzd8 == 2) {
                        zzem2.zzl(12);
                    } else if (zzd8 == 3) {
                        int zzd9 = zzem2.zzd(5);
                        if (zzem.zzn()) {
                            zzem2.zzl(5);
                            if (zzem.zzn()) {
                                zzem2.zzl(4);
                            }
                            if (zzem.zzn()) {
                                zzem2.zzl(4);
                            }
                            if (zzem.zzn()) {
                                zzem2.zzl(4);
                            }
                            if (zzem.zzn()) {
                                zzem2.zzl(4);
                            }
                            if (zzem.zzn()) {
                                zzem2.zzl(4);
                            }
                            if (zzem.zzn()) {
                                zzem2.zzl(4);
                            }
                            if (zzem.zzn()) {
                                zzem2.zzl(4);
                            }
                            if (zzem.zzn()) {
                                if (zzem.zzn()) {
                                    zzem2.zzl(4);
                                }
                                if (zzem.zzn()) {
                                    zzem2.zzl(4);
                                }
                            }
                        }
                        if (zzem.zzn()) {
                            zzem2.zzl(5);
                            if (zzem.zzn()) {
                                zzem2.zzl(7);
                                if (zzem.zzn()) {
                                    zzem2.zzl(8);
                                }
                            }
                        }
                        zzem2.zzl((zzd9 + 2) * 8);
                        zzem.zze();
                    }
                    if (i19 < 2) {
                        if (zzem.zzn()) {
                            zzem2.zzl(14);
                        }
                        if (zzd7 == 0 && zzem.zzn()) {
                            zzem2.zzl(14);
                        }
                    }
                    if (zzem.zzn()) {
                        if (i17 == 0) {
                            zzem2.zzl(5);
                            i20 = 0;
                            i17 = 0;
                        } else {
                            for (int i26 = 0; i26 < i16; i26++) {
                                if (zzem.zzn()) {
                                    zzem2.zzl(5);
                                }
                            }
                        }
                    }
                    i20 = 0;
                }
            }
            if (zzem.zzn()) {
                zzem2.zzl(5);
                if (i19 == 2) {
                    zzem2.zzl(4);
                    i19 = 2;
                }
                if (i19 >= 6) {
                    zzem2.zzl(2);
                }
                if (zzem.zzn()) {
                    zzem2.zzl(8);
                }
                if (i19 == 0 && zzem.zzn()) {
                    zzem2.zzl(8);
                }
                if (zzd5 < 3) {
                    zzem.zzk();
                }
            }
            if (i20 == 0 && i17 != 3) {
                zzem.zzk();
            }
            if (i20 == 2 && (i17 == 3 || zzem.zzn())) {
                zzem2.zzl(6);
            }
            str = (zzem.zzn() && zzem2.zzd(6) == 1 && zzem2.zzd(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i15 = i21;
            i12 = i23;
            i13 = i18;
            i11 = i16 * 256;
            i10 = i24;
            i14 = i25;
        } else {
            zzem2.zzl(32);
            int zzd10 = zzem2.zzd(2);
            String str2 = zzd10 == 3 ? null : "audio/ac3";
            int zzd11 = zzem2.zzd(6);
            int i27 = zzf[zzd11 / 2] * 1000;
            int zzf2 = zzf(zzd10, zzd11);
            zzem2.zzl(8);
            int zzd12 = zzem2.zzd(3);
            if (!((zzd12 & 1) == 0 || zzd12 == 1)) {
                zzem2.zzl(2);
            }
            if ((zzd12 & 4) != 0) {
                zzem2.zzl(2);
            }
            if (zzd12 == 2) {
                zzem2.zzl(2);
            }
            str = str2;
            i10 = i27;
            i12 = zzf2;
            i13 = zzd10 < 3 ? zzc[zzd10] : -1;
            i14 = zze[zzd12] + (zzem.zzn() ? 1 : 0);
            i15 = -1;
            i11 = 1536;
        }
        return new zzyu(str, i15, i14, i13, i12, i11, i10, (zzyt) null);
    }

    private static int zzf(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || (i12 = i11 >> 1) >= 19) {
            return -1;
        }
        int i13 = zzc[i10];
        if (i13 == 44100) {
            int i14 = zzg[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = zzf[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }
}
