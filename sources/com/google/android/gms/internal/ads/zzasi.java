package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzasi extends zzasm {
    public zzasi(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11) {
        super(zzaqx, "1vYYgGa1kSZn3v+ZOQuFaiTzDZd9yTFr5T4txRDl4On2u8cPqYe1RveVsleWcOe5", "9xUiBAiiy8Ja1KXne+aVhWFydz8zlt4gmIBXdZB7YyQ=", zzamv, i10, 48);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzag(3);
        boolean booleanValue = ((Boolean) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb()})).booleanValue();
        synchronized (this.zze) {
            if (booleanValue) {
                this.zze.zzag(2);
            } else {
                this.zze.zzag(1);
            }
        }
    }
}
