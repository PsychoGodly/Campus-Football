package p8;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.List;
import p8.p;

/* compiled from: Write */
public final class e0 extends z<e0, b> implements w0 {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final e0 DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile f1<e0> PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private v currentDocument_;
    private int operationCase_ = 0;
    private Object operation_;
    private n updateMask_;
    private d0.j<p.c> updateTransforms_ = z.F();

    /* compiled from: Write */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29547a;

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
                f29547a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29547a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29547a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29547a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29547a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29547a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29547a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.e0.a.<clinit>():void");
        }
    }

    /* compiled from: Write */
    public static final class b extends z.a<e0, b> implements w0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b F(p.c cVar) {
            w();
            ((e0) this.f27301b).l0(cVar);
            return this;
        }

        public b G(v vVar) {
            w();
            ((e0) this.f27301b).C0(vVar);
            return this;
        }

        public b H(String str) {
            w();
            ((e0) this.f27301b).D0(str);
            return this;
        }

        public b I(k kVar) {
            w();
            ((e0) this.f27301b).E0(kVar);
            return this;
        }

        public b J(n nVar) {
            w();
            ((e0) this.f27301b).F0(nVar);
            return this;
        }

        public b K(String str) {
            w();
            ((e0) this.f27301b).G0(str);
            return this;
        }

        private b() {
            super(e0.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Write */
    public enum c {
        UPDATE(1),
        DELETE(2),
        VERIFY(5),
        TRANSFORM(6),
        OPERATION_NOT_SET(0);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f29554a;

        private c(int i10) {
            this.f29554a = i10;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return OPERATION_NOT_SET;
            }
            if (i10 == 1) {
                return UPDATE;
            }
            if (i10 == 2) {
                return DELETE;
            }
            if (i10 == 5) {
                return VERIFY;
            }
            if (i10 != 6) {
                return null;
            }
            return TRANSFORM;
        }
    }

    static {
        e0 e0Var = new e0();
        DEFAULT_INSTANCE = e0Var;
        z.b0(e0.class, e0Var);
    }

    private e0() {
    }

    public static b A0(e0 e0Var) {
        return (b) DEFAULT_INSTANCE.z(e0Var);
    }

    public static e0 B0(byte[] bArr) throws com.google.protobuf.e0 {
        return (e0) z.X(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    public void C0(v vVar) {
        vVar.getClass();
        this.currentDocument_ = vVar;
    }

    /* access modifiers changed from: private */
    public void D0(String str) {
        str.getClass();
        this.operationCase_ = 2;
        this.operation_ = str;
    }

    /* access modifiers changed from: private */
    public void E0(k kVar) {
        kVar.getClass();
        this.operation_ = kVar;
        this.operationCase_ = 1;
    }

    /* access modifiers changed from: private */
    public void F0(n nVar) {
        nVar.getClass();
        this.updateMask_ = nVar;
    }

    /* access modifiers changed from: private */
    public void G0(String str) {
        str.getClass();
        this.operationCase_ = 5;
        this.operation_ = str;
    }

    /* access modifiers changed from: private */
    public void l0(p.c cVar) {
        cVar.getClass();
        m0();
        this.updateTransforms_.add(cVar);
    }

    private void m0() {
        d0.j<p.c> jVar = this.updateTransforms_;
        if (!jVar.t()) {
            this.updateTransforms_ = z.Q(jVar);
        }
    }

    public static b z0() {
        return (b) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (a.f29547a[fVar.ordinal()]) {
            case 1:
                return new e0();
            case 2:
                return new b((a) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\t\u0004\t\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", k.class, "updateMask_", "currentDocument_", p.class, "updateTransforms_", p.c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<e0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (e0.class) {
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

    public v n0() {
        v vVar = this.currentDocument_;
        return vVar == null ? v.i0() : vVar;
    }

    public String o0() {
        return this.operationCase_ == 2 ? (String) this.operation_ : MaxReward.DEFAULT_LABEL;
    }

    public c p0() {
        return c.a(this.operationCase_);
    }

    public p q0() {
        if (this.operationCase_ == 6) {
            return (p) this.operation_;
        }
        return p.f0();
    }

    public k r0() {
        if (this.operationCase_ == 1) {
            return (k) this.operation_;
        }
        return k.i0();
    }

    public n s0() {
        n nVar = this.updateMask_;
        return nVar == null ? n.i0() : nVar;
    }

    public List<p.c> t0() {
        return this.updateTransforms_;
    }

    public String u0() {
        return this.operationCase_ == 5 ? (String) this.operation_ : MaxReward.DEFAULT_LABEL;
    }

    public boolean v0() {
        return this.currentDocument_ != null;
    }

    public boolean w0() {
        return this.operationCase_ == 6;
    }

    public boolean x0() {
        return this.operationCase_ == 1;
    }

    public boolean y0() {
        return this.updateMask_ != null;
    }
}
