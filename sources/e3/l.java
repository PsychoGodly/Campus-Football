package e3;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import n2.r1;

/* compiled from: MediaCodecAdapter */
public interface l {

    /* compiled from: MediaCodecAdapter */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final n f17845a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaFormat f17846b;

        /* renamed from: c  reason: collision with root package name */
        public final r1 f17847c;

        /* renamed from: d  reason: collision with root package name */
        public final Surface f17848d;

        /* renamed from: e  reason: collision with root package name */
        public final MediaCrypto f17849e;

        /* renamed from: f  reason: collision with root package name */
        public final int f17850f;

        private a(n nVar, MediaFormat mediaFormat, r1 r1Var, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.f17845a = nVar;
            this.f17846b = mediaFormat;
            this.f17847c = r1Var;
            this.f17848d = surface;
            this.f17849e = mediaCrypto;
            this.f17850f = i10;
        }

        public static a a(n nVar, MediaFormat mediaFormat, r1 r1Var, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, r1Var, (Surface) null, mediaCrypto, 0);
        }

        public static a b(n nVar, MediaFormat mediaFormat, r1 r1Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, r1Var, surface, mediaCrypto, 0);
        }
    }

    /* compiled from: MediaCodecAdapter */
    public interface b {
        l a(a aVar) throws IOException;
    }

    /* compiled from: MediaCodecAdapter */
    public interface c {
        void a(l lVar, long j10, long j11);
    }

    boolean a();

    MediaFormat b();

    void c(c cVar, Handler handler);

    void d(int i10, int i11, q2.c cVar, long j10, int i12);

    void e(Bundle bundle);

    void f(int i10, long j10);

    void flush();

    int g();

    int h(MediaCodec.BufferInfo bufferInfo);

    void i(int i10, boolean z10);

    void j(int i10);

    ByteBuffer k(int i10);

    void l(Surface surface);

    void m(int i10, int i11, int i12, long j10, int i13);

    ByteBuffer n(int i10);

    void release();
}
