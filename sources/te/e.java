package te;

import com.google.android.gms.common.api.a;
import fe.p;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import pe.p0;
import pe.q0;
import pe.r0;
import pe.t0;
import pe.u0;
import re.r;
import re.t;
import sd.w;
import xd.d;
import xd.g;
import xd.h;

/* compiled from: ChannelFlow.kt */
public abstract class e<T> implements p<T> {

    /* renamed from: a  reason: collision with root package name */
    public final g f38649a;

    /* renamed from: b  reason: collision with root package name */
    public final int f38650b;

    /* renamed from: c  reason: collision with root package name */
    public final re.a f38651c;

    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
    /* compiled from: ChannelFlow.kt */
    static final class a extends l implements p<p0, d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38652a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f38653b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ se.f<T> f38654c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e<T> f38655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(se.f<? super T> fVar, e<T> eVar, d<? super a> dVar) {
            super(2, dVar);
            this.f38654c = fVar;
            this.f38655d = eVar;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f38654c, this.f38655d, dVar);
            aVar.f38653b = obj;
            return aVar;
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((a) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f38652a;
            if (i10 == 0) {
                sd.p.b(obj);
                se.f<T> fVar = this.f38654c;
                t<T> m10 = this.f38655d.m((p0) this.f38653b);
                this.f38652a = 1;
                if (se.g.m(fVar, m10, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sd.p.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return w.f38141a;
        }
    }

    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
    /* compiled from: ChannelFlow.kt */
    static final class b extends l implements p<r<? super T>, d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38656a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f38657b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e<T> f38658c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e<T> eVar, d<? super b> dVar) {
            super(2, dVar);
            this.f38658c = eVar;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            b bVar = new b(this.f38658c, dVar);
            bVar.f38657b = obj;
            return bVar;
        }

        public final Object invoke(r<? super T> rVar, d<? super w> dVar) {
            return ((b) create(rVar, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f38656a;
            if (i10 == 0) {
                sd.p.b(obj);
                e<T> eVar = this.f38658c;
                this.f38656a = 1;
                if (eVar.h((r) this.f38657b, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                sd.p.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return w.f38141a;
        }
    }

    public e(g gVar, int i10, re.a aVar) {
        this.f38649a = gVar;
        this.f38650b = i10;
        this.f38651c = aVar;
        if (t0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
    }

    static /* synthetic */ <T> Object g(e<T> eVar, se.f<? super T> fVar, d<? super w> dVar) {
        Object e10 = q0.e(new a(fVar, eVar, (d<? super a>) null), dVar);
        return e10 == d.c() ? e10 : w.f38141a;
    }

    public Object collect(se.f<? super T> fVar, d<? super w> dVar) {
        return g(this, fVar, dVar);
    }

    public se.e<T> d(g gVar, int i10, re.a aVar) {
        boolean z10 = true;
        if (t0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
        g plus = gVar.plus(this.f38649a);
        if (aVar == re.a.SUSPEND) {
            int i11 = this.f38650b;
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 != -2) {
                            if (t0.a()) {
                                if (!(this.f38650b >= 0)) {
                                    throw new AssertionError();
                                }
                            }
                            if (t0.a()) {
                                if (i10 < 0) {
                                    z10 = false;
                                }
                                if (!z10) {
                                    throw new AssertionError();
                                }
                            }
                            i11 = this.f38650b + i10;
                            if (i11 < 0) {
                                i10 = a.e.API_PRIORITY_OTHER;
                            }
                        }
                    }
                }
                i10 = i11;
            }
            aVar = this.f38651c;
        }
        if (m.a(plus, this.f38649a) && i10 == this.f38650b && aVar == this.f38651c) {
            return this;
        }
        return i(plus, i10, aVar);
    }

    /* access modifiers changed from: protected */
    public String f() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract Object h(r<? super T> rVar, d<? super w> dVar);

    /* access modifiers changed from: protected */
    public abstract e<T> i(g gVar, int i10, re.a aVar);

    public se.e<T> j() {
        return null;
    }

    public final p<r<? super T>, d<? super w>, Object> k() {
        return new b(this, (d<? super b>) null);
    }

    public final int l() {
        int i10 = this.f38650b;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public t<T> m(p0 p0Var) {
        return re.p.c(p0Var, this.f38649a, l(), this.f38651c, r0.ATOMIC, (fe.l) null, k(), 16, (Object) null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String f10 = f();
        if (f10 != null) {
            arrayList.add(f10);
        }
        if (this.f38649a != h.f39347a) {
            arrayList.add("context=" + this.f38649a);
        }
        if (this.f38650b != -3) {
            arrayList.add("capacity=" + this.f38650b);
        }
        if (this.f38651c != re.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f38651c);
        }
        return u0.a(this) + '[' + y.y(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (fe.l) null, 62, (Object) null) + ']';
    }
}
