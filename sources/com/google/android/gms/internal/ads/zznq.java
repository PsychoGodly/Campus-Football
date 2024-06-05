package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zznq {
    public static final zznq zza = new zznq(new int[]{2}, 8);
    private static final zznq zzb = new zznq(new int[]{2, 5, 6}, 8);
    /* access modifiers changed from: private */
    public static final zzfqn zzc;
    private final int[] zzd;
    private final int zze = 8;

    static {
        zzfqm zzfqm = new zzfqm();
        zzfqm.zza(5, 6);
        zzfqm.zza(17, 6);
        zzfqm.zza(7, 6);
        zzfqm.zza(18, 6);
        zzfqm.zza(6, 8);
        zzfqm.zza(8, 8);
        zzfqm.zza(14, 8);
        zzc = zzfqm.zzc();
    }

    public zznq(int[] iArr, int i10) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzd = copyOf;
        Arrays.sort(copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zznq) && Arrays.equals(this.zzd, ((zznq) obj).zzd);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzd) * 31) + 8;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zzd);
        return "AudioCapabilities[maxChannelCount=8, supportedEncodings=" + arrays + "]";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (r7 != 5) goto L_0x0083;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair zza(com.google.android.gms.internal.ads.zzaf r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.zzm
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = r10.zzj
            int r0 = com.google.android.gms.internal.ads.zzbt.zza(r0, r1)
            com.google.android.gms.internal.ads.zzfqn r1 = zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1.containsKey(r2)
            r3 = 0
            if (r2 != 0) goto L_0x0019
            return r3
        L_0x0019:
            r2 = 7
            r4 = 6
            r5 = 8
            r6 = 18
            if (r0 != r6) goto L_0x002b
            boolean r0 = r9.zzc(r6)
            if (r0 != 0) goto L_0x0029
            r0 = 6
            goto L_0x0034
        L_0x0029:
            r0 = 18
        L_0x002b:
            if (r0 != r5) goto L_0x0034
            boolean r7 = r9.zzc(r5)
            if (r7 != 0) goto L_0x0034
            r0 = 7
        L_0x0034:
            boolean r7 = r9.zzc(r0)
            if (r7 != 0) goto L_0x003b
            return r3
        L_0x003b:
            int r7 = r10.zzz
            r8 = -1
            if (r7 == r8) goto L_0x0046
            if (r0 != r6) goto L_0x0043
            goto L_0x0046
        L_0x0043:
            if (r7 <= r5) goto L_0x006e
            return r3
        L_0x0046:
            int r10 = r10.zzA
            if (r10 != r8) goto L_0x004d
            r10 = 48000(0xbb80, float:6.7262E-41)
        L_0x004d:
            int r6 = com.google.android.gms.internal.ads.zzew.zza
            r7 = 29
            if (r6 < r7) goto L_0x0058
            int r7 = com.google.android.gms.internal.ads.zznp.zza(r0, r10)
            goto L_0x006e
        L_0x0058:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r10 = r1.getOrDefault(r10, r6)
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.util.Objects.requireNonNull(r10)
            int r7 = r10.intValue()
        L_0x006e:
            int r10 = com.google.android.gms.internal.ads.zzew.zza
            r1 = 28
            if (r10 > r1) goto L_0x0083
            if (r7 != r2) goto L_0x0079
            r4 = 8
            goto L_0x0084
        L_0x0079:
            r1 = 3
            if (r7 == r1) goto L_0x0084
            r1 = 4
            if (r7 == r1) goto L_0x0084
            r1 = 5
            if (r7 != r1) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r4 = r7
        L_0x0084:
            r1 = 26
            if (r10 > r1) goto L_0x0096
            java.lang.String r10 = com.google.android.gms.internal.ads.zzew.zzb
            java.lang.String r1 = "fugu"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L_0x0096
            r10 = 1
            if (r4 != r10) goto L_0x0096
            r4 = 2
        L_0x0096:
            int r10 = com.google.android.gms.internal.ads.zzew.zzj(r4)
            if (r10 != 0) goto L_0x009d
            return r3
        L_0x009d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznq.zza(com.google.android.gms.internal.ads.zzaf):android.util.Pair");
    }

    public final boolean zzc(int i10) {
        return Arrays.binarySearch(this.zzd, i10) >= 0;
    }
}
