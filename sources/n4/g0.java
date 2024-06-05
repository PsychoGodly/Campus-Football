package n4;

import com.google.android.gms.internal.ads.zzbsf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f20926a;

    public /* synthetic */ g0(l lVar) {
        this.f20926a = lVar;
    }

    public final void run() {
        l lVar = this.f20926a;
        try {
            lVar.f20954a.n();
        } catch (IllegalStateException e10) {
            zzbsf.zza(lVar.getContext()).zzf(e10, "BaseAdView.destroy");
        }
    }
}
