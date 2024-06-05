package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;

/* compiled from: DynamicDeviceInfoOuterClass */
public final class a1 extends z<a1, b> implements w0 {
    public static final int ANDROID_FIELD_NUMBER = 12;
    public static final int APP_ACTIVE_FIELD_NUMBER = 17;
    public static final int BATTERY_LEVEL_FIELD_NUMBER = 14;
    public static final int BATTERY_STATUS_FIELD_NUMBER = 15;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 16;
    /* access modifiers changed from: private */
    public static final a1 DEFAULT_INSTANCE;
    public static final int FREE_DISK_SPACE_FIELD_NUMBER = 5;
    public static final int FREE_RAM_MEMORY_FIELD_NUMBER = 6;
    public static final int IOS_FIELD_NUMBER = 13;
    public static final int LANGUAGE_FIELD_NUMBER = 1;
    public static final int LIMITED_OPEN_AD_TRACKING_FIELD_NUMBER = 11;
    public static final int LIMITED_TRACKING_FIELD_NUMBER = 10;
    public static final int NETWORK_OPERATOR_FIELD_NUMBER = 2;
    public static final int NETWORK_OPERATOR_NAME_FIELD_NUMBER = 3;
    private static volatile f1<a1> PARSER = null;
    public static final int TIME_ZONE_FIELD_NUMBER = 8;
    public static final int TIME_ZONE_OFFSET_FIELD_NUMBER = 9;
    public static final int WIRED_HEADSET_FIELD_NUMBER = 7;
    private boolean appActive_;
    private double batteryLevel_;
    private int batteryStatus_;
    private int bitField0_;
    private int connectionType_;
    private long freeDiskSpace_;
    private long freeRamMemory_;
    private String language_ = MaxReward.DEFAULT_LABEL;
    private boolean limitedOpenAdTracking_;
    private boolean limitedTracking_;
    private String networkOperatorName_ = MaxReward.DEFAULT_LABEL;
    private String networkOperator_ = MaxReward.DEFAULT_LABEL;
    private int platformSpecificCase_ = 0;
    private Object platformSpecific_;
    private long timeZoneOffset_;
    private String timeZone_ = MaxReward.DEFAULT_LABEL;
    private boolean wiredHeadset_;

    /* compiled from: DynamicDeviceInfoOuterClass */
    public static final class a extends z<a, C0450a> implements w0 {
        public static final int ADB_ENABLED_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final a DEFAULT_INSTANCE;
        public static final int DEVICE_ELAPSED_REALTIME_FIELD_NUMBER = 10;
        public static final int DEVICE_UP_TIME_FIELD_NUMBER = 9;
        public static final int MAX_VOLUME_FIELD_NUMBER = 8;
        public static final int NETWORK_CONNECTED_FIELD_NUMBER = 1;
        public static final int NETWORK_METERED_FIELD_NUMBER = 3;
        public static final int NETWORK_TYPE_FIELD_NUMBER = 2;
        private static volatile f1<a> PARSER = null;
        public static final int TELEPHONY_MANAGER_NETWORK_TYPE_FIELD_NUMBER = 4;
        public static final int USB_CONNECTED_FIELD_NUMBER = 6;
        public static final int VOLUME_FIELD_NUMBER = 7;
        private boolean adbEnabled_;
        private int bitField0_;
        private long deviceElapsedRealtime_;
        private long deviceUpTime_;
        private double maxVolume_;
        private boolean networkConnected_;
        private boolean networkMetered_;
        private int networkType_;
        private int telephonyManagerNetworkType_;
        private boolean usbConnected_;
        private double volume_;

        /* renamed from: vb.a1$a$a  reason: collision with other inner class name */
        /* compiled from: DynamicDeviceInfoOuterClass */
        public static final class C0450a extends z.a<a, C0450a> implements w0 {
            /* synthetic */ C0450a(y0 y0Var) {
                this();
            }

            public C0450a F(boolean z10) {
                w();
                ((a) this.f27301b).t0(z10);
                return this;
            }

            public C0450a G(long j10) {
                w();
                ((a) this.f27301b).u0(j10);
                return this;
            }

            public C0450a H(long j10) {
                w();
                ((a) this.f27301b).v0(j10);
                return this;
            }

            public C0450a I(double d10) {
                w();
                ((a) this.f27301b).w0(d10);
                return this;
            }

            public C0450a J(boolean z10) {
                w();
                ((a) this.f27301b).x0(z10);
                return this;
            }

            public C0450a K(boolean z10) {
                w();
                ((a) this.f27301b).y0(z10);
                return this;
            }

            public C0450a L(int i10) {
                w();
                ((a) this.f27301b).z0(i10);
                return this;
            }

            public C0450a M(int i10) {
                w();
                ((a) this.f27301b).A0(i10);
                return this;
            }

            public C0450a N(boolean z10) {
                w();
                ((a) this.f27301b).B0(z10);
                return this;
            }

            public C0450a O(double d10) {
                w();
                ((a) this.f27301b).C0(d10);
                return this;
            }

            private C0450a() {
                super(a.DEFAULT_INSTANCE);
            }
        }

        static {
            a aVar = new a();
            DEFAULT_INSTANCE = aVar;
            z.b0(a.class, aVar);
        }

        private a() {
        }

        /* access modifiers changed from: private */
        public void A0(int i10) {
            this.bitField0_ |= 8;
            this.telephonyManagerNetworkType_ = i10;
        }

        /* access modifiers changed from: private */
        public void B0(boolean z10) {
            this.bitField0_ |= 32;
            this.usbConnected_ = z10;
        }

        /* access modifiers changed from: private */
        public void C0(double d10) {
            this.bitField0_ |= 64;
            this.volume_ = d10;
        }

        public static a p0() {
            return DEFAULT_INSTANCE;
        }

        public static C0450a s0() {
            return (C0450a) DEFAULT_INSTANCE.y();
        }

        /* access modifiers changed from: private */
        public void t0(boolean z10) {
            this.bitField0_ |= 16;
            this.adbEnabled_ = z10;
        }

        /* access modifiers changed from: private */
        public void u0(long j10) {
            this.bitField0_ |= 512;
            this.deviceElapsedRealtime_ = j10;
        }

        /* access modifiers changed from: private */
        public void v0(long j10) {
            this.bitField0_ |= 256;
            this.deviceUpTime_ = j10;
        }

        /* access modifiers changed from: private */
        public void w0(double d10) {
            this.bitField0_ |= 128;
            this.maxVolume_ = d10;
        }

        /* access modifiers changed from: private */
        public void x0(boolean z10) {
            this.bitField0_ |= 1;
            this.networkConnected_ = z10;
        }

        /* access modifiers changed from: private */
        public void y0(boolean z10) {
            this.bitField0_ |= 4;
            this.networkMetered_ = z10;
        }

        /* access modifiers changed from: private */
        public void z0(int i10) {
            this.bitField0_ |= 2;
            this.networkType_ = i10;
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (y0.f39118a[fVar.ordinal()]) {
                case 1:
                    return new a();
                case 2:
                    return new C0450a((y0) null);
                case 3:
                    return z.S(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007က\u0006\bက\u0007\tဂ\b\nဂ\t", new Object[]{"bitField0_", "networkConnected_", "networkType_", "networkMetered_", "telephonyManagerNetworkType_", "adbEnabled_", "usbConnected_", "volume_", "maxVolume_", "deviceUpTime_", "deviceElapsedRealtime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<a> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (a.class) {
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

        public double q0() {
            return this.maxVolume_;
        }

        public double r0() {
            return this.volume_;
        }
    }

    /* compiled from: DynamicDeviceInfoOuterClass */
    public static final class b extends z.a<a1, b> implements w0 {
        /* synthetic */ b(y0 y0Var) {
            this();
        }

        public b F(a aVar) {
            w();
            ((a1) this.f27301b).y0(aVar);
            return this;
        }

        public b G(boolean z10) {
            w();
            ((a1) this.f27301b).z0(z10);
            return this;
        }

        public b H(double d10) {
            w();
            ((a1) this.f27301b).A0(d10);
            return this;
        }

        public b I(int i10) {
            w();
            ((a1) this.f27301b).B0(i10);
            return this;
        }

        public b J(z0 z0Var) {
            w();
            ((a1) this.f27301b).C0(z0Var);
            return this;
        }

        public b K(long j10) {
            w();
            ((a1) this.f27301b).D0(j10);
            return this;
        }

        public b L(long j10) {
            w();
            ((a1) this.f27301b).E0(j10);
            return this;
        }

        public b M(String str) {
            w();
            ((a1) this.f27301b).F0(str);
            return this;
        }

        public b N(boolean z10) {
            w();
            ((a1) this.f27301b).G0(z10);
            return this;
        }

        public b O(boolean z10) {
            w();
            ((a1) this.f27301b).H0(z10);
            return this;
        }

        public b P(String str) {
            w();
            ((a1) this.f27301b).I0(str);
            return this;
        }

        public b Q(String str) {
            w();
            ((a1) this.f27301b).J0(str);
            return this;
        }

        public b R(String str) {
            w();
            ((a1) this.f27301b).K0(str);
            return this;
        }

        public b S(long j10) {
            w();
            ((a1) this.f27301b).L0(j10);
            return this;
        }

        public b T(boolean z10) {
            w();
            ((a1) this.f27301b).M0(z10);
            return this;
        }

        private b() {
            super(a1.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: DynamicDeviceInfoOuterClass */
    public static final class c extends z<c, a> implements w0 {
        public static final int CURRENT_RADIO_ACCESS_TECHNOLOGY_FIELD_NUMBER = 1;
        public static final int CURRENT_UI_THEME_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final c DEFAULT_INSTANCE;
        public static final int DEVICE_NAME_FIELD_NUMBER = 6;
        public static final int LOCALE_LIST_FIELD_NUMBER = 4;
        public static final int NETWORK_REACHABILITY_FLAGS_FIELD_NUMBER = 2;
        public static final int NW_PATH_INTERFACES_FIELD_NUMBER = 3;
        private static volatile f1<c> PARSER = null;
        public static final int TRACKING_AUTH_STATUS_FIELD_NUMBER = 8;
        public static final int VOLUME_FIELD_NUMBER = 7;
        private int bitField0_;
        private String currentRadioAccessTechnology_ = MaxReward.DEFAULT_LABEL;
        private int currentUiTheme_;
        private String deviceName_ = MaxReward.DEFAULT_LABEL;
        private d0.j<String> localeList_ = z.F();
        private int networkReachabilityFlags_;
        private d0.j<String> nwPathInterfaces_ = z.F();
        private int trackingAuthStatus_;
        private double volume_;

        /* compiled from: DynamicDeviceInfoOuterClass */
        public static final class a extends z.a<c, a> implements w0 {
            /* synthetic */ a(y0 y0Var) {
                this();
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
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (y0.f39118a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a((y0) null);
                case 3:
                    return z.S(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ለ\u0000\u0002ဋ\u0001\u0003Ț\u0004Ț\u0005င\u0002\u0006ለ\u0003\u0007က\u0004\bင\u0005", new Object[]{"bitField0_", "currentRadioAccessTechnology_", "networkReachabilityFlags_", "nwPathInterfaces_", "localeList_", "currentUiTheme_", "deviceName_", "volume_", "trackingAuthStatus_"});
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
    }

    static {
        a1 a1Var = new a1();
        DEFAULT_INSTANCE = a1Var;
        z.b0(a1.class, a1Var);
    }

    private a1() {
    }

    /* access modifiers changed from: private */
    public void A0(double d10) {
        this.bitField0_ |= 1024;
        this.batteryLevel_ = d10;
    }

    /* access modifiers changed from: private */
    public void B0(int i10) {
        this.bitField0_ |= 2048;
        this.batteryStatus_ = i10;
    }

    /* access modifiers changed from: private */
    public void C0(z0 z0Var) {
        this.connectionType_ = z0Var.I();
        this.bitField0_ |= 4096;
    }

    /* access modifiers changed from: private */
    public void D0(long j10) {
        this.bitField0_ |= 8;
        this.freeDiskSpace_ = j10;
    }

    /* access modifiers changed from: private */
    public void E0(long j10) {
        this.bitField0_ |= 16;
        this.freeRamMemory_ = j10;
    }

    /* access modifiers changed from: private */
    public void F0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.language_ = str;
    }

    /* access modifiers changed from: private */
    public void G0(boolean z10) {
        this.bitField0_ |= 512;
        this.limitedOpenAdTracking_ = z10;
    }

    /* access modifiers changed from: private */
    public void H0(boolean z10) {
        this.bitField0_ |= 256;
        this.limitedTracking_ = z10;
    }

    /* access modifiers changed from: private */
    public void I0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.networkOperator_ = str;
    }

    /* access modifiers changed from: private */
    public void J0(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.networkOperatorName_ = str;
    }

    /* access modifiers changed from: private */
    public void K0(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.timeZone_ = str;
    }

    /* access modifiers changed from: private */
    public void L0(long j10) {
        this.bitField0_ |= 128;
        this.timeZoneOffset_ = j10;
    }

    /* access modifiers changed from: private */
    public void M0(boolean z10) {
        this.bitField0_ |= 32;
        this.wiredHeadset_ = z10;
    }

    public static b x0() {
        return (b) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void y0(a aVar) {
        aVar.getClass();
        this.platformSpecific_ = aVar;
        this.platformSpecificCase_ = 12;
    }

    /* access modifiers changed from: private */
    public void z0(boolean z10) {
        this.bitField0_ |= 8192;
        this.appActive_ = z10;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (y0.f39118a[fVar.ordinal()]) {
            case 1:
                return new a1();
            case 2:
                return new b((y0) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0010\u0001\u0001\u0001\u0011\u0010\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0005ဂ\u0003\u0006ဂ\u0004\u0007ဇ\u0005\bለ\u0006\tဂ\u0007\nဇ\b\u000bဇ\t\f<\u0000\r<\u0000\u000eက\n\u000fင\u000b\u0010ဌ\f\u0011ဇ\r", new Object[]{"platformSpecific_", "platformSpecificCase_", "bitField0_", "language_", "networkOperator_", "networkOperatorName_", "freeDiskSpace_", "freeRamMemory_", "wiredHeadset_", "timeZone_", "timeZoneOffset_", "limitedTracking_", "limitedOpenAdTracking_", a.class, c.class, "batteryLevel_", "batteryStatus_", "connectionType_", "appActive_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<a1> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (a1.class) {
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

    public a u0() {
        if (this.platformSpecificCase_ == 12) {
            return (a) this.platformSpecific_;
        }
        return a.p0();
    }

    public z0 v0() {
        z0 c10 = z0.c(this.connectionType_);
        return c10 == null ? z0.UNRECOGNIZED : c10;
    }

    public boolean w0() {
        return this.limitedTracking_;
    }
}
