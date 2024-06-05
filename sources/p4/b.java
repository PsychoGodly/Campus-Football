package p4;

import android.content.Context;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzbsf;
import o4.a;
import p4.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f21699a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f21700b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f21701c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f21702d;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a.C0225a f21703f;

    public /* synthetic */ b(Context context, String str, o4.a aVar, int i10, a.C0225a aVar2) {
        this.f21699a = context;
        this.f21700b = str;
        this.f21701c = aVar;
        this.f21702d = i10;
        this.f21703f = aVar2;
    }

    public final void run() {
        Context context = this.f21699a;
        String str = this.f21700b;
        o4.a aVar = this.f21701c;
        try {
            new zzavg(context, str, aVar.a(), this.f21702d, this.f21703f).zza();
        } catch (IllegalStateException e10) {
            zzbsf.zza(context).zzf(e10, "AppOpenAdManager.load");
        }
    }
}
