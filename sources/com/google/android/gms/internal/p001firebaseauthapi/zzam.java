package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzam  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzam<E> {
    zzam() {
    }

    static int zza(int i10, int i11) {
        if (i11 >= 0) {
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                i12 = Integer.highestOneBit(i11 - 1) << 1;
            }
            return i12 < 0 ? a.e.API_PRIORITY_OTHER : i12;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }
}
