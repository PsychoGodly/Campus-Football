package u3;

import android.text.TextUtils;
import h4.i;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.a;
import k4.a0;
import k4.j0;
import n2.r1;
import n2.y2;
import s2.b0;
import s2.e0;
import s2.l;
import s2.m;
import s2.n;

/* compiled from: WebvttExtractor */
public final class t implements l {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f22974g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f22975h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a  reason: collision with root package name */
    private final String f22976a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f22977b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f22978c = new a0();

    /* renamed from: d  reason: collision with root package name */
    private n f22979d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f22980e = new byte[1024];

    /* renamed from: f  reason: collision with root package name */
    private int f22981f;

    public t(String str, j0 j0Var) {
        this.f22976a = str;
        this.f22977b = j0Var;
    }

    private e0 a(long j10) {
        e0 e10 = this.f22979d.e(0, 3);
        e10.a(new r1.b().g0("text/vtt").X(this.f22976a).k0(j10).G());
        this.f22979d.q();
        return e10;
    }

    private void d() throws y2 {
        a0 a0Var = new a0(this.f22980e);
        i.e(a0Var);
        long j10 = 0;
        long j11 = 0;
        for (String r10 = a0Var.r(); !TextUtils.isEmpty(r10); r10 = a0Var.r()) {
            if (r10.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f22974g.matcher(r10);
                if (matcher.find()) {
                    Matcher matcher2 = f22975h.matcher(r10);
                    if (matcher2.find()) {
                        j11 = i.d((String) a.e(matcher.group(1)));
                        j10 = j0.f(Long.parseLong((String) a.e(matcher2.group(1))));
                    } else {
                        throw y2.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + r10, (Throwable) null);
                    }
                } else {
                    throw y2.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + r10, (Throwable) null);
                }
            }
        }
        Matcher a10 = i.a(a0Var);
        if (a10 == null) {
            a(0);
            return;
        }
        long d10 = i.d((String) a.e(a10.group(1)));
        long b10 = this.f22977b.b(j0.j((j10 + d10) - j11));
        e0 a11 = a(b10 - d10);
        this.f22978c.R(this.f22980e, this.f22981f);
        a11.d(this.f22978c, this.f22981f);
        a11.b(b10, 1, this.f22981f, 0, (e0.a) null);
    }

    public void b(n nVar) {
        this.f22979d = nVar;
        nVar.j(new b0.b(-9223372036854775807L));
    }

    public void c(long j10, long j11) {
        throw new IllegalStateException();
    }

    public boolean e(m mVar) throws IOException {
        mVar.g(this.f22980e, 0, 6, false);
        this.f22978c.R(this.f22980e, 6);
        if (i.b(this.f22978c)) {
            return true;
        }
        mVar.g(this.f22980e, 6, 3, false);
        this.f22978c.R(this.f22980e, 9);
        return i.b(this.f22978c);
    }

    public int g(m mVar, s2.a0 a0Var) throws IOException {
        int i10;
        a.e(this.f22979d);
        int b10 = (int) mVar.b();
        int i11 = this.f22981f;
        byte[] bArr = this.f22980e;
        if (i11 == bArr.length) {
            if (b10 != -1) {
                i10 = b10;
            } else {
                i10 = bArr.length;
            }
            this.f22980e = Arrays.copyOf(bArr, (i10 * 3) / 2);
        }
        byte[] bArr2 = this.f22980e;
        int i12 = this.f22981f;
        int read = mVar.read(bArr2, i12, bArr2.length - i12);
        if (read != -1) {
            int i13 = this.f22981f + read;
            this.f22981f = i13;
            if (b10 == -1 || i13 != b10) {
                return 0;
            }
        }
        d();
        return -1;
    }

    public void release() {
    }
}
