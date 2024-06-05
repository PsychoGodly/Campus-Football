package o2;

import android.media.metrics.LogSessionId;
import k4.n0;

/* compiled from: PlayerId */
public final class u1 {

    /* renamed from: b  reason: collision with root package name */
    public static final u1 f21065b = (n0.f19738a < 31 ? new u1() : new u1(a.f21067b));

    /* renamed from: a  reason: collision with root package name */
    private final a f21066a;

    /* compiled from: PlayerId */
    private static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f21067b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* renamed from: a  reason: collision with root package name */
        public final LogSessionId f21068a;

        public a(LogSessionId logSessionId) {
            this.f21068a = logSessionId;
        }
    }

    public u1() {
        this((a) null);
        k4.a.f(n0.f19738a < 31);
    }

    public LogSessionId a() {
        return ((a) k4.a.e(this.f21066a)).f21068a;
    }

    public u1(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    private u1(a aVar) {
        this.f21066a = aVar;
    }
}
