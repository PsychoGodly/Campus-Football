package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzase extends zzasm {
    private final StackTraceElement[] zzi;

    public zzase(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(zzaqx, "mI62XAU6hkSJHBt5knDDlPT1Fqr4dlfaZ+n4XjM0AiKKuoUuq7VAlzpsb6e8DhEf", "XDZeV64PENx+9tx6tUBxGqpVXuPWj1qf1leYJ9jGf1Q=", zzamv, i10, 45);
        this.zzi = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.zzi;
        if (obj != null) {
            int i10 = 1;
            zzaqo zzaqo = new zzaqo((String) this.zzf.invoke((Object) null, new Object[]{obj}));
            synchronized (this.zze) {
                this.zze.zzF(zzaqo.zza.longValue());
                if (zzaqo.zzb.booleanValue()) {
                    zzamv zzamv = this.zze;
                    if (true != zzaqo.zzc.booleanValue()) {
                        i10 = 2;
                    }
                    zzamv.zzac(i10);
                } else {
                    this.zze.zzac(3);
                }
            }
        }
    }
}
