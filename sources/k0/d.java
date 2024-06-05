package k0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiInputFilter */
final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f19528a;

    /* renamed from: b  reason: collision with root package name */
    private e.C0053e f19529b;

    /* compiled from: EmojiInputFilter */
    private static class a extends e.C0053e {

        /* renamed from: a  reason: collision with root package name */
        private final Reference<TextView> f19530a;

        /* renamed from: b  reason: collision with root package name */
        private final Reference<d> f19531b;

        a(TextView textView, d dVar) {
            this.f19530a = new WeakReference(textView);
            this.f19531b = new WeakReference(dVar);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        public void b() {
            CharSequence text;
            CharSequence o10;
            super.b();
            TextView textView = this.f19530a.get();
            if (c(textView, this.f19531b.get()) && textView.isAttachedToWindow() && (text = textView.getText()) != (o10 = e.b().o(text))) {
                int selectionStart = Selection.getSelectionStart(o10);
                int selectionEnd = Selection.getSelectionEnd(o10);
                textView.setText(o10);
                if (o10 instanceof Spannable) {
                    d.b((Spannable) o10, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(TextView textView) {
        this.f19528a = textView;
    }

    private e.C0053e a() {
        if (this.f19529b == null) {
            this.f19529b = new a(this.f19528a, this);
        }
        return this.f19529b;
    }

    static void b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }

    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f19528a.isInEditMode()) {
            return charSequence;
        }
        int d10 = e.b().d();
        if (d10 != 0) {
            boolean z10 = true;
            if (d10 == 1) {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f19528a.getText()) {
                    z10 = false;
                }
                if (!z10 || charSequence == null) {
                    return charSequence;
                }
                if (!(i10 == 0 && i11 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return e.b().p(charSequence, 0, charSequence.length());
            } else if (d10 != 3) {
                return charSequence;
            }
        }
        e.b().s(a());
        return charSequence;
    }
}
