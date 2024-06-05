package e3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import e3.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import k4.k0;
import k4.n0;
import q2.c;

/* compiled from: SynchronousMediaCodecAdapter */
public final class x implements l {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f17921a;

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer[] f17922b;

    /* renamed from: c  reason: collision with root package name */
    private ByteBuffer[] f17923c;

    /* compiled from: SynchronousMediaCodecAdapter */
    public static class b implements l.b {
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public e3.l a(e3.l.a r6) throws java.io.IOException {
            /*
                r5 = this;
                r0 = 0
                android.media.MediaCodec r1 = r5.b(r6)     // Catch:{ IOException -> 0x0030, RuntimeException -> 0x002e }
                java.lang.String r2 = "configureCodec"
                k4.k0.a(r2)     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                android.media.MediaFormat r2 = r6.f17846b     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                android.view.Surface r3 = r6.f17848d     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                android.media.MediaCrypto r4 = r6.f17849e     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                int r6 = r6.f17850f     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                r1.configure(r2, r3, r4, r6)     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                k4.k0.c()     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                java.lang.String r6 = "startCodec"
                k4.k0.a(r6)     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                r1.start()     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                k4.k0.c()     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                e3.x r6 = new e3.x     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                r6.<init>(r1)     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                return r6
            L_0x0029:
                r6 = move-exception
                goto L_0x002c
            L_0x002b:
                r6 = move-exception
            L_0x002c:
                r0 = r1
                goto L_0x0031
            L_0x002e:
                r6 = move-exception
                goto L_0x0031
            L_0x0030:
                r6 = move-exception
            L_0x0031:
                if (r0 == 0) goto L_0x0036
                r0.release()
            L_0x0036:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: e3.x.b.a(e3.l$a):e3.l");
        }

        /* access modifiers changed from: protected */
        public MediaCodec b(l.a aVar) throws IOException {
            k4.a.e(aVar.f17845a);
            String str = aVar.f17845a.f17853a;
            k0.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            k0.c();
            return createByCodecName;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p(l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    public boolean a() {
        return false;
    }

    public MediaFormat b() {
        return this.f17921a.getOutputFormat();
    }

    public void c(l.c cVar, Handler handler) {
        this.f17921a.setOnFrameRenderedListener(new w(this, cVar), handler);
    }

    public void d(int i10, int i11, c cVar, long j10, int i12) {
        this.f17921a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    public void e(Bundle bundle) {
        this.f17921a.setParameters(bundle);
    }

    public void f(int i10, long j10) {
        this.f17921a.releaseOutputBuffer(i10, j10);
    }

    public void flush() {
        this.f17921a.flush();
    }

    public int g() {
        return this.f17921a.dequeueInputBuffer(0);
    }

    public int h(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f17921a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && n0.f19738a < 21) {
                this.f17923c = this.f17921a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public void i(int i10, boolean z10) {
        this.f17921a.releaseOutputBuffer(i10, z10);
    }

    public void j(int i10) {
        this.f17921a.setVideoScalingMode(i10);
    }

    public ByteBuffer k(int i10) {
        if (n0.f19738a >= 21) {
            return this.f17921a.getInputBuffer(i10);
        }
        return ((ByteBuffer[]) n0.j(this.f17922b))[i10];
    }

    public void l(Surface surface) {
        this.f17921a.setOutputSurface(surface);
    }

    public void m(int i10, int i11, int i12, long j10, int i13) {
        this.f17921a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    public ByteBuffer n(int i10) {
        if (n0.f19738a >= 21) {
            return this.f17921a.getOutputBuffer(i10);
        }
        return ((ByteBuffer[]) n0.j(this.f17923c))[i10];
    }

    public void release() {
        this.f17922b = null;
        this.f17923c = null;
        this.f17921a.release();
    }

    private x(MediaCodec mediaCodec) {
        this.f17921a = mediaCodec;
        if (n0.f19738a < 21) {
            this.f17922b = mediaCodec.getInputBuffers();
            this.f17923c = mediaCodec.getOutputBuffers();
        }
    }
}
