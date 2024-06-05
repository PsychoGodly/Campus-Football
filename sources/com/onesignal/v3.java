package com.onesignal;

import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/* compiled from: OneSignalRestClient */
class v3 {

    /* compiled from: OneSignalRestClient */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f28273a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f28274b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f28275c;

        a(String str, JSONObject jSONObject, g gVar) {
            this.f28273a = str;
            this.f28274b = jSONObject;
            this.f28275c = gVar;
        }

        public void run() {
            v3.h(this.f28273a, "PUT", this.f28274b, this.f28275c, 120000, (String) null);
        }
    }

    /* compiled from: OneSignalRestClient */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f28276a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f28277b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f28278c;

        b(String str, JSONObject jSONObject, g gVar) {
            this.f28276a = str;
            this.f28277b = jSONObject;
            this.f28278c = gVar;
        }

        public void run() {
            v3.h(this.f28276a, "POST", this.f28277b, this.f28278c, 120000, (String) null);
        }
    }

    /* compiled from: OneSignalRestClient */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f28279a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f28280b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f28281c;

        c(String str, g gVar, String str2) {
            this.f28279a = str;
            this.f28280b = gVar;
            this.f28281c = str2;
        }

        public void run() {
            v3.h(this.f28279a, (String) null, (JSONObject) null, this.f28280b, 60000, this.f28281c);
        }
    }

    /* compiled from: OneSignalRestClient */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Thread[] f28282a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28283b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f28284c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ JSONObject f28285d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f28286f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f28287g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f28288h;

        d(Thread[] threadArr, String str, String str2, JSONObject jSONObject, g gVar, int i10, String str3) {
            this.f28282a = threadArr;
            this.f28283b = str;
            this.f28284c = str2;
            this.f28285d = jSONObject;
            this.f28286f = gVar;
            this.f28287g = i10;
            this.f28288h = str3;
        }

        public void run() {
            this.f28282a[0] = v3.n(this.f28283b, this.f28284c, this.f28285d, this.f28286f, this.f28287g, this.f28288h);
        }
    }

    /* compiled from: OneSignalRestClient */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f28289a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28290b;

        e(g gVar, String str) {
            this.f28289a = gVar;
            this.f28290b = str;
        }

        public void run() {
            this.f28289a.b(this.f28290b);
        }
    }

    /* compiled from: OneSignalRestClient */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f28291a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f28292b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f28293c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Throwable f28294d;

        f(g gVar, int i10, String str, Throwable th) {
            this.f28291a = gVar;
            this.f28292b = i10;
            this.f28293c = str;
            this.f28294d = th;
        }

        public void run() {
            this.f28291a.a(this.f28292b, this.f28293c, this.f28294d);
        }
    }

    /* compiled from: OneSignalRestClient */
    static abstract class g {
        g() {
        }

        /* access modifiers changed from: package-private */
        public void a(int i10, String str, Throwable th) {
        }

        /* access modifiers changed from: package-private */
        public void b(String str) {
        }
    }

    private static Thread c(g gVar, int i10, String str, Throwable th) {
        if (gVar == null) {
            return null;
        }
        Thread thread = new Thread(new f(gVar, i10, str, th), "OS_REST_FAILURE_CALLBACK");
        OSUtils.X(thread);
        return thread;
    }

    private static Thread d(g gVar, String str) {
        if (gVar == null) {
            return null;
        }
        Thread thread = new Thread(new e(gVar, str), "OS_REST_SUCCESS_CALLBACK");
        OSUtils.X(thread);
        return thread;
    }

    public static void e(String str, g gVar, String str2) {
        OSUtils.X(new Thread(new c(str, gVar, str2), "OS_REST_ASYNC_GET"));
    }

    public static void f(String str, g gVar, String str2) {
        h(str, (String) null, (JSONObject) null, gVar, 60000, str2);
    }

    private static int g(int i10) {
        return i10 + UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS;
    }

    /* access modifiers changed from: private */
    public static void h(String str, String str2, JSONObject jSONObject, g gVar, int i10, String str3) {
        String str4 = str2;
        if (OSUtils.H()) {
            throw new b3("Method: " + str2 + " was called from the Main Thread!");
        } else if (str4 == null || !k3.H2((String) null)) {
            Thread[] threadArr = new Thread[1];
            Thread thread = new Thread(new d(threadArr, str, str2, jSONObject, gVar, i10, str3), "OS_HTTPConnection");
            OSUtils.X(thread);
            try {
                thread.join((long) g(i10));
                if (thread.getState() != Thread.State.TERMINATED) {
                    thread.interrupt();
                }
                if (threadArr[0] != null) {
                    threadArr[0].join();
                }
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
    }

    private static HttpURLConnection i(String str) throws IOException {
        return (HttpURLConnection) new URL("https://api.onesignal.com/" + str).openConnection();
    }

    public static void j(String str, JSONObject jSONObject, g gVar) {
        OSUtils.X(new Thread(new b(str, jSONObject, gVar), "OS_REST_ASYNC_POST"));
    }

    public static void k(String str, JSONObject jSONObject, g gVar) {
        h(str, "POST", jSONObject, gVar, 120000, (String) null);
    }

    public static void l(String str, JSONObject jSONObject, g gVar) {
        OSUtils.X(new Thread(new a(str, jSONObject, gVar), "OS_REST_ASYNC_PUT"));
    }

    public static void m(String str, JSONObject jSONObject, g gVar) {
        h(str, "PUT", jSONObject, gVar, 120000, (String) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02c3, code lost:
        if (r10 == null) goto L_0x02c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0281 A[Catch:{ all -> 0x02c7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Thread n(java.lang.String r16, java.lang.String r17, org.json.JSONObject r18, com.onesignal.v3.g r19, int r20, java.lang.String r21) {
        /*
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.String r5 = "OneSignalRestClient: "
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r6 < r7) goto L_0x0017
            r7 = 10000(0x2710, float:1.4013E-41)
            android.net.TrafficStats.setThreadStatsTag(r7)
        L_0x0017:
            r7 = 0
            r8 = -1
            com.onesignal.k3$r0 r9 = com.onesignal.k3.r0.DEBUG     // Catch:{ all -> 0x027b }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x027b }
            r10.<init>()     // Catch:{ all -> 0x027b }
            java.lang.String r11 = "OneSignalRestClient: Making request to: https://api.onesignal.com/"
            r10.append(r11)     // Catch:{ all -> 0x027b }
            r10.append(r0)     // Catch:{ all -> 0x027b }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x027b }
            com.onesignal.k3.a(r9, r10)     // Catch:{ all -> 0x027b }
            java.net.HttpURLConnection r10 = i(r16)     // Catch:{ all -> 0x027b }
            r11 = 22
            if (r6 >= r11) goto L_0x004a
            boolean r6 = r10 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ all -> 0x0279 }
            if (r6 == 0) goto L_0x004a
            r6 = r10
            javax.net.ssl.HttpsURLConnection r6 = (javax.net.ssl.HttpsURLConnection) r6     // Catch:{ all -> 0x0279 }
            com.onesignal.k4 r11 = new com.onesignal.k4     // Catch:{ all -> 0x0279 }
            javax.net.ssl.SSLSocketFactory r12 = r6.getSSLSocketFactory()     // Catch:{ all -> 0x0279 }
            r11.<init>(r12)     // Catch:{ all -> 0x0279 }
            r6.setSSLSocketFactory(r11)     // Catch:{ all -> 0x0279 }
        L_0x004a:
            r6 = 0
            r10.setUseCaches(r6)     // Catch:{ all -> 0x0279 }
            r10.setConnectTimeout(r3)     // Catch:{ all -> 0x0279 }
            r10.setReadTimeout(r3)     // Catch:{ all -> 0x0279 }
            java.lang.String r3 = "SDK-Version"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r6.<init>()     // Catch:{ all -> 0x0279 }
            java.lang.String r11 = "onesignal/android/"
            r6.append(r11)     // Catch:{ all -> 0x0279 }
            java.lang.String r11 = com.onesignal.k3.I0()     // Catch:{ all -> 0x0279 }
            r6.append(r11)     // Catch:{ all -> 0x0279 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0279 }
            r10.setRequestProperty(r3, r6)     // Catch:{ all -> 0x0279 }
            java.lang.String r3 = "Accept"
            java.lang.String r6 = "application/vnd.onesignal.v1+json"
            r10.setRequestProperty(r3, r6)     // Catch:{ all -> 0x0279 }
            r3 = 1
            if (r18 == 0) goto L_0x007b
            r10.setDoInput(r3)     // Catch:{ all -> 0x0279 }
        L_0x007b:
            if (r1 == 0) goto L_0x008a
            java.lang.String r6 = "Content-Type"
            java.lang.String r11 = "application/json; charset=UTF-8"
            r10.setRequestProperty(r6, r11)     // Catch:{ all -> 0x0279 }
            r10.setRequestMethod(r1)     // Catch:{ all -> 0x0279 }
            r10.setDoOutput(r3)     // Catch:{ all -> 0x0279 }
        L_0x008a:
            java.lang.String r3 = "UTF-8"
            if (r18 == 0) goto L_0x00bb
            java.lang.String r6 = com.onesignal.f0.g(r18)     // Catch:{ all -> 0x0279 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r11.<init>()     // Catch:{ all -> 0x0279 }
            r11.append(r5)     // Catch:{ all -> 0x0279 }
            r11.append(r1)     // Catch:{ all -> 0x0279 }
            java.lang.String r12 = " SEND JSON: "
            r11.append(r12)     // Catch:{ all -> 0x0279 }
            r11.append(r6)     // Catch:{ all -> 0x0279 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0279 }
            com.onesignal.k3.a(r9, r11)     // Catch:{ all -> 0x0279 }
            byte[] r6 = r6.getBytes(r3)     // Catch:{ all -> 0x0279 }
            int r11 = r6.length     // Catch:{ all -> 0x0279 }
            r10.setFixedLengthStreamingMode(r11)     // Catch:{ all -> 0x0279 }
            java.io.OutputStream r11 = r10.getOutputStream()     // Catch:{ all -> 0x0279 }
            r11.write(r6)     // Catch:{ all -> 0x0279 }
        L_0x00bb:
            java.lang.String r6 = "PREFS_OS_ETAG_PREFIX_"
            if (r4 == 0) goto L_0x00ef
            java.lang.String r11 = com.onesignal.t3.f28204a     // Catch:{ all -> 0x0279 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r12.<init>()     // Catch:{ all -> 0x0279 }
            r12.append(r6)     // Catch:{ all -> 0x0279 }
            r12.append(r4)     // Catch:{ all -> 0x0279 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0279 }
            java.lang.String r11 = com.onesignal.t3.f(r11, r12, r7)     // Catch:{ all -> 0x0279 }
            if (r11 == 0) goto L_0x00ef
            java.lang.String r12 = "if-none-match"
            r10.setRequestProperty(r12, r11)     // Catch:{ all -> 0x0279 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r12.<init>()     // Catch:{ all -> 0x0279 }
            java.lang.String r13 = "OneSignalRestClient: Adding header if-none-match: "
            r12.append(r13)     // Catch:{ all -> 0x0279 }
            r12.append(r11)     // Catch:{ all -> 0x0279 }
            java.lang.String r11 = r12.toString()     // Catch:{ all -> 0x0279 }
            com.onesignal.k3.a(r9, r11)     // Catch:{ all -> 0x0279 }
        L_0x00ef:
            int r8 = r10.getResponseCode()     // Catch:{ all -> 0x0279 }
            com.onesignal.k3$r0 r11 = com.onesignal.k3.r0.VERBOSE     // Catch:{ all -> 0x0275 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0275 }
            r12.<init>()     // Catch:{ all -> 0x0275 }
            java.lang.String r13 = "OneSignalRestClient: After con.getResponseCode to: https://api.onesignal.com/"
            r12.append(r13)     // Catch:{ all -> 0x0275 }
            r12.append(r0)     // Catch:{ all -> 0x0275 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0275 }
            com.onesignal.k3.a(r11, r12)     // Catch:{ all -> 0x0275 }
            r11 = 200(0xc8, float:2.8E-43)
            java.lang.String r12 = " RECEIVED JSON: "
            java.lang.String r13 = ""
            java.lang.String r14 = "GET"
            java.lang.String r15 = "\\A"
            java.lang.String r7 = "PREFS_OS_HTTP_CACHE_PREFIX_"
            if (r8 == r11) goto L_0x01d4
            r11 = 202(0xca, float:2.83E-43)
            if (r8 == r11) goto L_0x01d4
            r6 = 304(0x130, float:4.26E-43)
            if (r8 == r6) goto L_0x019a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r4.<init>()     // Catch:{ all -> 0x0279 }
            java.lang.String r6 = "OneSignalRestClient: Failed request to: https://api.onesignal.com/"
            r4.append(r6)     // Catch:{ all -> 0x0279 }
            r4.append(r0)     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0279 }
            com.onesignal.k3.a(r9, r0)     // Catch:{ all -> 0x0279 }
            java.io.InputStream r0 = r10.getErrorStream()     // Catch:{ all -> 0x0279 }
            if (r0 != 0) goto L_0x013d
            java.io.InputStream r0 = r10.getInputStream()     // Catch:{ all -> 0x0279 }
        L_0x013d:
            if (r0 == 0) goto L_0x0171
            java.util.Scanner r4 = new java.util.Scanner     // Catch:{ all -> 0x0279 }
            r4.<init>(r0, r3)     // Catch:{ all -> 0x0279 }
            java.util.Scanner r0 = r4.useDelimiter(r15)     // Catch:{ all -> 0x0279 }
            boolean r0 = r0.hasNext()     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x0152
            java.lang.String r13 = r4.next()     // Catch:{ all -> 0x0279 }
        L_0x0152:
            r4.close()     // Catch:{ all -> 0x0279 }
            com.onesignal.k3$r0 r0 = com.onesignal.k3.r0.WARN     // Catch:{ all -> 0x0279 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r3.<init>()     // Catch:{ all -> 0x0279 }
            r3.append(r5)     // Catch:{ all -> 0x0279 }
            r3.append(r1)     // Catch:{ all -> 0x0279 }
            r3.append(r12)     // Catch:{ all -> 0x0279 }
            r3.append(r13)     // Catch:{ all -> 0x0279 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0279 }
            com.onesignal.k3.a(r0, r3)     // Catch:{ all -> 0x0279 }
            r3 = 0
            goto L_0x0194
        L_0x0171:
            com.onesignal.k3$r0 r0 = com.onesignal.k3.r0.WARN     // Catch:{ all -> 0x0279 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r3.<init>()     // Catch:{ all -> 0x0279 }
            r3.append(r5)     // Catch:{ all -> 0x0279 }
            r3.append(r1)     // Catch:{ all -> 0x0279 }
            java.lang.String r4 = " HTTP Code: "
            r3.append(r4)     // Catch:{ all -> 0x0279 }
            r3.append(r8)     // Catch:{ all -> 0x0279 }
            java.lang.String r4 = " No response body!"
            r3.append(r4)     // Catch:{ all -> 0x0279 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0279 }
            com.onesignal.k3.a(r0, r3)     // Catch:{ all -> 0x0279 }
            r3 = 0
            r13 = 0
        L_0x0194:
            java.lang.Thread r0 = c(r2, r8, r13, r3)     // Catch:{ all -> 0x0279 }
            goto L_0x026d
        L_0x019a:
            java.lang.String r0 = com.onesignal.t3.f28204a     // Catch:{ all -> 0x0279 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r3.<init>()     // Catch:{ all -> 0x0279 }
            r3.append(r7)     // Catch:{ all -> 0x0279 }
            r3.append(r4)     // Catch:{ all -> 0x0279 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0279 }
            r4 = 0
            java.lang.String r0 = com.onesignal.t3.f(r0, r3, r4)     // Catch:{ all -> 0x0279 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            r3.<init>()     // Catch:{ all -> 0x0279 }
            r3.append(r5)     // Catch:{ all -> 0x0279 }
            if (r1 != 0) goto L_0x01bb
            goto L_0x01bc
        L_0x01bb:
            r14 = r1
        L_0x01bc:
            r3.append(r14)     // Catch:{ all -> 0x0279 }
            java.lang.String r4 = " - Using Cached response due to 304: "
            r3.append(r4)     // Catch:{ all -> 0x0279 }
            r3.append(r0)     // Catch:{ all -> 0x0279 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0279 }
            com.onesignal.k3.a(r9, r3)     // Catch:{ all -> 0x0279 }
            java.lang.Thread r0 = d(r2, r0)     // Catch:{ all -> 0x0279 }
            goto L_0x026d
        L_0x01d4:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0275 }
            r11.<init>()     // Catch:{ all -> 0x0275 }
            r18 = r8
            java.lang.String r8 = "OneSignalRestClient: Successfully finished request to: https://api.onesignal.com/"
            r11.append(r8)     // Catch:{ all -> 0x0271 }
            r11.append(r0)     // Catch:{ all -> 0x0271 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x0271 }
            com.onesignal.k3.a(r9, r0)     // Catch:{ all -> 0x0271 }
            java.io.InputStream r0 = r10.getInputStream()     // Catch:{ all -> 0x0271 }
            java.util.Scanner r8 = new java.util.Scanner     // Catch:{ all -> 0x0271 }
            r8.<init>(r0, r3)     // Catch:{ all -> 0x0271 }
            java.util.Scanner r0 = r8.useDelimiter(r15)     // Catch:{ all -> 0x0271 }
            boolean r0 = r0.hasNext()     // Catch:{ all -> 0x0271 }
            if (r0 == 0) goto L_0x0201
            java.lang.String r13 = r8.next()     // Catch:{ all -> 0x0271 }
        L_0x0201:
            r8.close()     // Catch:{ all -> 0x0271 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0271 }
            r0.<init>()     // Catch:{ all -> 0x0271 }
            r0.append(r5)     // Catch:{ all -> 0x0271 }
            if (r1 != 0) goto L_0x020f
            goto L_0x0210
        L_0x020f:
            r14 = r1
        L_0x0210:
            r0.append(r14)     // Catch:{ all -> 0x0271 }
            r0.append(r12)     // Catch:{ all -> 0x0271 }
            r0.append(r13)     // Catch:{ all -> 0x0271 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0271 }
            com.onesignal.k3.a(r9, r0)     // Catch:{ all -> 0x0271 }
            if (r4 == 0) goto L_0x0269
            java.lang.String r0 = "etag"
            java.lang.String r0 = r10.getHeaderField(r0)     // Catch:{ all -> 0x0271 }
            if (r0 == 0) goto L_0x0269
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0271 }
            r3.<init>()     // Catch:{ all -> 0x0271 }
            java.lang.String r8 = "OneSignalRestClient: Response has etag of "
            r3.append(r8)     // Catch:{ all -> 0x0271 }
            r3.append(r0)     // Catch:{ all -> 0x0271 }
            java.lang.String r8 = " so caching the response."
            r3.append(r8)     // Catch:{ all -> 0x0271 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0271 }
            com.onesignal.k3.a(r9, r3)     // Catch:{ all -> 0x0271 }
            java.lang.String r3 = com.onesignal.t3.f28204a     // Catch:{ all -> 0x0271 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0271 }
            r8.<init>()     // Catch:{ all -> 0x0271 }
            r8.append(r6)     // Catch:{ all -> 0x0271 }
            r8.append(r4)     // Catch:{ all -> 0x0271 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0271 }
            com.onesignal.t3.m(r3, r6, r0)     // Catch:{ all -> 0x0271 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0271 }
            r0.<init>()     // Catch:{ all -> 0x0271 }
            r0.append(r7)     // Catch:{ all -> 0x0271 }
            r0.append(r4)     // Catch:{ all -> 0x0271 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0271 }
            com.onesignal.t3.m(r3, r0, r13)     // Catch:{ all -> 0x0271 }
        L_0x0269:
            java.lang.Thread r0 = d(r2, r13)     // Catch:{ all -> 0x0271 }
        L_0x026d:
            r10.disconnect()
            goto L_0x02c6
        L_0x0271:
            r0 = move-exception
            r8 = r18
            goto L_0x027d
        L_0x0275:
            r0 = move-exception
            r18 = r8
            goto L_0x027d
        L_0x0279:
            r0 = move-exception
            goto L_0x027d
        L_0x027b:
            r0 = move-exception
            r10 = 0
        L_0x027d:
            boolean r3 = r0 instanceof java.net.ConnectException     // Catch:{ all -> 0x02c7 }
            if (r3 != 0) goto L_0x02a0
            boolean r3 = r0 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x02c7 }
            if (r3 == 0) goto L_0x0286
            goto L_0x02a0
        L_0x0286:
            com.onesignal.k3$r0 r3 = com.onesignal.k3.r0.WARN     // Catch:{ all -> 0x02c7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c7 }
            r4.<init>()     // Catch:{ all -> 0x02c7 }
            r4.append(r5)     // Catch:{ all -> 0x02c7 }
            r4.append(r1)     // Catch:{ all -> 0x02c7 }
            java.lang.String r1 = " Error thrown from network stack. "
            r4.append(r1)     // Catch:{ all -> 0x02c7 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x02c7 }
            com.onesignal.k3.b(r3, r1, r0)     // Catch:{ all -> 0x02c7 }
            goto L_0x02be
        L_0x02a0:
            com.onesignal.k3$r0 r1 = com.onesignal.k3.r0.INFO     // Catch:{ all -> 0x02c7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c7 }
            r3.<init>()     // Catch:{ all -> 0x02c7 }
            java.lang.String r4 = "OneSignalRestClient: Could not send last request, device is offline. Throwable: "
            r3.append(r4)     // Catch:{ all -> 0x02c7 }
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x02c7 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x02c7 }
            r3.append(r4)     // Catch:{ all -> 0x02c7 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02c7 }
            com.onesignal.k3.a(r1, r3)     // Catch:{ all -> 0x02c7 }
        L_0x02be:
            r1 = 0
            java.lang.Thread r0 = c(r2, r8, r1, r0)     // Catch:{ all -> 0x02c7 }
            if (r10 == 0) goto L_0x02c6
            goto L_0x026d
        L_0x02c6:
            return r0
        L_0x02c7:
            r0 = move-exception
            if (r10 == 0) goto L_0x02cd
            r10.disconnect()
        L_0x02cd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.v3.n(java.lang.String, java.lang.String, org.json.JSONObject, com.onesignal.v3$g, int, java.lang.String):java.lang.Thread");
    }
}
