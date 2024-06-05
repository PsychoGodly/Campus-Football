package androidx.work;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.c;
import w6.f;

public abstract class Worker extends ListenableWorker {

    /* renamed from: a  reason: collision with root package name */
    c<ListenableWorker.a> f5092a;

    class a implements Runnable {
        a() {
        }

        public void run() {
            try {
                Worker.this.f5092a.p(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.f5092a.q(th);
            }
        }
    }

    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    public final f<ListenableWorker.a> startWork() {
        this.f5092a = c.t();
        getBackgroundExecutor().execute(new a());
        return this.f5092a;
    }
}
