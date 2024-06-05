package n4;

import com.google.android.gms.internal.ads.zzbsf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f20916a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f20917b;

    public /* synthetic */ e0(l lVar, g gVar) {
        this.f20916a = lVar;
        this.f20917b = gVar;
    }

    public final void run() {
        l lVar = this.f20916a;
        try {
            lVar.f20954a.p(this.f20917b.f20924a);
        } catch (IllegalStateException e10) {
            zzbsf.zza(lVar.getContext()).zzf(e10, "BaseAdView.loadAd");
        }
    }
}
