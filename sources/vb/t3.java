package vb;

import com.google.protobuf.e0;
import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: UniversalRequestOuterClass */
public final class t3 extends z<t3, a> implements w0 {
    /* access modifiers changed from: private */
    public static final t3 DEFAULT_INSTANCE;
    private static volatile f1<t3> PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 2;
    public static final int SHARED_DATA_FIELD_NUMBER = 1;
    private b payload_;
    private c sharedData_;

    /* compiled from: UniversalRequestOuterClass */
    public static final class a extends z.a<t3, a> implements w0 {
        /* synthetic */ a(r3 r3Var) {
            this();
        }

        public b F() {
            return ((t3) this.f27301b).h0();
        }

        public a G(b bVar) {
            w();
            ((t3) this.f27301b).l0(bVar);
            return this;
        }

        public a H(c cVar) {
            w();
            ((t3) this.f27301b).m0(cVar);
            return this;
        }

        private a() {
            super(t3.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: UniversalRequestOuterClass */
    public static final class b extends z<b, a> implements w0 {
        public static final int AD_DATA_REFRESH_REQUEST_FIELD_NUMBER = 9;
        public static final int AD_PLAYER_CONFIG_REQUEST_FIELD_NUMBER = 6;
        public static final int AD_REQUEST_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final b DEFAULT_INSTANCE;
        public static final int DIAGNOSTIC_EVENT_REQUEST_FIELD_NUMBER = 5;
        public static final int GET_TOKEN_EVENT_REQUEST_FIELD_NUMBER = 7;
        public static final int INITIALIZATION_COMPLETED_EVENT_REQUEST_FIELD_NUMBER = 10;
        public static final int INITIALIZATION_REQUEST_FIELD_NUMBER = 2;
        public static final int OPERATIVE_EVENT_FIELD_NUMBER = 4;
        private static volatile f1<b> PARSER = null;
        public static final int PRIVACY_UPDATE_REQUEST_FIELD_NUMBER = 8;
        public static final int TRANSACTION_EVENT_REQUEST_FIELD_NUMBER = 11;
        private int valueCase_ = 0;
        private Object value_;

        /* compiled from: UniversalRequestOuterClass */
        public static final class a extends z.a<b, a> implements w0 {
            /* synthetic */ a(r3 r3Var) {
                this();
            }

            public t0 F() {
                return ((b) this.f27301b).p0();
            }

            public a G(c cVar) {
                w();
                ((b) this.f27301b).r0(cVar);
                return this;
            }

            public a H(i iVar) {
                w();
                ((b) this.f27301b).s0(iVar);
                return this;
            }

            public a I(n nVar) {
                w();
                ((b) this.f27301b).t0(nVar);
                return this;
            }

            public a J(t0 t0Var) {
                w();
                ((b) this.f27301b).u0(t0Var);
                return this;
            }

            public a K(i1 i1Var) {
                w();
                ((b) this.f27301b).v0(i1Var);
                return this;
            }

            public a L(n1 n1Var) {
                w();
                ((b) this.f27301b).w0(n1Var);
                return this;
            }

            public a M(i2 i2Var) {
                w();
                ((b) this.f27301b).x0(i2Var);
                return this;
            }

            public a N(p2 p2Var) {
                w();
                ((b) this.f27301b).y0(p2Var);
                return this;
            }

            public a O(m3 m3Var) {
                w();
                ((b) this.f27301b).z0(m3Var);
                return this;
            }

            private a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            z.b0(b.class, bVar);
        }

        private b() {
        }

        public static b o0() {
            return DEFAULT_INSTANCE;
        }

        public static a q0() {
            return (a) DEFAULT_INSTANCE.y();
        }

        /* access modifiers changed from: private */
        public void r0(c cVar) {
            cVar.getClass();
            this.value_ = cVar;
            this.valueCase_ = 9;
        }

        /* access modifiers changed from: private */
        public void s0(i iVar) {
            iVar.getClass();
            this.value_ = iVar;
            this.valueCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void t0(n nVar) {
            nVar.getClass();
            this.value_ = nVar;
            this.valueCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void u0(t0 t0Var) {
            t0Var.getClass();
            this.value_ = t0Var;
            this.valueCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void v0(i1 i1Var) {
            i1Var.getClass();
            this.value_ = i1Var;
            this.valueCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void w0(n1 n1Var) {
            n1Var.getClass();
            this.value_ = n1Var;
            this.valueCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void x0(i2 i2Var) {
            i2Var.getClass();
            this.value_ = i2Var;
            this.valueCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void y0(p2 p2Var) {
            p2Var.getClass();
            this.value_ = p2Var;
            this.valueCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void z0(m3 m3Var) {
            m3Var.getClass();
            this.value_ = m3Var;
            this.valueCase_ = 11;
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (r3.f39076a[fVar.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a((r3) null);
                case 3:
                    return z.S(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0002\u000b\n\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000", new Object[]{"value_", "valueCase_", n1.class, n.class, i2.class, t0.class, i.class, f1.class, p2.class, c.class, i1.class, m3.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<b> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (b.class) {
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

        public t0 p0() {
            if (this.valueCase_ == 5) {
                return (t0) this.value_;
            }
            return t0.l0();
        }
    }

    /* compiled from: UniversalRequestOuterClass */
    public static final class c extends z<c, a> implements w0 {
        public static final int APP_START_TIME_FIELD_NUMBER = 8;
        public static final int CURRENT_STATE_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final c DEFAULT_INSTANCE;
        public static final int DEVELOPER_CONSENT_FIELD_NUMBER = 4;
        public static final int LIMITED_SESSION_TOKEN_FIELD_NUMBER = 10;
        private static volatile f1<c> PARSER = null;
        public static final int PII_FIELD_NUMBER = 3;
        public static final int SDK_START_TIME_FIELD_NUMBER = 9;
        public static final int SESSION_TOKEN_FIELD_NUMBER = 1;
        public static final int TEST_DATA_FIELD_NUMBER = 7;
        public static final int TIMESTAMPS_FIELD_NUMBER = 2;
        public static final int WEBVIEW_VERSION_FIELD_NUMBER = 5;
        private t1 appStartTime_;
        private int bitField0_;
        private i currentState_;
        private k0 developerConsent_;
        private s3 limitedSessionToken_;
        private m2 pii_;
        private t1 sdkStartTime_;
        private i sessionToken_;
        private d3 testData_;
        private g3 timestamps_;
        private int webviewVersion_;

        /* compiled from: UniversalRequestOuterClass */
        public static final class a extends z.a<c, a> implements w0 {
            /* synthetic */ a(r3 r3Var) {
                this();
            }

            public a F(t1 t1Var) {
                w();
                ((c) this.f27301b).q0(t1Var);
                return this;
            }

            public a G(k0 k0Var) {
                w();
                ((c) this.f27301b).r0(k0Var);
                return this;
            }

            public a H(s3 s3Var) {
                w();
                ((c) this.f27301b).s0(s3Var);
                return this;
            }

            public a I(m2 m2Var) {
                w();
                ((c) this.f27301b).t0(m2Var);
                return this;
            }

            public a J(t1 t1Var) {
                w();
                ((c) this.f27301b).u0(t1Var);
                return this;
            }

            public a K(i iVar) {
                w();
                ((c) this.f27301b).v0(iVar);
                return this;
            }

            public a L(g3 g3Var) {
                w();
                ((c) this.f27301b).w0(g3Var);
                return this;
            }

            private a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            z.b0(c.class, cVar);
        }

        private c() {
            i iVar = i.f27039b;
            this.sessionToken_ = iVar;
            this.currentState_ = iVar;
        }

        public static c m0() {
            return DEFAULT_INSTANCE;
        }

        public static a p0() {
            return (a) DEFAULT_INSTANCE.y();
        }

        /* access modifiers changed from: private */
        public void q0(t1 t1Var) {
            t1Var.getClass();
            this.appStartTime_ = t1Var;
        }

        /* access modifiers changed from: private */
        public void r0(k0 k0Var) {
            k0Var.getClass();
            this.developerConsent_ = k0Var;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void s0(s3 s3Var) {
            s3Var.getClass();
            this.limitedSessionToken_ = s3Var;
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void t0(m2 m2Var) {
            m2Var.getClass();
            this.pii_ = m2Var;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void u0(t1 t1Var) {
            t1Var.getClass();
            this.sdkStartTime_ = t1Var;
        }

        /* access modifiers changed from: private */
        public void v0(i iVar) {
            iVar.getClass();
            this.bitField0_ |= 1;
            this.sessionToken_ = iVar;
        }

        /* access modifiers changed from: private */
        public void w0(g3 g3Var) {
            g3Var.getClass();
            this.timestamps_ = g3Var;
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (r3.f39076a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a((r3) null);
                case 3:
                    return z.S(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ည\u0000\u0002\t\u0003ဉ\u0001\u0004ဉ\u0002\u0005င\u0003\u0006ည\u0004\u0007ဉ\u0005\b\t\t\t\nဉ\u0006", new Object[]{"bitField0_", "sessionToken_", "timestamps_", "pii_", "developerConsent_", "webviewVersion_", "currentState_", "testData_", "appStartTime_", "sdkStartTime_", "limitedSessionToken_"});
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

        public i n0() {
            return this.sessionToken_;
        }

        public g3 o0() {
            g3 g3Var = this.timestamps_;
            return g3Var == null ? g3.h0() : g3Var;
        }
    }

    static {
        t3 t3Var = new t3();
        DEFAULT_INSTANCE = t3Var;
        z.b0(t3.class, t3Var);
    }

    private t3() {
    }

    public static a j0() {
        return (a) DEFAULT_INSTANCE.y();
    }

    public static t3 k0(i iVar) throws e0 {
        return (t3) z.U(DEFAULT_INSTANCE, iVar);
    }

    /* access modifiers changed from: private */
    public void l0(b bVar) {
        bVar.getClass();
        this.payload_ = bVar;
    }

    /* access modifiers changed from: private */
    public void m0(c cVar) {
        cVar.getClass();
        this.sharedData_ = cVar;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (r3.f39076a[fVar.ordinal()]) {
            case 1:
                return new t3();
            case 2:
                return new a((r3) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"sharedData_", "payload_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<t3> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (t3.class) {
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

    public b h0() {
        b bVar = this.payload_;
        return bVar == null ? b.o0() : bVar;
    }

    public c i0() {
        c cVar = this.sharedData_;
        return cVar == null ? c.m0() : cVar;
    }
}
