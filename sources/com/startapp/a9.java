package com.startapp;

import com.startapp.sdk.jobs.b;

/* compiled from: Sta */
public class a9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.a f15610a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f15611b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z8 f15612c;

    public a9(z8 z8Var, b.a aVar, b bVar) {
        this.f15612c = z8Var;
        this.f15610a = aVar;
        this.f15611b = bVar;
    }

    public void run() {
        try {
            this.f15612c.f17602j.run();
        } finally {
            this.f15610a.a(this.f15611b, false);
        }
    }
}
