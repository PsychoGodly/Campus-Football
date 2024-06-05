package k0;

import android.text.Editable;
import androidx.emoji2.text.n;

/* compiled from: EmojiEditableFactory */
final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f19523a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile Editable.Factory f19524b;

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f19525c;

    private b() {
        try {
            f19525c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f19524b == null) {
            synchronized (f19523a) {
                if (f19524b == null) {
                    f19524b = new b();
                }
            }
        }
        return f19524b;
    }

    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f19525c;
        if (cls != null) {
            return n.c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
