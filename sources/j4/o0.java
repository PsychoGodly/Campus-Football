package j4;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k4.a;

/* compiled from: StatsDataSource */
public final class o0 implements l {

    /* renamed from: a  reason: collision with root package name */
    private final l f19383a;

    /* renamed from: b  reason: collision with root package name */
    private long f19384b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f19385c = Uri.EMPTY;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, List<String>> f19386d = Collections.emptyMap();

    public o0(l lVar) {
        this.f19383a = (l) a.e(lVar);
    }

    public void close() throws IOException {
        this.f19383a.close();
    }

    public void e(p0 p0Var) {
        a.e(p0Var);
        this.f19383a.e(p0Var);
    }

    public long f(p pVar) throws IOException {
        this.f19385c = pVar.f19387a;
        this.f19386d = Collections.emptyMap();
        long f10 = this.f19383a.f(pVar);
        this.f19385c = (Uri) a.e(o());
        this.f19386d = k();
        return f10;
    }

    public Map<String, List<String>> k() {
        return this.f19383a.k();
    }

    public Uri o() {
        return this.f19383a.o();
    }

    public long q() {
        return this.f19384b;
    }

    public Uri r() {
        return this.f19385c;
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = this.f19383a.read(bArr, i10, i11);
        if (read != -1) {
            this.f19384b += (long) read;
        }
        return read;
    }

    public Map<String, List<String>> s() {
        return this.f19386d;
    }

    public void t() {
        this.f19384b = 0;
    }
}
