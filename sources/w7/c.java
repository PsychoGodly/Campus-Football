package w7;

import com.google.protobuf.e0;
import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import p8.a0;

/* compiled from: Target */
public final class c extends z<c, b> implements w0 {
    /* access modifiers changed from: private */
    public static final c DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile f1<c> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private t1 lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private i resumeToken_ = i.f27039b;
    private t1 snapshotVersion_;
    private int targetId_;
    private int targetTypeCase_ = 0;
    private Object targetType_;

    /* compiled from: Target */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30842a;

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
                f30842a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30842a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30842a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30842a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30842a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30842a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30842a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.z.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w7.c.a.<clinit>():void");
        }
    }

    /* compiled from: Target */
    public static final class b extends z.a<c, b> implements w0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b F() {
            w();
            ((c) this.f27301b).n0();
            return this;
        }

        public b G(a0.c cVar) {
            w();
            ((c) this.f27301b).y0(cVar);
            return this;
        }

        public b H(t1 t1Var) {
            w();
            ((c) this.f27301b).z0(t1Var);
            return this;
        }

        public b I(long j10) {
            w();
            ((c) this.f27301b).A0(j10);
            return this;
        }

        public b J(a0.d dVar) {
            w();
            ((c) this.f27301b).B0(dVar);
            return this;
        }

        public b K(i iVar) {
            w();
            ((c) this.f27301b).C0(iVar);
            return this;
        }

        public b L(t1 t1Var) {
            w();
            ((c) this.f27301b).D0(t1Var);
            return this;
        }

        public b M(int i10) {
            w();
            ((c) this.f27301b).E0(i10);
            return this;
        }

        private b() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: w7.c$c  reason: collision with other inner class name */
    /* compiled from: Target */
    public enum C0349c {
        QUERY(5),
        DOCUMENTS(6),
        TARGETTYPE_NOT_SET(0);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f30847a;

        private C0349c(int i10) {
            this.f30847a = i10;
        }

        public static C0349c a(int i10) {
            if (i10 == 0) {
                return TARGETTYPE_NOT_SET;
            }
            if (i10 == 5) {
                return QUERY;
            }
            if (i10 != 6) {
                return null;
            }
            return DOCUMENTS;
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        z.b0(c.class, cVar);
    }

    private c() {
    }

    /* access modifiers changed from: private */
    public void A0(long j10) {
        this.lastListenSequenceNumber_ = j10;
    }

    /* access modifiers changed from: private */
    public void B0(a0.d dVar) {
        dVar.getClass();
        this.targetType_ = dVar;
        this.targetTypeCase_ = 5;
    }

    /* access modifiers changed from: private */
    public void C0(i iVar) {
        iVar.getClass();
        this.resumeToken_ = iVar;
    }

    /* access modifiers changed from: private */
    public void D0(t1 t1Var) {
        t1Var.getClass();
        this.snapshotVersion_ = t1Var;
    }

    /* access modifiers changed from: private */
    public void E0(int i10) {
        this.targetId_ = i10;
    }

    /* access modifiers changed from: private */
    public void n0() {
        this.lastLimboFreeSnapshotVersion_ = null;
    }

    public static b w0() {
        return (b) DEFAULT_INSTANCE.y();
    }

    public static c x0(byte[] bArr) throws e0 {
        return (c) z.X(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    public void y0(a0.c cVar) {
        cVar.getClass();
        this.targetType_ = cVar;
        this.targetTypeCase_ = 6;
    }

    /* access modifiers changed from: private */
    public void z0(t1 t1Var) {
        t1Var.getClass();
        this.lastLimboFreeSnapshotVersion_ = t1Var;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (a.f30842a[fVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new b((a) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007\t", new Object[]{"targetType_", "targetTypeCase_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", a0.d.class, a0.c.class, "lastLimboFreeSnapshotVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<c> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (c.class) {
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

    public a0.c o0() {
        if (this.targetTypeCase_ == 6) {
            return (a0.c) this.targetType_;
        }
        return a0.c.i0();
    }

    public t1 p0() {
        t1 t1Var = this.lastLimboFreeSnapshotVersion_;
        return t1Var == null ? t1.h0() : t1Var;
    }

    public long q0() {
        return this.lastListenSequenceNumber_;
    }

    public a0.d r0() {
        if (this.targetTypeCase_ == 5) {
            return (a0.d) this.targetType_;
        }
        return a0.d.h0();
    }

    public i s0() {
        return this.resumeToken_;
    }

    public t1 t0() {
        t1 t1Var = this.snapshotVersion_;
        return t1Var == null ? t1.h0() : t1Var;
    }

    public int u0() {
        return this.targetId_;
    }

    public C0349c v0() {
        return C0349c.a(this.targetTypeCase_);
    }
}
