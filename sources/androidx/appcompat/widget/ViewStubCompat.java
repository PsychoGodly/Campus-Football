package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import h.j;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f1474a;

    /* renamed from: b  reason: collision with root package name */
    private int f1475b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<View> f1476c;

    /* renamed from: d  reason: collision with root package name */
    private LayoutInflater f1477d;

    /* renamed from: f  reason: collision with root package name */
    private a f1478f;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1474a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1477d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1474a, viewGroup, false);
            int i10 = this.f1475b;
            if (i10 != -1) {
                inflate.setId(i10);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1476c = new WeakReference<>(inflate);
            a aVar = this.f1478f;
            if (aVar != null) {
                aVar.a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1475b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1477d;
    }

    public int getLayoutResource() {
        return this.f1474a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f1475b = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1477d = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f1474a = i10;
    }

    public void setOnInflateListener(a aVar) {
        this.f1478f = aVar;
    }

    public void setVisibility(int i10) {
        WeakReference<View> weakReference = this.f1476c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i10);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1474a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.C3, i10, 0);
        this.f1475b = obtainStyledAttributes.getResourceId(j.F3, -1);
        this.f1474a = obtainStyledAttributes.getResourceId(j.E3, 0);
        setId(obtainStyledAttributes.getResourceId(j.D3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
