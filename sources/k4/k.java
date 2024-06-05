package k4;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: FileTypes */
public final class k {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r19) {
        /*
            r0 = -1
            if (r19 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = k4.v.t(r19)
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 16
            r4 = 15
            r5 = 14
            r6 = 13
            r7 = 12
            r8 = 11
            r9 = 10
            r10 = 9
            r11 = 8
            r12 = 7
            r13 = 6
            r14 = 5
            r15 = 4
            r16 = 3
            r17 = 1
            r18 = 0
            switch(r2) {
                case -2123537834: goto L_0x0178;
                case -1662384011: goto L_0x016c;
                case -1662384007: goto L_0x0160;
                case -1662095187: goto L_0x0154;
                case -1606874997: goto L_0x0148;
                case -1487394660: goto L_0x013c;
                case -1248337486: goto L_0x0130;
                case -1079884372: goto L_0x0124;
                case -1004728940: goto L_0x0116;
                case -387023398: goto L_0x0108;
                case -43467528: goto L_0x00fa;
                case 13915911: goto L_0x00ec;
                case 187078296: goto L_0x00de;
                case 187078297: goto L_0x00d0;
                case 187078669: goto L_0x00c2;
                case 187090232: goto L_0x00b4;
                case 187091926: goto L_0x00a6;
                case 187099443: goto L_0x0099;
                case 1331848029: goto L_0x008c;
                case 1503095341: goto L_0x007f;
                case 1504578661: goto L_0x0072;
                case 1504619009: goto L_0x0065;
                case 1504824762: goto L_0x0058;
                case 1504831518: goto L_0x004b;
                case 1505118770: goto L_0x003e;
                case 2039520277: goto L_0x0031;
                default: goto L_0x002e;
            }
        L_0x002e:
            r1 = -1
            goto L_0x0183
        L_0x0031:
            java.lang.String r2 = "video/x-matroska"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x003a
            goto L_0x002e
        L_0x003a:
            r1 = 25
            goto L_0x0183
        L_0x003e:
            java.lang.String r2 = "audio/webm"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0047
            goto L_0x002e
        L_0x0047:
            r1 = 24
            goto L_0x0183
        L_0x004b:
            java.lang.String r2 = "audio/mpeg"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0054
            goto L_0x002e
        L_0x0054:
            r1 = 23
            goto L_0x0183
        L_0x0058:
            java.lang.String r2 = "audio/midi"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0061
            goto L_0x002e
        L_0x0061:
            r1 = 22
            goto L_0x0183
        L_0x0065:
            java.lang.String r2 = "audio/flac"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x006e
            goto L_0x002e
        L_0x006e:
            r1 = 21
            goto L_0x0183
        L_0x0072:
            java.lang.String r2 = "audio/eac3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x007b
            goto L_0x002e
        L_0x007b:
            r1 = 20
            goto L_0x0183
        L_0x007f:
            java.lang.String r2 = "audio/3gpp"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0088
            goto L_0x002e
        L_0x0088:
            r1 = 19
            goto L_0x0183
        L_0x008c:
            java.lang.String r2 = "video/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0095
            goto L_0x002e
        L_0x0095:
            r1 = 18
            goto L_0x0183
        L_0x0099:
            java.lang.String r2 = "audio/wav"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00a2
            goto L_0x002e
        L_0x00a2:
            r1 = 17
            goto L_0x0183
        L_0x00a6:
            java.lang.String r2 = "audio/ogg"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00b0
            goto L_0x002e
        L_0x00b0:
            r1 = 16
            goto L_0x0183
        L_0x00b4:
            java.lang.String r2 = "audio/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00be
            goto L_0x002e
        L_0x00be:
            r1 = 15
            goto L_0x0183
        L_0x00c2:
            java.lang.String r2 = "audio/amr"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00cc
            goto L_0x002e
        L_0x00cc:
            r1 = 14
            goto L_0x0183
        L_0x00d0:
            java.lang.String r2 = "audio/ac4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00da
            goto L_0x002e
        L_0x00da:
            r1 = 13
            goto L_0x0183
        L_0x00de:
            java.lang.String r2 = "audio/ac3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00e8
            goto L_0x002e
        L_0x00e8:
            r1 = 12
            goto L_0x0183
        L_0x00ec:
            java.lang.String r2 = "video/x-flv"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00f6
            goto L_0x002e
        L_0x00f6:
            r1 = 11
            goto L_0x0183
        L_0x00fa:
            java.lang.String r2 = "application/webm"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0104
            goto L_0x002e
        L_0x0104:
            r1 = 10
            goto L_0x0183
        L_0x0108:
            java.lang.String r2 = "audio/x-matroska"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0112
            goto L_0x002e
        L_0x0112:
            r1 = 9
            goto L_0x0183
        L_0x0116:
            java.lang.String r2 = "text/vtt"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0120
            goto L_0x002e
        L_0x0120:
            r1 = 8
            goto L_0x0183
        L_0x0124:
            java.lang.String r2 = "video/x-msvideo"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x012e
            goto L_0x002e
        L_0x012e:
            r1 = 7
            goto L_0x0183
        L_0x0130:
            java.lang.String r2 = "application/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x013a
            goto L_0x002e
        L_0x013a:
            r1 = 6
            goto L_0x0183
        L_0x013c:
            java.lang.String r2 = "image/jpeg"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0146
            goto L_0x002e
        L_0x0146:
            r1 = 5
            goto L_0x0183
        L_0x0148:
            java.lang.String r2 = "audio/amr-wb"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0152
            goto L_0x002e
        L_0x0152:
            r1 = 4
            goto L_0x0183
        L_0x0154:
            java.lang.String r2 = "video/webm"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x015e
            goto L_0x002e
        L_0x015e:
            r1 = 3
            goto L_0x0183
        L_0x0160:
            java.lang.String r2 = "video/mp2t"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x016a
            goto L_0x002e
        L_0x016a:
            r1 = 2
            goto L_0x0183
        L_0x016c:
            java.lang.String r2 = "video/mp2p"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0176
            goto L_0x002e
        L_0x0176:
            r1 = 1
            goto L_0x0183
        L_0x0178:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0182
            goto L_0x002e
        L_0x0182:
            r1 = 0
        L_0x0183:
            switch(r1) {
                case 0: goto L_0x0196;
                case 1: goto L_0x0195;
                case 2: goto L_0x0194;
                case 3: goto L_0x0193;
                case 4: goto L_0x0192;
                case 5: goto L_0x0191;
                case 6: goto L_0x0190;
                case 7: goto L_0x018f;
                case 8: goto L_0x018e;
                case 9: goto L_0x0193;
                case 10: goto L_0x0193;
                case 11: goto L_0x018d;
                case 12: goto L_0x0196;
                case 13: goto L_0x018c;
                case 14: goto L_0x0192;
                case 15: goto L_0x0190;
                case 16: goto L_0x018b;
                case 17: goto L_0x018a;
                case 18: goto L_0x0190;
                case 19: goto L_0x0192;
                case 20: goto L_0x0196;
                case 21: goto L_0x0189;
                case 22: goto L_0x0188;
                case 23: goto L_0x0187;
                case 24: goto L_0x0193;
                case 25: goto L_0x0193;
                default: goto L_0x0186;
            }
        L_0x0186:
            return r0
        L_0x0187:
            return r12
        L_0x0188:
            return r4
        L_0x0189:
            return r15
        L_0x018a:
            return r7
        L_0x018b:
            return r10
        L_0x018c:
            return r17
        L_0x018d:
            return r14
        L_0x018e:
            return r6
        L_0x018f:
            return r3
        L_0x0190:
            return r11
        L_0x0191:
            return r5
        L_0x0192:
            return r16
        L_0x0193:
            return r13
        L_0x0194:
            return r8
        L_0x0195:
            return r9
        L_0x0196:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.k.a(java.lang.String):int");
    }

    public static int b(Map<String, List<String>> map) {
        List list = map.get("Content-Type");
        return a((list == null || list.isEmpty()) ? null : (String) list.get(0));
    }

    public static int c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        return -1;
    }
}
