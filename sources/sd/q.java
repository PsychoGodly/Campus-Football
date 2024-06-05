package sd;

import androidx.concurrent.futures.b;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: LazyJVM.kt */
final class q<T> implements g<T>, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final a f38131d = new a((h) null);

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<q<?>, Object> f38132f = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "b");

    /* renamed from: a  reason: collision with root package name */
    private volatile fe.a<? extends T> f38133a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f38134b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f38135c;

    /* compiled from: LazyJVM.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public q(fe.a<? extends T> aVar) {
        m.e(aVar, "initializer");
        this.f38133a = aVar;
        u uVar = u.f38140a;
        this.f38134b = uVar;
        this.f38135c = uVar;
    }

    public boolean a() {
        return this.f38134b != u.f38140a;
    }

    public T getValue() {
        T t10 = this.f38134b;
        T t11 = u.f38140a;
        if (t10 != t11) {
            return t10;
        }
        fe.a<? extends T> aVar = this.f38133a;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (b.a(f38132f, this, t11, invoke)) {
                this.f38133a = null;
                return invoke;
            }
        }
        return this.f38134b;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
