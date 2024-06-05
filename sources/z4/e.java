package z4;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbrt;
import n4.b;
import n4.g;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f24236a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f24237b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f24238c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f24239d;

    public /* synthetic */ e(Context context, b bVar, g gVar, b bVar2) {
        this.f24236a = context;
        this.f24237b = bVar;
        this.f24238c = gVar;
        this.f24239d = bVar2;
    }

    public final void run() {
        Context context = this.f24236a;
        b bVar = this.f24237b;
        g gVar = this.f24238c;
        new zzbrt(context, bVar, gVar == null ? null : gVar.a()).zzb(this.f24239d);
    }
}
