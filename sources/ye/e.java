package ye;

import ue.l0;

/* compiled from: Semaphore.kt */
public final class e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final int f39463a = o0.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final l0 f39464b = new l0("PERMIT");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final l0 f39465c = new l0("TAKEN");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final l0 f39466d = new l0("BROKEN");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final l0 f39467e = new l0("CANCELLED");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f39468f = o0.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, (Object) null);

    /* access modifiers changed from: private */
    public static final f h(long j10, f fVar) {
        return new f(j10, fVar, 0);
    }
}
