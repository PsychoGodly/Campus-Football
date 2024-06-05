package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager */
class e {

    /* renamed from: e  reason: collision with root package name */
    private static e f25870e;

    /* renamed from: a  reason: collision with root package name */
    private final Object f25871a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f25872b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    private c f25873c;

    /* renamed from: d  reason: collision with root package name */
    private c f25874d;

    /* compiled from: SnackbarManager */
    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            e.this.c((c) message.obj);
            return true;
        }
    }

    /* compiled from: SnackbarManager */
    interface b {
        void a(int i10);
    }

    /* compiled from: SnackbarManager */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<b> f25876a;

        /* renamed from: b  reason: collision with root package name */
        int f25877b;

        /* renamed from: c  reason: collision with root package name */
        boolean f25878c;

        /* access modifiers changed from: package-private */
        public boolean a(b bVar) {
            return bVar != null && this.f25876a.get() == bVar;
        }
    }

    private e() {
    }

    private boolean a(c cVar, int i10) {
        b bVar = (b) cVar.f25876a.get();
        if (bVar == null) {
            return false;
        }
        this.f25872b.removeCallbacksAndMessages(cVar);
        bVar.a(i10);
        return true;
    }

    static e b() {
        if (f25870e == null) {
            f25870e = new e();
        }
        return f25870e;
    }

    private boolean d(b bVar) {
        c cVar = this.f25873c;
        return cVar != null && cVar.a(bVar);
    }

    private void g(c cVar) {
        int i10 = cVar.f25877b;
        if (i10 != -2) {
            if (i10 <= 0) {
                i10 = i10 == -1 ? 1500 : 2750;
            }
            this.f25872b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f25872b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(c cVar) {
        synchronized (this.f25871a) {
            if (this.f25873c == cVar || this.f25874d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public void e(b bVar) {
        synchronized (this.f25871a) {
            if (d(bVar)) {
                c cVar = this.f25873c;
                if (!cVar.f25878c) {
                    cVar.f25878c = true;
                    this.f25872b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f25871a) {
            if (d(bVar)) {
                c cVar = this.f25873c;
                if (cVar.f25878c) {
                    cVar.f25878c = false;
                    g(cVar);
                }
            }
        }
    }
}
