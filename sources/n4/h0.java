package n4;

import com.google.android.gms.internal.ads.zzbsf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class h0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f20946a;

    public /* synthetic */ h0(l lVar) {
        this.f20946a = lVar;
    }

    public final void run() {
        l lVar = this.f20946a;
        try {
            lVar.f20954a.r();
        } catch (IllegalStateException e10) {
            zzbsf.zza(lVar.getContext()).zzf(e10, "BaseAdView.resume");
        }
    }
}
