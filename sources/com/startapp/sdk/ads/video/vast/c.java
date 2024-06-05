package com.startapp.sdk.ads.video.vast;

import android.graphics.Point;
import android.util.DisplayMetrics;
import com.startapp.o9;
import com.startapp.sdk.ads.video.vast.VASTResource;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: Sta */
public class c {

    /* renamed from: i  reason: collision with root package name */
    public static final List<String> f16747i = Arrays.asList(new String[]{"video/mp4", "video/3gpp"});

    /* renamed from: a  reason: collision with root package name */
    public final int f16748a;

    /* renamed from: b  reason: collision with root package name */
    public final float f16749b;

    /* renamed from: c  reason: collision with root package name */
    public a f16750c;

    /* renamed from: d  reason: collision with root package name */
    public VASTErrorCodes f16751d;

    /* renamed from: e  reason: collision with root package name */
    public int f16752e;

    /* renamed from: f  reason: collision with root package name */
    public int f16753f = 10;

    /* renamed from: g  reason: collision with root package name */
    public final Set<a> f16754g = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    public final String f16755h;

    /* compiled from: Sta */
    public interface a {
    }

    /* compiled from: Sta */
    public interface b {
    }

    public c(DisplayMetrics displayMetrics, String str) {
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        float f10 = displayMetrics.density;
        f10 = f10 <= 0.0f ? 1.0f : f10;
        float f11 = (float) i10;
        this.f16749b = f11 / ((float) i11);
        this.f16748a = (int) (f11 / f10);
        this.f16755h = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.startapp.o9} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List, java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v23, types: [java.util.List, java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: type inference failed for: r4v42 */
    /* JADX WARNING: type inference failed for: r4v43 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x005a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.startapp.l9 a(java.lang.String r21, java.util.List<java.lang.String> r22, com.startapp.sdk.ads.video.vast.c.b r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            if (r3 == 0) goto L_0x0014
            r4 = r3
            com.startapp.sdk.ads.video.vast.b r4 = (com.startapp.sdk.ads.video.vast.b) r4
            if (r1 == 0) goto L_0x0014
            org.json.JSONArray r4 = r4.f16743c
            r4.put(r1)
        L_0x0014:
            r4 = 0
            com.startapp.o9 r5 = new com.startapp.o9     // Catch:{ Exception -> 0x033c }
            r5.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x033c }
            boolean r1 = r5.f16231b
            java.lang.String r6 = "Error"
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = r5.f(r6)
            goto L_0x0026
        L_0x0025:
            r1 = r4
        L_0x0026:
            if (r1 == 0) goto L_0x0035
            boolean r1 = r5.f16231b
            if (r1 == 0) goto L_0x0031
            java.lang.String r1 = r5.f(r6)
            goto L_0x0032
        L_0x0031:
            r1 = r4
        L_0x0032:
            r2.add(r1)
        L_0x0035:
            java.lang.String r1 = "Ad"
            java.util.List r1 = r5.a(r1, r4, r4)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L_0x0056
            int r5 = r22.size()
            if (r5 <= 0) goto L_0x0056
            int r1 = r0.f16752e
            if (r1 <= 0) goto L_0x0050
            com.startapp.sdk.ads.video.vast.VASTErrorCodes r1 = com.startapp.sdk.ads.video.vast.VASTErrorCodes.WrapperNoReponse
            goto L_0x0052
        L_0x0050:
            com.startapp.sdk.ads.video.vast.VASTErrorCodes r1 = com.startapp.sdk.ads.video.vast.VASTErrorCodes.FileNotFound
        L_0x0052:
            r0.a((java.util.List<java.lang.String>) r2, (com.startapp.sdk.ads.video.vast.VASTErrorCodes) r1)
            return r4
        L_0x0056:
            java.util.Iterator r1 = r1.iterator()
        L_0x005a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x033a
            java.lang.Object r5 = r1.next()
            com.startapp.o9 r5 = (com.startapp.o9) r5
            java.lang.String r7 = "sequence"
            java.lang.String r7 = r5.a(r7)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            r9 = 2
            if (r8 == 0) goto L_0x0074
            goto L_0x007d
        L_0x0074:
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x007d }
            if (r7 >= r9) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r7 = 0
            goto L_0x007e
        L_0x007d:
            r7 = 1
        L_0x007e:
            if (r7 != 0) goto L_0x0081
            goto L_0x005a
        L_0x0081:
            java.lang.String r7 = "InLine"
            com.startapp.o9 r7 = r5.b(r7, r4, r4)
            java.lang.String r8 = "Impression"
            if (r7 == 0) goto L_0x023c
            java.util.List r12 = r7.c()
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x0095:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0228
            java.lang.Object r13 = r12.next()
            com.startapp.o9 r13 = (com.startapp.o9) r13
            java.lang.String r14 = "MediaFile"
            java.lang.String r15 = "MediaFiles"
            java.util.List r14 = r13.a(r14, r15, r4, r4)
            r15 = -8388608(0xffffffffff800000, float:-Infinity)
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.util.Iterator r14 = r14.iterator()
            r10 = r4
        L_0x00b2:
            boolean r16 = r14.hasNext()
            java.lang.String r11 = "height"
            java.lang.String r4 = "width"
            if (r16 == 0) goto L_0x01c8
            java.lang.Object r16 = r14.next()
            r9 = r16
            com.startapp.o9 r9 = (com.startapp.o9) r9
            r16 = r1
            java.lang.String r1 = "type"
            java.lang.String r1 = r9.a(r1)
            java.lang.String r18 = r9.d()
            r19 = r12
            java.util.List<java.lang.String> r12 = f16747i
            boolean r12 = r12.contains(r1)
            if (r12 == 0) goto L_0x01b9
            if (r18 != 0) goto L_0x00de
            goto L_0x01b9
        L_0x00de:
            java.lang.Integer r4 = r9.b(r4)
            java.lang.Integer r11 = r9.b(r11)
            java.lang.String r12 = "bitrate"
            java.lang.Integer r12 = r9.b(r12)
            if (r12 == 0) goto L_0x00f1
            r17 = 2
            goto L_0x0119
        L_0x00f1:
            java.lang.String r12 = "minBitrate"
            java.lang.Integer r12 = r9.b(r12)
            java.lang.String r3 = "maxBitrate"
            java.lang.Integer r3 = r9.b(r3)
            if (r12 == 0) goto L_0x0113
            if (r3 == 0) goto L_0x0113
            int r12 = r12.intValue()
            int r3 = r3.intValue()
            int r3 = r3 + r12
            r17 = 2
            int r3 = r3 / 2
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            goto L_0x0119
        L_0x0113:
            r17 = 2
            if (r12 == 0) goto L_0x0118
            goto L_0x0119
        L_0x0118:
            r12 = r3
        L_0x0119:
            if (r4 == 0) goto L_0x01be
            int r3 = r4.intValue()
            if (r3 <= 0) goto L_0x01be
            if (r11 == 0) goto L_0x01be
            int r3 = r11.intValue()
            if (r3 > 0) goto L_0x012b
            goto L_0x01be
        L_0x012b:
            int r3 = r4.intValue()
            int r4 = r11.intValue()
            float r11 = (float) r3
            float r4 = (float) r4
            float r11 = r11 / r4
            float r4 = r0.f16749b
            float r4 = r4 - r11
            float r4 = java.lang.Math.abs(r4)
            int r11 = r0.f16748a
            int r3 = r11 - r3
            int r3 = r3 / r11
            int r3 = java.lang.Math.abs(r3)
            float r3 = (float) r3
            float r4 = r4 + r3
            if (r12 == 0) goto L_0x0156
            int r3 = r12.intValue()
            if (r3 >= 0) goto L_0x0151
            goto L_0x0156
        L_0x0151:
            int r3 = r12.intValue()
            goto L_0x0157
        L_0x0156:
            r3 = 0
        L_0x0157:
            r11 = 700(0x2bc, float:9.81E-43)
            if (r11 > r3) goto L_0x0161
            r11 = 1500(0x5dc, float:2.102E-42)
            if (r3 > r11) goto L_0x0161
            r3 = 0
            goto L_0x017a
        L_0x0161:
            int r11 = 700 - r3
            int r11 = java.lang.Math.abs(r11)
            float r11 = (float) r11
            r12 = 1143930880(0x442f0000, float:700.0)
            float r11 = r11 / r12
            int r3 = 1500 - r3
            int r3 = java.lang.Math.abs(r3)
            float r3 = (float) r3
            r12 = 1153138688(0x44bb8000, float:1500.0)
            float r3 = r3 / r12
            float r3 = java.lang.Math.min(r11, r3)
        L_0x017a:
            if (r1 != 0) goto L_0x017e
            java.lang.String r1 = ""
        L_0x017e:
            int r12 = r1.hashCode()
            r11 = -1664118616(0xffffffff9ccf90a8, float:-1.3735504E-21)
            if (r12 == r11) goto L_0x0197
            r11 = 1331848029(0x4f62635d, float:3.79816269E9)
            if (r12 == r11) goto L_0x018d
            goto L_0x01a1
        L_0x018d:
            java.lang.String r11 = "video/mp4"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x01a1
            r11 = 0
            goto L_0x01a2
        L_0x0197:
            java.lang.String r11 = "video/3gpp"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x01a1
            r11 = 1
            goto L_0x01a2
        L_0x01a1:
            r11 = -1
        L_0x01a2:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x01a9
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01ab
        L_0x01a9:
            r11 = 1069547520(0x3fc00000, float:1.5)
        L_0x01ab:
            float r4 = r4 + r1
            float r4 = r4 + r3
            float r1 = r1 / r4
            float r1 = r1 * r11
            int r3 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r3 <= 0) goto L_0x01be
            r3 = r23
            r15 = r1
            r10 = r9
            goto L_0x01c0
        L_0x01b9:
            r17 = 2
            r14.remove()
        L_0x01be:
            r3 = r23
        L_0x01c0:
            r1 = r16
            r12 = r19
            r4 = 0
            r9 = 2
            goto L_0x00b2
        L_0x01c8:
            r16 = r1
            r19 = r12
            r17 = 2
            if (r10 == 0) goto L_0x021e
            java.lang.String r1 = r10.d()
            if (r1 != 0) goto L_0x01d7
            goto L_0x021e
        L_0x01d7:
            com.startapp.l9 r1 = new com.startapp.l9
            r1.<init>()
            java.util.List r3 = r7.c(r8)
            java.util.List<java.lang.String> r9 = r1.f16103b
            r9.addAll(r3)
            r0.a((com.startapp.o9) r13, (com.startapp.l9) r1)
            java.lang.String r3 = "ClickThrough"
            java.lang.String r9 = "VideoClicks"
            java.lang.String r3 = r13.a(r3, r9)
            r1.f16120s = r3
            java.lang.String r3 = r10.d()
            r1.f16117p = r3
            java.lang.Integer r3 = r10.b(r4)
            r1.f16118q = r3
            java.lang.Integer r3 = r10.b(r11)
            r1.f16119r = r3
            java.util.Set<com.startapp.sdk.ads.video.vast.a> r3 = r0.f16754g
            java.util.List r4 = r7.a()
            java.util.Set r4 = r0.a((java.util.List<com.startapp.o9>) r4)
            r3.addAll(r4)
            java.util.List r3 = r7.c(r6)
            r2.addAll(r3)
            java.util.List<java.lang.String> r3 = r1.f16102a
            r3.addAll(r2)
            goto L_0x0230
        L_0x021e:
            r3 = r23
            r1 = r16
            r12 = r19
            r4 = 0
            r9 = 2
            goto L_0x0095
        L_0x0228:
            r16 = r1
            com.startapp.sdk.ads.video.vast.VASTErrorCodes r1 = com.startapp.sdk.ads.video.vast.VASTErrorCodes.FileNotFound
            r0.a((java.util.List<java.lang.String>) r2, (com.startapp.sdk.ads.video.vast.VASTErrorCodes) r1)
            r1 = 0
        L_0x0230:
            if (r1 == 0) goto L_0x023e
            java.util.List r2 = a((com.startapp.o9) r7)
            java.util.List<com.startapp.sdk.omsdk.VerificationDetails> r3 = r1.f16121t
            r3.addAll(r2)
            return r1
        L_0x023c:
            r16 = r1
        L_0x023e:
            java.lang.String r1 = "Wrapper"
            r3 = 0
            com.startapp.o9 r1 = r5.b(r1, r3, r3)
            if (r1 == 0) goto L_0x0333
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            java.util.List r4 = r1.c(r6)
            r3.addAll(r4)
            java.lang.String r4 = "VASTAdTagURI"
            java.lang.String r4 = r1.f(r4)
            if (r4 != 0) goto L_0x025d
        L_0x025b:
            r4 = 0
            goto L_0x027a
        L_0x025d:
            java.lang.String r4 = r0.a((java.lang.String) r4)     // Catch:{ SocketTimeoutException -> 0x026e, Exception -> 0x0262 }
            goto L_0x027a
        L_0x0262:
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x025b
            com.startapp.sdk.ads.video.vast.VASTErrorCodes r4 = com.startapp.sdk.ads.video.vast.VASTErrorCodes.WrapperNoReponse
            r0.a((java.util.List<java.lang.String>) r3, (com.startapp.sdk.ads.video.vast.VASTErrorCodes) r4)
            goto L_0x025b
        L_0x026e:
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x025b
            com.startapp.sdk.ads.video.vast.VASTErrorCodes r4 = com.startapp.sdk.ads.video.vast.VASTErrorCodes.WrapperTimeout
            r0.a((java.util.List<java.lang.String>) r3, (com.startapp.sdk.ads.video.vast.VASTErrorCodes) r4)
            goto L_0x025b
        L_0x027a:
            if (r4 != 0) goto L_0x027e
            goto L_0x0333
        L_0x027e:
            r5 = r23
            com.startapp.l9 r3 = r0.a(r4, r3, r5)
            if (r3 != 0) goto L_0x0289
            r3 = r5
            goto L_0x0335
        L_0x0289:
            java.util.List r2 = r1.c(r8)
            java.util.List<java.lang.String> r4 = r3.f16103b
            r4.addAll(r2)
            java.util.List r2 = r1.c()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x029c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x02ac
            java.lang.Object r4 = r2.next()
            com.startapp.o9 r4 = (com.startapp.o9) r4
            r0.a((com.startapp.o9) r4, (com.startapp.l9) r3)
            goto L_0x029c
        L_0x02ac:
            java.util.Set<com.startapp.sdk.ads.video.vast.a> r2 = r0.f16754g
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02c2
            java.util.Set<com.startapp.sdk.ads.video.vast.a> r2 = r0.f16754g
            java.util.List r4 = r1.a()
            java.util.Set r4 = r0.a((java.util.List<com.startapp.o9>) r4)
            r2.addAll(r4)
            goto L_0x0329
        L_0x02c2:
            java.util.Set<com.startapp.sdk.ads.video.vast.a> r2 = r0.f16754g
            java.util.Iterator r2 = r2.iterator()
        L_0x02c8:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0329
            java.lang.Object r4 = r2.next()
            com.startapp.sdk.ads.video.vast.a r4 = (com.startapp.sdk.ads.video.vast.a) r4
            java.util.List r5 = r1.a()
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x02de:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02c8
            java.lang.Object r6 = r5.next()
            com.startapp.o9 r6 = (com.startapp.o9) r6
            java.lang.String r7 = "StaticResource"
            java.lang.String r7 = r6.f(r7)
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0311
            java.lang.String r7 = "IFrameResource"
            java.lang.String r7 = r6.f(r7)
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0311
            java.lang.String r7 = "HTMLResource"
            java.lang.String r7 = r6.f(r7)
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x030f
            goto L_0x0311
        L_0x030f:
            r7 = 0
            goto L_0x0312
        L_0x0311:
            r7 = 1
        L_0x0312:
            if (r7 != 0) goto L_0x02de
            java.lang.String r7 = "CompanionClickTracking"
            java.util.List r7 = r6.c(r7)
            java.util.List<java.lang.String> r8 = r4.f16739e
            r8.addAll(r7)
            java.util.List r6 = r6.b()
            java.util.List<java.lang.String> r7 = r4.f16740f
            r7.addAll(r6)
            goto L_0x02de
        L_0x0329:
            java.util.List r1 = a((com.startapp.o9) r1)
            java.util.List<com.startapp.sdk.omsdk.VerificationDetails> r2 = r3.f16121t
            r2.addAll(r1)
            return r3
        L_0x0333:
            r3 = r23
        L_0x0335:
            r1 = r16
            r4 = 0
            goto L_0x005a
        L_0x033a:
            r1 = r4
            return r1
        L_0x033c:
            r1 = r4
            com.startapp.sdk.ads.video.vast.VASTErrorCodes r3 = com.startapp.sdk.ads.video.vast.VASTErrorCodes.XMLParsingError
            r0.a((java.util.List<java.lang.String>) r2, (com.startapp.sdk.ads.video.vast.VASTErrorCodes) r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.vast.c.a(java.lang.String, java.util.List, com.startapp.sdk.ads.video.vast.c$b):com.startapp.l9");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r4) throws java.io.IOException {
        /*
            r3 = this;
            int r0 = r3.f16752e
            int r1 = r3.f16753f
            r2 = 0
            if (r0 >= r1) goto L_0x0042
            int r0 = r0 + 1
            r3.f16752e = r0
            java.lang.String r0 = r3.f16755h     // Catch:{ all -> 0x0036 }
            java.net.HttpURLConnection r4 = com.startapp.i7.a(r4, r0)     // Catch:{ all -> 0x0036 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0033 }
            java.io.InputStream r1 = r4.getInputStream()     // Catch:{ all -> 0x0033 }
            r0.<init>(r1)     // Catch:{ all -> 0x0033 }
            java.util.Scanner r1 = new java.util.Scanner     // Catch:{ all -> 0x0030 }
            r1.<init>(r0)     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = "\\A"
            java.util.Scanner r1 = r1.useDelimiter(r2)     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = r1.next()     // Catch:{ all -> 0x0030 }
            com.startapp.j9.a((java.io.Closeable) r0)
            r4.disconnect()
            return r1
        L_0x0030:
            r1 = move-exception
            r2 = r0
            goto L_0x0039
        L_0x0033:
            r0 = move-exception
            r1 = r0
            goto L_0x0039
        L_0x0036:
            r4 = move-exception
            r1 = r4
            r4 = r2
        L_0x0039:
            com.startapp.j9.a((java.io.Closeable) r2)
            if (r4 == 0) goto L_0x0041
            r4.disconnect()
        L_0x0041:
            throw r1
        L_0x0042:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.vast.c.a(java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: com.startapp.m9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: com.startapp.m9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: com.startapp.m9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: com.startapp.m9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: com.startapp.m9} */
    /* JADX WARNING: type inference failed for: r3v25, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.startapp.o9 r24, com.startapp.l9 r25) {
        /*
            r23 = this;
            r0 = r24
            r1 = r25
            r24.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = "start"
            java.util.List r3 = r0.d(r3)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x003c
            java.lang.Object r4 = r3.next()
            com.startapp.o9 r4 = (com.startapp.o9) r4
            java.lang.String r4 = r4.d()
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x0018
            com.startapp.p9 r6 = new com.startapp.p9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.<init>(r4, r5)
            r2.add(r6)
            goto L_0x0018
        L_0x003c:
            java.lang.String r3 = "progress"
            java.util.List r4 = r0.d(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0048:
            boolean r6 = r4.hasNext()
            java.lang.String r7 = "offset"
            if (r6 == 0) goto L_0x008a
            java.lang.Object r6 = r4.next()
            com.startapp.o9 r6 = (com.startapp.o9) r6
            java.lang.String r7 = r6.a(r7)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L_0x0061
            goto L_0x0048
        L_0x0061:
            java.lang.String r7 = r7.trim()
            boolean r8 = com.startapp.p9.a(r7)
            if (r8 == 0) goto L_0x0048
            java.lang.String r6 = r6.d()
            java.lang.Integer r7 = com.startapp.p9.b(r7)
            if (r7 == 0) goto L_0x0048
            int r8 = r7.intValue()
            if (r8 < 0) goto L_0x0048
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 != 0) goto L_0x0048
            com.startapp.p9 r8 = new com.startapp.p9
            r8.<init>(r6, r7)
            r2.add(r8)
            goto L_0x0048
        L_0x008a:
            java.lang.String r4 = "creativeView"
            java.util.List r4 = r0.d(r4)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0096:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00b9
            java.lang.Object r6 = r4.next()
            com.startapp.o9 r6 = (com.startapp.o9) r6
            java.lang.String r6 = r6.d()
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 != 0) goto L_0x0096
            com.startapp.p9 r8 = new com.startapp.p9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r8.<init>(r6, r9)
            r2.add(r8)
            goto L_0x0096
        L_0x00b9:
            java.util.List<com.startapp.p9<java.lang.Integer>> r4 = r1.f16104c
            r4.addAll(r2)
            java.util.List<com.startapp.p9<java.lang.Integer>> r2 = r1.f16104c
            java.util.Collections.sort(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r4 = "firstQuartile"
            java.util.List r4 = r0.d(r4)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00d4:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00f9
            java.lang.Object r6 = r4.next()
            com.startapp.o9 r6 = (com.startapp.o9) r6
            java.lang.String r6 = r6.d()
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 != 0) goto L_0x00d4
            com.startapp.p9 r8 = new com.startapp.p9
            r9 = 1048576000(0x3e800000, float:0.25)
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r8.<init>(r6, r9)
            r2.add(r8)
            goto L_0x00d4
        L_0x00f9:
            java.lang.String r4 = "midpoint"
            java.util.List r4 = r0.d(r4)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0105:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x012a
            java.lang.Object r6 = r4.next()
            com.startapp.o9 r6 = (com.startapp.o9) r6
            java.lang.String r6 = r6.d()
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 != 0) goto L_0x0105
            com.startapp.p9 r8 = new com.startapp.p9
            r9 = 1056964608(0x3f000000, float:0.5)
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r8.<init>(r6, r9)
            r2.add(r8)
            goto L_0x0105
        L_0x012a:
            java.lang.String r4 = "thirdQuartile"
            java.util.List r4 = r0.d(r4)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0136:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x015b
            java.lang.Object r6 = r4.next()
            com.startapp.o9 r6 = (com.startapp.o9) r6
            java.lang.String r6 = r6.d()
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 != 0) goto L_0x0136
            com.startapp.p9 r8 = new com.startapp.p9
            r9 = 1061158912(0x3f400000, float:0.75)
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r8.<init>(r6, r9)
            r2.add(r8)
            goto L_0x0136
        L_0x015b:
            java.util.List r3 = r0.d(r3)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0165:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01b9
            java.lang.Object r4 = r3.next()
            com.startapp.o9 r4 = (com.startapp.o9) r4
            java.lang.String r6 = r4.a(r7)
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 == 0) goto L_0x017c
            goto L_0x0165
        L_0x017c:
            java.lang.String r6 = r6.trim()
            java.util.regex.Pattern r8 = com.startapp.p9.f16263d
            java.util.regex.Matcher r8 = r8.matcher(r6)
            boolean r8 = r8.matches()
            if (r8 == 0) goto L_0x0165
            java.lang.String r4 = r4.d()
            java.lang.String r8 = "%"
            java.lang.String r9 = ""
            java.lang.String r6 = r6.replace(r8, r9)     // Catch:{ NumberFormatException -> 0x01b7 }
            float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x01b7 }
            r8 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r8
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 < 0) goto L_0x0165
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ NumberFormatException -> 0x01b7 }
            if (r8 != 0) goto L_0x0165
            com.startapp.p9 r8 = new com.startapp.p9     // Catch:{ NumberFormatException -> 0x01b7 }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ NumberFormatException -> 0x01b7 }
            r8.<init>(r4, r6)     // Catch:{ NumberFormatException -> 0x01b7 }
            r2.add(r8)     // Catch:{ NumberFormatException -> 0x01b7 }
            goto L_0x0165
        L_0x01b7:
            goto L_0x0165
        L_0x01b9:
            java.util.List<com.startapp.p9<java.lang.Float>> r3 = r1.f16105d
            r3.addAll(r2)
            java.util.List<com.startapp.p9<java.lang.Float>> r2 = r1.f16105d
            java.util.Collections.sort(r2)
            java.lang.String r2 = "pause"
            java.util.List r2 = r0.e(r2)
            java.util.List<java.lang.String> r3 = r1.f16106e
            r3.addAll(r2)
            java.lang.String r2 = "resume"
            java.util.List r2 = r0.e(r2)
            java.util.List<java.lang.String> r3 = r1.f16107f
            r3.addAll(r2)
            java.lang.String r2 = "complete"
            java.util.List r2 = r0.e(r2)
            java.util.List<java.lang.String> r3 = r1.f16108g
            r3.addAll(r2)
            java.lang.String r2 = "close"
            java.util.List r2 = r0.e(r2)
            java.lang.String r3 = "closeLinear"
            java.util.List r3 = r0.e(r3)
            r4 = r2
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r4.addAll(r3)
            java.util.List<java.lang.String> r3 = r1.f16109h
            r3.addAll(r2)
            java.lang.String r2 = "skip"
            java.util.List r2 = r0.e(r2)
            java.util.List<java.lang.String> r3 = r1.f16112k
            r3.addAll(r2)
            java.lang.String r2 = "ClickTracking"
            java.lang.String r3 = "VideoClicks"
            java.util.List r2 = r0.b(r2, r3)
            java.util.List<java.lang.String> r3 = r1.f16113l
            r3.addAll(r2)
            java.lang.String r2 = "mute"
            java.util.List r2 = r0.e(r2)
            java.util.List<java.lang.String> r3 = r1.f16110i
            r3.addAll(r2)
            java.lang.String r2 = "unmute"
            java.util.List r2 = r0.e(r2)
            java.util.List<java.lang.String> r3 = r1.f16111j
            r3.addAll(r2)
            java.lang.Integer r2 = r1.f16114m
            r3 = 0
            if (r2 != 0) goto L_0x0258
            java.lang.String r2 = "skipoffset"
            java.lang.String r2 = r0.a(r2)
            if (r2 != 0) goto L_0x0237
            goto L_0x0255
        L_0x0237:
            java.lang.String r4 = r2.trim()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0242
            goto L_0x0255
        L_0x0242:
            boolean r4 = com.startapp.p9.a(r2)
            if (r4 == 0) goto L_0x0255
            java.lang.Integer r2 = com.startapp.p9.b(r2)
            if (r2 == 0) goto L_0x0255
            int r4 = r2.intValue()
            if (r4 < 0) goto L_0x0255
            goto L_0x0256
        L_0x0255:
            r2 = r3
        L_0x0256:
            r1.f16114m = r2
        L_0x0258:
            com.startapp.m9 r2 = r1.f16115n
            if (r2 != 0) goto L_0x0329
            java.lang.String r2 = "Icon"
            java.lang.String r4 = "Icons"
            java.util.List r0 = r0.a(r2, r4, r3, r3)
            com.startapp.sdk.ads.video.vast.VASTResource$Type[] r2 = com.startapp.sdk.ads.video.vast.VASTResource.Type.values()
            int r4 = r2.length
        L_0x0269:
            if (r5 >= r4) goto L_0x0327
            r6 = r2[r5]
            com.startapp.sdk.ads.video.vast.VASTResource$Type r8 = com.startapp.sdk.ads.video.vast.VASTResource.Type.IFRAME_RESOURCE
            if (r6 == r8) goto L_0x0323
            com.startapp.sdk.ads.video.vast.VASTResource$Type r8 = com.startapp.sdk.ads.video.vast.VASTResource.Type.HTML_RESOURCE
            if (r6 != r8) goto L_0x0277
            goto L_0x0323
        L_0x0277:
            r8 = r0
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x027e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0323
            java.lang.Object r9 = r8.next()
            com.startapp.o9 r9 = (com.startapp.o9) r9
            java.lang.String r10 = "assetWidth"
            java.lang.Integer r10 = r9.b(r10)
            if (r10 == 0) goto L_0x0293
            goto L_0x0299
        L_0x0293:
            java.lang.String r10 = "width"
            java.lang.Integer r10 = r9.b(r10)
        L_0x0299:
            java.lang.String r11 = "assetHeight"
            java.lang.Integer r11 = r9.b(r11)
            if (r11 == 0) goto L_0x02a2
            goto L_0x02a8
        L_0x02a2:
            java.lang.String r11 = "height"
            java.lang.Integer r11 = r9.b(r11)
        L_0x02a8:
            if (r10 == 0) goto L_0x027e
            int r12 = r10.intValue()
            if (r12 <= 0) goto L_0x027e
            int r12 = r10.intValue()
            r13 = 300(0x12c, float:4.2E-43)
            if (r12 > r13) goto L_0x027e
            if (r11 == 0) goto L_0x027e
            int r12 = r11.intValue()
            if (r12 <= 0) goto L_0x027e
            int r12 = r11.intValue()
            if (r12 <= r13) goto L_0x02c7
            goto L_0x027e
        L_0x02c7:
            int r12 = r10.intValue()
            int r13 = r11.intValue()
            com.startapp.sdk.ads.video.vast.VASTResource r19 = com.startapp.sdk.ads.video.vast.VASTResource.a(r9, r6, r12, r13)
            if (r19 != 0) goto L_0x02d6
            goto L_0x027e
        L_0x02d6:
            com.startapp.m9 r0 = new com.startapp.m9
            int r15 = r10.intValue()
            int r16 = r11.intValue()
            java.lang.String r2 = r9.a(r7)
            if (r2 == 0) goto L_0x02f3
            boolean r4 = com.startapp.p9.a(r2)
            if (r4 == 0) goto L_0x02f3
            java.lang.Integer r2 = com.startapp.p9.b(r2)
            r17 = r2
            goto L_0x02f5
        L_0x02f3:
            r17 = r3
        L_0x02f5:
            java.lang.String r2 = "duration"
            java.lang.String r2 = r9.a(r2)
            if (r2 == 0) goto L_0x0307
            boolean r4 = com.startapp.p9.a(r2)
            if (r4 == 0) goto L_0x0307
            java.lang.Integer r3 = com.startapp.p9.b(r2)
        L_0x0307:
            r18 = r3
            java.lang.String r2 = "IconClickTracking"
            java.lang.String r3 = "IconClicks"
            java.util.List r20 = r9.b(r2, r3)
            java.lang.String r2 = "IconClickThrough"
            java.lang.String r21 = r9.a(r2, r3)
            java.lang.String r2 = "IconViewTracking"
            java.util.List r22 = r9.c(r2)
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r3 = r0
            goto L_0x0327
        L_0x0323:
            int r5 = r5 + 1
            goto L_0x0269
        L_0x0327:
            r1.f16115n = r3
        L_0x0329:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.vast.c.a(com.startapp.o9, com.startapp.l9):void");
    }

    public final void a(List<String> list, VASTErrorCodes vASTErrorCodes) {
        this.f16751d = vASTErrorCodes;
        ArrayList arrayList = new ArrayList(list);
        list.clear();
        a aVar = this.f16750c;
        if (aVar != null) {
            com.startapp.sdk.ads.video.b.a(com.startapp.sdk.ads.video.b.this, vASTErrorCodes, (List) arrayList);
        }
    }

    public final Set<a> a(List<o9> list) {
        HashSet hashSet = new HashSet();
        for (VASTResource.Type type : VASTResource.Type.values()) {
            for (o9 next : list) {
                Integer b10 = next.b("assetWidth");
                if (b10 == null) {
                    b10 = next.b("width");
                }
                Integer b11 = next.b("assetHeight");
                if (b11 == null) {
                    b11 = next.b("height");
                }
                if (b10 != null && b10.intValue() >= 300 && b11 != null && b11.intValue() >= 250) {
                    int intValue = b10.intValue();
                    int intValue2 = b11.intValue();
                    Point point = new Point(intValue, intValue2);
                    int i10 = this.f16748a;
                    float f10 = (float) i10;
                    int i11 = (int) (f10 / this.f16749b);
                    if (intValue > i10 || intValue2 > i11) {
                        if (type == VASTResource.Type.HTML_RESOURCE) {
                            point.x = Math.min(i10, intValue);
                            point.y = Math.min(i11, intValue2);
                        } else {
                            float f11 = (float) intValue;
                            float f12 = f11 / f10;
                            float f13 = (float) intValue2;
                            float f14 = f13 / ((float) i11);
                            if (f12 > f14) {
                                point.x = i10;
                                point.y = (int) (f13 / f12);
                            } else {
                                point.x = (int) (f11 / f14);
                                point.y = i11;
                            }
                        }
                    }
                    VASTResource a10 = VASTResource.a(next, type, point.x, point.y);
                    if (a10 != null) {
                        hashSet.add(new a(point.x, point.y, a10, next.f("CompanionClickThrough"), next.c("CompanionClickTracking"), next.b()));
                    }
                }
            }
        }
        return hashSet;
    }

    public static List<VerificationDetails> a(o9 o9Var) {
        String f10;
        String f11;
        String str;
        List<o9> a10 = o9Var.a("Verification", "AdVerifications", (String) null, (List<String>) null);
        Iterator it = ((ArrayList) o9Var.a("Extension", "Extensions", "type", Collections.singletonList("AdVerifications"))).iterator();
        while (it.hasNext()) {
            ((ArrayList) a10).addAll(((o9) it.next()).a("Verification", "AdVerifications", (String) null, (List<String>) null));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) a10).iterator();
        while (it2.hasNext()) {
            o9 o9Var2 = (o9) it2.next();
            String a11 = o9Var2.a("vendor");
            if (!(a11 == null || (f10 = o9Var2.f("JavaScriptResource")) == null || (f11 = o9Var2.f("VerificationParameters")) == null)) {
                o9 b10 = o9Var2.b("JavaScriptResource", "apiFramework", (List<String>) null);
                if (b10 == null) {
                    str = null;
                } else {
                    str = b10.a("apiFramework");
                }
                if (str != null && str.equalsIgnoreCase("omid")) {
                    arrayList.add(new VerificationDetails(a11, f10, f11));
                }
            }
        }
        return arrayList;
    }
}
