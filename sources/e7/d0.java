package e7;

import b8.a;
import b8.b;

/* compiled from: OptionalProvider */
class d0<T> implements b<T>, a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final a.C0259a<Object> f28752c = b0.f32472a;

    /* renamed from: d  reason: collision with root package name */
    private static final b<Object> f28753d = c0.f32473a;

    /* renamed from: a  reason: collision with root package name */
    private a.C0259a<T> f28754a;

    /* renamed from: b  reason: collision with root package name */
    private volatile b<T> f28755b;

    private d0(a.C0259a<T> aVar, b<T> bVar) {
        this.f28754a = aVar;
        this.f28755b = bVar;
    }

    static <T> d0<T> e() {
        return new d0<>(f28752c, f28753d);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f(b bVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h(a.C0259a aVar, a.C0259a aVar2, b bVar) {
        aVar.a(bVar);
        aVar2.a(bVar);
    }

    static <T> d0<T> i(b<T> bVar) {
        return new d0<>((a.C0259a) null, bVar);
    }

    public void a(a.C0259a<T> aVar) {
        b<T> bVar;
        b<T> bVar2 = this.f28755b;
        b<Object> bVar3 = f28753d;
        if (bVar2 != bVar3) {
            aVar.a(bVar2);
            return;
        }
        b<T> bVar4 = null;
        synchronized (this) {
            bVar = this.f28755b;
            if (bVar != bVar3) {
                bVar4 = bVar;
            } else {
                this.f28754a = new a0(this.f28754a, aVar);
            }
        }
        if (bVar4 != null) {
            aVar.a(bVar);
        }
    }

    public T get() {
        return this.f28755b.get();
    }

    /* access modifiers changed from: package-private */
    public void j(b<T> bVar) {
        a.C0259a<T> aVar;
        if (this.f28755b == f28753d) {
            synchronized (this) {
                aVar = this.f28754a;
                this.f28754a = null;
                this.f28755b = bVar;
            }
            aVar.a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
