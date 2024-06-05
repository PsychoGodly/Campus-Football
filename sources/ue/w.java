package ue;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.t;
import pe.u0;

/* compiled from: LockFreeLinkedList.kt */
public class w {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f38857a;

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38858b;

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38859c;
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class a extends b<w> {

        /* renamed from: b  reason: collision with root package name */
        public final w f38860b;

        /* renamed from: c  reason: collision with root package name */
        public w f38861c;

        public a(w wVar) {
            this.f38860b = wVar;
        }

        /* renamed from: e */
        public void b(w wVar, Object obj) {
            boolean z10 = obj == null;
            w wVar2 = z10 ? this.f38860b : this.f38861c;
            if (wVar2 != null && androidx.concurrent.futures.b.a(w.f38857a, wVar, this, wVar2) && z10) {
                w wVar3 = this.f38860b;
                w wVar4 = this.f38861c;
                m.b(wVar4);
                wVar3.h(wVar4);
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* synthetic */ class b extends t {
        b(Object obj) {
            super(obj, u0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        public Object get() {
            return u0.a(this.receiver);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<w> cls2 = w.class;
        f38857a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f38858b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f38859c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: ue.w} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (androidx.concurrent.futures.b.a(r4, r3, r2, ((ue.f0) r5).f38803a) != false) goto L_0x0045;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final ue.w f(ue.e0 r9) {
        /*
            r8 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f38858b
            java.lang.Object r0 = r0.get(r8)
            ue.w r0 = (ue.w) r0
            r1 = 0
            r2 = r0
        L_0x000a:
            r3 = r1
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f38857a
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L_0x0020
            if (r0 != r2) goto L_0x0016
            return r2
        L_0x0016:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f38858b
            boolean r0 = androidx.concurrent.futures.b.a(r1, r8, r0, r2)
            if (r0 != 0) goto L_0x001f
            goto L_0x0000
        L_0x001f:
            return r2
        L_0x0020:
            boolean r6 = r8.l()
            if (r6 == 0) goto L_0x0027
            return r1
        L_0x0027:
            if (r5 != r9) goto L_0x002a
            return r2
        L_0x002a:
            boolean r6 = r5 instanceof ue.e0
            if (r6 == 0) goto L_0x0034
            ue.e0 r5 = (ue.e0) r5
            r5.a(r2)
            goto L_0x0000
        L_0x0034:
            boolean r6 = r5 instanceof ue.f0
            if (r6 == 0) goto L_0x0050
            if (r3 == 0) goto L_0x0047
            ue.f0 r5 = (ue.f0) r5
            ue.w r5 = r5.f38803a
            boolean r2 = androidx.concurrent.futures.b.a(r4, r3, r2, r5)
            if (r2 != 0) goto L_0x0045
            goto L_0x0000
        L_0x0045:
            r2 = r3
            goto L_0x000a
        L_0x0047:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f38858b
            java.lang.Object r2 = r4.get(r2)
            ue.w r2 = (ue.w) r2
            goto L_0x000b
        L_0x0050:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.m.c(r5, r3)
            r3 = r5
            ue.w r3 = (ue.w) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.w.f(ue.e0):ue.w");
    }

    private final w g(w wVar) {
        while (wVar.l()) {
            wVar = (w) f38858b.get(wVar);
        }
        return wVar;
    }

    /* access modifiers changed from: private */
    public final void h(w wVar) {
        w wVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38858b;
        do {
            wVar2 = (w) atomicReferenceFieldUpdater.get(wVar);
            if (i() != wVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f38858b, wVar, wVar2, this));
        if (l()) {
            wVar.f((e0) null);
        }
    }

    private final f0 o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38859c;
        f0 f0Var = (f0) atomicReferenceFieldUpdater.get(this);
        if (f0Var != null) {
            return f0Var;
        }
        f0 f0Var2 = new f0(this);
        atomicReferenceFieldUpdater.lazySet(this, f0Var2);
        return f0Var2;
    }

    public final boolean e(w wVar) {
        f38858b.lazySet(wVar, this);
        f38857a.lazySet(wVar, this);
        while (i() == this) {
            if (androidx.concurrent.futures.b.a(f38857a, this, this, wVar)) {
                wVar.h(this);
                return true;
            }
        }
        return false;
    }

    public final Object i() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38857a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof e0)) {
                return obj;
            }
            ((e0) obj).a(this);
        }
    }

    public final w j() {
        return v.b(i());
    }

    public final w k() {
        w f10 = f((e0) null);
        return f10 == null ? g((w) f38858b.get(this)) : f10;
    }

    public boolean l() {
        return i() instanceof f0;
    }

    public boolean m() {
        return n() == null;
    }

    public final w n() {
        Object i10;
        w wVar;
        do {
            i10 = i();
            if (i10 instanceof f0) {
                return ((f0) i10).f38803a;
            }
            if (i10 == this) {
                return (w) i10;
            }
            m.c(i10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            wVar = (w) i10;
        } while (!androidx.concurrent.futures.b.a(f38857a, this, i10, wVar.o()));
        wVar.f((e0) null);
        return null;
    }

    public final int p(w wVar, w wVar2, a aVar) {
        f38858b.lazySet(wVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38857a;
        atomicReferenceFieldUpdater.lazySet(wVar, wVar2);
        aVar.f38861c = wVar2;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, wVar2, aVar)) {
            return 0;
        }
        return aVar.a(this) == null ? 1 : 2;
    }

    public String toString() {
        return new b(this) + '@' + u0.b(this);
    }
}
