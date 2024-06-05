package h0;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.z;
import pe.c2;
import pe.p0;
import pe.x;
import sd.w;
import se.k0;
import se.v;

/* compiled from: SingleProcessDataStore.kt */
public final class m<T> implements f<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final a f18467k = new a((kotlin.jvm.internal.h) null);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final Set<String> f18468l = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final Object f18469m = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final fe.a<File> f18470a;

    /* renamed from: b  reason: collision with root package name */
    private final k<T> f18471b;

    /* renamed from: c  reason: collision with root package name */
    private final b<T> f18472c;

    /* renamed from: d  reason: collision with root package name */
    private final p0 f18473d;

    /* renamed from: e  reason: collision with root package name */
    private final se.e<T> f18474e = se.g.r(new g(this, (xd.d<? super g>) null));

    /* renamed from: f  reason: collision with root package name */
    private final String f18475f = ".tmp";

    /* renamed from: g  reason: collision with root package name */
    private final sd.g f18476g = i.a(new h(this));
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final v<n<T>> f18477h = k0.a(o.f18566a);

    /* renamed from: i  reason: collision with root package name */
    private List<? extends fe.p<? super i<T>, ? super xd.d<? super w>, ? extends Object>> f18478i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final l<b<T>> f18479j;

    /* compiled from: SingleProcessDataStore.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final Set<String> a() {
            return m.f18468l;
        }

        public final Object b() {
            return m.f18469m;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    private static abstract class b<T> {

        /* compiled from: SingleProcessDataStore.kt */
        public static final class a<T> extends b<T> {

            /* renamed from: a  reason: collision with root package name */
            private final n<T> f18480a;

            public a(n<T> nVar) {
                super((kotlin.jvm.internal.h) null);
                this.f18480a = nVar;
            }

            public n<T> a() {
                return this.f18480a;
            }
        }

        /* renamed from: h0.m$b$b  reason: collision with other inner class name */
        /* compiled from: SingleProcessDataStore.kt */
        public static final class C0194b<T> extends b<T> {

            /* renamed from: a  reason: collision with root package name */
            private final fe.p<T, xd.d<? super T>, Object> f18481a;

            /* renamed from: b  reason: collision with root package name */
            private final x<T> f18482b;

            /* renamed from: c  reason: collision with root package name */
            private final n<T> f18483c;

            /* renamed from: d  reason: collision with root package name */
            private final xd.g f18484d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0194b(fe.p<? super T, ? super xd.d<? super T>, ? extends Object> pVar, x<T> xVar, n<T> nVar, xd.g gVar) {
                super((kotlin.jvm.internal.h) null);
                kotlin.jvm.internal.m.e(pVar, "transform");
                kotlin.jvm.internal.m.e(xVar, "ack");
                kotlin.jvm.internal.m.e(gVar, "callerContext");
                this.f18481a = pVar;
                this.f18482b = xVar;
                this.f18483c = nVar;
                this.f18484d = gVar;
            }

            public final x<T> a() {
                return this.f18482b;
            }

            public final xd.g b() {
                return this.f18484d;
            }

            public n<T> c() {
                return this.f18483c;
            }

            public final fe.p<T, xd.d<? super T>, Object> d() {
                return this.f18481a;
            }
        }

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    private static final class c extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        private final FileOutputStream f18485a;

        public c(FileOutputStream fileOutputStream) {
            kotlin.jvm.internal.m.e(fileOutputStream, "fileOutputStream");
            this.f18485a = fileOutputStream;
        }

        public void close() {
        }

        public void flush() {
            this.f18485a.flush();
        }

        public void write(int i10) {
            this.f18485a.write(i10);
        }

        public void write(byte[] bArr) {
            kotlin.jvm.internal.m.e(bArr, "b");
            this.f18485a.write(bArr);
        }

        public void write(byte[] bArr, int i10, int i11) {
            kotlin.jvm.internal.m.e(bArr, "bytes");
            this.f18485a.write(bArr, i10, i11);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    static final class d extends kotlin.jvm.internal.n implements fe.l<Throwable, w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m<T> f18486a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(m<T> mVar) {
            super(1);
            this.f18486a = mVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return w.f38141a;
        }

        public final void invoke(Throwable th) {
            if (th != null) {
                this.f18486a.f18477h.setValue(new h(th));
            }
            a aVar = m.f18467k;
            Object b10 = aVar.b();
            m<T> mVar = this.f18486a;
            synchronized (b10) {
                aVar.a().remove(mVar.q().getAbsolutePath());
                w wVar = w.f38141a;
            }
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    static final class e extends kotlin.jvm.internal.n implements fe.p<b<T>, Throwable, w> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f18487a = new e();

        e() {
            super(2);
        }

        public final void a(b<T> bVar, Throwable th) {
            kotlin.jvm.internal.m.e(bVar, "msg");
            if (bVar instanceof b.C0194b) {
                x a10 = ((b.C0194b) bVar).a();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                a10.l0(th);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((b) obj, (Throwable) obj2);
            return w.f38141a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
    /* compiled from: SingleProcessDataStore.kt */
    static final class f extends kotlin.coroutines.jvm.internal.l implements fe.p<b<T>, xd.d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f18488a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f18489b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m<T> f18490c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(m<T> mVar, xd.d<? super f> dVar) {
            super(2, dVar);
            this.f18490c = mVar;
        }

        public final xd.d<w> create(Object obj, xd.d<?> dVar) {
            f fVar = new f(this.f18490c, dVar);
            fVar.f18489b = obj;
            return fVar;
        }

        /* renamed from: d */
        public final Object invoke(b<T> bVar, xd.d<? super w> dVar) {
            return ((f) create(bVar, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f18488a;
            if (i10 == 0) {
                sd.p.b(obj);
                b bVar = (b) this.f18489b;
                if (bVar instanceof b.a) {
                    this.f18488a = 1;
                    if (this.f18490c.r((b.a) bVar, this) == c10) {
                        return c10;
                    }
                } else if (bVar instanceof b.C0194b) {
                    this.f18488a = 2;
                    if (this.f18490c.s((b.C0194b) bVar, this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                sd.p.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return w.f38141a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {117}, m = "invokeSuspend")
    /* compiled from: SingleProcessDataStore.kt */
    static final class g extends kotlin.coroutines.jvm.internal.l implements fe.p<se.f<? super T>, xd.d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f18491a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f18492b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m<T> f18493c;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
        /* compiled from: SingleProcessDataStore.kt */
        static final class a extends kotlin.coroutines.jvm.internal.l implements fe.p<n<T>, xd.d<? super Boolean>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f18494a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f18495b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ n<T> f18496c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(n<T> nVar, xd.d<? super a> dVar) {
                super(2, dVar);
                this.f18496c = nVar;
            }

            public final xd.d<w> create(Object obj, xd.d<?> dVar) {
                a aVar = new a(this.f18496c, dVar);
                aVar.f18495b = obj;
                return aVar;
            }

            /* renamed from: d */
            public final Object invoke(n<T> nVar, xd.d<? super Boolean> dVar) {
                return ((a) create(nVar, dVar)).invokeSuspend(w.f38141a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = d.c();
                if (this.f18494a == 0) {
                    sd.p.b(obj);
                    n<T> nVar = (n) this.f18495b;
                    n<T> nVar2 = this.f18496c;
                    boolean z10 = false;
                    if (!(nVar2 instanceof c) && !(nVar2 instanceof h) && nVar == nVar2) {
                        z10 = true;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z10);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: SafeCollector.common.kt */
        public static final class b implements se.e<T> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ se.e f18497a;

            /* compiled from: Collect.kt */
            public static final class a implements se.f<n<T>> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ se.f f18498a;

                @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
                /* renamed from: h0.m$g$b$a$a  reason: collision with other inner class name */
                public static final class C0195a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f18499a;

                    /* renamed from: b  reason: collision with root package name */
                    int f18500b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ a f18501c;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0195a(a aVar, xd.d dVar) {
                        super(dVar);
                        this.f18501c = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f18499a = obj;
                        this.f18500b |= RecyclerView.UNDEFINED_DURATION;
                        return this.f18501c.emit((Object) null, this);
                    }
                }

                public a(se.f fVar) {
                    this.f18498a = fVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r5, xd.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof h0.m.g.b.a.C0195a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        h0.m$g$b$a$a r0 = (h0.m.g.b.a.C0195a) r0
                        int r1 = r0.f18500b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f18500b = r1
                        goto L_0x0018
                    L_0x0013:
                        h0.m$g$b$a$a r0 = new h0.m$g$b$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f18499a
                        java.lang.Object r1 = yd.d.c()
                        int r2 = r0.f18500b
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        sd.p.b(r6)
                        goto L_0x0053
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        sd.p.b(r6)
                        se.f r6 = r4.f18498a
                        h0.n r5 = (h0.n) r5
                        boolean r2 = r5 instanceof h0.j
                        if (r2 != 0) goto L_0x0073
                        boolean r2 = r5 instanceof h0.h
                        if (r2 != 0) goto L_0x006c
                        boolean r2 = r5 instanceof h0.c
                        if (r2 == 0) goto L_0x0056
                        h0.c r5 = (h0.c) r5
                        java.lang.Object r5 = r5.b()
                        r0.f18500b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x0053
                        return r1
                    L_0x0053:
                        sd.w r5 = sd.w.f38141a
                        return r5
                    L_0x0056:
                        boolean r5 = r5 instanceof h0.o
                        if (r5 == 0) goto L_0x0066
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        java.lang.String r6 = r6.toString()
                        r5.<init>(r6)
                        throw r5
                    L_0x0066:
                        sd.l r5 = new sd.l
                        r5.<init>()
                        throw r5
                    L_0x006c:
                        h0.h r5 = (h0.h) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    L_0x0073:
                        h0.j r5 = (h0.j) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: h0.m.g.b.a.emit(java.lang.Object, xd.d):java.lang.Object");
                }
            }

            public b(se.e eVar) {
                this.f18497a = eVar;
            }

            public Object collect(se.f fVar, xd.d dVar) {
                Object collect = this.f18497a.collect(new a(fVar), dVar);
                if (collect == d.c()) {
                    return collect;
                }
                return w.f38141a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(m<T> mVar, xd.d<? super g> dVar) {
            super(2, dVar);
            this.f18493c = mVar;
        }

        public final xd.d<w> create(Object obj, xd.d<?> dVar) {
            g gVar = new g(this.f18493c, dVar);
            gVar.f18492b = obj;
            return gVar;
        }

        public final Object invoke(se.f<? super T> fVar, xd.d<? super w> dVar) {
            return ((g) create(fVar, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f18491a;
            if (i10 == 0) {
                sd.p.b(obj);
                se.f fVar = (se.f) this.f18492b;
                n nVar = (n) this.f18493c.f18477h.getValue();
                if (!(nVar instanceof c)) {
                    this.f18493c.f18479j.e(new b.a(nVar));
                }
                b bVar = new b(se.g.l(this.f18493c.f18477h, new a(nVar, (xd.d<? super a>) null)));
                this.f18491a = 1;
                if (se.g.n(fVar, bVar, this) == c10) {
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

    /* compiled from: SingleProcessDataStore.kt */
    static final class h extends kotlin.jvm.internal.n implements fe.a<File> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m<T> f18502a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(m<T> mVar) {
            super(0);
            this.f18502a = mVar;
        }

        public final File invoke() {
            File file = (File) this.f18502a.f18470a.invoke();
            String absolutePath = file.getAbsolutePath();
            a aVar = m.f18467k;
            synchronized (aVar.b()) {
                if (!aVar.a().contains(absolutePath)) {
                    Set<String> a10 = aVar.a();
                    kotlin.jvm.internal.m.d(absolutePath, "it");
                    a10.add(absolutePath);
                } else {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
            }
            return file;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
    /* compiled from: SingleProcessDataStore.kt */
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f18503a;

        /* renamed from: b  reason: collision with root package name */
        Object f18504b;

        /* renamed from: c  reason: collision with root package name */
        Object f18505c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f18506d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ m<T> f18507f;

        /* renamed from: g  reason: collision with root package name */
        int f18508g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(m<T> mVar, xd.d<? super i> dVar) {
            super(dVar);
            this.f18507f = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f18506d = obj;
            this.f18508g |= RecyclerView.UNDEFINED_DURATION;
            return this.f18507f.s((b.C0194b) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
    /* compiled from: SingleProcessDataStore.kt */
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f18509a;

        /* renamed from: b  reason: collision with root package name */
        Object f18510b;

        /* renamed from: c  reason: collision with root package name */
        Object f18511c;

        /* renamed from: d  reason: collision with root package name */
        Object f18512d;

        /* renamed from: f  reason: collision with root package name */
        Object f18513f;

        /* renamed from: g  reason: collision with root package name */
        Object f18514g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f18515h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m<T> f18516i;

        /* renamed from: j  reason: collision with root package name */
        int f18517j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(m<T> mVar, xd.d<? super j> dVar) {
            super(dVar);
            this.f18516i = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f18515h = obj;
            this.f18517j |= RecyclerView.UNDEFINED_DURATION;
            return this.f18516i.t(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    public static final class k implements i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ye.a f18518a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.v f18519b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z<T> f18520c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m<T> f18521d;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", l = {503, 337, 339}, m = "updateData")
        /* compiled from: SingleProcessDataStore.kt */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f18522a;

            /* renamed from: b  reason: collision with root package name */
            Object f18523b;

            /* renamed from: c  reason: collision with root package name */
            Object f18524c;

            /* renamed from: d  reason: collision with root package name */
            Object f18525d;

            /* renamed from: f  reason: collision with root package name */
            Object f18526f;

            /* renamed from: g  reason: collision with root package name */
            /* synthetic */ Object f18527g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ k f18528h;

            /* renamed from: i  reason: collision with root package name */
            int f18529i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(k kVar, xd.d<? super a> dVar) {
                super(dVar);
                this.f18528h = kVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f18527g = obj;
                this.f18529i |= RecyclerView.UNDEFINED_DURATION;
                return this.f18528h.a((fe.p) null, this);
            }
        }

        k(ye.a aVar, kotlin.jvm.internal.v vVar, z<T> zVar, m<T> mVar) {
            this.f18518a = aVar;
            this.f18519b = vVar;
            this.f18520c = zVar;
            this.f18521d = mVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009a A[Catch:{ all -> 0x00df }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ba A[Catch:{ all -> 0x0056 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0 A[Catch:{ all -> 0x003b }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7 A[SYNTHETIC, Splitter:B:47:0x00d7] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(fe.p<? super T, ? super xd.d<? super T>, ? extends java.lang.Object> r11, xd.d<? super T> r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof h0.m.k.a
                if (r0 == 0) goto L_0x0013
                r0 = r12
                h0.m$k$a r0 = (h0.m.k.a) r0
                int r1 = r0.f18529i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f18529i = r1
                goto L_0x0018
            L_0x0013:
                h0.m$k$a r0 = new h0.m$k$a
                r0.<init>(r10, r12)
            L_0x0018:
                java.lang.Object r12 = r0.f18527g
                java.lang.Object r1 = yd.d.c()
                int r2 = r0.f18529i
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0076
                if (r2 == r5) goto L_0x005a
                if (r2 == r4) goto L_0x0046
                if (r2 != r3) goto L_0x003e
                java.lang.Object r11 = r0.f18524c
                java.lang.Object r1 = r0.f18523b
                kotlin.jvm.internal.z r1 = (kotlin.jvm.internal.z) r1
                java.lang.Object r0 = r0.f18522a
                ye.a r0 = (ye.a) r0
                sd.p.b(r12)     // Catch:{ all -> 0x003b }
                goto L_0x00cc
            L_0x003b:
                r11 = move-exception
                goto L_0x00e1
            L_0x003e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L_0x0046:
                java.lang.Object r11 = r0.f18524c
                h0.m r11 = (h0.m) r11
                java.lang.Object r2 = r0.f18523b
                kotlin.jvm.internal.z r2 = (kotlin.jvm.internal.z) r2
                java.lang.Object r4 = r0.f18522a
                ye.a r4 = (ye.a) r4
                sd.p.b(r12)     // Catch:{ all -> 0x0056 }
                goto L_0x00b2
            L_0x0056:
                r11 = move-exception
                r0 = r4
                goto L_0x00e1
            L_0x005a:
                java.lang.Object r11 = r0.f18526f
                h0.m r11 = (h0.m) r11
                java.lang.Object r2 = r0.f18525d
                kotlin.jvm.internal.z r2 = (kotlin.jvm.internal.z) r2
                java.lang.Object r5 = r0.f18524c
                kotlin.jvm.internal.v r5 = (kotlin.jvm.internal.v) r5
                java.lang.Object r7 = r0.f18523b
                ye.a r7 = (ye.a) r7
                java.lang.Object r8 = r0.f18522a
                fe.p r8 = (fe.p) r8
                sd.p.b(r12)
                r12 = r7
                r9 = r8
                r8 = r11
                r11 = r9
                goto L_0x0096
            L_0x0076:
                sd.p.b(r12)
                ye.a r12 = r10.f18518a
                kotlin.jvm.internal.v r2 = r10.f18519b
                kotlin.jvm.internal.z<T> r7 = r10.f18520c
                h0.m<T> r8 = r10.f18521d
                r0.f18522a = r11
                r0.f18523b = r12
                r0.f18524c = r2
                r0.f18525d = r7
                r0.f18526f = r8
                r0.f18529i = r5
                java.lang.Object r5 = r12.b(r6, r0)
                if (r5 != r1) goto L_0x0094
                return r1
            L_0x0094:
                r5 = r2
                r2 = r7
            L_0x0096:
                boolean r5 = r5.f36051a     // Catch:{ all -> 0x00df }
                if (r5 != 0) goto L_0x00d7
                T r5 = r2.f36055a     // Catch:{ all -> 0x00df }
                r0.f18522a = r12     // Catch:{ all -> 0x00df }
                r0.f18523b = r2     // Catch:{ all -> 0x00df }
                r0.f18524c = r8     // Catch:{ all -> 0x00df }
                r0.f18525d = r6     // Catch:{ all -> 0x00df }
                r0.f18526f = r6     // Catch:{ all -> 0x00df }
                r0.f18529i = r4     // Catch:{ all -> 0x00df }
                java.lang.Object r11 = r11.invoke(r5, r0)     // Catch:{ all -> 0x00df }
                if (r11 != r1) goto L_0x00af
                return r1
            L_0x00af:
                r4 = r12
                r12 = r11
                r11 = r8
            L_0x00b2:
                T r5 = r2.f36055a     // Catch:{ all -> 0x0056 }
                boolean r5 = kotlin.jvm.internal.m.a(r12, r5)     // Catch:{ all -> 0x0056 }
                if (r5 != 0) goto L_0x00d0
                r0.f18522a = r4     // Catch:{ all -> 0x0056 }
                r0.f18523b = r2     // Catch:{ all -> 0x0056 }
                r0.f18524c = r12     // Catch:{ all -> 0x0056 }
                r0.f18529i = r3     // Catch:{ all -> 0x0056 }
                java.lang.Object r11 = r11.z(r12, r0)     // Catch:{ all -> 0x0056 }
                if (r11 != r1) goto L_0x00c9
                return r1
            L_0x00c9:
                r11 = r12
                r1 = r2
                r0 = r4
            L_0x00cc:
                r1.f36055a = r11     // Catch:{ all -> 0x003b }
                r2 = r1
                goto L_0x00d1
            L_0x00d0:
                r0 = r4
            L_0x00d1:
                T r11 = r2.f36055a     // Catch:{ all -> 0x003b }
                r0.a(r6)
                return r11
            L_0x00d7:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00df }
                java.lang.String r0 = "InitializerApi.updateData should not be called after initialization is complete."
                r11.<init>(r0)     // Catch:{ all -> 0x00df }
                throw r11     // Catch:{ all -> 0x00df }
            L_0x00df:
                r11 = move-exception
                r0 = r12
            L_0x00e1:
                r0.a(r6)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.m.k.a(fe.p, xd.d):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
    /* compiled from: SingleProcessDataStore.kt */
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f18530a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f18531b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m<T> f18532c;

        /* renamed from: d  reason: collision with root package name */
        int f18533d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(m<T> mVar, xd.d<? super l> dVar) {
            super(dVar);
            this.f18532c = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f18531b = obj;
            this.f18533d |= RecyclerView.UNDEFINED_DURATION;
            return this.f18532c.u(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
    /* renamed from: h0.m$m  reason: collision with other inner class name */
    /* compiled from: SingleProcessDataStore.kt */
    static final class C0196m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f18534a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f18535b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m<T> f18536c;

        /* renamed from: d  reason: collision with root package name */
        int f18537d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0196m(m<T> mVar, xd.d<? super C0196m> dVar) {
            super(dVar);
            this.f18536c = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f18535b = obj;
            this.f18537d |= RecyclerView.UNDEFINED_DURATION;
            return this.f18536c.v(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
    /* compiled from: SingleProcessDataStore.kt */
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f18538a;

        /* renamed from: b  reason: collision with root package name */
        Object f18539b;

        /* renamed from: c  reason: collision with root package name */
        Object f18540c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f18541d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ m<T> f18542f;

        /* renamed from: g  reason: collision with root package name */
        int f18543g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(m<T> mVar, xd.d<? super n> dVar) {
            super(dVar);
            this.f18542f = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f18541d = obj;
            this.f18543g |= RecyclerView.UNDEFINED_DURATION;
            return this.f18542f.w(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
    /* compiled from: SingleProcessDataStore.kt */
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f18544a;

        /* renamed from: b  reason: collision with root package name */
        Object f18545b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f18546c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m<T> f18547d;

        /* renamed from: f  reason: collision with root package name */
        int f18548f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(m<T> mVar, xd.d<? super o> dVar) {
            super(dVar);
            this.f18547d = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f18546c = obj;
            this.f18548f |= RecyclerView.UNDEFINED_DURATION;
            return this.f18547d.x(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
    /* compiled from: SingleProcessDataStore.kt */
    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f18549a;

        /* renamed from: b  reason: collision with root package name */
        Object f18550b;

        /* renamed from: c  reason: collision with root package name */
        Object f18551c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f18552d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ m<T> f18553f;

        /* renamed from: g  reason: collision with root package name */
        int f18554g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(m<T> mVar, xd.d<? super p> dVar) {
            super(dVar);
            this.f18553f = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f18552d = obj;
            this.f18554g |= RecyclerView.UNDEFINED_DURATION;
            return this.f18553f.y((fe.p) null, (xd.g) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
    /* compiled from: SingleProcessDataStore.kt */
    static final class q extends kotlin.coroutines.jvm.internal.l implements fe.p<p0, xd.d<? super T>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f18555a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ fe.p<T, xd.d<? super T>, Object> f18556b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T f18557c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(fe.p<? super T, ? super xd.d<? super T>, ? extends Object> pVar, T t10, xd.d<? super q> dVar) {
            super(2, dVar);
            this.f18556b = pVar;
            this.f18557c = t10;
        }

        public final xd.d<w> create(Object obj, xd.d<?> dVar) {
            return new q(this.f18556b, this.f18557c, dVar);
        }

        public final Object invoke(p0 p0Var, xd.d<? super T> dVar) {
            return ((q) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f18555a;
            if (i10 == 0) {
                sd.p.b(obj);
                fe.p<T, xd.d<? super T>, Object> pVar = this.f18556b;
                T t10 = this.f18557c;
                this.f18555a = 1;
                obj = pVar.invoke(t10, this);
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {426}, m = "writeData$datastore_core")
    /* compiled from: SingleProcessDataStore.kt */
    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f18558a;

        /* renamed from: b  reason: collision with root package name */
        Object f18559b;

        /* renamed from: c  reason: collision with root package name */
        Object f18560c;

        /* renamed from: d  reason: collision with root package name */
        Object f18561d;

        /* renamed from: f  reason: collision with root package name */
        Object f18562f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f18563g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m<T> f18564h;

        /* renamed from: i  reason: collision with root package name */
        int f18565i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(m<T> mVar, xd.d<? super r> dVar) {
            super(dVar);
            this.f18564h = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f18563g = obj;
            this.f18565i |= RecyclerView.UNDEFINED_DURATION;
            return this.f18564h.z(null, this);
        }
    }

    public m(fe.a<? extends File> aVar, k<T> kVar, List<? extends fe.p<? super i<T>, ? super xd.d<? super w>, ? extends Object>> list, b<T> bVar, p0 p0Var) {
        kotlin.jvm.internal.m.e(aVar, "produceFile");
        kotlin.jvm.internal.m.e(kVar, "serializer");
        kotlin.jvm.internal.m.e(list, "initTasksList");
        kotlin.jvm.internal.m.e(bVar, "corruptionHandler");
        kotlin.jvm.internal.m.e(p0Var, "scope");
        this.f18470a = aVar;
        this.f18471b = kVar;
        this.f18472c = bVar;
        this.f18473d = p0Var;
        this.f18478i = y.L(list);
        this.f18479j = new l<>(p0Var, new d(this), e.f18487a, new f(this, (xd.d<? super f>) null));
    }

    private final void p(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException(kotlin.jvm.internal.m.m("Unable to create parent directories of ", file));
            }
        }
    }

    /* access modifiers changed from: private */
    public final File q() {
        return (File) this.f18476g.getValue();
    }

    /* access modifiers changed from: private */
    public final Object r(b.a<T> aVar, xd.d<? super w> dVar) {
        n<T> value = this.f18477h.getValue();
        if (!(value instanceof c)) {
            if (value instanceof j) {
                if (value == aVar.a()) {
                    Object v10 = v(dVar);
                    return v10 == d.c() ? v10 : w.f38141a;
                }
            } else if (kotlin.jvm.internal.m.a(value, o.f18566a)) {
                Object v11 = v(dVar);
                return v11 == d.c() ? v11 : w.f38141a;
            } else if (value instanceof h) {
                throw new IllegalStateException("Can't read in final state.".toString());
            }
        }
        return w.f38141a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(h0.m.b.C0194b<T> r9, xd.d<? super sd.w> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof h0.m.i
            if (r0 == 0) goto L_0x0013
            r0 = r10
            h0.m$i r0 = (h0.m.i) r0
            int r1 = r0.f18508g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18508g = r1
            goto L_0x0018
        L_0x0013:
            h0.m$i r0 = new h0.m$i
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f18506d
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f18508g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x004a
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r9 = r0.f18503a
            pe.x r9 = (pe.x) r9
            goto L_0x004e
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            java.lang.Object r9 = r0.f18505c
            pe.x r9 = (pe.x) r9
            java.lang.Object r2 = r0.f18504b
            h0.m r2 = (h0.m) r2
            java.lang.Object r4 = r0.f18503a
            h0.m$b$b r4 = (h0.m.b.C0194b) r4
            sd.p.b(r10)     // Catch:{ all -> 0x0052 }
            r10 = r9
            r9 = r4
            goto L_0x00a0
        L_0x004a:
            java.lang.Object r9 = r0.f18503a
            pe.x r9 = (pe.x) r9
        L_0x004e:
            sd.p.b(r10)     // Catch:{ all -> 0x0052 }
            goto L_0x00b8
        L_0x0052:
            r10 = move-exception
            goto L_0x00d9
        L_0x0055:
            sd.p.b(r10)
            pe.x r10 = r9.a()
            sd.o$a r2 = sd.o.f38128b     // Catch:{ all -> 0x00d5 }
            se.v<h0.n<T>> r2 = r8.f18477h     // Catch:{ all -> 0x00d5 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00d5 }
            h0.n r2 = (h0.n) r2     // Catch:{ all -> 0x00d5 }
            boolean r6 = r2 instanceof h0.c     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x0081
            fe.p r2 = r9.d()     // Catch:{ all -> 0x00d5 }
            xd.g r9 = r9.b()     // Catch:{ all -> 0x00d5 }
            r0.f18503a = r10     // Catch:{ all -> 0x00d5 }
            r0.f18508g = r5     // Catch:{ all -> 0x00d5 }
            java.lang.Object r9 = r8.y(r2, r9, r0)     // Catch:{ all -> 0x00d5 }
            if (r9 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x00b8
        L_0x0081:
            boolean r6 = r2 instanceof h0.j     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            boolean r5 = r2 instanceof h0.o     // Catch:{ all -> 0x00d5 }
        L_0x0088:
            if (r5 == 0) goto L_0x00c4
            h0.n r5 = r9.c()     // Catch:{ all -> 0x00d5 }
            if (r2 != r5) goto L_0x00bd
            r0.f18503a = r9     // Catch:{ all -> 0x00d5 }
            r0.f18504b = r8     // Catch:{ all -> 0x00d5 }
            r0.f18505c = r10     // Catch:{ all -> 0x00d5 }
            r0.f18508g = r4     // Catch:{ all -> 0x00d5 }
            java.lang.Object r2 = r8.u(r0)     // Catch:{ all -> 0x00d5 }
            if (r2 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r2 = r8
        L_0x00a0:
            fe.p r4 = r9.d()     // Catch:{ all -> 0x00d5 }
            xd.g r9 = r9.b()     // Catch:{ all -> 0x00d5 }
            r0.f18503a = r10     // Catch:{ all -> 0x00d5 }
            r5 = 0
            r0.f18504b = r5     // Catch:{ all -> 0x00d5 }
            r0.f18505c = r5     // Catch:{ all -> 0x00d5 }
            r0.f18508g = r3     // Catch:{ all -> 0x00d5 }
            java.lang.Object r9 = r2.y(r4, r9, r0)     // Catch:{ all -> 0x00d5 }
            if (r9 != r1) goto L_0x007d
            return r1
        L_0x00b8:
            java.lang.Object r10 = sd.o.b(r10)     // Catch:{ all -> 0x0052 }
            goto L_0x00e3
        L_0x00bd:
            h0.j r2 = (h0.j) r2     // Catch:{ all -> 0x00d5 }
            java.lang.Throwable r9 = r2.a()     // Catch:{ all -> 0x00d5 }
            throw r9     // Catch:{ all -> 0x00d5 }
        L_0x00c4:
            boolean r9 = r2 instanceof h0.h     // Catch:{ all -> 0x00d5 }
            if (r9 == 0) goto L_0x00cf
            h0.h r2 = (h0.h) r2     // Catch:{ all -> 0x00d5 }
            java.lang.Throwable r9 = r2.a()     // Catch:{ all -> 0x00d5 }
            throw r9     // Catch:{ all -> 0x00d5 }
        L_0x00cf:
            sd.l r9 = new sd.l     // Catch:{ all -> 0x00d5 }
            r9.<init>()     // Catch:{ all -> 0x00d5 }
            throw r9     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x00d9:
            sd.o$a r0 = sd.o.f38128b
            java.lang.Object r10 = sd.p.a(r10)
            java.lang.Object r10 = sd.o.b(r10)
        L_0x00e3:
            pe.z.c(r9, r10)
            sd.w r9 = sd.w.f38141a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.m.s(h0.m$b$b, xd.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(xd.d<? super sd.w> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof h0.m.j
            if (r0 == 0) goto L_0x0013
            r0 = r14
            h0.m$j r0 = (h0.m.j) r0
            int r1 = r0.f18517j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18517j = r1
            goto L_0x0018
        L_0x0013:
            h0.m$j r0 = new h0.m$j
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f18515h
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f18517j
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x007b
            if (r2 == r6) goto L_0x0067
            if (r2 == r4) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r1 = r0.f18512d
            ye.a r1 = (ye.a) r1
            java.lang.Object r2 = r0.f18511c
            kotlin.jvm.internal.v r2 = (kotlin.jvm.internal.v) r2
            java.lang.Object r3 = r0.f18510b
            kotlin.jvm.internal.z r3 = (kotlin.jvm.internal.z) r3
            java.lang.Object r0 = r0.f18509a
            h0.m r0 = (h0.m) r0
            sd.p.b(r14)
            goto L_0x0117
        L_0x0042:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x004a:
            java.lang.Object r2 = r0.f18514g
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r8 = r0.f18513f
            h0.m$k r8 = (h0.m.k) r8
            java.lang.Object r9 = r0.f18512d
            kotlin.jvm.internal.v r9 = (kotlin.jvm.internal.v) r9
            java.lang.Object r10 = r0.f18511c
            kotlin.jvm.internal.z r10 = (kotlin.jvm.internal.z) r10
            java.lang.Object r11 = r0.f18510b
            ye.a r11 = (ye.a) r11
            java.lang.Object r12 = r0.f18509a
            h0.m r12 = (h0.m) r12
            sd.p.b(r14)
            goto L_0x00d8
        L_0x0067:
            java.lang.Object r2 = r0.f18512d
            kotlin.jvm.internal.z r2 = (kotlin.jvm.internal.z) r2
            java.lang.Object r8 = r0.f18511c
            kotlin.jvm.internal.z r8 = (kotlin.jvm.internal.z) r8
            java.lang.Object r9 = r0.f18510b
            ye.a r9 = (ye.a) r9
            java.lang.Object r10 = r0.f18509a
            h0.m r10 = (h0.m) r10
            sd.p.b(r14)
            goto L_0x00b8
        L_0x007b:
            sd.p.b(r14)
            se.v<h0.n<T>> r14 = r13.f18477h
            java.lang.Object r14 = r14.getValue()
            h0.o r2 = h0.o.f18566a
            boolean r14 = kotlin.jvm.internal.m.a(r14, r2)
            if (r14 != 0) goto L_0x0099
            se.v<h0.n<T>> r14 = r13.f18477h
            java.lang.Object r14 = r14.getValue()
            boolean r14 = r14 instanceof h0.j
            if (r14 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r14 = 0
            goto L_0x009a
        L_0x0099:
            r14 = 1
        L_0x009a:
            if (r14 == 0) goto L_0x0136
            ye.a r9 = ye.c.b(r5, r6, r7)
            kotlin.jvm.internal.z r2 = new kotlin.jvm.internal.z
            r2.<init>()
            r0.f18509a = r13
            r0.f18510b = r9
            r0.f18511c = r2
            r0.f18512d = r2
            r0.f18517j = r6
            java.lang.Object r14 = r13.x(r0)
            if (r14 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            r10 = r13
            r8 = r2
        L_0x00b8:
            r2.f36055a = r14
            kotlin.jvm.internal.v r14 = new kotlin.jvm.internal.v
            r14.<init>()
            h0.m$k r2 = new h0.m$k
            r2.<init>(r9, r14, r8, r10)
            java.util.List<? extends fe.p<? super h0.i<T>, ? super xd.d<? super sd.w>, ? extends java.lang.Object>> r11 = r10.f18478i
            if (r11 != 0) goto L_0x00ce
            r2 = r1
            r1 = r9
            r9 = r14
            r14 = r0
            r0 = r10
            goto L_0x00fe
        L_0x00ce:
            java.util.Iterator r11 = r11.iterator()
            r12 = r10
            r10 = r8
            r8 = r2
            r2 = r11
            r11 = r9
            r9 = r14
        L_0x00d8:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00f9
            java.lang.Object r14 = r2.next()
            fe.p r14 = (fe.p) r14
            r0.f18509a = r12
            r0.f18510b = r11
            r0.f18511c = r10
            r0.f18512d = r9
            r0.f18513f = r8
            r0.f18514g = r2
            r0.f18517j = r4
            java.lang.Object r14 = r14.invoke(r8, r0)
            if (r14 != r1) goto L_0x00d8
            return r1
        L_0x00f9:
            r14 = r0
            r2 = r1
            r8 = r10
            r1 = r11
            r0 = r12
        L_0x00fe:
            r0.f18478i = r7
            r14.f18509a = r0
            r14.f18510b = r8
            r14.f18511c = r9
            r14.f18512d = r1
            r14.f18513f = r7
            r14.f18514g = r7
            r14.f18517j = r3
            java.lang.Object r14 = r1.b(r7, r14)
            if (r14 != r2) goto L_0x0115
            return r2
        L_0x0115:
            r3 = r8
            r2 = r9
        L_0x0117:
            r2.f36051a = r6     // Catch:{ all -> 0x0131 }
            sd.w r14 = sd.w.f38141a     // Catch:{ all -> 0x0131 }
            r1.a(r7)
            se.v<h0.n<T>> r0 = r0.f18477h
            h0.c r1 = new h0.c
            T r2 = r3.f36055a
            if (r2 == 0) goto L_0x012a
            int r5 = r2.hashCode()
        L_0x012a:
            r1.<init>(r2, r5)
            r0.setValue(r1)
            return r14
        L_0x0131:
            r14 = move-exception
            r1.a(r7)
            throw r14
        L_0x0136:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.m.t(xd.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(xd.d<? super sd.w> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof h0.m.l
            if (r0 == 0) goto L_0x0013
            r0 = r5
            h0.m$l r0 = (h0.m.l) r0
            int r1 = r0.f18533d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18533d = r1
            goto L_0x0018
        L_0x0013:
            h0.m$l r0 = new h0.m$l
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f18531b
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f18533d
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.f18530a
            h0.m r0 = (h0.m) r0
            sd.p.b(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0045
        L_0x002d:
            r5 = move-exception
            goto L_0x004a
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            sd.p.b(r5)
            r0.f18530a = r4     // Catch:{ all -> 0x0048 }
            r0.f18533d = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r4.t(r0)     // Catch:{ all -> 0x0048 }
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            sd.w r5 = sd.w.f38141a
            return r5
        L_0x0048:
            r5 = move-exception
            r0 = r4
        L_0x004a:
            se.v<h0.n<T>> r0 = r0.f18477h
            h0.j r1 = new h0.j
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.m.u(xd.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(xd.d<? super sd.w> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof h0.m.C0196m
            if (r0 == 0) goto L_0x0013
            r0 = r5
            h0.m$m r0 = (h0.m.C0196m) r0
            int r1 = r0.f18537d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18537d = r1
            goto L_0x0018
        L_0x0013:
            h0.m$m r0 = new h0.m$m
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f18535b
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f18537d
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.f18534a
            h0.m r0 = (h0.m) r0
            sd.p.b(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0051
        L_0x002d:
            r5 = move-exception
            goto L_0x0047
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            sd.p.b(r5)
            r0.f18534a = r4     // Catch:{ all -> 0x0045 }
            r0.f18537d = r3     // Catch:{ all -> 0x0045 }
            java.lang.Object r5 = r4.t(r0)     // Catch:{ all -> 0x0045 }
            if (r5 != r1) goto L_0x0051
            return r1
        L_0x0045:
            r5 = move-exception
            r0 = r4
        L_0x0047:
            se.v<h0.n<T>> r0 = r0.f18477h
            h0.j r1 = new h0.j
            r1.<init>(r5)
            r0.setValue(r1)
        L_0x0051:
            sd.w r5 = sd.w.f38141a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.m.v(xd.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        ce.b.a(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006d, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:24:0x0060, B:30:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object w(xd.d<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof h0.m.n
            if (r0 == 0) goto L_0x0013
            r0 = r6
            h0.m$n r0 = (h0.m.n) r0
            int r1 = r0.f18543g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18543g = r1
            goto L_0x0018
        L_0x0013:
            h0.m$n r0 = new h0.m$n
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f18541d
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f18543g
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.f18540c
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f18539b
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f18538a
            h0.m r0 = (h0.m) r0
            sd.p.b(r6)     // Catch:{ all -> 0x0035 }
            goto L_0x0060
        L_0x0035:
            r6 = move-exception
            goto L_0x0068
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003f:
            sd.p.b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x006e }
            java.io.File r6 = r5.q()     // Catch:{ FileNotFoundException -> 0x006e }
            r2.<init>(r6)     // Catch:{ FileNotFoundException -> 0x006e }
            r6 = 0
            h0.k<T> r4 = r5.f18471b     // Catch:{ all -> 0x0066 }
            r0.f18538a = r5     // Catch:{ all -> 0x0066 }
            r0.f18539b = r2     // Catch:{ all -> 0x0066 }
            r0.f18540c = r6     // Catch:{ all -> 0x0066 }
            r0.f18543g = r3     // Catch:{ all -> 0x0066 }
            java.lang.Object r0 = r4.readFrom(r2, r0)     // Catch:{ all -> 0x0066 }
            if (r0 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r1 = r6
            r6 = r0
            r0 = r5
        L_0x0060:
            ce.b.a(r2, r1)     // Catch:{ FileNotFoundException -> 0x0064 }
            return r6
        L_0x0064:
            r6 = move-exception
            goto L_0x0070
        L_0x0066:
            r6 = move-exception
            r0 = r5
        L_0x0068:
            throw r6     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r1 = move-exception
            ce.b.a(r2, r6)     // Catch:{ FileNotFoundException -> 0x0064 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0064 }
        L_0x006e:
            r6 = move-exception
            r0 = r5
        L_0x0070:
            java.io.File r1 = r0.q()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x0081
            h0.k<T> r6 = r0.f18471b
            java.lang.Object r6 = r6.getDefaultValue()
            return r6
        L_0x0081:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.m.w(xd.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(xd.d<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof h0.m.o
            if (r0 == 0) goto L_0x0013
            r0 = r8
            h0.m$o r0 = (h0.m.o) r0
            int r1 = r0.f18548f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18548f = r1
            goto L_0x0018
        L_0x0013:
            h0.m$o r0 = new h0.m$o
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f18546c
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f18548f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x004b
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.f18545b
            java.lang.Object r0 = r0.f18544a
            h0.a r0 = (h0.a) r0
            sd.p.b(r8)     // Catch:{ IOException -> 0x0035 }
            goto L_0x0087
        L_0x0035:
            r8 = move-exception
            goto L_0x008a
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003f:
            java.lang.Object r2 = r0.f18545b
            h0.a r2 = (h0.a) r2
            java.lang.Object r4 = r0.f18544a
            h0.m r4 = (h0.m) r4
            sd.p.b(r8)
            goto L_0x0079
        L_0x004b:
            java.lang.Object r2 = r0.f18544a
            h0.m r2 = (h0.m) r2
            sd.p.b(r8)     // Catch:{ a -> 0x0053 }
            goto L_0x0063
        L_0x0053:
            r8 = move-exception
            goto L_0x0066
        L_0x0055:
            sd.p.b(r8)
            r0.f18544a = r7     // Catch:{ a -> 0x0064 }
            r0.f18548f = r5     // Catch:{ a -> 0x0064 }
            java.lang.Object r8 = r7.w(r0)     // Catch:{ a -> 0x0064 }
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            return r8
        L_0x0064:
            r8 = move-exception
            r2 = r7
        L_0x0066:
            h0.b<T> r5 = r2.f18472c
            r0.f18544a = r2
            r0.f18545b = r8
            r0.f18548f = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L_0x0079:
            r0.f18544a = r2     // Catch:{ IOException -> 0x0088 }
            r0.f18545b = r8     // Catch:{ IOException -> 0x0088 }
            r0.f18548f = r3     // Catch:{ IOException -> 0x0088 }
            java.lang.Object r0 = r4.z(r8, r0)     // Catch:{ IOException -> 0x0088 }
            if (r0 != r1) goto L_0x0086
            return r1
        L_0x0086:
            r1 = r8
        L_0x0087:
            return r1
        L_0x0088:
            r8 = move-exception
            r0 = r2
        L_0x008a:
            sd.b.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.m.x(xd.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y(fe.p<? super T, ? super xd.d<? super T>, ? extends java.lang.Object> r8, xd.g r9, xd.d<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof h0.m.p
            if (r0 == 0) goto L_0x0013
            r0 = r10
            h0.m$p r0 = (h0.m.p) r0
            int r1 = r0.f18554g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18554g = r1
            goto L_0x0018
        L_0x0013:
            h0.m$p r0 = new h0.m$p
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f18552d
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f18554g
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r8 = r0.f18550b
            java.lang.Object r9 = r0.f18549a
            h0.m r9 = (h0.m) r9
            sd.p.b(r10)
            goto L_0x008e
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            java.lang.Object r8 = r0.f18551c
            java.lang.Object r9 = r0.f18550b
            h0.c r9 = (h0.c) r9
            java.lang.Object r2 = r0.f18549a
            h0.m r2 = (h0.m) r2
            sd.p.b(r10)
            goto L_0x0073
        L_0x0049:
            sd.p.b(r10)
            se.v<h0.n<T>> r10 = r7.f18477h
            java.lang.Object r10 = r10.getValue()
            h0.c r10 = (h0.c) r10
            r10.a()
            java.lang.Object r2 = r10.b()
            h0.m$q r6 = new h0.m$q
            r6.<init>(r8, r2, r3)
            r0.f18549a = r7
            r0.f18550b = r10
            r0.f18551c = r2
            r0.f18554g = r5
            java.lang.Object r8 = pe.i.g(r9, r6, r0)
            if (r8 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L_0x0073:
            r9.a()
            boolean r9 = kotlin.jvm.internal.m.a(r8, r10)
            if (r9 == 0) goto L_0x007d
            goto L_0x00a0
        L_0x007d:
            r0.f18549a = r2
            r0.f18550b = r10
            r0.f18551c = r3
            r0.f18554g = r4
            java.lang.Object r8 = r2.z(r10, r0)
            if (r8 != r1) goto L_0x008c
            return r1
        L_0x008c:
            r8 = r10
            r9 = r2
        L_0x008e:
            se.v<h0.n<T>> r9 = r9.f18477h
            h0.c r10 = new h0.c
            if (r8 == 0) goto L_0x0099
            int r0 = r8.hashCode()
            goto L_0x009a
        L_0x0099:
            r0 = 0
        L_0x009a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        L_0x00a0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.m.y(fe.p, xd.g, xd.d):java.lang.Object");
    }

    public Object a(fe.p<? super T, ? super xd.d<? super T>, ? extends Object> pVar, xd.d<? super T> dVar) {
        x b10 = pe.z.b((c2) null, 1, (Object) null);
        this.f18479j.e(new b.C0194b(pVar, b10, this.f18477h.getValue(), dVar.getContext()));
        return b10.E0(dVar);
    }

    public se.e<T> getData() {
        return this.f18474e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bf, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        ce.b.a(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c5, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:26:0x0092, B:34:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009f A[Catch:{ all -> 0x00bf, IOException -> 0x00c4 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0 A[Catch:{ all -> 0x00bf, IOException -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z(T r8, xd.d<? super sd.w> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof h0.m.r
            if (r0 == 0) goto L_0x0013
            r0 = r9
            h0.m$r r0 = (h0.m.r) r0
            int r1 = r0.f18565i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18565i = r1
            goto L_0x0018
        L_0x0013:
            h0.m$r r0 = new h0.m$r
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f18563g
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f18565i
            r3 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            java.lang.Object r8 = r0.f18562f
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.f18561d
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f18560c
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.f18559b
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.f18558a
            h0.m r0 = (h0.m) r0
            sd.p.b(r9)     // Catch:{ all -> 0x003d }
            goto L_0x0089
        L_0x003d:
            r8 = move-exception
            goto L_0x00be
        L_0x0040:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0048:
            sd.p.b(r9)
            java.io.File r9 = r7.q()
            r7.p(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.q()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f18475f
            java.lang.String r2 = kotlin.jvm.internal.m.m(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00c7 }
            r2.<init>(r9)     // Catch:{ IOException -> 0x00c7 }
            r4 = 0
            h0.k<T> r5 = r7.f18471b     // Catch:{ all -> 0x00bc }
            h0.m$c r6 = new h0.m$c     // Catch:{ all -> 0x00bc }
            r6.<init>(r2)     // Catch:{ all -> 0x00bc }
            r0.f18558a = r7     // Catch:{ all -> 0x00bc }
            r0.f18559b = r9     // Catch:{ all -> 0x00bc }
            r0.f18560c = r2     // Catch:{ all -> 0x00bc }
            r0.f18561d = r4     // Catch:{ all -> 0x00bc }
            r0.f18562f = r2     // Catch:{ all -> 0x00bc }
            r0.f18565i = r3     // Catch:{ all -> 0x00bc }
            java.lang.Object r8 = r5.writeTo(r8, r6, r0)     // Catch:{ all -> 0x00bc }
            if (r8 != r1) goto L_0x0085
            return r1
        L_0x0085:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r4
        L_0x0089:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch:{ all -> 0x003d }
            r8.sync()     // Catch:{ all -> 0x003d }
            sd.w r8 = sd.w.f38141a     // Catch:{ all -> 0x003d }
            ce.b.a(r2, r1)     // Catch:{ IOException -> 0x00c4 }
            java.io.File r9 = r0.q()     // Catch:{ IOException -> 0x00c4 }
            boolean r9 = r3.renameTo(r9)     // Catch:{ IOException -> 0x00c4 }
            if (r9 == 0) goto L_0x00a0
            return r8
        L_0x00a0:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ IOException -> 0x00c4 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c4 }
            r9.<init>()     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch:{ IOException -> 0x00c4 }
            r9.append(r3)     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x00c4 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00c4 }
            throw r8     // Catch:{ IOException -> 0x00c4 }
        L_0x00bc:
            r8 = move-exception
            r3 = r9
        L_0x00be:
            throw r8     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r9 = move-exception
            ce.b.a(r2, r8)     // Catch:{ IOException -> 0x00c4 }
            throw r9     // Catch:{ IOException -> 0x00c4 }
        L_0x00c4:
            r8 = move-exception
            r9 = r3
            goto L_0x00c8
        L_0x00c7:
            r8 = move-exception
        L_0x00c8:
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x00d1
            r9.delete()
        L_0x00d1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.m.z(java.lang.Object, xd.d):java.lang.Object");
    }
}
