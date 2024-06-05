package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzasg extends zzasm {
    private final zzarf zzi;
    private long zzj;

    public zzasg(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11, zzarf zzarf) {
        super(zzaqx, "5go+5dJzPwtL428hPcvMvoz2IsnUZf/hKfz19p3YdYFOxVa6hNCHvBHHDAKylvFa", "8BESx6lpu/rT8vpssHW7TVG8DbeYQulEHs4g7WxmlH0=", zzamv, i10, 53);
        this.zzi = zzarf;
        if (zzarf != null) {
            this.zzj = zzarf.zza();
        }
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            this.zze.zzP(((Long) this.zzf.invoke((Object) null, new Object[]{Long.valueOf(this.zzj)})).longValue());
        }
    }
}
