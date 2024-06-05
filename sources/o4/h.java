package o4;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbsf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f21077a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f21078b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f21079c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f21080d;

    public /* synthetic */ h(Context context, String str, a aVar, d dVar) {
        this.f21077a = context;
        this.f21078b = str;
        this.f21079c = aVar;
        this.f21080d = dVar;
    }

    public final void run() {
        Context context = this.f21077a;
        String str = this.f21078b;
        a aVar = this.f21079c;
        try {
            new zzbkh(context, str).zza(aVar.a(), this.f21080d);
        } catch (IllegalStateException e10) {
            zzbsf.zza(context).zzf(e10, "AdManagerInterstitialAd.load");
        }
    }
}
