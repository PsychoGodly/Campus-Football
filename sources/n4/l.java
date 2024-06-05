package n4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.d3;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzbza;
import o4.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class l extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    protected final d3 f20954a;

    protected l(Context context, int i10) {
        super(context);
        this.f20954a = new d3(this, i10);
    }

    public void a() {
        zzbar.zzc(getContext());
        if (((Boolean) zzbci.zze.zze()).booleanValue()) {
            if (((Boolean) a0.c().zzb(zzbar.zzjt)).booleanValue()) {
                zzbyp.zzb.execute(new g0(this));
                return;
            }
        }
        this.f20954a.n();
    }

    public void b(g gVar) {
        q.f("#008 Must be called on the main UI thread.");
        zzbar.zzc(getContext());
        if (((Boolean) zzbci.zzf.zze()).booleanValue()) {
            if (((Boolean) a0.c().zzb(zzbar.zzjw)).booleanValue()) {
                zzbyp.zzb.execute(new e0(this, gVar));
                return;
            }
        }
        this.f20954a.p(gVar.f20924a);
    }

    public void c() {
        zzbar.zzc(getContext());
        if (((Boolean) zzbci.zzg.zze()).booleanValue()) {
            if (((Boolean) a0.c().zzb(zzbar.zzju)).booleanValue()) {
                zzbyp.zzb.execute(new f0(this));
                return;
            }
        }
        this.f20954a.q();
    }

    public void d() {
        zzbar.zzc(getContext());
        if (((Boolean) zzbci.zzh.zze()).booleanValue()) {
            if (((Boolean) a0.c().zzb(zzbar.zzjs)).booleanValue()) {
                zzbyp.zzb.execute(new h0(this));
                return;
            }
        }
        this.f20954a.r();
    }

    public d getAdListener() {
        return this.f20954a.d();
    }

    public h getAdSize() {
        return this.f20954a.e();
    }

    public String getAdUnitId() {
        return this.f20954a.m();
    }

    public s getOnPaidEventListener() {
        return this.f20954a.f();
    }

    public y getResponseInfo() {
        return this.f20954a.g();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i14 = ((i12 - i10) - measuredWidth) / 2;
            int i15 = ((i13 - i11) - measuredHeight) / 2;
            childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        h hVar;
        int i13 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                hVar = getAdSize();
            } catch (NullPointerException e10) {
                zzbza.zzh("Unable to retrieve ad size.", e10);
                hVar = null;
            }
            if (hVar != null) {
                Context context = getContext();
                int k10 = hVar.k(context);
                i12 = hVar.d(context);
                i13 = k10;
            } else {
                i12 = 0;
            }
        } else {
            measureChild(childAt, i10, i11);
            i13 = childAt.getMeasuredWidth();
            i12 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i13, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(i12, getSuggestedMinimumHeight()), i11));
    }

    public void setAdListener(d dVar) {
        this.f20954a.t(dVar);
        if (dVar == null) {
            this.f20954a.s((a) null);
            return;
        }
        if (dVar instanceof a) {
            this.f20954a.s((a) dVar);
        }
        if (dVar instanceof e) {
            this.f20954a.x((e) dVar);
        }
    }

    public void setAdSize(h hVar) {
        this.f20954a.u(hVar);
    }

    public void setAdUnitId(String str) {
        this.f20954a.w(str);
    }

    public void setOnPaidEventListener(s sVar) {
        this.f20954a.z(sVar);
    }
}
