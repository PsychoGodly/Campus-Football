package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaw<K, V> extends zzat<K, V> {
    private static final zzat<Object, Object> zza = new zzaw((Object) null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    private zzaw(Object obj, Object[] objArr, int i10) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.zzb
            java.lang.Object[] r1 = r8.zzc
            int r2 = r8.zzd
            r3 = 0
            if (r9 != 0) goto L_0x000c
        L_0x0009:
            r9 = r3
            goto L_0x009c
        L_0x000c:
            r4 = 1
            if (r2 != r4) goto L_0x0022
            r0 = 0
            r0 = r1[r0]
            r0.getClass()
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L_0x0009
            r9 = r1[r4]
            r9.getClass()
            goto L_0x009c
        L_0x0022:
            if (r0 != 0) goto L_0x0025
            goto L_0x0009
        L_0x0025:
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L_0x0050
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r5 = r0 + -1
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzal.zza(r0)
        L_0x0037:
            r0 = r0 & r5
            byte r6 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L_0x0040
            goto L_0x0009
        L_0x0040:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x004d
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L_0x009c
        L_0x004d:
            int r0 = r0 + 1
            goto L_0x0037
        L_0x0050:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L_0x007c
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r5 = r0 + -1
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzal.zza(r0)
        L_0x0062:
            r0 = r0 & r5
            short r6 = r2[r0]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L_0x006c
            goto L_0x0009
        L_0x006c:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x0079
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L_0x009c
        L_0x0079:
            int r0 = r0 + 1
            goto L_0x0062
        L_0x007c:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 - r4
            int r5 = r9.hashCode()
            int r5 = com.google.android.gms.internal.p001firebaseauthapi.zzal.zza(r5)
        L_0x0088:
            r5 = r5 & r2
            r6 = r0[r5]
            r7 = -1
            if (r6 != r7) goto L_0x0090
            goto L_0x0009
        L_0x0090:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x00a0
            r9 = r6 ^ 1
            r9 = r1[r9]
        L_0x009c:
            if (r9 != 0) goto L_0x009f
            return r3
        L_0x009f:
            return r9
        L_0x00a0:
            int r5 = r5 + 1
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzaw.get(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final zzak<V> zza() {
        return new zzba(this.zzc, 1, this.zzd);
    }

    /* access modifiers changed from: package-private */
    public final zzau<Map.Entry<K, V>> zzb() {
        return new zzaz(this, this.zzc, 0, this.zzd);
    }

    /* access modifiers changed from: package-private */
    public final zzau<K> zzc() {
        return new zzbb(this, new zzba(this.zzc, 0, this.zzd));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzd() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: short[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> com.google.android.gms.internal.p001firebaseauthapi.zzaw<K, V> zza(int r16, java.lang.Object[] r17, com.google.android.gms.internal.p001firebaseauthapi.zzas<K, V> r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            if (r0 != 0) goto L_0x000d
            com.google.android.gms.internal.firebase-auth-api.zzat<java.lang.Object, java.lang.Object> r0 = zza
            com.google.android.gms.internal.firebase-auth-api.zzaw r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzaw) r0
            return r0
        L_0x000d:
            r3 = 0
            r4 = 0
            r5 = 1
            if (r0 != r5) goto L_0x0025
            r0 = r1[r4]
            r0.getClass()
            r2 = r1[r5]
            r2.getClass()
            com.google.android.gms.internal.p001firebaseauthapi.zzai.zza((java.lang.Object) r0, (java.lang.Object) r2)
            com.google.android.gms.internal.firebase-auth-api.zzaw r0 = new com.google.android.gms.internal.firebase-auth-api.zzaw
            r0.<init>(r3, r1, r5)
            return r0
        L_0x0025:
            int r6 = r1.length
            int r6 = r6 >> r5
            com.google.android.gms.internal.p001firebaseauthapi.zzy.zzb(r0, r6)
            r6 = 2
            int r7 = java.lang.Math.max(r0, r6)
            r8 = 751619276(0x2ccccccc, float:5.8207657E-12)
            r9 = 1073741824(0x40000000, float:2.0)
            if (r7 >= r8) goto L_0x004e
            int r8 = r7 + -1
            int r8 = java.lang.Integer.highestOneBit(r8)
            int r8 = r8 << r5
            r9 = r8
        L_0x003e:
            double r10 = (double) r9
            r12 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r10 = r10 * r12
            double r12 = (double) r7
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 >= 0) goto L_0x0055
            int r9 = r9 << 1
            goto L_0x003e
        L_0x004e:
            if (r7 >= r9) goto L_0x0052
            r7 = 1
            goto L_0x0053
        L_0x0052:
            r7 = 0
        L_0x0053:
            if (r7 == 0) goto L_0x01e1
        L_0x0055:
            if (r0 != r5) goto L_0x0068
            r7 = r1[r4]
            r7.getClass()
            r8 = r1[r5]
            r8.getClass()
            com.google.android.gms.internal.p001firebaseauthapi.zzai.zza((java.lang.Object) r7, (java.lang.Object) r8)
        L_0x0064:
            r5 = 2
        L_0x0065:
            r7 = 1
            goto L_0x01b4
        L_0x0068:
            int r7 = r9 + -1
            r8 = 128(0x80, float:1.794E-43)
            r10 = 3
            r11 = -1
            if (r9 > r8) goto L_0x00dd
            byte[] r8 = new byte[r9]
            java.util.Arrays.fill(r8, r11)
            r9 = 0
            r11 = 0
        L_0x0077:
            if (r9 >= r0) goto L_0x00c9
            int r12 = r9 * 2
            int r13 = r11 * 2
            r14 = r1[r12]
            r14.getClass()
            r12 = r12 ^ r5
            r12 = r1[r12]
            r12.getClass()
            com.google.android.gms.internal.p001firebaseauthapi.zzai.zza((java.lang.Object) r14, (java.lang.Object) r12)
            int r15 = r14.hashCode()
            int r15 = com.google.android.gms.internal.p001firebaseauthapi.zzal.zza(r15)
        L_0x0093:
            r15 = r15 & r7
            byte r6 = r8[r15]
            r5 = 255(0xff, float:3.57E-43)
            r6 = r6 & r5
            if (r6 != r5) goto L_0x00a9
            byte r5 = (byte) r13
            r8[r15] = r5
            if (r11 >= r9) goto L_0x00a6
            r1[r13] = r14
            r5 = r13 ^ 1
            r1[r5] = r12
        L_0x00a6:
            int r11 = r11 + 1
            goto L_0x00bf
        L_0x00a9:
            r5 = r1[r6]
            boolean r5 = r14.equals(r5)
            if (r5 == 0) goto L_0x00c4
            com.google.android.gms.internal.firebase-auth-api.zzav r3 = new com.google.android.gms.internal.firebase-auth-api.zzav
            r5 = r6 ^ 1
            r6 = r1[r5]
            r6.getClass()
            r3.<init>(r14, r12, r6)
            r1[r5] = r12
        L_0x00bf:
            int r9 = r9 + 1
            r5 = 1
            r6 = 2
            goto L_0x0077
        L_0x00c4:
            int r15 = r15 + 1
            r5 = 1
            r6 = 2
            goto L_0x0093
        L_0x00c9:
            if (r11 != r0) goto L_0x00cd
            r3 = r8
            goto L_0x0064
        L_0x00cd:
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r5[r4] = r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r7 = 1
            r5[r7] = r6
            r6 = 2
            r5[r6] = r3
        L_0x00db:
            r3 = r5
            goto L_0x0064
        L_0x00dd:
            r5 = 32768(0x8000, float:4.5918E-41)
            if (r9 > r5) goto L_0x014d
            short[] r5 = new short[r9]
            java.util.Arrays.fill(r5, r11)
            r6 = 0
            r8 = 0
        L_0x00e9:
            if (r6 >= r0) goto L_0x0139
            int r9 = r6 * 2
            int r11 = r8 * 2
            r12 = r1[r9]
            r12.getClass()
            r13 = 1
            r9 = r9 ^ r13
            r9 = r1[r9]
            r9.getClass()
            com.google.android.gms.internal.p001firebaseauthapi.zzai.zza((java.lang.Object) r12, (java.lang.Object) r9)
            int r13 = r12.hashCode()
            int r13 = com.google.android.gms.internal.p001firebaseauthapi.zzal.zza(r13)
        L_0x0106:
            r13 = r13 & r7
            short r14 = r5[r13]
            r15 = 65535(0xffff, float:9.1834E-41)
            r14 = r14 & r15
            if (r14 != r15) goto L_0x011d
            short r14 = (short) r11
            r5[r13] = r14
            if (r8 >= r6) goto L_0x011a
            r1[r11] = r12
            r11 = r11 ^ 1
            r1[r11] = r9
        L_0x011a:
            int r8 = r8 + 1
            goto L_0x0133
        L_0x011d:
            r15 = r1[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x0136
            com.google.android.gms.internal.firebase-auth-api.zzav r3 = new com.google.android.gms.internal.firebase-auth-api.zzav
            r11 = r14 ^ 1
            r13 = r1[r11]
            r13.getClass()
            r3.<init>(r12, r9, r13)
            r1[r11] = r9
        L_0x0133:
            int r6 = r6 + 1
            goto L_0x00e9
        L_0x0136:
            int r13 = r13 + 1
            goto L_0x0106
        L_0x0139:
            if (r8 != r0) goto L_0x013c
            goto L_0x01a3
        L_0x013c:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r6[r4] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r7 = 1
            r6[r7] = r5
            r5 = 2
            r6[r5] = r3
            r3 = r6
            goto L_0x0065
        L_0x014d:
            int[] r5 = new int[r9]
            java.util.Arrays.fill(r5, r11)
            r6 = 0
            r8 = 0
        L_0x0154:
            if (r6 >= r0) goto L_0x01a1
            int r9 = r6 * 2
            int r12 = r8 * 2
            r13 = r1[r9]
            r13.getClass()
            r14 = 1
            r9 = r9 ^ r14
            r9 = r1[r9]
            r9.getClass()
            com.google.android.gms.internal.p001firebaseauthapi.zzai.zza((java.lang.Object) r13, (java.lang.Object) r9)
            int r14 = r13.hashCode()
            int r14 = com.google.android.gms.internal.p001firebaseauthapi.zzal.zza(r14)
        L_0x0171:
            r14 = r14 & r7
            r15 = r5[r14]
            if (r15 != r11) goto L_0x0183
            r5[r14] = r12
            if (r8 >= r6) goto L_0x0180
            r1[r12] = r13
            r12 = r12 ^ 1
            r1[r12] = r9
        L_0x0180:
            int r8 = r8 + 1
            goto L_0x0199
        L_0x0183:
            r11 = r1[r15]
            boolean r11 = r13.equals(r11)
            if (r11 == 0) goto L_0x019d
            com.google.android.gms.internal.firebase-auth-api.zzav r3 = new com.google.android.gms.internal.firebase-auth-api.zzav
            r11 = r15 ^ 1
            r12 = r1[r11]
            r12.getClass()
            r3.<init>(r13, r9, r12)
            r1[r11] = r9
        L_0x0199:
            int r6 = r6 + 1
            r11 = -1
            goto L_0x0154
        L_0x019d:
            int r14 = r14 + 1
            r11 = -1
            goto L_0x0171
        L_0x01a1:
            if (r8 != r0) goto L_0x01a5
        L_0x01a3:
            goto L_0x00db
        L_0x01a5:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r6[r4] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r7 = 1
            r6[r7] = r5
            r5 = 2
            r6[r5] = r3
            r3 = r6
        L_0x01b4:
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L_0x01db
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = r3[r5]
            com.google.android.gms.internal.firebase-auth-api.zzav r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzav) r0
            if (r2 == 0) goto L_0x01d6
            r2.zza = r0
            r0 = r3[r4]
            r2 = r3[r7]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r3 = r2 << 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            r3 = r0
            r0 = r2
            goto L_0x01db
        L_0x01d6:
            java.lang.IllegalArgumentException r0 = r0.zza()
            throw r0
        L_0x01db:
            com.google.android.gms.internal.firebase-auth-api.zzaw r2 = new com.google.android.gms.internal.firebase-auth-api.zzaw
            r2.<init>(r3, r1, r0)
            return r2
        L_0x01e1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "collection too large"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzaw.zza(int, java.lang.Object[], com.google.android.gms.internal.firebase-auth-api.zzas):com.google.android.gms.internal.firebase-auth-api.zzaw");
    }
}
