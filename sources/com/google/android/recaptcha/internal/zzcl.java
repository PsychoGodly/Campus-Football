package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzcl implements zzby {
    public static final zzcl zza = new zzcl();

    private zzcl() {
    }

    public final void zza(int i10, zzbl zzbl, Object... objArr) throws zzt {
        if (objArr.length == 1) {
            Byte b10 = objArr[0];
            if (true != (b10 instanceof Byte)) {
                b10 = null;
            }
            Byte b11 = b10;
            if (b11 != null) {
                zzbl.zzh(b11.byteValue());
                return;
            }
            throw new zzt(4, 5, (Throwable) null);
        }
        throw new zzt(4, 3, (Throwable) null);
    }
}
