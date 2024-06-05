package b5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbvq;
import o4.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f5543a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f5544b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f5545c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f5546d;

    public /* synthetic */ d(Context context, String str, a aVar, b bVar) {
        this.f5543a = context;
        this.f5544b = str;
        this.f5545c = aVar;
        this.f5546d = bVar;
    }

    public final void run() {
        Context context = this.f5543a;
        String str = this.f5544b;
        a aVar = this.f5545c;
        try {
            new zzbvq(context, str).zza(aVar.a(), this.f5546d);
        } catch (IllegalStateException e10) {
            zzbsf.zza(context).zzf(e10, "RewardedInterstitialAdManager.load");
        }
    }
}
