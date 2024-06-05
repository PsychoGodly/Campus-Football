package com.applovin.impl;

public class a4 {

    /* renamed from: a  reason: collision with root package name */
    private final j3 f6289a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6290b;

    public a4() {
        this(j3.f8666a);
    }

    public synchronized void a() {
        while (!this.f6290b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f6290b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f6290b;
        this.f6290b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f6290b;
    }

    public synchronized boolean e() {
        if (this.f6290b) {
            return false;
        }
        this.f6290b = true;
        notifyAll();
        return true;
    }

    public a4(j3 j3Var) {
        this.f6289a = j3Var;
    }
}
