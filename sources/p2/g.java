package p2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import k4.n0;
import r6.k;

/* compiled from: AudioProcessor */
public interface g {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f21263a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* compiled from: AudioProcessor */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f21264e = new a(-1, -1, -1);

        /* renamed from: a  reason: collision with root package name */
        public final int f21265a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21266b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21267c;

        /* renamed from: d  reason: collision with root package name */
        public final int f21268d;

        public a(int i10, int i11, int i12) {
            this.f21265a = i10;
            this.f21266b = i11;
            this.f21267c = i12;
            this.f21268d = n0.u0(i12) ? n0.d0(i12, i11) : -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f21265a == aVar.f21265a && this.f21266b == aVar.f21266b && this.f21267c == aVar.f21267c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return k.b(Integer.valueOf(this.f21265a), Integer.valueOf(this.f21266b), Integer.valueOf(this.f21267c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f21265a + ", channelCount=" + this.f21266b + ", encoding=" + this.f21267c + ']';
        }
    }

    /* compiled from: AudioProcessor */
    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    ByteBuffer a();

    boolean b();

    void c(ByteBuffer byteBuffer);

    a d(a aVar) throws b;

    void e();

    void flush();

    boolean isActive();

    void reset();
}
