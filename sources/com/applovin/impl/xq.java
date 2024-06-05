package com.applovin.impl;

import android.os.Handler;
import android.os.SystemClock;

public interface xq {
    void a(int i10, long j10);

    void a(long j10, int i10);

    void a(d9 d9Var);

    void a(d9 d9Var, o5 o5Var);

    void a(yq yqVar);

    void a(Object obj, long j10);

    void a(String str);

    void b(l5 l5Var);

    void b(Exception exc);

    void b(String str, long j10, long j11);

    void d(l5 l5Var);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f13440a;

        /* renamed from: b  reason: collision with root package name */
        private final xq f13441b;

        public a(Handler handler, xq xqVar) {
            this.f13440a = xqVar != null ? (Handler) a1.a((Object) handler) : null;
            this.f13441b = xqVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(l5 l5Var) {
            l5Var.a();
            ((xq) yp.a((Object) this.f13441b)).b(l5Var);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(l5 l5Var) {
            ((xq) yp.a((Object) this.f13441b)).d(l5Var);
        }

        public void a(String str, long j10, long j11) {
            Handler handler = this.f13440a;
            if (handler != null) {
                handler.post(new i80(this, str, j10, j11));
            }
        }

        public void b(l5 l5Var) {
            Handler handler = this.f13440a;
            if (handler != null) {
                handler.post(new c80(this, l5Var));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(String str, long j10, long j11) {
            ((xq) yp.a((Object) this.f13441b)).b(str, j10, j11);
        }

        public void a(String str) {
            Handler handler = this.f13440a;
            if (handler != null) {
                handler.post(new h80(this, str));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            ((xq) yp.a((Object) this.f13441b)).a(str);
        }

        public void a(l5 l5Var) {
            l5Var.a();
            Handler handler = this.f13440a;
            if (handler != null) {
                handler.post(new d80(this, l5Var));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(int i10, long j10) {
            ((xq) yp.a((Object) this.f13441b)).a(i10, j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(d9 d9Var, o5 o5Var) {
            ((xq) yp.a((Object) this.f13441b)).a(d9Var);
            ((xq) yp.a((Object) this.f13441b)).a(d9Var, o5Var);
        }

        public void a(int i10, long j10) {
            Handler handler = this.f13440a;
            if (handler != null) {
                handler.post(new z70(this, i10, j10));
            }
        }

        public void b(long j10, int i10) {
            Handler handler = this.f13440a;
            if (handler != null) {
                handler.post(new a80(this, j10, i10));
            }
        }

        public void a(d9 d9Var, o5 o5Var) {
            Handler handler = this.f13440a;
            if (handler != null) {
                handler.post(new b80(this, d9Var, o5Var));
            }
        }

        public void b(Exception exc) {
            Handler handler = this.f13440a;
            if (handler != null) {
                handler.post(new f80(this, exc));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(Object obj, long j10) {
            ((xq) yp.a((Object) this.f13441b)).a(obj, j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(long j10, int i10) {
            ((xq) yp.a((Object) this.f13441b)).a(j10, i10);
        }

        public void b(yq yqVar) {
            Handler handler = this.f13440a;
            if (handler != null) {
                handler.post(new e80(this, yqVar));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(Exception exc) {
            ((xq) yp.a((Object) this.f13441b)).b(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(yq yqVar) {
            ((xq) yp.a((Object) this.f13441b)).a(yqVar);
        }

        public void a(Object obj) {
            if (this.f13440a != null) {
                this.f13440a.post(new g80(this, obj, SystemClock.elapsedRealtime()));
            }
        }
    }
}
