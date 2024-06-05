package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdyd implements zzfcd {
    protected final Context zza;
    protected final String zzb;
    protected final zzbtz zzc;

    public zzdyd(Context context, String str, zzbtz zzbtz, int i10, byte[] bArr) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbtz;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r2 = new java.io.InputStreamReader(r7.getInputStream());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        com.google.android.gms.ads.internal.t.r();
        r0 = com.google.android.gms.ads.internal.util.b2.j(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        m5.k.a(r2);
        r4.zzg(r0);
        r5.zzc = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0144, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0156, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.a0.c().zzb(com.google.android.gms.internal.ads.zzbar.zzeZ)).booleanValue() == false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015f, code lost:
        throw new com.google.android.gms.internal.ads.zzdtf(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0160, code lost:
        r5.zzd = com.google.android.gms.ads.internal.t.b().b() - r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0170, code lost:
        r0 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0226 A[Catch:{ all -> 0x0227 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0218 A[Catch:{ all -> 0x0227 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:103:0x0228=Splitter:B:103:0x0228, B:59:0x016b=Splitter:B:59:0x016b} */
    /* renamed from: zzb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzdyc zza(com.google.android.gms.internal.ads.zzdyb r20) throws com.google.android.gms.internal.ads.zzdtf {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            java.lang.String r2 = "Received error HTTP response code: "
            java.lang.String r3 = r0.zza
            int r11 = r0.zzb
            java.util.Map r12 = r0.zzc
            byte[] r13 = r0.zzd
            java.lang.String r0 = r0.zze
            m5.e r4 = com.google.android.gms.ads.internal.t.b()
            long r14 = r4.b()
            r10 = 1
            com.google.android.gms.internal.ads.zzdyc r9 = new com.google.android.gms.internal.ads.zzdyc     // Catch:{ IOException -> 0x022e }
            r9.<init>()     // Catch:{ IOException -> 0x022e }
            java.lang.String r4 = r1.zzb     // Catch:{ IOException -> 0x022e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x022e }
            r5.<init>()     // Catch:{ IOException -> 0x022e }
            java.lang.String r6 = "SDK version: "
            r5.append(r6)     // Catch:{ IOException -> 0x022e }
            r5.append(r4)     // Catch:{ IOException -> 0x022e }
            java.lang.String r4 = r5.toString()     // Catch:{ IOException -> 0x022e }
            com.google.android.gms.internal.ads.zzbza.zzi(r4)     // Catch:{ IOException -> 0x022e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x022e }
            r4.<init>()     // Catch:{ IOException -> 0x022e }
            java.lang.String r5 = "AdRequestServiceImpl: Sending request: "
            r4.append(r5)     // Catch:{ IOException -> 0x022e }
            r4.append(r3)     // Catch:{ IOException -> 0x022e }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x022e }
            com.google.android.gms.internal.ads.zzbza.zze(r4)     // Catch:{ IOException -> 0x022e }
            java.net.URL r4 = new java.net.URL     // Catch:{ IOException -> 0x022e }
            r4.<init>(r3)     // Catch:{ IOException -> 0x022e }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x022e }
            r3.<init>()     // Catch:{ IOException -> 0x022e }
            r5 = 0
            r16 = 0
        L_0x0055:
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ IOException -> 0x022e }
            r8 = r4
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ IOException -> 0x022e }
            com.google.android.gms.ads.internal.util.b2 r4 = com.google.android.gms.ads.internal.t.r()     // Catch:{ zzdtf -> 0x0202, all -> 0x01fe }
            android.content.Context r5 = r1.zza     // Catch:{ zzdtf -> 0x0202, all -> 0x01fe }
            java.lang.String r6 = r1.zzb     // Catch:{ zzdtf -> 0x0202, all -> 0x01fe }
            r7 = 0
            r17 = 0
            r20 = r8
            r18 = r9
            r9 = r17
            r1 = 1
            r10 = r11
            r4.D(r5, r6, r7, r8, r9, r10)     // Catch:{ zzdtf -> 0x01f8, all -> 0x01f4 }
            java.util.Set r4 = r12.entrySet()     // Catch:{ zzdtf -> 0x01f8, all -> 0x01f4 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ zzdtf -> 0x01f8, all -> 0x01f4 }
        L_0x007a:
            boolean r5 = r4.hasNext()     // Catch:{ zzdtf -> 0x01f8, all -> 0x01f4 }
            if (r5 == 0) goto L_0x009a
            java.lang.Object r5 = r4.next()     // Catch:{ zzdtf -> 0x01f8, all -> 0x01f4 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ zzdtf -> 0x01f8, all -> 0x01f4 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ zzdtf -> 0x01f8, all -> 0x01f4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ zzdtf -> 0x01f8, all -> 0x01f4 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ zzdtf -> 0x01f8, all -> 0x01f4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ zzdtf -> 0x01f8, all -> 0x01f4 }
            r7 = r20
            r7.addRequestProperty(r6, r5)     // Catch:{ zzdtf -> 0x01f2 }
            r20 = r7
            goto L_0x007a
        L_0x009a:
            r7 = r20
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ zzdtf -> 0x01f2 }
            if (r4 != 0) goto L_0x00a7
            java.lang.String r4 = "Content-Type"
            r7.setRequestProperty(r4, r0)     // Catch:{ zzdtf -> 0x01f2 }
        L_0x00a7:
            int r4 = r13.length     // Catch:{ zzdtf -> 0x01f2 }
            r5 = 0
            if (r4 <= 0) goto L_0x00c9
            r7.setDoOutput(r1)     // Catch:{ zzdtf -> 0x01f2 }
            r7.setFixedLengthStreamingMode(r4)     // Catch:{ zzdtf -> 0x01f2 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00c4 }
            java.io.OutputStream r6 = r7.getOutputStream()     // Catch:{ all -> 0x00c4 }
            r4.<init>(r6)     // Catch:{ all -> 0x00c4 }
            r4.write(r13)     // Catch:{ all -> 0x00c1 }
            m5.k.a(r4)     // Catch:{ zzdtf -> 0x01f2 }
            goto L_0x00c9
        L_0x00c1:
            r0 = move-exception
            r5 = r4
            goto L_0x00c5
        L_0x00c4:
            r0 = move-exception
        L_0x00c5:
            m5.k.a(r5)     // Catch:{ zzdtf -> 0x01f2 }
            throw r0     // Catch:{ zzdtf -> 0x01f2 }
        L_0x00c9:
            com.google.android.gms.internal.ads.zzbyz r4 = new com.google.android.gms.internal.ads.zzbyz     // Catch:{ zzdtf -> 0x01f2 }
            r4.<init>(r5)     // Catch:{ zzdtf -> 0x01f2 }
            r4.zzc(r7, r13)     // Catch:{ zzdtf -> 0x01f2 }
            int r6 = r7.getResponseCode()     // Catch:{ zzdtf -> 0x01f2 }
            java.util.Map r8 = r7.getHeaderFields()     // Catch:{ zzdtf -> 0x01f2 }
            java.util.Set r8 = r8.entrySet()     // Catch:{ zzdtf -> 0x01f2 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ zzdtf -> 0x01f2 }
        L_0x00e1:
            boolean r9 = r8.hasNext()     // Catch:{ zzdtf -> 0x01f2 }
            if (r9 == 0) goto L_0x0113
            java.lang.Object r9 = r8.next()     // Catch:{ zzdtf -> 0x01f2 }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ zzdtf -> 0x01f2 }
            java.lang.Object r10 = r9.getKey()     // Catch:{ zzdtf -> 0x01f2 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ zzdtf -> 0x01f2 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ zzdtf -> 0x01f2 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ zzdtf -> 0x01f2 }
            boolean r17 = r3.containsKey(r10)     // Catch:{ zzdtf -> 0x01f2 }
            if (r17 == 0) goto L_0x0109
            java.lang.Object r10 = r3.get(r10)     // Catch:{ zzdtf -> 0x01f2 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ zzdtf -> 0x01f2 }
            r10.addAll(r9)     // Catch:{ zzdtf -> 0x01f2 }
            goto L_0x00e1
        L_0x0109:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ zzdtf -> 0x01f2 }
            r5.<init>(r9)     // Catch:{ zzdtf -> 0x01f2 }
            r3.put(r10, r5)     // Catch:{ zzdtf -> 0x01f2 }
            r5 = 0
            goto L_0x00e1
        L_0x0113:
            r4.zze(r7, r6)     // Catch:{ zzdtf -> 0x01f2 }
            r5 = r18
            r5.zza = r6     // Catch:{ zzdtf -> 0x01f0 }
            r5.zzb = r3     // Catch:{ zzdtf -> 0x01f0 }
            java.lang.String r8 = ""
            r5.zzc = r8     // Catch:{ zzdtf -> 0x01f0 }
            r8 = 200(0xc8, float:2.8E-43)
            r9 = 300(0x12c, float:4.2E-43)
            if (r6 < r8) goto L_0x0178
            if (r6 >= r9) goto L_0x0178
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0172 }
            java.io.InputStream r0 = r7.getInputStream()     // Catch:{ all -> 0x0172 }
            r2.<init>(r0)     // Catch:{ all -> 0x0172 }
            com.google.android.gms.ads.internal.t.r()     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = com.google.android.gms.ads.internal.util.b2.j(r2)     // Catch:{ all -> 0x0170 }
            m5.k.a(r2)     // Catch:{ zzdtf -> 0x01f0 }
            r4.zzg(r0)     // Catch:{ zzdtf -> 0x01f0 }
            r5.zzc = r0     // Catch:{ zzdtf -> 0x01f0 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ zzdtf -> 0x01f0 }
            if (r0 == 0) goto L_0x0160
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzeZ     // Catch:{ zzdtf -> 0x01f0 }
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ zzdtf -> 0x01f0 }
            java.lang.Object r0 = r2.zzb(r0)     // Catch:{ zzdtf -> 0x01f0 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ zzdtf -> 0x01f0 }
            boolean r0 = r0.booleanValue()     // Catch:{ zzdtf -> 0x01f0 }
            if (r0 == 0) goto L_0x0159
            goto L_0x0160
        L_0x0159:
            com.google.android.gms.internal.ads.zzdtf r0 = new com.google.android.gms.internal.ads.zzdtf     // Catch:{ zzdtf -> 0x01f0 }
            r2 = 3
            r0.<init>(r2)     // Catch:{ zzdtf -> 0x01f0 }
            throw r0     // Catch:{ zzdtf -> 0x01f0 }
        L_0x0160:
            m5.e r0 = com.google.android.gms.ads.internal.t.b()     // Catch:{ zzdtf -> 0x01f0 }
            long r2 = r0.b()     // Catch:{ zzdtf -> 0x01f0 }
            long r2 = r2 - r14
            r5.zzd = r2     // Catch:{ zzdtf -> 0x01f0 }
        L_0x016b:
            r7.disconnect()     // Catch:{ IOException -> 0x022c }
            goto L_0x0225
        L_0x0170:
            r0 = move-exception
            goto L_0x0174
        L_0x0172:
            r0 = move-exception
            r2 = 0
        L_0x0174:
            m5.k.a(r2)     // Catch:{ zzdtf -> 0x01f0 }
            throw r0     // Catch:{ zzdtf -> 0x01f0 }
        L_0x0178:
            if (r6 < r9) goto L_0x01c9
            r4 = 400(0x190, float:5.6E-43)
            if (r6 >= r4) goto L_0x01c9
            java.lang.String r4 = "Location"
            java.lang.String r4 = r7.getHeaderField(r4)     // Catch:{ zzdtf -> 0x01f0 }
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ zzdtf -> 0x01f0 }
            if (r6 != 0) goto L_0x01bc
            java.net.URL r6 = new java.net.URL     // Catch:{ zzdtf -> 0x01f0 }
            r6.<init>(r4)     // Catch:{ zzdtf -> 0x01f0 }
            int r4 = r16 + 1
            com.google.android.gms.internal.ads.zzbaj r8 = com.google.android.gms.internal.ads.zzbar.zzeB     // Catch:{ zzdtf -> 0x01f0 }
            com.google.android.gms.internal.ads.zzbap r9 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ zzdtf -> 0x01f0 }
            java.lang.Object r8 = r9.zzb(r8)     // Catch:{ zzdtf -> 0x01f0 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ zzdtf -> 0x01f0 }
            int r8 = r8.intValue()     // Catch:{ zzdtf -> 0x01f0 }
            if (r4 > r8) goto L_0x01af
            r7.disconnect()     // Catch:{ IOException -> 0x022c }
            r1 = r19
            r16 = r4
            r9 = r5
            r4 = r6
            r10 = 1
            goto L_0x0055
        L_0x01af:
            java.lang.String r0 = "Too many redirects."
            com.google.android.gms.internal.ads.zzbza.zzj(r0)     // Catch:{ zzdtf -> 0x01f0 }
            com.google.android.gms.internal.ads.zzdtf r0 = new com.google.android.gms.internal.ads.zzdtf     // Catch:{ zzdtf -> 0x01f0 }
            java.lang.String r2 = "Too many redirects"
            r0.<init>(r1, r2)     // Catch:{ zzdtf -> 0x01f0 }
            throw r0     // Catch:{ zzdtf -> 0x01f0 }
        L_0x01bc:
            java.lang.String r0 = "No location header to follow redirect."
            com.google.android.gms.internal.ads.zzbza.zzj(r0)     // Catch:{ zzdtf -> 0x01f0 }
            com.google.android.gms.internal.ads.zzdtf r0 = new com.google.android.gms.internal.ads.zzdtf     // Catch:{ zzdtf -> 0x01f0 }
            java.lang.String r2 = "No location header to follow redirect"
            r0.<init>(r1, r2)     // Catch:{ zzdtf -> 0x01f0 }
            throw r0     // Catch:{ zzdtf -> 0x01f0 }
        L_0x01c9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ zzdtf -> 0x01f0 }
            r0.<init>()     // Catch:{ zzdtf -> 0x01f0 }
            r0.append(r2)     // Catch:{ zzdtf -> 0x01f0 }
            r0.append(r6)     // Catch:{ zzdtf -> 0x01f0 }
            java.lang.String r0 = r0.toString()     // Catch:{ zzdtf -> 0x01f0 }
            com.google.android.gms.internal.ads.zzbza.zzj(r0)     // Catch:{ zzdtf -> 0x01f0 }
            com.google.android.gms.internal.ads.zzdtf r0 = new com.google.android.gms.internal.ads.zzdtf     // Catch:{ zzdtf -> 0x01f0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ zzdtf -> 0x01f0 }
            r3.<init>()     // Catch:{ zzdtf -> 0x01f0 }
            r3.append(r2)     // Catch:{ zzdtf -> 0x01f0 }
            r3.append(r6)     // Catch:{ zzdtf -> 0x01f0 }
            java.lang.String r2 = r3.toString()     // Catch:{ zzdtf -> 0x01f0 }
            r0.<init>(r1, r2)     // Catch:{ zzdtf -> 0x01f0 }
            throw r0     // Catch:{ zzdtf -> 0x01f0 }
        L_0x01f0:
            r0 = move-exception
            goto L_0x0206
        L_0x01f2:
            r0 = move-exception
            goto L_0x01fb
        L_0x01f4:
            r0 = move-exception
            r7 = r20
            goto L_0x0228
        L_0x01f8:
            r0 = move-exception
            r7 = r20
        L_0x01fb:
            r5 = r18
            goto L_0x0206
        L_0x01fe:
            r0 = move-exception
            r7 = r8
            r1 = 1
            goto L_0x0228
        L_0x0202:
            r0 = move-exception
            r7 = r8
            r5 = r9
            r1 = 1
        L_0x0206:
            com.google.android.gms.internal.ads.zzbaj r2 = com.google.android.gms.internal.ads.zzbar.zzhG     // Catch:{ all -> 0x0227 }
            com.google.android.gms.internal.ads.zzbap r3 = com.google.android.gms.ads.internal.client.a0.c()     // Catch:{ all -> 0x0227 }
            java.lang.Object r2 = r3.zzb(r2)     // Catch:{ all -> 0x0227 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0227 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0227 }
            if (r2 == 0) goto L_0x0226
            m5.e r0 = com.google.android.gms.ads.internal.t.b()     // Catch:{ all -> 0x0227 }
            long r2 = r0.b()     // Catch:{ all -> 0x0227 }
            long r2 = r2 - r14
            r5.zzd = r2     // Catch:{ all -> 0x0227 }
            goto L_0x016b
        L_0x0225:
            return r5
        L_0x0226:
            throw r0     // Catch:{ all -> 0x0227 }
        L_0x0227:
            r0 = move-exception
        L_0x0228:
            r7.disconnect()     // Catch:{ IOException -> 0x022c }
            throw r0     // Catch:{ IOException -> 0x022c }
        L_0x022c:
            r0 = move-exception
            goto L_0x0230
        L_0x022e:
            r0 = move-exception
            r1 = 1
        L_0x0230:
            java.lang.String r2 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Error while connecting to ad server: "
            java.lang.String r2 = r3.concat(r2)
            com.google.android.gms.internal.ads.zzbza.zzj(r2)
            com.google.android.gms.internal.ads.zzdtf r3 = new com.google.android.gms.internal.ads.zzdtf
            r3.<init>(r1, r2, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyd.zza(com.google.android.gms.internal.ads.zzdyb):com.google.android.gms.internal.ads.zzdyc");
    }
}
