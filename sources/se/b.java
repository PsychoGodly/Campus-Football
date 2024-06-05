package se;

import androidx.recyclerview.widget.RecyclerView;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.h;
import re.r;
import sd.w;
import te.e;
import xd.d;
import xd.g;

/* compiled from: Builders.kt */
final class b<T> extends c<T> {

    /* renamed from: f  reason: collision with root package name */
    private final p<r<? super T>, d<? super w>, Object> f38168f;

    @f(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {334}, m = "collectTo")
    /* compiled from: Builders.kt */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f38169a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f38170b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b<T> f38171c;

        /* renamed from: d  reason: collision with root package name */
        int f38172d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b<T> bVar, d<? super a> dVar) {
            super(dVar);
            this.f38171c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f38170b = obj;
            this.f38172d |= RecyclerView.UNDEFINED_DURATION;
            return this.f38171c.h((r) null, this);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(p pVar, g gVar, int i10, re.a aVar, int i11, h hVar) {
        this(pVar, (i11 & 2) != 0 ? xd.h.f39347a : gVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? re.a.SUSPEND : aVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h(re.r<? super T> r5, xd.d<? super sd.w> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof se.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            se.b$a r0 = (se.b.a) r0
            int r1 = r0.f38172d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f38172d = r1
            goto L_0x0018
        L_0x0013:
            se.b$a r0 = new se.b$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f38170b
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f38172d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f38169a
            re.r r5 = (re.r) r5
            sd.p.b(r6)
            goto L_0x0043
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            sd.p.b(r6)
            r0.f38169a = r5
            r0.f38172d = r3
            java.lang.Object r6 = super.h(r5, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            boolean r5 = r5.q()
            if (r5 == 0) goto L_0x004c
            sd.w r5 = sd.w.f38141a
            return r5
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: se.b.h(re.r, xd.d):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public e<T> i(g gVar, int i10, re.a aVar) {
        return new b(this.f38168f, gVar, i10, aVar);
    }

    public b(p<? super r<? super T>, ? super d<? super w>, ? extends Object> pVar, g gVar, int i10, re.a aVar) {
        super(pVar, gVar, i10, aVar);
        this.f38168f = pVar;
    }
}
