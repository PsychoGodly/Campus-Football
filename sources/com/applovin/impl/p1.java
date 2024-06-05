package com.applovin.impl;

import android.os.Handler;

public interface p1 {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f10560a;

        /* renamed from: b  reason: collision with root package name */
        private final p1 f10561b;

        public a(Handler handler, p1 p1Var) {
            this.f10560a = p1Var != null ? (Handler) a1.a((Object) handler) : null;
            this.f10561b = p1Var;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(Exception exc) {
            ((p1) yp.a((Object) this.f10561b)).c(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(Exception exc) {
            ((p1) yp.a((Object) this.f10561b)).a(exc);
        }

        public void a(Exception exc) {
            Handler handler = this.f10560a;
            if (handler != null) {
                handler.post(new i10(this, exc));
            }
        }

        public void b(Exception exc) {
            Handler handler = this.f10560a;
            if (handler != null) {
                handler.post(new j10(this, exc));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(l5 l5Var) {
            l5Var.a();
            ((p1) yp.a((Object) this.f10561b)).c(l5Var);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(l5 l5Var) {
            ((p1) yp.a((Object) this.f10561b)).a(l5Var);
        }

        public void a(String str, long j10, long j11) {
            Handler handler = this.f10560a;
            if (handler != null) {
                handler.post(new l10(this, str, j10, j11));
            }
        }

        public void b(l5 l5Var) {
            Handler handler = this.f10560a;
            if (handler != null) {
                handler.post(new g10(this, l5Var));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(String str, long j10, long j11) {
            ((p1) yp.a((Object) this.f10561b)).a(str, j10, j11);
        }

        public void a(String str) {
            Handler handler = this.f10560a;
            if (handler != null) {
                handler.post(new k10(this, str));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            ((p1) yp.a((Object) this.f10561b)).b(str);
        }

        public void a(l5 l5Var) {
            l5Var.a();
            Handler handler = this.f10560a;
            if (handler != null) {
                handler.post(new h10(this, l5Var));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(d9 d9Var, o5 o5Var) {
            ((p1) yp.a((Object) this.f10561b)).b(d9Var);
            ((p1) yp.a((Object) this.f10561b)).b(d9Var, o5Var);
        }

        public void a(d9 d9Var, o5 o5Var) {
            Handler handler = this.f10560a;
            if (handler != null) {
                handler.post(new f10(this, d9Var, o5Var));
            }
        }

        public void b(long j10) {
            Handler handler = this.f10560a;
            if (handler != null) {
                handler.post(new e10(this, j10));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(long j10) {
            ((p1) yp.a((Object) this.f10561b)).a(j10);
        }

        public void b(boolean z10) {
            Handler handler = this.f10560a;
            if (handler != null) {
                handler.post(new m10(this, z10));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(boolean z10) {
            ((p1) yp.a((Object) this.f10561b)).a(z10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(int i10, long j10, long j11) {
            ((p1) yp.a((Object) this.f10561b)).b(i10, j10, j11);
        }

        public void b(int i10, long j10, long j11) {
            Handler handler = this.f10560a;
            if (handler != null) {
                handler.post(new d10(this, i10, j10, j11));
            }
        }
    }

    void a(long j10);

    void a(l5 l5Var);

    void a(Exception exc);

    void a(String str, long j10, long j11);

    void a(boolean z10);

    void b(int i10, long j10, long j11);

    void b(d9 d9Var);

    void b(d9 d9Var, o5 o5Var);

    void b(String str);

    void c(l5 l5Var);

    void c(Exception exc);
}
