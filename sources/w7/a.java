package w7;

import com.google.protobuf.e0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import p8.k;

/* compiled from: MaybeDocument */
public final class a extends z<a, b> implements w0 {
    /* access modifiers changed from: private */
    public static final a DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile f1<a> PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    /* renamed from: w7.a$a  reason: collision with other inner class name */
    /* compiled from: MaybeDocument */
    static /* synthetic */ class C0347a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30834a;

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
                f30834a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30834a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30834a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30834a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30834a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30834a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30834a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w7.a.C0347a.<clinit>():void");
        }
    }

    /* compiled from: MaybeDocument */
    public static final class b extends z.a<a, b> implements w0 {
        /* synthetic */ b(C0347a aVar) {
            this();
        }

        public b F(k kVar) {
            w();
            ((a) this.f27301b).q0(kVar);
            return this;
        }

        public b G(boolean z10) {
            w();
            ((a) this.f27301b).r0(z10);
            return this;
        }

        public b H(b bVar) {
            w();
            ((a) this.f27301b).s0(bVar);
            return this;
        }

        public b I(d dVar) {
            w();
            ((a) this.f27301b).t0(dVar);
            return this;
        }

        private b() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: MaybeDocument */
    public enum c {
        NO_DOCUMENT(1),
        DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        DOCUMENTTYPE_NOT_SET(0);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f30840a;

        private c(int i10) {
            this.f30840a = i10;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return DOCUMENTTYPE_NOT_SET;
            }
            if (i10 == 1) {
                return NO_DOCUMENT;
            }
            if (i10 == 2) {
                return DOCUMENT;
            }
            if (i10 != 3) {
                return null;
            }
            return UNKNOWN_DOCUMENT;
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        z.b0(a.class, aVar);
    }

    private a() {
    }

    public static b o0() {
        return (b) DEFAULT_INSTANCE.y();
    }

    public static a p0(byte[] bArr) throws e0 {
        return (a) z.X(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    public void q0(k kVar) {
        kVar.getClass();
        this.documentType_ = kVar;
        this.documentTypeCase_ = 2;
    }

    /* access modifiers changed from: private */
    public void r0(boolean z10) {
        this.hasCommittedMutations_ = z10;
    }

    /* access modifiers changed from: private */
    public void s0(b bVar) {
        bVar.getClass();
        this.documentType_ = bVar;
        this.documentTypeCase_ = 1;
    }

    /* access modifiers changed from: private */
    public void t0(d dVar) {
        dVar.getClass();
        this.documentType_ = dVar;
        this.documentTypeCase_ = 3;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (C0347a.f30834a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b((C0347a) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", b.class, k.class, d.class, "hasCommittedMutations_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<a> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (a.class) {
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

    public k j0() {
        if (this.documentTypeCase_ == 2) {
            return (k) this.documentType_;
        }
        return k.i0();
    }

    public c k0() {
        return c.a(this.documentTypeCase_);
    }

    public boolean l0() {
        return this.hasCommittedMutations_;
    }

    public b m0() {
        if (this.documentTypeCase_ == 1) {
            return (b) this.documentType_;
        }
        return b.h0();
    }

    public d n0() {
        if (this.documentTypeCase_ == 3) {
            return (d) this.documentType_;
        }
        return d.h0();
    }
}
