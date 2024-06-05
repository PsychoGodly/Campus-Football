package com.startapp;

import android.os.Build;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: Sta */
public class r7 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Queue<Runnable> f16352a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f16353b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f16354c;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f16355a;

        public a(Runnable runnable) {
            this.f16355a = runnable;
        }

        public void run() {
            try {
                this.f16355a.run();
            } finally {
                r7.this.a();
            }
        }
    }

    public r7(Executor executor) {
        if (Build.VERSION.SDK_INT >= 9) {
            this.f16352a = new ArrayDeque();
        } else {
            this.f16352a = new LinkedList();
        }
        this.f16353b = executor;
    }

    public synchronized void a() {
        Runnable poll = this.f16352a.poll();
        this.f16354c = poll;
        if (poll != null) {
            this.f16353b.execute(poll);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f16352a.offer(new a(runnable));
        if (this.f16354c == null) {
            a();
        }
    }
}
