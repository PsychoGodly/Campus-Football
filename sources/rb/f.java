package rb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.b2;
import com.google.protobuf.d0;
import com.google.protobuf.e0;
import com.google.protobuf.f1;
import com.google.protobuf.o0;
import com.google.protobuf.p0;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import rb.d;

/* compiled from: Protos */
public final class f extends z<f, b> implements w0 {
    public static final int ANDROID_FIELD_NUMBER = 4;
    public static final int AUTOENABLEFLASH_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final f DEFAULT_INSTANCE;
    private static volatile f1<f> PARSER = null;
    public static final int RESTRICTFORMAT_FIELD_NUMBER = 2;
    public static final int STRINGS_FIELD_NUMBER = 1;
    public static final int USECAMERA_FIELD_NUMBER = 3;
    private static final d0.h.a<Integer, e> restrictFormat_converter_ = new a();
    private d android_;
    private boolean autoEnableFlash_;
    private int restrictFormatMemoizedSerializedSize;
    private d0.g restrictFormat_ = z.E();
    private p0<String, String> strings_ = p0.e();
    private int useCamera_;

    /* compiled from: Protos */
    class a implements d0.h.a<Integer, e> {
        a() {
        }

        /* renamed from: b */
        public e a(Integer num) {
            e a10 = e.a(num.intValue());
            return a10 == null ? e.UNRECOGNIZED : a10;
        }
    }

    /* compiled from: Protos */
    public static final class b extends z.a<f, b> implements w0 {
        /* synthetic */ b(c cVar) {
            this();
        }

        public b F(Iterable<? extends e> iterable) {
            w();
            ((f) this.f27301b).j0(iterable);
            return this;
        }

        public b G(Map<String, String> map) {
            w();
            ((f) this.f27301b).n0().putAll(map);
            return this;
        }

        public b H(d.a aVar) {
            w();
            ((f) this.f27301b).v0((d) aVar.build());
            return this;
        }

        public b I(int i10) {
            w();
            ((f) this.f27301b).w0(i10);
            return this;
        }

        private b() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Protos */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final o0<String, String> f37896a;

        static {
            b2.b bVar = b2.b.STRING;
            f37896a = o0.d(bVar, MaxReward.DEFAULT_LABEL, bVar, MaxReward.DEFAULT_LABEL);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        z.b0(f.class, fVar);
    }

    private f() {
    }

    /* access modifiers changed from: private */
    public void j0(Iterable<? extends e> iterable) {
        k0();
        for (e I : iterable) {
            this.restrictFormat_.k(I.I());
        }
    }

    private void k0() {
        if (!this.restrictFormat_.t()) {
            this.restrictFormat_ = z.P(this.restrictFormat_);
        }
    }

    /* access modifiers changed from: private */
    public Map<String, String> n0() {
        return r0();
    }

    private p0<String, String> r0() {
        if (!this.strings_.j()) {
            this.strings_ = this.strings_.m();
        }
        return this.strings_;
    }

    private p0<String, String> s0() {
        return this.strings_;
    }

    public static b t0() {
        return (b) DEFAULT_INSTANCE.y();
    }

    public static f u0(byte[] bArr) throws e0 {
        return (f) z.X(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    public void v0(d dVar) {
        dVar.getClass();
        this.android_ = dVar;
    }

    /* access modifiers changed from: private */
    public void w0(int i10) {
        this.useCamera_ = i10;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (c.f37879a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new b((c) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u00012\u0002,\u0003\u0004\u0004\t\u0005\u0007", new Object[]{"strings_", c.f37896a, "restrictFormat_", "useCamera_", "android_", "autoEnableFlash_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<f> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (f.class) {
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

    public d l0() {
        d dVar = this.android_;
        return dVar == null ? d.i0() : dVar;
    }

    public boolean m0() {
        return this.autoEnableFlash_;
    }

    public List<e> o0() {
        return new d0.h(this.restrictFormat_, restrictFormat_converter_);
    }

    public Map<String, String> p0() {
        return Collections.unmodifiableMap(s0());
    }

    public int q0() {
        return this.useCamera_;
    }
}
