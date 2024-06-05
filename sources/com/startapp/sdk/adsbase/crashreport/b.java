package com.startapp.sdk.adsbase.crashreport;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Printer;
import com.applovin.mediation.MaxReward;
import com.startapp.j9;
import com.startapp.sdk.components.j;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Sta */
public class b extends Thread implements Handler.Callback, Printer {

    /* renamed from: a  reason: collision with root package name */
    public d f17002a = new a(this);

    /* renamed from: b  reason: collision with root package name */
    public e f17003b = new C0171b(this);

    /* renamed from: c  reason: collision with root package name */
    public g f17004c = new c(this);

    /* renamed from: d  reason: collision with root package name */
    public f f17005d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f17006e = new Handler(Looper.getMainLooper(), this);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicLong f17007f = new AtomicLong(0);

    /* renamed from: g  reason: collision with root package name */
    public final long f17008g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<String> f17009h = new AtomicReference<>(MaxReward.DEFAULT_LABEL);

    /* renamed from: i  reason: collision with root package name */
    public final boolean f17010i;

    /* compiled from: Sta */
    public class a implements d {
        public a(b bVar) {
        }

        public void a() {
        }

        public boolean a(long j10, String str) {
            return false;
        }

        public void remove() {
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.crashreport.b$b  reason: collision with other inner class name */
    /* compiled from: Sta */
    public class C0171b implements e {
        public C0171b(b bVar) {
        }

        public long a(long j10) {
            return 0;
        }
    }

    /* compiled from: Sta */
    public class c implements g {
        public c(b bVar) {
        }
    }

    /* compiled from: Sta */
    public interface d {
        void a();

        boolean a(long j10, String str);

        void remove();
    }

    /* compiled from: Sta */
    public interface e {
        long a(long j10);
    }

    /* compiled from: Sta */
    public interface f {
    }

    /* compiled from: Sta */
    public interface g {
    }

    public b(long j10, boolean z10) {
        super("startapp-anr");
        this.f17008g = j10;
        this.f17010i = z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0048 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r12 = this;
            long r0 = r12.f17008g
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 1
        L_0x0006:
            boolean r6 = r12.isInterrupted()
            if (r6 != 0) goto L_0x008b
            java.util.concurrent.atomic.AtomicLong r6 = r12.f17007f
            long r6 = r6.getAndAdd(r0)
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0036
            if (r4 == 0) goto L_0x002e
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r5 = r12.f17009h
            java.lang.Object r5 = r5.get()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r12.a(r5)
            if (r5 != 0) goto L_0x002e
            com.startapp.sdk.adsbase.crashreport.b$d r4 = r12.f17002a
            r4.remove()
            r4 = 0
        L_0x002e:
            android.os.Handler r5 = r12.f17006e
            r6 = 101(0x65, float:1.42E-43)
            r5.sendEmptyMessage(r6)
            r5 = 1
        L_0x0036:
            monitor-enter(r12)     // Catch:{ InterruptedException -> 0x0040, all -> 0x0045 }
            r12.wait(r0)     // Catch:{ all -> 0x003d }
            monitor-exit(r12)     // Catch:{ all -> 0x003d }
            r6 = 0
            goto L_0x0046
        L_0x003d:
            r6 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x003d }
            throw r6     // Catch:{ InterruptedException -> 0x0040, all -> 0x0045 }
        L_0x0040:
            com.startapp.sdk.adsbase.crashreport.b$g r6 = r12.f17004c
            r6.getClass()
        L_0x0045:
            r6 = 1
        L_0x0046:
            if (r6 == 0) goto L_0x0049
            return
        L_0x0049:
            java.util.concurrent.atomic.AtomicLong r6 = r12.f17007f
            long r6 = r6.get()
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r10 = r12.f17009h
            java.lang.Object r10 = r10.get()
            java.lang.String r10 = (java.lang.String) r10
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0006
            if (r4 != 0) goto L_0x0006
            if (r5 != 0) goto L_0x0065
            boolean r11 = r12.a(r10)
            if (r11 == 0) goto L_0x0006
        L_0x0065:
            boolean r11 = android.os.Debug.isDebuggerConnected()
            if (r11 != 0) goto L_0x0088
            boolean r11 = android.os.Debug.waitingForDebugger()
            if (r11 == 0) goto L_0x0072
            goto L_0x0088
        L_0x0072:
            com.startapp.sdk.adsbase.crashreport.b$e r0 = r12.f17003b
            long r0 = r0.a(r6)
            int r11 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x007e
            r5 = 0
            goto L_0x0006
        L_0x007e:
            com.startapp.sdk.adsbase.crashreport.b$d r0 = r12.f17002a
            boolean r4 = r0.a(r6, r10)
            long r0 = r12.f17008g
            goto L_0x0006
        L_0x0088:
            r4 = 1
            goto L_0x0006
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.crashreport.b.a():void");
    }

    public boolean handleMessage(Message message) {
        this.f17007f.set(0);
        return true;
    }

    public void println(String str) {
        if (str.startsWith(">>>>>")) {
            this.f17009h.set(str);
        } else if (str.startsWith("<<<<<")) {
            this.f17009h.set(MaxReward.DEFAULT_LABEL);
            this.f17007f.set(0);
        }
    }

    public void run() {
        try {
            a();
        } catch (Throwable unused) {
        }
    }

    public void start() {
        this.f17002a.a();
        this.f17002a.remove();
        if (this.f17010i) {
            Looper.getMainLooper().setMessageLogging(this);
        }
        super.start();
    }

    public final boolean a(String str) {
        boolean z10 = !this.f17010i || !TextUtils.isEmpty(str);
        f fVar = this.f17005d;
        boolean z11 = fVar == null || (j9.e(((j) fVar).f17216a.f17212a) ^ true);
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }
}
