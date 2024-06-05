package androidx.webkit.internal;

import java.net.URLConnection;

/* compiled from: MimeUtil */
class p {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        if (guessContentTypeFromName != null) {
            return guessContentTypeFromName;
        }
        return b(str);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r5.equals("mhtml") == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(java.lang.String r5) {
        /*
            r0 = 46
            int r1 = r5.lastIndexOf(r0)
            r2 = 0
            r3 = -1
            if (r1 != r3) goto L_0x000b
            return r2
        L_0x000b:
            r4 = 1
            int r1 = r1 + r4
            java.lang.String r5 = r5.substring(r1)
            java.lang.String r5 = r5.toLowerCase()
            r5.hashCode()
            int r1 = r5.hashCode()
            switch(r1) {
                case 3315: goto L_0x02b4;
                case 3401: goto L_0x02a8;
                case 97669: goto L_0x029c;
                case 98819: goto L_0x0290;
                case 102340: goto L_0x0284;
                case 103649: goto L_0x0278;
                case 104085: goto L_0x026c;
                case 105441: goto L_0x0260;
                case 106458: goto L_0x0252;
                case 106479: goto L_0x0244;
                case 108089: goto L_0x0236;
                case 108150: goto L_0x0228;
                case 108272: goto L_0x021a;
                case 108273: goto L_0x020c;
                case 108324: goto L_0x01fe;
                case 109961: goto L_0x01f0;
                case 109967: goto L_0x01e2;
                case 109973: goto L_0x01d4;
                case 109982: goto L_0x01c6;
                case 110834: goto L_0x01b8;
                case 111030: goto L_0x01aa;
                case 111145: goto L_0x019c;
                case 114276: goto L_0x018e;
                case 114791: goto L_0x0180;
                case 114833: goto L_0x0172;
                case 117484: goto L_0x0164;
                case 118660: goto L_0x0156;
                case 118807: goto L_0x0148;
                case 120609: goto L_0x013a;
                case 3000872: goto L_0x012c;
                case 3145576: goto L_0x011e;
                case 3213227: goto L_0x0110;
                case 3259225: goto L_0x0102;
                case 3268712: goto L_0x00f4;
                case 3271912: goto L_0x00e6;
                case 3358085: goto L_0x00d8;
                case 3418175: goto L_0x00ca;
                case 3529614: goto L_0x00bc;
                case 3542678: goto L_0x00ae;
                case 3559925: goto L_0x00a0;
                case 3642020: goto L_0x0093;
                case 3645337: goto L_0x0086;
                case 3645340: goto L_0x0079;
                case 3655064: goto L_0x006c;
                case 3678569: goto L_0x005f;
                case 96488848: goto L_0x0052;
                case 103877016: goto L_0x0049;
                case 106703064: goto L_0x003c;
                case 109418142: goto L_0x002f;
                case 114035747: goto L_0x0022;
                default: goto L_0x001f;
            }
        L_0x001f:
            r0 = -1
            goto L_0x02bf
        L_0x0022:
            java.lang.String r0 = "xhtml"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x002b
            goto L_0x001f
        L_0x002b:
            r0 = 49
            goto L_0x02bf
        L_0x002f:
            java.lang.String r0 = "shtml"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0038
            goto L_0x001f
        L_0x0038:
            r0 = 48
            goto L_0x02bf
        L_0x003c:
            java.lang.String r0 = "pjpeg"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0045
            goto L_0x001f
        L_0x0045:
            r0 = 47
            goto L_0x02bf
        L_0x0049:
            java.lang.String r1 = "mhtml"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x02bf
            goto L_0x001f
        L_0x0052:
            java.lang.String r0 = "ehtml"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x005b
            goto L_0x001f
        L_0x005b:
            r0 = 45
            goto L_0x02bf
        L_0x005f:
            java.lang.String r0 = "xhtm"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0068
            goto L_0x001f
        L_0x0068:
            r0 = 44
            goto L_0x02bf
        L_0x006c:
            java.lang.String r0 = "woff"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0075
            goto L_0x001f
        L_0x0075:
            r0 = 43
            goto L_0x02bf
        L_0x0079:
            java.lang.String r0 = "webp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0082
            goto L_0x001f
        L_0x0082:
            r0 = 42
            goto L_0x02bf
        L_0x0086:
            java.lang.String r0 = "webm"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x008f
            goto L_0x001f
        L_0x008f:
            r0 = 41
            goto L_0x02bf
        L_0x0093:
            java.lang.String r0 = "wasm"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x009c
            goto L_0x001f
        L_0x009c:
            r0 = 40
            goto L_0x02bf
        L_0x00a0:
            java.lang.String r0 = "tiff"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x00aa
            goto L_0x001f
        L_0x00aa:
            r0 = 39
            goto L_0x02bf
        L_0x00ae:
            java.lang.String r0 = "svgz"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x00b8
            goto L_0x001f
        L_0x00b8:
            r0 = 38
            goto L_0x02bf
        L_0x00bc:
            java.lang.String r0 = "shtm"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x00c6
            goto L_0x001f
        L_0x00c6:
            r0 = 37
            goto L_0x02bf
        L_0x00ca:
            java.lang.String r0 = "opus"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x00d4
            goto L_0x001f
        L_0x00d4:
            r0 = 36
            goto L_0x02bf
        L_0x00d8:
            java.lang.String r0 = "mpeg"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x00e2
            goto L_0x001f
        L_0x00e2:
            r0 = 35
            goto L_0x02bf
        L_0x00e6:
            java.lang.String r0 = "json"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x00f0
            goto L_0x001f
        L_0x00f0:
            r0 = 34
            goto L_0x02bf
        L_0x00f4:
            java.lang.String r0 = "jpeg"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x00fe
            goto L_0x001f
        L_0x00fe:
            r0 = 33
            goto L_0x02bf
        L_0x0102:
            java.lang.String r0 = "jfif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x010c
            goto L_0x001f
        L_0x010c:
            r0 = 32
            goto L_0x02bf
        L_0x0110:
            java.lang.String r0 = "html"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x011a
            goto L_0x001f
        L_0x011a:
            r0 = 31
            goto L_0x02bf
        L_0x011e:
            java.lang.String r0 = "flac"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0128
            goto L_0x001f
        L_0x0128:
            r0 = 30
            goto L_0x02bf
        L_0x012c:
            java.lang.String r0 = "apng"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0136
            goto L_0x001f
        L_0x0136:
            r0 = 29
            goto L_0x02bf
        L_0x013a:
            java.lang.String r0 = "zip"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0144
            goto L_0x001f
        L_0x0144:
            r0 = 28
            goto L_0x02bf
        L_0x0148:
            java.lang.String r0 = "xml"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0152
            goto L_0x001f
        L_0x0152:
            r0 = 27
            goto L_0x02bf
        L_0x0156:
            java.lang.String r0 = "xht"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0160
            goto L_0x001f
        L_0x0160:
            r0 = 26
            goto L_0x02bf
        L_0x0164:
            java.lang.String r0 = "wav"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x016e
            goto L_0x001f
        L_0x016e:
            r0 = 25
            goto L_0x02bf
        L_0x0172:
            java.lang.String r0 = "tif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x017c
            goto L_0x001f
        L_0x017c:
            r0 = 24
            goto L_0x02bf
        L_0x0180:
            java.lang.String r0 = "tgz"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x018a
            goto L_0x001f
        L_0x018a:
            r0 = 23
            goto L_0x02bf
        L_0x018e:
            java.lang.String r0 = "svg"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0198
            goto L_0x001f
        L_0x0198:
            r0 = 22
            goto L_0x02bf
        L_0x019c:
            java.lang.String r0 = "png"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x01a6
            goto L_0x001f
        L_0x01a6:
            r0 = 21
            goto L_0x02bf
        L_0x01aa:
            java.lang.String r0 = "pjp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x01b4
            goto L_0x001f
        L_0x01b4:
            r0 = 20
            goto L_0x02bf
        L_0x01b8:
            java.lang.String r0 = "pdf"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x01c2
            goto L_0x001f
        L_0x01c2:
            r0 = 19
            goto L_0x02bf
        L_0x01c6:
            java.lang.String r0 = "ogv"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x01d0
            goto L_0x001f
        L_0x01d0:
            r0 = 18
            goto L_0x02bf
        L_0x01d4:
            java.lang.String r0 = "ogm"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x01de
            goto L_0x001f
        L_0x01de:
            r0 = 17
            goto L_0x02bf
        L_0x01e2:
            java.lang.String r0 = "ogg"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x01ec
            goto L_0x001f
        L_0x01ec:
            r0 = 16
            goto L_0x02bf
        L_0x01f0:
            java.lang.String r0 = "oga"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x01fa
            goto L_0x001f
        L_0x01fa:
            r0 = 15
            goto L_0x02bf
        L_0x01fe:
            java.lang.String r0 = "mpg"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0208
            goto L_0x001f
        L_0x0208:
            r0 = 14
            goto L_0x02bf
        L_0x020c:
            java.lang.String r0 = "mp4"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0216
            goto L_0x001f
        L_0x0216:
            r0 = 13
            goto L_0x02bf
        L_0x021a:
            java.lang.String r0 = "mp3"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0224
            goto L_0x001f
        L_0x0224:
            r0 = 12
            goto L_0x02bf
        L_0x0228:
            java.lang.String r0 = "mjs"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0232
            goto L_0x001f
        L_0x0232:
            r0 = 11
            goto L_0x02bf
        L_0x0236:
            java.lang.String r0 = "mht"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0240
            goto L_0x001f
        L_0x0240:
            r0 = 10
            goto L_0x02bf
        L_0x0244:
            java.lang.String r0 = "m4v"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x024e
            goto L_0x001f
        L_0x024e:
            r0 = 9
            goto L_0x02bf
        L_0x0252:
            java.lang.String r0 = "m4a"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x025c
            goto L_0x001f
        L_0x025c:
            r0 = 8
            goto L_0x02bf
        L_0x0260:
            java.lang.String r0 = "jpg"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x026a
            goto L_0x001f
        L_0x026a:
            r0 = 7
            goto L_0x02bf
        L_0x026c:
            java.lang.String r0 = "ico"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0276
            goto L_0x001f
        L_0x0276:
            r0 = 6
            goto L_0x02bf
        L_0x0278:
            java.lang.String r0 = "htm"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0282
            goto L_0x001f
        L_0x0282:
            r0 = 5
            goto L_0x02bf
        L_0x0284:
            java.lang.String r0 = "gif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x028e
            goto L_0x001f
        L_0x028e:
            r0 = 4
            goto L_0x02bf
        L_0x0290:
            java.lang.String r0 = "css"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x029a
            goto L_0x001f
        L_0x029a:
            r0 = 3
            goto L_0x02bf
        L_0x029c:
            java.lang.String r0 = "bmp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x02a6
            goto L_0x001f
        L_0x02a6:
            r0 = 2
            goto L_0x02bf
        L_0x02a8:
            java.lang.String r0 = "js"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x02b2
            goto L_0x001f
        L_0x02b2:
            r0 = 1
            goto L_0x02bf
        L_0x02b4:
            java.lang.String r0 = "gz"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x02be
            goto L_0x001f
        L_0x02be:
            r0 = 0
        L_0x02bf:
            switch(r0) {
                case 0: goto L_0x031a;
                case 1: goto L_0x0317;
                case 2: goto L_0x0314;
                case 3: goto L_0x0311;
                case 4: goto L_0x030e;
                case 5: goto L_0x030b;
                case 6: goto L_0x0308;
                case 7: goto L_0x0305;
                case 8: goto L_0x0302;
                case 9: goto L_0x02ff;
                case 10: goto L_0x02fc;
                case 11: goto L_0x0317;
                case 12: goto L_0x02f9;
                case 13: goto L_0x02ff;
                case 14: goto L_0x02f6;
                case 15: goto L_0x02f3;
                case 16: goto L_0x02f3;
                case 17: goto L_0x02f0;
                case 18: goto L_0x02f0;
                case 19: goto L_0x02ed;
                case 20: goto L_0x0305;
                case 21: goto L_0x02ea;
                case 22: goto L_0x02e7;
                case 23: goto L_0x031a;
                case 24: goto L_0x02e4;
                case 25: goto L_0x02e1;
                case 26: goto L_0x02de;
                case 27: goto L_0x02db;
                case 28: goto L_0x02d8;
                case 29: goto L_0x02d5;
                case 30: goto L_0x02d2;
                case 31: goto L_0x030b;
                case 32: goto L_0x0305;
                case 33: goto L_0x0305;
                case 34: goto L_0x02cf;
                case 35: goto L_0x02f6;
                case 36: goto L_0x02f3;
                case 37: goto L_0x030b;
                case 38: goto L_0x02e7;
                case 39: goto L_0x02e4;
                case 40: goto L_0x02cc;
                case 41: goto L_0x02c9;
                case 42: goto L_0x02c6;
                case 43: goto L_0x02c3;
                case 44: goto L_0x02de;
                case 45: goto L_0x030b;
                case 46: goto L_0x02fc;
                case 47: goto L_0x0305;
                case 48: goto L_0x030b;
                case 49: goto L_0x02de;
                default: goto L_0x02c2;
            }
        L_0x02c2:
            return r2
        L_0x02c3:
            java.lang.String r5 = "application/font-woff"
            return r5
        L_0x02c6:
            java.lang.String r5 = "image/webp"
            return r5
        L_0x02c9:
            java.lang.String r5 = "video/webm"
            return r5
        L_0x02cc:
            java.lang.String r5 = "application/wasm"
            return r5
        L_0x02cf:
            java.lang.String r5 = "application/json"
            return r5
        L_0x02d2:
            java.lang.String r5 = "audio/flac"
            return r5
        L_0x02d5:
            java.lang.String r5 = "image/apng"
            return r5
        L_0x02d8:
            java.lang.String r5 = "application/zip"
            return r5
        L_0x02db:
            java.lang.String r5 = "text/xml"
            return r5
        L_0x02de:
            java.lang.String r5 = "application/xhtml+xml"
            return r5
        L_0x02e1:
            java.lang.String r5 = "audio/wav"
            return r5
        L_0x02e4:
            java.lang.String r5 = "image/tiff"
            return r5
        L_0x02e7:
            java.lang.String r5 = "image/svg+xml"
            return r5
        L_0x02ea:
            java.lang.String r5 = "image/png"
            return r5
        L_0x02ed:
            java.lang.String r5 = "application/pdf"
            return r5
        L_0x02f0:
            java.lang.String r5 = "video/ogg"
            return r5
        L_0x02f3:
            java.lang.String r5 = "audio/ogg"
            return r5
        L_0x02f6:
            java.lang.String r5 = "video/mpeg"
            return r5
        L_0x02f9:
            java.lang.String r5 = "audio/mpeg"
            return r5
        L_0x02fc:
            java.lang.String r5 = "multipart/related"
            return r5
        L_0x02ff:
            java.lang.String r5 = "video/mp4"
            return r5
        L_0x0302:
            java.lang.String r5 = "audio/x-m4a"
            return r5
        L_0x0305:
            java.lang.String r5 = "image/jpeg"
            return r5
        L_0x0308:
            java.lang.String r5 = "image/x-icon"
            return r5
        L_0x030b:
            java.lang.String r5 = "text/html"
            return r5
        L_0x030e:
            java.lang.String r5 = "image/gif"
            return r5
        L_0x0311:
            java.lang.String r5 = "text/css"
            return r5
        L_0x0314:
            java.lang.String r5 = "image/bmp"
            return r5
        L_0x0317:
            java.lang.String r5 = "application/javascript"
            return r5
        L_0x031a:
            java.lang.String r5 = "application/gzip"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.webkit.internal.p.b(java.lang.String):java.lang.String");
    }
}
