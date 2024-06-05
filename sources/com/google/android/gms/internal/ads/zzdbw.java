package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.a0;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdbw extends zzczy implements zzatf {
    private final Map zzb = new WeakHashMap(1);
    private final Context zzc;
    private final zzeyc zzd;

    public zzdbw(Context context, Set set, zzeyc zzeyc) {
        super(set);
        this.zzc = context;
        this.zzd = zzeyc;
    }

    public final synchronized void zza(View view) {
        zzatg zzatg = (zzatg) this.zzb.get(view);
        if (zzatg == null) {
            zzatg = new zzatg(this.zzc, view);
            zzatg.zzc(this);
            this.zzb.put(view, zzatg);
        }
        if (this.zzd.zzY) {
            if (((Boolean) a0.c().zzb(zzbar.zzbh)).booleanValue()) {
                zzatg.zzg(((Long) a0.c().zzb(zzbar.zzbg)).longValue());
                return;
            }
        }
        zzatg.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzatg) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    public final synchronized void zzc(zzate zzate) {
        zzp(new zzdbv(zzate));
    }
}
