package ea;

import ea.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<Runnable> f28837a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadPoolExecutor f28838b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<b> f28839c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private b f28840d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f28837a = linkedBlockingQueue;
        this.f28838b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void b() {
        b poll = this.f28839c.poll();
        this.f28840d = poll;
        if (poll != null) {
            poll.c(this.f28838b);
        }
    }

    public void a(b bVar) {
        this.f28840d = null;
        b();
    }

    public void c(b bVar) {
        bVar.a(this);
        this.f28839c.add(bVar);
        if (this.f28840d == null) {
            b();
        }
    }
}
