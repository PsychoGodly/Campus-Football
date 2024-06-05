package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<Runnable> f27466a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadPoolExecutor f27467b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<b> f27468c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private b f27469d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f27466a = linkedBlockingQueue;
        this.f27467b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b poll = this.f27468c.poll();
        this.f27469d = poll;
        if (poll != null) {
            poll.a(this.f27467b);
        }
    }

    public void b(b bVar) {
        bVar.a((b.a) this);
        this.f27468c.add(bVar);
        if (this.f27469d == null) {
            a();
        }
    }

    public void a(b bVar) {
        this.f27469d = null;
        a();
    }
}
