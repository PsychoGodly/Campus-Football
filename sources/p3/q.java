package p3;

import android.net.Uri;
import j4.p;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LoadEventInfo */
public final class q {

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicLong f21610h = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final long f21611a;

    /* renamed from: b  reason: collision with root package name */
    public final p f21612b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f21613c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, List<String>> f21614d;

    /* renamed from: e  reason: collision with root package name */
    public final long f21615e;

    /* renamed from: f  reason: collision with root package name */
    public final long f21616f;

    /* renamed from: g  reason: collision with root package name */
    public final long f21617g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q(long r13, j4.p r15, long r16) {
        /*
            r12 = this;
            r3 = r15
            android.net.Uri r4 = r3.f19387a
            java.util.Map r5 = java.util.Collections.emptyMap()
            r8 = 0
            r10 = 0
            r0 = r12
            r1 = r13
            r6 = r16
            r0.<init>(r1, r3, r4, r5, r6, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.q.<init>(long, j4.p, long):void");
    }

    public static long a() {
        return f21610h.getAndIncrement();
    }

    public q(long j10, p pVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f21611a = j10;
        this.f21612b = pVar;
        this.f21613c = uri;
        this.f21614d = map;
        this.f21615e = j11;
        this.f21616f = j12;
        this.f21617g = j13;
    }
}
