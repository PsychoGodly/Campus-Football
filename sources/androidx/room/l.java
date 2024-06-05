package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: TransactionExecutor */
class l implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4789a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<Runnable> f4790b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private Runnable f4791c;

    /* compiled from: TransactionExecutor */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f4792a;

        a(Runnable runnable) {
            this.f4792a = runnable;
        }

        public void run() {
            try {
                this.f4792a.run();
            } finally {
                l.this.a();
            }
        }
    }

    l(Executor executor) {
        this.f4789a = executor;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a() {
        Runnable poll = this.f4790b.poll();
        this.f4791c = poll;
        if (poll != null) {
            this.f4789a.execute(poll);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f4790b.offer(new a(runnable));
        if (this.f4791c == null) {
            a();
        }
    }
}
