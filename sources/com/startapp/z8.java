package com.startapp;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.JsonReader;
import android.util.MalformedJsonException;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import com.startapp.sdk.jobs.JobRequest;
import com.startapp.sdk.jobs.d;
import com.startapp.sdk.triggeredlinks.AppEventsMetadata;
import com.startapp.sdk.triggeredlinks.PeriodicAppEventMetadata;
import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: Sta */
public class z8 {

    /* renamed from: a  reason: collision with root package name */
    public final String f17593a;

    /* renamed from: b  reason: collision with root package name */
    public final e f17594b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f17595c;

    /* renamed from: d  reason: collision with root package name */
    public final i4 f17596d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f17597e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, Long> f17598f;

    /* renamed from: g  reason: collision with root package name */
    public final AdvertisingIdResolver f17599g;

    /* renamed from: h  reason: collision with root package name */
    public final i2<String> f17600h;

    /* renamed from: i  reason: collision with root package name */
    public final i2<TriggeredLinksMetadata> f17601i;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f17602j = new a();

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            z8.this.b();
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TriggeredLinksMetadata f17604a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Map f17605b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f17606c;

        public b(TriggeredLinksMetadata triggeredLinksMetadata, Map map, String str) {
            this.f17604a = triggeredLinksMetadata;
            this.f17605b = map;
            this.f17606c = str;
        }

        public void run() {
            try {
                z8.this.b(this.f17604a, this.f17605b, this.f17606c);
            } catch (Throwable th) {
                if (z8.this.a(2)) {
                    i3.a(th);
                }
            }
        }
    }

    public z8(String str, e eVar, Executor executor, i4 i4Var, AdvertisingIdResolver advertisingIdResolver, i2<String> i2Var, i2<TriggeredLinksMetadata> i2Var2) {
        this.f17593a = str;
        this.f17594b = eVar;
        this.f17595c = new r7(executor);
        this.f17596d = i4Var;
        this.f17597e = new Handler(Looper.getMainLooper());
        this.f17598f = new HashMap();
        this.f17599g = advertisingIdResolver;
        this.f17600h = i2Var;
        this.f17601i = i2Var2;
    }

    public final TriggeredLinksMetadata a() {
        TriggeredLinksMetadata a10 = this.f17601i.a();
        if (a10 == null || !a10.e()) {
            return null;
        }
        return a10;
    }

    public void b() {
        String b10;
        this.f17597e.removeCallbacks(this.f17602j);
        int i10 = 1;
        this.f17596d.a(JobRequest.a((Class<? extends com.startapp.sdk.jobs.b>[]) new Class[]{y8.class}));
        TriggeredLinksMetadata a10 = a();
        Map<String, PeriodicAppEventMetadata> map = null;
        AppEventsMetadata a11 = a10 != null ? a10.a() : null;
        if (a11 != null) {
            map = a11.d();
        }
        if (map != null && map.size() >= 1) {
            e.a a12 = this.f17594b.edit();
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = Long.MAX_VALUE;
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                PeriodicAppEventMetadata periodicAppEventMetadata = (PeriodicAppEventMetadata) next.getValue();
                if (!(str == null || str.length() < i10 || periodicAppEventMetadata == null || (b10 = periodicAppEventMetadata.b()) == null || b10.length() < i10)) {
                    int a13 = periodicAppEventMetadata.a();
                    int i11 = a13 < 5 ? 5 : a13;
                    long j11 = this.f17594b.getLong(str, 0);
                    if (j11 > currentTimeMillis) {
                        a12.a(str, Long.valueOf(j11));
                        a12.f17013a.putLong(str, j11);
                        if (j10 > j11) {
                            j10 = j11;
                        }
                    } else {
                        long j12 = (((long) i11) * 1000) + currentTimeMillis;
                        a12.a(str, Long.valueOf(j12));
                        a12.f17013a.putLong(str, j12);
                        b9 b9Var = r0;
                        Executor executor = this.f17595c;
                        b9 b9Var2 = new b9(this, a10, str, b10, i11);
                        executor.execute(b9Var);
                    }
                }
                i10 = 1;
            }
            a12.apply();
            if (j10 != Long.MAX_VALUE) {
                long j13 = j10 - currentTimeMillis;
                if (j13 < UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS) {
                    a(j13);
                    return;
                }
                d.a aVar = new d.a(y8.class);
                aVar.f17253d = Long.valueOf(j13);
                aVar.f17242b = JobRequest.Network.ANY;
                this.f17596d.a(new d((d.a) aVar.a()));
            }
        }
    }

    public boolean a(int i10) {
        TriggeredLinksMetadata a10 = a();
        return a10 != null && (a10.b() & i10) == i10;
    }

    public void a(long j10) {
        if (j10 > 0) {
            this.f17597e.postDelayed(this.f17602j, j10);
        } else {
            this.f17597e.post(this.f17602j);
        }
    }

    public void a(String str, int i10) {
        e.a a10 = this.f17594b.edit();
        long currentTimeMillis = (((long) i10) * 1000) + System.currentTimeMillis();
        a10.a(str, Long.valueOf(currentTimeMillis));
        a10.f17013a.putLong(str, currentTimeMillis);
        a10.apply();
    }

    public void a(TriggeredLinksMetadata triggeredLinksMetadata, Map<String, String> map, String str) {
        this.f17595c.execute(new b(triggeredLinksMetadata, map, str));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.net.URLConnection] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012c A[Catch:{ all -> 0x0131 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) throws java.io.IOException, org.json.JSONException {
        /*
            r11 = this;
            android.net.Uri r15 = android.net.Uri.parse(r15)
            android.net.Uri$Builder r0 = r15.buildUpon()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 2
            r3 = 1
            r4 = 11
            r5 = 0
            r6 = 0
            if (r1 < r4) goto L_0x008f
            r0.query(r6)
            java.util.Set r1 = r15.getQueryParameterNames()
            java.util.Iterator r1 = r1.iterator()
        L_0x001d:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x008f
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x002c
            goto L_0x001d
        L_0x002c:
            java.lang.String r8 = r15.getQueryParameter(r7)
            if (r8 != 0) goto L_0x0033
            goto L_0x001d
        L_0x0033:
            r9 = -1
            int r10 = r8.hashCode()
            switch(r10) {
                case -1089147532: goto L_0x0052;
                case 613582261: goto L_0x0047;
                case 1311708630: goto L_0x003c;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x005c
        L_0x003c:
            java.lang.String r10 = "startapp_advertising_id"
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto L_0x0045
            goto L_0x005c
        L_0x0045:
            r9 = 2
            goto L_0x005c
        L_0x0047:
            java.lang.String r10 = "startapp_no_tracking"
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto L_0x0050
            goto L_0x005c
        L_0x0050:
            r9 = 1
            goto L_0x005c
        L_0x0052:
            java.lang.String r10 = "startapp_package_id"
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r9 = 0
        L_0x005c:
            java.lang.String r10 = "0"
            switch(r9) {
                case 0: goto L_0x0089;
                case 1: goto L_0x0079;
                case 2: goto L_0x0065;
                default: goto L_0x0061;
            }
        L_0x0061:
            r0.appendQueryParameter(r7, r8)
            goto L_0x001d
        L_0x0065:
            com.startapp.sdk.common.advertisingid.AdvertisingIdResolver r8 = r11.f17599g
            com.startapp.u r8 = r8.a()
            java.lang.String r8 = r8.f17341a
            boolean r9 = r8.equals(r10)
            if (r9 == 0) goto L_0x0075
            java.lang.String r8 = "00000000-0000-0000-0000-000000000000"
        L_0x0075:
            r0.appendQueryParameter(r7, r8)
            goto L_0x001d
        L_0x0079:
            com.startapp.sdk.common.advertisingid.AdvertisingIdResolver r8 = r11.f17599g
            com.startapp.u r8 = r8.a()
            boolean r8 = r8.f17343c
            if (r8 == 0) goto L_0x0085
            java.lang.String r10 = "1"
        L_0x0085:
            r0.appendQueryParameter(r7, r10)
            goto L_0x001d
        L_0x0089:
            java.lang.String r8 = r11.f17593a
            r0.appendQueryParameter(r7, r8)
            goto L_0x001d
        L_0x008f:
            android.net.Uri r15 = r0.build()
            java.lang.String r15 = r15.toString()
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x0123 }
            r0.<init>(r15)     // Catch:{ all -> 0x0123 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ all -> 0x0123 }
            boolean r1 = r0 instanceof java.net.HttpURLConnection     // Catch:{ all -> 0x011f }
            if (r1 == 0) goto L_0x00e3
            r1 = r0
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x011f }
            r1.setInstanceFollowRedirects(r3)     // Catch:{ all -> 0x011f }
            int r3 = r12.c()     // Catch:{ all -> 0x011f }
            int r3 = r3 * 1000
            r1.setReadTimeout(r3)     // Catch:{ all -> 0x011f }
            int r3 = r12.c()     // Catch:{ all -> 0x011f }
            int r3 = r3 * 1000
            r1.setConnectTimeout(r3)     // Catch:{ all -> 0x011f }
            com.startapp.i2<java.lang.String> r3 = r11.f17600h     // Catch:{ all -> 0x011f }
            java.lang.Object r3 = r3.a()     // Catch:{ all -> 0x011f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x011f }
            if (r3 == 0) goto L_0x00d1
            int r5 = r3.length()     // Catch:{ all -> 0x011f }
            if (r5 <= 0) goto L_0x00d1
            java.lang.String r5 = "User-Agent"
            r1.setRequestProperty(r5, r3)     // Catch:{ all -> 0x011f }
        L_0x00d1:
            r1.connect()     // Catch:{ all -> 0x011f }
            int r5 = r1.getResponseCode()     // Catch:{ all -> 0x011f }
            java.io.InputStream r6 = r1.getInputStream()     // Catch:{ all -> 0x011f }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x011f }
            if (r1 < r4) goto L_0x00e3
            r11.a((java.lang.String) r13, (java.lang.String) r14, (java.io.InputStream) r6)     // Catch:{ all -> 0x011f }
        L_0x00e3:
            com.startapp.j9.a((java.io.Closeable) r6)
            boolean r1 = r0 instanceof java.net.HttpURLConnection     // Catch:{ all -> 0x00f0 }
            if (r1 == 0) goto L_0x00f1
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ all -> 0x00f0 }
            r0.disconnect()     // Catch:{ all -> 0x00f0 }
            goto L_0x00f1
        L_0x00f0:
        L_0x00f1:
            boolean r12 = r12.f()
            if (r12 == 0) goto L_0x011e
            int r5 = r5 / 100
            if (r5 != r2) goto L_0x011e
            com.startapp.i3 r12 = new com.startapp.i3
            com.startapp.j3 r0 = com.startapp.j3.f15961n
            r12.<init>((com.startapp.j3) r0)
            r12.f15914d = r14
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.String r0 = "eventType"
            org.json.JSONObject r13 = r14.put(r0, r13)
            java.lang.String r14 = "url"
            org.json.JSONObject r13 = r13.put(r14, r15)
            java.lang.String r13 = r13.toString()
            r12.f15915e = r13
            r12.a()
        L_0x011e:
            return
        L_0x011f:
            r12 = move-exception
            r13 = r6
            r6 = r0
            goto L_0x0125
        L_0x0123:
            r12 = move-exception
            r13 = r6
        L_0x0125:
            com.startapp.j9.a((java.io.Closeable) r13)
            boolean r13 = r6 instanceof java.net.HttpURLConnection     // Catch:{ all -> 0x0131 }
            if (r13 == 0) goto L_0x0131
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ all -> 0x0131 }
            r6.disconnect()     // Catch:{ all -> 0x0131 }
        L_0x0131:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.z8.a(com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        if (r2.longValue() > android.os.SystemClock.elapsedRealtime()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata r9, java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11) {
        /*
            r8 = this;
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0008:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r1 == 0) goto L_0x0094
            int r2 = r1.length()
            r3 = 1
            if (r2 >= r3) goto L_0x002a
            goto L_0x0094
        L_0x002a:
            if (r0 == 0) goto L_0x0094
            int r2 = r0.length()
            if (r2 >= r3) goto L_0x0033
            goto L_0x0094
        L_0x0033:
            java.util.List r2 = r9.d()
            if (r2 != 0) goto L_0x003a
            goto L_0x007f
        L_0x003a:
            java.util.Iterator r2 = r2.iterator()
        L_0x003e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.String r4 = java.lang.String.valueOf(r4)
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x003e
            java.util.Map<java.lang.String, java.lang.Long> r2 = r8.f17598f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = "-"
            r4.append(r5)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            java.lang.Object r2 = r2.get(r4)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x007f
            long r4 = r2.longValue()
            long r6 = android.os.SystemClock.elapsedRealtime()
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r3 = 0
        L_0x0080:
            if (r3 == 0) goto L_0x0083
            return
        L_0x0083:
            r8.a(r9, r11, r1, r0)     // Catch:{ all -> 0x0087 }
            goto L_0x0008
        L_0x0087:
            r0 = move-exception
            r1 = 4
            boolean r1 = r8.a((int) r1)
            if (r1 == 0) goto L_0x0008
            com.startapp.i3.a((java.lang.Throwable) r0)
            goto L_0x0008
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.z8.b(com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata, java.util.Map, java.lang.String):void");
    }

    public final void a(String str, String str2, InputStream inputStream) throws IOException {
        try {
            Object b10 = m4.b(new JsonReader(new InputStreamReader(inputStream)));
            if (b10 instanceof Map) {
                Object obj = ((Map) b10).get("throttleSec");
                if (obj instanceof Number) {
                    int intValue = ((Number) obj).intValue();
                    Map<String, Long> map = this.f17598f;
                    map.put(str2 + "-" + str, Long.valueOf((((long) intValue) * 1000) + SystemClock.elapsedRealtime()));
                }
            }
        } catch (IOException e10) {
            if (!(e10 instanceof MalformedJsonException)) {
                throw e10;
            }
        }
    }
}
