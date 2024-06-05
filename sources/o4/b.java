package o4;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.u0;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbyp;
import n4.b0;
import n4.h;
import n4.l;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class b extends l {
    public b(Context context) {
        super(context, 0);
        q.l(context, "Context cannot be null");
    }

    public void e(a aVar) {
        q.f("#008 Must be called on the main UI thread.");
        zzbar.zzc(getContext());
        if (((Boolean) zzbci.zzf.zze()).booleanValue()) {
            if (((Boolean) a0.c().zzb(zzbar.zzjw)).booleanValue()) {
                zzbyp.zzb.execute(new g(this, aVar));
                return;
            }
        }
        this.f20954a.p(aVar.a());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(a aVar) {
        try {
            this.f20954a.p(aVar.a());
        } catch (IllegalStateException e10) {
            zzbsf.zza(getContext()).zzf(e10, "AdManagerAdView.loadAd");
        }
    }

    public final boolean g(u0 u0Var) {
        return this.f20954a.B(u0Var);
    }

    public h[] getAdSizes() {
        return this.f20954a.a();
    }

    public e getAppEventListener() {
        return this.f20954a.k();
    }

    public n4.a0 getVideoController() {
        return this.f20954a.i();
    }

    public b0 getVideoOptions() {
        return this.f20954a.j();
    }

    public void setAdSizes(h... hVarArr) {
        if (hVarArr == null || hVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f20954a.v(hVarArr);
    }

    public void setAppEventListener(e eVar) {
        this.f20954a.x(eVar);
    }

    public void setManualImpressionsEnabled(boolean z10) {
        this.f20954a.y(z10);
    }

    public void setVideoOptions(b0 b0Var) {
        this.f20954a.A(b0Var);
    }
}
