package com.startapp;

import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Sta */
public class a3 {

    /* renamed from: a  reason: collision with root package name */
    public final AdvertisingIdResolver f15601a;

    /* renamed from: b  reason: collision with root package name */
    public final i2<String> f15602b;

    /* renamed from: c  reason: collision with root package name */
    public final y4 f15603c;

    /* renamed from: d  reason: collision with root package name */
    public final v5 f15604d;

    /* renamed from: e  reason: collision with root package name */
    public final i2<b3> f15605e;

    public a3(AdvertisingIdResolver advertisingIdResolver, i2<String> i2Var, y4 y4Var, v5 v5Var, i2<b3> i2Var2) {
        this.f15601a = advertisingIdResolver;
        this.f15602b = i2Var;
        this.f15603c = y4Var;
        this.f15604d = v5Var;
        this.f15605e = i2Var2;
    }

    public final boolean a(int i10) {
        return b().f15642c.a((long) i10);
    }

    public final b3 b() {
        b3 a10 = this.f15605e.a();
        return a10 != null ? a10 : b3.f15639d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.startapp.z5.a a(java.lang.String r11, com.startapp.w0 r12, com.startapp.g2<java.lang.Throwable, java.lang.Void> r13) {
        /*
            r10 = this;
            java.lang.String r0 = "GET"
            r1 = 0
            if (r12 == 0) goto L_0x0026
            java.util.Map r2 = r10.a()
            com.startapp.r5 r3 = new com.startapp.r5     // Catch:{ SDKException -> 0x001a }
            r3.<init>()     // Catch:{ SDKException -> 0x001a }
            r12.a((com.startapp.r6) r3)     // Catch:{ SDKException -> 0x001a }
            java.lang.String r12 = r3.toString()     // Catch:{ SDKException -> 0x001a }
            java.lang.String r11 = a(r11, r12)     // Catch:{ SDKException -> 0x001a }
            goto L_0x0027
        L_0x001a:
            r11 = move-exception
            r12 = 2
            boolean r12 = r10.a(r12)
            if (r12 == 0) goto L_0x0025
            com.startapp.i3.a((java.lang.Throwable) r11)
        L_0x0025:
            return r1
        L_0x0026:
            r2 = r1
        L_0x0027:
            com.startapp.i2<java.lang.String> r12 = r10.f15602b
            java.lang.Object r12 = r12.a()
            java.lang.String r12 = (java.lang.String) r12
            com.startapp.b3 r3 = r10.b()
            boolean r3 = r3.f15640a
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = com.startapp.j9.a()
            com.startapp.v5 r8 = r10.f15604d
            if (r8 == 0) goto L_0x0047
            com.startapp.y5 r9 = new com.startapp.y5
            r9.<init>(r8)
            goto L_0x0048
        L_0x0047:
            r9 = r1
        L_0x0048:
            com.startapp.z5$a r12 = com.startapp.z5.a(r11, r2, r12, r3)     // Catch:{ SDKException -> 0x005c }
            if (r9 == 0) goto L_0x0051
            r9.a(r0, r11, r1)     // Catch:{ SDKException -> 0x005c }
        L_0x0051:
            r12.f17589e = r4     // Catch:{ SDKException -> 0x005c }
            r12.f17590f = r6     // Catch:{ SDKException -> 0x005c }
            long r2 = com.startapp.j9.a()     // Catch:{ SDKException -> 0x005c }
            r12.f17591g = r2     // Catch:{ SDKException -> 0x005c }
            return r12
        L_0x005c:
            r12 = move-exception
            if (r9 == 0) goto L_0x0062
            r9.a(r0, r11, r12)
        L_0x0062:
            if (r13 == 0) goto L_0x0074
            r13.a(r12)     // Catch:{ all -> 0x0068 }
            goto L_0x0074
        L_0x0068:
            r11 = move-exception
            r12 = 32
            boolean r12 = r10.a(r12)
            if (r12 == 0) goto L_0x0074
            com.startapp.i3.a((java.lang.Throwable) r11)
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.a3.a(java.lang.String, com.startapp.w0, com.startapp.g2):com.startapp.z5$a");
    }

    public static String a(String str, String str2) {
        if (!str.contains("?") || !str2.startsWith("?")) {
            return str + str2;
        }
        return str + "&" + str2.substring(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009b, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r7, com.startapp.w0 r8, byte[] r9, boolean r10, com.startapp.g2<java.lang.Throwable, java.lang.Void> r11) {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r1 = 0
            if (r9 == 0) goto L_0x0007
            r8 = r1
            goto L_0x0061
        L_0x0007:
            if (r8 == 0) goto L_0x005f
            java.util.Map r9 = r6.a()
            com.startapp.l4 r2 = new com.startapp.l4     // Catch:{ SDKException -> 0x0052 }
            r2.<init>()     // Catch:{ SDKException -> 0x0052 }
            r8.a((com.startapp.r6) r2)     // Catch:{ SDKException -> 0x0052 }
            org.json.JSONObject r8 = r2.f16093a
            java.lang.String r8 = r8.toString()
            byte[] r8 = r8.getBytes()
            com.startapp.b3 r2 = r6.b()
            boolean r2 = r2.f15640a
            if (r2 == 0) goto L_0x004e
            java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.j9.f15982a     // Catch:{ IOException -> 0x0042 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0042 }
            r2.<init>()     // Catch:{ IOException -> 0x0042 }
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0042 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0042 }
            r3.write(r8)     // Catch:{ IOException -> 0x0042 }
            r3.flush()     // Catch:{ IOException -> 0x0042 }
            r3.close()     // Catch:{ IOException -> 0x0042 }
            byte[] r8 = r2.toByteArray()     // Catch:{ IOException -> 0x0042 }
            r10 = 1
            goto L_0x004e
        L_0x0042:
            r2 = move-exception
            r3 = 16
            boolean r3 = r6.a(r3)
            if (r3 == 0) goto L_0x004e
            com.startapp.i3.a((java.lang.Throwable) r2)
        L_0x004e:
            r5 = r9
            r9 = r8
            r8 = r5
            goto L_0x0061
        L_0x0052:
            r7 = move-exception
            r8 = 8
            boolean r8 = r6.a(r8)
            if (r8 == 0) goto L_0x005e
            com.startapp.i3.a((java.lang.Throwable) r7)
        L_0x005e:
            return r1
        L_0x005f:
            r8 = r1
            r9 = r8
        L_0x0061:
            com.startapp.i2<java.lang.String> r2 = r6.f15602b
            java.lang.Object r2 = r2.a()
            java.lang.String r2 = (java.lang.String) r2
            com.startapp.v5 r3 = r6.f15604d
            if (r3 == 0) goto L_0x0073
            com.startapp.y5 r4 = new com.startapp.y5
            r4.<init>(r3)
            goto L_0x0074
        L_0x0073:
            r4 = r1
        L_0x0074:
            java.lang.String r8 = com.startapp.z5.a(r7, r9, r8, r2, r10)     // Catch:{ SDKException -> 0x0083 }
            if (r4 == 0) goto L_0x007d
            r4.a(r0, r7, r1)     // Catch:{ SDKException -> 0x0083 }
        L_0x007d:
            if (r8 == 0) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            java.lang.String r8 = ""
        L_0x0082:
            return r8
        L_0x0083:
            r8 = move-exception
            if (r4 == 0) goto L_0x0089
            r4.a(r0, r7, r8)
        L_0x0089:
            if (r11 == 0) goto L_0x009b
            r11.a(r8)     // Catch:{ all -> 0x008f }
            goto L_0x009b
        L_0x008f:
            r7 = move-exception
            r8 = 32
            boolean r8 = r6.a(r8)
            if (r8 == 0) goto L_0x009b
            com.startapp.i3.a((java.lang.Throwable) r7)
        L_0x009b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.a3.a(java.lang.String, com.startapp.w0, byte[], boolean, com.startapp.g2):java.lang.String");
    }

    public final Map<String, String> a() {
        HashMap hashMap = new HashMap();
        if (!b().f15641b) {
            String str = null;
            try {
                str = URLEncoder.encode(this.f15601a.a().f17341a, "UTF-8");
            } catch (Throwable th) {
                if (a(64)) {
                    i3.a(th);
                }
            }
            hashMap.put("device-id", str);
        }
        hashMap.put("Accept-Language", ((x4) this.f15603c.b()).f17533c);
        return hashMap;
    }
}
