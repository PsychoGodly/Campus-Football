package defpackage;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: g  reason: default package */
/* compiled from: WebviewConfigurationStore */
public final class g extends z<g, a> implements w0 {
    public static final int ADDITIONAL_FILES_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final g DEFAULT_INSTANCE;
    public static final int ENTRY_POINT_FIELD_NUMBER = 2;
    private static volatile f1<g> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private d0.j<String> additionalFiles_ = z.F();
    private String entryPoint_ = MaxReward.DEFAULT_LABEL;
    private int version_;

    /* renamed from: g$a */
    /* compiled from: WebviewConfigurationStore */
    public static final class a extends z.a<g, a> implements w0 {
        /* synthetic */ a(f fVar) {
            this();
        }

        public a F(Iterable<String> iterable) {
            w();
            ((g) this.f27301b).i0(iterable);
            return this;
        }

        public a G(String str) {
            w();
            ((g) this.f27301b).q0(str);
            return this;
        }

        public a H(int i10) {
            w();
            ((g) this.f27301b).r0(i10);
            return this;
        }

        private a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        z.b0(g.class, gVar);
    }

    private g() {
    }

    /* access modifiers changed from: private */
    public void i0(Iterable<String> iterable) {
        j0();
        com.google.protobuf.a.h(iterable, this.additionalFiles_);
    }

    private void j0() {
        d0.j<String> jVar = this.additionalFiles_;
        if (!jVar.t()) {
            this.additionalFiles_ = z.Q(jVar);
        }
    }

    public static g l0() {
        return DEFAULT_INSTANCE;
    }

    public static a o0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    public static g p0(InputStream inputStream) throws IOException {
        return (g) z.W(DEFAULT_INSTANCE, inputStream);
    }

    /* access modifiers changed from: private */
    public void q0(String str) {
        str.getClass();
        this.entryPoint_ = str;
    }

    /* access modifiers changed from: private */
    public void r0(int i10) {
        this.version_ = i10;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (f.f32577a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a((f) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ț", new Object[]{"version_", "entryPoint_", "additionalFiles_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<g> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (g.class) {
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

    public List<String> k0() {
        return this.additionalFiles_;
    }

    public String m0() {
        return this.entryPoint_;
    }

    public int n0() {
        return this.version_;
    }
}
