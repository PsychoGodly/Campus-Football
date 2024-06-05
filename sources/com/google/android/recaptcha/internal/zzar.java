package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzar {
    public static final zzar zza = new zzar();

    private zzar() {
    }

    public static final zzlg zza(zzn zzn, zzn zzn2) {
        zzlf zzf = zzlg.zzf();
        zzf.zzp(zzka.zzb(zzn.zzb()));
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        zzf.zzq(zzjy.zzb(zzn.zza(timeUnit)));
        zzf.zzd(zzka.zzb(zzn2.zzb()));
        zzf.zze(zzjy.zzb(zzn2.zza(timeUnit)));
        return (zzlg) zzf.zzj();
    }
}
