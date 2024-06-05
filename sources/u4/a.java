package u4;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbyp;
import n4.g;
import n4.m;
import n4.s;
import n4.y;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class a {
    public static void load(Context context, String str, g gVar, b bVar) {
        q.l(context, "Context cannot be null.");
        q.l(str, "AdUnitId cannot be null.");
        q.l(gVar, "AdRequest cannot be null.");
        q.l(bVar, "LoadCallback cannot be null.");
        q.f("#008 Must be called on the main UI thread.");
        zzbar.zzc(context);
        if (((Boolean) zzbci.zzi.zze()).booleanValue()) {
            if (((Boolean) a0.c().zzb(zzbar.zzjw)).booleanValue()) {
                zzbyp.zzb.execute(new c(context, str, gVar, bVar));
                return;
            }
        }
        new zzbkh(context, str).zza(gVar.a(), bVar);
    }

    public abstract String getAdUnitId();

    public abstract m getFullScreenContentCallback();

    public abstract s getOnPaidEventListener();

    public abstract y getResponseInfo();

    public abstract void setFullScreenContentCallback(m mVar);

    public abstract void setImmersiveMode(boolean z10);

    public abstract void setOnPaidEventListener(s sVar);

    public abstract void show(Activity activity);
}
