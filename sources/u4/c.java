package u4;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbsf;
import n4.g;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f22982a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f22983b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f22984c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f22985d;

    public /* synthetic */ c(Context context, String str, g gVar, b bVar) {
        this.f22982a = context;
        this.f22983b = str;
        this.f22984c = gVar;
        this.f22985d = bVar;
    }

    public final void run() {
        Context context = this.f22982a;
        String str = this.f22983b;
        g gVar = this.f22984c;
        try {
            new zzbkh(context, str).zza(gVar.a(), this.f22985d);
        } catch (IllegalStateException e10) {
            zzbsf.zza(context).zzf(e10, "InterstitialAd.load");
        }
    }
}
