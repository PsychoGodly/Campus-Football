package n4;

import com.google.android.gms.internal.ads.zzbsf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class f0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f20923a;

    public /* synthetic */ f0(l lVar) {
        this.f20923a = lVar;
    }

    public final void run() {
        l lVar = this.f20923a;
        try {
            lVar.f20954a.q();
        } catch (IllegalStateException e10) {
            zzbsf.zza(lVar.getContext()).zzf(e10, "BaseAdView.pause");
        }
    }
}
