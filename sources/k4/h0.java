package k4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import k4.n;

/* compiled from: SystemHandlerWrapper */
final class h0 implements n {

    /* renamed from: b  reason: collision with root package name */
    private static final List<b> f19708b = new ArrayList(50);

    /* renamed from: a  reason: collision with root package name */
    private final Handler f19709a;

    /* compiled from: SystemHandlerWrapper */
    private static final class b implements n.a {

        /* renamed from: a  reason: collision with root package name */
        private Message f19710a;

        /* renamed from: b  reason: collision with root package name */
        private h0 f19711b;

        private b() {
        }

        private void b() {
            this.f19710a = null;
            this.f19711b = null;
            h0.o(this);
        }

        public void a() {
            ((Message) a.e(this.f19710a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) a.e(this.f19710a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        public b d(Message message, h0 h0Var) {
            this.f19710a = message;
            this.f19711b = h0Var;
            return this;
        }
    }

    public h0(Handler handler) {
        this.f19709a = handler;
    }

    private static b n() {
        b bVar;
        List<b> list = f19708b;
        synchronized (list) {
            if (list.isEmpty()) {
                bVar = new b();
            } else {
                bVar = list.remove(list.size() - 1);
            }
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    public static void o(b bVar) {
        List<b> list = f19708b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    public n.a a(int i10, int i11, int i12) {
        return n().d(this.f19709a.obtainMessage(i10, i11, i12), this);
    }

    public boolean b(Runnable runnable) {
        return this.f19709a.post(runnable);
    }

    public n.a c(int i10) {
        return n().d(this.f19709a.obtainMessage(i10), this);
    }

    public boolean d(int i10) {
        return this.f19709a.hasMessages(i10);
    }

    public boolean e(n.a aVar) {
        return ((b) aVar).c(this.f19709a);
    }

    public boolean f(int i10) {
        return this.f19709a.sendEmptyMessage(i10);
    }

    public n.a g(int i10, int i11, int i12, Object obj) {
        return n().d(this.f19709a.obtainMessage(i10, i11, i12, obj), this);
    }

    public boolean h(int i10, long j10) {
        return this.f19709a.sendEmptyMessageAtTime(i10, j10);
    }

    public void i(int i10) {
        this.f19709a.removeMessages(i10);
    }

    public n.a j(int i10, Object obj) {
        return n().d(this.f19709a.obtainMessage(i10, obj), this);
    }

    public void k(Object obj) {
        this.f19709a.removeCallbacksAndMessages(obj);
    }

    public Looper l() {
        return this.f19709a.getLooper();
    }
}
