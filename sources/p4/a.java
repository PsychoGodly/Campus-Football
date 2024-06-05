package p4;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbyp;
import n4.e;
import n4.g;
import n4.m;
import n4.s;
import n4.y;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class a {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* renamed from: p4.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
    public static abstract class C0225a extends e<a> {
    }

    @Deprecated
    public static void load(Context context, String str, g gVar, int i10, C0225a aVar) {
        q.l(context, "Context cannot be null.");
        q.l(str, "adUnitId cannot be null.");
        q.l(gVar, "AdRequest cannot be null.");
        q.f("#008 Must be called on the main UI thread.");
        zzbar.zzc(context);
        if (((Boolean) zzbci.zzd.zze()).booleanValue()) {
            if (((Boolean) a0.c().zzb(zzbar.zzjw)).booleanValue()) {
                zzbyp.zzb.execute(new d(context, str, gVar, i10, aVar));
                return;
            }
        }
        new zzavg(context, str, gVar.a(), i10, aVar).zza();
    }

    public abstract String getAdUnitId();

    public abstract m getFullScreenContentCallback();

    public abstract s getOnPaidEventListener();

    public abstract y getResponseInfo();

    public abstract void setFullScreenContentCallback(m mVar);

    public abstract void setImmersiveMode(boolean z10);

    public abstract void setOnPaidEventListener(s sVar);

    public abstract void show(Activity activity);

    public static void load(Context context, String str, g gVar, C0225a aVar) {
        q.l(context, "Context cannot be null.");
        q.l(str, "adUnitId cannot be null.");
        q.l(gVar, "AdRequest cannot be null.");
        q.f("#008 Must be called on the main UI thread.");
        zzbar.zzc(context);
        if (((Boolean) zzbci.zzd.zze()).booleanValue()) {
            if (((Boolean) a0.c().zzb(zzbar.zzjw)).booleanValue()) {
                zzbyp.zzb.execute(new c(context, str, gVar, aVar));
                return;
            }
        }
        new zzavg(context, str, gVar.a(), 3, aVar).zza();
    }

    @Deprecated
    public static void load(Context context, String str, o4.a aVar, int i10, C0225a aVar2) {
        q.l(context, "Context cannot be null.");
        q.l(str, "adUnitId cannot be null.");
        q.l(aVar, "AdManagerAdRequest cannot be null.");
        q.f("#008 Must be called on the main UI thread.");
        zzbar.zzc(context);
        if (((Boolean) zzbci.zzd.zze()).booleanValue()) {
            if (((Boolean) a0.c().zzb(zzbar.zzjw)).booleanValue()) {
                zzbyp.zzb.execute(new b(context, str, aVar, i10, aVar2));
                return;
            }
        }
        new zzavg(context, str, aVar.a(), i10, aVar2).zza();
    }
}
