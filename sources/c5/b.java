package c5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.d3;
import com.google.android.gms.internal.ads.zzbza;
import n4.d;
import n4.h;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class b extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private final d3 f5984a;

    public d getAdListener() {
        return this.f5984a.d();
    }

    public h getAdSize() {
        return this.f5984a.e();
    }

    public String getAdUnitId() {
        return this.f5984a.m();
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
        this.f5984a.t(dVar);
    }

    public void setAdSize(h hVar) {
        this.f5984a.u(hVar);
    }

    public void setAdUnitId(String str) {
        this.f5984a.w(str);
    }
}
