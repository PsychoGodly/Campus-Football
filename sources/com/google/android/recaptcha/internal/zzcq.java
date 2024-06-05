package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.h;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzcq {
    public static final zzcp zza = new zzcp((h) null);
    private int zzb;

    public zzcq(short s10, short s11) {
        this.zzb = Math.abs(s10);
    }

    public final short zza() {
        int i10 = ((this.zzb * 4391) + 277) % 32779;
        this.zzb = i10;
        return (short) (i10 % 255);
    }
}
