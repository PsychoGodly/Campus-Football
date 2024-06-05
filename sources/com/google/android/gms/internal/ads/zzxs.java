package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzxs extends zzra {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private long zzB;
    private int zzC;
    private zzda zzD = zzda.zza;
    private zzda zzE = null;
    private int zzF = 0;
    private zzxw zzG;
    /* access modifiers changed from: private */
    public final Context zze;
    private final zzyd zzf;
    private final zzyo zzg;
    private final zzxr zzh;
    private final boolean zzi = "NVIDIA".equals(zzew.zzc);
    private zzxq zzj;
    private boolean zzk;
    private boolean zzl;
    private Surface zzm;
    private zzxv zzn;
    private boolean zzo;
    private int zzp = 1;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private long zzt;
    private long zzu = -9223372036854775807L;
    private long zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzxs(Context context, zzqt zzqt, zzrc zzrc, long j10, boolean z10, Handler handler, zzyp zzyp, int i10, float f10) {
        super(2, zzqt, zzrc, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        zzyd zzyd = new zzyd(applicationContext);
        this.zzf = zzyd;
        Handler handler2 = handler;
        zzyp zzyp2 = zzyp;
        this.zzg = new zzyo(handler, zzyp);
        this.zzh = new zzxr(zzyd, this);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r3.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r11 = ((java.lang.Integer) r11.first).intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzT(com.google.android.gms.internal.ads.zzqx r10, com.google.android.gms.internal.ads.zzaf r11) {
        /*
            int r0 = r11.zzr
            int r1 = r11.zzs
            r2 = -1
            if (r0 == r2) goto L_0x00d7
            if (r1 != r2) goto L_0x000b
            goto L_0x00d7
        L_0x000b:
            java.lang.String r3 = r11.zzm
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            r5 = 2
            r6 = 1
            java.lang.String r7 = "video/avc"
            java.lang.String r8 = "video/hevc"
            if (r4 == 0) goto L_0x0034
            android.util.Pair r11 = com.google.android.gms.internal.ads.zzrp.zzb(r11)
            if (r11 == 0) goto L_0x0033
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r11 == r3) goto L_0x0031
            if (r11 == r6) goto L_0x0031
            if (r11 != r5) goto L_0x0033
        L_0x0031:
            r3 = r7
            goto L_0x0034
        L_0x0033:
            r3 = r8
        L_0x0034:
            int r11 = r3.hashCode()
            r4 = 3
            r9 = 4
            switch(r11) {
                case -1664118616: goto L_0x0075;
                case -1662735862: goto L_0x006c;
                case -1662541442: goto L_0x0064;
                case 1187890754: goto L_0x005a;
                case 1331836730: goto L_0x0052;
                case 1599127256: goto L_0x0048;
                case 1599127257: goto L_0x003e;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x007f
        L_0x003e:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            r5 = 6
            goto L_0x0080
        L_0x0048:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            r5 = 3
            goto L_0x0080
        L_0x0052:
            boolean r11 = r3.equals(r7)
            if (r11 == 0) goto L_0x007f
            r5 = 5
            goto L_0x0080
        L_0x005a:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            r5 = 1
            goto L_0x0080
        L_0x0064:
            boolean r11 = r3.equals(r8)
            if (r11 == 0) goto L_0x007f
            r5 = 4
            goto L_0x0080
        L_0x006c:
            java.lang.String r11 = "video/av01"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            goto L_0x0080
        L_0x0075:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            r5 = 0
            goto L_0x0080
        L_0x007f:
            r5 = -1
        L_0x0080:
            switch(r5) {
                case 0: goto L_0x00d1;
                case 1: goto L_0x00d1;
                case 2: goto L_0x00d1;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00c5;
                case 5: goto L_0x008b;
                case 6: goto L_0x0084;
                default: goto L_0x0083;
            }
        L_0x0083:
            return r2
        L_0x0084:
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / 8
            return r0
        L_0x008b:
            java.lang.String r11 = com.google.android.gms.internal.ads.zzew.zzd
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x00c4
            java.lang.String r3 = com.google.android.gms.internal.ads.zzew.zzc
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00b4
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x00c4
            java.lang.String r3 = "AFTS"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x00b4
            boolean r10 = r10.zzf
            if (r10 == 0) goto L_0x00b4
            goto L_0x00c4
        L_0x00b4:
            r10 = 16
            int r11 = com.google.android.gms.internal.ads.zzew.zze(r0, r10)
            int r10 = com.google.android.gms.internal.ads.zzew.zze(r1, r10)
            int r11 = r11 * r10
            int r11 = r11 * 768
            int r11 = r11 / r9
            return r11
        L_0x00c4:
            return r2
        L_0x00c5:
            r10 = 2097152(0x200000, float:2.938736E-39)
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r9
            int r10 = java.lang.Math.max(r10, r0)
            return r10
        L_0x00d1:
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r9
            return r0
        L_0x00d7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxs.zzT(com.google.android.gms.internal.ads.zzqx, com.google.android.gms.internal.ads.zzaf):int");
    }

    protected static int zzU(zzqx zzqx, zzaf zzaf) {
        if (zzaf.zzn == -1) {
            return zzT(zzqx, zzaf);
        }
        int size = zzaf.zzo.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((byte[]) zzaf.zzo.get(i11)).length;
        }
        return zzaf.zzn + i10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x04c0, code lost:
        if (r0.equals("deb") != false) goto L_0x078a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x07a0, code lost:
        if (r10 != 0) goto L_0x07a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final boolean zzaD(java.lang.String r17) {
        /*
            java.lang.String r0 = "OMX.google"
            r1 = r17
            boolean r0 = r1.startsWith(r0)
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            java.lang.Class<com.google.android.gms.internal.ads.zzxs> r2 = com.google.android.gms.internal.ads.zzxs.class
            monitor-enter(r2)
            boolean r0 = zzc     // Catch:{ all -> 0x07aa }
            if (r0 != 0) goto L_0x07a6
            int r0 = com.google.android.gms.internal.ads.zzew.zza     // Catch:{ all -> 0x07aa }
            r3 = 28
            r4 = 5
            r5 = 6
            r6 = 4
            r7 = 7
            r8 = 2
            r9 = 3
            r10 = -1
            r11 = 1
            if (r0 > r3) goto L_0x0083
            java.lang.String r12 = com.google.android.gms.internal.ads.zzew.zzb     // Catch:{ all -> 0x07aa }
            int r13 = r12.hashCode()     // Catch:{ all -> 0x07aa }
            switch(r13) {
                case -1339091551: goto L_0x0071;
                case -1220081023: goto L_0x0067;
                case -1220066608: goto L_0x005d;
                case -1012436106: goto L_0x0053;
                case -760312546: goto L_0x0049;
                case -64886864: goto L_0x003f;
                case 3415681: goto L_0x0035;
                case 825323514: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x007b
        L_0x002b:
            java.lang.String r13 = "machuca"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 5
            goto L_0x007c
        L_0x0035:
            java.lang.String r13 = "once"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 6
            goto L_0x007c
        L_0x003f:
            java.lang.String r13 = "magnolia"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 4
            goto L_0x007c
        L_0x0049:
            java.lang.String r13 = "aquaman"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 0
            goto L_0x007c
        L_0x0053:
            java.lang.String r13 = "oneday"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 7
            goto L_0x007c
        L_0x005d:
            java.lang.String r13 = "dangalUHD"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 2
            goto L_0x007c
        L_0x0067:
            java.lang.String r13 = "dangalFHD"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 3
            goto L_0x007c
        L_0x0071:
            java.lang.String r13 = "dangal"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 1
            goto L_0x007c
        L_0x007b:
            r12 = -1
        L_0x007c:
            switch(r12) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0080;
                case 2: goto L_0x0080;
                case 3: goto L_0x0080;
                case 4: goto L_0x0080;
                case 5: goto L_0x0080;
                case 6: goto L_0x0080;
                case 7: goto L_0x0080;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x0083
        L_0x0080:
            r1 = 1
            goto L_0x07a2
        L_0x0083:
            r12 = 27
            if (r0 > r12) goto L_0x0092
            java.lang.String r13 = "HWEML"
            java.lang.String r14 = com.google.android.gms.internal.ads.zzew.zzb     // Catch:{ all -> 0x07aa }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x07aa }
            if (r13 == 0) goto L_0x0092
            goto L_0x0080
        L_0x0092:
            java.lang.String r13 = com.google.android.gms.internal.ads.zzew.zzd     // Catch:{ all -> 0x07aa }
            int r14 = r13.hashCode()     // Catch:{ all -> 0x07aa }
            r15 = 8
            switch(r14) {
                case -349662828: goto L_0x00ef;
                case -321033677: goto L_0x00e5;
                case 2006354: goto L_0x00db;
                case 2006367: goto L_0x00d1;
                case 2006371: goto L_0x00c7;
                case 1785421873: goto L_0x00bd;
                case 1785421876: goto L_0x00b3;
                case 1798172390: goto L_0x00a8;
                case 2119412532: goto L_0x009e;
                default: goto L_0x009d;
            }
        L_0x009d:
            goto L_0x00f9
        L_0x009e:
            java.lang.String r14 = "AFTEUFF014"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 5
            goto L_0x00fa
        L_0x00a8:
            java.lang.String r14 = "AFTSO001"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 8
            goto L_0x00fa
        L_0x00b3:
            java.lang.String r14 = "AFTEU014"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 4
            goto L_0x00fa
        L_0x00bd:
            java.lang.String r14 = "AFTEU011"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 3
            goto L_0x00fa
        L_0x00c7:
            java.lang.String r14 = "AFTR"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 2
            goto L_0x00fa
        L_0x00d1:
            java.lang.String r14 = "AFTN"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 1
            goto L_0x00fa
        L_0x00db:
            java.lang.String r14 = "AFTA"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 0
            goto L_0x00fa
        L_0x00e5:
            java.lang.String r14 = "AFTKMST12"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 7
            goto L_0x00fa
        L_0x00ef:
            java.lang.String r14 = "AFTJMST12"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 6
            goto L_0x00fa
        L_0x00f9:
            r14 = -1
        L_0x00fa:
            switch(r14) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0080;
                case 2: goto L_0x0080;
                case 3: goto L_0x0080;
                case 4: goto L_0x0080;
                case 5: goto L_0x0080;
                case 6: goto L_0x0080;
                case 7: goto L_0x0080;
                case 8: goto L_0x0080;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            r14 = 26
            if (r0 > r14) goto L_0x07a2
            java.lang.String r0 = com.google.android.gms.internal.ads.zzew.zzb     // Catch:{ all -> 0x07aa }
            int r16 = r0.hashCode()     // Catch:{ all -> 0x07aa }
            switch(r16) {
                case -2144781245: goto L_0x077e;
                case -2144781185: goto L_0x0773;
                case -2144781160: goto L_0x0768;
                case -2097309513: goto L_0x075d;
                case -2022874474: goto L_0x0752;
                case -1978993182: goto L_0x0747;
                case -1978990237: goto L_0x073c;
                case -1936688988: goto L_0x0731;
                case -1936688066: goto L_0x0726;
                case -1936688065: goto L_0x071a;
                case -1931988508: goto L_0x070e;
                case -1885099851: goto L_0x0702;
                case -1696512866: goto L_0x06f6;
                case -1680025915: goto L_0x06ea;
                case -1615810839: goto L_0x06de;
                case -1600724499: goto L_0x06d2;
                case -1554255044: goto L_0x06c6;
                case -1481772737: goto L_0x06ba;
                case -1481772730: goto L_0x06ae;
                case -1481772729: goto L_0x06a2;
                case -1320080169: goto L_0x0696;
                case -1217592143: goto L_0x068a;
                case -1180384755: goto L_0x067e;
                case -1139198265: goto L_0x0672;
                case -1052835013: goto L_0x0666;
                case -993250464: goto L_0x065b;
                case -993250458: goto L_0x0650;
                case -965403638: goto L_0x0644;
                case -958336948: goto L_0x0638;
                case -879245230: goto L_0x062c;
                case -842500323: goto L_0x0620;
                case -821392978: goto L_0x0614;
                case -797483286: goto L_0x0608;
                case -794946968: goto L_0x05fc;
                case -788334647: goto L_0x05f0;
                case -782144577: goto L_0x05e4;
                case -575125681: goto L_0x05d8;
                case -521118391: goto L_0x05cc;
                case -430914369: goto L_0x05c0;
                case -290434366: goto L_0x05b4;
                case -282781963: goto L_0x05a8;
                case -277133239: goto L_0x059c;
                case -173639913: goto L_0x0590;
                case -56598463: goto L_0x0584;
                case 2126: goto L_0x0578;
                case 2564: goto L_0x056c;
                case 2715: goto L_0x0560;
                case 2719: goto L_0x0554;
                case 3091: goto L_0x0548;
                case 3483: goto L_0x053c;
                case 73405: goto L_0x0530;
                case 75537: goto L_0x0524;
                case 75739: goto L_0x0518;
                case 76779: goto L_0x050c;
                case 78669: goto L_0x0500;
                case 79305: goto L_0x04f4;
                case 80618: goto L_0x04e8;
                case 88274: goto L_0x04dc;
                case 98846: goto L_0x04d0;
                case 98848: goto L_0x04c4;
                case 99329: goto L_0x04ba;
                case 101481: goto L_0x04ae;
                case 1513190: goto L_0x04a3;
                case 1514184: goto L_0x0498;
                case 1514185: goto L_0x048d;
                case 2133089: goto L_0x0481;
                case 2133091: goto L_0x0475;
                case 2133120: goto L_0x0469;
                case 2133151: goto L_0x045d;
                case 2133182: goto L_0x0451;
                case 2133184: goto L_0x0445;
                case 2436959: goto L_0x0439;
                case 2463773: goto L_0x042d;
                case 2464648: goto L_0x0421;
                case 2689555: goto L_0x0415;
                case 3154429: goto L_0x0409;
                case 3284551: goto L_0x03fd;
                case 3351335: goto L_0x03f1;
                case 3386211: goto L_0x03e5;
                case 41325051: goto L_0x03d9;
                case 51349633: goto L_0x03ce;
                case 51350594: goto L_0x03c3;
                case 55178625: goto L_0x03b7;
                case 61542055: goto L_0x03ac;
                case 65355429: goto L_0x03a0;
                case 66214468: goto L_0x0394;
                case 66214470: goto L_0x0388;
                case 66214473: goto L_0x037c;
                case 66215429: goto L_0x0370;
                case 66215431: goto L_0x0364;
                case 66215433: goto L_0x0358;
                case 66216390: goto L_0x034c;
                case 76402249: goto L_0x0340;
                case 76404105: goto L_0x0334;
                case 76404911: goto L_0x0328;
                case 80963634: goto L_0x031c;
                case 82882791: goto L_0x0310;
                case 98715550: goto L_0x0304;
                case 101370885: goto L_0x02f8;
                case 102844228: goto L_0x02ec;
                case 165221241: goto L_0x02e0;
                case 182191441: goto L_0x02d4;
                case 245388979: goto L_0x02c8;
                case 287431619: goto L_0x02bc;
                case 307593612: goto L_0x02b0;
                case 308517133: goto L_0x02a4;
                case 316215098: goto L_0x0298;
                case 316215116: goto L_0x028c;
                case 316246811: goto L_0x0280;
                case 316246818: goto L_0x0274;
                case 407160593: goto L_0x0268;
                case 507412548: goto L_0x025c;
                case 793982701: goto L_0x0250;
                case 794038622: goto L_0x0244;
                case 794040393: goto L_0x0238;
                case 835649806: goto L_0x022c;
                case 917340916: goto L_0x0220;
                case 958008161: goto L_0x0214;
                case 1060579533: goto L_0x0208;
                case 1150207623: goto L_0x01fc;
                case 1176899427: goto L_0x01f0;
                case 1280332038: goto L_0x01e4;
                case 1306947716: goto L_0x01d8;
                case 1349174697: goto L_0x01cc;
                case 1522194893: goto L_0x01c0;
                case 1691543273: goto L_0x01b4;
                case 1691544261: goto L_0x01a8;
                case 1709443163: goto L_0x019c;
                case 1865889110: goto L_0x0190;
                case 1906253259: goto L_0x0184;
                case 1977196784: goto L_0x0178;
                case 2006372676: goto L_0x016c;
                case 2019281702: goto L_0x0160;
                case 2029784656: goto L_0x0154;
                case 2030379515: goto L_0x0148;
                case 2033393791: goto L_0x013c;
                case 2047190025: goto L_0x0130;
                case 2047252157: goto L_0x0124;
                case 2048319463: goto L_0x0118;
                case 2048855701: goto L_0x010c;
                default: goto L_0x010a;
            }
        L_0x010a:
            goto L_0x0789
        L_0x010c:
            java.lang.String r3 = "HWWAS-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 66
            goto L_0x078a
        L_0x0118:
            java.lang.String r3 = "HWVNS-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 65
            goto L_0x078a
        L_0x0124:
            java.lang.String r3 = "ELUGA_Prim"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 33
            goto L_0x078a
        L_0x0130:
            java.lang.String r3 = "ELUGA_Note"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 32
            goto L_0x078a
        L_0x013c:
            java.lang.String r3 = "ASUS_X00AD_2"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 14
            goto L_0x078a
        L_0x0148:
            java.lang.String r3 = "HWCAM-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 64
            goto L_0x078a
        L_0x0154:
            java.lang.String r3 = "HWBLN-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 63
            goto L_0x078a
        L_0x0160:
            java.lang.String r3 = "DM-01K"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 29
            goto L_0x078a
        L_0x016c:
            java.lang.String r3 = "BRAVIA_ATV3_4K"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 19
            goto L_0x078a
        L_0x0178:
            java.lang.String r3 = "Infinix-X572"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 69
            goto L_0x078a
        L_0x0184:
            java.lang.String r3 = "PB2-670M"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 100
            goto L_0x078a
        L_0x0190:
            java.lang.String r3 = "santoni"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 117(0x75, float:1.64E-43)
            goto L_0x078a
        L_0x019c:
            java.lang.String r3 = "iball8735_9806"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 68
            goto L_0x078a
        L_0x01a8:
            java.lang.String r3 = "CPH1715"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 24
            goto L_0x078a
        L_0x01b4:
            java.lang.String r3 = "CPH1609"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 23
            goto L_0x078a
        L_0x01c0:
            java.lang.String r3 = "woods_f"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 133(0x85, float:1.86E-43)
            goto L_0x078a
        L_0x01cc:
            java.lang.String r3 = "htc_e56ml_dtul"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 61
            goto L_0x078a
        L_0x01d8:
            java.lang.String r3 = "EverStar_S"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 35
            goto L_0x078a
        L_0x01e4:
            java.lang.String r3 = "hwALE-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 62
            goto L_0x078a
        L_0x01f0:
            java.lang.String r3 = "itel_S41"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 71
            goto L_0x078a
        L_0x01fc:
            java.lang.String r3 = "LS-5017"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 78
            goto L_0x078a
        L_0x0208:
            java.lang.String r3 = "panell_d"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 96
            goto L_0x078a
        L_0x0214:
            java.lang.String r3 = "j2xlteins"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 72
            goto L_0x078a
        L_0x0220:
            java.lang.String r3 = "A7000plus"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 10
            goto L_0x078a
        L_0x022c:
            java.lang.String r3 = "manning"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 81
            goto L_0x078a
        L_0x0238:
            java.lang.String r3 = "GIONEE_WBL7519"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 59
            goto L_0x078a
        L_0x0244:
            java.lang.String r3 = "GIONEE_WBL7365"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 58
            goto L_0x078a
        L_0x0250:
            java.lang.String r3 = "GIONEE_WBL5708"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 57
            goto L_0x078a
        L_0x025c:
            java.lang.String r3 = "QM16XE_U"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 114(0x72, float:1.6E-43)
            goto L_0x078a
        L_0x0268:
            java.lang.String r3 = "Pixi5-10_4G"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 106(0x6a, float:1.49E-43)
            goto L_0x078a
        L_0x0274:
            java.lang.String r3 = "TB3-850M"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 125(0x7d, float:1.75E-43)
            goto L_0x078a
        L_0x0280:
            java.lang.String r3 = "TB3-850F"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 124(0x7c, float:1.74E-43)
            goto L_0x078a
        L_0x028c:
            java.lang.String r3 = "TB3-730X"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 123(0x7b, float:1.72E-43)
            goto L_0x078a
        L_0x0298:
            java.lang.String r3 = "TB3-730F"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 122(0x7a, float:1.71E-43)
            goto L_0x078a
        L_0x02a4:
            java.lang.String r3 = "A7020a48"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 12
            goto L_0x078a
        L_0x02b0:
            java.lang.String r3 = "A7010a48"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 11
            goto L_0x078a
        L_0x02bc:
            java.lang.String r3 = "griffin"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 60
            goto L_0x078a
        L_0x02c8:
            java.lang.String r3 = "marino_f"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 82
            goto L_0x078a
        L_0x02d4:
            java.lang.String r3 = "CPY83_I00"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 25
            goto L_0x078a
        L_0x02e0:
            java.lang.String r3 = "A2016a40"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 8
            goto L_0x078a
        L_0x02ec:
            java.lang.String r3 = "le_x6"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 77
            goto L_0x078a
        L_0x02f8:
            java.lang.String r3 = "l5460"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 76
            goto L_0x078a
        L_0x0304:
            java.lang.String r3 = "i9031"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 67
            goto L_0x078a
        L_0x0310:
            java.lang.String r3 = "X3_HK"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 135(0x87, float:1.89E-43)
            goto L_0x078a
        L_0x031c:
            java.lang.String r3 = "V23GB"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x078a
        L_0x0328:
            java.lang.String r3 = "Q4310"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 112(0x70, float:1.57E-43)
            goto L_0x078a
        L_0x0334:
            java.lang.String r3 = "Q4260"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 110(0x6e, float:1.54E-43)
            goto L_0x078a
        L_0x0340:
            java.lang.String r3 = "PRO7S"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 108(0x6c, float:1.51E-43)
            goto L_0x078a
        L_0x034c:
            java.lang.String r3 = "F3311"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 48
            goto L_0x078a
        L_0x0358:
            java.lang.String r3 = "F3215"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 47
            goto L_0x078a
        L_0x0364:
            java.lang.String r3 = "F3213"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 46
            goto L_0x078a
        L_0x0370:
            java.lang.String r3 = "F3211"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 45
            goto L_0x078a
        L_0x037c:
            java.lang.String r3 = "F3116"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 44
            goto L_0x078a
        L_0x0388:
            java.lang.String r3 = "F3113"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 43
            goto L_0x078a
        L_0x0394:
            java.lang.String r3 = "F3111"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 42
            goto L_0x078a
        L_0x03a0:
            java.lang.String r3 = "E5643"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 30
            goto L_0x078a
        L_0x03ac:
            java.lang.String r3 = "A1601"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 7
            goto L_0x078a
        L_0x03b7:
            java.lang.String r3 = "Aura_Note_2"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 15
            goto L_0x078a
        L_0x03c3:
            java.lang.String r3 = "602LV"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 4
            goto L_0x078a
        L_0x03ce:
            java.lang.String r3 = "601LV"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 3
            goto L_0x078a
        L_0x03d9:
            java.lang.String r3 = "MEIZU_M5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 83
            goto L_0x078a
        L_0x03e5:
            java.lang.String r3 = "p212"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 92
            goto L_0x078a
        L_0x03f1:
            java.lang.String r3 = "mido"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 85
            goto L_0x078a
        L_0x03fd:
            java.lang.String r3 = "kate"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 75
            goto L_0x078a
        L_0x0409:
            java.lang.String r3 = "fugu"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 50
            goto L_0x078a
        L_0x0415:
            java.lang.String r3 = "XE2X"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 136(0x88, float:1.9E-43)
            goto L_0x078a
        L_0x0421:
            java.lang.String r3 = "Q427"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 111(0x6f, float:1.56E-43)
            goto L_0x078a
        L_0x042d:
            java.lang.String r3 = "Q350"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 109(0x6d, float:1.53E-43)
            goto L_0x078a
        L_0x0439:
            java.lang.String r3 = "P681"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 93
            goto L_0x078a
        L_0x0445:
            java.lang.String r3 = "F04J"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 41
            goto L_0x078a
        L_0x0451:
            java.lang.String r3 = "F04H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 40
            goto L_0x078a
        L_0x045d:
            java.lang.String r3 = "F03H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 39
            goto L_0x078a
        L_0x0469:
            java.lang.String r3 = "F02H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 38
            goto L_0x078a
        L_0x0475:
            java.lang.String r3 = "F01J"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 37
            goto L_0x078a
        L_0x0481:
            java.lang.String r3 = "F01H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 36
            goto L_0x078a
        L_0x048d:
            java.lang.String r3 = "1714"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 2
            goto L_0x078a
        L_0x0498:
            java.lang.String r3 = "1713"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 1
            goto L_0x078a
        L_0x04a3:
            java.lang.String r3 = "1601"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 0
            goto L_0x078a
        L_0x04ae:
            java.lang.String r3 = "flo"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 49
            goto L_0x078a
        L_0x04ba:
            java.lang.String r4 = "deb"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0789
            goto L_0x078a
        L_0x04c4:
            java.lang.String r3 = "cv3"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 27
            goto L_0x078a
        L_0x04d0:
            java.lang.String r3 = "cv1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 26
            goto L_0x078a
        L_0x04dc:
            java.lang.String r3 = "Z80"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 139(0x8b, float:1.95E-43)
            goto L_0x078a
        L_0x04e8:
            java.lang.String r3 = "QX1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 115(0x73, float:1.61E-43)
            goto L_0x078a
        L_0x04f4:
            java.lang.String r3 = "PLE"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 107(0x6b, float:1.5E-43)
            goto L_0x078a
        L_0x0500:
            java.lang.String r3 = "P85"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 94
            goto L_0x078a
        L_0x050c:
            java.lang.String r3 = "MX6"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 86
            goto L_0x078a
        L_0x0518:
            java.lang.String r3 = "M5c"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 80
            goto L_0x078a
        L_0x0524:
            java.lang.String r3 = "M04"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 79
            goto L_0x078a
        L_0x0530:
            java.lang.String r3 = "JGZ"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 73
            goto L_0x078a
        L_0x053c:
            java.lang.String r3 = "mh"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 84
            goto L_0x078a
        L_0x0548:
            java.lang.String r3 = "b5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 16
            goto L_0x078a
        L_0x0554:
            java.lang.String r3 = "V5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 129(0x81, float:1.81E-43)
            goto L_0x078a
        L_0x0560:
            java.lang.String r3 = "V1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 127(0x7f, float:1.78E-43)
            goto L_0x078a
        L_0x056c:
            java.lang.String r3 = "Q5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 113(0x71, float:1.58E-43)
            goto L_0x078a
        L_0x0578:
            java.lang.String r3 = "C1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 20
            goto L_0x078a
        L_0x0584:
            java.lang.String r3 = "woods_fn"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 134(0x86, float:1.88E-43)
            goto L_0x078a
        L_0x0590:
            java.lang.String r3 = "ELUGA_A3_Pro"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 31
            goto L_0x078a
        L_0x059c:
            java.lang.String r3 = "Z12_PRO"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 138(0x8a, float:1.93E-43)
            goto L_0x078a
        L_0x05a8:
            java.lang.String r3 = "BLACK-1X"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 17
            goto L_0x078a
        L_0x05b4:
            java.lang.String r3 = "taido_row"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 121(0x79, float:1.7E-43)
            goto L_0x078a
        L_0x05c0:
            java.lang.String r3 = "Pixi4-7_3G"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 105(0x69, float:1.47E-43)
            goto L_0x078a
        L_0x05cc:
            java.lang.String r3 = "GIONEE_GBL7360"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 53
            goto L_0x078a
        L_0x05d8:
            java.lang.String r3 = "GiONEE_CBL7513"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 51
            goto L_0x078a
        L_0x05e4:
            java.lang.String r3 = "OnePlus5T"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 91
            goto L_0x078a
        L_0x05f0:
            java.lang.String r3 = "whyred"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 132(0x84, float:1.85E-43)
            goto L_0x078a
        L_0x05fc:
            java.lang.String r3 = "watson"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 131(0x83, float:1.84E-43)
            goto L_0x078a
        L_0x0608:
            java.lang.String r3 = "SVP-DTV15"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 119(0x77, float:1.67E-43)
            goto L_0x078a
        L_0x0614:
            java.lang.String r3 = "A7000-a"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 9
            goto L_0x078a
        L_0x0620:
            java.lang.String r3 = "nicklaus_f"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 88
            goto L_0x078a
        L_0x062c:
            java.lang.String r3 = "tcl_eu"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 126(0x7e, float:1.77E-43)
            goto L_0x078a
        L_0x0638:
            java.lang.String r3 = "ELUGA_Ray_X"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 34
            goto L_0x078a
        L_0x0644:
            java.lang.String r3 = "s905x018"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 120(0x78, float:1.68E-43)
            goto L_0x078a
        L_0x0650:
            java.lang.String r3 = "A10-70L"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 6
            goto L_0x078a
        L_0x065b:
            java.lang.String r3 = "A10-70F"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 5
            goto L_0x078a
        L_0x0666:
            java.lang.String r3 = "namath"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 87
            goto L_0x078a
        L_0x0672:
            java.lang.String r3 = "Slate_Pro"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 118(0x76, float:1.65E-43)
            goto L_0x078a
        L_0x067e:
            java.lang.String r3 = "iris60"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 70
            goto L_0x078a
        L_0x068a:
            java.lang.String r3 = "BRAVIA_ATV2"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 18
            goto L_0x078a
        L_0x0696:
            java.lang.String r3 = "GiONEE_GBL7319"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 52
            goto L_0x078a
        L_0x06a2:
            java.lang.String r3 = "panell_dt"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 99
            goto L_0x078a
        L_0x06ae:
            java.lang.String r3 = "panell_ds"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 98
            goto L_0x078a
        L_0x06ba:
            java.lang.String r3 = "panell_dl"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 97
            goto L_0x078a
        L_0x06c6:
            java.lang.String r3 = "vernee_M5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 130(0x82, float:1.82E-43)
            goto L_0x078a
        L_0x06d2:
            java.lang.String r3 = "pacificrim"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 95
            goto L_0x078a
        L_0x06de:
            java.lang.String r3 = "Phantom6"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 104(0x68, float:1.46E-43)
            goto L_0x078a
        L_0x06ea:
            java.lang.String r3 = "ComioS1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 21
            goto L_0x078a
        L_0x06f6:
            java.lang.String r3 = "XT1663"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 137(0x89, float:1.92E-43)
            goto L_0x078a
        L_0x0702:
            java.lang.String r3 = "RAIJIN"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 116(0x74, float:1.63E-43)
            goto L_0x078a
        L_0x070e:
            java.lang.String r3 = "AquaPowerM"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 13
            goto L_0x078a
        L_0x071a:
            java.lang.String r3 = "PGN611"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 103(0x67, float:1.44E-43)
            goto L_0x078a
        L_0x0726:
            java.lang.String r3 = "PGN610"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 102(0x66, float:1.43E-43)
            goto L_0x078a
        L_0x0731:
            java.lang.String r3 = "PGN528"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 101(0x65, float:1.42E-43)
            goto L_0x078a
        L_0x073c:
            java.lang.String r3 = "NX573J"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 90
            goto L_0x078a
        L_0x0747:
            java.lang.String r3 = "NX541J"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 89
            goto L_0x078a
        L_0x0752:
            java.lang.String r3 = "CP8676_I02"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 22
            goto L_0x078a
        L_0x075d:
            java.lang.String r3 = "K50a40"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 74
            goto L_0x078a
        L_0x0768:
            java.lang.String r3 = "GIONEE_SWW1631"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 56
            goto L_0x078a
        L_0x0773:
            java.lang.String r3 = "GIONEE_SWW1627"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 55
            goto L_0x078a
        L_0x077e:
            java.lang.String r3 = "GIONEE_SWW1609"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 54
            goto L_0x078a
        L_0x0789:
            r3 = -1
        L_0x078a:
            switch(r3) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0080;
                case 2: goto L_0x0080;
                case 3: goto L_0x0080;
                case 4: goto L_0x0080;
                case 5: goto L_0x0080;
                case 6: goto L_0x0080;
                case 7: goto L_0x0080;
                case 8: goto L_0x0080;
                case 9: goto L_0x0080;
                case 10: goto L_0x0080;
                case 11: goto L_0x0080;
                case 12: goto L_0x0080;
                case 13: goto L_0x0080;
                case 14: goto L_0x0080;
                case 15: goto L_0x0080;
                case 16: goto L_0x0080;
                case 17: goto L_0x0080;
                case 18: goto L_0x0080;
                case 19: goto L_0x0080;
                case 20: goto L_0x0080;
                case 21: goto L_0x0080;
                case 22: goto L_0x0080;
                case 23: goto L_0x0080;
                case 24: goto L_0x0080;
                case 25: goto L_0x0080;
                case 26: goto L_0x0080;
                case 27: goto L_0x0080;
                case 28: goto L_0x0080;
                case 29: goto L_0x0080;
                case 30: goto L_0x0080;
                case 31: goto L_0x0080;
                case 32: goto L_0x0080;
                case 33: goto L_0x0080;
                case 34: goto L_0x0080;
                case 35: goto L_0x0080;
                case 36: goto L_0x0080;
                case 37: goto L_0x0080;
                case 38: goto L_0x0080;
                case 39: goto L_0x0080;
                case 40: goto L_0x0080;
                case 41: goto L_0x0080;
                case 42: goto L_0x0080;
                case 43: goto L_0x0080;
                case 44: goto L_0x0080;
                case 45: goto L_0x0080;
                case 46: goto L_0x0080;
                case 47: goto L_0x0080;
                case 48: goto L_0x0080;
                case 49: goto L_0x0080;
                case 50: goto L_0x0080;
                case 51: goto L_0x0080;
                case 52: goto L_0x0080;
                case 53: goto L_0x0080;
                case 54: goto L_0x0080;
                case 55: goto L_0x0080;
                case 56: goto L_0x0080;
                case 57: goto L_0x0080;
                case 58: goto L_0x0080;
                case 59: goto L_0x0080;
                case 60: goto L_0x0080;
                case 61: goto L_0x0080;
                case 62: goto L_0x0080;
                case 63: goto L_0x0080;
                case 64: goto L_0x0080;
                case 65: goto L_0x0080;
                case 66: goto L_0x0080;
                case 67: goto L_0x0080;
                case 68: goto L_0x0080;
                case 69: goto L_0x0080;
                case 70: goto L_0x0080;
                case 71: goto L_0x0080;
                case 72: goto L_0x0080;
                case 73: goto L_0x0080;
                case 74: goto L_0x0080;
                case 75: goto L_0x0080;
                case 76: goto L_0x0080;
                case 77: goto L_0x0080;
                case 78: goto L_0x0080;
                case 79: goto L_0x0080;
                case 80: goto L_0x0080;
                case 81: goto L_0x0080;
                case 82: goto L_0x0080;
                case 83: goto L_0x0080;
                case 84: goto L_0x0080;
                case 85: goto L_0x0080;
                case 86: goto L_0x0080;
                case 87: goto L_0x0080;
                case 88: goto L_0x0080;
                case 89: goto L_0x0080;
                case 90: goto L_0x0080;
                case 91: goto L_0x0080;
                case 92: goto L_0x0080;
                case 93: goto L_0x0080;
                case 94: goto L_0x0080;
                case 95: goto L_0x0080;
                case 96: goto L_0x0080;
                case 97: goto L_0x0080;
                case 98: goto L_0x0080;
                case 99: goto L_0x0080;
                case 100: goto L_0x0080;
                case 101: goto L_0x0080;
                case 102: goto L_0x0080;
                case 103: goto L_0x0080;
                case 104: goto L_0x0080;
                case 105: goto L_0x0080;
                case 106: goto L_0x0080;
                case 107: goto L_0x0080;
                case 108: goto L_0x0080;
                case 109: goto L_0x0080;
                case 110: goto L_0x0080;
                case 111: goto L_0x0080;
                case 112: goto L_0x0080;
                case 113: goto L_0x0080;
                case 114: goto L_0x0080;
                case 115: goto L_0x0080;
                case 116: goto L_0x0080;
                case 117: goto L_0x0080;
                case 118: goto L_0x0080;
                case 119: goto L_0x0080;
                case 120: goto L_0x0080;
                case 121: goto L_0x0080;
                case 122: goto L_0x0080;
                case 123: goto L_0x0080;
                case 124: goto L_0x0080;
                case 125: goto L_0x0080;
                case 126: goto L_0x0080;
                case 127: goto L_0x0080;
                case 128: goto L_0x0080;
                case 129: goto L_0x0080;
                case 130: goto L_0x0080;
                case 131: goto L_0x0080;
                case 132: goto L_0x0080;
                case 133: goto L_0x0080;
                case 134: goto L_0x0080;
                case 135: goto L_0x0080;
                case 136: goto L_0x0080;
                case 137: goto L_0x0080;
                case 138: goto L_0x0080;
                case 139: goto L_0x0080;
                default: goto L_0x078d;
            }
        L_0x078d:
            int r0 = r13.hashCode()     // Catch:{ all -> 0x07aa }
            r3 = -594534941(0xffffffffdc901de3, float:-3.2452206E17)
            if (r0 == r3) goto L_0x0797
            goto L_0x07a0
        L_0x0797:
            java.lang.String r0 = "JSN-L21"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x07a0
            r10 = 0
        L_0x07a0:
            if (r10 == 0) goto L_0x0080
        L_0x07a2:
            zzd = r1     // Catch:{ all -> 0x07aa }
            zzc = r11     // Catch:{ all -> 0x07aa }
        L_0x07a6:
            monitor-exit(r2)     // Catch:{ all -> 0x07aa }
            boolean r0 = zzd
            return r0
        L_0x07aa:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x07aa }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxs.zzaD(java.lang.String):boolean");
    }

    private static List zzaE(Context context, zzrc zzrc, zzaf zzaf, boolean z10, boolean z11) throws zzrj {
        String str = zzaf.zzm;
        if (str == null) {
            return zzfqk.zzo();
        }
        List zzf2 = zzrp.zzf(str, z10, z11);
        String zze2 = zzrp.zze(zzaf);
        if (zze2 == null) {
            return zzfqk.zzm(zzf2);
        }
        List zzf3 = zzrp.zzf(zze2, z10, z11);
        if (zzew.zza >= 26 && "video/dolby-vision".equals(zzaf.zzm) && !zzf3.isEmpty() && !zzxp.zza(context)) {
            return zzfqk.zzm(zzf3);
        }
        zzfqh zzi2 = zzfqk.zzi();
        zzi2.zzh(zzf2);
        zzi2.zzh(zzf3);
        return zzi2.zzi();
    }

    private final void zzaF(zzda zzda) {
        if (!zzda.equals(zzda.zza) && !zzda.equals(this.zzE)) {
            this.zzE = zzda;
            this.zzg.zzt(zzda);
        }
    }

    private final void zzaG() {
        zzda zzda = this.zzE;
        if (zzda != null) {
            this.zzg.zzt(zzda);
        }
    }

    private final void zzaH() {
        Surface surface = this.zzm;
        zzxv zzxv = this.zzn;
        if (surface == zzxv) {
            this.zzm = null;
        }
        zzxv.release();
        this.zzn = null;
    }

    private static boolean zzaI(long j10) {
        return j10 < -30000;
    }

    private final boolean zzaJ(zzqx zzqx) {
        if (zzew.zza < 23 || zzaD(zzqx.zza) || (zzqx.zzf && !zzxv.zzb(this.zze))) {
            return false;
        }
        return true;
    }

    public final void zzD(float f10, float f11) throws zzhj {
        super.zzD(f10, f11);
        this.zzf.zze(f10);
    }

    public final String zzK() {
        return "MediaCodecVideoRenderer";
    }

    public final boolean zzN() {
        zzxv zzxv;
        if (super.zzN() && (this.zzq || (((zzxv = this.zzn) != null && this.zzm == zzxv) || zzaj() == null))) {
            this.zzu = -9223372036854775807L;
            return true;
        } else if (this.zzu == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzu) {
                return true;
            }
            this.zzu = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final float zzP(float f10, zzaf zzaf, zzaf[] zzafArr) {
        float f11 = -1.0f;
        for (zzaf zzaf2 : zzafArr) {
            float f12 = zzaf2.zzt;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    /* access modifiers changed from: protected */
    public final int zzQ(zzrc zzrc, zzaf zzaf) throws zzrj {
        boolean z10;
        int i10 = 128;
        if (!zzbt.zzh(zzaf.zzm)) {
            return 128;
        }
        int i11 = 0;
        boolean z11 = zzaf.zzp != null;
        List zzaE = zzaE(this.zze, zzrc, zzaf, z11, false);
        if (z11 && zzaE.isEmpty()) {
            zzaE = zzaE(this.zze, zzrc, zzaf, false, false);
        }
        if (zzaE.isEmpty()) {
            return 129;
        }
        if (!zzra.zzaw(zzaf)) {
            return 130;
        }
        zzqx zzqx = (zzqx) zzaE.get(0);
        boolean zze2 = zzqx.zze(zzaf);
        if (!zze2) {
            int i12 = 1;
            while (true) {
                if (i12 >= zzaE.size()) {
                    break;
                }
                zzqx zzqx2 = (zzqx) zzaE.get(i12);
                if (zzqx2.zze(zzaf)) {
                    zzqx = zzqx2;
                    z10 = false;
                    zze2 = true;
                    break;
                }
                i12++;
            }
        }
        z10 = true;
        int i13 = true != zze2 ? 3 : 4;
        int i14 = true != zzqx.zzf(zzaf) ? 8 : 16;
        int i15 = true != zzqx.zzg ? 0 : 64;
        if (true != z10) {
            i10 = 0;
        }
        if (zzew.zza >= 26 && "video/dolby-vision".equals(zzaf.zzm) && !zzxp.zza(this.zze)) {
            i10 = 256;
        }
        if (zze2) {
            List zzaE2 = zzaE(this.zze, zzrc, zzaf, z11, true);
            if (!zzaE2.isEmpty()) {
                zzqx zzqx3 = (zzqx) zzrp.zzg(zzaE2, zzaf).get(0);
                if (zzqx3.zze(zzaf) && zzqx3.zzf(zzaf)) {
                    i11 = 32;
                }
            }
        }
        return i13 | i14 | i11 | i15 | i10;
    }

    /* access modifiers changed from: protected */
    public final zzhc zzR(zzqx zzqx, zzaf zzaf, zzaf zzaf2) {
        int i10;
        int i11;
        zzhc zzb2 = zzqx.zzb(zzaf, zzaf2);
        int i12 = zzb2.zze;
        int i13 = zzaf2.zzr;
        zzxq zzxq = this.zzj;
        if (i13 > zzxq.zza || zzaf2.zzs > zzxq.zzb) {
            i12 |= 256;
        }
        if (zzU(zzqx, zzaf2) > this.zzj.zzc) {
            i12 |= 64;
        }
        String str = zzqx.zza;
        if (i12 != 0) {
            i10 = i12;
            i11 = 0;
        } else {
            i11 = zzb2.zzd;
            i10 = 0;
        }
        return new zzhc(str, zzaf, zzaf2, i11, i10);
    }

    /* access modifiers changed from: protected */
    public final zzhc zzS(zzjo zzjo) throws zzhj {
        zzhc zzS = super.zzS(zzjo);
        this.zzg.zzf(zzjo.zza, zzS);
        return zzS;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x021b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzqs zzV(com.google.android.gms.internal.ads.zzqx r20, com.google.android.gms.internal.ads.zzaf r21, android.media.MediaCrypto r22, float r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r23
            com.google.android.gms.internal.ads.zzxv r4 = r0.zzn
            if (r4 == 0) goto L_0x0015
            boolean r4 = r4.zza
            boolean r5 = r1.zzf
            if (r4 == r5) goto L_0x0015
            r19.zzaH()
        L_0x0015:
            java.lang.String r4 = r1.zzc
            com.google.android.gms.internal.ads.zzaf[] r5 = r19.zzJ()
            int r6 = r2.zzr
            int r7 = r2.zzs
            int r8 = zzU(r20, r21)
            int r9 = r5.length
            r10 = -1
            r13 = 1
            if (r9 != r13) goto L_0x0043
            if (r8 == r10) goto L_0x003a
            int r5 = zzT(r20, r21)
            if (r5 == r10) goto L_0x003a
            float r8 = (float) r8
            r9 = 1069547520(0x3fc00000, float:1.5)
            float r8 = r8 * r9
            int r8 = (int) r8
            int r8 = java.lang.Math.min(r8, r5)
        L_0x003a:
            com.google.android.gms.internal.ads.zzxq r5 = new com.google.android.gms.internal.ads.zzxq
            r5.<init>(r6, r7, r8)
            r16 = r4
            goto L_0x0173
        L_0x0043:
            r14 = 0
            r15 = 0
        L_0x0045:
            if (r14 >= r9) goto L_0x0089
            r11 = r5[r14]
            com.google.android.gms.internal.ads.zzq r12 = r2.zzy
            if (r12 == 0) goto L_0x005e
            com.google.android.gms.internal.ads.zzq r12 = r11.zzy
            if (r12 != 0) goto L_0x005e
            com.google.android.gms.internal.ads.zzad r11 = r11.zzb()
            com.google.android.gms.internal.ads.zzq r12 = r2.zzy
            r11.zzy(r12)
            com.google.android.gms.internal.ads.zzaf r11 = r11.zzY()
        L_0x005e:
            com.google.android.gms.internal.ads.zzhc r12 = r1.zzb(r2, r11)
            int r12 = r12.zzd
            if (r12 == 0) goto L_0x0085
            int r12 = r11.zzr
            if (r12 == r10) goto L_0x0071
            int r13 = r11.zzs
            if (r13 != r10) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r13 = 0
            goto L_0x0072
        L_0x0071:
            r13 = 1
        L_0x0072:
            r15 = r15 | r13
            int r6 = java.lang.Math.max(r6, r12)
            int r12 = r11.zzs
            int r7 = java.lang.Math.max(r7, r12)
            int r11 = zzU(r1, r11)
            int r8 = java.lang.Math.max(r8, r11)
        L_0x0085:
            int r14 = r14 + 1
            r13 = 1
            goto L_0x0045
        L_0x0089:
            if (r15 == 0) goto L_0x016c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "Resolutions unknown. Codec max resolution: "
            r5.append(r9)
            r5.append(r6)
            java.lang.String r9 = "x"
            r5.append(r9)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r10 = "MediaCodecVideoRenderer"
            com.google.android.gms.internal.ads.zzee.zze(r10, r5)
            int r5 = r2.zzs
            int r11 = r2.zzr
            if (r5 <= r11) goto L_0x00b1
            r12 = 1
            goto L_0x00b2
        L_0x00b1:
            r12 = 0
        L_0x00b2:
            if (r12 == 0) goto L_0x00b6
            r13 = r5
            goto L_0x00b7
        L_0x00b6:
            r13 = r11
        L_0x00b7:
            r14 = 1
            if (r14 != r12) goto L_0x00bb
            r5 = r11
        L_0x00bb:
            int[] r11 = zzb
            r14 = 0
        L_0x00be:
            r15 = 9
            if (r14 >= r15) goto L_0x012a
            float r15 = (float) r5
            float r3 = (float) r13
            r16 = r4
            r4 = r11[r14]
            r17 = r11
            float r11 = (float) r4
            if (r4 <= r13) goto L_0x012c
            float r15 = r15 / r3
            float r11 = r11 * r15
            int r3 = (int) r11
            if (r3 > r5) goto L_0x00d5
            goto L_0x012c
        L_0x00d5:
            int r11 = com.google.android.gms.internal.ads.zzew.zza
            r15 = 21
            if (r11 < r15) goto L_0x00fb
            r11 = 1
            if (r11 == r12) goto L_0x00e0
            r15 = r4
            goto L_0x00e1
        L_0x00e0:
            r15 = r3
        L_0x00e1:
            if (r11 != r12) goto L_0x00e4
            goto L_0x00e5
        L_0x00e4:
            r4 = r3
        L_0x00e5:
            android.graphics.Point r3 = r1.zza(r15, r4)
            float r4 = r2.zzt
            int r11 = r3.x
            int r15 = r3.y
            r18 = r3
            double r3 = (double) r4
            boolean r3 = r1.zzg(r11, r15, r3)
            if (r3 == 0) goto L_0x0121
            r3 = r18
            goto L_0x012d
        L_0x00fb:
            r11 = 16
            int r4 = com.google.android.gms.internal.ads.zzew.zze(r4, r11)     // Catch:{ zzrj -> 0x012c }
            int r4 = r4 * 16
            int r3 = com.google.android.gms.internal.ads.zzew.zze(r3, r11)     // Catch:{ zzrj -> 0x012c }
            int r3 = r3 * 16
            int r11 = r4 * r3
            int r15 = com.google.android.gms.internal.ads.zzrp.zza()     // Catch:{ zzrj -> 0x012c }
            if (r11 > r15) goto L_0x0121
            android.graphics.Point r5 = new android.graphics.Point     // Catch:{ zzrj -> 0x012c }
            r11 = 1
            if (r11 == r12) goto L_0x0118
            r13 = r4
            goto L_0x0119
        L_0x0118:
            r13 = r3
        L_0x0119:
            if (r11 == r12) goto L_0x011c
            r4 = r3
        L_0x011c:
            r5.<init>(r13, r4)     // Catch:{ zzrj -> 0x012c }
            r3 = r5
            goto L_0x012d
        L_0x0121:
            int r14 = r14 + 1
            r3 = r23
            r4 = r16
            r11 = r17
            goto L_0x00be
        L_0x012a:
            r16 = r4
        L_0x012c:
            r3 = 0
        L_0x012d:
            if (r3 == 0) goto L_0x016e
            int r4 = r3.x
            int r6 = java.lang.Math.max(r6, r4)
            int r3 = r3.y
            int r7 = java.lang.Math.max(r7, r3)
            com.google.android.gms.internal.ads.zzad r3 = r21.zzb()
            r3.zzX(r6)
            r3.zzF(r7)
            com.google.android.gms.internal.ads.zzaf r3 = r3.zzY()
            int r3 = zzT(r1, r3)
            int r8 = java.lang.Math.max(r8, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Codec max resolution adjusted to: "
            r3.append(r4)
            r3.append(r6)
            r3.append(r9)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.google.android.gms.internal.ads.zzee.zze(r10, r3)
            goto L_0x016e
        L_0x016c:
            r16 = r4
        L_0x016e:
            com.google.android.gms.internal.ads.zzxq r5 = new com.google.android.gms.internal.ads.zzxq
            r5.<init>(r6, r7, r8)
        L_0x0173:
            r0.zzj = r5
            boolean r3 = r0.zzi
            android.media.MediaFormat r4 = new android.media.MediaFormat
            r4.<init>()
            java.lang.String r6 = "mime"
            r7 = r16
            r4.setString(r6, r7)
            int r6 = r2.zzr
            java.lang.String r7 = "width"
            r4.setInteger(r7, r6)
            int r6 = r2.zzs
            java.lang.String r7 = "height"
            r4.setInteger(r7, r6)
            java.util.List r6 = r2.zzo
            com.google.android.gms.internal.ads.zzeg.zzb(r4, r6)
            float r6 = r2.zzt
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            java.lang.String r8 = "frame-rate"
            r4.setFloat(r8, r6)
        L_0x01a3:
            int r6 = r2.zzu
            java.lang.String r8 = "rotation-degrees"
            com.google.android.gms.internal.ads.zzeg.zza(r4, r8, r6)
            com.google.android.gms.internal.ads.zzq r6 = r2.zzy
            if (r6 == 0) goto L_0x01d0
            int r8 = r6.zze
            java.lang.String r9 = "color-transfer"
            com.google.android.gms.internal.ads.zzeg.zza(r4, r9, r8)
            int r8 = r6.zzc
            java.lang.String r9 = "color-standard"
            com.google.android.gms.internal.ads.zzeg.zza(r4, r9, r8)
            int r8 = r6.zzd
            java.lang.String r9 = "color-range"
            com.google.android.gms.internal.ads.zzeg.zza(r4, r9, r8)
            byte[] r6 = r6.zzf
            if (r6 == 0) goto L_0x01d0
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            java.lang.String r8 = "hdr-static-info"
            r4.setByteBuffer(r8, r6)
        L_0x01d0:
            java.lang.String r6 = r2.zzm
            java.lang.String r8 = "video/dolby-vision"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x01ed
            android.util.Pair r6 = com.google.android.gms.internal.ads.zzrp.zzb(r21)
            if (r6 == 0) goto L_0x01ed
            java.lang.Object r6 = r6.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.String r8 = "profile"
            com.google.android.gms.internal.ads.zzeg.zza(r4, r8, r6)
        L_0x01ed:
            int r6 = r5.zza
            java.lang.String r8 = "max-width"
            r4.setInteger(r8, r6)
            int r6 = r5.zzb
            java.lang.String r8 = "max-height"
            r4.setInteger(r8, r6)
            int r5 = r5.zzc
            java.lang.String r6 = "max-input-size"
            com.google.android.gms.internal.ads.zzeg.zza(r4, r6, r5)
            int r5 = com.google.android.gms.internal.ads.zzew.zza
            r6 = 23
            if (r5 < r6) goto L_0x0219
            java.lang.String r5 = "priority"
            r6 = 0
            r4.setInteger(r5, r6)
            r5 = r23
            int r6 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0219
            java.lang.String r6 = "operating-rate"
            r4.setFloat(r6, r5)
        L_0x0219:
            if (r3 == 0) goto L_0x0227
            java.lang.String r3 = "no-post-process"
            r5 = 1
            r4.setInteger(r3, r5)
            java.lang.String r3 = "auto-frc"
            r5 = 0
            r4.setInteger(r3, r5)
        L_0x0227:
            android.view.Surface r3 = r0.zzm
            if (r3 != 0) goto L_0x024a
            boolean r3 = r19.zzaJ(r20)
            if (r3 == 0) goto L_0x0244
            com.google.android.gms.internal.ads.zzxv r3 = r0.zzn
            if (r3 != 0) goto L_0x023f
            android.content.Context r3 = r0.zze
            boolean r5 = r1.zzf
            com.google.android.gms.internal.ads.zzxv r3 = com.google.android.gms.internal.ads.zzxv.zza(r3, r5)
            r0.zzn = r3
        L_0x023f:
            com.google.android.gms.internal.ads.zzxv r3 = r0.zzn
            r0.zzm = r3
            goto L_0x024a
        L_0x0244:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x024a:
            android.view.Surface r3 = r0.zzm
            r5 = 0
            com.google.android.gms.internal.ads.zzqs r1 = com.google.android.gms.internal.ads.zzqs.zzb(r1, r4, r2, r3, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxs.zzV(com.google.android.gms.internal.ads.zzqx, com.google.android.gms.internal.ads.zzaf, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzqs");
    }

    /* access modifiers changed from: protected */
    public final List zzW(zzrc zzrc, zzaf zzaf, boolean z10) throws zzrj {
        return zzrp.zzg(zzaE(this.zze, zzrc, zzaf, false, false), zzaf);
    }

    /* access modifiers changed from: protected */
    public final void zzX(Exception exc) {
        zzee.zzc("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    /* access modifiers changed from: protected */
    public final void zzY(String str, zzqs zzqs, long j10, long j11) {
        this.zzg.zza(str, j10, j11);
        this.zzk = zzaD(str);
        zzqx zzal = zzal();
        Objects.requireNonNull(zzal);
        boolean z10 = false;
        if (zzew.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzal.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzh2 = zzal.zzh();
            int length = zzh2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (zzh2[i10].profile == 16384) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.zzl = z10;
        this.zzh.zza(str);
    }

    /* access modifiers changed from: protected */
    public final void zzZ(String str) {
        this.zzg.zzb(str);
    }

    /* access modifiers changed from: protected */
    public final void zzaA(zzqu zzqu, int i10, long j10) {
        int i11 = zzew.zza;
        Trace.beginSection("skipVideoBuffer");
        zzqu.zzn(i10, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    /* access modifiers changed from: protected */
    public final void zzaB(int i10, int i11) {
        zzhb zzhb = this.zza;
        zzhb.zzh += i10;
        int i12 = i10 + i11;
        zzhb.zzg += i12;
        this.zzw += i12;
        int i13 = this.zzx + i12;
        this.zzx = i13;
        zzhb.zzi = Math.max(i13, zzhb.zzi);
    }

    /* access modifiers changed from: protected */
    public final void zzaC(long j10) {
        zzhb zzhb = this.zza;
        zzhb.zzk += j10;
        zzhb.zzl++;
        this.zzB += j10;
        this.zzC++;
    }

    /* access modifiers changed from: protected */
    public final void zzaa(zzaf zzaf, MediaFormat mediaFormat) {
        int i10;
        int i11;
        zzqu zzaj = zzaj();
        if (zzaj != null) {
            zzaj.zzq(this.zzp);
        }
        Objects.requireNonNull(mediaFormat);
        int i12 = 0;
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z10) {
            i10 = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i10 = mediaFormat.getInteger("width");
        }
        if (z10) {
            i11 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i11 = mediaFormat.getInteger("height");
        }
        float f10 = zzaf.zzv;
        if (zzew.zza >= 21) {
            int i13 = zzaf.zzu;
            if (i13 == 90 || i13 == 270) {
                f10 = 1.0f / f10;
                int i14 = i11;
                i11 = i10;
                i10 = i14;
            }
        } else {
            i12 = zzaf.zzu;
        }
        this.zzD = new zzda(i10, i11, i12, f10);
        this.zzf.zzc(zzaf.zzt);
    }

    /* access modifiers changed from: protected */
    public final void zzac() {
        this.zzq = false;
        int i10 = zzew.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzad(zzgr zzgr) throws zzhj {
        this.zzy++;
        int i10 = zzew.zza;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaf(long j10, long j11, zzqu zzqu, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzaf zzaf) throws zzhj {
        boolean z12;
        int zzd2;
        long j13 = j10;
        zzqu zzqu2 = zzqu;
        int i13 = i10;
        long j14 = j12;
        Objects.requireNonNull(zzqu);
        if (this.zzt == -9223372036854775807L) {
            this.zzt = j13;
        }
        if (j14 != this.zzz) {
            this.zzf.zzd(j14);
            this.zzz = j14;
        }
        long zzai = zzai();
        long j15 = j14 - zzai;
        if (!z10 || z11) {
            boolean z13 = zzbc() == 2;
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long zzah = (long) (((double) (j14 - j13)) / ((double) zzah()));
            if (z13) {
                zzah -= elapsedRealtime - j11;
            }
            if (this.zzm != this.zzn) {
                long j16 = elapsedRealtime - this.zzA;
                boolean z14 = this.zzs ? !this.zzq : !(!z13 && !this.zzr);
                if (this.zzu != -9223372036854775807L || j13 < zzai || (!z14 && (!z13 || !zzaI(zzah) || j16 <= 100000))) {
                    zzqu zzqu3 = zzqu;
                    int i14 = i10;
                    if (!z13 || j13 == this.zzt) {
                        return false;
                    }
                    long nanoTime = System.nanoTime();
                    long zza = this.zzf.zza((zzah * 1000) + nanoTime);
                    long j17 = (zza - nanoTime) / 1000;
                    long j18 = this.zzu;
                    if (j17 < -500000 && !z11 && (zzd2 = zzd(j10)) != 0) {
                        if (j18 != -9223372036854775807L) {
                            zzhb zzhb = this.zza;
                            zzhb.zzd += zzd2;
                            zzhb.zzf += this.zzy;
                        } else {
                            this.zza.zzj++;
                            zzaB(zzd2, this.zzy);
                        }
                        zzat();
                        return false;
                    } else if (zzaI(j17) && !z11) {
                        if (j18 != -9223372036854775807L) {
                            zzaA(zzqu3, i14, j15);
                            z12 = true;
                        } else {
                            int i15 = zzew.zza;
                            Trace.beginSection("dropVideoBuffer");
                            zzqu3.zzn(i14, false);
                            Trace.endSection();
                            z12 = true;
                            zzaB(0, 1);
                        }
                        zzaC(j17);
                        return z12;
                    } else if (zzew.zza >= 21) {
                        if (j17 >= 50000) {
                            return false;
                        }
                        zzaz(zzqu, i10, j15, zza);
                        zzaC(j17);
                        return true;
                    } else if (j17 >= 30000) {
                        return false;
                    } else {
                        if (j17 > 11000) {
                            try {
                                Thread.sleep((-10000 + j17) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        zzay(zzqu3, i14, j15);
                        zzaC(j17);
                        return true;
                    }
                } else {
                    long nanoTime2 = System.nanoTime();
                    if (zzew.zza >= 21) {
                        zzaz(zzqu, i10, j15, nanoTime2);
                    } else {
                        zzay(zzqu, i10, j15);
                    }
                    zzaC(zzah);
                    return true;
                }
            } else if (!zzaI(zzah)) {
                return false;
            } else {
                zzaA(zzqu2, i13, j15);
                zzaC(zzah);
                return true;
            }
        } else {
            zzaA(zzqu2, i13, j15);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final zzqv zzak(Throwable th, zzqx zzqx) {
        return new zzxo(th, zzqx, this.zzm);
    }

    /* access modifiers changed from: protected */
    public final void zzam(zzgr zzgr) throws zzhj {
        if (this.zzl) {
            ByteBuffer byteBuffer = zzgr.zze;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 != -75 || s10 != 60 || s11 != 1 || b11 != 4) {
                    return;
                }
                if (b12 == 0 || b12 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    zzqu zzaj = zzaj();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    zzaj.zzp(bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzao(long j10) {
        super.zzao(j10);
        this.zzy--;
    }

    /* access modifiers changed from: protected */
    public final void zzap(zzaf zzaf) throws zzhj {
        this.zzh.zzb(zzaf);
    }

    /* access modifiers changed from: protected */
    public final void zzar() {
        super.zzar();
        this.zzy = 0;
    }

    /* access modifiers changed from: protected */
    public final boolean zzav(zzqx zzqx) {
        return this.zzm != null || zzaJ(zzqx);
    }

    /* access modifiers changed from: package-private */
    public final void zzax() {
        this.zzs = true;
        if (!this.zzq) {
            this.zzq = true;
            this.zzg.zzq(this.zzm);
            this.zzo = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzay(zzqu zzqu, int i10, long j10) {
        zzaF(this.zzD);
        int i11 = zzew.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzqu.zzn(i10, true);
        Trace.endSection();
        this.zzA = SystemClock.elapsedRealtime() * 1000;
        this.zza.zze++;
        this.zzx = 0;
        zzax();
    }

    /* access modifiers changed from: protected */
    public final void zzaz(zzqu zzqu, int i10, long j10, long j11) {
        zzaF(this.zzD);
        int i11 = zzew.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzqu.zzm(i10, j11);
        Trace.endSection();
        this.zzA = SystemClock.elapsedRealtime() * 1000;
        this.zza.zze++;
        this.zzx = 0;
        zzax();
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzp(int r6, java.lang.Object r7) throws com.google.android.gms.internal.ads.zzhj {
        /*
            r5 = this;
            r0 = 1
            if (r6 == r0) goto L_0x004c
            r0 = 7
            if (r6 == r0) goto L_0x0047
            r0 = 10
            if (r6 == r0) goto L_0x003a
            r0 = 13
            if (r6 == r0) goto L_0x0034
            r0 = 4
            if (r6 == r0) goto L_0x0022
            r0 = 5
            if (r6 == r0) goto L_0x0016
            goto L_0x00d4
        L_0x0016:
            com.google.android.gms.internal.ads.zzyd r6 = r5.zzf
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.zzj(r7)
            return
        L_0x0022:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            r5.zzp = r6
            com.google.android.gms.internal.ads.zzqu r7 = r5.zzaj()
            if (r7 == 0) goto L_0x00d4
            r7.zzq(r6)
            return
        L_0x0034:
            java.util.Objects.requireNonNull(r7)
            com.google.android.gms.internal.ads.zzeo r7 = (com.google.android.gms.internal.ads.zzeo) r7
            return
        L_0x003a:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            int r7 = r5.zzF
            if (r7 == r6) goto L_0x00d4
            r5.zzF = r6
            return
        L_0x0047:
            com.google.android.gms.internal.ads.zzxw r7 = (com.google.android.gms.internal.ads.zzxw) r7
            r5.zzG = r7
            return
        L_0x004c:
            boolean r6 = r7 instanceof android.view.Surface
            r0 = 0
            if (r6 == 0) goto L_0x0054
            android.view.Surface r7 = (android.view.Surface) r7
            goto L_0x0055
        L_0x0054:
            r7 = r0
        L_0x0055:
            if (r7 != 0) goto L_0x0073
            com.google.android.gms.internal.ads.zzxv r6 = r5.zzn
            if (r6 == 0) goto L_0x005d
            r7 = r6
            goto L_0x0073
        L_0x005d:
            com.google.android.gms.internal.ads.zzqx r6 = r5.zzal()
            if (r6 == 0) goto L_0x0073
            boolean r1 = r5.zzaJ(r6)
            if (r1 == 0) goto L_0x0073
            android.content.Context r7 = r5.zze
            boolean r6 = r6.zzf
            com.google.android.gms.internal.ads.zzxv r7 = com.google.android.gms.internal.ads.zzxv.zza(r7, r6)
            r5.zzn = r7
        L_0x0073:
            android.view.Surface r6 = r5.zzm
            if (r6 == r7) goto L_0x00c0
            r5.zzm = r7
            com.google.android.gms.internal.ads.zzyd r6 = r5.zzf
            r6.zzi(r7)
            r6 = 0
            r5.zzo = r6
            int r1 = r5.zzbc()
            com.google.android.gms.internal.ads.zzqu r2 = r5.zzaj()
            if (r2 == 0) goto L_0x00a1
            int r3 = com.google.android.gms.internal.ads.zzew.zza
            r4 = 23
            if (r3 < r4) goto L_0x009b
            if (r7 == 0) goto L_0x009b
            boolean r3 = r5.zzk
            if (r3 != 0) goto L_0x009b
            r2.zzo(r7)
            goto L_0x00a1
        L_0x009b:
            r5.zzaq()
            r5.zzan()
        L_0x00a1:
            if (r7 == 0) goto L_0x00b9
            com.google.android.gms.internal.ads.zzxv r2 = r5.zzn
            if (r7 == r2) goto L_0x00b9
            r5.zzaG()
            r5.zzq = r6
            int r6 = com.google.android.gms.internal.ads.zzew.zza
            r6 = 2
            if (r1 != r6) goto L_0x00d4
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.zzu = r6
            return
        L_0x00b9:
            r5.zzE = r0
            r5.zzq = r6
            int r6 = com.google.android.gms.internal.ads.zzew.zza
            return
        L_0x00c0:
            if (r7 == 0) goto L_0x00d4
            com.google.android.gms.internal.ads.zzxv r6 = r5.zzn
            if (r7 == r6) goto L_0x00d4
            r5.zzaG()
            boolean r6 = r5.zzo
            if (r6 == 0) goto L_0x00d4
            com.google.android.gms.internal.ads.zzyo r6 = r5.zzg
            android.view.Surface r7 = r5.zzm
            r6.zzq(r7)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxs.zzp(int, java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    public final void zzs() {
        this.zzE = null;
        this.zzq = false;
        int i10 = zzew.zza;
        this.zzo = false;
        try {
            super.zzs();
        } finally {
            this.zzg.zzc(this.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzt(boolean z10, boolean z11) throws zzhj {
        super.zzt(z10, z11);
        zzk();
        this.zzg.zze(this.zza);
        this.zzr = z11;
        this.zzs = false;
    }

    /* access modifiers changed from: protected */
    public final void zzu(long j10, boolean z10) throws zzhj {
        super.zzu(j10, z10);
        this.zzq = false;
        int i10 = zzew.zza;
        this.zzf.zzf();
        this.zzz = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzx = 0;
        this.zzu = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    public final void zzv() {
        try {
            super.zzv();
            if (this.zzn != null) {
                zzaH();
            }
        } catch (Throwable th) {
            if (this.zzn != null) {
                zzaH();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzw() {
        this.zzw = 0;
        this.zzv = SystemClock.elapsedRealtime();
        this.zzA = SystemClock.elapsedRealtime() * 1000;
        this.zzB = 0;
        this.zzC = 0;
        this.zzf.zzg();
    }

    /* access modifiers changed from: protected */
    public final void zzx() {
        this.zzu = -9223372036854775807L;
        if (this.zzw > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzw, elapsedRealtime - this.zzv);
            this.zzw = 0;
            this.zzv = elapsedRealtime;
        }
        int i10 = this.zzC;
        if (i10 != 0) {
            this.zzg.zzr(this.zzB, i10);
            this.zzB = 0;
            this.zzC = 0;
        }
        this.zzf.zzh();
    }
}
