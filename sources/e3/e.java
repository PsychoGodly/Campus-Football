package e3;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import k4.g;
import k4.n0;
import q2.c;

/* compiled from: AsynchronousMediaCodecBufferEnqueuer */
class e {

    /* renamed from: g  reason: collision with root package name */
    private static final ArrayDeque<b> f17804g = new ArrayDeque<>();

    /* renamed from: h  reason: collision with root package name */
    private static final Object f17805h = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f17806a;

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f17807b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f17808c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<RuntimeException> f17809d;

    /* renamed from: e  reason: collision with root package name */
    private final g f17810e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17811f;

    /* compiled from: AsynchronousMediaCodecBufferEnqueuer */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            e.this.f(message);
        }
    }

    /* compiled from: AsynchronousMediaCodecBufferEnqueuer */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f17813a;

        /* renamed from: b  reason: collision with root package name */
        public int f17814b;

        /* renamed from: c  reason: collision with root package name */
        public int f17815c;

        /* renamed from: d  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f17816d = new MediaCodec.CryptoInfo();

        /* renamed from: e  reason: collision with root package name */
        public long f17817e;

        /* renamed from: f  reason: collision with root package name */
        public int f17818f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f17813a = i10;
            this.f17814b = i11;
            this.f17815c = i12;
            this.f17817e = j10;
            this.f17818f = i13;
        }
    }

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new g());
    }

    private void b() throws InterruptedException {
        this.f17810e.c();
        ((Handler) k4.a.e(this.f17808c)).obtainMessage(2).sendToTarget();
        this.f17810e.a();
    }

    private static void c(c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f21735f;
        cryptoInfo.numBytesOfClearData = e(cVar.f21733d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(cVar.f21734e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) k4.a.e(d(cVar.f21731b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) k4.a.e(d(cVar.f21730a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f21732c;
        if (n0.f19738a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f21736g, cVar.f21737h));
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: e3.e$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: e3.e$b} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(android.os.Message r10) {
        /*
            r9 = this;
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L_0x0036
            r2 = 1
            if (r0 == r2) goto L_0x0022
            r2 = 2
            if (r0 == r2) goto L_0x001c
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r0 = r9.f17809d
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r2.<init>(r10)
            r0.compareAndSet(r1, r2)
            goto L_0x0049
        L_0x001c:
            k4.g r10 = r9.f17810e
            r10.e()
            goto L_0x0049
        L_0x0022:
            java.lang.Object r10 = r10.obj
            r1 = r10
            e3.e$b r1 = (e3.e.b) r1
            int r3 = r1.f17813a
            int r4 = r1.f17814b
            android.media.MediaCodec$CryptoInfo r5 = r1.f17816d
            long r6 = r1.f17817e
            int r8 = r1.f17818f
            r2 = r9
            r2.h(r3, r4, r5, r6, r8)
            goto L_0x0049
        L_0x0036:
            java.lang.Object r10 = r10.obj
            r1 = r10
            e3.e$b r1 = (e3.e.b) r1
            int r3 = r1.f17813a
            int r4 = r1.f17814b
            int r5 = r1.f17815c
            long r6 = r1.f17817e
            int r8 = r1.f17818f
            r2 = r9
            r2.g(r3, r4, r5, r6, r8)
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            o(r1)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.e.f(android.os.Message):void");
    }

    private void g(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f17806a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            this.f17809d.compareAndSet((Object) null, e10);
        }
    }

    private void h(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f17805h) {
                this.f17806a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            this.f17809d.compareAndSet((Object) null, e10);
        }
    }

    private void j() throws InterruptedException {
        ((Handler) k4.a.e(this.f17808c)).removeCallbacksAndMessages((Object) null);
        b();
    }

    private static b k() {
        ArrayDeque<b> arrayDeque = f17804g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                b bVar = new b();
                return bVar;
            }
            b removeFirst = arrayDeque.removeFirst();
            return removeFirst;
        }
    }

    private static void o(b bVar) {
        ArrayDeque<b> arrayDeque = f17804g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public void i() {
        if (this.f17811f) {
            try {
                j();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void l() {
        RuntimeException andSet = this.f17809d.getAndSet((Object) null);
        if (andSet != null) {
            throw andSet;
        }
    }

    public void m(int i10, int i11, int i12, long j10, int i13) {
        l();
        b k10 = k();
        k10.a(i10, i11, i12, j10, i13);
        ((Handler) n0.j(this.f17808c)).obtainMessage(0, k10).sendToTarget();
    }

    public void n(int i10, int i11, c cVar, long j10, int i12) {
        l();
        b k10 = k();
        k10.a(i10, i11, 0, j10, i12);
        c(cVar, k10.f17816d);
        ((Handler) n0.j(this.f17808c)).obtainMessage(1, k10).sendToTarget();
    }

    public void p() {
        if (this.f17811f) {
            i();
            this.f17807b.quit();
        }
        this.f17811f = false;
    }

    public void q() {
        if (!this.f17811f) {
            this.f17807b.start();
            this.f17808c = new a(this.f17807b.getLooper());
            this.f17811f = true;
        }
    }

    public void r() throws InterruptedException {
        b();
    }

    e(MediaCodec mediaCodec, HandlerThread handlerThread, g gVar) {
        this.f17806a = mediaCodec;
        this.f17807b = handlerThread;
        this.f17810e = gVar;
        this.f17809d = new AtomicReference<>();
    }
}
