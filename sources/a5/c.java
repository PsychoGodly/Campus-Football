package a5;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzbza;
import n4.g;
import n4.m;
import n4.s;
import n4.t;
import n4.y;
import o4.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class c {
    public static void load(Context context, String str, g gVar, d dVar) {
        q.l(context, "Context cannot be null.");
        q.l(str, "AdUnitId cannot be null.");
        q.l(gVar, "AdRequest cannot be null.");
        q.l(dVar, "LoadCallback cannot be null.");
        q.f("#008 Must be called on the main UI thread.");
        zzbar.zzc(context);
        if (((Boolean) zzbci.zzl.zze()).booleanValue()) {
            if (((Boolean) a0.c().zzb(zzbar.zzjw)).booleanValue()) {
                zzbyp.zzb.execute(new h(context, str, gVar, dVar));
                return;
            }
        }
        zzbza.zze("Loading on UI thread");
        new zzbvf(context, str).zza(gVar.a(), dVar);
    }

    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    public abstract m getFullScreenContentCallback();

    public abstract a getOnAdMetadataChangedListener();

    public abstract s getOnPaidEventListener();

    public abstract y getResponseInfo();

    public abstract b getRewardItem();

    public abstract void setFullScreenContentCallback(m mVar);

    public abstract void setImmersiveMode(boolean z10);

    public abstract void setOnAdMetadataChangedListener(a aVar);

    public abstract void setOnPaidEventListener(s sVar);

    public abstract void setServerSideVerificationOptions(e eVar);

    public abstract void show(Activity activity, t tVar);

    public static void load(Context context, String str, a aVar, d dVar) {
        q.l(context, "Context cannot be null.");
        q.l(str, "AdUnitId cannot be null.");
        q.l(aVar, "AdManagerAdRequest cannot be null.");
        q.l(dVar, "LoadCallback cannot be null.");
        q.f("#008 Must be called on the main UI thread.");
        zzbar.zzc(context);
        if (((Boolean) zzbci.zzl.zze()).booleanValue()) {
            if (((Boolean) a0.c().zzb(zzbar.zzjw)).booleanValue()) {
                zzbza.zze("Loading on background thread");
                zzbyp.zzb.execute(new g(context, str, aVar, dVar));
                return;
            }
        }
        zzbza.zze("Loading on UI thread");
        new zzbvf(context, str).zza(aVar.a(), dVar);
    }
}
