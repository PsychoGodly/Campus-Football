package rb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: Protos */
public final class h extends z<h, a> implements w0 {
    /* access modifiers changed from: private */
    public static final h DEFAULT_INSTANCE;
    public static final int FORMATNOTE_FIELD_NUMBER = 4;
    public static final int FORMAT_FIELD_NUMBER = 3;
    private static volatile f1<h> PARSER = null;
    public static final int RAWCONTENT_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String formatNote_ = MaxReward.DEFAULT_LABEL;
    private int format_;
    private String rawContent_ = MaxReward.DEFAULT_LABEL;
    private int type_;

    /* compiled from: Protos */
    public static final class a extends z.a<h, a> implements w0 {
        /* synthetic */ a(c cVar) {
            this();
        }

        public a F(e eVar) {
            w();
            ((h) this.f27301b).k0(eVar);
            return this;
        }

        public a G(String str) {
            w();
            ((h) this.f27301b).l0(str);
            return this;
        }

        public a H(String str) {
            w();
            ((h) this.f27301b).m0(str);
            return this;
        }

        public a I(g gVar) {
            w();
            ((h) this.f27301b).n0(gVar);
            return this;
        }

        private a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        z.b0(h.class, hVar);
    }

    private h() {
    }

    public static a j0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void k0(e eVar) {
        this.format_ = eVar.I();
    }

    /* access modifiers changed from: private */
    public void l0(String str) {
        str.getClass();
        this.formatNote_ = str;
    }

    /* access modifiers changed from: private */
    public void m0(String str) {
        str.getClass();
        this.rawContent_ = str;
    }

    /* access modifiers changed from: private */
    public void n0(g gVar) {
        this.type_ = gVar.I();
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (c.f37879a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a((c) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"type_", "rawContent_", "format_", "formatNote_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<h> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (h.class) {
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
