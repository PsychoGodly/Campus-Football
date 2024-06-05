package p4;

import android.content.Context;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzbsf;
import n4.g;
import p4.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f21704a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f21705b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f21706c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a.C0225a f21707d;

    public /* synthetic */ c(Context context, String str, g gVar, a.C0225a aVar) {
        this.f21704a = context;
        this.f21705b = str;
        this.f21706c = gVar;
        this.f21707d = aVar;
    }

    public final void run() {
        Context context = this.f21704a;
        String str = this.f21705b;
        g gVar = this.f21706c;
        try {
            new zzavg(context, str, gVar.a(), 3, this.f21707d).zza();
        } catch (IllegalStateException e10) {
            zzbsf.zza(context).zzf(e10, "AppOpenAd.load");
        }
    }
}
