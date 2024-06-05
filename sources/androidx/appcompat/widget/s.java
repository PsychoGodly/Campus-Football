package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.h;
import h.j;

/* compiled from: AppCompatPopupWindow */
class s extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f1783b = (Build.VERSION.SDK_INT < 21);

    /* renamed from: a  reason: collision with root package name */
    private boolean f1784a;

    public s(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        z0 v10 = z0.v(context, attributeSet, j.Y1, i10, i11);
        int i12 = j.f18307a2;
        if (v10.s(i12)) {
            b(v10.a(i12, false));
        }
        setBackgroundDrawable(v10.g(j.Z1));
        v10.w();
    }

    private void b(boolean z10) {
        if (f1783b) {
            this.f1784a = z10;
        } else {
            h.a(this, z10);
        }
    }

    public void showAsDropDown(View view, int i10, int i11) {
        if (f1783b && this.f1784a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f1783b && this.f1784a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f1783b && this.f1784a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
