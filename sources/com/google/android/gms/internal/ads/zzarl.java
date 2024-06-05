package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzarl extends zzasm {
    private static final zzasn zzi = new zzasn();
    private final Context zzj;

    public zzarl(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11, Context context) {
        super(zzaqx, "GiGLjdugkD/A/Nktl1YTMtFZ30miEp5ujxoBBsS1JjEnt8RpwdFKjPJMmiyB3Gih", "lGLGd1/lOSwZNvJFVMee07xTqqB6gC2uy3r930yIvSk=", zzamv, i10, 29);
        this.zzj = context;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzn("E");
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                if (zza.get() == null) {
                    zza.set((String) this.zzf.invoke((Object) null, new Object[]{this.zzj}));
                }
            }
        }
        String str = (String) zza.get();
        synchronized (this.zze) {
            this.zze.zzn(zzaoh.zza(str.getBytes(), true));
        }
    }
}
