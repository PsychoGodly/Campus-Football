package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.impl.cd;
import java.nio.ByteBuffer;

public class rl implements cd {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f11201a;

    /* renamed from: b  reason: collision with root package name */
    private final Surface f11202b;

    /* renamed from: c  reason: collision with root package name */
    private ByteBuffer[] f11203c;

    /* renamed from: d  reason: collision with root package name */
    private ByteBuffer[] f11204d;

    private static final class b {
        public static Surface a(MediaCodec mediaCodec) {
            return mediaCodec.createInputSurface();
        }
    }

    public static class c implements cd.b {
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.applovin.impl.cd a(com.applovin.impl.cd.a r8) {
            /*
                r7 = this;
                r0 = 0
                android.media.MediaCodec r1 = r7.b(r8)     // Catch:{ IOException -> 0x004f, RuntimeException -> 0x004c }
                java.lang.String r2 = "configureCodec"
                com.applovin.impl.lo.a(r2)     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                android.media.MediaFormat r2 = r8.f6973b     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                android.view.Surface r3 = r8.f6975d     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                android.media.MediaCrypto r4 = r8.f6976e     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                int r5 = r8.f6977f     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                r1.configure(r2, r3, r4, r5)     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                com.applovin.impl.lo.a()     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                boolean r8 = r8.f6978g     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                if (r8 == 0) goto L_0x002f
                int r8 = com.applovin.impl.yp.f13662a     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                r2 = 18
                if (r8 < r2) goto L_0x0027
                android.view.Surface r8 = com.applovin.impl.rl.b.a(r1)     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                goto L_0x0030
            L_0x0027:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                java.lang.String r2 = "Encoding from a surface is only supported on API 18 and up."
                r8.<init>(r2)     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                throw r8     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
            L_0x002f:
                r8 = r0
            L_0x0030:
                java.lang.String r2 = "startCodec"
                com.applovin.impl.lo.a(r2)     // Catch:{ IOException -> 0x0046, RuntimeException -> 0x0041 }
                r1.start()     // Catch:{ IOException -> 0x0046, RuntimeException -> 0x0041 }
                com.applovin.impl.lo.a()     // Catch:{ IOException -> 0x0046, RuntimeException -> 0x0041 }
                com.applovin.impl.rl r2 = new com.applovin.impl.rl     // Catch:{ IOException -> 0x0046, RuntimeException -> 0x0041 }
                r2.<init>(r1, r8)     // Catch:{ IOException -> 0x0046, RuntimeException -> 0x0041 }
                return r2
            L_0x0041:
                r0 = move-exception
            L_0x0042:
                r6 = r0
                r0 = r8
                r8 = r6
                goto L_0x0051
            L_0x0046:
                r0 = move-exception
                goto L_0x0042
            L_0x0048:
                r8 = move-exception
                goto L_0x0051
            L_0x004a:
                r8 = move-exception
                goto L_0x0051
            L_0x004c:
                r8 = move-exception
            L_0x004d:
                r1 = r0
                goto L_0x0051
            L_0x004f:
                r8 = move-exception
                goto L_0x004d
            L_0x0051:
                if (r0 == 0) goto L_0x0056
                r0.release()
            L_0x0056:
                if (r1 == 0) goto L_0x005b
                r1.release()
            L_0x005b:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.rl.c.a(com.applovin.impl.cd$a):com.applovin.impl.cd");
        }

        /* access modifiers changed from: protected */
        public MediaCodec b(cd.a aVar) {
            a1.a((Object) aVar.f6972a);
            String str = aVar.f6972a.f7722a;
            lo.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            lo.a();
            return createByCodecName;
        }
    }

    private rl(MediaCodec mediaCodec, Surface surface) {
        this.f11201a = mediaCodec;
        this.f11202b = surface;
        if (yp.f13662a < 21) {
            this.f11203c = mediaCodec.getInputBuffers();
            this.f11204d = mediaCodec.getOutputBuffers();
        }
    }

    public int a(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f11201a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && yp.f13662a < 21) {
                this.f11204d = this.f11201a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public void b() {
        this.f11201a.flush();
    }

    public void c(int i10) {
        this.f11201a.setVideoScalingMode(i10);
    }

    public boolean c() {
        return false;
    }

    public int d() {
        return this.f11201a.dequeueInputBuffer(0);
    }

    public MediaFormat e() {
        return this.f11201a.getOutputFormat();
    }

    public ByteBuffer b(int i10) {
        if (yp.f13662a >= 21) {
            return this.f11201a.getOutputBuffer(i10);
        }
        return ((ByteBuffer[]) yp.a((Object) this.f11204d))[i10];
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(cd.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    public void a(int i10, int i11, int i12, long j10, int i13) {
        this.f11201a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    public void a(int i10, int i11, y4 y4Var, long j10, int i12) {
        this.f11201a.queueSecureInputBuffer(i10, i11, y4Var.a(), j10, i12);
    }

    public void a() {
        this.f11203c = null;
        this.f11204d = null;
        Surface surface = this.f11202b;
        if (surface != null) {
            surface.release();
        }
        this.f11201a.release();
    }

    public void a(int i10, long j10) {
        this.f11201a.releaseOutputBuffer(i10, j10);
    }

    public void a(int i10, boolean z10) {
        this.f11201a.releaseOutputBuffer(i10, z10);
    }

    public void a(cd.c cVar, Handler handler) {
        this.f11201a.setOnFrameRenderedListener(new g40(this, cVar), handler);
    }

    public void a(Surface surface) {
        this.f11201a.setOutputSurface(surface);
    }

    public void a(Bundle bundle) {
        this.f11201a.setParameters(bundle);
    }

    public ByteBuffer a(int i10) {
        if (yp.f13662a >= 21) {
            return this.f11201a.getInputBuffer(i10);
        }
        return ((ByteBuffer[]) yp.a((Object) this.f11203c))[i10];
    }
}
