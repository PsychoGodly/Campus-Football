package androidx.window.layout;

import android.app.Activity;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import sd.w;
import xd.d;

@f(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {54, 55}, m = "invokeSuspend")
/* compiled from: WindowInfoTrackerImpl.kt */
final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends l implements p<se.f<? super WindowLayoutInfo>, d<? super w>, Object> {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WindowInfoTrackerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, d<? super WindowInfoTrackerImpl$windowLayoutInfo$1> dVar) {
        super(2, dVar);
        this.this$0 = windowInfoTrackerImpl;
        this.$activity = activity;
    }

    /* access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0  reason: not valid java name */
    public static final void m7invokeSuspend$lambda0(re.d dVar, WindowLayoutInfo windowLayoutInfo) {
        m.d(windowLayoutInfo, "info");
        dVar.g(windowLayoutInfo);
    }

    public final d<w> create(Object obj, d<?> dVar) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.this$0, this.$activity, dVar);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    public final Object invoke(se.f<? super WindowLayoutInfo> fVar, d<? super w> dVar) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create(fVar, dVar)).invokeSuspend(w.f38141a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070 A[Catch:{ all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b A[Catch:{ all -> 0x009e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = yd.d.c()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 == r3) goto L_0x0027
            if (r1 != r2) goto L_0x001f
            java.lang.Object r1 = r9.L$2
            re.f r1 = (re.f) r1
            java.lang.Object r4 = r9.L$1
            androidx.core.util.a r4 = (androidx.core.util.a) r4
            java.lang.Object r5 = r9.L$0
            se.f r5 = (se.f) r5
            sd.p.b(r10)     // Catch:{ all -> 0x00a0 }
            r10 = r5
            goto L_0x0060
        L_0x001f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0027:
            java.lang.Object r1 = r9.L$2
            re.f r1 = (re.f) r1
            java.lang.Object r4 = r9.L$1
            androidx.core.util.a r4 = (androidx.core.util.a) r4
            java.lang.Object r5 = r9.L$0
            se.f r5 = (se.f) r5
            sd.p.b(r10)     // Catch:{ all -> 0x00a0 }
            r6 = r5
            r5 = r9
            goto L_0x0073
        L_0x0039:
            sd.p.b(r10)
            java.lang.Object r10 = r9.L$0
            se.f r10 = (se.f) r10
            r1 = 10
            re.a r4 = re.a.DROP_OLDEST
            r5 = 4
            r6 = 0
            re.d r1 = re.g.b(r1, r4, r6, r5, r6)
            androidx.window.layout.c r4 = new androidx.window.layout.c
            r4.<init>(r1)
            androidx.window.layout.WindowInfoTrackerImpl r5 = r9.this$0
            androidx.window.layout.WindowBackend r5 = r5.windowBackend
            android.app.Activity r6 = r9.$activity
            androidx.profileinstaller.g r7 = androidx.profileinstaller.g.f4296a
            r5.registerLayoutChangeCallback(r6, r7, r4)
            re.f r1 = r1.iterator()     // Catch:{ all -> 0x00a0 }
        L_0x0060:
            r5 = r9
        L_0x0061:
            r5.L$0 = r10     // Catch:{ all -> 0x009e }
            r5.L$1 = r4     // Catch:{ all -> 0x009e }
            r5.L$2 = r1     // Catch:{ all -> 0x009e }
            r5.label = r3     // Catch:{ all -> 0x009e }
            java.lang.Object r6 = r1.b(r5)     // Catch:{ all -> 0x009e }
            if (r6 != r0) goto L_0x0070
            return r0
        L_0x0070:
            r8 = r6
            r6 = r10
            r10 = r8
        L_0x0073:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x009e }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x009e }
            if (r10 == 0) goto L_0x0092
            java.lang.Object r10 = r1.next()     // Catch:{ all -> 0x009e }
            androidx.window.layout.WindowLayoutInfo r10 = (androidx.window.layout.WindowLayoutInfo) r10     // Catch:{ all -> 0x009e }
            r5.L$0 = r6     // Catch:{ all -> 0x009e }
            r5.L$1 = r4     // Catch:{ all -> 0x009e }
            r5.L$2 = r1     // Catch:{ all -> 0x009e }
            r5.label = r2     // Catch:{ all -> 0x009e }
            java.lang.Object r10 = r6.emit(r10, r5)     // Catch:{ all -> 0x009e }
            if (r10 != r0) goto L_0x0090
            return r0
        L_0x0090:
            r10 = r6
            goto L_0x0061
        L_0x0092:
            androidx.window.layout.WindowInfoTrackerImpl r10 = r5.this$0
            androidx.window.layout.WindowBackend r10 = r10.windowBackend
            r10.unregisterLayoutChangeCallback(r4)
            sd.w r10 = sd.w.f38141a
            return r10
        L_0x009e:
            r10 = move-exception
            goto L_0x00a2
        L_0x00a0:
            r10 = move-exception
            r5 = r9
        L_0x00a2:
            androidx.window.layout.WindowInfoTrackerImpl r0 = r5.this$0
            androidx.window.layout.WindowBackend r0 = r0.windowBackend
            r0.unregisterLayoutChangeCallback(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
