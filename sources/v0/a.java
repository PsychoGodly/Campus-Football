package v0;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import fe.p;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.g1;
import pe.p0;
import pe.q0;
import pe.r0;
import sd.w;
import w6.f;
import xd.g;

/* compiled from: MeasurementManagerFutures.kt */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f23146a = new b((h) null);

    /* renamed from: v0.a$a  reason: collision with other inner class name */
    /* compiled from: MeasurementManagerFutures.kt */
    private static final class C0238a extends a {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final w0.b f23147b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", l = {122}, m = "invokeSuspend")
        /* renamed from: v0.a$a$a  reason: collision with other inner class name */
        /* compiled from: MeasurementManagerFutures.kt */
        static final class C0239a extends l implements p<p0, xd.d<? super w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f23148a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0238a f23149b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ w0.a f23150c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0239a(C0238a aVar, w0.a aVar2, xd.d<? super C0239a> dVar) {
                super(2, dVar);
                this.f23149b = aVar;
            }

            public final xd.d<w> create(Object obj, xd.d<?> dVar) {
                return new C0239a(this.f23149b, this.f23150c, dVar);
            }

            public final Object invoke(p0 p0Var, xd.d<? super w> dVar) {
                return ((C0239a) create(p0Var, dVar)).invokeSuspend(w.f38141a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f23148a;
                if (i10 == 0) {
                    sd.p.b(obj);
                    w0.b d10 = this.f23149b.f23147b;
                    w0.a aVar = this.f23150c;
                    this.f23148a = 1;
                    if (d10.a(aVar, this) == c10) {
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

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {169}, m = "invokeSuspend")
        /* renamed from: v0.a$a$b */
        /* compiled from: MeasurementManagerFutures.kt */
        static final class b extends l implements p<p0, xd.d<? super Integer>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f23151a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0238a f23152b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C0238a aVar, xd.d<? super b> dVar) {
                super(2, dVar);
                this.f23152b = aVar;
            }

            public final xd.d<w> create(Object obj, xd.d<?> dVar) {
                return new b(this.f23152b, dVar);
            }

            public final Object invoke(p0 p0Var, xd.d<? super Integer> dVar) {
                return ((b) create(p0Var, dVar)).invokeSuspend(w.f38141a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f23151a;
                if (i10 == 0) {
                    sd.p.b(obj);
                    w0.b d10 = this.f23152b.f23147b;
                    this.f23151a = 1;
                    obj = d10.b(this);
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
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {133}, m = "invokeSuspend")
        /* renamed from: v0.a$a$c */
        /* compiled from: MeasurementManagerFutures.kt */
        static final class c extends l implements p<p0, xd.d<? super w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f23153a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0238a f23154b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Uri f23155c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ InputEvent f23156d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C0238a aVar, Uri uri, InputEvent inputEvent, xd.d<? super c> dVar) {
                super(2, dVar);
                this.f23154b = aVar;
                this.f23155c = uri;
                this.f23156d = inputEvent;
            }

            public final xd.d<w> create(Object obj, xd.d<?> dVar) {
                return new c(this.f23154b, this.f23155c, this.f23156d, dVar);
            }

            public final Object invoke(p0 p0Var, xd.d<? super w> dVar) {
                return ((c) create(p0Var, dVar)).invokeSuspend(w.f38141a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f23153a;
                if (i10 == 0) {
                    sd.p.b(obj);
                    w0.b d10 = this.f23154b.f23147b;
                    Uri uri = this.f23155c;
                    InputEvent inputEvent = this.f23156d;
                    this.f23153a = 1;
                    if (d10.c(uri, inputEvent, this) == c10) {
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

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {141}, m = "invokeSuspend")
        /* renamed from: v0.a$a$d */
        /* compiled from: MeasurementManagerFutures.kt */
        static final class d extends l implements p<p0, xd.d<? super w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f23157a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0238a f23158b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Uri f23159c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(C0238a aVar, Uri uri, xd.d<? super d> dVar) {
                super(2, dVar);
                this.f23158b = aVar;
                this.f23159c = uri;
            }

            public final xd.d<w> create(Object obj, xd.d<?> dVar) {
                return new d(this.f23158b, this.f23159c, dVar);
            }

            public final Object invoke(p0 p0Var, xd.d<? super w> dVar) {
                return ((d) create(p0Var, dVar)).invokeSuspend(w.f38141a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f23157a;
                if (i10 == 0) {
                    sd.p.b(obj);
                    w0.b d10 = this.f23158b.f23147b;
                    Uri uri = this.f23159c;
                    this.f23157a = 1;
                    if (d10.d(uri, this) == c10) {
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

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {151}, m = "invokeSuspend")
        /* renamed from: v0.a$a$e */
        /* compiled from: MeasurementManagerFutures.kt */
        static final class e extends l implements p<p0, xd.d<? super w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f23160a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0238a f23161b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ w0.c f23162c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(C0238a aVar, w0.c cVar, xd.d<? super e> dVar) {
                super(2, dVar);
                this.f23161b = aVar;
            }

            public final xd.d<w> create(Object obj, xd.d<?> dVar) {
                return new e(this.f23161b, this.f23162c, dVar);
            }

            public final Object invoke(p0 p0Var, xd.d<? super w> dVar) {
                return ((e) create(p0Var, dVar)).invokeSuspend(w.f38141a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f23160a;
                if (i10 == 0) {
                    sd.p.b(obj);
                    w0.b d10 = this.f23161b.f23147b;
                    w0.c cVar = this.f23162c;
                    this.f23160a = 1;
                    if (d10.e(cVar, this) == c10) {
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

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {161}, m = "invokeSuspend")
        /* renamed from: v0.a$a$f */
        /* compiled from: MeasurementManagerFutures.kt */
        static final class f extends l implements p<p0, xd.d<? super w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f23163a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0238a f23164b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ w0.d f23165c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(C0238a aVar, w0.d dVar, xd.d<? super f> dVar2) {
                super(2, dVar2);
                this.f23164b = aVar;
            }

            public final xd.d<w> create(Object obj, xd.d<?> dVar) {
                return new f(this.f23164b, this.f23165c, dVar);
            }

            public final Object invoke(p0 p0Var, xd.d<? super w> dVar) {
                return ((f) create(p0Var, dVar)).invokeSuspend(w.f38141a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f23163a;
                if (i10 == 0) {
                    sd.p.b(obj);
                    w0.b d10 = this.f23164b.f23147b;
                    w0.d dVar = this.f23165c;
                    this.f23163a = 1;
                    if (d10.f(dVar, this) == c10) {
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

        public C0238a(w0.b bVar) {
            m.e(bVar, "mMeasurementManager");
            this.f23147b = bVar;
        }

        public w6.f<Integer> b() {
            return u0.b.c(k.b(q0.a(g1.a()), (g) null, (r0) null, new b(this, (xd.d<? super b>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public w6.f<w> c(Uri uri) {
            m.e(uri, "trigger");
            return u0.b.c(k.b(q0.a(g1.a()), (g) null, (r0) null, new d(this, uri, (xd.d<? super d>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public w6.f<w> e(w0.a aVar) {
            m.e(aVar, "deletionRequest");
            return u0.b.c(k.b(q0.a(g1.a()), (g) null, (r0) null, new C0239a(this, aVar, (xd.d<? super C0239a>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public w6.f<w> f(Uri uri, InputEvent inputEvent) {
            m.e(uri, "attributionSource");
            return u0.b.c(k.b(q0.a(g1.a()), (g) null, (r0) null, new c(this, uri, inputEvent, (xd.d<? super c>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public w6.f<w> g(w0.c cVar) {
            m.e(cVar, "request");
            return u0.b.c(k.b(q0.a(g1.a()), (g) null, (r0) null, new e(this, cVar, (xd.d<? super e>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }

        public w6.f<w> h(w0.d dVar) {
            m.e(dVar, "request");
            return u0.b.c(k.b(q0.a(g1.a()), (g) null, (r0) null, new f(this, dVar, (xd.d<? super f>) null), 3, (Object) null), (Object) null, 1, (Object) null);
        }
    }

    /* compiled from: MeasurementManagerFutures.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }

        public final a a(Context context) {
            m.e(context, "context");
            w0.b a10 = w0.b.f23501a.a(context);
            if (a10 != null) {
                return new C0238a(a10);
            }
            return null;
        }
    }

    public static final a a(Context context) {
        return f23146a.a(context);
    }

    public abstract f<Integer> b();

    public abstract f<w> c(Uri uri);
}
