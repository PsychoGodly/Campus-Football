package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzck  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzck implements Comparable<zzck> {
    private final byte[] zza;

    private zzck(byte[] bArr) {
        this.zza = Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ int compareTo(java.lang.Object r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.firebase-auth-api.zzck r7 = (com.google.android.gms.internal.p001firebaseauthapi.zzck) r7
            byte[] r0 = r6.zza
            int r1 = r0.length
            byte[] r2 = r7.zza
            int r3 = r2.length
            if (r1 == r3) goto L_0x000e
            int r7 = r0.length
            int r0 = r2.length
        L_0x000c:
            int r7 = r7 - r0
            return r7
        L_0x000e:
            r0 = 0
            r1 = 0
        L_0x0010:
            byte[] r2 = r6.zza
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0025
            byte r3 = r2[r1]
            byte[] r4 = r7.zza
            byte r5 = r4[r1]
            if (r3 == r5) goto L_0x0022
            byte r7 = r2[r1]
            byte r0 = r4[r1]
            goto L_0x000c
        L_0x0022:
            int r1 = r1 + 1
            goto L_0x0010
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzck.compareTo(java.lang.Object):int");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzck)) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzck) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzxj.zza(this.zza);
    }
}
