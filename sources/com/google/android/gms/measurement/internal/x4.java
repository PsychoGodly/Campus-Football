package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.q;
import java.net.URL;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class x4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final URL f25231a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f25232b;

    /* renamed from: c  reason: collision with root package name */
    private final t4 f25233c;

    /* renamed from: d  reason: collision with root package name */
    private final String f25234d;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f25235f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ u4 f25236g;

    public x4(u4 u4Var, String str, URL url, byte[] bArr, Map<String, String> map, t4 t4Var) {
        this.f25236g = u4Var;
        q.g(str);
        q.k(url);
        q.k(t4Var);
        this.f25231a = url;
        this.f25232b = bArr;
        this.f25233c = t4Var;
        this.f25234d = str;
        this.f25235f = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ea A[SYNTHETIC, Splitter:B:47:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0125 A[SYNTHETIC, Splitter:B:60:0x0125] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.u4 r1 = r13.f25236g
            r1.g()
            r1 = 0
            r2 = 0
            java.net.URL r3 = r13.f25231a     // Catch:{ IOException -> 0x011e, all -> 0x00e4 }
            com.google.android.gms.internal.measurement.zzcd r4 = com.google.android.gms.internal.measurement.zzcd.zza()     // Catch:{ IOException -> 0x011e, all -> 0x00e4 }
            java.lang.String r5 = "client-measurement"
            java.net.URLConnection r3 = r4.zza(r3, r5)     // Catch:{ IOException -> 0x011e, all -> 0x00e4 }
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x011e, all -> 0x00e4 }
            if (r4 == 0) goto L_0x00dc
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x011e, all -> 0x00e4 }
            r3.setDefaultUseCaches(r1)     // Catch:{ IOException -> 0x011e, all -> 0x00e4 }
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch:{ IOException -> 0x011e, all -> 0x00e4 }
            r4 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r4)     // Catch:{ IOException -> 0x011e, all -> 0x00e4 }
            r3.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x011e, all -> 0x00e4 }
            r4 = 1
            r3.setDoInput(r4)     // Catch:{ IOException -> 0x011e, all -> 0x00e4 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r13.f25235f     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            if (r5 == 0) goto L_0x0059
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
        L_0x003d:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            if (r6 == 0) goto L_0x0059
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            r3.addRequestProperty(r7, r6)     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            goto L_0x003d
        L_0x0059:
            byte[] r5 = r13.f25232b     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            if (r5 == 0) goto L_0x00a4
            com.google.android.gms.measurement.internal.u4 r5 = r13.f25236g     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            com.google.android.gms.measurement.internal.db r5 = r5.j()     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            byte[] r6 = r13.f25232b     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            byte[] r5 = r5.b0(r6)     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            com.google.android.gms.measurement.internal.u4 r6 = r13.f25236g     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            com.google.android.gms.measurement.internal.n4 r6 = r6.zzj()     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            com.google.android.gms.measurement.internal.p4 r6 = r6.F()     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            java.lang.String r7 = "Uploading data. size"
            int r8 = r5.length     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            r6.b(r7, r8)     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            r3.setDoOutput(r4)     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r3.addRequestProperty(r4, r6)     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            int r4 = r5.length     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            r3.setFixedLengthStreamingMode(r4)     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            r3.connect()     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            java.io.OutputStream r4 = r3.getOutputStream()     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            r4.write(r5)     // Catch:{ IOException -> 0x009e, all -> 0x0099 }
            r4.close()     // Catch:{ IOException -> 0x009e, all -> 0x0099 }
            goto L_0x00a4
        L_0x0099:
            r5 = move-exception
            r11 = r2
            r2 = r4
            r4 = r5
            goto L_0x00e7
        L_0x009e:
            r5 = move-exception
            r11 = r2
            r2 = r4
            r9 = r5
            goto L_0x0122
        L_0x00a4:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00d9, all -> 0x00d6 }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00d2, all -> 0x00cf }
            com.google.android.gms.measurement.internal.u4 r1 = r13.f25236g     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            byte[] r10 = com.google.android.gms.measurement.internal.u4.u(r3)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r3.disconnect()
            com.google.android.gms.measurement.internal.u4 r0 = r13.f25236g
            com.google.android.gms.measurement.internal.q5 r0 = r0.zzl()
            com.google.android.gms.measurement.internal.v4 r1 = new com.google.android.gms.measurement.internal.v4
            java.lang.String r6 = r13.f25234d
            com.google.android.gms.measurement.internal.t4 r7 = r13.f25233c
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.y(r1)
            return
        L_0x00cb:
            r4 = move-exception
            goto L_0x00e8
        L_0x00cd:
            r4 = move-exception
            goto L_0x00d4
        L_0x00cf:
            r4 = move-exception
            r11 = r2
            goto L_0x00e8
        L_0x00d2:
            r4 = move-exception
            r11 = r2
        L_0x00d4:
            r9 = r4
            goto L_0x0123
        L_0x00d6:
            r4 = move-exception
            r11 = r2
            goto L_0x00e7
        L_0x00d9:
            r4 = move-exception
            r11 = r2
            goto L_0x0121
        L_0x00dc:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x011e, all -> 0x00e4 }
            java.lang.String r4 = "Failed to obtain HTTP connection"
            r3.<init>(r4)     // Catch:{ IOException -> 0x011e, all -> 0x00e4 }
            throw r3     // Catch:{ IOException -> 0x011e, all -> 0x00e4 }
        L_0x00e4:
            r4 = move-exception
            r3 = r2
            r11 = r3
        L_0x00e7:
            r8 = 0
        L_0x00e8:
            if (r2 == 0) goto L_0x0102
            r2.close()     // Catch:{ IOException -> 0x00ee }
            goto L_0x0102
        L_0x00ee:
            r1 = move-exception
            com.google.android.gms.measurement.internal.u4 r2 = r13.f25236g
            com.google.android.gms.measurement.internal.n4 r2 = r2.zzj()
            com.google.android.gms.measurement.internal.p4 r2 = r2.B()
            java.lang.String r5 = r13.f25234d
            java.lang.Object r5 = com.google.android.gms.measurement.internal.n4.q(r5)
            r2.c(r0, r5, r1)
        L_0x0102:
            if (r3 == 0) goto L_0x0107
            r3.disconnect()
        L_0x0107:
            com.google.android.gms.measurement.internal.u4 r0 = r13.f25236g
            com.google.android.gms.measurement.internal.q5 r0 = r0.zzl()
            com.google.android.gms.measurement.internal.v4 r1 = new com.google.android.gms.measurement.internal.v4
            java.lang.String r6 = r13.f25234d
            com.google.android.gms.measurement.internal.t4 r7 = r13.f25233c
            r9 = 0
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.y(r1)
            throw r4
        L_0x011e:
            r4 = move-exception
            r3 = r2
            r11 = r3
        L_0x0121:
            r9 = r4
        L_0x0122:
            r8 = 0
        L_0x0123:
            if (r2 == 0) goto L_0x013d
            r2.close()     // Catch:{ IOException -> 0x0129 }
            goto L_0x013d
        L_0x0129:
            r1 = move-exception
            com.google.android.gms.measurement.internal.u4 r2 = r13.f25236g
            com.google.android.gms.measurement.internal.n4 r2 = r2.zzj()
            com.google.android.gms.measurement.internal.p4 r2 = r2.B()
            java.lang.String r4 = r13.f25234d
            java.lang.Object r4 = com.google.android.gms.measurement.internal.n4.q(r4)
            r2.c(r0, r4, r1)
        L_0x013d:
            if (r3 == 0) goto L_0x0142
            r3.disconnect()
        L_0x0142:
            com.google.android.gms.measurement.internal.u4 r0 = r13.f25236g
            com.google.android.gms.measurement.internal.q5 r0 = r0.zzl()
            com.google.android.gms.measurement.internal.v4 r1 = new com.google.android.gms.measurement.internal.v4
            java.lang.String r6 = r13.f25234d
            com.google.android.gms.measurement.internal.t4 r7 = r13.f25233c
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.y(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x4.run():void");
    }
}
