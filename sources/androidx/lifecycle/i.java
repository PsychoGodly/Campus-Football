package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: Lifecycle.kt */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private AtomicReference<Object> f3922a = new AtomicReference<>();

    /* compiled from: Lifecycle.kt */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;
        
        public static final C0059a Companion = null;

        /* renamed from: androidx.lifecycle.i$a$a  reason: collision with other inner class name */
        /* compiled from: Lifecycle.kt */
        public static final class C0059a {

            /* renamed from: androidx.lifecycle.i$a$a$a  reason: collision with other inner class name */
            /* compiled from: Lifecycle.kt */
            public /* synthetic */ class C0060a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f3923a = null;

                /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
                static {
                    /*
                        androidx.lifecycle.i$b[] r0 = androidx.lifecycle.i.b.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        androidx.lifecycle.i$b r1 = androidx.lifecycle.i.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        androidx.lifecycle.i$b r1 = androidx.lifecycle.i.b.STARTED     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        androidx.lifecycle.i$b r1 = androidx.lifecycle.i.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        androidx.lifecycle.i$b r1 = androidx.lifecycle.i.b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        androidx.lifecycle.i$b r1 = androidx.lifecycle.i.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0034 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                        r2 = 5
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                    L_0x0034:
                        f3923a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.i.a.C0059a.C0060a.<clinit>():void");
                }
            }

            private C0059a() {
            }

            public /* synthetic */ C0059a(h hVar) {
                this();
            }

            public final a a(b bVar) {
                m.e(bVar, "state");
                int i10 = C0060a.f3923a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_DESTROY;
                }
                if (i10 == 2) {
                    return a.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a b(b bVar) {
                m.e(bVar, "state");
                int i10 = C0060a.f3923a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_START;
                }
                if (i10 == 2) {
                    return a.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public final a c(b bVar) {
                m.e(bVar, "state");
                int i10 = C0060a.f3923a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_CREATE;
                }
                if (i10 == 2) {
                    return a.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }
        }

        /* compiled from: Lifecycle.kt */
        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f3924a = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    androidx.lifecycle.i$a[] r0 = androidx.lifecycle.i.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.lifecycle.i$a r1 = androidx.lifecycle.i.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.lifecycle.i$a r1 = androidx.lifecycle.i.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.lifecycle.i$a r1 = androidx.lifecycle.i.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.lifecycle.i$a r1 = androidx.lifecycle.i.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    androidx.lifecycle.i$a r1 = androidx.lifecycle.i.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    androidx.lifecycle.i$a r1 = androidx.lifecycle.i.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    androidx.lifecycle.i$a r1 = androidx.lifecycle.i.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    f3924a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.i.a.b.<clinit>():void");
            }
        }

        static {
            Companion = new C0059a((h) null);
        }

        public static final a c(b bVar) {
            return Companion.a(bVar);
        }

        public static final a e(b bVar) {
            return Companion.c(bVar);
        }

        public final b d() {
            switch (b.f3924a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* compiled from: Lifecycle.kt */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean c(b bVar) {
            m.e(bVar, "state");
            return compareTo(bVar) >= 0;
        }
    }

    public abstract void a(o oVar);

    public abstract b b();

    public final AtomicReference<Object> c() {
        return this.f3922a;
    }

    public abstract void d(o oVar);
}
