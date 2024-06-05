package com.unity3d.ads.core.extensions;

import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.a1;
import pe.c2;
import pe.p0;
import pe.r0;
import re.r;
import re.u;
import sd.w;
import se.e;
import xd.d;
import xd.g;

@f(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1", f = "FlowExtensions.kt", l = {15, 17}, m = "invokeSuspend")
/* compiled from: FlowExtensions.kt */
final class FlowExtensionsKt$timeoutAfter$1 extends l implements p<r<? super T>, d<? super w>, Object> {
    final /* synthetic */ boolean $active;
    final /* synthetic */ fe.l<d<? super w>, Object> $block;
    final /* synthetic */ e<T> $this_timeoutAfter;
    final /* synthetic */ long $timeoutMillis;
    private /* synthetic */ Object L$0;
    int label;

    @f(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1", f = "FlowExtensions.kt", l = {10}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1  reason: invalid class name */
    /* compiled from: FlowExtensions.kt */
    static final class AnonymousClass1 extends l implements p<p0, d<? super w>, Object> {
        int label;

        public final d<w> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(eVar, rVar, dVar);
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((AnonymousClass1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sd.p.b(obj);
                e<T> eVar = eVar;
                final r<T> rVar = rVar;
                AnonymousClass1 r12 = new se.f() {
                    public final Object emit(T t10, d<? super w> dVar) {
                        Object c10 = rVar.c(t10, dVar);
                        return c10 == d.c() ? c10 : w.f38141a;
                    }
                };
                this.label = 1;
                if (eVar.collect(r12, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sd.p.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.a.a(rVar, (Throwable) null, 1, (Object) null);
            return w.f38141a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowExtensionsKt$timeoutAfter$1(long j10, boolean z10, fe.l<? super d<? super w>, ? extends Object> lVar, e<? extends T> eVar, d<? super FlowExtensionsKt$timeoutAfter$1> dVar) {
        super(2, dVar);
        this.$timeoutMillis = j10;
        this.$active = z10;
        this.$block = lVar;
        this.$this_timeoutAfter = eVar;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        FlowExtensionsKt$timeoutAfter$1 flowExtensionsKt$timeoutAfter$1 = new FlowExtensionsKt$timeoutAfter$1(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, dVar);
        flowExtensionsKt$timeoutAfter$1.L$0 = obj;
        return flowExtensionsKt$timeoutAfter$1;
    }

    public final Object invoke(r<? super T> rVar, d<? super w> dVar) {
        return ((FlowExtensionsKt$timeoutAfter$1) create(rVar, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            final r rVar = (r) this.L$0;
            final e<T> eVar = this.$this_timeoutAfter;
            c2 unused = k.d(rVar, (g) null, (r0) null, new AnonymousClass1((d<? super AnonymousClass1>) null), 3, (Object) null);
            long j10 = this.$timeoutMillis;
            this.label = 1;
            if (a1.a(j10, this) == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else if (i10 == 2) {
            sd.p.b(obj);
            return w.f38141a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (this.$active) {
            fe.l<d<? super w>, Object> lVar = this.$block;
            this.label = 2;
            if (lVar.invoke(this) == c10) {
                return c10;
            }
        }
        return w.f38141a;
    }
}
