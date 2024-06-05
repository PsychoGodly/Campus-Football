package fd;

import com.applovin.sdk.AppLovinEventTypes;
import hd.d;
import hd.i;
import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lf.c;
import lf.f;
import r6.o;

/* compiled from: OkHttpFrameLogger */
class j {

    /* renamed from: a  reason: collision with root package name */
    private final Logger f32723a;

    /* renamed from: b  reason: collision with root package name */
    private final Level f32724b;

    /* compiled from: OkHttpFrameLogger */
    enum a {
        INBOUND,
        OUTBOUND
    }

    /* compiled from: OkHttpFrameLogger */
    private enum b {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f32735a;

        private b(int i10) {
            this.f32735a = i10;
        }

        public int a() {
            return this.f32735a;
        }
    }

    j(Level level, Class<?> cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    private boolean a() {
        return this.f32723a.isLoggable(this.f32724b);
    }

    private static String l(i iVar) {
        EnumMap enumMap = new EnumMap(b.class);
        for (b bVar : b.values()) {
            if (iVar.d(bVar.a())) {
                enumMap.put(bVar, Integer.valueOf(iVar.a(bVar.a())));
            }
        }
        return enumMap.toString();
    }

    private static String m(c cVar) {
        if (cVar.v0() <= 64) {
            return cVar.w0().j();
        }
        int min = (int) Math.min(cVar.v0(), 64);
        return cVar.y0(min).j() + "...";
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar, int i10, c cVar, int i11, boolean z10) {
        if (a()) {
            Logger logger = this.f32723a;
            Level level = this.f32724b;
            logger.log(level, aVar + " DATA: streamId=" + i10 + " endStream=" + z10 + " length=" + i11 + " bytes=" + m(cVar));
        }
    }

    /* access modifiers changed from: package-private */
    public void c(a aVar, int i10, hd.a aVar2, f fVar) {
        if (a()) {
            Logger logger = this.f32723a;
            Level level = this.f32724b;
            logger.log(level, aVar + " GO_AWAY: lastStreamId=" + i10 + " errorCode=" + aVar2 + " length=" + fVar.p() + " bytes=" + m(new c().E0(fVar)));
        }
    }

    /* access modifiers changed from: package-private */
    public void d(a aVar, int i10, List<d> list, boolean z10) {
        if (a()) {
            Logger logger = this.f32723a;
            Level level = this.f32724b;
            logger.log(level, aVar + " HEADERS: streamId=" + i10 + " headers=" + list + " endStream=" + z10);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(a aVar, long j10) {
        if (a()) {
            Logger logger = this.f32723a;
            Level level = this.f32724b;
            logger.log(level, aVar + " PING: ack=false bytes=" + j10);
        }
    }

    /* access modifiers changed from: package-private */
    public void f(a aVar, long j10) {
        if (a()) {
            Logger logger = this.f32723a;
            Level level = this.f32724b;
            logger.log(level, aVar + " PING: ack=true bytes=" + j10);
        }
    }

    /* access modifiers changed from: package-private */
    public void g(a aVar, int i10, int i11, List<d> list) {
        if (a()) {
            Logger logger = this.f32723a;
            Level level = this.f32724b;
            logger.log(level, aVar + " PUSH_PROMISE: streamId=" + i10 + " promisedStreamId=" + i11 + " headers=" + list);
        }
    }

    /* access modifiers changed from: package-private */
    public void h(a aVar, int i10, hd.a aVar2) {
        if (a()) {
            Logger logger = this.f32723a;
            Level level = this.f32724b;
            logger.log(level, aVar + " RST_STREAM: streamId=" + i10 + " errorCode=" + aVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public void i(a aVar, i iVar) {
        if (a()) {
            Logger logger = this.f32723a;
            Level level = this.f32724b;
            logger.log(level, aVar + " SETTINGS: ack=false settings=" + l(iVar));
        }
    }

    /* access modifiers changed from: package-private */
    public void j(a aVar) {
        if (a()) {
            Logger logger = this.f32723a;
            Level level = this.f32724b;
            logger.log(level, aVar + " SETTINGS: ack=true");
        }
    }

    /* access modifiers changed from: package-private */
    public void k(a aVar, int i10, long j10) {
        if (a()) {
            Logger logger = this.f32723a;
            Level level = this.f32724b;
            logger.log(level, aVar + " WINDOW_UPDATE: streamId=" + i10 + " windowSizeIncrement=" + j10);
        }
    }

    j(Level level, Logger logger) {
        this.f32724b = (Level) o.p(level, AppLovinEventTypes.USER_COMPLETED_LEVEL);
        this.f32723a = (Logger) o.p(logger, "logger");
    }
}
