package j4;

import java.io.IOException;
import p3.q;
import p3.t;

/* compiled from: LoadErrorHandlingPolicy */
public interface g0 {

    /* compiled from: LoadErrorHandlingPolicy */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f19311a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19312b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19313c;

        /* renamed from: d  reason: collision with root package name */
        public final int f19314d;

        public a(int i10, int i11, int i12, int i13) {
            this.f19311a = i10;
            this.f19312b = i11;
            this.f19313c = i12;
            this.f19314d = i13;
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(int r4) {
            /*
                r3 = this;
                r0 = 0
                r1 = 1
                if (r4 != r1) goto L_0x000c
                int r4 = r3.f19311a
                int r2 = r3.f19312b
                int r4 = r4 - r2
                if (r4 <= r1) goto L_0x0014
                goto L_0x0013
            L_0x000c:
                int r4 = r3.f19313c
                int r2 = r3.f19314d
                int r4 = r4 - r2
                if (r4 <= r1) goto L_0x0014
            L_0x0013:
                r0 = 1
            L_0x0014:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: j4.g0.a.a(int):boolean");
        }
    }

    /* compiled from: LoadErrorHandlingPolicy */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f19315a;

        /* renamed from: b  reason: collision with root package name */
        public final long f19316b;

        public b(int i10, long j10) {
            k4.a.a(j10 >= 0);
            this.f19315a = i10;
            this.f19316b = j10;
        }
    }

    /* compiled from: LoadErrorHandlingPolicy */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final q f19317a;

        /* renamed from: b  reason: collision with root package name */
        public final t f19318b;

        /* renamed from: c  reason: collision with root package name */
        public final IOException f19319c;

        /* renamed from: d  reason: collision with root package name */
        public final int f19320d;

        public c(q qVar, t tVar, IOException iOException, int i10) {
            this.f19317a = qVar;
            this.f19318b = tVar;
            this.f19319c = iOException;
            this.f19320d = i10;
        }
    }

    b a(a aVar, c cVar);

    void b(long j10);

    long c(c cVar);

    int d(int i10);
}
