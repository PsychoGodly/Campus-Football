package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzarz extends zzasm {
    private static volatile String zzi;
    private static final Object zzj = new Object();

    public zzarz(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11) {
        super(zzaqx, "yYeL9qjPbrcPTY9ceVqgR0oHzmGoUGEuRTuU4UpOsMR57oewRJ2iJf5VjUsh44nU", "0QJdUleGFbUoMNzD5fazqxL5C8zhAUBMAOlt+v3NY80=", zzamv, i10, 1);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzB("E");
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (String) this.zzf.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzB(zzi);
        }
    }
}
