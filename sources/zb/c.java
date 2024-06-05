package zb;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.c;

/* compiled from: DartMessenger */
class c implements lc.c, f {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f39501a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, f> f39502b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, List<b>> f39503c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f39504d;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f39505f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<Integer, c.b> f39506g;

    /* renamed from: h  reason: collision with root package name */
    private int f39507h;

    /* renamed from: i  reason: collision with root package name */
    private final d f39508i;

    /* renamed from: j  reason: collision with root package name */
    private WeakHashMap<c.C0412c, d> f39509j;

    /* renamed from: k  reason: collision with root package name */
    private i f39510k;

    /* compiled from: DartMessenger */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f39511a;

        /* renamed from: b  reason: collision with root package name */
        int f39512b;

        /* renamed from: c  reason: collision with root package name */
        long f39513c;

        b(ByteBuffer byteBuffer, int i10, long j10) {
            this.f39511a = byteBuffer;
            this.f39512b = i10;
            this.f39513c = j10;
        }
    }

    /* renamed from: zb.c$c  reason: collision with other inner class name */
    /* compiled from: DartMessenger */
    static class C0469c implements d {

        /* renamed from: a  reason: collision with root package name */
        private final ExecutorService f39514a;

        C0469c(ExecutorService executorService) {
            this.f39514a = executorService;
        }

        public void a(Runnable runnable) {
            this.f39514a.execute(runnable);
        }
    }

    /* compiled from: DartMessenger */
    interface d {
        void a(Runnable runnable);
    }

    /* compiled from: DartMessenger */
    private static class e implements i {

        /* renamed from: a  reason: collision with root package name */
        ExecutorService f39515a = xb.a.e().b();

        e() {
        }

        public d a(c.d dVar) {
            if (dVar.a()) {
                return new h(this.f39515a);
            }
            return new C0469c(this.f39515a);
        }
    }

    /* compiled from: DartMessenger */
    private static class f {

        /* renamed from: a  reason: collision with root package name */
        public final c.a f39516a;

        /* renamed from: b  reason: collision with root package name */
        public final d f39517b;

        f(c.a aVar, d dVar) {
            this.f39516a = aVar;
            this.f39517b = dVar;
        }
    }

    /* compiled from: DartMessenger */
    static class g implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final FlutterJNI f39518a;

        /* renamed from: b  reason: collision with root package name */
        private final int f39519b;

        /* renamed from: c  reason: collision with root package name */
        private final AtomicBoolean f39520c = new AtomicBoolean(false);

        g(FlutterJNI flutterJNI, int i10) {
            this.f39518a = flutterJNI;
            this.f39519b = i10;
        }

        public void a(ByteBuffer byteBuffer) {
            if (this.f39520c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            } else if (byteBuffer == null) {
                this.f39518a.invokePlatformMessageEmptyResponseCallback(this.f39519b);
            } else {
                this.f39518a.invokePlatformMessageResponseCallback(this.f39519b, byteBuffer, byteBuffer.position());
            }
        }
    }

    /* compiled from: DartMessenger */
    static class h implements d {

        /* renamed from: a  reason: collision with root package name */
        private final ExecutorService f39521a;

        /* renamed from: b  reason: collision with root package name */
        private final ConcurrentLinkedQueue<Runnable> f39522b = new ConcurrentLinkedQueue<>();

        /* renamed from: c  reason: collision with root package name */
        private final AtomicBoolean f39523c = new AtomicBoolean(false);

        h(ExecutorService executorService) {
            this.f39521a = executorService;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void f() {
            if (this.f39523c.compareAndSet(false, true)) {
                try {
                    Runnable poll = this.f39522b.poll();
                    if (poll != null) {
                        poll.run();
                    }
                } finally {
                    this.f39523c.set(false);
                    if (!this.f39522b.isEmpty()) {
                        this.f39521a.execute(new e(this));
                    }
                }
            }
        }

        public void a(Runnable runnable) {
            this.f39522b.add(runnable);
            this.f39521a.execute(new d(this));
        }
    }

    /* compiled from: DartMessenger */
    interface i {
        d a(c.d dVar);
    }

    /* compiled from: DartMessenger */
    private static class j implements c.C0412c {
        private j() {
        }
    }

    c(FlutterJNI flutterJNI, i iVar) {
        this.f39502b = new HashMap();
        this.f39503c = new HashMap();
        this.f39504d = new Object();
        this.f39505f = new AtomicBoolean(false);
        this.f39506g = new HashMap();
        this.f39507h = 1;
        this.f39508i = new g();
        this.f39509j = new WeakHashMap<>();
        this.f39501a = flutterJNI;
        this.f39510k = iVar;
    }

    private void j(String str, f fVar, ByteBuffer byteBuffer, int i10, long j10) {
        f fVar2 = fVar;
        d dVar = fVar2 != null ? fVar2.f39517b : null;
        bd.e.b("PlatformChannel ScheduleHandler on " + str, i10);
        b bVar = new b(this, str, i10, fVar, byteBuffer, j10);
        if (dVar == null) {
            dVar = this.f39508i;
        }
        dVar.a(bVar);
    }

    private static void k(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() != null) {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
            return;
        }
        throw error;
    }

    private void l(f fVar, ByteBuffer byteBuffer, int i10) {
        if (fVar != null) {
            try {
                xb.b.f("DartMessenger", "Deferring to registered handler to process message.");
                fVar.f39516a.a(byteBuffer, new g(this.f39501a, i10));
            } catch (Exception e10) {
                xb.b.c("DartMessenger", "Uncaught exception in binary message listener", e10);
                this.f39501a.invokePlatformMessageEmptyResponseCallback(i10);
            } catch (Error e11) {
                k(e11);
            }
        } else {
            xb.b.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
            this.f39501a.invokePlatformMessageEmptyResponseCallback(i10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m(String str, int i10, f fVar, ByteBuffer byteBuffer, long j10) {
        bd.e.e("PlatformChannel ScheduleHandler on " + str, i10);
        bd.e.a("DartMessenger#handleMessageFromDart on " + str);
        try {
            l(fVar, byteBuffer, i10);
            if (byteBuffer != null && byteBuffer.isDirect()) {
                byteBuffer.limit(0);
            }
        } finally {
            this.f39501a.cleanupMessageData(j10);
            bd.e.d();
        }
    }

    public c.C0412c a(c.d dVar) {
        d a10 = this.f39510k.a(dVar);
        j jVar = new j();
        this.f39509j.put(jVar, a10);
        return jVar;
    }

    public /* synthetic */ c.C0412c b() {
        return lc.b.a(this);
    }

    public void c(int i10, ByteBuffer byteBuffer) {
        xb.b.f("DartMessenger", "Received message reply from Dart.");
        c.b remove = this.f39506g.remove(Integer.valueOf(i10));
        if (remove != null) {
            try {
                xb.b.f("DartMessenger", "Invoking registered callback for reply from Dart.");
                remove.a(byteBuffer);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
            } catch (Exception e10) {
                xb.b.c("DartMessenger", "Uncaught exception in binary message reply handler", e10);
            } catch (Error e11) {
                k(e11);
            }
        }
    }

    public void d(String str, ByteBuffer byteBuffer, c.b bVar) {
        bd.e.a("DartMessenger#send on " + str);
        try {
            xb.b.f("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i10 = this.f39507h;
            this.f39507h = i10 + 1;
            if (bVar != null) {
                this.f39506g.put(Integer.valueOf(i10), bVar);
            }
            if (byteBuffer == null) {
                this.f39501a.dispatchEmptyPlatformMessage(str, i10);
            } else {
                this.f39501a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i10);
            }
        } finally {
            bd.e.d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        r10 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r10.hasNext() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r11 = (zb.c.b) r10.next();
        j(r9, r8.f39502b.get(r9), r11.f39511a, r11.f39512b, r11.f39513c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(java.lang.String r9, lc.c.a r10, lc.c.C0412c r11) {
        /*
            r8 = this;
            if (r10 != 0) goto L_0x002a
            java.lang.String r10 = "DartMessenger"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Removing handler for channel '"
            r11.append(r0)
            r11.append(r9)
            java.lang.String r0 = "'"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            xb.b.f(r10, r11)
            java.lang.Object r0 = r8.f39504d
            monitor-enter(r0)
            java.util.Map<java.lang.String, zb.c$f> r10 = r8.f39502b     // Catch:{ all -> 0x0027 }
            r10.remove(r9)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r9
        L_0x002a:
            r0 = 0
            if (r11 == 0) goto L_0x0041
            java.util.WeakHashMap<lc.c$c, zb.c$d> r0 = r8.f39509j
            java.lang.Object r11 = r0.get(r11)
            r0 = r11
            zb.c$d r0 = (zb.c.d) r0
            if (r0 == 0) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue)."
            r9.<init>(r10)
            throw r9
        L_0x0041:
            java.lang.String r11 = "DartMessenger"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Setting handler for channel '"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            xb.b.f(r11, r1)
            java.lang.Object r11 = r8.f39504d
            monitor-enter(r11)
            java.util.Map<java.lang.String, zb.c$f> r1 = r8.f39502b     // Catch:{ all -> 0x009c }
            zb.c$f r2 = new zb.c$f     // Catch:{ all -> 0x009c }
            r2.<init>(r10, r0)     // Catch:{ all -> 0x009c }
            r1.put(r9, r2)     // Catch:{ all -> 0x009c }
            java.util.Map<java.lang.String, java.util.List<zb.c$b>> r10 = r8.f39503c     // Catch:{ all -> 0x009c }
            java.lang.Object r10 = r10.remove(r9)     // Catch:{ all -> 0x009c }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x009c }
            if (r10 != 0) goto L_0x0075
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            return
        L_0x0075:
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            java.util.Iterator r10 = r10.iterator()
        L_0x007a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x009b
            java.lang.Object r11 = r10.next()
            zb.c$b r11 = (zb.c.b) r11
            java.util.Map<java.lang.String, zb.c$f> r0 = r8.f39502b
            java.lang.Object r0 = r0.get(r9)
            r3 = r0
            zb.c$f r3 = (zb.c.f) r3
            java.nio.ByteBuffer r4 = r11.f39511a
            int r5 = r11.f39512b
            long r6 = r11.f39513c
            r1 = r8
            r2 = r9
            r1.j(r2, r3, r4, r5, r6)
            goto L_0x007a
        L_0x009b:
            return
        L_0x009c:
            r9 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.c.e(java.lang.String, lc.c$a, lc.c$c):void");
    }

    public void f(String str, ByteBuffer byteBuffer) {
        xb.b.f("DartMessenger", "Sending message over channel '" + str + "'");
        d(str, byteBuffer, (c.b) null);
    }

    public void g(String str, ByteBuffer byteBuffer, int i10, long j10) {
        f fVar;
        boolean z10;
        xb.b.f("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f39504d) {
            fVar = this.f39502b.get(str);
            z10 = this.f39505f.get() && fVar == null;
            if (z10) {
                if (!this.f39503c.containsKey(str)) {
                    this.f39503c.put(str, new LinkedList());
                }
                this.f39503c.get(str).add(new b(byteBuffer, i10, j10));
            }
        }
        if (!z10) {
            j(str, fVar, byteBuffer, i10, j10);
        }
    }

    public void i(String str, c.a aVar) {
        e(str, aVar, (c.C0412c) null);
    }

    c(FlutterJNI flutterJNI) {
        this(flutterJNI, new e());
    }
}
