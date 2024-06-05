package k0;

import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.h;
import com.google.android.gms.common.api.a;

/* compiled from: EmojiEditTextHelper */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f19518a;

    /* renamed from: b  reason: collision with root package name */
    private int f19519b = a.e.API_PRIORITY_OTHER;

    /* renamed from: c  reason: collision with root package name */
    private int f19520c = 0;

    /* renamed from: k0.a$a  reason: collision with other inner class name */
    /* compiled from: EmojiEditTextHelper */
    private static class C0208a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final EditText f19521a;

        /* renamed from: b  reason: collision with root package name */
        private final g f19522b;

        C0208a(EditText editText, boolean z10) {
            this.f19521a = editText;
            g gVar = new g(editText, z10);
            this.f19522b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(b.getInstance());
        }

        /* access modifiers changed from: package-private */
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new e(keyListener);
        }

        /* access modifiers changed from: package-private */
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof c) {
                return inputConnection;
            }
            return new c(this.f19521a, inputConnection, editorInfo);
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z10) {
            this.f19522b.c(z10);
        }
    }

    /* compiled from: EmojiEditTextHelper */
    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public KeyListener a(KeyListener keyListener) {
            return keyListener;
        }

        /* access modifiers changed from: package-private */
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z10) {
        }
    }

    public a(EditText editText, boolean z10) {
        h.g(editText, "editText cannot be null");
        if (Build.VERSION.SDK_INT < 19) {
            this.f19518a = new b();
        } else {
            this.f19518a = new C0208a(editText, z10);
        }
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f19518a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f19518a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f19518a.c(z10);
    }
}
