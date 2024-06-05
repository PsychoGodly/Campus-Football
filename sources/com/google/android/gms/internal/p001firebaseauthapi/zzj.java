package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zzj {
    protected zzj() {
    }

    public int zza(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        zzy.zza(i10, length, "index");
        while (i10 < length) {
            if (zza(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean zza(char c10);
}
