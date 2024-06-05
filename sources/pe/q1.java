package pe;

import ue.l0;

/* compiled from: EventLoop.common.kt */
public final class q1 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final l0 f37385a = new l0("REMOVED_TASK");
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final l0 f37386b = new l0("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j10;
    }
}
