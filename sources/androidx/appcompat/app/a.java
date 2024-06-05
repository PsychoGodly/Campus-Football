package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import h.j;

/* compiled from: ActionBar */
public abstract class a {

    /* compiled from: ActionBar */
    public interface b {
        void a(boolean z10);
    }

    @Deprecated
    /* compiled from: ActionBar */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z10);

    public abstract int i();

    public abstract Context j();

    public abstract void k();

    public boolean l() {
        return false;
    }

    public abstract boolean m();

    public void n(Configuration configuration) {
    }

    /* access modifiers changed from: package-private */
    public void o() {
    }

    public abstract boolean p(int i10, KeyEvent keyEvent);

    public boolean q(KeyEvent keyEvent) {
        return false;
    }

    public boolean r() {
        return false;
    }

    public abstract void s(Drawable drawable);

    public abstract void t(boolean z10);

    public abstract void u(boolean z10);

    public abstract void v(boolean z10);

    public abstract void w(CharSequence charSequence);

    public abstract void x(CharSequence charSequence);

    public abstract void y();

    public androidx.appcompat.view.b z(b.a aVar) {
        return null;
    }

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    /* compiled from: ActionBar */
    public static class C0012a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f834a;

        public C0012a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f834a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f18399t);
            this.f834a = obtainStyledAttributes.getInt(j.f18404u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0012a(int i10, int i11) {
            super(i10, i11);
            this.f834a = 0;
            this.f834a = 8388627;
        }

        public C0012a(C0012a aVar) {
            super(aVar);
            this.f834a = 0;
            this.f834a = aVar.f834a;
        }

        public C0012a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f834a = 0;
        }
    }
}
