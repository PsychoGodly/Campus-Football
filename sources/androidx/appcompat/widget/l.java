package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import h.j;
import k0.a;

/* compiled from: AppCompatEmojiEditTextHelper */
class l {

    /* renamed from: a  reason: collision with root package name */
    private final EditText f1694a;

    /* renamed from: b  reason: collision with root package name */
    private final a f1695b;

    l(EditText editText) {
        this.f1694a = editText;
        this.f1695b = new a(editText, false);
    }

    /* access modifiers changed from: package-private */
    public KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f1695b.a(keyListener) : keyListener;
    }

    /* access modifiers changed from: package-private */
    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1694a.getContext().obtainStyledAttributes(attributeSet, j.f18335g0, i10, 0);
        try {
            int i11 = j.f18405u0;
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(i11)) {
                z10 = obtainStyledAttributes.getBoolean(i11, true);
            }
            obtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f1695b.b(inputConnection, editorInfo);
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z10) {
        this.f1695b.c(z10);
    }
}
