package defpackage;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.b2;
import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.o0;
import com.google.protobuf.p0;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: e  reason: default package */
/* compiled from: UniversalRequestStoreOuterClass */
public final class e extends z<e, a> implements w0 {
    /* access modifiers changed from: private */
    public static final e DEFAULT_INSTANCE;
    private static volatile f1<e> PARSER = null;
    public static final int UNIVERSAL_REQUEST_MAP_FIELD_NUMBER = 1;
    private p0<String, i> universalRequestMap_ = p0.e();

    /* renamed from: e$a */
    /* compiled from: UniversalRequestStoreOuterClass */
    public static final class a extends z.a<e, a> implements w0 {
        /* synthetic */ a(d dVar) {
            this();
        }

        public a F(String str, i iVar) {
            str.getClass();
            iVar.getClass();
            w();
            ((e) this.f27301b).h0().put(str, iVar);
            return this;
        }

        public a G(String str) {
            str.getClass();
            w();
            ((e) this.f27301b).h0().remove(str);
            return this;
        }

        private a() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: e$b */
    /* compiled from: UniversalRequestStoreOuterClass */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final o0<String, i> f32455a = o0.d(b2.b.STRING, MaxReward.DEFAULT_LABEL, b2.b.BYTES, i.f27039b);
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        z.b0(e.class, eVar);
    }

    private e() {
    }

    public static e g0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public Map<String, i> h0() {
        return j0();
    }

    private p0<String, i> j0() {
        if (!this.universalRequestMap_.j()) {
            this.universalRequestMap_ = this.universalRequestMap_.m();
        }
        return this.universalRequestMap_;
    }

    private p0<String, i> k0() {
        return this.universalRequestMap_;
    }

    public static e l0(InputStream inputStream) throws IOException {
        return (e) z.W(DEFAULT_INSTANCE, inputStream);
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (d.f32087a[fVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new a((d) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"universalRequestMap_", b.f32455a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<e> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (e.class) {
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

    public i i0(String str) {
        str.getClass();
        p0<String, i> k02 = k0();
        if (k02.containsKey(str)) {
            return k02.get(str);
        }
        throw new IllegalArgumentException();
    }
}
