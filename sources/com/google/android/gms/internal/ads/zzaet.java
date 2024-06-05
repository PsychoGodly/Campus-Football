package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaet {
    public int zzA = 1000;
    public int zzB = 200;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public byte[] zzM;
    public int zzN = 1;
    public int zzO = -1;
    public int zzP = 8000;
    public long zzQ = 0;
    public long zzR = 0;
    public zzabc zzS;
    public boolean zzT;
    public boolean zzU = true;
    public zzabb zzV;
    public int zzW;
    /* access modifiers changed from: private */
    public int zzX;
    /* access modifiers changed from: private */
    public String zzY = "eng";
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzaba zzi;
    public byte[] zzj;
    public zzx zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = 0;
    public int zzq = -1;
    public float zzr = 0.0f;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public byte[] zzu = null;
    public int zzv = -1;
    public boolean zzw = false;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;

    protected zzaet() {
    }

    private static Pair zzf(zzen zzen) throws zzbu {
        try {
            zzen.zzG(16);
            long zzq2 = zzen.zzq();
            if (zzq2 == 1482049860) {
                return new Pair("video/divx", (Object) null);
            }
            if (zzq2 == 859189832) {
                return new Pair("video/3gpp", (Object) null);
            }
            if (zzq2 == 826496599) {
                int zzc2 = zzen.zzc() + 20;
                byte[] zzH2 = zzen.zzH();
                while (true) {
                    int length = zzH2.length;
                    if (zzc2 >= length - 4) {
                        throw zzbu.zza("Failed to find FourCC VC1 initialization data", (Throwable) null);
                    } else if (zzH2[zzc2] == 0 && zzH2[zzc2 + 1] == 0 && zzH2[zzc2 + 2] == 1 && zzH2[zzc2 + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzH2, zzc2, length)));
                    } else {
                        zzc2++;
                    }
                }
            } else {
                zzee.zze("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", (Object) null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.zza("Error parsing FourCC private data", (Throwable) null);
        }
    }

    private static List zzg(byte[] bArr) throws zzbu {
        byte b10;
        byte b11;
        try {
            if (bArr[0] == 2) {
                int i10 = 1;
                int i11 = 0;
                while (true) {
                    b10 = bArr[i10] & 255;
                    if (b10 != 255) {
                        break;
                    }
                    i10++;
                    i11 += 255;
                }
                int i12 = i11 + b10;
                int i13 = i10 + 1;
                int i14 = 0;
                while (true) {
                    b11 = bArr[i13] & 255;
                    if (b11 != 255) {
                        break;
                    }
                    i13++;
                    i14 += 255;
                }
                int i15 = i13 + 1;
                int i16 = i14 + b11;
                if (bArr[i15] == 1) {
                    byte[] bArr2 = new byte[i12];
                    System.arraycopy(bArr, i15, bArr2, 0, i12);
                    int i17 = i15 + i12;
                    if (bArr[i17] == 3) {
                        int i18 = i17 + i16;
                        if (bArr[i18] == 5) {
                            int length = bArr.length - i18;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i18, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzbu.zza("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw zzbu.zza("Error parsing vorbis codec private", (Throwable) null);
                }
                throw zzbu.zza("Error parsing vorbis codec private", (Throwable) null);
            }
            throw zzbu.zza("Error parsing vorbis codec private", (Throwable) null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.zza("Error parsing vorbis codec private", (Throwable) null);
        }
    }

    private static boolean zzh(zzen zzen) throws zzbu {
        try {
            int zzi2 = zzen.zzi();
            if (zzi2 == 1) {
                return true;
            }
            if (zzi2 == 65534) {
                zzen.zzF(24);
                return zzen.zzr() == zzaeu.zzf.getMostSignificantBits() && zzen.zzr() == zzaeu.zzf.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.zza("Error parsing MS/ACM codec private", (Throwable) null);
        }
    }

    private final byte[] zzi(String str) throws zzbu {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzbu.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), (Throwable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: com.google.android.gms.internal.ads.zzq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v16, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0253, code lost:
        r1 = null;
        r2 = null;
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0290, code lost:
        r1 = null;
        r2 = null;
        r17 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02c2, code lost:
        r1 = null;
        r2 = null;
        r3 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0355, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x038a, code lost:
        r3 = -1;
        r9 = -1;
        r19 = r2;
        r2 = r1;
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03aa, code lost:
        r1 = null;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03ac, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03ad, code lost:
        r9 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03b0, code lost:
        if (r0.zzM == null) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03b2, code lost:
        r4 = com.google.android.gms.internal.ads.zzzq.zza(new com.google.android.gms.internal.ads.zzen(r0.zzM));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03bd, code lost:
        if (r4 == null) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03bf, code lost:
        r2 = r4.zza;
        r17 = "video/dolby-vision";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03c3, code lost:
        r4 = r17;
        r5 = r0.zzU;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03c9, code lost:
        if (true == r0.zzT) goto L_0x03cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03cb, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03cd, code lost:
        r8 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03ce, code lost:
        r5 = r5 | r8;
        r8 = new com.google.android.gms.internal.ads.zzad();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03d8, code lost:
        if (com.google.android.gms.internal.ads.zzbt.zzg(r4) == false) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03da, code lost:
        r8.zzw(r0.zzN);
        r8.zzT(r0.zzP);
        r8.zzN(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03ed, code lost:
        if (com.google.android.gms.internal.ads.zzbt.zzh(r4) == false) goto L_0x057f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03f1, code lost:
        if (r0.zzp != 0) goto L_0x0405;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03f3, code lost:
        r6 = r0.zzn;
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03f6, code lost:
        if (r6 != -1) goto L_0x03fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03f8, code lost:
        r6 = r0.zzl;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03fa, code lost:
        r0.zzn = r6;
        r6 = r0.zzo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03fe, code lost:
        if (r6 != -1) goto L_0x0402;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0400, code lost:
        r6 = r0.zzm;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0402, code lost:
        r0.zzo = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0405, code lost:
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0406, code lost:
        r6 = r0.zzn;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x040a, code lost:
        if (r6 == r7) goto L_0x041c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x040c, code lost:
        r11 = r0.zzo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x040e, code lost:
        if (r11 == r7) goto L_0x041c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0410, code lost:
        r11 = ((float) (r0.zzm * r6)) / ((float) (r0.zzl * r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x041c, code lost:
        r11 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0420, code lost:
        if (r0.zzw == false) goto L_0x04ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0426, code lost:
        if (r0.zzC == -1.0f) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x042c, code lost:
        if (r0.zzD == -1.0f) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0432, code lost:
        if (r0.zzE == -1.0f) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0438, code lost:
        if (r0.zzF == -1.0f) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x043e, code lost:
        if (r0.zzG == -1.0f) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0444, code lost:
        if (r0.zzH == -1.0f) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x044a, code lost:
        if (r0.zzI == -1.0f) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0450, code lost:
        if (r0.zzJ == -1.0f) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0456, code lost:
        if (r0.zzK == -1.0f) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x045c, code lost:
        if (r0.zzL != -1.0f) goto L_0x0460;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0460, code lost:
        r12 = new byte[25];
        r6 = java.nio.ByteBuffer.wrap(r12).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r6.put((byte) 0);
        r6.putShort((short) ((int) ((r0.zzC * 50000.0f) + 0.5f)));
        r6.putShort((short) ((int) ((r0.zzD * 50000.0f) + 0.5f)));
        r6.putShort((short) ((int) ((r0.zzE * 50000.0f) + 0.5f)));
        r6.putShort((short) ((int) ((r0.zzF * 50000.0f) + 0.5f)));
        r6.putShort((short) ((int) ((r0.zzG * 50000.0f) + 0.5f)));
        r6.putShort((short) ((int) ((r0.zzH * 50000.0f) + 0.5f)));
        r6.putShort((short) ((int) ((r0.zzI * 50000.0f) + 0.5f)));
        r6.putShort((short) ((int) ((r0.zzJ * 50000.0f) + 0.5f)));
        r6.putShort((short) ((int) (r0.zzK + 0.5f)));
        r6.putShort((short) ((int) (r0.zzL + 0.5f)));
        r6.putShort((short) r0.zzA);
        r6.putShort((short) r0.zzB);
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04e2, code lost:
        r12 = new com.google.android.gms.internal.ads.zzq(r0.zzx, r0.zzz, r0.zzy, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04f0, code lost:
        if (r0.zza == null) goto L_0x050f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04fc, code lost:
        if (com.google.android.gms.internal.ads.zzaeu.zzg.containsKey(r0.zza) == false) goto L_0x050f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04fe, code lost:
        r7 = ((java.lang.Integer) com.google.android.gms.internal.ads.zzaeu.zzg.get(r0.zza)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0511, code lost:
        if (r0.zzq != 0) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x051a, code lost:
        if (java.lang.Float.compare(r0.zzr, 0.0f) != 0) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0522, code lost:
        if (java.lang.Float.compare(r0.zzs, 0.0f) != 0) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x052a, code lost:
        if (java.lang.Float.compare(r0.zzt, 0.0f) != 0) goto L_0x052d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0535, code lost:
        if (java.lang.Float.compare(r0.zzs, 90.0f) != 0) goto L_0x053a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0537, code lost:
        r10 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0542, code lost:
        if (java.lang.Float.compare(r0.zzs, -180.0f) == 0) goto L_0x055c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x054c, code lost:
        if (java.lang.Float.compare(r0.zzs, 180.0f) != 0) goto L_0x054f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0557, code lost:
        if (java.lang.Float.compare(r0.zzs, -90.0f) != 0) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0559, code lost:
        r10 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x055c, code lost:
        r10 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x055f, code lost:
        r10 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0560, code lost:
        r8.zzX(r0.zzl);
        r8.zzF(r0.zzm);
        r8.zzP(r11);
        r8.zzR(r10);
        r8.zzQ(r0.zzu);
        r8.zzV(r0.zzv);
        r8.zzy(r12);
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0583, code lost:
        if ("application/x-subrip".equals(r4) != false) goto L_0x05b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0589, code lost:
        if ("text/x-ssa".equals(r4) != false) goto L_0x05b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x058f, code lost:
        if ("text/vtt".equals(r4) != false) goto L_0x05b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0597, code lost:
        if ("application/vobsub".equals(r4) != false) goto L_0x05b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x059f, code lost:
        if ("application/pgs".equals(r4) != false) goto L_0x05b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05a7, code lost:
        if ("application/dvbsubs".equals(r4) == false) goto L_0x05aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05b0, code lost:
        throw com.google.android.gms.internal.ads.zzbu.zza("Unexpected MIME type.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05b1, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05b4, code lost:
        if (r0.zza == null) goto L_0x05c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05c0, code lost:
        if (com.google.android.gms.internal.ads.zzaeu.zzg.containsKey(r0.zza) != false) goto L_0x05c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05c2, code lost:
        r8.zzJ(r0.zza);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05c7, code lost:
        r8.zzG(r22);
        r8.zzS(r4);
        r8.zzL(r3);
        r8.zzK(r0.zzY);
        r8.zzU(r5);
        r8.zzI(r1);
        r8.zzx(r2);
        r8.zzB(r0.zzk);
        r1 = r8.zzY();
        r2 = r21.zzv(r0.zzc, r6);
        r0.zzV = r2;
        r2.zzk(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05f6, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(com.google.android.gms.internal.ads.zzzx r21, int r22) throws com.google.android.gms.internal.ads.zzbu {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = r0.zzb
            int r2 = r1.hashCode()
            r4 = 16
            r5 = 32
            r6 = 1
            r8 = 8
            r9 = 4
            r10 = 0
            r11 = 3
            switch(r2) {
                case -2095576542: goto L_0x0188;
                case -2095575984: goto L_0x017e;
                case -1985379776: goto L_0x0173;
                case -1784763192: goto L_0x0168;
                case -1730367663: goto L_0x015d;
                case -1482641358: goto L_0x0152;
                case -1482641357: goto L_0x0147;
                case -1373388978: goto L_0x013c;
                case -933872740: goto L_0x0131;
                case -538363189: goto L_0x0126;
                case -538363109: goto L_0x011b;
                case -425012669: goto L_0x010f;
                case -356037306: goto L_0x0103;
                case 62923557: goto L_0x00f7;
                case 62923603: goto L_0x00eb;
                case 62927045: goto L_0x00df;
                case 82318131: goto L_0x00d4;
                case 82338133: goto L_0x00c9;
                case 82338134: goto L_0x00be;
                case 99146302: goto L_0x00b2;
                case 444813526: goto L_0x00a6;
                case 542569478: goto L_0x009a;
                case 635596514: goto L_0x008e;
                case 725948237: goto L_0x0082;
                case 725957860: goto L_0x0076;
                case 738597099: goto L_0x006a;
                case 855502857: goto L_0x005e;
                case 1045209816: goto L_0x0052;
                case 1422270023: goto L_0x0046;
                case 1809237540: goto L_0x003b;
                case 1950749482: goto L_0x002f;
                case 1950789798: goto L_0x0023;
                case 1951062397: goto L_0x0017;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0192
        L_0x0017:
            java.lang.String r2 = "A_OPUS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 12
            goto L_0x0193
        L_0x0023:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 22
            goto L_0x0193
        L_0x002f:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 17
            goto L_0x0193
        L_0x003b:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 3
            goto L_0x0193
        L_0x0046:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 27
            goto L_0x0193
        L_0x0052:
            java.lang.String r2 = "S_TEXT/WEBVTT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 29
            goto L_0x0193
        L_0x005e:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 8
            goto L_0x0193
        L_0x006a:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 28
            goto L_0x0193
        L_0x0076:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 24
            goto L_0x0193
        L_0x0082:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 25
            goto L_0x0193
        L_0x008e:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 26
            goto L_0x0193
        L_0x009a:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 20
            goto L_0x0193
        L_0x00a6:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 10
            goto L_0x0193
        L_0x00b2:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 31
            goto L_0x0193
        L_0x00be:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 1
            goto L_0x0193
        L_0x00c9:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 0
            goto L_0x0193
        L_0x00d4:
            java.lang.String r2 = "V_AV1"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 2
            goto L_0x0193
        L_0x00df:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 19
            goto L_0x0193
        L_0x00eb:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 16
            goto L_0x0193
        L_0x00f7:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 13
            goto L_0x0193
        L_0x0103:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 21
            goto L_0x0193
        L_0x010f:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 30
            goto L_0x0193
        L_0x011b:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 7
            goto L_0x0193
        L_0x0126:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 5
            goto L_0x0193
        L_0x0131:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 32
            goto L_0x0193
        L_0x013c:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 9
            goto L_0x0193
        L_0x0147:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 15
            goto L_0x0193
        L_0x0152:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 14
            goto L_0x0193
        L_0x015d:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 11
            goto L_0x0193
        L_0x0168:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 18
            goto L_0x0193
        L_0x0173:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 23
            goto L_0x0193
        L_0x017e:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 4
            goto L_0x0193
        L_0x0188:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0192
            r2 = 6
            goto L_0x0193
        L_0x0192:
            r2 = -1
        L_0x0193:
            java.lang.String r13 = ". Setting mimeType to audio/x-unknown"
            java.lang.String r14 = "text/vtt"
            java.lang.String r15 = "text/x-ssa"
            java.lang.String r7 = "application/x-subrip"
            r16 = 4096(0x1000, float:5.74E-42)
            java.lang.String r17 = "audio/raw"
            java.lang.String r18 = "audio/x-unknown"
            java.lang.String r3 = "MatroskaExtractor"
            r12 = 0
            switch(r2) {
                case 0: goto L_0x03a8;
                case 1: goto L_0x03a5;
                case 2: goto L_0x03a2;
                case 3: goto L_0x039f;
                case 4: goto L_0x0392;
                case 5: goto L_0x0392;
                case 6: goto L_0x0392;
                case 7: goto L_0x0371;
                case 8: goto L_0x0357;
                case 9: goto L_0x033c;
                case 10: goto L_0x0338;
                case 11: goto L_0x0327;
                case 12: goto L_0x02e4;
                case 13: goto L_0x02c8;
                case 14: goto L_0x02c0;
                case 15: goto L_0x02bd;
                case 16: goto L_0x02b9;
                case 17: goto L_0x02b5;
                case 18: goto L_0x02aa;
                case 19: goto L_0x02a6;
                case 20: goto L_0x02a6;
                case 21: goto L_0x02a2;
                case 22: goto L_0x0296;
                case 23: goto L_0x0258;
                case 24: goto L_0x0231;
                case 25: goto L_0x020a;
                case 26: goto L_0x01ec;
                case 27: goto L_0x01e8;
                case 28: goto L_0x01d5;
                case 29: goto L_0x01cf;
                case 30: goto L_0x01c3;
                case 31: goto L_0x01bf;
                case 32: goto L_0x01ae;
                default: goto L_0x01a7;
            }
        L_0x01a7:
            java.lang.String r1 = "Unrecognized codec identifier."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r1, r12)
            throw r1
        L_0x01ae:
            byte[] r2 = new byte[r9]
            byte[] r1 = r0.zzi(r1)
            java.lang.System.arraycopy(r1, r10, r2, r10, r9)
            com.google.android.gms.internal.ads.zzfqk r1 = com.google.android.gms.internal.ads.zzfqk.zzp(r2)
            java.lang.String r17 = "application/dvbsubs"
            goto L_0x0355
        L_0x01bf:
            java.lang.String r17 = "application/pgs"
            goto L_0x03aa
        L_0x01c3:
            byte[] r1 = r0.zzi(r1)
            com.google.android.gms.internal.ads.zzfqk r1 = com.google.android.gms.internal.ads.zzfqk.zzp(r1)
            java.lang.String r17 = "application/vobsub"
            goto L_0x0355
        L_0x01cf:
            r1 = r12
            r2 = r1
            r17 = r14
            goto L_0x03ac
        L_0x01d5:
            byte[] r1 = com.google.android.gms.internal.ads.zzaeu.zzc
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            com.google.android.gms.internal.ads.zzfqk r1 = com.google.android.gms.internal.ads.zzfqk.zzq(r1, r2)
            r2 = r12
            r17 = r15
            goto L_0x03ac
        L_0x01e8:
            r17 = r7
            goto L_0x03aa
        L_0x01ec:
            int r1 = r0.zzO
            if (r1 != r5) goto L_0x01f1
            goto L_0x0253
        L_0x01f1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unsupported floating point PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzee.zze(r3, r1)
            goto L_0x0290
        L_0x020a:
            int r1 = r0.zzO
            if (r1 != r8) goto L_0x0214
            r1 = r12
            r2 = r1
            r3 = -1
            r9 = 3
            goto L_0x03ae
        L_0x0214:
            if (r1 != r4) goto L_0x0219
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0253
        L_0x0219:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unsupported big endian PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzee.zze(r3, r1)
            goto L_0x0290
        L_0x0231:
            int r1 = r0.zzO
            int r9 = com.google.android.gms.internal.ads.zzew.zzn(r1)
            if (r9 != 0) goto L_0x0253
            int r1 = r0.zzO
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unsupported little endian PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzee.zze(r3, r1)
            goto L_0x0290
        L_0x0253:
            r1 = r12
            r2 = r1
            r3 = -1
            goto L_0x03ae
        L_0x0258:
            com.google.android.gms.internal.ads.zzen r1 = new com.google.android.gms.internal.ads.zzen
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.<init>((byte[]) r2)
            boolean r1 = zzh(r1)
            if (r1 == 0) goto L_0x028b
            int r1 = r0.zzO
            int r9 = com.google.android.gms.internal.ads.zzew.zzn(r1)
            if (r9 != 0) goto L_0x0253
            int r1 = r0.zzO
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unsupported PCM bit depth: "
            r2.append(r4)
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzee.zze(r3, r1)
            goto L_0x0290
        L_0x028b:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"
            com.google.android.gms.internal.ads.zzee.zze(r3, r1)
        L_0x0290:
            r1 = r12
            r2 = r1
            r17 = r18
            goto L_0x03ac
        L_0x0296:
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r17 = "audio/flac"
            goto L_0x0355
        L_0x02a2:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L_0x03aa
        L_0x02a6:
            java.lang.String r17 = "audio/vnd.dts"
            goto L_0x03aa
        L_0x02aa:
            com.google.android.gms.internal.ads.zzabc r1 = new com.google.android.gms.internal.ads.zzabc
            r1.<init>()
            r0.zzS = r1
            java.lang.String r17 = "audio/true-hd"
            goto L_0x03aa
        L_0x02b5:
            java.lang.String r17 = "audio/eac3"
            goto L_0x03aa
        L_0x02b9:
            java.lang.String r17 = "audio/ac3"
            goto L_0x03aa
        L_0x02bd:
            java.lang.String r17 = "audio/mpeg"
            goto L_0x02c2
        L_0x02c0:
            java.lang.String r17 = "audio/mpeg-L2"
        L_0x02c2:
            r1 = r12
            r2 = r1
            r3 = 4096(0x1000, float:5.74E-42)
            goto L_0x03ad
        L_0x02c8:
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            byte[] r2 = r0.zzj
            com.google.android.gms.internal.ads.zzyr r2 = com.google.android.gms.internal.ads.zzys.zza(r2)
            int r3 = r2.zza
            r0.zzP = r3
            int r3 = r2.zzb
            r0.zzN = r3
            java.lang.String r2 = r2.zzc
            java.lang.String r17 = "audio/mp4a-latm"
            goto L_0x03ac
        L_0x02e4:
            r16 = 5760(0x1680, float:8.071E-42)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r4 = r0.zzQ
            java.nio.ByteBuffer r2 = r2.putLong(r4)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r3 = r0.zzR
            java.nio.ByteBuffer r2 = r2.putLong(r3)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.lang.String r17 = "audio/opus"
            r2 = r12
            r3 = 5760(0x1680, float:8.071E-42)
            goto L_0x03ad
        L_0x0327:
            r16 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = r0.zzi(r1)
            java.util.List r1 = zzg(r1)
            java.lang.String r17 = "audio/vorbis"
            r2 = r12
            r3 = 8192(0x2000, float:1.14794E-41)
            goto L_0x03ad
        L_0x0338:
            java.lang.String r17 = "video/x-unknown"
            goto L_0x03aa
        L_0x033c:
            com.google.android.gms.internal.ads.zzen r1 = new com.google.android.gms.internal.ads.zzen
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.<init>((byte[]) r2)
            android.util.Pair r1 = zzf(r1)
            java.lang.Object r2 = r1.first
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Object r1 = r1.second
            java.util.List r1 = (java.util.List) r1
        L_0x0355:
            r2 = r12
            goto L_0x03ac
        L_0x0357:
            com.google.android.gms.internal.ads.zzen r1 = new com.google.android.gms.internal.ads.zzen
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.<init>((byte[]) r2)
            com.google.android.gms.internal.ads.zzaak r1 = com.google.android.gms.internal.ads.zzaak.zza(r1)
            java.util.List r2 = r1.zza
            int r3 = r1.zzb
            r0.zzW = r3
            java.lang.String r1 = r1.zzd
            java.lang.String r17 = "video/hevc"
            goto L_0x038a
        L_0x0371:
            com.google.android.gms.internal.ads.zzen r1 = new com.google.android.gms.internal.ads.zzen
            java.lang.String r2 = r0.zzb
            byte[] r2 = r0.zzi(r2)
            r1.<init>((byte[]) r2)
            com.google.android.gms.internal.ads.zzyz r1 = com.google.android.gms.internal.ads.zzyz.zza(r1)
            java.util.List r2 = r1.zza
            int r3 = r1.zzb
            r0.zzW = r3
            java.lang.String r1 = r1.zzf
            java.lang.String r17 = "video/avc"
        L_0x038a:
            r3 = -1
            r9 = -1
            r19 = r2
            r2 = r1
            r1 = r19
            goto L_0x03ae
        L_0x0392:
            byte[] r1 = r0.zzj
            if (r1 != 0) goto L_0x0398
            r1 = r12
            goto L_0x039c
        L_0x0398:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x039c:
            java.lang.String r17 = "video/mp4v-es"
            goto L_0x0355
        L_0x039f:
            java.lang.String r17 = "video/mpeg2"
            goto L_0x03aa
        L_0x03a2:
            java.lang.String r17 = "video/av01"
            goto L_0x03aa
        L_0x03a5:
            java.lang.String r17 = "video/x-vnd.on2.vp9"
            goto L_0x03aa
        L_0x03a8:
            java.lang.String r17 = "video/x-vnd.on2.vp8"
        L_0x03aa:
            r1 = r12
            r2 = r1
        L_0x03ac:
            r3 = -1
        L_0x03ad:
            r9 = -1
        L_0x03ae:
            byte[] r4 = r0.zzM
            if (r4 == 0) goto L_0x03c3
            com.google.android.gms.internal.ads.zzen r4 = new com.google.android.gms.internal.ads.zzen
            byte[] r5 = r0.zzM
            r4.<init>((byte[]) r5)
            com.google.android.gms.internal.ads.zzzq r4 = com.google.android.gms.internal.ads.zzzq.zza(r4)
            if (r4 == 0) goto L_0x03c3
            java.lang.String r2 = r4.zza
            java.lang.String r17 = "video/dolby-vision"
        L_0x03c3:
            r4 = r17
            boolean r5 = r0.zzU
            boolean r8 = r0.zzT
            if (r6 == r8) goto L_0x03cd
            r8 = 0
            goto L_0x03ce
        L_0x03cd:
            r8 = 2
        L_0x03ce:
            r5 = r5 | r8
            com.google.android.gms.internal.ads.zzad r8 = new com.google.android.gms.internal.ads.zzad
            r8.<init>()
            boolean r13 = com.google.android.gms.internal.ads.zzbt.zzg(r4)
            if (r13 == 0) goto L_0x03e9
            int r7 = r0.zzN
            r8.zzw(r7)
            int r7 = r0.zzP
            r8.zzT(r7)
            r8.zzN(r9)
            goto L_0x05b2
        L_0x03e9:
            boolean r6 = com.google.android.gms.internal.ads.zzbt.zzh(r4)
            if (r6 == 0) goto L_0x057f
            int r6 = r0.zzp
            if (r6 != 0) goto L_0x0405
            int r6 = r0.zzn
            r7 = -1
            if (r6 != r7) goto L_0x03fa
            int r6 = r0.zzl
        L_0x03fa:
            r0.zzn = r6
            int r6 = r0.zzo
            if (r6 != r7) goto L_0x0402
            int r6 = r0.zzm
        L_0x0402:
            r0.zzo = r6
            goto L_0x0406
        L_0x0405:
            r7 = -1
        L_0x0406:
            int r6 = r0.zzn
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r6 == r7) goto L_0x041c
            int r11 = r0.zzo
            if (r11 == r7) goto L_0x041c
            int r13 = r0.zzm
            int r13 = r13 * r6
            int r6 = r0.zzl
            int r6 = r6 * r11
            float r11 = (float) r13
            float r6 = (float) r6
            float r11 = r11 / r6
            goto L_0x041e
        L_0x041c:
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x041e:
            boolean r6 = r0.zzw
            if (r6 == 0) goto L_0x04ee
            float r6 = r0.zzC
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x04e2
            float r6 = r0.zzD
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x04e2
            float r6 = r0.zzE
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x04e2
            float r6 = r0.zzF
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x04e2
            float r6 = r0.zzG
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x04e2
            float r6 = r0.zzH
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x04e2
            float r6 = r0.zzI
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x04e2
            float r6 = r0.zzJ
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x04e2
            float r6 = r0.zzK
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x04e2
            float r6 = r0.zzL
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x0460
            goto L_0x04e2
        L_0x0460:
            r6 = 25
            byte[] r12 = new byte[r6]
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r12)
            java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r6 = r6.order(r9)
            r6.put(r10)
            float r9 = r0.zzC
            r13 = 1195593728(0x47435000, float:50000.0)
            float r9 = r9 * r13
            r14 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzD
            float r9 = r9 * r13
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzE
            float r9 = r9 * r13
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzF
            float r9 = r9 * r13
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzG
            float r9 = r9 * r13
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzH
            float r9 = r9 * r13
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzI
            float r9 = r9 * r13
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzJ
            float r9 = r9 * r13
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzK
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            float r9 = r0.zzL
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r6.putShort(r9)
            int r9 = r0.zzA
            short r9 = (short) r9
            r6.putShort(r9)
            int r9 = r0.zzB
            short r9 = (short) r9
            r6.putShort(r9)
        L_0x04e2:
            com.google.android.gms.internal.ads.zzq r6 = new com.google.android.gms.internal.ads.zzq
            int r9 = r0.zzx
            int r13 = r0.zzz
            int r14 = r0.zzy
            r6.<init>(r9, r13, r14, r12)
            r12 = r6
        L_0x04ee:
            java.lang.String r6 = r0.zza
            if (r6 == 0) goto L_0x050f
            java.util.Map r6 = com.google.android.gms.internal.ads.zzaeu.zzg
            java.lang.String r9 = r0.zza
            boolean r6 = r6.containsKey(r9)
            if (r6 == 0) goto L_0x050f
            java.util.Map r6 = com.google.android.gms.internal.ads.zzaeu.zzg
            java.lang.String r7 = r0.zza
            java.lang.Object r6 = r6.get(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = r6
        L_0x050f:
            int r6 = r0.zzq
            if (r6 != 0) goto L_0x055f
            float r6 = r0.zzr
            r9 = 0
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 != 0) goto L_0x055f
            float r6 = r0.zzs
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 != 0) goto L_0x055f
            float r6 = r0.zzt
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 != 0) goto L_0x052d
            goto L_0x0560
        L_0x052d:
            float r6 = r0.zzs
            r9 = 1119092736(0x42b40000, float:90.0)
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 != 0) goto L_0x053a
            r10 = 90
            goto L_0x0560
        L_0x053a:
            float r6 = r0.zzs
            r9 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 == 0) goto L_0x055c
            float r6 = r0.zzs
            r9 = 1127481344(0x43340000, float:180.0)
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 != 0) goto L_0x054f
            goto L_0x055c
        L_0x054f:
            float r6 = r0.zzs
            r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 != 0) goto L_0x055f
            r10 = 270(0x10e, float:3.78E-43)
            goto L_0x0560
        L_0x055c:
            r10 = 180(0xb4, float:2.52E-43)
            goto L_0x0560
        L_0x055f:
            r10 = r7
        L_0x0560:
            int r6 = r0.zzl
            r8.zzX(r6)
            int r6 = r0.zzm
            r8.zzF(r6)
            r8.zzP(r11)
            r8.zzR(r10)
            byte[] r6 = r0.zzu
            r8.zzQ(r6)
            int r6 = r0.zzv
            r8.zzV(r6)
            r8.zzy(r12)
            r6 = 2
            goto L_0x05b2
        L_0x057f:
            boolean r6 = r7.equals(r4)
            if (r6 != 0) goto L_0x05b1
            boolean r6 = r15.equals(r4)
            if (r6 != 0) goto L_0x05b1
            boolean r6 = r14.equals(r4)
            if (r6 != 0) goto L_0x05b1
            java.lang.String r6 = "application/vobsub"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x05b1
            java.lang.String r6 = "application/pgs"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x05b1
            java.lang.String r6 = "application/dvbsubs"
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L_0x05aa
            goto L_0x05b1
        L_0x05aa:
            java.lang.String r1 = "Unexpected MIME type."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r1, r12)
            throw r1
        L_0x05b1:
            r6 = 3
        L_0x05b2:
            java.lang.String r7 = r0.zza
            if (r7 == 0) goto L_0x05c7
            java.util.Map r7 = com.google.android.gms.internal.ads.zzaeu.zzg
            java.lang.String r9 = r0.zza
            boolean r7 = r7.containsKey(r9)
            if (r7 != 0) goto L_0x05c7
            java.lang.String r7 = r0.zza
            r8.zzJ(r7)
        L_0x05c7:
            r7 = r22
            r8.zzG(r7)
            r8.zzS(r4)
            r8.zzL(r3)
            java.lang.String r3 = r0.zzY
            r8.zzK(r3)
            r8.zzU(r5)
            r8.zzI(r1)
            r8.zzx(r2)
            com.google.android.gms.internal.ads.zzx r1 = r0.zzk
            r8.zzB(r1)
            com.google.android.gms.internal.ads.zzaf r1 = r8.zzY()
            int r2 = r0.zzc
            r3 = r21
            com.google.android.gms.internal.ads.zzabb r2 = r3.zzv(r2, r6)
            r0.zzV = r2
            r2.zzk(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaet.zze(com.google.android.gms.internal.ads.zzzx, int):void");
    }
}
