package se;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.w;

/* compiled from: Flow.kt */
public abstract class a<T> implements e<T> {

    @f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: se.a$a  reason: collision with other inner class name */
    /* compiled from: Flow.kt */
    static final class C0430a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f38144a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f38145b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a<T> f38146c;

        /* renamed from: d  reason: collision with root package name */
        int f38147d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0430a(a<T> aVar, xd.d<? super C0430a> dVar) {
            super(dVar);
            this.f38146c = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f38145b = obj;
            this.f38147d |= RecyclerView.UNDEFINED_DURATION;
            return this.f38146c.collect((f) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(se.f<? super T> r6, xd.d<? super sd.w> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof se.a.C0430a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            se.a$a r0 = (se.a.C0430a) r0
            int r1 = r0.f38147d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f38147d = r1
            goto L_0x0018
        L_0x0013:
            se.a$a r0 = new se.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f38145b
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f38147d
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.f38144a
            te.t r6 = (te.t) r6
            sd.p.b(r7)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r7 = move-exception
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            sd.p.b(r7)
            te.t r7 = new te.t
            xd.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f38144a = r7     // Catch:{ all -> 0x0055 }
            r0.f38147d = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r6 = r5.f(r7, r0)     // Catch:{ all -> 0x0055 }
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r6 = r7
        L_0x004f:
            r6.releaseIntercepted()
            sd.w r6 = sd.w.f38141a
            return r6
        L_0x0055:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0059:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: se.a.collect(se.f, xd.d):java.lang.Object");
    }

    public abstract Object f(f<? super T> fVar, xd.d<? super w> dVar);
}
