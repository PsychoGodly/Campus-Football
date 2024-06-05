package yd;

import fe.p;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.m;
import sd.w;
import xd.d;
import xd.g;

/* compiled from: IntrinsicsJvm.kt */
class c {

    /* compiled from: IntrinsicsJvm.kt */
    public static final class a extends j {

        /* renamed from: a  reason: collision with root package name */
        private int f39433a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f39434b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f39435c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, p pVar, Object obj) {
            super(dVar);
            this.f39434b = pVar;
            this.f39435c = obj;
            m.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i10 = this.f39433a;
            if (i10 == 0) {
                this.f39433a = 1;
                sd.p.b(obj);
                m.c(this.f39434b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) c0.b(this.f39434b, 2)).invoke(this.f39435c, this);
            } else if (i10 == 1) {
                this.f39433a = 2;
                sd.p.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        private int f39436a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f39437b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f39438c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f39437b = pVar;
            this.f39438c = obj;
            m.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i10 = this.f39436a;
            if (i10 == 0) {
                this.f39436a = 1;
                sd.p.b(obj);
                m.c(this.f39437b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) c0.b(this.f39437b, 2)).invoke(this.f39438c, this);
            } else if (i10 == 1) {
                this.f39436a = 2;
                sd.p.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static <R, T> d<w> a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        m.e(pVar, "<this>");
        m.e(dVar, "completion");
        d<? super T> a10 = h.a(dVar);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r10, a10);
        }
        g context = a10.getContext();
        if (context == xd.h.f39347a) {
            return new a(a10, pVar, r10);
        }
        return new b(a10, context, pVar, r10);
    }

    public static <T> d<T> b(d<? super T> dVar) {
        d<Object> intercepted;
        m.e(dVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar2 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return (dVar2 == null || (intercepted = dVar2.intercepted()) == null) ? dVar : intercepted;
    }
}
