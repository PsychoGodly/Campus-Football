package p3;

import android.net.Uri;
import j4.i;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import o2.u1;
import s2.a0;
import s2.n;

/* compiled from: ProgressiveMediaExtractor */
public interface f0 {

    /* compiled from: ProgressiveMediaExtractor */
    public interface a {
        f0 a(u1 u1Var);
    }

    void c(long j10, long j11);

    int d(a0 a0Var) throws IOException;

    long e();

    void f();

    void g(i iVar, Uri uri, Map<String, List<String>> map, long j10, long j11, n nVar) throws IOException;

    void release();
}
