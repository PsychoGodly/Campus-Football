package se;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import re.t;
import sd.w;

/* compiled from: Channels.kt */
final /* synthetic */ class i {

    @f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {36, 37}, m = "emitAllImpl$FlowKt__ChannelsKt")
    /* compiled from: Channels.kt */
    static final class a<T> extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f38207a;

        /* renamed from: b  reason: collision with root package name */
        Object f38208b;

        /* renamed from: c  reason: collision with root package name */
        Object f38209c;

        /* renamed from: d  reason: collision with root package name */
        boolean f38210d;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f38211f;

        /* renamed from: g  reason: collision with root package name */
        int f38212g;

        a(xd.d<? super a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f38211f = obj;
            this.f38212g |= RecyclerView.UNDEFINED_DURATION;
            return i.c((f) null, (t) null, false, this);
        }
    }

    public static final <T> Object b(f<? super T> fVar, t<? extends T> tVar, xd.d<? super w> dVar) {
        Object c10 = c(fVar, tVar, true, dVar);
        return c10 == d.c() ? c10 : w.f38141a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
        if (r9 != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        re.j.a(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a3, code lost:
        throw r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[Catch:{ all -> 0x009d }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071 A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object c(se.f<? super T> r7, re.t<? extends T> r8, boolean r9, xd.d<? super sd.w> r10) {
        /*
            boolean r0 = r10 instanceof se.i.a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            se.i$a r0 = (se.i.a) r0
            int r1 = r0.f38212g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f38212g = r1
            goto L_0x0018
        L_0x0013:
            se.i$a r0 = new se.i$a
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.f38211f
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f38212g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            boolean r9 = r0.f38210d
            java.lang.Object r7 = r0.f38209c
            re.f r7 = (re.f) r7
            java.lang.Object r8 = r0.f38208b
            re.t r8 = (re.t) r8
            java.lang.Object r2 = r0.f38207a
            se.f r2 = (se.f) r2
            sd.p.b(r10)     // Catch:{ all -> 0x009b }
        L_0x0039:
            r10 = r7
            r7 = r2
            goto L_0x0060
        L_0x003c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0044:
            boolean r9 = r0.f38210d
            java.lang.Object r7 = r0.f38209c
            re.f r7 = (re.f) r7
            java.lang.Object r8 = r0.f38208b
            re.t r8 = (re.t) r8
            java.lang.Object r2 = r0.f38207a
            se.f r2 = (se.f) r2
            sd.p.b(r10)     // Catch:{ all -> 0x009b }
            goto L_0x0075
        L_0x0056:
            sd.p.b(r10)
            se.g.o(r7)
            re.f r10 = r8.iterator()     // Catch:{ all -> 0x009b }
        L_0x0060:
            r0.f38207a = r7     // Catch:{ all -> 0x009b }
            r0.f38208b = r8     // Catch:{ all -> 0x009b }
            r0.f38209c = r10     // Catch:{ all -> 0x009b }
            r0.f38210d = r9     // Catch:{ all -> 0x009b }
            r0.f38212g = r4     // Catch:{ all -> 0x009b }
            java.lang.Object r2 = r10.b(r0)     // Catch:{ all -> 0x009b }
            if (r2 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L_0x0075:
            r5 = 0
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x009b }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x009b }
            if (r10 == 0) goto L_0x0093
            java.lang.Object r10 = r7.next()     // Catch:{ all -> 0x009b }
            r0.f38207a = r2     // Catch:{ all -> 0x009b }
            r0.f38208b = r8     // Catch:{ all -> 0x009b }
            r0.f38209c = r7     // Catch:{ all -> 0x009b }
            r0.f38210d = r9     // Catch:{ all -> 0x009b }
            r0.f38212g = r3     // Catch:{ all -> 0x009b }
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch:{ all -> 0x009b }
            if (r10 != r1) goto L_0x0039
            return r1
        L_0x0093:
            if (r9 == 0) goto L_0x0098
            re.j.a(r8, r5)
        L_0x0098:
            sd.w r7 = sd.w.f38141a
            return r7
        L_0x009b:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x009d }
        L_0x009d:
            r10 = move-exception
            if (r9 == 0) goto L_0x00a3
            re.j.a(r8, r7)
        L_0x00a3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: se.i.c(se.f, re.t, boolean, xd.d):java.lang.Object");
    }
}
