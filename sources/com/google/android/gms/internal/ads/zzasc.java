package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzasc extends zzasm {
    private List zzi = null;
    private final Context zzj;

    public zzasc(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11, Context context) {
        super(zzaqx, "CRusF084WLXlYQUHrYrs2r/R+2VKdiClv0NdEd7QrkclQLbsoBgPD6jF9jLeUeO0", "2PenHGVoRtCO3QQhfYSZVJz6AfJrwJ5fA2DWAmwbKY4=", zzamv, i10, 31);
        this.zzj = context;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzW(-1);
        this.zze.zzS(-1);
        Context context = this.zzj;
        if (context == null) {
            context = this.zzb.zzb();
        }
        if (this.zzi == null) {
            this.zzi = (List) this.zzf.invoke((Object) null, new Object[]{context});
        }
        List list = this.zzi;
        if (list != null && list.size() == 2) {
            synchronized (this.zze) {
                this.zze.zzW(((Long) this.zzi.get(0)).longValue());
                this.zze.zzS(((Long) this.zzi.get(1)).longValue());
            }
        }
    }
}
