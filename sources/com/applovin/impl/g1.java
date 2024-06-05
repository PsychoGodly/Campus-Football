package com.applovin.impl;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

class g1 {

    /* renamed from: h  reason: collision with root package name */
    private static final ArrayDeque f7876h = new ArrayDeque();

    /* renamed from: i  reason: collision with root package name */
    private static final Object f7877i = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f7878a;

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f7879b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f7880c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference f7881d;

    /* renamed from: e  reason: collision with root package name */
    private final a4 f7882e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f7883f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7884g;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            g1.this.a(message);
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f7886a;

        /* renamed from: b  reason: collision with root package name */
        public int f7887b;

        /* renamed from: c  reason: collision with root package name */
        public int f7888c;

        /* renamed from: d  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f7889d = new MediaCodec.CryptoInfo();

        /* renamed from: e  reason: collision with root package name */
        public long f7890e;

        /* renamed from: f  reason: collision with root package name */
        public int f7891f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f7886a = i10;
            this.f7887b = i11;
            this.f7888c = i12;
            this.f7890e = j10;
            this.f7891f = i13;
        }
    }

    public g1(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z10) {
        this(mediaCodec, handlerThread, z10, new a4());
    }

    private void c() {
        ((Handler) yp.a((Object) this.f7880c)).removeCallbacksAndMessages((Object) null);
        a();
        e();
    }

    private static b d() {
        ArrayDeque arrayDeque = f7876h;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                b bVar = new b();
                return bVar;
            }
            b bVar2 = (b) arrayDeque.removeFirst();
            return bVar2;
        }
    }

    private void e() {
        RuntimeException runtimeException = (RuntimeException) this.f7881d.getAndSet((Object) null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    private static boolean f() {
        String lowerCase = Ascii.toLowerCase(yp.f13664c);
        return lowerCase.contains("samsung") || lowerCase.contains("motorola");
    }

    public void b() {
        if (this.f7884g) {
            try {
                c();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void g() {
        if (this.f7884g) {
            b();
            this.f7879b.quit();
        }
        this.f7884g = false;
    }

    public void h() {
        if (!this.f7884g) {
            this.f7879b.start();
            this.f7880c = new a(this.f7879b.getLooper());
            this.f7884g = true;
        }
    }

    public void i() {
        a();
    }

    g1(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z10, a4 a4Var) {
        this.f7878a = mediaCodec;
        this.f7879b = handlerThread;
        this.f7882e = a4Var;
        this.f7881d = new AtomicReference();
        this.f7883f = z10 || f();
    }

    private void a() {
        this.f7882e.c();
        ((Handler) yp.a((Object) this.f7880c)).obtainMessage(2).sendToTarget();
        this.f7882e.a();
    }

    private static void a(y4 y4Var, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = y4Var.f13505f;
        cryptoInfo.numBytesOfClearData = a(y4Var.f13503d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = a(y4Var.f13504e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) a1.a((Object) a(y4Var.f13501b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) a1.a((Object) a(y4Var.f13500a, cryptoInfo.iv));
        cryptoInfo.mode = y4Var.f13502c;
        if (yp.f13662a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(y4Var.f13506g, y4Var.f13507h));
        }
    }

    public void b(int i10, int i11, int i12, long j10, int i13) {
        e();
        b d10 = d();
        d10.a(i10, i11, i12, j10, i13);
        ((Handler) yp.a((Object) this.f7880c)).obtainMessage(0, d10).sendToTarget();
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] a(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* access modifiers changed from: private */
    public void a(Message message) {
        b bVar;
        int i10 = message.what;
        if (i10 == 0) {
            bVar = (b) message.obj;
            a(bVar.f7886a, bVar.f7887b, bVar.f7888c, bVar.f7890e, bVar.f7891f);
        } else if (i10 != 1) {
            if (i10 != 2) {
                a((RuntimeException) new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f7882e.e();
            }
            bVar = null;
        } else {
            bVar = (b) message.obj;
            a(bVar.f7886a, bVar.f7887b, bVar.f7889d, bVar.f7890e, bVar.f7891f);
        }
        if (bVar != null) {
            a(bVar);
        }
    }

    private void a(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f7878a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            a(e10);
        }
    }

    private void a(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            if (this.f7883f) {
                synchronized (f7877i) {
                    this.f7878a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
                }
                return;
            }
            this.f7878a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
        } catch (RuntimeException e10) {
            a(e10);
        }
    }

    public void a(int i10, int i11, y4 y4Var, long j10, int i12) {
        e();
        b d10 = d();
        d10.a(i10, i11, 0, j10, i12);
        a(y4Var, d10.f7889d);
        ((Handler) yp.a((Object) this.f7880c)).obtainMessage(1, d10).sendToTarget();
    }

    /* access modifiers changed from: package-private */
    public void a(RuntimeException runtimeException) {
        this.f7881d.set(runtimeException);
    }

    private static void a(b bVar) {
        ArrayDeque arrayDeque = f7876h;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }
}
