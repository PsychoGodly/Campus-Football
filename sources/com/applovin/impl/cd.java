package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.impl.rl;
import java.nio.ByteBuffer;

public interface cd {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final fd f6972a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaFormat f6973b;

        /* renamed from: c  reason: collision with root package name */
        public final d9 f6974c;

        /* renamed from: d  reason: collision with root package name */
        public final Surface f6975d;

        /* renamed from: e  reason: collision with root package name */
        public final MediaCrypto f6976e;

        /* renamed from: f  reason: collision with root package name */
        public final int f6977f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f6978g;

        private a(fd fdVar, MediaFormat mediaFormat, d9 d9Var, Surface surface, MediaCrypto mediaCrypto, int i10, boolean z10) {
            this.f6972a = fdVar;
            this.f6973b = mediaFormat;
            this.f6974c = d9Var;
            this.f6975d = surface;
            this.f6976e = mediaCrypto;
            this.f6977f = i10;
            this.f6978g = z10;
        }

        public static a a(fd fdVar, MediaFormat mediaFormat, d9 d9Var, MediaCrypto mediaCrypto) {
            return new a(fdVar, mediaFormat, d9Var, (Surface) null, mediaCrypto, 0, false);
        }

        public static a a(fd fdVar, MediaFormat mediaFormat, d9 d9Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(fdVar, mediaFormat, d9Var, surface, mediaCrypto, 0, false);
        }
    }

    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f6979a = new rl.c();

        cd a(a aVar);
    }

    public interface c {
        void a(cd cdVar, long j10, long j11);
    }

    int a(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer a(int i10);

    void a();

    void a(int i10, int i11, int i12, long j10, int i13);

    void a(int i10, int i11, y4 y4Var, long j10, int i12);

    void a(int i10, long j10);

    void a(int i10, boolean z10);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(c cVar, Handler handler);

    ByteBuffer b(int i10);

    void b();

    void c(int i10);

    boolean c();

    int d();

    MediaFormat e();
}
