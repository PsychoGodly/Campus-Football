package p2;

import java.nio.ByteBuffer;
import k4.a;
import k4.n0;
import p2.g;

/* compiled from: SilenceSkippingAudioProcessor */
public final class k0 extends z {

    /* renamed from: i  reason: collision with root package name */
    private final long f21284i;

    /* renamed from: j  reason: collision with root package name */
    private final long f21285j;

    /* renamed from: k  reason: collision with root package name */
    private final short f21286k;

    /* renamed from: l  reason: collision with root package name */
    private int f21287l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f21288m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f21289n;

    /* renamed from: o  reason: collision with root package name */
    private byte[] f21290o;

    /* renamed from: p  reason: collision with root package name */
    private int f21291p;

    /* renamed from: q  reason: collision with root package name */
    private int f21292q;

    /* renamed from: r  reason: collision with root package name */
    private int f21293r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f21294s;

    /* renamed from: t  reason: collision with root package name */
    private long f21295t;

    public k0() {
        this(150000, 20000, 1024);
    }

    private int l(long j10) {
        return (int) ((j10 * ((long) this.f21390b.f21265a)) / 1000000);
    }

    private int m(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
            if (Math.abs(byteBuffer.getShort(limit)) > this.f21286k) {
                int i10 = this.f21287l;
                return ((limit / i10) * i10) + i10;
            }
        }
    }

    private int n(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > this.f21286k) {
                int i10 = this.f21287l;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    private void p(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        k(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f21294s = true;
        }
    }

    private void q(byte[] bArr, int i10) {
        k(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f21294s = true;
        }
    }

    private void r(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int n10 = n(byteBuffer);
        int position = n10 - byteBuffer.position();
        byte[] bArr = this.f21289n;
        int length = bArr.length;
        int i10 = this.f21292q;
        int i11 = length - i10;
        if (n10 >= limit || position >= i11) {
            int min = Math.min(position, i11);
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer.get(this.f21289n, this.f21292q, min);
            int i12 = this.f21292q + min;
            this.f21292q = i12;
            byte[] bArr2 = this.f21289n;
            if (i12 == bArr2.length) {
                if (this.f21294s) {
                    q(bArr2, this.f21293r);
                    this.f21295t += (long) ((this.f21292q - (this.f21293r * 2)) / this.f21287l);
                } else {
                    this.f21295t += (long) ((i12 - this.f21293r) / this.f21287l);
                }
                v(byteBuffer, this.f21289n, this.f21292q);
                this.f21292q = 0;
                this.f21291p = 2;
            }
            byteBuffer.limit(limit);
            return;
        }
        q(bArr, i10);
        this.f21292q = 0;
        this.f21291p = 0;
    }

    private void s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f21289n.length));
        int m10 = m(byteBuffer);
        if (m10 == byteBuffer.position()) {
            this.f21291p = 1;
        } else {
            byteBuffer.limit(m10);
            p(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int n10 = n(byteBuffer);
        byteBuffer.limit(n10);
        this.f21295t += (long) (byteBuffer.remaining() / this.f21287l);
        v(byteBuffer, this.f21290o, this.f21293r);
        if (n10 < limit) {
            q(this.f21290o, this.f21293r);
            this.f21291p = 0;
            byteBuffer.limit(limit);
        }
    }

    private void v(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f21293r);
        int i11 = this.f21293r - min;
        System.arraycopy(bArr, i10 - i11, this.f21290o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f21290o, i11, min);
    }

    public void c(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !f()) {
            int i10 = this.f21291p;
            if (i10 == 0) {
                s(byteBuffer);
            } else if (i10 == 1) {
                r(byteBuffer);
            } else if (i10 == 2) {
                t(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public g.a g(g.a aVar) throws g.b {
        if (aVar.f21267c == 2) {
            return this.f21288m ? aVar : g.a.f21264e;
        }
        throw new g.b(aVar);
    }

    /* access modifiers changed from: protected */
    public void h() {
        if (this.f21288m) {
            this.f21287l = this.f21390b.f21268d;
            int l10 = l(this.f21284i) * this.f21287l;
            if (this.f21289n.length != l10) {
                this.f21289n = new byte[l10];
            }
            int l11 = l(this.f21285j) * this.f21287l;
            this.f21293r = l11;
            if (this.f21290o.length != l11) {
                this.f21290o = new byte[l11];
            }
        }
        this.f21291p = 0;
        this.f21295t = 0;
        this.f21292q = 0;
        this.f21294s = false;
    }

    /* access modifiers changed from: protected */
    public void i() {
        int i10 = this.f21292q;
        if (i10 > 0) {
            q(this.f21289n, i10);
        }
        if (!this.f21294s) {
            this.f21295t += (long) (this.f21293r / this.f21287l);
        }
    }

    public boolean isActive() {
        return this.f21288m;
    }

    /* access modifiers changed from: protected */
    public void j() {
        this.f21288m = false;
        this.f21293r = 0;
        byte[] bArr = n0.f19743f;
        this.f21289n = bArr;
        this.f21290o = bArr;
    }

    public long o() {
        return this.f21295t;
    }

    public void u(boolean z10) {
        this.f21288m = z10;
    }

    public k0(long j10, long j11, short s10) {
        a.a(j11 <= j10);
        this.f21284i = j10;
        this.f21285j = j11;
        this.f21286k = s10;
        byte[] bArr = n0.f19743f;
        this.f21289n = bArr;
        this.f21290o = bArr;
    }
}
