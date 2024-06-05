package b5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbvq;
import n4.g;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f5539a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f5540b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f5541c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f5542d;

    public /* synthetic */ c(Context context, String str, g gVar, b bVar) {
        this.f5539a = context;
        this.f5540b = str;
        this.f5541c = gVar;
        this.f5542d = bVar;
    }

    public final void run() {
        Context context = this.f5539a;
        String str = this.f5540b;
        g gVar = this.f5541c;
        try {
            new zzbvq(context, str).zza(gVar.a(), this.f5542d);
        } catch (IllegalStateException e10) {
            zzbsf.zza(context).zzf(e10, "RewardedInterstitialAd.load");
        }
    }
}
