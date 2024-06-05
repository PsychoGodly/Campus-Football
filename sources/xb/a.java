package xb;

import bc.f;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: FlutterInjector */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    private static a f39322e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f39323f;

    /* renamed from: a  reason: collision with root package name */
    private f f39324a;

    /* renamed from: b  reason: collision with root package name */
    private ac.a f39325b;

    /* renamed from: c  reason: collision with root package name */
    private FlutterJNI.c f39326c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f39327d;

    /* compiled from: FlutterInjector */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private f f39328a;

        /* renamed from: b  reason: collision with root package name */
        private ac.a f39329b;

        /* renamed from: c  reason: collision with root package name */
        private FlutterJNI.c f39330c;

        /* renamed from: d  reason: collision with root package name */
        private ExecutorService f39331d;

        /* renamed from: xb.a$b$a  reason: collision with other inner class name */
        /* compiled from: FlutterInjector */
        private class C0461a implements ThreadFactory {

            /* renamed from: a  reason: collision with root package name */
            private int f39332a;

            private C0461a() {
                this.f39332a = 0;
            }

            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("flutter-worker-");
                int i10 = this.f39332a;
                this.f39332a = i10 + 1;
                sb2.append(i10);
                thread.setName(sb2.toString());
                return thread;
            }
        }

        private void b() {
            if (this.f39330c == null) {
                this.f39330c = new FlutterJNI.c();
            }
            if (this.f39331d == null) {
                this.f39331d = Executors.newCachedThreadPool(new C0461a());
            }
            if (this.f39328a == null) {
                this.f39328a = new f(this.f39330c.a(), this.f39331d);
            }
        }

        public a a() {
            b();
            return new a(this.f39328a, this.f39329b, this.f39330c, this.f39331d);
        }
    }

    public static a e() {
        f39323f = true;
        if (f39322e == null) {
            f39322e = new b().a();
        }
        return f39322e;
    }

    public ac.a a() {
        return this.f39325b;
    }

    public ExecutorService b() {
        return this.f39327d;
    }

    public f c() {
        return this.f39324a;
    }

    public FlutterJNI.c d() {
        return this.f39326c;
    }

    private a(f fVar, ac.a aVar, FlutterJNI.c cVar, ExecutorService executorService) {
        this.f39324a = fVar;
        this.f39325b = aVar;
        this.f39326c = cVar;
        this.f39327d = executorService;
    }
}
