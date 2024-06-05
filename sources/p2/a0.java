package p2;

import java.nio.ByteBuffer;
import k4.a;
import p2.g;

/* compiled from: ChannelMappingAudioProcessor */
final class a0 extends z {

    /* renamed from: i  reason: collision with root package name */
    private int[] f21133i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f21134j;

    a0() {
    }

    public void c(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) a.e(this.f21134j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer k10 = k(((limit - position) / this.f21390b.f21268d) * this.f21391c.f21268d);
        while (position < limit) {
            for (int i10 : iArr) {
                k10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f21390b.f21268d;
        }
        byteBuffer.position(limit);
        k10.flip();
    }

    public g.a g(g.a aVar) throws g.b {
        int[] iArr = this.f21133i;
        if (iArr == null) {
            return g.a.f21264e;
        }
        if (aVar.f21267c == 2) {
            boolean z10 = aVar.f21266b != iArr.length;
            int i10 = 0;
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 < aVar.f21266b) {
                    z10 |= i11 != i10;
                    i10++;
                } else {
                    throw new g.b(aVar);
                }
            }
            if (z10) {
                return new g.a(aVar.f21265a, iArr.length, 2);
            }
            return g.a.f21264e;
        }
        throw new g.b(aVar);
    }

    /* access modifiers changed from: protected */
    public void h() {
        this.f21134j = this.f21133i;
    }

    /* access modifiers changed from: protected */
    public void j() {
        this.f21134j = null;
        this.f21133i = null;
    }

    public void l(int[] iArr) {
        this.f21133i = iArr;
    }
}
