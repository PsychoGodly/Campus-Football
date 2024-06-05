package lc;

import java.nio.ByteBuffer;

/* compiled from: BinaryMessenger */
public interface c {

    /* compiled from: BinaryMessenger */
    public interface a {
        void a(ByteBuffer byteBuffer, b bVar);
    }

    /* compiled from: BinaryMessenger */
    public interface b {
        void a(ByteBuffer byteBuffer);
    }

    /* renamed from: lc.c$c  reason: collision with other inner class name */
    /* compiled from: BinaryMessenger */
    public interface C0412c {
    }

    /* compiled from: BinaryMessenger */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private boolean f36102a = true;

        public boolean a() {
            return this.f36102a;
        }
    }

    C0412c a(d dVar);

    C0412c b();

    void d(String str, ByteBuffer byteBuffer, b bVar);

    void e(String str, a aVar, C0412c cVar);

    void f(String str, ByteBuffer byteBuffer);

    void i(String str, a aVar);
}
