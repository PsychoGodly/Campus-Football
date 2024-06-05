package androidx.lifecycle;

import androidx.lifecycle.i;
import java.util.Map;

public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    static final Object f3833k = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Object f3834a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private m.b<x<? super T>, LiveData<T>.defpackage.c> f3835b = new m.b<>();

    /* renamed from: c  reason: collision with root package name */
    int f3836c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3837d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f3838e;

    /* renamed from: f  reason: collision with root package name */
    volatile Object f3839f;

    /* renamed from: g  reason: collision with root package name */
    private int f3840g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3841h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3842i;

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f3843j;

    class LifecycleBoundObserver extends LiveData<T>.defpackage.c implements m {

        /* renamed from: f  reason: collision with root package name */
        final p f3844f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ LiveData f3845g;

        /* access modifiers changed from: package-private */
        public void h() {
            this.f3844f.getLifecycle().d(this);
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            return this.f3844f.getLifecycle().b().c(i.b.STARTED);
        }

        public void onStateChanged(p pVar, i.a aVar) {
            i.b b10 = this.f3844f.getLifecycle().b();
            if (b10 == i.b.DESTROYED) {
                this.f3845g.i(this.f3848a);
                return;
            }
            i.b bVar = null;
            while (bVar != b10) {
                g(i());
                bVar = b10;
                b10 = this.f3844f.getLifecycle().b();
            }
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f3834a) {
                obj = LiveData.this.f3839f;
                LiveData.this.f3839f = LiveData.f3833k;
            }
            LiveData.this.j(obj);
        }
    }

    private class b extends LiveData<T>.defpackage.c {
        b(x<? super T> xVar) {
            super(xVar);
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            return true;
        }
    }

    private abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final x<? super T> f3848a;

        /* renamed from: b  reason: collision with root package name */
        boolean f3849b;

        /* renamed from: c  reason: collision with root package name */
        int f3850c = -1;

        c(x<? super T> xVar) {
            this.f3848a = xVar;
        }

        /* access modifiers changed from: package-private */
        public void g(boolean z10) {
            if (z10 != this.f3849b) {
                this.f3849b = z10;
                LiveData.this.b(z10 ? 1 : -1);
                if (this.f3849b) {
                    LiveData.this.d(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean i();
    }

    public LiveData() {
        Object obj = f3833k;
        this.f3839f = obj;
        this.f3843j = new a();
        this.f3838e = obj;
        this.f3840g = -1;
    }

    static void a(String str) {
        if (!l.c.g().b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void c(LiveData<T>.defpackage.c cVar) {
        if (cVar.f3849b) {
            if (!cVar.i()) {
                cVar.g(false);
                return;
            }
            int i10 = cVar.f3850c;
            int i11 = this.f3840g;
            if (i10 < i11) {
                cVar.f3850c = i11;
                cVar.f3848a.a(this.f3838e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i10) {
        int i11 = this.f3836c;
        this.f3836c = i10 + i11;
        if (!this.f3837d) {
            this.f3837d = true;
            while (true) {
                try {
                    int i12 = this.f3836c;
                    if (i11 != i12) {
                        boolean z10 = i11 == 0 && i12 > 0;
                        boolean z11 = i11 > 0 && i12 == 0;
                        if (z10) {
                            f();
                        } else if (z11) {
                            g();
                        }
                        i11 = i12;
                    } else {
                        return;
                    }
                } finally {
                    this.f3837d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(LiveData<T>.defpackage.c cVar) {
        if (this.f3841h) {
            this.f3842i = true;
            return;
        }
        this.f3841h = true;
        do {
            this.f3842i = false;
            if (cVar == null) {
                m.b<K, V>.d e10 = this.f3835b.e();
                while (e10.hasNext()) {
                    c((c) ((Map.Entry) e10.next()).getValue());
                    if (this.f3842i) {
                        break;
                    }
                }
            } else {
                c(cVar);
                cVar = null;
            }
        } while (this.f3842i);
        this.f3841h = false;
    }

    public void e(x<? super T> xVar) {
        a("observeForever");
        b bVar = new b(xVar);
        c h10 = this.f3835b.h(xVar, bVar);
        if (h10 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (h10 == null) {
            bVar.g(true);
        }
    }

    /* access modifiers changed from: protected */
    public void f() {
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    /* access modifiers changed from: protected */
    public void h(T t10) {
        boolean z10;
        synchronized (this.f3834a) {
            z10 = this.f3839f == f3833k;
            this.f3839f = t10;
        }
        if (z10) {
            l.c.g().c(this.f3843j);
        }
    }

    public void i(x<? super T> xVar) {
        a("removeObserver");
        c m10 = this.f3835b.m(xVar);
        if (m10 != null) {
            m10.h();
            m10.g(false);
        }
    }

    /* access modifiers changed from: protected */
    public void j(T t10) {
        a("setValue");
        this.f3840g++;
        this.f3838e = t10;
        d((LiveData<T>.defpackage.c) null);
    }
}
