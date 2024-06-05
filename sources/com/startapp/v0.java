package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* compiled from: Sta */
public abstract class v0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17387a;

    /* renamed from: b  reason: collision with root package name */
    public final g6 f17388b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f17389c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f17390d = new a();

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            v0.this.a();
        }
    }

    /* compiled from: Sta */
    public class b implements g6 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f17392a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g6 f17393b;

        public b(g6 g6Var) {
            this.f17393b = g6Var;
        }

        public synchronized void a(Object obj) {
            if (!this.f17392a) {
                this.f17392a = true;
                v0.this.f17389c.removeCallbacksAndMessages((Object) null);
                this.f17393b.a(obj);
            }
        }
    }

    public v0(Context context, g6 g6Var) {
        this.f17387a = context;
        this.f17388b = new b(g6Var);
        this.f17389c = new Handler(Looper.getMainLooper());
    }

    public abstract void a();
}
