package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaur {
    private final zzaug zza;
    private final int zzb;
    private String zzc;
    private final int zzd;

    public zzaur(int i10, int i11, int i12) {
        this.zzb = i10;
        i11 = (i11 > 64 || i11 < 0) ? 64 : i11;
        if (i12 <= 0) {
            this.zzd = 1;
        } else {
            this.zzd = i12;
        }
        this.zza = new zzaup(i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d7, code lost:
        r2.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e0, code lost:
        if (r2.size() >= r1.zzb) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zza(java.util.ArrayList r17, java.util.ArrayList r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            com.google.android.gms.internal.ads.zzauq r2 = new com.google.android.gms.internal.ads.zzauq
            r2.<init>(r1)
            java.util.Collections.sort(r0, r2)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4 = 0
        L_0x0012:
            int r5 = r18.size()
            if (r4 >= r5) goto L_0x00f6
            java.lang.Object r5 = r0.get(r4)
            com.google.android.gms.internal.ads.zzauf r5 = (com.google.android.gms.internal.ads.zzauf) r5
            int r5 = r5.zze()
            r6 = r17
            java.lang.Object r5 = r6.get(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.text.Normalizer$Form r7 = java.text.Normalizer.Form.NFKC
            java.lang.String r5 = java.text.Normalizer.normalize(r5, r7)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r7)
            java.lang.String r7 = "\n"
            java.lang.String[] r5 = r5.split(r7)
            int r7 = r5.length
            if (r7 != 0) goto L_0x0041
            goto L_0x00f2
        L_0x0041:
            r7 = 0
        L_0x0042:
            int r8 = r5.length
            if (r7 >= r8) goto L_0x00f2
            r8 = r5[r7]
            java.lang.String r9 = "'"
            boolean r9 = r8.contains(r9)
            r10 = 1
            if (r9 == 0) goto L_0x00a7
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            r11 = 1
            r12 = 0
        L_0x0057:
            int r13 = r11 + 2
            int r14 = r9.length()
            if (r13 > r14) goto L_0x009a
            char r14 = r9.charAt(r11)
            r15 = 39
            if (r14 != r15) goto L_0x0098
            int r12 = r11 + -1
            char r12 = r9.charAt(r12)
            r14 = 32
            if (r12 == r14) goto L_0x0094
            int r12 = r11 + 1
            char r15 = r9.charAt(r12)
            r3 = 115(0x73, float:1.61E-43)
            if (r15 == r3) goto L_0x0083
            char r3 = r9.charAt(r12)
            r12 = 83
            if (r3 != r12) goto L_0x0094
        L_0x0083:
            int r3 = r9.length()
            if (r13 == r3) goto L_0x008f
            char r3 = r9.charAt(r13)
            if (r3 != r14) goto L_0x0094
        L_0x008f:
            r9.insert(r11, r14)
            r11 = r13
            goto L_0x0097
        L_0x0094:
            r9.setCharAt(r11, r14)
        L_0x0097:
            r12 = 1
        L_0x0098:
            int r11 = r11 + r10
            goto L_0x0057
        L_0x009a:
            if (r12 == 0) goto L_0x00a1
            java.lang.String r3 = r9.toString()
            goto L_0x00a2
        L_0x00a1:
            r3 = 0
        L_0x00a2:
            if (r3 == 0) goto L_0x00a7
            r1.zzc = r3
            r8 = r3
        L_0x00a7:
            java.lang.String[] r3 = com.google.android.gms.internal.ads.zzauk.zzb(r8, r10)
            int r8 = r3.length
            int r9 = r1.zzd
            if (r8 >= r9) goto L_0x00b1
            goto L_0x00ee
        L_0x00b1:
            r8 = 0
        L_0x00b2:
            int r9 = r3.length
            if (r8 >= r9) goto L_0x00e5
            java.lang.String r9 = ""
            r10 = 0
        L_0x00b8:
            int r11 = r1.zzd
            if (r10 >= r11) goto L_0x00d7
            int r11 = r8 + r10
            int r12 = r3.length
            if (r11 < r12) goto L_0x00c2
            goto L_0x00e5
        L_0x00c2:
            if (r10 <= 0) goto L_0x00ca
            java.lang.String r12 = " "
            java.lang.String r9 = r9.concat(r12)
        L_0x00ca:
            r11 = r3[r11]
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r9 = r9.concat(r11)
            int r10 = r10 + 1
            goto L_0x00b8
        L_0x00d7:
            r2.add(r9)
            int r9 = r2.size()
            int r10 = r1.zzb
            if (r9 >= r10) goto L_0x00f6
            int r8 = r8 + 1
            goto L_0x00b2
        L_0x00e5:
            int r3 = r2.size()
            int r8 = r1.zzb
            if (r3 < r8) goto L_0x00ee
            goto L_0x00f6
        L_0x00ee:
            int r7 = r7 + 1
            goto L_0x0042
        L_0x00f2:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x00f6:
            com.google.android.gms.internal.ads.zzaui r3 = new com.google.android.gms.internal.ads.zzaui
            r3.<init>()
            java.util.Iterator r0 = r2.iterator()
        L_0x00ff:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x011d
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.zzaug r4 = r1.zza     // Catch:{ IOException -> 0x0117 }
            byte[] r2 = r4.zzb(r2)     // Catch:{ IOException -> 0x0117 }
            android.util.Base64OutputStream r4 = r3.zzb     // Catch:{ IOException -> 0x0117 }
            r4.write(r2)     // Catch:{ IOException -> 0x0117 }
            goto L_0x00ff
        L_0x0117:
            r0 = move-exception
            java.lang.String r2 = "Error while writing hash to byteStream"
            com.google.android.gms.internal.ads.zzbza.zzh(r2, r0)
        L_0x011d:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaur.zza(java.util.ArrayList, java.util.ArrayList):java.lang.String");
    }
}
