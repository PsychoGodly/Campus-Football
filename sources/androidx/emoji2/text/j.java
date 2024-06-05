package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.provider.g;
import androidx.core.util.h;
import androidx.emoji2.text.e;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: FontRequestEmojiCompatConfig */
public class j extends e.c {

    /* renamed from: j  reason: collision with root package name */
    private static final a f3389j = new a();

    /* compiled from: FontRequestEmojiCompatConfig */
    public static class a {
        public Typeface a(Context context, g.b bVar) throws PackageManager.NameNotFoundException {
            return g.a(context, (CancellationSignal) null, new g.b[]{bVar});
        }

        public g.a b(Context context, androidx.core.provider.e eVar) throws PackageManager.NameNotFoundException {
            return g.b(context, (CancellationSignal) null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* compiled from: FontRequestEmojiCompatConfig */
    private static class b implements e.g {

        /* renamed from: a  reason: collision with root package name */
        private final Context f3390a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.provider.e f3391b;

        /* renamed from: c  reason: collision with root package name */
        private final a f3392c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f3393d = new Object();

        /* renamed from: e  reason: collision with root package name */
        private Handler f3394e;

        /* renamed from: f  reason: collision with root package name */
        private Executor f3395f;

        /* renamed from: g  reason: collision with root package name */
        private ThreadPoolExecutor f3396g;

        /* renamed from: h  reason: collision with root package name */
        e.h f3397h;

        /* renamed from: i  reason: collision with root package name */
        private ContentObserver f3398i;

        /* renamed from: j  reason: collision with root package name */
        private Runnable f3399j;

        b(Context context, androidx.core.provider.e eVar, a aVar) {
            h.g(context, "Context cannot be null");
            h.g(eVar, "FontRequest cannot be null");
            this.f3390a = context.getApplicationContext();
            this.f3391b = eVar;
            this.f3392c = aVar;
        }

        private void b() {
            synchronized (this.f3393d) {
                this.f3397h = null;
                ContentObserver contentObserver = this.f3398i;
                if (contentObserver != null) {
                    this.f3392c.c(this.f3390a, contentObserver);
                    this.f3398i = null;
                }
                Handler handler = this.f3394e;
                if (handler != null) {
                    handler.removeCallbacks(this.f3399j);
                }
                this.f3394e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f3396g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f3395f = null;
                this.f3396g = null;
            }
        }

        private g.b e() {
            try {
                g.a b10 = this.f3392c.b(this.f3390a, this.f3391b);
                if (b10.c() == 0) {
                    g.b[] b11 = b10.b();
                    if (b11 != null && b11.length != 0) {
                        return b11[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b10.c() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        public void a(e.h hVar) {
            h.g(hVar, "LoaderCallback cannot be null");
            synchronized (this.f3393d) {
                this.f3397h = hVar;
            }
            d();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            if (r1 != 2) goto L_0x001e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
            r2 = r4.f3393d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x001e, code lost:
            if (r1 != 0) goto L_0x0062;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            androidx.core.os.o.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
            r1 = r4.f3392c.a(r4.f3390a, r0);
            r0 = androidx.core.graphics.m.f(r4.f3390a, (android.os.CancellationSignal) null, r0.d());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
            if (r0 == null) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
            if (r1 == null) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
            r0 = androidx.emoji2.text.m.b(r1, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            androidx.core.os.o.b();
            r1 = r4.f3393d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r2 = r4.f3397h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
            if (r2 == null) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x004a, code lost:
            r2.b(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x004d, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x005c, code lost:
            throw new java.lang.RuntimeException("Unable to open file.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            androidx.core.os.o.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0061, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x007d, code lost:
            throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r1 + ")");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x007e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0081, code lost:
            monitor-enter(r4.f3393d);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
            r2 = r4.f3397h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0084, code lost:
            if (r2 != null) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0086, code lost:
            r2.a(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x008a, code lost:
            b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r0 = e();
            r1 = r0.b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f3393d
                monitor-enter(r0)
                androidx.emoji2.text.e$h r1 = r4.f3397h     // Catch:{ all -> 0x0091 }
                if (r1 != 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                androidx.core.provider.g$b r0 = r4.e()     // Catch:{ all -> 0x007e }
                int r1 = r0.b()     // Catch:{ all -> 0x007e }
                r2 = 2
                if (r1 != r2) goto L_0x001e
                java.lang.Object r2 = r4.f3393d     // Catch:{ all -> 0x007e }
                monitor-enter(r2)     // Catch:{ all -> 0x007e }
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                goto L_0x001e
            L_0x001a:
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x001c:
                r0 = move-exception
                goto L_0x001a
            L_0x001e:
                if (r1 != 0) goto L_0x0062
                java.lang.String r1 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
                androidx.core.os.o.a(r1)     // Catch:{ all -> 0x005d }
                androidx.emoji2.text.j$a r1 = r4.f3392c     // Catch:{ all -> 0x005d }
                android.content.Context r2 = r4.f3390a     // Catch:{ all -> 0x005d }
                android.graphics.Typeface r1 = r1.a(r2, r0)     // Catch:{ all -> 0x005d }
                android.content.Context r2 = r4.f3390a     // Catch:{ all -> 0x005d }
                r3 = 0
                android.net.Uri r0 = r0.d()     // Catch:{ all -> 0x005d }
                java.nio.ByteBuffer r0 = androidx.core.graphics.m.f(r2, r3, r0)     // Catch:{ all -> 0x005d }
                if (r0 == 0) goto L_0x0055
                if (r1 == 0) goto L_0x0055
                androidx.emoji2.text.m r0 = androidx.emoji2.text.m.b(r1, r0)     // Catch:{ all -> 0x005d }
                androidx.core.os.o.b()     // Catch:{ all -> 0x007e }
                java.lang.Object r1 = r4.f3393d     // Catch:{ all -> 0x007e }
                monitor-enter(r1)     // Catch:{ all -> 0x007e }
                androidx.emoji2.text.e$h r2 = r4.f3397h     // Catch:{ all -> 0x0052 }
                if (r2 == 0) goto L_0x004d
                r2.b(r0)     // Catch:{ all -> 0x0052 }
            L_0x004d:
                monitor-exit(r1)     // Catch:{ all -> 0x0052 }
                r4.b()     // Catch:{ all -> 0x007e }
                goto L_0x008d
            L_0x0052:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0052 }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x0055:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x005d }
                java.lang.String r1 = "Unable to open file."
                r0.<init>(r1)     // Catch:{ all -> 0x005d }
                throw r0     // Catch:{ all -> 0x005d }
            L_0x005d:
                r0 = move-exception
                androidx.core.os.o.b()     // Catch:{ all -> 0x007e }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x0062:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x007e }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
                r2.<init>()     // Catch:{ all -> 0x007e }
                java.lang.String r3 = "fetchFonts result is not OK. ("
                r2.append(r3)     // Catch:{ all -> 0x007e }
                r2.append(r1)     // Catch:{ all -> 0x007e }
                java.lang.String r1 = ")"
                r2.append(r1)     // Catch:{ all -> 0x007e }
                java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x007e }
                r0.<init>(r1)     // Catch:{ all -> 0x007e }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x007e:
                r0 = move-exception
                java.lang.Object r1 = r4.f3393d
                monitor-enter(r1)
                androidx.emoji2.text.e$h r2 = r4.f3397h     // Catch:{ all -> 0x008e }
                if (r2 == 0) goto L_0x0089
                r2.a(r0)     // Catch:{ all -> 0x008e }
            L_0x0089:
                monitor-exit(r1)     // Catch:{ all -> 0x008e }
                r4.b()
            L_0x008d:
                return
            L_0x008e:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x008e }
                throw r0
            L_0x0091:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.j.b.c():void");
        }

        /* access modifiers changed from: package-private */
        public void d() {
            synchronized (this.f3393d) {
                if (this.f3397h != null) {
                    if (this.f3395f == null) {
                        ThreadPoolExecutor b10 = b.b("emojiCompat");
                        this.f3396g = b10;
                        this.f3395f = b10;
                    }
                    this.f3395f.execute(new k(this));
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f3393d) {
                this.f3395f = executor;
            }
        }
    }

    public j(Context context, androidx.core.provider.e eVar) {
        super(new b(context, eVar, f3389j));
    }

    public j c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
