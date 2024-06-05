package com.applovin.impl;

import android.os.Handler;
import android.os.Message;
import com.applovin.impl.ha;
import java.util.ArrayList;
import java.util.List;

final class tl implements ha {

    /* renamed from: b  reason: collision with root package name */
    private static final List f12426b = new ArrayList(50);

    /* renamed from: a  reason: collision with root package name */
    private final Handler f12427a;

    public tl(Handler handler) {
        this.f12427a = handler;
    }

    public void b(int i10) {
        this.f12427a.removeMessages(i10);
    }

    public boolean c(int i10) {
        return this.f12427a.sendEmptyMessage(i10);
    }

    public ha.a d(int i10) {
        return a().a(this.f12427a.obtainMessage(i10), this);
    }

    private static final class b implements ha.a {

        /* renamed from: a  reason: collision with root package name */
        private Message f12428a;

        /* renamed from: b  reason: collision with root package name */
        private tl f12429b;

        private b() {
        }

        private void b() {
            this.f12428a = null;
            this.f12429b = null;
            tl.b(this);
        }

        public boolean a(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) a1.a((Object) this.f12428a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        public void a() {
            ((Message) a1.a((Object) this.f12428a)).sendToTarget();
            b();
        }

        public b a(Message message, tl tlVar) {
            this.f12428a = message;
            this.f12429b = tlVar;
            return this;
        }
    }

    /* access modifiers changed from: private */
    public static void b(b bVar) {
        List list = f12426b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    public boolean a(int i10) {
        return this.f12427a.hasMessages(i10);
    }

    public boolean a(Runnable runnable) {
        return this.f12427a.post(runnable);
    }

    public void a(Object obj) {
        this.f12427a.removeCallbacksAndMessages(obj);
    }

    public boolean a(int i10, long j10) {
        return this.f12427a.sendEmptyMessageAtTime(i10, j10);
    }

    public boolean a(ha.a aVar) {
        return ((b) aVar).a(this.f12427a);
    }

    public ha.a a(int i10, Object obj) {
        return a().a(this.f12427a.obtainMessage(i10, obj), this);
    }

    public ha.a a(int i10, int i11, int i12) {
        return a().a(this.f12427a.obtainMessage(i10, i11, i12), this);
    }

    public ha.a a(int i10, int i11, int i12, Object obj) {
        return a().a(this.f12427a.obtainMessage(i10, i11, i12, obj), this);
    }

    private static b a() {
        b bVar;
        List list = f12426b;
        synchronized (list) {
            if (list.isEmpty()) {
                bVar = new b();
            } else {
                bVar = (b) list.remove(list.size() - 1);
            }
        }
        return bVar;
    }
}
