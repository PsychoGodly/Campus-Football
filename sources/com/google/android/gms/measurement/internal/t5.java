package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.q;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class t5 extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final Object f25067a;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<u5<?>> f25068b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f25069c = false;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ q5 f25070d;

    public t5(q5 q5Var, String str, BlockingQueue<u5<?>> blockingQueue) {
        this.f25070d = q5Var;
        q.k(str);
        q.k(blockingQueue);
        this.f25067a = new Object();
        this.f25068b = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        p4 G = this.f25070d.zzj().G();
        String name = getName();
        G.b(name + " was interrupted", interruptedException);
    }

    private final void c() {
        synchronized (this.f25070d.f24970i) {
            if (!this.f25069c) {
                this.f25070d.f24971j.release();
                this.f25070d.f24970i.notifyAll();
                if (this == this.f25070d.f24964c) {
                    this.f25070d.f24964c = null;
                } else if (this == this.f25070d.f24965d) {
                    this.f25070d.f24965d = null;
                } else {
                    this.f25070d.zzj().B().a("Current scheduler thread is neither worker nor network");
                }
                this.f25069c = true;
            }
        }
    }

    public final void a() {
        synchronized (this.f25067a) {
            this.f25067a.notifyAll();
        }
    }

    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f25070d.f24971j.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                b(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                u5 u5Var = (u5) this.f25068b.poll();
                if (u5Var != null) {
                    Process.setThreadPriority(u5Var.f25094b ? threadPriority : 10);
                    u5Var.run();
                } else {
                    synchronized (this.f25067a) {
                        if (this.f25068b.peek() == null && !this.f25070d.f24972k) {
                            try {
                                this.f25067a.wait(30000);
                            } catch (InterruptedException e11) {
                                b(e11);
                            }
                        }
                    }
                    synchronized (this.f25070d.f24970i) {
                        if (this.f25068b.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }
}
