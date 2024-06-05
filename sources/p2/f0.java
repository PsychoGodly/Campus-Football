package p2;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import k4.n0;
import p2.g;

/* compiled from: FloatResamplingAudioProcessor */
final class f0 extends z {

    /* renamed from: i  reason: collision with root package name */
    private static final int f21262i = Float.floatToIntBits(Float.NaN);

    f0() {
    }

    private static void l(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (floatToIntBits == f21262i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    public void c(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f21390b.f21267c;
        if (i11 == 536870912) {
            byteBuffer2 = k((i10 / 3) * 4);
            while (position < limit) {
                l(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << Ascii.DLE) | ((byteBuffer.get(position + 2) & 255) << Ascii.CAN), byteBuffer2);
                position += 3;
            }
        } else if (i11 == 805306368) {
            byteBuffer2 = k(i10);
            while (position < limit) {
                l((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << Ascii.DLE) | ((byteBuffer.get(position + 3) & 255) << Ascii.CAN), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    public g.a g(g.a aVar) throws g.b {
        int i10 = aVar.f21267c;
        if (!n0.t0(i10)) {
            throw new g.b(aVar);
        } else if (i10 != 4) {
            return new g.a(aVar.f21265a, aVar.f21266b, 4);
        } else {
            return g.a.f21264e;
        }
    }
}
