package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.wd;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public interface y6 {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f13525a;

        /* renamed from: b  reason: collision with root package name */
        public final wd.a f13526b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList f13527c;

        /* renamed from: com.applovin.impl.y6$a$a  reason: collision with other inner class name */
        private static final class C0149a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f13528a;

            /* renamed from: b  reason: collision with root package name */
            public y6 f13529b;

            public C0149a(Handler handler, y6 y6Var) {
                this.f13528a = handler;
                this.f13529b = y6Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, (wd.a) null);
        }

        public void a(Handler handler, y6 y6Var) {
            a1.a((Object) handler);
            a1.a((Object) y6Var);
            this.f13527c.add(new C0149a(handler, y6Var));
        }

        public void b() {
            Iterator it = this.f13527c.iterator();
            while (it.hasNext()) {
                C0149a aVar = (C0149a) it.next();
                yp.a(aVar.f13528a, (Runnable) new m80(this, aVar.f13529b));
            }
        }

        public void c() {
            Iterator it = this.f13527c.iterator();
            while (it.hasNext()) {
                C0149a aVar = (C0149a) it.next();
                yp.a(aVar.f13528a, (Runnable) new o80(this, aVar.f13529b));
            }
        }

        public void d() {
            Iterator it = this.f13527c.iterator();
            while (it.hasNext()) {
                C0149a aVar = (C0149a) it.next();
                yp.a(aVar.f13528a, (Runnable) new l80(this, aVar.f13529b));
            }
        }

        public void e(y6 y6Var) {
            Iterator it = this.f13527c.iterator();
            while (it.hasNext()) {
                C0149a aVar = (C0149a) it.next();
                if (aVar.f13529b == y6Var) {
                    this.f13527c.remove(aVar);
                }
            }
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, wd.a aVar) {
            this.f13527c = copyOnWriteArrayList;
            this.f13525a = i10;
            this.f13526b = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(y6 y6Var) {
            y6Var.a(this.f13525a, this.f13526b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(y6 y6Var) {
            y6Var.c(this.f13525a, this.f13526b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(y6 y6Var) {
            y6Var.b(this.f13525a, this.f13526b);
        }

        public void a() {
            Iterator it = this.f13527c.iterator();
            while (it.hasNext()) {
                C0149a aVar = (C0149a) it.next();
                yp.a(aVar.f13528a, (Runnable) new n80(this, aVar.f13529b));
            }
        }

        public void a(int i10) {
            Iterator it = this.f13527c.iterator();
            while (it.hasNext()) {
                C0149a aVar = (C0149a) it.next();
                yp.a(aVar.f13528a, (Runnable) new p80(this, aVar.f13529b, i10));
            }
        }

        public void a(Exception exc) {
            Iterator it = this.f13527c.iterator();
            while (it.hasNext()) {
                C0149a aVar = (C0149a) it.next();
                yp.a(aVar.f13528a, (Runnable) new q80(this, aVar.f13529b, exc));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(y6 y6Var) {
            y6Var.d(this.f13525a, this.f13526b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(y6 y6Var, int i10) {
            y6Var.e(this.f13525a, this.f13526b);
            y6Var.a(this.f13525a, this.f13526b, i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(y6 y6Var, Exception exc) {
            y6Var.a(this.f13525a, this.f13526b, exc);
        }

        public a a(int i10, wd.a aVar) {
            return new a(this.f13527c, i10, aVar);
        }
    }

    void a(int i10, wd.a aVar);

    void a(int i10, wd.a aVar, int i11);

    void a(int i10, wd.a aVar, Exception exc);

    void b(int i10, wd.a aVar);

    void c(int i10, wd.a aVar);

    void d(int i10, wd.a aVar);

    void e(int i10, wd.a aVar);
}
