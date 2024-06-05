package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzepp implements Callable {
    public final /* synthetic */ List zza;
    public final /* synthetic */ Object zzb;

    public /* synthetic */ zzepp(List list, Object obj) {
        this.zza = list;
        this.zzb = obj;
    }

    public final Object call() {
        List<zzfut> list = this.zza;
        Object obj = this.zzb;
        for (zzfut zzfut : list) {
            zzepm zzepm = (zzepm) zzfut.get();
            if (zzepm != null) {
                zzepm.zzh(obj);
            }
        }
        return obj;
    }
}
