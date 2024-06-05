package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzabs implements zzabk {
    public final zzfqk zza;
    private final int zzb;

    private zzabs(int i10, zzfqk zzfqk) {
        this.zzb = i10;
        this.zza = zzfqk;
    }

    public static zzabs zzc(int i10, zzen zzen) {
        String str;
        zzen zzen2 = zzen;
        zzfqh zzfqh = new zzfqh();
        int zzd = zzen.zzd();
        int i11 = -2;
        while (zzen.zza() > 8) {
            int zzg = zzen.zzg();
            int zzc = zzen.zzc() + zzen.zzg();
            zzen2.zzE(zzc);
            zzabk zzabk = null;
            if (zzg != 1414744396) {
                switch (zzg) {
                    case 1718776947:
                        if (i11 != 2) {
                            if (i11 != 1) {
                                zzee.zze("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzew.zzO(i11)));
                                break;
                            } else {
                                int zzi = zzen.zzi();
                                String str2 = zzi != 1 ? zzi != 85 ? zzi != 255 ? zzi != 8192 ? zzi != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int zzi2 = zzen.zzi();
                                    int zzg2 = zzen.zzg();
                                    zzen2.zzG(6);
                                    int zzn = zzew.zzn(zzen.zzo());
                                    int zzi3 = zzen.zzi();
                                    byte[] bArr = new byte[zzi3];
                                    zzen2.zzB(bArr, 0, zzi3);
                                    zzad zzad = new zzad();
                                    zzad.zzS(str2);
                                    zzad.zzw(zzi2);
                                    zzad.zzT(zzg2);
                                    if ("audio/raw".equals(str2) && zzn != 0) {
                                        zzad.zzN(zzn);
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && zzi3 > 0) {
                                        zzad.zzI(zzfqk.zzp(bArr));
                                    }
                                    zzabk = new zzabt(zzad.zzY());
                                    break;
                                } else {
                                    zzee.zze("StreamFormatChunk", "Ignoring track with unsupported format tag " + zzi);
                                    break;
                                }
                            }
                        } else {
                            zzen2.zzG(4);
                            int zzg3 = zzen.zzg();
                            int zzg4 = zzen.zzg();
                            zzen2.zzG(4);
                            int zzg5 = zzen.zzg();
                            switch (zzg5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = MimeTypes.VIDEO_H264;
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                zzad zzad2 = new zzad();
                                zzad2.zzX(zzg3);
                                zzad2.zzF(zzg4);
                                zzad2.zzS(str);
                                zzabk = new zzabt(zzad2.zzY());
                                break;
                            } else {
                                zzee.zze("StreamFormatChunk", "Ignoring track with unsupported compression " + zzg5);
                                break;
                            }
                        }
                    case 1751742049:
                        zzabk = zzabp.zzb(zzen);
                        break;
                    case 1752331379:
                        zzabk = zzabq.zzb(zzen);
                        break;
                    case 1852994675:
                        zzabk = zzabu.zzb(zzen);
                        break;
                }
            } else {
                zzabk = zzc(zzen.zzg(), zzen2);
            }
            if (zzabk != null) {
                if (zzabk.zza() == 1752331379) {
                    int i12 = ((zzabq) zzabk).zza;
                    if (i12 == 1935960438) {
                        i11 = 2;
                    } else if (i12 == 1935963489) {
                        i11 = 1;
                    } else if (i12 != 1937012852) {
                        zzee.zze("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i12))));
                        i11 = -1;
                    } else {
                        i11 = 3;
                    }
                }
                zzfqh.zzf(zzabk);
            }
            zzen2.zzF(zzc);
            zzen2.zzE(zzd);
        }
        return new zzabs(i10, zzfqh.zzi());
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzabk zzb(Class cls) {
        zzfqk zzfqk = this.zza;
        int size = zzfqk.size();
        int i10 = 0;
        while (i10 < size) {
            zzabk zzabk = (zzabk) zzfqk.get(i10);
            i10++;
            if (zzabk.getClass() == cls) {
                return zzabk;
            }
        }
        return null;
    }
}
