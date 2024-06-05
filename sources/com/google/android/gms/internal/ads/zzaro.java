package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaro extends zzasm {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzaro(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11) {
        super(zzaqx, "IGEgHKB/MIXVrIwjsdJywrnrloRmyYIq/vBgAhtfd4dogeVW5FuA76GSnZhGb7Ph", "q1ESzGxy3mMibo5bvVHy9HD4wURWKxH/5T27mG6V0M4=", zzamv, i10, 44);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzo(zzi.longValue());
        }
    }
}
