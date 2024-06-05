package com.unity3d.services.core.extensions;

import fe.p;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import pe.c2;
import pe.p0;
import pe.r0;
import pe.x0;
import sd.w;
import xd.d;
import xd.g;

@f(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", l = {50}, m = "invokeSuspend")
/* compiled from: CoroutineExtensions.kt */
public final class CoroutineExtensionsKt$memoize$2 extends l implements p<p0, d<? super T>, Object> {
    final /* synthetic */ p<p0, d<? super T>, Object> $action;
    final /* synthetic */ Object $key;
    private /* synthetic */ Object L$0;
    int label;

    @f(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$1", f = "CoroutineExtensions.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$1  reason: invalid class name */
    /* compiled from: CoroutineExtensions.kt */
    public static final class AnonymousClass1 extends l implements p<p0, d<? super w>, Object> {
        int label;

        public final d<w> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(dVar);
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((AnonymousClass1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                sd.p.b(obj);
                Set<Map.Entry<Object, x0<?>>> entrySet = CoroutineExtensionsKt.getDeferreds().entrySet();
                m.d(entrySet, "deferreds.entries");
                boolean unused2 = v.m(entrySet, AnonymousClass1.INSTANCE);
                CoroutineExtensionsKt.getDeferredsCleanLaunched().set(false);
                return w.f38141a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineExtensionsKt$memoize$2(Object obj, p<? super p0, ? super d<? super T>, ? extends Object> pVar, d<? super CoroutineExtensionsKt$memoize$2> dVar) {
        super(2, dVar);
        this.$key = obj;
        this.$action = pVar;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        CoroutineExtensionsKt$memoize$2 coroutineExtensionsKt$memoize$2 = new CoroutineExtensionsKt$memoize$2(this.$key, this.$action, dVar);
        coroutineExtensionsKt$memoize$2.L$0 = obj;
        return coroutineExtensionsKt$memoize$2;
    }

    public final Object invoke(p0 p0Var, d<? super T> dVar) {
        return ((CoroutineExtensionsKt$memoize$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            p0 p0Var = (p0) this.L$0;
            x0 x0Var = CoroutineExtensionsKt.getDeferreds().get(this.$key);
            if (x0Var == null || !x0Var.isActive()) {
                x0Var = null;
            }
            if (x0Var == null) {
                x0Var = k.b(p0Var, (g) null, (r0) null, new CoroutineExtensionsKt$memoize$2$deferred$2(this.$action, (d<? super CoroutineExtensionsKt$memoize$2$deferred$2>) null), 3, (Object) null);
                CoroutineExtensionsKt.getDeferreds().put(this.$key, x0Var);
            }
            if (CoroutineExtensionsKt.getDeferreds().size() > 100 && !CoroutineExtensionsKt.getDeferredsCleanLaunched().getAndSet(true)) {
                c2 unused = k.d(p0Var, (g) null, (r0) null, new AnonymousClass1((d<? super AnonymousClass1>) null), 3, (Object) null);
            }
            this.label = 1;
            obj = x0Var.E0(this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        p0 p0Var = (p0) this.L$0;
        x0 x0Var = CoroutineExtensionsKt.getDeferreds().get(this.$key);
        if (x0Var == null || !Boolean.valueOf(x0Var.isActive()).booleanValue()) {
            x0Var = null;
        }
        if (x0Var == null) {
            x0Var = k.b(p0Var, (g) null, (r0) null, new CoroutineExtensionsKt$memoize$2$deferred$2(this.$action, (d<? super CoroutineExtensionsKt$memoize$2$deferred$2>) null), 3, (Object) null);
            CoroutineExtensionsKt.getDeferreds().put(this.$key, x0Var);
            w wVar = w.f38141a;
        } else {
            m.d(x0Var, "deferreds[key]?.takeIf {…o { deferreds[key] = it }");
        }
        x0 x0Var2 = x0Var;
        if (CoroutineExtensionsKt.getDeferreds().size() > 100 && !CoroutineExtensionsKt.getDeferredsCleanLaunched().getAndSet(true)) {
            c2 unused = k.d(p0Var, (g) null, (r0) null, new AnonymousClass1((d<? super AnonymousClass1>) null), 3, (Object) null);
        }
        kotlin.jvm.internal.l.a(0);
        Object E0 = x0Var2.E0(this);
        kotlin.jvm.internal.l.a(1);
        return E0;
    }
}
