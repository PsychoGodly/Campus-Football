package h0;

import androidx.recyclerview.widget.RecyclerView;
import fe.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import sd.w;
import xd.d;

/* compiled from: DataMigrationInitializer.kt */
public final class e<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18436a = new a((h) null);

    /* compiled from: DataMigrationInitializer.kt */
    public static final class a {

        @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
        /* renamed from: h0.e$a$a  reason: collision with other inner class name */
        /* compiled from: DataMigrationInitializer.kt */
        static final class C0192a extends l implements p<i<T>, d<? super w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f18437a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f18438b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List<d<T>> f18439c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0192a(List<? extends d<T>> list, d<? super C0192a> dVar) {
                super(2, dVar);
                this.f18439c = list;
            }

            public final d<w> create(Object obj, d<?> dVar) {
                C0192a aVar = new C0192a(this.f18439c, dVar);
                aVar.f18438b = obj;
                return aVar;
            }

            /* renamed from: d */
            public final Object invoke(i<T> iVar, d<? super w> dVar) {
                return ((C0192a) create(iVar, dVar)).invokeSuspend(w.f38141a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f18437a;
                if (i10 == 0) {
                    sd.p.b(obj);
                    a aVar = e.f18436a;
                    List<d<T>> list = this.f18439c;
                    this.f18437a = 1;
                    if (aVar.c(list, (i) this.f18438b, this) == c10) {
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

        @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
        /* compiled from: DataMigrationInitializer.kt */
        static final class b<T> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            Object f18440a;

            /* renamed from: b  reason: collision with root package name */
            Object f18441b;

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f18442c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a f18443d;

            /* renamed from: f  reason: collision with root package name */
            int f18444f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar, d<? super b> dVar) {
                super(dVar);
                this.f18443d = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f18442c = obj;
                this.f18444f |= RecyclerView.UNDEFINED_DURATION;
                return this.f18443d.c((List) null, (i) null, this);
            }
        }

        @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
        /* compiled from: DataMigrationInitializer.kt */
        static final class c extends l implements p<T, d<? super T>, Object> {

            /* renamed from: a  reason: collision with root package name */
            Object f18445a;

            /* renamed from: b  reason: collision with root package name */
            Object f18446b;

            /* renamed from: c  reason: collision with root package name */
            Object f18447c;

            /* renamed from: d  reason: collision with root package name */
            int f18448d;

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ Object f18449f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ List<d<T>> f18450g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ List<fe.l<d<? super w>, Object>> f18451h;

            @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
            /* renamed from: h0.e$a$c$a  reason: collision with other inner class name */
            /* compiled from: DataMigrationInitializer.kt */
            static final class C0193a extends l implements fe.l<d<? super w>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f18452a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ d<T> f18453b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0193a(d<T> dVar, d<? super C0193a> dVar2) {
                    super(1, dVar2);
                    this.f18453b = dVar;
                }

                public final d<w> create(d<?> dVar) {
                    return new C0193a(this.f18453b, dVar);
                }

                public final Object invoke(d<? super w> dVar) {
                    return ((C0193a) create(dVar)).invokeSuspend(w.f38141a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object c10 = d.c();
                    int i10 = this.f18452a;
                    if (i10 == 0) {
                        sd.p.b(obj);
                        d<T> dVar = this.f18453b;
                        this.f18452a = 1;
                        if (dVar.cleanUp(this) == c10) {
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

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(List<? extends d<T>> list, List<fe.l<d<? super w>, Object>> list2, d<? super c> dVar) {
                super(2, dVar);
                this.f18450g = list;
                this.f18451h = list2;
            }

            public final d<w> create(Object obj, d<?> dVar) {
                c cVar = new c(this.f18450g, this.f18451h, dVar);
                cVar.f18449f = obj;
                return cVar;
            }

            /* renamed from: d */
            public final Object invoke(T t10, d<? super T> dVar) {
                return ((c) create(t10, dVar)).invokeSuspend(w.f38141a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x008e  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = yd.d.c()
                    int r1 = r10.f18448d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x003a
                    if (r1 == r3) goto L_0x0024
                    if (r1 != r2) goto L_0x001c
                    java.lang.Object r1 = r10.f18445a
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r10.f18449f
                    java.util.List r4 = (java.util.List) r4
                    sd.p.b(r11)
                    r7 = r10
                    goto L_0x008c
                L_0x001c:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L_0x0024:
                    java.lang.Object r1 = r10.f18447c
                    java.lang.Object r4 = r10.f18446b
                    h0.d r4 = (h0.d) r4
                    java.lang.Object r5 = r10.f18445a
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r10.f18449f
                    java.util.List r6 = (java.util.List) r6
                    sd.p.b(r11)
                    r7 = r10
                    r9 = r6
                    r6 = r4
                    r4 = r9
                    goto L_0x006a
                L_0x003a:
                    sd.p.b(r11)
                    java.lang.Object r11 = r10.f18449f
                    java.util.List<h0.d<T>> r1 = r10.f18450g
                    java.util.List<fe.l<xd.d<? super sd.w>, java.lang.Object>> r4 = r10.f18451h
                    java.util.Iterator r1 = r1.iterator()
                    r5 = r10
                L_0x0048:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L_0x0091
                    java.lang.Object r6 = r1.next()
                    h0.d r6 = (h0.d) r6
                    r5.f18449f = r4
                    r5.f18445a = r1
                    r5.f18446b = r6
                    r5.f18447c = r11
                    r5.f18448d = r3
                    java.lang.Object r7 = r6.shouldMigrate(r11, r5)
                    if (r7 != r0) goto L_0x0065
                    return r0
                L_0x0065:
                    r9 = r1
                    r1 = r11
                    r11 = r7
                    r7 = r5
                    r5 = r9
                L_0x006a:
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L_0x008e
                    h0.e$a$c$a r11 = new h0.e$a$c$a
                    r8 = 0
                    r11.<init>(r6, r8)
                    r4.add(r11)
                    r7.f18449f = r4
                    r7.f18445a = r5
                    r7.f18446b = r8
                    r7.f18447c = r8
                    r7.f18448d = r2
                    java.lang.Object r11 = r6.migrate(r1, r7)
                    if (r11 != r0) goto L_0x008f
                    return r0
                L_0x008c:
                    r5 = r7
                    goto L_0x0048
                L_0x008e:
                    r11 = r1
                L_0x008f:
                    r1 = r5
                    goto L_0x008c
                L_0x0091:
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: h0.e.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T> java.lang.Object c(java.util.List<? extends h0.d<T>> r7, h0.i<T> r8, xd.d<? super sd.w> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof h0.e.a.b
                if (r0 == 0) goto L_0x0013
                r0 = r9
                h0.e$a$b r0 = (h0.e.a.b) r0
                int r1 = r0.f18444f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f18444f = r1
                goto L_0x0018
            L_0x0013:
                h0.e$a$b r0 = new h0.e$a$b
                r0.<init>(r6, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f18442c
                java.lang.Object r1 = yd.d.c()
                int r2 = r0.f18444f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r7 = r0.f18441b
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f18440a
                kotlin.jvm.internal.z r8 = (kotlin.jvm.internal.z) r8
                sd.p.b(r9)     // Catch:{ all -> 0x0034 }
                goto L_0x0069
            L_0x0034:
                r9 = move-exception
                goto L_0x0082
            L_0x0036:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x003e:
                java.lang.Object r7 = r0.f18440a
                java.util.List r7 = (java.util.List) r7
                sd.p.b(r9)
                goto L_0x0060
            L_0x0046:
                sd.p.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                h0.e$a$c r2 = new h0.e$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f18440a = r9
                r0.f18444f = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L_0x005f
                return r1
            L_0x005f:
                r7 = r9
            L_0x0060:
                kotlin.jvm.internal.z r8 = new kotlin.jvm.internal.z
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x0069:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x0094
                java.lang.Object r9 = r7.next()
                fe.l r9 = (fe.l) r9
                r0.f18440a = r8     // Catch:{ all -> 0x0034 }
                r0.f18441b = r7     // Catch:{ all -> 0x0034 }
                r0.f18444f = r3     // Catch:{ all -> 0x0034 }
                java.lang.Object r9 = r9.invoke(r0)     // Catch:{ all -> 0x0034 }
                if (r9 != r1) goto L_0x0069
                return r1
            L_0x0082:
                T r2 = r8.f36055a
                if (r2 != 0) goto L_0x0089
                r8.f36055a = r9
                goto L_0x0069
            L_0x0089:
                kotlin.jvm.internal.m.b(r2)
                T r2 = r8.f36055a
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                sd.b.a(r2, r9)
                goto L_0x0069
            L_0x0094:
                T r7 = r8.f36055a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L_0x009d
                sd.w r7 = sd.w.f38141a
                return r7
            L_0x009d:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.e.a.c(java.util.List, h0.i, xd.d):java.lang.Object");
        }

        public final <T> p<i<T>, d<? super w>, Object> b(List<? extends d<T>> list) {
            m.e(list, "migrations");
            return new C0192a(list, (d<? super C0192a>) null);
        }
    }
}
