package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import v.e;

/* compiled from: Barrier */
public class a extends c {

    /* renamed from: k  reason: collision with root package name */
    private int f2215k;

    /* renamed from: l  reason: collision with root package name */
    private int f2216l;

    /* renamed from: m  reason: collision with root package name */
    private v.a f2217m;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void t(e eVar, int i10, boolean z10) {
        this.f2216l = i10;
        if (Build.VERSION.SDK_INT < 17) {
            int i11 = this.f2215k;
            if (i11 == 5) {
                this.f2216l = 0;
            } else if (i11 == 6) {
                this.f2216l = 1;
            }
        } else if (z10) {
            int i12 = this.f2215k;
            if (i12 == 5) {
                this.f2216l = 1;
            } else if (i12 == 6) {
                this.f2216l = 0;
            }
        } else {
            int i13 = this.f2215k;
            if (i13 == 5) {
                this.f2216l = 0;
            } else if (i13 == 6) {
                this.f2216l = 1;
            }
        }
        if (eVar instanceof v.a) {
            ((v.a) eVar).x1(this.f2216l);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f2217m.r1();
    }

    public int getMargin() {
        return this.f2217m.t1();
    }

    public int getType() {
        return this.f2215k;
    }

    /* access modifiers changed from: protected */
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.f2217m = new v.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f2495n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.f2576w1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == k.f2567v1) {
                    this.f2217m.w1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == k.f2585x1) {
                    this.f2217m.y1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2239d = this.f2217m;
        s();
    }

    public void n(e eVar, boolean z10) {
        t(eVar, this.f2215k, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f2217m.w1(z10);
    }

    public void setDpMargin(int i10) {
        v.a aVar = this.f2217m;
        aVar.y1((int) ((((float) i10) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f2217m.y1(i10);
    }

    public void setType(int i10) {
        this.f2215k = i10;
    }
}
