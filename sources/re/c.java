package re;

import fe.l;
import fe.p;
import kotlin.jvm.internal.k;
import le.e;
import pe.o;
import sd.w;
import ue.l0;

/* compiled from: BufferedChannel.kt */
public final class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final i<Object> f37982a = new i(-1, (i) null, (b) null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f37983b = o0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f37984c = o0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public static final l0 f37985d = new l0("BUFFERED");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final l0 f37986e = new l0("SHOULD_BUFFER");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final l0 f37987f = new l0("S_RESUMING_BY_RCV");
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final l0 f37988g = new l0("RESUMING_BY_EB");
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final l0 f37989h = new l0("POISONED");
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final l0 f37990i = new l0("DONE_RCV");
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final l0 f37991j = new l0("INTERRUPTED_SEND");
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final l0 f37992k = new l0("INTERRUPTED_RCV");

    /* renamed from: l  reason: collision with root package name */
    private static final l0 f37993l = new l0("CHANNEL_CLOSED");
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final l0 f37994m = new l0("SUSPEND");
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final l0 f37995n = new l0("SUSPEND_NO_WAITER");
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final l0 f37996o = new l0("FAILED");
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final l0 f37997p = new l0("NO_RECEIVE_RESULT");
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final l0 f37998q = new l0("CLOSE_HANDLER_CLOSED");
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final l0 f37999r = new l0("CLOSE_HANDLER_INVOKED");
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final l0 f38000s = new l0("NO_CLOSE_CAUSE");

    /* compiled from: BufferedChannel.kt */
    /* synthetic */ class a extends k implements p<Long, i<E>, i<E>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f38001a = new a();

        a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final i<E> b(long j10, i<E> iVar) {
            return c.x(j10, iVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).longValue(), (i) obj2);
        }
    }

    /* access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 != Integer.MAX_VALUE) {
            return (long) i10;
        }
        return Long.MAX_VALUE;
    }

    /* access modifiers changed from: private */
    public static final <T> boolean B(o<? super T> oVar, T t10, l<? super Throwable, w> lVar) {
        Object k10 = oVar.k(t10, (Object) null, lVar);
        if (k10 == null) {
            return false;
        }
        oVar.r(k10);
        return true;
    }

    static /* synthetic */ boolean C(o oVar, Object obj, l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return B(oVar, obj, lVar);
    }

    /* access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0) + j10;
    }

    /* access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    /* access modifiers changed from: private */
    public static final <E> i<E> x(long j10, i<E> iVar) {
        return new i(j10, iVar, iVar.u(), 0);
    }

    public static final <E> e<i<E>> y() {
        return a.f38001a;
    }

    public static final l0 z() {
        return f37993l;
    }
}
