package g;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.m;

/* compiled from: ActivityResultContract.kt */
public abstract class a<I, O> {

    /* renamed from: g.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityResultContract.kt */
    public static final class C0190a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f18088a;

        public C0190a(T t10) {
            this.f18088a = t10;
        }

        public final T a() {
            return this.f18088a;
        }
    }

    public abstract Intent a(Context context, I i10);

    public C0190a<O> b(Context context, I i10) {
        m.e(context, "context");
        return null;
    }

    public abstract O c(int i10, Intent intent);
}
