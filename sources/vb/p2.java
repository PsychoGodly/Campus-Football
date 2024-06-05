package vb;

import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: PrivacyUpdateRequestOuterClass */
public final class p2 extends z<p2, a> implements w0 {
    public static final int CONTENT_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final p2 DEFAULT_INSTANCE;
    private static volatile f1<p2> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private i content_ = i.f27039b;
    private int version_;

    /* compiled from: PrivacyUpdateRequestOuterClass */
    public static final class a extends z.a<p2, a> implements w0 {
        /* synthetic */ a(o2 o2Var) {
            this();
        }

        public a F(i iVar) {
            w();
            ((p2) this.f27301b).i0(iVar);
            return this;
        }

        public a G(int i10) {
            w();
            ((p2) this.f27301b).j0(i10);
            return this;
        }

        private a() {
            super(p2.DEFAULT_INSTANCE);
        }
    }

    static {
        p2 p2Var = new p2();
        DEFAULT_INSTANCE = p2Var;
        z.b0(p2.class, p2Var);
    }

    private p2() {
    }

    public static a h0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void i0(i iVar) {
        iVar.getClass();
        this.content_ = iVar;
    }

    /* access modifiers changed from: private */
    public void j0(int i10) {
        this.version_ = i10;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (o2.f39051a[fVar.ordinal()]) {
            case 1:
                return new p2();
            case 2:
                return new a((o2) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new Object[]{"version_", "content_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<p2> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (p2.class) {
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
}
