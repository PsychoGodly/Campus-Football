package o4;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbyp;
import u4.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class c extends a {
    public static void load(Context context, String str, a aVar, d dVar) {
        q.l(context, "Context cannot be null.");
        q.l(str, "AdUnitId cannot be null.");
        q.l(aVar, "AdManagerAdRequest cannot be null.");
        q.l(dVar, "LoadCallback cannot be null.");
        q.f("#008 Must be called on the main UI thread.");
        zzbar.zzc(context);
        if (((Boolean) zzbci.zzi.zze()).booleanValue()) {
            if (((Boolean) a0.c().zzb(zzbar.zzjw)).booleanValue()) {
                zzbyp.zzb.execute(new h(context, str, aVar, dVar));
                return;
            }
        }
        new zzbkh(context, str).zza(aVar.a(), dVar);
    }

    public abstract e getAppEventListener();

    public abstract void setAppEventListener(e eVar);
}
