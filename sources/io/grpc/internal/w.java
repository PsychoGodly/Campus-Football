package io.grpc.internal;

import dd.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import r6.o;

/* compiled from: ConnectivityStateManager */
final class w {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<a> f35424a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private volatile p f35425b = p.IDLE;

    /* compiled from: ConnectivityStateManager */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Runnable f35426a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f35427b;

        a(Runnable runnable, Executor executor) {
            this.f35426a = runnable;
            this.f35427b = executor;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f35427b.execute(this.f35426a);
        }
    }

    w() {
    }

    /* access modifiers changed from: package-private */
    public p a() {
        p pVar = this.f35425b;
        if (pVar != null) {
            return pVar;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    /* access modifiers changed from: package-private */
    public void b(p pVar) {
        o.p(pVar, "newState");
        if (this.f35425b != pVar && this.f35425b != p.SHUTDOWN) {
            this.f35425b = pVar;
            if (!this.f35424a.isEmpty()) {
                ArrayList<a> arrayList = this.f35424a;
                this.f35424a = new ArrayList<>();
                Iterator<a> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Runnable runnable, Executor executor, p pVar) {
        o.p(runnable, "callback");
        o.p(executor, "executor");
        o.p(pVar, "source");
        a aVar = new a(runnable, executor);
        if (this.f35425b != pVar) {
            aVar.a();
        } else {
            this.f35424a.add(aVar);
        }
    }
}
