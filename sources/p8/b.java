package p8;

import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.z;
import java.util.Collections;
import java.util.List;

/* compiled from: ArrayValue */
public final class b extends z<b, C0323b> implements c {
    /* access modifiers changed from: private */
    public static final b DEFAULT_INSTANCE;
    private static volatile f1<b> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private d0.j<d0> values_ = z.F();

    /* compiled from: ArrayValue */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29513a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.z$f[] r0 = com.google.protobuf.z.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29513a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29513a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29513a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29513a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29513a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29513a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29513a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.b.a.<clinit>():void");
        }
    }

    /* renamed from: p8.b$b  reason: collision with other inner class name */
    /* compiled from: ArrayValue */
    public static final class C0323b extends z.a<b, C0323b> implements c {
        /* synthetic */ C0323b(a aVar) {
            this();
        }

        public C0323b F(Iterable<? extends d0> iterable) {
            w();
            ((b) this.f27301b).i0(iterable);
            return this;
        }

        public C0323b G(d0 d0Var) {
            w();
            ((b) this.f27301b).j0(d0Var);
            return this;
        }

        public d0 H(int i10) {
            return ((b) this.f27301b).m0(i10);
        }

        public int I() {
            return ((b) this.f27301b).n0();
        }

        public C0323b J(int i10) {
            w();
            ((b) this.f27301b).p0(i10);
            return this;
        }

        public List<d0> g() {
            return Collections.unmodifiableList(((b) this.f27301b).g());
        }

        private C0323b() {
            super(b.DEFAULT_INSTANCE);
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        z.b0(b.class, bVar);
    }

    private b() {
    }

    /* access modifiers changed from: private */
    public void i0(Iterable<? extends d0> iterable) {
        k0();
        com.google.protobuf.a.h(iterable, this.values_);
    }

    /* access modifiers changed from: private */
    public void j0(d0 d0Var) {
        d0Var.getClass();
        k0();
        this.values_.add(d0Var);
    }

    private void k0() {
        d0.j<d0> jVar = this.values_;
        if (!jVar.t()) {
            this.values_ = z.Q(jVar);
        }
    }

    public static b l0() {
        return DEFAULT_INSTANCE;
    }

    public static C0323b o0() {
        return (C0323b) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void p0(int i10) {
        k0();
        this.values_.remove(i10);
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (a.f29513a[fVar.ordinal()]) {
            case 1:
                return new b();
            case 2:
                return new C0323b((a) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", d0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<b> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (b.class) {
                        f1Var = PARSER;
                        if (f1Var == null) {
                            f1Var = new z.b<>(DEFAULT_INSTANCE);
                            PARSER = f1Var;
                        }
                    }
                }
                return f1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public List<d0> g() {
        return this.values_;
    }

    public d0 m0(int i10) {
        return this.values_.get(i10);
    }

    public int n0() {
        return this.values_.size();
    }
}
