package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzash extends zzasm {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzash(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11) {
        super(zzaqx, "n4163G8iyqIKefOY/uIEeKjctFj1OQ1ggOIXf5yF8QdKTrTHzFKlCjSxQhxSHW08", "ML9A2VCkghGr4j9IIk2plgQeFzpoPp+ogmQdRJzLv80=", zzamv, i10, 33);
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
            this.zze.zzV(zzi.longValue());
        }
    }
}
