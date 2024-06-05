package p2;

import java.nio.ByteBuffer;
import p2.g;

/* compiled from: TrimmingAudioProcessor */
final class n0 extends z {

    /* renamed from: i  reason: collision with root package name */
    private int f21333i;

    /* renamed from: j  reason: collision with root package name */
    private int f21334j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f21335k;

    /* renamed from: l  reason: collision with root package name */
    private int f21336l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f21337m = k4.n0.f19743f;

    /* renamed from: n  reason: collision with root package name */
    private int f21338n;

    /* renamed from: o  reason: collision with root package name */
    private long f21339o;

    public ByteBuffer a() {
        int i10;
        if (super.b() && (i10 = this.f21338n) > 0) {
            k(i10).put(this.f21337m, 0, this.f21338n).flip();
            this.f21338n = 0;
        }
        return super.a();
    }

    public boolean b() {
        return super.b() && this.f21338n == 0;
    }

    public void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            int min = Math.min(i10, this.f21336l);
            this.f21339o += (long) (min / this.f21390b.f21268d);
            this.f21336l -= min;
            byteBuffer.position(position + min);
            if (this.f21336l <= 0) {
                int i11 = i10 - min;
                int length = (this.f21338n + i11) - this.f21337m.length;
                ByteBuffer k10 = k(length);
                int q10 = k4.n0.q(length, 0, this.f21338n);
                k10.put(this.f21337m, 0, q10);
                int q11 = k4.n0.q(length - q10, 0, i11);
                byteBuffer.limit(byteBuffer.position() + q11);
                k10.put(byteBuffer);
                byteBuffer.limit(limit);
                int i12 = i11 - q11;
                int i13 = this.f21338n - q10;
                this.f21338n = i13;
                byte[] bArr = this.f21337m;
                System.arraycopy(bArr, q10, bArr, 0, i13);
                byteBuffer.get(this.f21337m, this.f21338n, i12);
                this.f21338n += i12;
                k10.flip();
            }
        }
    }

    public g.a g(g.a aVar) throws g.b {
        if (aVar.f21267c == 2) {
            this.f21335k = true;
            return (this.f21333i == 0 && this.f21334j == 0) ? g.a.f21264e : aVar;
        }
        throw new g.b(aVar);
    }

    /* access modifiers changed from: protected */
    public void h() {
        if (this.f21335k) {
            this.f21335k = false;
            int i10 = this.f21334j;
            int i11 = this.f21390b.f21268d;
            this.f21337m = new byte[(i10 * i11)];
            this.f21336l = this.f21333i * i11;
        }
        this.f21338n = 0;
    }

    /* access modifiers changed from: protected */
    public void i() {
        if (this.f21335k) {
            int i10 = this.f21338n;
            if (i10 > 0) {
                this.f21339o += (long) (i10 / this.f21390b.f21268d);
            }
            this.f21338n = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void j() {
        this.f21337m = k4.n0.f19743f;
    }

    public long l() {
        return this.f21339o;
    }

    public void m() {
        this.f21339o = 0;
    }

    public void n(int i10, int i11) {
        this.f21333i = i10;
        this.f21334j = i11;
    }
}
