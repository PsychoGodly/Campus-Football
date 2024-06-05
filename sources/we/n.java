package we;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.z;
import pe.t0;

/* compiled from: WorkQueue.kt */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f39269b;

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f39270c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f39271d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f39272e;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReferenceArray<h> f39273a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    static {
        Class<n> cls = n.class;
        f39269b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f39270c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f39271d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f39272e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    private final h b(h hVar) {
        if (d() == 127) {
            return hVar;
        }
        boolean z10 = true;
        if (hVar.f39257b.b() != 1) {
            z10 = false;
        }
        if (z10) {
            f39272e.incrementAndGet(this);
        }
        int i10 = f39270c.get(this) & 127;
        while (this.f39273a.get(i10) != null) {
            Thread.yield();
        }
        this.f39273a.lazySet(i10, hVar);
        f39270c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar != null) {
            boolean z10 = false;
            if (hVar.f39257b.b() == 1) {
                int decrementAndGet = f39272e.decrementAndGet(this);
                if (t0.a()) {
                    if (decrementAndGet >= 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    private final int d() {
        return f39270c.get(this) - f39271d.get(this);
    }

    private final h i() {
        h andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f39271d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f39270c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (andSet = this.f39273a.getAndSet(i11, (Object) null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(d dVar) {
        h i10 = i();
        if (i10 == null) {
            return false;
        }
        dVar.a(i10);
        return true;
    }

    private final h k(boolean z10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f39269b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null) {
                boolean z11 = true;
                if (hVar.f39257b.b() != 1) {
                    z11 = false;
                }
                if (z11 == z10) {
                }
            }
            int i10 = f39271d.get(this);
            int i11 = f39270c.get(this);
            while (i10 != i11) {
                if (z10 && f39272e.get(this) == 0) {
                    return null;
                }
                i11--;
                h m10 = m(i11, z10);
                if (m10 != null) {
                    return m10;
                }
            }
            return null;
        } while (!b.a(atomicReferenceFieldUpdater, this, hVar, (Object) null));
        return hVar;
    }

    private final h l(int i10) {
        int i11 = f39271d.get(this);
        int i12 = f39270c.get(this);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        while (i11 != i12) {
            if (z10 && f39272e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h m10 = m(i11, z10);
            if (m10 != null) {
                return m10;
            }
            i11 = i13;
        }
        return null;
    }

    private final h m(int i10, boolean z10) {
        int i11 = i10 & 127;
        h hVar = this.f39273a.get(i11);
        if (hVar != null) {
            boolean z11 = true;
            if (hVar.f39257b.b() != 1) {
                z11 = false;
            }
            if (z11 == z10 && this.f39273a.compareAndSet(i11, hVar, (Object) null)) {
                if (z10) {
                    f39272e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    private final long o(int i10, z<h> zVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        T t10;
        do {
            atomicReferenceFieldUpdater = f39269b;
            t10 = (h) atomicReferenceFieldUpdater.get(this);
            if (t10 == null) {
                return -2;
            }
            int i11 = 1;
            if (!(t10.f39257b.b() == 1)) {
                i11 = 2;
            }
            if ((i11 & i10) == 0) {
                return -2;
            }
            long a10 = l.f39265f.a() - t10.f39256a;
            long j10 = l.f39261b;
            if (a10 < j10) {
                return j10 - a10;
            }
        } while (!b.a(atomicReferenceFieldUpdater, this, t10, (Object) null));
        zVar.f36055a = t10;
        return -1;
    }

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f39269b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int e() {
        return f39269b.get(this) != null ? d() + 1 : d();
    }

    public final void f(d dVar) {
        h hVar = (h) f39269b.getAndSet(this, (Object) null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        do {
        } while (j(dVar));
    }

    public final h g() {
        h hVar = (h) f39269b.getAndSet(this, (Object) null);
        return hVar == null ? i() : hVar;
    }

    public final h h() {
        return k(true);
    }

    public final long n(int i10, z<h> zVar) {
        T t10;
        if (i10 == 3) {
            t10 = i();
        } else {
            t10 = l(i10);
        }
        if (t10 == null) {
            return o(i10, zVar);
        }
        zVar.f36055a = t10;
        return -1;
    }
}
