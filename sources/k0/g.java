package k0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import com.google.android.gms.common.api.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiTextWatcher */
final class g implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    private final EditText f19539a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f19540b;

    /* renamed from: c  reason: collision with root package name */
    private e.C0053e f19541c;

    /* renamed from: d  reason: collision with root package name */
    private int f19542d = a.e.API_PRIORITY_OTHER;

    /* renamed from: f  reason: collision with root package name */
    private int f19543f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f19544g;

    /* compiled from: EmojiTextWatcher */
    private static class a extends e.C0053e {

        /* renamed from: a  reason: collision with root package name */
        private final Reference<EditText> f19545a;

        a(EditText editText) {
            this.f19545a = new WeakReference(editText);
        }

        public void b() {
            super.b();
            g.b(this.f19545a.get(), 1);
        }
    }

    g(EditText editText, boolean z10) {
        this.f19539a = editText;
        this.f19540b = z10;
        this.f19544g = true;
    }

    private e.C0053e a() {
        if (this.f19541c == null) {
            this.f19541c = new a(this.f19539a);
        }
        return this.f19541c;
    }

    static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            e.b().o(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        return !this.f19544g || (!this.f19540b && !e.h());
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void c(boolean z10) {
        if (this.f19544g != z10) {
            if (this.f19541c != null) {
                e.b().t(this.f19541c);
            }
            this.f19544g = z10;
            if (z10) {
                b(this.f19539a, e.b().d());
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.f19539a.isInEditMode() && !d() && i11 <= i12 && (charSequence instanceof Spannable)) {
            int d10 = e.b().d();
            if (d10 != 0) {
                if (d10 == 1) {
                    e.b().r((Spannable) charSequence, i10, i10 + i12, this.f19542d, this.f19543f);
                    return;
                } else if (d10 != 3) {
                    return;
                }
            }
            e.b().s(a());
        }
    }
}
