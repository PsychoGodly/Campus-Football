package p8;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.e1;
import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import p8.b;
import p8.u;
import u8.a;

/* compiled from: Value */
public final class d0 extends z<d0, b> implements w0 {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    /* access modifiers changed from: private */
    public static final d0 DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile f1<d0> PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    /* compiled from: Value */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29526a;

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
                f29526a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29526a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29526a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29526a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29526a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29526a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29526a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.d0.a.<clinit>():void");
        }
    }

    /* compiled from: Value */
    public static final class b extends z.a<d0, b> implements w0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public u F() {
            return ((d0) this.f27301b).x0();
        }

        public b G(b.C0323b bVar) {
            w();
            ((d0) this.f27301b).D0((b) bVar.build());
            return this;
        }

        public b H(b bVar) {
            w();
            ((d0) this.f27301b).D0(bVar);
            return this;
        }

        public b I(boolean z10) {
            w();
            ((d0) this.f27301b).E0(z10);
            return this;
        }

        public b J(i iVar) {
            w();
            ((d0) this.f27301b).F0(iVar);
            return this;
        }

        public b K(double d10) {
            w();
            ((d0) this.f27301b).G0(d10);
            return this;
        }

        public b L(a.b bVar) {
            w();
            ((d0) this.f27301b).H0((u8.a) bVar.build());
            return this;
        }

        public b M(long j10) {
            w();
            ((d0) this.f27301b).I0(j10);
            return this;
        }

        public b N(u.b bVar) {
            w();
            ((d0) this.f27301b).J0((u) bVar.build());
            return this;
        }

        public b O(u uVar) {
            w();
            ((d0) this.f27301b).J0(uVar);
            return this;
        }

        public b P(e1 e1Var) {
            w();
            ((d0) this.f27301b).K0(e1Var);
            return this;
        }

        public b Q(String str) {
            w();
            ((d0) this.f27301b).L0(str);
            return this;
        }

        public b R(String str) {
            w();
            ((d0) this.f27301b).M0(str);
            return this;
        }

        public b S(t1.b bVar) {
            w();
            ((d0) this.f27301b).N0((t1) bVar.build());
            return this;
        }

        private b() {
            super(d0.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Value */
    public enum c {
        NULL_VALUE(11),
        BOOLEAN_VALUE(1),
        INTEGER_VALUE(2),
        DOUBLE_VALUE(3),
        TIMESTAMP_VALUE(10),
        STRING_VALUE(17),
        BYTES_VALUE(18),
        REFERENCE_VALUE(5),
        GEO_POINT_VALUE(8),
        ARRAY_VALUE(9),
        MAP_VALUE(6),
        VALUETYPE_NOT_SET(0);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f29540a;

        private c(int i10) {
            this.f29540a = i10;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return VALUETYPE_NOT_SET;
            }
            if (i10 == 1) {
                return BOOLEAN_VALUE;
            }
            if (i10 == 2) {
                return INTEGER_VALUE;
            }
            if (i10 == 3) {
                return DOUBLE_VALUE;
            }
            if (i10 == 5) {
                return REFERENCE_VALUE;
            }
            if (i10 == 6) {
                return MAP_VALUE;
            }
            if (i10 == 17) {
                return STRING_VALUE;
            }
            if (i10 == 18) {
                return BYTES_VALUE;
            }
            switch (i10) {
                case 8:
                    return GEO_POINT_VALUE;
                case 9:
                    return ARRAY_VALUE;
                case 10:
                    return TIMESTAMP_VALUE;
                case 11:
                    return NULL_VALUE;
                default:
                    return null;
            }
        }
    }

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        z.b0(d0.class, d0Var);
    }

    private d0() {
    }

    public static b C0() {
        return (b) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void D0(b bVar) {
        bVar.getClass();
        this.valueType_ = bVar;
        this.valueTypeCase_ = 9;
    }

    /* access modifiers changed from: private */
    public void E0(boolean z10) {
        this.valueTypeCase_ = 1;
        this.valueType_ = Boolean.valueOf(z10);
    }

    /* access modifiers changed from: private */
    public void F0(i iVar) {
        iVar.getClass();
        this.valueTypeCase_ = 18;
        this.valueType_ = iVar;
    }

    /* access modifiers changed from: private */
    public void G0(double d10) {
        this.valueTypeCase_ = 3;
        this.valueType_ = Double.valueOf(d10);
    }

    /* access modifiers changed from: private */
    public void H0(u8.a aVar) {
        aVar.getClass();
        this.valueType_ = aVar;
        this.valueTypeCase_ = 8;
    }

    /* access modifiers changed from: private */
    public void I0(long j10) {
        this.valueTypeCase_ = 2;
        this.valueType_ = Long.valueOf(j10);
    }

    /* access modifiers changed from: private */
    public void J0(u uVar) {
        uVar.getClass();
        this.valueType_ = uVar;
        this.valueTypeCase_ = 6;
    }

    /* access modifiers changed from: private */
    public void K0(e1 e1Var) {
        this.valueType_ = Integer.valueOf(e1Var.I());
        this.valueTypeCase_ = 11;
    }

    /* access modifiers changed from: private */
    public void L0(String str) {
        str.getClass();
        this.valueTypeCase_ = 5;
        this.valueType_ = str;
    }

    /* access modifiers changed from: private */
    public void M0(String str) {
        str.getClass();
        this.valueTypeCase_ = 17;
        this.valueType_ = str;
    }

    /* access modifiers changed from: private */
    public void N0(t1 t1Var) {
        t1Var.getClass();
        this.valueType_ = t1Var;
        this.valueTypeCase_ = 10;
    }

    public static d0 t0() {
        return DEFAULT_INSTANCE;
    }

    public t1 A0() {
        if (this.valueTypeCase_ == 10) {
            return (t1) this.valueType_;
        }
        return t1.h0();
    }

    public c B0() {
        return c.a(this.valueTypeCase_);
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (a.f29526a[fVar.ordinal()]) {
            case 1:
                return new d0();
            case 2:
                return new b((a) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", u.class, u8.a.class, b.class, t1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<d0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (d0.class) {
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

    public b q0() {
        if (this.valueTypeCase_ == 9) {
            return (b) this.valueType_;
        }
        return b.l0();
    }

    public boolean r0() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    public i s0() {
        if (this.valueTypeCase_ == 18) {
            return (i) this.valueType_;
        }
        return i.f27039b;
    }

    public double u0() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    public u8.a v0() {
        if (this.valueTypeCase_ == 8) {
            return (u8.a) this.valueType_;
        }
        return u8.a.h0();
    }

    public long w0() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0;
    }

    public u x0() {
        if (this.valueTypeCase_ == 6) {
            return (u) this.valueType_;
        }
        return u.g0();
    }

    public String y0() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : MaxReward.DEFAULT_LABEL;
    }

    public String z0() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : MaxReward.DEFAULT_LABEL;
    }
}
