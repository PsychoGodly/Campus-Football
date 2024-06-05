package a5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbvf;
import n4.g;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f431a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f432b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f433c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f434d;

    public /* synthetic */ h(Context context, String str, g gVar, d dVar) {
        this.f431a = context;
        this.f432b = str;
        this.f433c = gVar;
        this.f434d = dVar;
    }

    public final void run() {
        Context context = this.f431a;
        String str = this.f432b;
        g gVar = this.f433c;
        try {
            new zzbvf(context, str).zza(gVar.a(), this.f434d);
        } catch (IllegalStateException e10) {
            zzbsf.zza(context).zzf(e10, "RewardedAd.load");
        }
    }
}
