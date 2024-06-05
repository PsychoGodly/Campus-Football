package com.applovin.impl;

import android.os.Process;
import com.applovin.impl.sdk.k;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class zf {

    /* renamed from: a  reason: collision with root package name */
    private final PriorityBlockingQueue f13827a = new PriorityBlockingQueue();

    /* renamed from: b  reason: collision with root package name */
    private final k f13828b;

    private static class b extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private final BlockingQueue f13829a;

        /* renamed from: b  reason: collision with root package name */
        private final k f13830b;

        private b(BlockingQueue blockingQueue, int i10, k kVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            } else if (kVar != null) {
                this.f13829a = blockingQueue;
                this.f13830b = kVar;
                setPriority(((Integer) kVar.a(oj.T)).intValue());
            } else {
                throw new IllegalArgumentException("No sdk specified");
            }
        }

        private HttpURLConnection a(c cVar) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.f13832a).openConnection();
            httpURLConnection.setRequestMethod(cVar.f13833b);
            httpURLConnection.setConnectTimeout(cVar.f13836f);
            httpURLConnection.setReadTimeout(cVar.f13836f);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.f13834c.isEmpty()) {
                for (Map.Entry entry : cVar.f13834c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte[]} */
        /* JADX WARNING: type inference failed for: r8v0 */
        /* JADX WARNING: type inference failed for: r8v1, types: [java.io.Closeable] */
        /* JADX WARNING: type inference failed for: r8v2 */
        /* JADX WARNING: type inference failed for: r8v3 */
        /* JADX WARNING: type inference failed for: r8v5 */
        /* JADX WARNING: type inference failed for: r8v6 */
        /* JADX WARNING: type inference failed for: r8v7 */
        /* JADX WARNING: type inference failed for: r8v9 */
        /* JADX WARNING: type inference failed for: r8v10 */
        /* JADX WARNING: type inference failed for: r8v11 */
        /* JADX WARNING: type inference failed for: r8v12 */
        /* JADX WARNING: type inference failed for: r8v13 */
        /* JADX WARNING: type inference failed for: r8v14 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x01ab A[Catch:{ all -> 0x0209 }] */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x01b6 A[SYNTHETIC, Splitter:B:120:0x01b6] */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x01cd  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x00d1 A[Catch:{ all -> 0x013f }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00dc A[SYNTHETIC, Splitter:B:67:0x00dc] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void b(com.applovin.impl.zf.c r18) {
            /*
                r17 = this;
                r1 = r17
                r2 = r18
                java.lang.String r3 = "processRequest"
                com.applovin.impl.sdk.k r0 = r1.f13830b
                com.applovin.impl.oj r4 = com.applovin.impl.oj.M
                java.lang.Object r0 = r0.a((com.applovin.impl.oj) r4)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                java.lang.String r4 = "Failed to make HTTP request"
                r5 = 1
                r6 = 0
                java.lang.String r7 = "NetworkCommunicationThread"
                r8 = 0
                if (r0 == 0) goto L_0x0146
                long r9 = android.os.SystemClock.elapsedRealtime()
                java.net.HttpURLConnection r11 = r17.a(r18)     // Catch:{ all -> 0x00be }
                byte[] r0 = r18.f13835d     // Catch:{ all -> 0x00ba }
                if (r0 == 0) goto L_0x006d
                byte[] r0 = r18.f13835d     // Catch:{ all -> 0x00ba }
                int r0 = r0.length     // Catch:{ all -> 0x00ba }
                if (r0 <= 0) goto L_0x006d
                r11.setDoOutput(r5)     // Catch:{ all -> 0x00ba }
                byte[] r0 = r18.f13835d     // Catch:{ all -> 0x00ba }
                int r0 = r0.length     // Catch:{ all -> 0x00ba }
                r11.setFixedLengthStreamingMode(r0)     // Catch:{ all -> 0x00ba }
                java.io.OutputStream r5 = r11.getOutputStream()     // Catch:{ all -> 0x005a }
                byte[] r0 = r18.f13835d     // Catch:{ all -> 0x004c }
                r5.write(r0)     // Catch:{ all -> 0x004c }
                r5.close()     // Catch:{ all -> 0x005a }
                goto L_0x006d
            L_0x004c:
                r0 = move-exception
                r12 = r0
                if (r5 == 0) goto L_0x0059
                r5.close()     // Catch:{ all -> 0x0054 }
                goto L_0x0059
            L_0x0054:
                r0 = move-exception
                r5 = r0
                r12.addSuppressed(r5)     // Catch:{ all -> 0x005a }
            L_0x0059:
                throw r12     // Catch:{ all -> 0x005a }
            L_0x005a:
                r0 = move-exception
                com.applovin.impl.sdk.k r5 = r1.f13830b     // Catch:{ all -> 0x00ba }
                com.applovin.impl.sdk.t r5 = r5.L()     // Catch:{ all -> 0x00ba }
                r5.a((java.lang.String) r7, (java.lang.Throwable) r0)     // Catch:{ all -> 0x00ba }
                com.applovin.impl.sdk.k r5 = r1.f13830b     // Catch:{ all -> 0x00ba }
                com.applovin.impl.sdk.o r5 = r5.B()     // Catch:{ all -> 0x00ba }
                r5.a((java.lang.String) r7, (java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x00ba }
            L_0x006d:
                long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00ba }
                int r6 = r11.getResponseCode()     // Catch:{ all -> 0x00ba }
                long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00ba }
                if (r6 <= 0) goto L_0x00b7
                java.io.InputStream r5 = r11.getInputStream()     // Catch:{ all -> 0x009f }
                com.applovin.impl.sdk.k r0 = r1.f13830b     // Catch:{ all -> 0x0091 }
                byte[] r14 = com.applovin.impl.c4.a((java.io.InputStream) r5, (com.applovin.impl.sdk.k) r0)     // Catch:{ all -> 0x0091 }
                if (r5 == 0) goto L_0x008d
                r5.close()     // Catch:{ all -> 0x008b }
                goto L_0x008d
            L_0x008b:
                r0 = move-exception
                goto L_0x00a1
            L_0x008d:
                r0 = r8
                r5 = r0
                goto L_0x010e
            L_0x0091:
                r0 = move-exception
                r14 = r0
                if (r5 == 0) goto L_0x009e
                r5.close()     // Catch:{ all -> 0x0099 }
                goto L_0x009e
            L_0x0099:
                r0 = move-exception
                r5 = r0
                r14.addSuppressed(r5)     // Catch:{ all -> 0x009f }
            L_0x009e:
                throw r14     // Catch:{ all -> 0x009f }
            L_0x009f:
                r0 = move-exception
                r14 = r8
            L_0x00a1:
                com.applovin.impl.sdk.k r5 = r1.f13830b     // Catch:{ all -> 0x00b4 }
                com.applovin.impl.sdk.t r5 = r5.L()     // Catch:{ all -> 0x00b4 }
                r5.a((java.lang.String) r7, (java.lang.Throwable) r0)     // Catch:{ all -> 0x00b4 }
                com.applovin.impl.sdk.k r5 = r1.f13830b     // Catch:{ all -> 0x00b4 }
                com.applovin.impl.sdk.o r5 = r5.B()     // Catch:{ all -> 0x00b4 }
                r5.a((java.lang.String) r7, (java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x00b4 }
                goto L_0x008d
            L_0x00b4:
                r0 = move-exception
                r5 = r0
                goto L_0x00c2
            L_0x00b7:
                r0 = r8
                r5 = r0
                goto L_0x010f
            L_0x00ba:
                r0 = move-exception
                r5 = r0
                r14 = r8
                goto L_0x00c2
            L_0x00be:
                r0 = move-exception
                r5 = r0
                r11 = r8
                r14 = r11
            L_0x00c2:
                long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x013f }
                com.applovin.impl.sdk.k r0 = r1.f13830b     // Catch:{ all -> 0x013f }
                r0.L()     // Catch:{ all -> 0x013f }
                boolean r0 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x013f }
                if (r0 == 0) goto L_0x00da
                com.applovin.impl.sdk.k r0 = r1.f13830b     // Catch:{ all -> 0x013f }
                com.applovin.impl.sdk.t r0 = r0.L()     // Catch:{ all -> 0x013f }
                r0.d(r7, r4, r5)     // Catch:{ all -> 0x013f }
            L_0x00da:
                if (r11 == 0) goto L_0x010d
                java.io.InputStream r4 = r11.getErrorStream()     // Catch:{ all -> 0x00fa }
                com.applovin.impl.sdk.k r0 = r1.f13830b     // Catch:{ all -> 0x00ec }
                byte[] r8 = com.applovin.impl.c4.a((java.io.InputStream) r4, (com.applovin.impl.sdk.k) r0)     // Catch:{ all -> 0x00ec }
                if (r4 == 0) goto L_0x010d
                r4.close()     // Catch:{ all -> 0x00fa }
                goto L_0x010d
            L_0x00ec:
                r0 = move-exception
                r15 = r0
                if (r4 == 0) goto L_0x00f9
                r4.close()     // Catch:{ all -> 0x00f4 }
                goto L_0x00f9
            L_0x00f4:
                r0 = move-exception
                r4 = r0
                r15.addSuppressed(r4)     // Catch:{ all -> 0x00fa }
            L_0x00f9:
                throw r15     // Catch:{ all -> 0x00fa }
            L_0x00fa:
                r0 = move-exception
                com.applovin.impl.sdk.k r4 = r1.f13830b     // Catch:{ all -> 0x010d }
                com.applovin.impl.sdk.t r4 = r4.L()     // Catch:{ all -> 0x010d }
                r4.a((java.lang.String) r7, (java.lang.Throwable) r5)     // Catch:{ all -> 0x010d }
                com.applovin.impl.sdk.k r4 = r1.f13830b     // Catch:{ all -> 0x010d }
                com.applovin.impl.sdk.o r4 = r4.B()     // Catch:{ all -> 0x010d }
                r4.a((java.lang.String) r7, (java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x010d }
            L_0x010d:
                r0 = r8
            L_0x010e:
                r8 = r14
            L_0x010f:
                com.applovin.impl.sdk.k r3 = r1.f13830b
                com.applovin.impl.zp.a((java.net.HttpURLConnection) r11, (com.applovin.impl.sdk.k) r3)
                com.applovin.impl.zf$d$a r3 = com.applovin.impl.zf.d.a()
                com.applovin.impl.zf$d$a r3 = r3.a((int) r6)
                com.applovin.impl.zf$d$a r3 = r3.a((byte[]) r8)
                com.applovin.impl.zf$d$a r0 = r3.b((byte[]) r0)
                long r12 = r12 - r9
                com.applovin.impl.zf$d$a r0 = r0.a((long) r12)
                com.applovin.impl.zf$d$a r0 = r0.a((java.lang.Throwable) r5)
                com.applovin.impl.zf$d r0 = r0.a()
                java.util.concurrent.Executor r3 = r18.f13838h
                com.applovin.impl.d90 r4 = new com.applovin.impl.d90
                r4.<init>(r2, r0)
                r3.execute(r4)
                goto L_0x0208
            L_0x013f:
                r0 = move-exception
                com.applovin.impl.sdk.k r2 = r1.f13830b
                com.applovin.impl.zp.a((java.net.HttpURLConnection) r11, (com.applovin.impl.sdk.k) r2)
                throw r0
            L_0x0146:
                long r9 = android.os.SystemClock.elapsedRealtime()
                java.net.HttpURLConnection r3 = r17.a(r18)     // Catch:{ all -> 0x0199 }
                byte[] r0 = r18.f13835d     // Catch:{ all -> 0x0196 }
                if (r0 == 0) goto L_0x0174
                byte[] r0 = r18.f13835d     // Catch:{ all -> 0x0196 }
                int r0 = r0.length     // Catch:{ all -> 0x0196 }
                if (r0 <= 0) goto L_0x0174
                r3.setDoOutput(r5)     // Catch:{ all -> 0x0196 }
                byte[] r0 = r18.f13835d     // Catch:{ all -> 0x0196 }
                int r0 = r0.length     // Catch:{ all -> 0x0196 }
                r3.setFixedLengthStreamingMode(r0)     // Catch:{ all -> 0x0196 }
                java.io.OutputStream r0 = r3.getOutputStream()     // Catch:{ all -> 0x0196 }
                byte[] r5 = r18.f13835d     // Catch:{ all -> 0x0196 }
                r0.write(r5)     // Catch:{ all -> 0x0196 }
                r0.close()     // Catch:{ all -> 0x0196 }
            L_0x0174:
                long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0196 }
                int r6 = r3.getResponseCode()     // Catch:{ all -> 0x0196 }
                long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0196 }
                if (r6 <= 0) goto L_0x0191
                java.io.InputStream r5 = r3.getInputStream()     // Catch:{ all -> 0x0196 }
                com.applovin.impl.sdk.k r0 = r1.f13830b     // Catch:{ all -> 0x018f }
                byte[] r0 = com.applovin.impl.c4.a((java.io.InputStream) r5, (com.applovin.impl.sdk.k) r0)     // Catch:{ all -> 0x018f }
                r4 = r8
                r7 = r4
                goto L_0x01d0
            L_0x018f:
                r0 = move-exception
                goto L_0x019c
            L_0x0191:
                r0 = r8
                r4 = r0
                r5 = r4
                r7 = r5
                goto L_0x01d0
            L_0x0196:
                r0 = move-exception
                r5 = r8
                goto L_0x019c
            L_0x0199:
                r0 = move-exception
                r3 = r8
                r5 = r3
            L_0x019c:
                long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0209 }
                com.applovin.impl.sdk.k r13 = r1.f13830b     // Catch:{ all -> 0x0209 }
                r13.L()     // Catch:{ all -> 0x0209 }
                boolean r13 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0209 }
                if (r13 == 0) goto L_0x01b4
                com.applovin.impl.sdk.k r13 = r1.f13830b     // Catch:{ all -> 0x0209 }
                com.applovin.impl.sdk.t r13 = r13.L()     // Catch:{ all -> 0x0209 }
                r13.d(r7, r4, r0)     // Catch:{ all -> 0x0209 }
            L_0x01b4:
                if (r3 == 0) goto L_0x01cd
                java.io.InputStream r4 = r3.getErrorStream()     // Catch:{ all -> 0x01c7 }
                com.applovin.impl.sdk.k r7 = r1.f13830b     // Catch:{ all -> 0x01c8 }
                byte[] r7 = com.applovin.impl.c4.a((java.io.InputStream) r4, (com.applovin.impl.sdk.k) r7)     // Catch:{ all -> 0x01c8 }
                r16 = r4
                r4 = r0
                r0 = r8
                r8 = r16
                goto L_0x01d0
            L_0x01c7:
                r4 = r8
            L_0x01c8:
                r7 = r8
                r8 = r4
                r4 = r0
                r0 = r7
                goto L_0x01d0
            L_0x01cd:
                r4 = r0
                r0 = r8
                r7 = r0
            L_0x01d0:
                com.applovin.impl.sdk.k r13 = r1.f13830b
                com.applovin.impl.zp.a((java.io.Closeable) r5, (com.applovin.impl.sdk.k) r13)
                com.applovin.impl.sdk.k r5 = r1.f13830b
                com.applovin.impl.zp.a((java.io.Closeable) r8, (com.applovin.impl.sdk.k) r5)
                com.applovin.impl.sdk.k r5 = r1.f13830b
                com.applovin.impl.zp.a((java.net.HttpURLConnection) r3, (com.applovin.impl.sdk.k) r5)
                com.applovin.impl.zf$d$a r3 = com.applovin.impl.zf.d.a()
                com.applovin.impl.zf$d$a r3 = r3.a((int) r6)
                com.applovin.impl.zf$d$a r0 = r3.a((byte[]) r0)
                com.applovin.impl.zf$d$a r0 = r0.b((byte[]) r7)
                long r11 = r11 - r9
                com.applovin.impl.zf$d$a r0 = r0.a((long) r11)
                com.applovin.impl.zf$d$a r0 = r0.a((java.lang.Throwable) r4)
                com.applovin.impl.zf$d r0 = r0.a()
                java.util.concurrent.Executor r3 = r18.f13838h
                com.applovin.impl.e90 r4 = new com.applovin.impl.e90
                r4.<init>(r2, r0)
                r3.execute(r4)
            L_0x0208:
                return
            L_0x0209:
                r0 = move-exception
                com.applovin.impl.sdk.k r2 = r1.f13830b
                com.applovin.impl.zp.a((java.io.Closeable) r5, (com.applovin.impl.sdk.k) r2)
                com.applovin.impl.sdk.k r2 = r1.f13830b
                com.applovin.impl.zp.a((java.io.Closeable) r8, (com.applovin.impl.sdk.k) r2)
                com.applovin.impl.sdk.k r2 = r1.f13830b
                com.applovin.impl.zp.a((java.net.HttpURLConnection) r3, (com.applovin.impl.sdk.k) r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.zf.b.b(com.applovin.impl.zf$c):void");
        }

        private void a() {
            b((c) this.f13829a.take());
        }
    }

    public static class c implements Comparable {

        /* renamed from: j  reason: collision with root package name */
        private static final AtomicInteger f13831j = new AtomicInteger();
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f13832a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final String f13833b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final Map f13834c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f13835d;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final int f13836f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final androidx.core.util.a f13837g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public final Executor f13838h;

        /* renamed from: i  reason: collision with root package name */
        private final int f13839i;

        public static class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public String f13840a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public String f13841b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public Map f13842c = new HashMap();
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public byte[] f13843d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public int f13844e;
            /* access modifiers changed from: private */

            /* renamed from: f  reason: collision with root package name */
            public androidx.core.util.a f13845f;
            /* access modifiers changed from: private */

            /* renamed from: g  reason: collision with root package name */
            public Executor f13846g;

            public a a(byte[] bArr) {
                this.f13843d = bArr;
                return this;
            }

            public a b(String str) {
                this.f13841b = str;
                return this;
            }

            public a a(String str) {
                this.f13840a = str;
                return this;
            }

            public a a(String str, String str2) {
                this.f13842c.put(str, str2);
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.f13842c = map;
                return this;
            }

            public a a(androidx.core.util.a aVar) {
                this.f13845f = aVar;
                return this;
            }

            public a a(Executor executor) {
                this.f13846g = executor;
                return this;
            }

            public a a(int i10) {
                this.f13844e = i10;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        private c(a aVar) {
            this.f13832a = aVar.f13840a;
            this.f13833b = aVar.f13841b;
            this.f13834c = aVar.f13842c != null ? aVar.f13842c : Collections.emptyMap();
            this.f13835d = aVar.f13843d;
            this.f13836f = aVar.f13844e;
            this.f13837g = aVar.f13845f;
            this.f13838h = aVar.f13846g;
            this.f13839i = f13831j.incrementAndGet();
        }

        /* renamed from: h */
        public int compareTo(c cVar) {
            return this.f13839i - cVar.f13839i;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final int f13847a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f13848b;

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f13849c;

        /* renamed from: d  reason: collision with root package name */
        private final long f13850d;

        /* renamed from: e  reason: collision with root package name */
        private final Throwable f13851e;

        public static class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public int f13852a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public byte[] f13853b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public byte[] f13854c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public long f13855d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public Throwable f13856e;

            public a a(int i10) {
                this.f13852a = i10;
                return this;
            }

            public a b(byte[] bArr) {
                this.f13854c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.f13853b = bArr;
                return this;
            }

            public a a(long j10) {
                this.f13855d = j10;
                return this;
            }

            public a a(Throwable th) {
                this.f13856e = th;
                return this;
            }

            public d a() {
                return new d(this);
            }
        }

        private d(a aVar) {
            this.f13847a = aVar.f13852a;
            this.f13848b = aVar.f13853b;
            this.f13849c = aVar.f13854c;
            this.f13850d = aVar.f13855d;
            this.f13851e = aVar.f13856e;
        }

        public static a a() {
            return new a();
        }

        public int b() {
            return this.f13847a;
        }

        public int c() {
            Throwable th = this.f13851e;
            if (th == null) {
                return this.f13847a;
            }
            throw th;
        }

        public byte[] d() {
            Throwable th = this.f13851e;
            if (th == null) {
                return this.f13848b;
            }
            throw th;
        }

        public long e() {
            return this.f13850d;
        }

        public byte[] f() {
            return this.f13849c;
        }
    }

    public zf(k kVar) {
        this.f13828b = kVar;
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.f13827a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    public void a() {
        for (int i10 = 0; i10 < ((Integer) this.f13828b.a(oj.S)).intValue(); i10++) {
            new b(this.f13827a, i10, this.f13828b).start();
        }
    }
}
