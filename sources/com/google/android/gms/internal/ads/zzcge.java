package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcge {
    /* access modifiers changed from: private */
    public zzbzg zza;
    /* access modifiers changed from: private */
    public Context zzb;
    /* access modifiers changed from: private */
    public WeakReference zzc;

    public final zzcge zzc(Context context) {
        this.zzc = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzcge zzd(zzbzg zzbzg) {
        this.zza = zzbzg;
        return this;
    }
}
