package com.onesignal;

import com.onesignal.k3;

/* compiled from: OSNotificationReceivedEvent */
public class g2 {

    /* renamed from: a  reason: collision with root package name */
    private final y1 f27819a;

    /* renamed from: b  reason: collision with root package name */
    private final e3 f27820b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f27821c;

    /* renamed from: d  reason: collision with root package name */
    private final w1 f27822d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f27823e = false;

    /* compiled from: OSNotificationReceivedEvent */
    class a implements Runnable {
        a() {
        }

        public void run() {
            k3.a(k3.r0.DEBUG, "Running complete from OSNotificationReceivedEvent timeout runnable!");
            g2 g2Var = g2.this;
            g2Var.b(g2Var.c());
        }
    }

    /* compiled from: OSNotificationReceivedEvent */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w1 f27825a;

        b(w1 w1Var) {
            this.f27825a = w1Var;
        }

        public void run() {
            g2.this.e(this.f27825a);
        }
    }

    g2(y1 y1Var, w1 w1Var) {
        this.f27822d = w1Var;
        this.f27819a = y1Var;
        e3 b10 = e3.b();
        this.f27820b = b10;
        a aVar = new a();
        this.f27821c = aVar;
        b10.c(25000, aVar);
    }

    static boolean d() {
        return OSUtils.H();
    }

    /* access modifiers changed from: private */
    public void e(w1 w1Var) {
        this.f27819a.f(this.f27822d.c(), w1Var != null ? w1Var.c() : null);
    }

    public synchronized void b(w1 w1Var) {
        this.f27820b.a(this.f27821c);
        if (this.f27823e) {
            k3.A1(k3.r0.DEBUG, "OSNotificationReceivedEvent already completed");
            return;
        }
        this.f27823e = true;
        if (d()) {
            new Thread(new b(w1Var), "OS_COMPLETE_NOTIFICATION").start();
        } else {
            e(w1Var);
        }
    }

    public w1 c() {
        return this.f27822d;
    }

    public String toString() {
        return "OSNotificationReceivedEvent{isComplete=" + this.f27823e + ", notification=" + this.f27822d + '}';
    }
}
