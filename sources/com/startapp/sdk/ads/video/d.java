package com.startapp.sdk.ads.video;

import com.startapp.sdk.ads.video.player.VideoPlayerInterface;

/* compiled from: Sta */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f16661a = true;

    /* renamed from: b  reason: collision with root package name */
    public VideoPlayerInterface.a f16662b = null;

    /* renamed from: c  reason: collision with root package name */
    public String f16663c = null;

    /* compiled from: Sta */
    public interface a {
        void a(String str);
    }

    /* compiled from: Sta */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final d f16664a = new d();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x010e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0111 */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0138 A[SYNTHETIC, Splitter:B:80:0x0138] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0143 A[Catch:{ all -> 0x013c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(android.content.Context r21, java.net.URL r22, java.lang.String r23, com.startapp.sdk.ads.video.d.a r24) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r23
            r3 = r24
            java.lang.String r4 = ".temp"
            java.lang.String r5 = r22.toString()
            r1.f16663c = r5
            r5 = 1
            r1.f16661a = r5
            r6 = 0
            com.startapp.sdk.adsbase.AdsCommonMetaData r7 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h     // Catch:{ all -> 0x0131 }
            com.startapp.sdk.adsbase.VideoConfig r7 = r7.G()     // Catch:{ all -> 0x0131 }
            int r7 = r7.j()     // Catch:{ all -> 0x0131 }
            java.lang.String r8 = com.startapp.sdk.ads.video.VideoUtil.a((android.content.Context) r0, (java.lang.String) r2)     // Catch:{ all -> 0x0131 }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x0131 }
            r9.<init>(r8)     // Catch:{ all -> 0x0131 }
            boolean r10 = r9.exists()     // Catch:{ all -> 0x0131 }
            if (r10 == 0) goto L_0x0032
            r1.f16663c = r6
            java.util.Map<android.app.Activity, java.lang.Integer> r0 = com.startapp.j9.f15982a
            return r8
        L_0x0032:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0131 }
            r10.<init>()     // Catch:{ all -> 0x0131 }
            r10.append(r2)     // Catch:{ all -> 0x0131 }
            r10.append(r4)     // Catch:{ all -> 0x0131 }
            java.lang.String r2 = r10.toString()     // Catch:{ all -> 0x0131 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0131 }
            r10.<init>()     // Catch:{ all -> 0x0131 }
            r10.append(r8)     // Catch:{ all -> 0x0131 }
            r10.append(r4)     // Catch:{ all -> 0x0131 }
            java.lang.String r4 = r10.toString()     // Catch:{ all -> 0x0131 }
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x0131 }
            java.lang.String r11 = com.startapp.sdk.ads.video.VideoUtil.a((android.content.Context) r0, (java.lang.String) r2)     // Catch:{ all -> 0x0131 }
            r10.<init>(r11)     // Catch:{ all -> 0x0131 }
            java.net.URLConnection r11 = r22.openConnection()     // Catch:{ all -> 0x012d }
            r11.connect()     // Catch:{ all -> 0x012d }
            int r12 = r11.getContentLength()     // Catch:{ all -> 0x012d }
            java.io.InputStream r11 = r11.getInputStream()     // Catch:{ all -> 0x012d }
            java.io.DataInputStream r13 = new java.io.DataInputStream     // Catch:{ all -> 0x012b }
            r13.<init>(r11)     // Catch:{ all -> 0x012b }
            r14 = 4096(0x1000, float:5.74E-42)
            byte[] r14 = new byte[r14]     // Catch:{ all -> 0x0128 }
            r15 = 0
            java.io.FileOutputStream r2 = r0.openFileOutput(r2, r15)     // Catch:{ all -> 0x0128 }
            r0 = 0
            r16 = 0
            r17 = 0
        L_0x007b:
            int r5 = r13.read(r14)     // Catch:{ all -> 0x0118 }
            if (r5 <= 0) goto L_0x00cc
            boolean r6 = r1.f16661a     // Catch:{ all -> 0x0118 }
            if (r6 == 0) goto L_0x00cc
            r2.write(r14, r15, r5)     // Catch:{ all -> 0x0118 }
            int r0 = r0 + r5
            double r5 = (double) r0     // Catch:{ all -> 0x0118 }
            r18 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 * r18
            r18 = r14
            double r14 = (double) r12     // Catch:{ all -> 0x0118 }
            double r5 = r5 / r14
            int r5 = (int) r5     // Catch:{ all -> 0x0118 }
            if (r5 < r7) goto L_0x00c7
            if (r16 != 0) goto L_0x00ac
            if (r3 == 0) goto L_0x00ac
            android.os.Handler r6 = new android.os.Handler     // Catch:{ all -> 0x0118 }
            android.os.Looper r14 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0118 }
            r6.<init>(r14)     // Catch:{ all -> 0x0118 }
            com.startapp.sdk.ads.video.c r14 = new com.startapp.sdk.ads.video.c     // Catch:{ all -> 0x0118 }
            r14.<init>(r1, r3, r4)     // Catch:{ all -> 0x0118 }
            r6.post(r14)     // Catch:{ all -> 0x0118 }
            r16 = 1
        L_0x00ac:
            int r6 = r17 + 1
            if (r5 < r6) goto L_0x00c7
            com.startapp.sdk.ads.video.player.VideoPlayerInterface$a r6 = r1.f16662b     // Catch:{ all -> 0x0118 }
            if (r6 == 0) goto L_0x00c5
            android.os.Handler r6 = new android.os.Handler     // Catch:{ all -> 0x0118 }
            android.os.Looper r14 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0118 }
            r6.<init>(r14)     // Catch:{ all -> 0x0118 }
            com.startapp.o6 r14 = new com.startapp.o6     // Catch:{ all -> 0x0118 }
            r14.<init>(r1, r5)     // Catch:{ all -> 0x0118 }
            r6.post(r14)     // Catch:{ all -> 0x0118 }
        L_0x00c5:
            r17 = r5
        L_0x00c7:
            r14 = r18
            r6 = 0
            r15 = 0
            goto L_0x007b
        L_0x00cc:
            boolean r0 = r1.f16661a     // Catch:{ all -> 0x0118 }
            if (r0 != 0) goto L_0x00e4
            if (r5 <= 0) goto L_0x00e4
            r10.delete()     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = "downloadInterrupted"
            r3 = 0
            r1.f16663c = r3
            com.startapp.j9.a((java.io.Closeable) r11)
            com.startapp.j9.a((java.io.Closeable) r13)
            com.startapp.j9.a((java.io.Closeable) r2)
            return r0
        L_0x00e4:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x010f, all -> 0x0105 }
            r3.<init>(r10)     // Catch:{ Exception -> 0x010f, all -> 0x0105 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0110, all -> 0x0103 }
            r4.<init>(r9)     // Catch:{ Exception -> 0x0110, all -> 0x0103 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x0111, all -> 0x0101 }
        L_0x00f2:
            int r5 = r3.read(r0)     // Catch:{ Exception -> 0x0111, all -> 0x0101 }
            if (r5 <= 0) goto L_0x00fd
            r6 = 0
            r4.write(r0, r6, r5)     // Catch:{ Exception -> 0x0111, all -> 0x0101 }
            goto L_0x00f2
        L_0x00fd:
            r3.close()     // Catch:{ Exception -> 0x011a }
            goto L_0x0114
        L_0x0101:
            r0 = move-exception
            goto L_0x0108
        L_0x0103:
            r0 = move-exception
            goto L_0x0107
        L_0x0105:
            r0 = move-exception
            r3 = 0
        L_0x0107:
            r4 = 0
        L_0x0108:
            r3.close()     // Catch:{ Exception -> 0x010e }
            r4.close()     // Catch:{ Exception -> 0x010e }
        L_0x010e:
            throw r0     // Catch:{ all -> 0x0118 }
        L_0x010f:
            r3 = 0
        L_0x0110:
            r4 = 0
        L_0x0111:
            r3.close()     // Catch:{ Exception -> 0x011a }
        L_0x0114:
            r4.close()     // Catch:{ Exception -> 0x011a }
            goto L_0x011a
        L_0x0118:
            r0 = move-exception
            goto L_0x0136
        L_0x011a:
            r3 = 0
            r1.f16663c = r3
            com.startapp.j9.a((java.io.Closeable) r11)
            com.startapp.j9.a((java.io.Closeable) r13)
            com.startapp.j9.a((java.io.Closeable) r2)
            r6 = r8
            goto L_0x0158
        L_0x0128:
            r0 = move-exception
            r2 = 0
            goto L_0x0136
        L_0x012b:
            r0 = move-exception
            goto L_0x012f
        L_0x012d:
            r0 = move-exception
            r11 = 0
        L_0x012f:
            r2 = 0
            goto L_0x0135
        L_0x0131:
            r0 = move-exception
            r2 = 0
            r10 = 0
            r11 = 0
        L_0x0135:
            r13 = 0
        L_0x0136:
            if (r10 == 0) goto L_0x013f
            r10.delete()     // Catch:{ all -> 0x013c }
            goto L_0x013f
        L_0x013c:
            r0 = move-exception
            r3 = 0
            goto L_0x0159
        L_0x013f:
            boolean r3 = r0 instanceof java.io.IOException     // Catch:{ all -> 0x013c }
            if (r3 != 0) goto L_0x014b
            boolean r3 = r0 instanceof java.lang.OutOfMemoryError     // Catch:{ all -> 0x013c }
            if (r3 == 0) goto L_0x0148
            goto L_0x014b
        L_0x0148:
            com.startapp.i3.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x013c }
        L_0x014b:
            r3 = 0
            r1.f16663c = r3
            com.startapp.j9.a((java.io.Closeable) r11)
            com.startapp.j9.a((java.io.Closeable) r13)
            com.startapp.j9.a((java.io.Closeable) r2)
            r6 = r3
        L_0x0158:
            return r6
        L_0x0159:
            r1.f16663c = r3
            com.startapp.j9.a((java.io.Closeable) r11)
            com.startapp.j9.a((java.io.Closeable) r13)
            com.startapp.j9.a((java.io.Closeable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.d.a(android.content.Context, java.net.URL, java.lang.String, com.startapp.sdk.ads.video.d$a):java.lang.String");
    }
}
