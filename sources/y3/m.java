package y3;

import java.util.List;
import k4.a;
import q2.h;

/* compiled from: SubtitleOutputBuffer */
public abstract class m extends h implements h {

    /* renamed from: d  reason: collision with root package name */
    private h f23880d;

    /* renamed from: f  reason: collision with root package name */
    private long f23881f;

    public int a(long j10) {
        return ((h) a.e(this.f23880d)).a(j10 - this.f23881f);
    }

    public long c(int i10) {
        return ((h) a.e(this.f23880d)).c(i10) + this.f23881f;
    }

    public List<b> d(long j10) {
        return ((h) a.e(this.f23880d)).d(j10 - this.f23881f);
    }

    public int e() {
        return ((h) a.e(this.f23880d)).e();
    }

    public void g() {
        super.g();
        this.f23880d = null;
    }

    public void r(long j10, h hVar, long j11) {
        this.f21763b = j10;
        this.f23880d = hVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f23881f = j10;
    }
}
