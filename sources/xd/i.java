package xd;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import sd.o;

/* compiled from: SafeContinuationJvm.kt */
public final class i<T> implements d<T>, e {

    /* renamed from: b  reason: collision with root package name */
    private static final a f39348b = new a((h) null);

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<i<?>, Object> f39349c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");

    /* renamed from: a  reason: collision with root package name */
    private final d<T> f39350a;
    private volatile Object result;

    /* compiled from: SafeContinuationJvm.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public i(d<? super T> dVar, Object obj) {
        m.e(dVar, "delegate");
        this.f39350a = dVar;
        this.result = obj;
    }

    public final Object a() {
        Object obj = this.result;
        yd.a aVar = yd.a.UNDECIDED;
        if (obj == aVar) {
            if (b.a(f39349c, this, aVar, d.c())) {
                return d.c();
            }
            obj = this.result;
        }
        if (obj == yd.a.RESUMED) {
            return d.c();
        }
        if (!(obj instanceof o.b)) {
            return obj;
        }
        throw ((o.b) obj).f38130a;
    }

    public e getCallerFrame() {
        d<T> dVar = this.f39350a;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        return this.f39350a.getContext();
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            yd.a aVar = yd.a.UNDECIDED;
            if (obj2 == aVar) {
                if (b.a(f39349c, this, aVar, obj)) {
                    return;
                }
            } else if (obj2 != d.c()) {
                throw new IllegalStateException("Already resumed");
            } else if (b.a(f39349c, this, d.c(), yd.a.RESUMED)) {
                this.f39350a.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f39350a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i(d<? super T> dVar) {
        this(dVar, yd.a.UNDECIDED);
        m.e(dVar, "delegate");
    }
}
