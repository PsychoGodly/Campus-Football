package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.j;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import androidx.constraintlayout.widget.k;

/* compiled from: MotionHelper */
public class h extends c implements j.d {

    /* renamed from: k  reason: collision with root package name */
    private boolean f2067k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2068l;

    /* renamed from: m  reason: collision with root package name */
    private float f2069m;

    /* renamed from: n  reason: collision with root package name */
    protected View[] f2070n;

    public void a(j jVar, int i10, int i11, float f10) {
    }

    public void b(j jVar, int i10, int i11) {
    }

    public void c(j jVar, int i10) {
    }

    public float getProgress() {
        return this.f2069m;
    }

    /* access modifiers changed from: protected */
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.B6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.D6) {
                    this.f2067k = obtainStyledAttributes.getBoolean(index, this.f2067k);
                } else if (index == k.C6) {
                    this.f2068l = obtainStyledAttributes.getBoolean(index, this.f2068l);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f2069m = f10;
        int i10 = 0;
        if (this.f2237b > 0) {
            this.f2070n = l((ConstraintLayout) getParent());
            while (i10 < this.f2237b) {
                x(this.f2070n[i10], f10);
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof h)) {
                x(childAt, f10);
            }
            i10++;
        }
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return this.f2068l;
    }

    public boolean v() {
        return this.f2067k;
    }

    public void w(Canvas canvas) {
    }

    public void x(View view, float f10) {
    }
}
