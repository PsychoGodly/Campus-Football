package b2;

import java.util.concurrent.Executor;

/* compiled from: SafeLoggingExecutor */
class m implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f5436a;

    /* compiled from: SafeLoggingExecutor */
    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f5437a;

        a(Runnable runnable) {
            this.f5437a = runnable;
        }

        public void run() {
            try {
                this.f5437a.run();
            } catch (Exception e10) {
                f2.a.d("Executor", "Background execution failure.", e10);
            }
        }
    }

    m(Executor executor) {
        this.f5436a = executor;
    }

    public void execute(Runnable runnable) {
        this.f5436a.execute(new a(runnable));
    }
}
