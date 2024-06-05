package q2;

import java.nio.ByteBuffer;
import n2.o1;

/* compiled from: DecoderInputBuffer */
public class g extends a {

    /* renamed from: b  reason: collision with root package name */
    public final c f21754b;

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer f21755c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f21756d;

    /* renamed from: f  reason: collision with root package name */
    public long f21757f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f21758g;

    /* renamed from: h  reason: collision with root package name */
    private final int f21759h;

    /* renamed from: i  reason: collision with root package name */
    private final int f21760i;

    /* compiled from: DecoderInputBuffer */
    public static final class a extends IllegalStateException {

        /* renamed from: a  reason: collision with root package name */
        public final int f21761a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21762b;

        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f21761a = i10;
            this.f21762b = i11;
        }
    }

    static {
        o1.a("goog.exo.decoder");
    }

    public g(int i10) {
        this(i10, 0);
    }

    private ByteBuffer q(int i10) {
        int i11 = this.f21759h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f21755c;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public static g u() {
        return new g(0);
    }

    public void g() {
        super.g();
        ByteBuffer byteBuffer = this.f21755c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f21758g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f21756d = false;
    }

    public void r(int i10) {
        int i11 = i10 + this.f21760i;
        ByteBuffer byteBuffer = this.f21755c;
        if (byteBuffer == null) {
            this.f21755c = q(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f21755c = byteBuffer;
            return;
        }
        ByteBuffer q10 = q(i12);
        q10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            q10.put(byteBuffer);
        }
        this.f21755c = q10;
    }

    public final void s() {
        ByteBuffer byteBuffer = this.f21755c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f21758g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean t() {
        return i(1073741824);
    }

    public void v(int i10) {
        ByteBuffer byteBuffer = this.f21758g;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f21758g = ByteBuffer.allocate(i10);
        } else {
            this.f21758g.clear();
        }
    }

    public g(int i10, int i11) {
        this.f21754b = new c();
        this.f21759h = i10;
        this.f21760i = i11;
    }
}
