package p4;

import android.content.Context;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzbsf;
import n4.g;
import p4.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f21708a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f21709b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f21710c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f21711d;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a.C0225a f21712f;

    public /* synthetic */ d(Context context, String str, g gVar, int i10, a.C0225a aVar) {
        this.f21708a = context;
        this.f21709b = str;
        this.f21710c = gVar;
        this.f21711d = i10;
        this.f21712f = aVar;
    }

    public final void run() {
        Context context = this.f21708a;
        String str = this.f21709b;
        g gVar = this.f21710c;
        try {
            new zzavg(context, str, gVar.a(), this.f21711d, this.f21712f).zza();
        } catch (IllegalStateException e10) {
            zzbsf.zza(context).zzf(e10, "AppOpenAd.load");
        }
    }
}
