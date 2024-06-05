package vb;

import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.Collections;
import java.util.List;

/* compiled from: CampaignStateOuterClass */
public final class b0 extends z<b0, a> implements w0 {
    /* access modifiers changed from: private */
    public static final b0 DEFAULT_INSTANCE;
    public static final int LOADED_CAMPAIGNS_FIELD_NUMBER = 1;
    private static volatile f1<b0> PARSER = null;
    public static final int SHOWN_CAMPAIGNS_FIELD_NUMBER = 2;
    private d0.j<a0> loadedCampaigns_ = z.F();
    private d0.j<a0> shownCampaigns_ = z.F();

    /* compiled from: CampaignStateOuterClass */
    public static final class a extends z.a<b0, a> implements w0 {
        /* synthetic */ a(z zVar) {
            this();
        }

        public a F(Iterable<? extends a0> iterable) {
            w();
            ((b0) this.f27301b).h0(iterable);
            return this;
        }

        public a G(Iterable<? extends a0> iterable) {
            w();
            ((b0) this.f27301b).i0(iterable);
            return this;
        }

        public List<a0> H() {
            return Collections.unmodifiableList(((b0) this.f27301b).l0());
        }

        public List<a0> I() {
            return Collections.unmodifiableList(((b0) this.f27301b).m0());
        }

        private a() {
            super(b0.DEFAULT_INSTANCE);
        }
    }

    static {
        b0 b0Var = new b0();
        DEFAULT_INSTANCE = b0Var;
        z.b0(b0.class, b0Var);
    }

    private b0() {
    }

    /* access modifiers changed from: private */
    public void h0(Iterable<? extends a0> iterable) {
        j0();
        com.google.protobuf.a.h(iterable, this.loadedCampaigns_);
    }

    /* access modifiers changed from: private */
    public void i0(Iterable<? extends a0> iterable) {
        k0();
        com.google.protobuf.a.h(iterable, this.shownCampaigns_);
    }

    private void j0() {
        d0.j<a0> jVar = this.loadedCampaigns_;
        if (!jVar.t()) {
            this.loadedCampaigns_ = z.Q(jVar);
        }
    }

    private void k0() {
        d0.j<a0> jVar = this.shownCampaigns_;
        if (!jVar.t()) {
            this.shownCampaigns_ = z.Q(jVar);
        }
    }

    public static a n0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        Class<a0> cls = a0.class;
        switch (z.f39121a[fVar.ordinal()]) {
            case 1:
                return new b0();
            case 2:
                return new a((z) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"loadedCampaigns_", cls, "shownCampaigns_", cls});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<b0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (b0.class) {
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

    public List<a0> l0() {
        return this.loadedCampaigns_;
    }

    public List<a0> m0() {
        return this.shownCampaigns_;
    }
}
