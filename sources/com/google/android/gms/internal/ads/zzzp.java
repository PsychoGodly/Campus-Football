package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzzp implements zzaab {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    private static final zzzo zzc = new zzzo(zzzl.zza);
    private static final zzzo zzd = new zzzo(zzzm.zza);
    private zzfqk zze;

    private final void zzc(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new zzahc());
                return;
            case 1:
                list.add(new zzahf());
                return;
            case 2:
                list.add(new zzahi(0));
                return;
            case 3:
                list.add(new zzabj(0));
                return;
            case 4:
                zzzu zza2 = zzc.zza(0);
                if (zza2 != null) {
                    list.add(zza2);
                    return;
                } else {
                    list.add(new zzaca(0));
                    return;
                }
            case 5:
                list.add(new zzacd());
                return;
            case 6:
                list.add(new zzaeu(0));
                return;
            case 7:
                list.add(new zzafc(0));
                return;
            case 8:
                list.add(new zzafx(0, (zzeu) null));
                list.add(new zzagc(0));
                return;
            case 9:
                list.add(new zzagq());
                return;
            case 10:
                list.add(new zzail());
                return;
            case 11:
                if (this.zze == null) {
                    this.zze = zzfqk.zzo();
                }
                list.add(new zzaiv(1, new zzeu(0), new zzahk(0, this.zze), 112800));
                return;
            case 12:
                list.add(new zzajh());
                return;
            case 14:
                list.add(new zzaci());
                return;
            case 15:
                zzzu zza3 = zzd.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    return;
                }
                return;
            case 16:
                list.add(new zzabo());
                return;
            default:
                return;
        }
    }

    public final synchronized zzzu[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v76, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0188, code lost:
        r4 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x018b, code lost:
        r4 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x018e, code lost:
        r4 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0191, code lost:
        r4 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0194, code lost:
        r4 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0196, code lost:
        r4 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0198, code lost:
        r4 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x019b, code lost:
        r4 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x019d, code lost:
        r4 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x019f, code lost:
        r4 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01a1, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01a3, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0176, code lost:
        r4 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0177, code lost:
        switch(r4) {
            case 0: goto L_0x01a3;
            case 1: goto L_0x01a3;
            case 2: goto L_0x01a3;
            case 3: goto L_0x01a1;
            case 4: goto L_0x019f;
            case 5: goto L_0x019f;
            case 6: goto L_0x019f;
            case 7: goto L_0x019d;
            case 8: goto L_0x019b;
            case 9: goto L_0x0198;
            case 10: goto L_0x0196;
            case 11: goto L_0x0196;
            case 12: goto L_0x0196;
            case 13: goto L_0x0196;
            case 14: goto L_0x0196;
            case 15: goto L_0x0194;
            case 16: goto L_0x0191;
            case 17: goto L_0x0191;
            case 18: goto L_0x0191;
            case 19: goto L_0x018e;
            case 20: goto L_0x018b;
            case 21: goto L_0x0188;
            case 22: goto L_0x0185;
            case 23: goto L_0x0182;
            case 24: goto L_0x017f;
            case 25: goto L_0x017c;
            default: goto L_0x017a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x017c, code lost:
        r4 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x017f, code lost:
        r4 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0182, code lost:
        r4 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0185, code lost:
        r4 = 12;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0327  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzzu[] zzb(android.net.Uri r22, java.util.Map r23) {
        /*
            r21 = this;
            r1 = r21
            monitor-enter(r21)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0341 }
            r2 = 16
            r0.<init>(r2)     // Catch:{ all -> 0x0341 }
            java.lang.String r3 = "Content-Type"
            r4 = r23
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x0341 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0341 }
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0026
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x001f
            goto L_0x0026
        L_0x001f:
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x0341 }
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0341 }
        L_0x0026:
            r7 = 5
            r8 = 4
            r9 = 3
            r10 = 14
            r11 = 13
            r12 = 12
            r13 = 11
            r14 = 9
            r15 = 6
            r16 = 1
            r17 = 15
            r18 = 10
            r19 = 8
            r3 = -1
            if (r4 != 0) goto L_0x0042
        L_0x003f:
            r4 = -1
            goto L_0x01a4
        L_0x0042:
            java.lang.String r4 = com.google.android.gms.internal.ads.zzbt.zze(r4)     // Catch:{ all -> 0x0341 }
            int r20 = r4.hashCode()     // Catch:{ all -> 0x0341 }
            switch(r20) {
                case -2123537834: goto L_0x016c;
                case -1662384011: goto L_0x0161;
                case -1662384007: goto L_0x0156;
                case -1662095187: goto L_0x014b;
                case -1606874997: goto L_0x0141;
                case -1487394660: goto L_0x0136;
                case -1248337486: goto L_0x012b;
                case -1079884372: goto L_0x0120;
                case -1004728940: goto L_0x0115;
                case -387023398: goto L_0x0109;
                case -43467528: goto L_0x00fd;
                case 13915911: goto L_0x00f1;
                case 187078296: goto L_0x00e6;
                case 187078297: goto L_0x00db;
                case 187078669: goto L_0x00d0;
                case 187090232: goto L_0x00c4;
                case 187091926: goto L_0x00b8;
                case 187099443: goto L_0x00ac;
                case 1331848029: goto L_0x00a0;
                case 1503095341: goto L_0x0095;
                case 1504578661: goto L_0x008a;
                case 1504619009: goto L_0x007f;
                case 1504824762: goto L_0x0073;
                case 1504831518: goto L_0x0067;
                case 1505118770: goto L_0x005b;
                case 2039520277: goto L_0x004f;
                default: goto L_0x004d;
            }     // Catch:{ all -> 0x0341 }
        L_0x004d:
            goto L_0x0176
        L_0x004f:
            java.lang.String r5 = "video/x-matroska"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 10
            goto L_0x0177
        L_0x005b:
            java.lang.String r5 = "audio/webm"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 13
            goto L_0x0177
        L_0x0067:
            java.lang.String r5 = "audio/mpeg"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 15
            goto L_0x0177
        L_0x0073:
            java.lang.String r5 = "audio/midi"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 9
            goto L_0x0177
        L_0x007f:
            java.lang.String r5 = "audio/flac"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 7
            goto L_0x0177
        L_0x008a:
            java.lang.String r5 = "audio/eac3"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 1
            goto L_0x0177
        L_0x0095:
            java.lang.String r5 = "audio/3gpp"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 5
            goto L_0x0177
        L_0x00a0:
            java.lang.String r5 = "video/mp4"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 16
            goto L_0x0177
        L_0x00ac:
            java.lang.String r5 = "audio/wav"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 22
            goto L_0x0177
        L_0x00b8:
            java.lang.String r5 = "audio/ogg"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 19
            goto L_0x0177
        L_0x00c4:
            java.lang.String r5 = "audio/mp4"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 17
            goto L_0x0177
        L_0x00d0:
            java.lang.String r5 = "audio/amr"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 4
            goto L_0x0177
        L_0x00db:
            java.lang.String r5 = "audio/ac4"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 3
            goto L_0x0177
        L_0x00e6:
            java.lang.String r5 = "audio/ac3"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 0
            goto L_0x0177
        L_0x00f1:
            java.lang.String r5 = "video/x-flv"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 8
            goto L_0x0177
        L_0x00fd:
            java.lang.String r5 = "application/webm"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 14
            goto L_0x0177
        L_0x0109:
            java.lang.String r5 = "audio/x-matroska"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 11
            goto L_0x0177
        L_0x0115:
            java.lang.String r5 = "text/vtt"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 23
            goto L_0x0177
        L_0x0120:
            java.lang.String r5 = "video/x-msvideo"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 25
            goto L_0x0177
        L_0x012b:
            java.lang.String r5 = "application/mp4"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 18
            goto L_0x0177
        L_0x0136:
            java.lang.String r5 = "image/jpeg"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 24
            goto L_0x0177
        L_0x0141:
            java.lang.String r5 = "audio/amr-wb"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 6
            goto L_0x0177
        L_0x014b:
            java.lang.String r5 = "video/webm"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 12
            goto L_0x0177
        L_0x0156:
            java.lang.String r5 = "video/mp2t"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 21
            goto L_0x0177
        L_0x0161:
            java.lang.String r5 = "video/mp2p"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 20
            goto L_0x0177
        L_0x016c:
            java.lang.String r5 = "audio/eac3-joc"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0341 }
            if (r4 == 0) goto L_0x0176
            r4 = 2
            goto L_0x0177
        L_0x0176:
            r4 = -1
        L_0x0177:
            switch(r4) {
                case 0: goto L_0x01a3;
                case 1: goto L_0x01a3;
                case 2: goto L_0x01a3;
                case 3: goto L_0x01a1;
                case 4: goto L_0x019f;
                case 5: goto L_0x019f;
                case 6: goto L_0x019f;
                case 7: goto L_0x019d;
                case 8: goto L_0x019b;
                case 9: goto L_0x0198;
                case 10: goto L_0x0196;
                case 11: goto L_0x0196;
                case 12: goto L_0x0196;
                case 13: goto L_0x0196;
                case 14: goto L_0x0196;
                case 15: goto L_0x0194;
                case 16: goto L_0x0191;
                case 17: goto L_0x0191;
                case 18: goto L_0x0191;
                case 19: goto L_0x018e;
                case 20: goto L_0x018b;
                case 21: goto L_0x0188;
                case 22: goto L_0x0185;
                case 23: goto L_0x0182;
                case 24: goto L_0x017f;
                case 25: goto L_0x017c;
                default: goto L_0x017a;
            }     // Catch:{ all -> 0x0341 }
        L_0x017a:
            goto L_0x003f
        L_0x017c:
            r4 = 16
            goto L_0x01a4
        L_0x017f:
            r4 = 14
            goto L_0x01a4
        L_0x0182:
            r4 = 13
            goto L_0x01a4
        L_0x0185:
            r4 = 12
            goto L_0x01a4
        L_0x0188:
            r4 = 11
            goto L_0x01a4
        L_0x018b:
            r4 = 10
            goto L_0x01a4
        L_0x018e:
            r4 = 9
            goto L_0x01a4
        L_0x0191:
            r4 = 8
            goto L_0x01a4
        L_0x0194:
            r4 = 7
            goto L_0x01a4
        L_0x0196:
            r4 = 6
            goto L_0x01a4
        L_0x0198:
            r4 = 15
            goto L_0x01a4
        L_0x019b:
            r4 = 5
            goto L_0x01a4
        L_0x019d:
            r4 = 4
            goto L_0x01a4
        L_0x019f:
            r4 = 3
            goto L_0x01a4
        L_0x01a1:
            r4 = 1
            goto L_0x01a4
        L_0x01a3:
            r4 = 0
        L_0x01a4:
            if (r4 == r3) goto L_0x01a9
            r1.zzc(r4, r0)     // Catch:{ all -> 0x0341 }
        L_0x01a9:
            java.lang.String r5 = r22.getLastPathSegment()     // Catch:{ all -> 0x0341 }
            if (r5 != 0) goto L_0x01b2
        L_0x01af:
            r10 = -1
            goto L_0x031b
        L_0x01b2:
            java.lang.String r6 = ".ac3"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 != 0) goto L_0x031a
            java.lang.String r6 = ".ec3"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x01c4
            goto L_0x031a
        L_0x01c4:
            java.lang.String r6 = ".ac4"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x01cf
            r10 = 1
            goto L_0x031b
        L_0x01cf:
            java.lang.String r6 = ".adts"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 != 0) goto L_0x0318
            java.lang.String r6 = ".aac"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x01e1
            goto L_0x0318
        L_0x01e1:
            java.lang.String r6 = ".amr"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x01ec
            r10 = 3
            goto L_0x031b
        L_0x01ec:
            java.lang.String r6 = ".flac"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x01f7
            r10 = 4
            goto L_0x031b
        L_0x01f7:
            java.lang.String r6 = ".flv"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x0202
            r10 = 5
            goto L_0x031b
        L_0x0202:
            java.lang.String r6 = ".mid"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 != 0) goto L_0x0315
            java.lang.String r6 = ".midi"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 != 0) goto L_0x0315
            java.lang.String r6 = ".smf"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x021c
            goto L_0x0315
        L_0x021c:
            int r6 = r5.length()     // Catch:{ all -> 0x0341 }
            java.lang.String r7 = ".mk"
            int r6 = r6 + -4
            boolean r6 = r5.startsWith(r7, r6)     // Catch:{ all -> 0x0341 }
            if (r6 != 0) goto L_0x0313
            java.lang.String r6 = ".webm"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x0234
            goto L_0x0313
        L_0x0234:
            java.lang.String r6 = ".mp3"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x023f
            r10 = 7
            goto L_0x031b
        L_0x023f:
            java.lang.String r6 = ".mp4"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 != 0) goto L_0x0310
            int r6 = r5.length()     // Catch:{ all -> 0x0341 }
            int r6 = r6 + -4
            java.lang.String r7 = ".m4"
            boolean r6 = r5.startsWith(r7, r6)     // Catch:{ all -> 0x0341 }
            if (r6 != 0) goto L_0x0310
            int r6 = r5.length()     // Catch:{ all -> 0x0341 }
            java.lang.String r7 = ".mp4"
            int r6 = r6 + -5
            boolean r6 = r5.startsWith(r7, r6)     // Catch:{ all -> 0x0341 }
            if (r6 != 0) goto L_0x0310
            int r6 = r5.length()     // Catch:{ all -> 0x0341 }
            int r6 = r6 + -5
            java.lang.String r7 = ".cmf"
            boolean r6 = r5.startsWith(r7, r6)     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x0273
            goto L_0x0310
        L_0x0273:
            int r6 = r5.length()     // Catch:{ all -> 0x0341 }
            int r6 = r6 + -4
            java.lang.String r7 = ".og"
            boolean r6 = r5.startsWith(r7, r6)     // Catch:{ all -> 0x0341 }
            if (r6 != 0) goto L_0x030d
            java.lang.String r6 = ".opus"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x028b
            goto L_0x030d
        L_0x028b:
            java.lang.String r6 = ".ps"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 != 0) goto L_0x030a
            java.lang.String r6 = ".mpeg"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 != 0) goto L_0x030a
            java.lang.String r6 = ".mpg"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 != 0) goto L_0x030a
            java.lang.String r6 = ".m2p"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x02ac
            goto L_0x030a
        L_0x02ac:
            java.lang.String r6 = ".ts"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 != 0) goto L_0x0307
            int r6 = r5.length()     // Catch:{ all -> 0x0341 }
            int r6 = r6 + -4
            java.lang.String r7 = ".ts"
            boolean r6 = r5.startsWith(r7, r6)     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x02c3
            goto L_0x0307
        L_0x02c3:
            java.lang.String r6 = ".wav"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 != 0) goto L_0x0304
            java.lang.String r6 = ".wave"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x02d4
            goto L_0x0304
        L_0x02d4:
            java.lang.String r6 = ".vtt"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 != 0) goto L_0x0301
            java.lang.String r6 = ".webvtt"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x02e5
            goto L_0x0301
        L_0x02e5:
            java.lang.String r6 = ".jpg"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 != 0) goto L_0x031b
            java.lang.String r6 = ".jpeg"
            boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r6 == 0) goto L_0x02f6
            goto L_0x031b
        L_0x02f6:
            java.lang.String r6 = ".avi"
            boolean r5 = r5.endsWith(r6)     // Catch:{ all -> 0x0341 }
            if (r5 == 0) goto L_0x01af
            r10 = 16
            goto L_0x031b
        L_0x0301:
            r10 = 13
            goto L_0x031b
        L_0x0304:
            r10 = 12
            goto L_0x031b
        L_0x0307:
            r10 = 11
            goto L_0x031b
        L_0x030a:
            r10 = 10
            goto L_0x031b
        L_0x030d:
            r10 = 9
            goto L_0x031b
        L_0x0310:
            r10 = 8
            goto L_0x031b
        L_0x0313:
            r10 = 6
            goto L_0x031b
        L_0x0315:
            r10 = 15
            goto L_0x031b
        L_0x0318:
            r10 = 2
            goto L_0x031b
        L_0x031a:
            r10 = 0
        L_0x031b:
            if (r10 == r3) goto L_0x0322
            if (r10 == r4) goto L_0x0322
            r1.zzc(r10, r0)     // Catch:{ all -> 0x0341 }
        L_0x0322:
            int[] r3 = zza     // Catch:{ all -> 0x0341 }
            r5 = 0
        L_0x0325:
            if (r5 >= r2) goto L_0x0333
            r6 = r3[r5]     // Catch:{ all -> 0x0341 }
            if (r6 == r4) goto L_0x0330
            if (r6 == r10) goto L_0x0330
            r1.zzc(r6, r0)     // Catch:{ all -> 0x0341 }
        L_0x0330:
            int r5 = r5 + 1
            goto L_0x0325
        L_0x0333:
            int r2 = r0.size()     // Catch:{ all -> 0x0341 }
            com.google.android.gms.internal.ads.zzzu[] r2 = new com.google.android.gms.internal.ads.zzzu[r2]     // Catch:{ all -> 0x0341 }
            java.lang.Object[] r0 = r0.toArray(r2)     // Catch:{ all -> 0x0341 }
            com.google.android.gms.internal.ads.zzzu[] r0 = (com.google.android.gms.internal.ads.zzzu[]) r0     // Catch:{ all -> 0x0341 }
            monitor-exit(r21)
            return r0
        L_0x0341:
            r0 = move-exception
            monitor-exit(r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzp.zzb(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzzu[]");
    }
}
