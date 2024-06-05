package k0;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.e;

/* compiled from: EmojiInputConnection */
final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f19526a;

    /* renamed from: b  reason: collision with root package name */
    private final a f19527b;

    /* compiled from: EmojiInputConnection */
    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
            return e.e(inputConnection, editable, i10, i11, z10);
        }

        public void b(EditorInfo editorInfo) {
            if (e.h()) {
                e.b().u(editorInfo);
            }
        }
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    private Editable a() {
        return this.f19526a.getEditableText();
    }

    public boolean deleteSurroundingText(int i10, int i11) {
        return this.f19527b.a(this, a(), i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return this.f19527b.a(this, a(), i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f19526a = textView;
        this.f19527b = aVar;
        aVar.b(editorInfo);
    }
}
