package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzasa extends zzasm {
    public zzasa(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11) {
        super(zzaqx, "1j4REQrMq1PMMKcExjoDOWyg20MvDt1CpdYWmGJKkBHqeSdI3MLMTN450gavv1ax", "+CZi37grxFhhVcffnGl0l4+1UklQkPiKUfCgqjs0HzY=", zzamv, i10, 3);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        boolean booleanValue = ((Boolean) a0.c().zzb(zzbar.zzco)).booleanValue();
        zzaqd zzaqd = new zzaqd((String) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb(), Boolean.valueOf(booleanValue)}));
        synchronized (this.zze) {
            this.zze.zzj(zzaqd.zza);
            this.zze.zzC(zzaqd.zzb);
        }
    }
}
