package a5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbvf;
import o4.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f427a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f428b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f429c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f430d;

    public /* synthetic */ g(Context context, String str, a aVar, d dVar) {
        this.f427a = context;
        this.f428b = str;
        this.f429c = aVar;
        this.f430d = dVar;
    }

    public final void run() {
        Context context = this.f427a;
        String str = this.f428b;
        a aVar = this.f429c;
        try {
            new zzbvf(context, str).zza(aVar.a(), this.f430d);
        } catch (IllegalStateException e10) {
            zzbsf.zza(context).zzf(e10, "RewardedAd.loadAdManager");
        }
    }
}
