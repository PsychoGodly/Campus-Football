package com.applovin.impl;

import android.net.Uri;
import java.util.List;
import java.util.Map;

public abstract class o8 {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r17) {
        /*
            r0 = -1
            if (r17 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = com.applovin.impl.df.j(r17)
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 14
            r4 = 13
            r5 = 12
            r6 = 11
            r7 = 10
            r8 = 9
            r9 = 8
            r10 = 7
            r11 = 6
            r12 = 5
            r13 = 4
            r14 = 3
            r15 = 1
            r16 = 0
            switch(r2) {
                case -2123537834: goto L_0x0156;
                case -1662384011: goto L_0x014a;
                case -1662384007: goto L_0x013e;
                case -1662095187: goto L_0x0132;
                case -1606874997: goto L_0x0126;
                case -1487394660: goto L_0x011a;
                case -1248337486: goto L_0x010e;
                case -1004728940: goto L_0x0102;
                case -387023398: goto L_0x00f4;
                case -43467528: goto L_0x00e6;
                case 13915911: goto L_0x00d8;
                case 187078296: goto L_0x00ca;
                case 187078297: goto L_0x00bc;
                case 187078669: goto L_0x00ae;
                case 187090232: goto L_0x00a0;
                case 187091926: goto L_0x0093;
                case 187099443: goto L_0x0086;
                case 1331848029: goto L_0x0079;
                case 1503095341: goto L_0x006c;
                case 1504578661: goto L_0x005f;
                case 1504619009: goto L_0x0052;
                case 1504831518: goto L_0x0045;
                case 1505118770: goto L_0x0038;
                case 2039520277: goto L_0x002b;
                default: goto L_0x0028;
            }
        L_0x0028:
            r1 = -1
            goto L_0x0161
        L_0x002b:
            java.lang.String r2 = "video/x-matroska"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0034
            goto L_0x0028
        L_0x0034:
            r1 = 23
            goto L_0x0161
        L_0x0038:
            java.lang.String r2 = "audio/webm"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0041
            goto L_0x0028
        L_0x0041:
            r1 = 22
            goto L_0x0161
        L_0x0045:
            java.lang.String r2 = "audio/mpeg"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x004e
            goto L_0x0028
        L_0x004e:
            r1 = 21
            goto L_0x0161
        L_0x0052:
            java.lang.String r2 = "audio/flac"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x005b
            goto L_0x0028
        L_0x005b:
            r1 = 20
            goto L_0x0161
        L_0x005f:
            java.lang.String r2 = "audio/eac3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0068
            goto L_0x0028
        L_0x0068:
            r1 = 19
            goto L_0x0161
        L_0x006c:
            java.lang.String r2 = "audio/3gpp"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0075
            goto L_0x0028
        L_0x0075:
            r1 = 18
            goto L_0x0161
        L_0x0079:
            java.lang.String r2 = "video/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0082
            goto L_0x0028
        L_0x0082:
            r1 = 17
            goto L_0x0161
        L_0x0086:
            java.lang.String r2 = "audio/wav"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x008f
            goto L_0x0028
        L_0x008f:
            r1 = 16
            goto L_0x0161
        L_0x0093:
            java.lang.String r2 = "audio/ogg"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x009c
            goto L_0x0028
        L_0x009c:
            r1 = 15
            goto L_0x0161
        L_0x00a0:
            java.lang.String r2 = "audio/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00aa
            goto L_0x0028
        L_0x00aa:
            r1 = 14
            goto L_0x0161
        L_0x00ae:
            java.lang.String r2 = "audio/amr"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00b8
            goto L_0x0028
        L_0x00b8:
            r1 = 13
            goto L_0x0161
        L_0x00bc:
            java.lang.String r2 = "audio/ac4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00c6
            goto L_0x0028
        L_0x00c6:
            r1 = 12
            goto L_0x0161
        L_0x00ca:
            java.lang.String r2 = "audio/ac3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00d4
            goto L_0x0028
        L_0x00d4:
            r1 = 11
            goto L_0x0161
        L_0x00d8:
            java.lang.String r2 = "video/x-flv"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00e2
            goto L_0x0028
        L_0x00e2:
            r1 = 10
            goto L_0x0161
        L_0x00e6:
            java.lang.String r2 = "application/webm"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00f0
            goto L_0x0028
        L_0x00f0:
            r1 = 9
            goto L_0x0161
        L_0x00f4:
            java.lang.String r2 = "audio/x-matroska"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00fe
            goto L_0x0028
        L_0x00fe:
            r1 = 8
            goto L_0x0161
        L_0x0102:
            java.lang.String r2 = "text/vtt"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x010c
            goto L_0x0028
        L_0x010c:
            r1 = 7
            goto L_0x0161
        L_0x010e:
            java.lang.String r2 = "application/mp4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0118
            goto L_0x0028
        L_0x0118:
            r1 = 6
            goto L_0x0161
        L_0x011a:
            java.lang.String r2 = "image/jpeg"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0124
            goto L_0x0028
        L_0x0124:
            r1 = 5
            goto L_0x0161
        L_0x0126:
            java.lang.String r2 = "audio/amr-wb"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0130
            goto L_0x0028
        L_0x0130:
            r1 = 4
            goto L_0x0161
        L_0x0132:
            java.lang.String r2 = "video/webm"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x013c
            goto L_0x0028
        L_0x013c:
            r1 = 3
            goto L_0x0161
        L_0x013e:
            java.lang.String r2 = "video/mp2t"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0148
            goto L_0x0028
        L_0x0148:
            r1 = 2
            goto L_0x0161
        L_0x014a:
            java.lang.String r2 = "video/mp2p"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0154
            goto L_0x0028
        L_0x0154:
            r1 = 1
            goto L_0x0161
        L_0x0156:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0160
            goto L_0x0028
        L_0x0160:
            r1 = 0
        L_0x0161:
            switch(r1) {
                case 0: goto L_0x0172;
                case 1: goto L_0x0171;
                case 2: goto L_0x0170;
                case 3: goto L_0x016f;
                case 4: goto L_0x016e;
                case 5: goto L_0x016d;
                case 6: goto L_0x016c;
                case 7: goto L_0x016b;
                case 8: goto L_0x016f;
                case 9: goto L_0x016f;
                case 10: goto L_0x016a;
                case 11: goto L_0x0172;
                case 12: goto L_0x0169;
                case 13: goto L_0x016e;
                case 14: goto L_0x016c;
                case 15: goto L_0x0168;
                case 16: goto L_0x0167;
                case 17: goto L_0x016c;
                case 18: goto L_0x016e;
                case 19: goto L_0x0172;
                case 20: goto L_0x0166;
                case 21: goto L_0x0165;
                case 22: goto L_0x016f;
                case 23: goto L_0x016f;
                default: goto L_0x0164;
            }
        L_0x0164:
            return r0
        L_0x0165:
            return r10
        L_0x0166:
            return r13
        L_0x0167:
            return r5
        L_0x0168:
            return r8
        L_0x0169:
            return r15
        L_0x016a:
            return r12
        L_0x016b:
            return r4
        L_0x016c:
            return r9
        L_0x016d:
            return r3
        L_0x016e:
            return r14
        L_0x016f:
            return r11
        L_0x0170:
            return r6
        L_0x0171:
            return r7
        L_0x0172:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.o8.a(java.lang.String):int");
    }

    public static int a(Map map) {
        List list = (List) map.get("Content-Type");
        return a((list == null || list.isEmpty()) ? null : (String) list.get(0));
    }

    public static int a(Uri uri) {
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
        return -1;
    }
}
