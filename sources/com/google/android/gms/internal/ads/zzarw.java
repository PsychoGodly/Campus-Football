package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzarw extends zzasm {
    private final zzaqp zzi;

    public zzarw(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11, zzaqp zzaqp) {
        super(zzaqx, "E/THkPkgF+0BLHsbSftuamH1/Y9ilZlsoBNC4vnGArx/OuP8nuKuPE26WAshquqV", "JjKXzosN///CnCEigOfT12TbYoIG/MWslFVGA2m/k1w=", zzamv, i10, 94);
        this.zzi = zzaqp;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int intValue = ((Integer) this.zzf.invoke((Object) null, new Object[]{this.zzi.zza()})).intValue();
        synchronized (this.zze) {
            this.zze.zzae(zzanj.zza(intValue));
        }
    }
}
