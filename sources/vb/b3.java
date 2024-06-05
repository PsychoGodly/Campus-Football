package vb;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.Collections;
import java.util.List;

/* compiled from: StaticDeviceInfoOuterClass */
public final class b3 extends z<b3, b> implements w0 {
    public static final int ANDROID_FIELD_NUMBER = 19;
    public static final int APP_DEBUGGABLE_FIELD_NUMBER = 3;
    public static final int BUNDLE_ID_FIELD_NUMBER = 1;
    public static final int BUNDLE_VERSION_FIELD_NUMBER = 2;
    public static final int CPU_COUNT_FIELD_NUMBER = 17;
    public static final int CPU_MODEL_FIELD_NUMBER = 16;
    /* access modifiers changed from: private */
    public static final b3 DEFAULT_INSTANCE;
    public static final int DEVICE_MAKE_FIELD_NUMBER = 6;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 7;
    public static final int GPU_MODEL_FIELD_NUMBER = 18;
    public static final int IOS_FIELD_NUMBER = 20;
    public static final int OS_VERSION_FIELD_NUMBER = 5;
    private static volatile f1<b3> PARSER = null;
    public static final int ROOTED_FIELD_NUMBER = 4;
    public static final int SCREEN_DENSITY_FIELD_NUMBER = 9;
    public static final int SCREEN_HEIGHT_FIELD_NUMBER = 11;
    public static final int SCREEN_SIZE_FIELD_NUMBER = 12;
    public static final int SCREEN_WIDTH_FIELD_NUMBER = 10;
    public static final int STORES_FIELD_NUMBER = 13;
    public static final int TOTAL_DISK_SPACE_FIELD_NUMBER = 14;
    public static final int TOTAL_RAM_MEMORY_FIELD_NUMBER = 15;
    public static final int WEBVIEW_UA_FIELD_NUMBER = 8;
    private boolean appDebuggable_;
    private int bitField0_;
    private String bundleId_ = MaxReward.DEFAULT_LABEL;
    private String bundleVersion_ = MaxReward.DEFAULT_LABEL;
    private long cpuCount_;
    private String cpuModel_ = MaxReward.DEFAULT_LABEL;
    private String deviceMake_ = MaxReward.DEFAULT_LABEL;
    private String deviceModel_ = MaxReward.DEFAULT_LABEL;
    private String gpuModel_ = MaxReward.DEFAULT_LABEL;
    private String osVersion_ = MaxReward.DEFAULT_LABEL;
    private int platformSpecificCase_ = 0;
    private Object platformSpecific_;
    private boolean rooted_;
    private int screenDensity_;
    private int screenHeight_;
    private int screenSize_;
    private int screenWidth_;
    private d0.j<String> stores_ = z.F();
    private long totalDiskSpace_;
    private long totalRamMemory_;
    private String webviewUa_ = MaxReward.DEFAULT_LABEL;

    /* compiled from: StaticDeviceInfoOuterClass */
    public static final class a extends z<a, C0451a> implements w0 {
        public static final int ANDROID_FINGERPRINT_FIELD_NUMBER = 3;
        public static final int API_LEVEL_FIELD_NUMBER = 1;
        public static final int APK_DEVELOPER_SIGNING_CERTIFICATE_HASH_FIELD_NUMBER = 5;
        public static final int APP_INSTALLER_FIELD_NUMBER = 4;
        public static final int BUILD_BOARD_FIELD_NUMBER = 6;
        public static final int BUILD_BOOTLOADER_FIELD_NUMBER = 13;
        public static final int BUILD_BRAND_FIELD_NUMBER = 7;
        public static final int BUILD_DEVICE_FIELD_NUMBER = 8;
        public static final int BUILD_DISPLAY_FIELD_NUMBER = 9;
        public static final int BUILD_FINGERPRINT_FIELD_NUMBER = 10;
        public static final int BUILD_HARDWARE_FIELD_NUMBER = 11;
        public static final int BUILD_HOST_FIELD_NUMBER = 12;
        public static final int BUILD_ID_FIELD_NUMBER = 15;
        public static final int BUILD_PRODUCT_FIELD_NUMBER = 14;
        /* access modifiers changed from: private */
        public static final a DEFAULT_INSTANCE;
        public static final int EXTENSION_VERSION_FIELD_NUMBER = 16;
        private static volatile f1<a> PARSER = null;
        public static final int VERSION_CODE_FIELD_NUMBER = 2;
        private String androidFingerprint_ = MaxReward.DEFAULT_LABEL;
        private int apiLevel_;
        private String apkDeveloperSigningCertificateHash_ = MaxReward.DEFAULT_LABEL;
        private String appInstaller_ = MaxReward.DEFAULT_LABEL;
        private int bitField0_;
        private String buildBoard_ = MaxReward.DEFAULT_LABEL;
        private String buildBootloader_ = MaxReward.DEFAULT_LABEL;
        private String buildBrand_ = MaxReward.DEFAULT_LABEL;
        private String buildDevice_ = MaxReward.DEFAULT_LABEL;
        private String buildDisplay_ = MaxReward.DEFAULT_LABEL;
        private String buildFingerprint_ = MaxReward.DEFAULT_LABEL;
        private String buildHardware_ = MaxReward.DEFAULT_LABEL;
        private String buildHost_ = MaxReward.DEFAULT_LABEL;
        private String buildId_ = MaxReward.DEFAULT_LABEL;
        private String buildProduct_ = MaxReward.DEFAULT_LABEL;
        private int extensionVersion_;
        private int versionCode_;

        /* renamed from: vb.b3$a$a  reason: collision with other inner class name */
        /* compiled from: StaticDeviceInfoOuterClass */
        public static final class C0451a extends z.a<a, C0451a> implements w0 {
            /* synthetic */ C0451a(a3 a3Var) {
                this();
            }

            public C0451a F(String str) {
                w();
                ((a) this.f27301b).w0(str);
                return this;
            }

            public C0451a G(int i10) {
                w();
                ((a) this.f27301b).x0(i10);
                return this;
            }

            public C0451a H(String str) {
                w();
                ((a) this.f27301b).y0(str);
                return this;
            }

            public C0451a I(String str) {
                w();
                ((a) this.f27301b).z0(str);
                return this;
            }

            public C0451a J(String str) {
                w();
                ((a) this.f27301b).A0(str);
                return this;
            }

            public C0451a K(String str) {
                w();
                ((a) this.f27301b).B0(str);
                return this;
            }

            public C0451a L(String str) {
                w();
                ((a) this.f27301b).C0(str);
                return this;
            }

            public C0451a M(String str) {
                w();
                ((a) this.f27301b).D0(str);
                return this;
            }

            public C0451a N(String str) {
                w();
                ((a) this.f27301b).E0(str);
                return this;
            }

            public C0451a O(String str) {
                w();
                ((a) this.f27301b).F0(str);
                return this;
            }

            public C0451a P(String str) {
                w();
                ((a) this.f27301b).G0(str);
                return this;
            }

            public C0451a Q(String str) {
                w();
                ((a) this.f27301b).H0(str);
                return this;
            }

            public C0451a R(String str) {
                w();
                ((a) this.f27301b).I0(str);
                return this;
            }

            public C0451a S(String str) {
                w();
                ((a) this.f27301b).J0(str);
                return this;
            }

            public C0451a T(int i10) {
                w();
                ((a) this.f27301b).K0(i10);
                return this;
            }

            public C0451a U(int i10) {
                w();
                ((a) this.f27301b).L0(i10);
                return this;
            }

            private C0451a() {
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
        public void A0(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.buildBoard_ = str;
        }

        /* access modifiers changed from: private */
        public void B0(String str) {
            str.getClass();
            this.bitField0_ |= 4096;
            this.buildBootloader_ = str;
        }

        /* access modifiers changed from: private */
        public void C0(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.buildBrand_ = str;
        }

        /* access modifiers changed from: private */
        public void D0(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.buildDevice_ = str;
        }

        /* access modifiers changed from: private */
        public void E0(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.buildDisplay_ = str;
        }

        /* access modifiers changed from: private */
        public void F0(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.buildFingerprint_ = str;
        }

        /* access modifiers changed from: private */
        public void G0(String str) {
            str.getClass();
            this.bitField0_ |= 1024;
            this.buildHardware_ = str;
        }

        /* access modifiers changed from: private */
        public void H0(String str) {
            str.getClass();
            this.bitField0_ |= 2048;
            this.buildHost_ = str;
        }

        /* access modifiers changed from: private */
        public void I0(String str) {
            str.getClass();
            this.bitField0_ |= 16384;
            this.buildId_ = str;
        }

        /* access modifiers changed from: private */
        public void J0(String str) {
            str.getClass();
            this.bitField0_ |= 8192;
            this.buildProduct_ = str;
        }

        /* access modifiers changed from: private */
        public void K0(int i10) {
            this.bitField0_ |= 32768;
            this.extensionVersion_ = i10;
        }

        /* access modifiers changed from: private */
        public void L0(int i10) {
            this.bitField0_ |= 2;
            this.versionCode_ = i10;
        }

        public static C0451a v0() {
            return (C0451a) DEFAULT_INSTANCE.y();
        }

        /* access modifiers changed from: private */
        public void w0(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.androidFingerprint_ = str;
        }

        /* access modifiers changed from: private */
        public void x0(int i10) {
            this.bitField0_ |= 1;
            this.apiLevel_ = i10;
        }

        /* access modifiers changed from: private */
        public void y0(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.apkDeveloperSigningCertificateHash_ = str;
        }

        /* access modifiers changed from: private */
        public void z0(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.appInstaller_ = str;
        }

        /* access modifiers changed from: protected */
        public final Object D(z.f fVar, Object obj, Object obj2) {
            switch (a3.f38924a[fVar.ordinal()]) {
                case 1:
                    return new a();
                case 2:
                    return new C0451a((a3) null);
                case 3:
                    return z.S(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tለ\b\nለ\t\u000bለ\n\fለ\u000b\rለ\f\u000eለ\r\u000fለ\u000e\u0010ဋ\u000f", new Object[]{"bitField0_", "apiLevel_", "versionCode_", "androidFingerprint_", "appInstaller_", "apkDeveloperSigningCertificateHash_", "buildBoard_", "buildBrand_", "buildDevice_", "buildDisplay_", "buildFingerprint_", "buildHardware_", "buildHost_", "buildBootloader_", "buildProduct_", "buildId_", "extensionVersion_"});
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
    }

    /* compiled from: StaticDeviceInfoOuterClass */
    public static final class b extends z.a<b3, b> implements w0 {
        /* synthetic */ b(a3 a3Var) {
            this();
        }

        public b F(Iterable<String> iterable) {
            w();
            ((b3) this.f27301b).z0(iterable);
            return this;
        }

        public b G() {
            w();
            ((b3) this.f27301b).A0();
            return this;
        }

        public List<String> H() {
            return Collections.unmodifiableList(((b3) this.f27301b).K0());
        }

        public b I(a aVar) {
            w();
            ((b3) this.f27301b).M0(aVar);
            return this;
        }

        public b J(boolean z10) {
            w();
            ((b3) this.f27301b).N0(z10);
            return this;
        }

        public b K(String str) {
            w();
            ((b3) this.f27301b).O0(str);
            return this;
        }

        public b L(String str) {
            w();
            ((b3) this.f27301b).P0(str);
            return this;
        }

        public b M(long j10) {
            w();
            ((b3) this.f27301b).Q0(j10);
            return this;
        }

        public b N(String str) {
            w();
            ((b3) this.f27301b).R0(str);
            return this;
        }

        public b O(String str) {
            w();
            ((b3) this.f27301b).S0(str);
            return this;
        }

        public b P(String str) {
            w();
            ((b3) this.f27301b).T0(str);
            return this;
        }

        public b Q(String str) {
            w();
            ((b3) this.f27301b).U0(str);
            return this;
        }

        public b R(String str) {
            w();
            ((b3) this.f27301b).V0(str);
            return this;
        }

        public b S(boolean z10) {
            w();
            ((b3) this.f27301b).W0(z10);
            return this;
        }

        public b T(int i10) {
            w();
            ((b3) this.f27301b).X0(i10);
            return this;
        }

        public b U(int i10) {
            w();
            ((b3) this.f27301b).Y0(i10);
            return this;
        }

        public b V(int i10) {
            w();
            ((b3) this.f27301b).Z0(i10);
            return this;
        }

        public b W(int i10) {
            w();
            ((b3) this.f27301b).a1(i10);
            return this;
        }

        public b X(long j10) {
            w();
            ((b3) this.f27301b).b1(j10);
            return this;
        }

        public b Y(long j10) {
            w();
            ((b3) this.f27301b).c1(j10);
            return this;
        }

        public b Z(String str) {
            w();
            ((b3) this.f27301b).d1(str);
            return this;
        }

        private b() {
            super(b3.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: StaticDeviceInfoOuterClass */
    public static final class c extends z<c, a> implements w0 {
        public static final int BUILT_SDK_VERSION_FIELD_NUMBER = 3;
        public static final int CAN_MAKE_PAYMENTS_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final c DEFAULT_INSTANCE;
        private static volatile f1<c> PARSER = null;
        public static final int SCREEN_SCALE_FIELD_NUMBER = 5;
        public static final int SIMULATOR_FIELD_NUMBER = 2;
        public static final int SKADNETWORK_ID_FIELD_NUMBER = 4;
        public static final int SYSTEM_BOOT_TIME_FIELD_NUMBER = 1;
        private int bitField0_;
        private String builtSdkVersion_ = MaxReward.DEFAULT_LABEL;
        private boolean canMakePayments_;
        private int screenScale_;
        private boolean simulator_;
        private d0.j<String> skadnetworkId_ = z.F();
        private long systemBootTime_;

        /* compiled from: StaticDeviceInfoOuterClass */
        public static final class a extends z.a<c, a> implements w0 {
            /* synthetic */ a(a3 a3Var) {
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
            switch (a3.f38924a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a((a3) null);
                case 3:
                    return z.S(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ለ\u0002\u0004Ț\u0005ဋ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "systemBootTime_", "simulator_", "builtSdkVersion_", "skadnetworkId_", "screenScale_", "canMakePayments_"});
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
        b3 b3Var = new b3();
        DEFAULT_INSTANCE = b3Var;
        z.b0(b3.class, b3Var);
    }

    private b3() {
    }

    /* access modifiers changed from: private */
    public void A0() {
        this.stores_ = z.F();
    }

    private void B0() {
        d0.j<String> jVar = this.stores_;
        if (!jVar.t()) {
            this.stores_ = z.Q(jVar);
        }
    }

    public static b L0() {
        return (b) DEFAULT_INSTANCE.y();
    }

    /* access modifiers changed from: private */
    public void M0(a aVar) {
        aVar.getClass();
        this.platformSpecific_ = aVar;
        this.platformSpecificCase_ = 19;
    }

    /* access modifiers changed from: private */
    public void N0(boolean z10) {
        this.bitField0_ |= 4;
        this.appDebuggable_ = z10;
    }

    /* access modifiers changed from: private */
    public void O0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.bundleId_ = str;
    }

    /* access modifiers changed from: private */
    public void P0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.bundleVersion_ = str;
    }

    /* access modifiers changed from: private */
    public void Q0(long j10) {
        this.bitField0_ |= 32768;
        this.cpuCount_ = j10;
    }

    /* access modifiers changed from: private */
    public void R0(String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.cpuModel_ = str;
    }

    /* access modifiers changed from: private */
    public void S0(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.deviceMake_ = str;
    }

    /* access modifiers changed from: private */
    public void T0(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.deviceModel_ = str;
    }

    /* access modifiers changed from: private */
    public void U0(String str) {
        str.getClass();
        this.bitField0_ |= 65536;
        this.gpuModel_ = str;
    }

    /* access modifiers changed from: private */
    public void V0(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.osVersion_ = str;
    }

    /* access modifiers changed from: private */
    public void W0(boolean z10) {
        this.bitField0_ |= 8;
        this.rooted_ = z10;
    }

    /* access modifiers changed from: private */
    public void X0(int i10) {
        this.bitField0_ |= 256;
        this.screenDensity_ = i10;
    }

    /* access modifiers changed from: private */
    public void Y0(int i10) {
        this.bitField0_ |= 1024;
        this.screenHeight_ = i10;
    }

    /* access modifiers changed from: private */
    public void Z0(int i10) {
        this.bitField0_ |= 2048;
        this.screenSize_ = i10;
    }

    /* access modifiers changed from: private */
    public void a1(int i10) {
        this.bitField0_ |= 512;
        this.screenWidth_ = i10;
    }

    /* access modifiers changed from: private */
    public void b1(long j10) {
        this.bitField0_ |= 4096;
        this.totalDiskSpace_ = j10;
    }

    /* access modifiers changed from: private */
    public void c1(long j10) {
        this.bitField0_ |= 8192;
        this.totalRamMemory_ = j10;
    }

    /* access modifiers changed from: private */
    public void d1(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.webviewUa_ = str;
    }

    /* access modifiers changed from: private */
    public void z0(Iterable<String> iterable) {
        B0();
        com.google.protobuf.a.h(iterable, this.stores_);
    }

    public String C0() {
        return this.bundleId_;
    }

    /* access modifiers changed from: protected */
    public final Object D(z.f fVar, Object obj, Object obj2) {
        switch (a3.f38924a[fVar.ordinal()]) {
            case 1:
                return new b3();
            case 2:
                return new b((a3) null);
            case 3:
                return z.S(DEFAULT_INSTANCE, "\u0000\u0014\u0001\u0001\u0001\u0014\u0014\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tဋ\b\nဋ\t\u000bဋ\n\fဋ\u000b\rȚ\u000eဂ\f\u000fဂ\r\u0010ለ\u000e\u0011ဂ\u000f\u0012ለ\u0010\u0013<\u0000\u0014<\u0000", new Object[]{"platformSpecific_", "platformSpecificCase_", "bitField0_", "bundleId_", "bundleVersion_", "appDebuggable_", "rooted_", "osVersion_", "deviceMake_", "deviceModel_", "webviewUa_", "screenDensity_", "screenWidth_", "screenHeight_", "screenSize_", "stores_", "totalDiskSpace_", "totalRamMemory_", "cpuModel_", "cpuCount_", "gpuModel_", a.class, c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<b3> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (b3.class) {
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

    public String D0() {
        return this.bundleVersion_;
    }

    public String E0() {
        return this.deviceMake_;
    }

    public String F0() {
        return this.deviceModel_;
    }

    public String G0() {
        return this.gpuModel_;
    }

    public String H0() {
        return this.osVersion_;
    }

    public int I0() {
        return this.screenHeight_;
    }

    public int J0() {
        return this.screenWidth_;
    }

    public List<String> K0() {
        return this.stores_;
    }
}
