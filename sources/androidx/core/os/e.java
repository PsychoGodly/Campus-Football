package androidx.core.os;

import android.os.CancellationSignal;

/* compiled from: CancellationSignal */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2966a;

    /* renamed from: b  reason: collision with root package name */
    private b f2967b;

    /* renamed from: c  reason: collision with root package name */
    private Object f2968c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2969d;

    /* compiled from: CancellationSignal */
    static class a {
        static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* compiled from: CancellationSignal */
    public interface b {
        void a();
    }

    private void d() {
        while (this.f2969d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r1 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (android.os.Build.VERSION.SDK_INT < 16) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        androidx.core.os.e.a.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.f2969d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0031, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r4.f2969d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0037, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f2966a     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return
        L_0x0007:
            r0 = 1
            r4.f2966a = r0     // Catch:{ all -> 0x003c }
            r4.f2969d = r0     // Catch:{ all -> 0x003c }
            androidx.core.os.e$b r0 = r4.f2967b     // Catch:{ all -> 0x003c }
            java.lang.Object r1 = r4.f2968c     // Catch:{ all -> 0x003c }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            r2 = 0
            if (r0 == 0) goto L_0x001a
            r0.a()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r0 = move-exception
            goto L_0x0026
        L_0x001a:
            if (r1 == 0) goto L_0x0031
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0018 }
            r3 = 16
            if (r0 < r3) goto L_0x0031
            androidx.core.os.e.a.a(r1)     // Catch:{ all -> 0x0018 }
            goto L_0x0031
        L_0x0026:
            monitor-enter(r4)
            r4.f2969d = r2     // Catch:{ all -> 0x002e }
            r4.notifyAll()     // Catch:{ all -> 0x002e }
            monitor-exit(r4)     // Catch:{ all -> 0x002e }
            throw r0
        L_0x002e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002e }
            throw r0
        L_0x0031:
            monitor-enter(r4)
            r4.f2969d = r2     // Catch:{ all -> 0x0039 }
            r4.notifyAll()     // Catch:{ all -> 0x0039 }
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
            throw r0
        L_0x003c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.os.e.a():void");
    }

    public boolean b() {
        boolean z10;
        synchronized (this) {
            z10 = this.f2966a;
        }
        return z10;
    }

    public void c(b bVar) {
        synchronized (this) {
            d();
            if (this.f2967b != bVar) {
                this.f2967b = bVar;
                if (this.f2966a) {
                    if (bVar != null) {
                        bVar.a();
                    }
                }
            }
        }
    }
}
