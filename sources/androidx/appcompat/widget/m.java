package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import h.j;
import k0.f;

/* compiled from: AppCompatEmojiTextHelper */
class m {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f1711a;

    /* renamed from: b  reason: collision with root package name */
    private final f f1712b;

    m(TextView textView) {
        this.f1711a = textView;
        this.f1712b = new f(textView, false);
    }

    /* access modifiers changed from: package-private */
    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1712b.a(inputFilterArr);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1711a.getContext().obtainStyledAttributes(attributeSet, j.f18335g0, i10, 0);
        try {
            int i11 = j.f18405u0;
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(i11)) {
                z10 = obtainStyledAttributes.getBoolean(i11, true);
            }
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z10) {
        this.f1712b.b(z10);
    }

    /* access modifiers changed from: package-private */
    public void d(boolean z10) {
        this.f1712b.c(z10);
    }
}
