package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzcj implements zzby {
    public static final zzcj zza = new zzcj();

    private zzcj() {
    }

    public final void zza(int i10, zzbl zzbl, Object... objArr) throws zzt {
        if (objArr.length == 1) {
            zzbl.zzc().zzf(i10, objArr[0]);
            return;
        }
        throw new zzt(4, 3, (Throwable) null);
    }
}
