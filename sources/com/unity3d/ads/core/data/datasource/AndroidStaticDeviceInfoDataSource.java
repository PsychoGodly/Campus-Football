package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.core.data.model.StorageType;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.b3;
import vb.y2;
import vb.z2;
import xd.d;

/* compiled from: AndroidStaticDeviceInfoDataSource.kt */
public final class AndroidStaticDeviceInfoDataSource implements StaticDeviceInfoDataSource {
    public static final String ALGORITHM_SHA1 = "SHA-1";
    public static final String APP_VERSION_FAKE = "FakeVersionName";
    public static final String BINARY_SU = "su";
    public static final String CERTIFICATE_TYPE_X509 = "X.509";
    public static final Companion Companion = new Companion((h) null);
    public static final String ENVIRONMENT_VARIABLE_PATH = "PATH";
    public static final String PLATFORM_ANDROID = "android";
    public static final String STORE_GOOGLE = "google";
    private final X500Principal DEBUG_CERT = new X500Principal("CN=Android Debug,O=Android,C=US");
    private final AnalyticsDataSource analyticsDataSource;
    private final Context context;
    private final ByteStringDataSource glInfoStore;
    private b3 staticDeviceInfo;
    private final StoreDataSource storeDataSource;

    /* compiled from: AndroidStaticDeviceInfoDataSource.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* compiled from: AndroidStaticDeviceInfoDataSource.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        static {
            /*
                com.unity3d.services.core.device.Device$MemoryInfoType[] r0 = com.unity3d.services.core.device.Device.MemoryInfoType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.unity3d.services.core.device.Device$MemoryInfoType r2 = com.unity3d.services.core.device.Device.MemoryInfoType.TOTAL_MEMORY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.unity3d.services.core.device.Device$MemoryInfoType r3 = com.unity3d.services.core.device.Device.MemoryInfoType.FREE_MEMORY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                com.unity3d.ads.core.data.model.StorageType[] r0 = com.unity3d.ads.core.data.model.StorageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.unity3d.ads.core.data.model.StorageType r3 = com.unity3d.ads.core.data.model.StorageType.INTERNAL     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.unity3d.ads.core.data.model.StorageType r1 = com.unity3d.ads.core.data.model.StorageType.EXTERNAL     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.WhenMappings.<clinit>():void");
        }
    }

    public AndroidStaticDeviceInfoDataSource(Context context2, ByteStringDataSource byteStringDataSource, AnalyticsDataSource analyticsDataSource2, StoreDataSource storeDataSource2) {
        m.e(context2, "context");
        m.e(byteStringDataSource, "glInfoStore");
        m.e(analyticsDataSource2, "analyticsDataSource");
        m.e(storeDataSource2, "storeDataSource");
        this.context = context2;
        this.glInfoStore = byteStringDataSource;
        this.analyticsDataSource = analyticsDataSource2;
        this.storeDataSource = storeDataSource2;
        z2.a.C0454a aVar = z2.a.f39130b;
        b3.b L0 = b3.L0();
        m.d(L0, "newBuilder()");
        z2.a a10 = aVar.a(L0);
        a10.g(getAppName());
        a10.h(getAppVersion());
        a10.f(isAppDebuggable());
        a10.o(isRooted());
        a10.n(getOsVersion());
        a10.k(getManufacturer());
        a10.l(getModel());
        a10.v(getWebViewUserAgent());
        a10.p(getScreenDensity());
        a10.s(getScreenWidth());
        a10.q(getScreenHeight());
        a10.r(getScreenLayout());
        a10.b(a10.d(), getStores$default(this, (List) null, 1, (Object) null));
        a10.t(getTotalSpace(getFileForStorageType(StorageType.EXTERNAL)));
        a10.u(getTotalMemory());
        a10.j(getCPUModel());
        a10.i(getCPUCount());
        a10.e(fetchAndroidStaticDeviceInfo());
        this.staticDeviceInfo = a10.a();
    }

    private final b3.a fetchAndroidStaticDeviceInfo() {
        z2 z2Var = z2.f39129a;
        y2.a aVar = y2.f39119b;
        b3.a.C0451a v02 = b3.a.v0();
        m.d(v02, "newBuilder()");
        y2 a10 = aVar.a(v02);
        a10.c(getApiLevel());
        a10.q(getVersionCode());
        a10.b(getFingerprint());
        a10.e(getInstallerPackageName());
        a10.d(getCertificateFingerprint());
        a10.f(getBoard());
        a10.h(getBrand());
        a10.i(getDevice());
        a10.j(getDisplay());
        a10.k(getFingerprint());
        a10.l(getHardware());
        a10.m(getHost());
        a10.g(getBootloader());
        a10.o(getProduct());
        a10.p(getExtensionVersion());
        String buildId = getBuildId();
        if (buildId != null) {
            a10.n(buildId);
        }
        return a10.a();
    }

    private final int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    private final long getAppStartTime() {
        return SdkProperties.getInitializationTimeEpoch();
    }

    private final String getAppVersion() {
        String str;
        String packageName = this.context.getPackageName();
        PackageManager packageManager = this.context.getPackageManager();
        try {
            if (packageManager.getPackageInfo(packageName, 0).versionName == null) {
                str = APP_VERSION_FAKE;
            } else {
                str = packageManager.getPackageInfo(packageName, 0).versionName;
            }
            m.d(str, "{\n            if (pm.get…e\n            }\n        }");
            return str;
        } catch (PackageManager.NameNotFoundException e10) {
            DeviceLog.exception("Error getting package info", e10);
            return MaxReward.DEFAULT_LABEL;
        }
    }

    private final long getCPUCount() {
        return (long) Runtime.getRuntime().availableProcessors();
    }

    private final String getCPUModel() {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.SOC_MODEL;
            m.d(str, "{\n            Build.SOC_MODEL\n        }");
            return str;
        }
        try {
            return (String) y.z(e.c(new File("/proc/cpuinfo"), (Charset) null, 1, (Object) null));
        } catch (FileNotFoundException e10) {
            DeviceLog.exception("Error reading CPU model", e10);
            return MaxReward.DEFAULT_LABEL;
        }
    }

    private final String getCertificateFingerprint() {
        try {
            Signature[] signatureArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 64).signatures;
            if (signatureArr == null) {
                return MaxReward.DEFAULT_LABEL;
            }
            if (!(!(signatureArr.length == 0))) {
                return MaxReward.DEFAULT_LABEL;
            }
            Certificate generateCertificate = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
            m.c(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            String hexString = Utilities.toHexString(MessageDigest.getInstance(ALGORITHM_SHA1).digest(((X509Certificate) generateCertificate).getEncoded()));
            m.d(hexString, "toHexString(publicKey)");
            return hexString;
        } catch (Exception e10) {
            DeviceLog.exception("Exception when signing certificate fingerprint", e10);
            return MaxReward.DEFAULT_LABEL;
        }
    }

    private final float getDisplayMetricDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return 0.0f;
        }
        return displayMetrics.density;
    }

    private final int getExtensionVersion() {
        if (Build.VERSION.SDK_INT >= 30) {
            return SdkExtensions.getExtensionVersion(30);
        }
        return -1;
    }

    private final File getFileForStorageType(StorageType storageType) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[storageType.ordinal()];
        if (i10 == 1) {
            return this.context.getCacheDir();
        }
        if (i10 == 2) {
            return this.context.getExternalCacheDir();
        }
        DeviceLog.error("Unhandled storagetype: " + storageType);
        return null;
    }

    private final String getFingerprint() {
        String str = Build.FINGERPRINT;
        return str == null ? MaxReward.DEFAULT_LABEL : str;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getGPUModel(xd.d<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1 r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1 r0 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sd.p.b(r5)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            sd.p.b(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.glInfoStore
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            c r5 = (defpackage.c) r5
            com.google.protobuf.i r5 = r5.g0()
            java.nio.charset.Charset r0 = ne.c.f36517g
            java.lang.String r5 = r5.L(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.getGPUModel(xd.d):java.lang.Object");
    }

    private final String getGameId() {
        String gameId = ClientProperties.getGameId();
        return gameId == null ? MaxReward.DEFAULT_LABEL : gameId;
    }

    private final String getInstallerPackageName() {
        String installerPackageName = this.context.getPackageManager().getInstallerPackageName(this.context.getPackageName());
        return installerPackageName == null ? MaxReward.DEFAULT_LABEL : installerPackageName;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        ce.b.a(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long getMemoryInfo(com.unity3d.services.core.device.Device.MemoryInfoType r5) {
        /*
            r4 = this;
            int[] r0 = com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 2
            r1 = 1
            if (r5 == r1) goto L_0x0015
            if (r5 != r0) goto L_0x000f
            goto L_0x0016
        L_0x000f:
            sd.l r5 = new sd.l
            r5.<init>()
            throw r5
        L_0x0015:
            r0 = 1
        L_0x0016:
            r5 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x003a }
            java.lang.String r2 = "/proc/meminfo"
            java.lang.String r3 = "r"
            r1.<init>(r2, r3)     // Catch:{ FileNotFoundException -> 0x003a }
            r2 = 0
            r3 = r5
        L_0x0022:
            if (r2 >= r0) goto L_0x002b
            java.lang.String r3 = r1.readLine()     // Catch:{ all -> 0x0031 }
            int r2 = r2 + 1
            goto L_0x0022
        L_0x002b:
            sd.w r0 = sd.w.f38141a     // Catch:{ all -> 0x0031 }
            ce.b.a(r1, r5)     // Catch:{ FileNotFoundException -> 0x0038 }
            goto L_0x0042
        L_0x0031:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            ce.b.a(r1, r5)     // Catch:{ FileNotFoundException -> 0x0038 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0038 }
        L_0x0038:
            r5 = move-exception
            goto L_0x003d
        L_0x003a:
            r0 = move-exception
            r3 = r5
            r5 = r0
        L_0x003d:
            java.lang.String r0 = "Error reading memory info"
            com.unity3d.services.core.log.DeviceLog.exception(r0, r5)
        L_0x0042:
            long r0 = r4.getMemoryValueFromString(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.getMemoryInfo(com.unity3d.services.core.device.Device$MemoryInfoType):long");
    }

    private final long getMemoryValueFromString(String str) {
        if (str == null) {
            return 0;
        }
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        String str2 = null;
        while (matcher.find()) {
            str2 = matcher.group(1);
        }
        if (str2 != null) {
            return Long.parseLong(str2);
        }
        return -1;
    }

    private final ArrayList<String> getNewAbiList() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = Build.SUPPORTED_ABIS;
        m.d(strArr, "SUPPORTED_ABIS");
        arrayList.addAll(q.f(Arrays.copyOf(strArr, strArr.length)));
        return arrayList;
    }

    private final List<String> getOldAbiList() {
        ArrayList arrayList = new ArrayList();
        String str = Build.CPU_ABI;
        m.d(str, "CPU_ABI");
        arrayList.add(str);
        String str2 = Build.CPU_ABI2;
        m.d(str2, "CPU_ABI2");
        arrayList.add(str2);
        return arrayList;
    }

    private final String getOpenAdvertisingTrackingId() {
        String openAdvertisingTrackingId = OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? MaxReward.DEFAULT_LABEL : openAdvertisingTrackingId;
    }

    private final String getPlatform() {
        return "android";
    }

    private final int getScreenDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.densityDpi;
    }

    private final int getScreenHeight() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.heightPixels;
    }

    private final int getScreenLayout() {
        return this.context.getResources().getConfiguration().screenLayout;
    }

    private final int getScreenWidth() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.widthPixels;
    }

    private final List<String> getStores(List<String> list) {
        return this.storeDataSource.fetchStores(list);
    }

    static /* synthetic */ List getStores$default(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = q.d();
        }
        return androidStaticDeviceInfoDataSource.getStores(list);
    }

    private final int getVersionCode() {
        return 41200;
    }

    private final String getVersionName() {
        return "4.12.0";
    }

    private final String getWebViewUserAgent() {
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.context);
            m.d(defaultUserAgent, "{\n        WebSettings.ge…tUserAgent(context)\n    }");
            return defaultUserAgent;
        } catch (Exception e10) {
            DeviceLog.exception("Exception getting webview user agent", e10);
            return MaxReward.DEFAULT_LABEL;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isAppDebuggable() {
        /*
            r8 = this;
            java.lang.String r0 = "Could not find name"
            android.content.Context r1 = r8.context
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "context.packageManager"
            kotlin.jvm.internal.m.d(r1, r2)
            android.content.Context r2 = r8.context
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = "context.packageName"
            kotlin.jvm.internal.m.d(r2, r3)
            r3 = 1
            r4 = 0
            android.content.pm.ApplicationInfo r5 = r1.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x002e }
            java.lang.String r6 = "pm.getApplicationInfo(pkgName, 0)"
            kotlin.jvm.internal.m.d(r5, r6)     // Catch:{ NameNotFoundException -> 0x002e }
            int r6 = r5.flags     // Catch:{ NameNotFoundException -> 0x002e }
            r6 = r6 & 2
            r5.flags = r6     // Catch:{ NameNotFoundException -> 0x002e }
            r3 = 0
            if (r6 == 0) goto L_0x0032
            r5 = 1
            goto L_0x0033
        L_0x002e:
            r5 = move-exception
            com.unity3d.services.core.log.DeviceLog.exception(r0, r5)
        L_0x0032:
            r5 = 0
        L_0x0033:
            if (r3 == 0) goto L_0x007b
            r3 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch:{ NameNotFoundException -> 0x0077, CertificateException -> 0x0070 }
            android.content.pm.Signature[] r1 = r1.signatures     // Catch:{ NameNotFoundException -> 0x0077, CertificateException -> 0x0070 }
            java.lang.String r2 = "signatures"
            kotlin.jvm.internal.m.d(r1, r2)     // Catch:{ NameNotFoundException -> 0x0077, CertificateException -> 0x0070 }
            int r2 = r1.length     // Catch:{ NameNotFoundException -> 0x0077, CertificateException -> 0x0070 }
        L_0x0043:
            if (r4 >= r2) goto L_0x007b
            r3 = r1[r4]     // Catch:{ NameNotFoundException -> 0x0077, CertificateException -> 0x0070 }
            java.lang.String r6 = "X.509"
            java.security.cert.CertificateFactory r6 = java.security.cert.CertificateFactory.getInstance(r6)     // Catch:{ NameNotFoundException -> 0x0077, CertificateException -> 0x0070 }
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch:{ NameNotFoundException -> 0x0077, CertificateException -> 0x0070 }
            byte[] r3 = r3.toByteArray()     // Catch:{ NameNotFoundException -> 0x0077, CertificateException -> 0x0070 }
            r7.<init>(r3)     // Catch:{ NameNotFoundException -> 0x0077, CertificateException -> 0x0070 }
            java.security.cert.Certificate r3 = r6.generateCertificate(r7)     // Catch:{ NameNotFoundException -> 0x0077, CertificateException -> 0x0070 }
            java.lang.String r6 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.m.c(r3, r6)     // Catch:{ NameNotFoundException -> 0x0077, CertificateException -> 0x0070 }
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch:{ NameNotFoundException -> 0x0077, CertificateException -> 0x0070 }
            javax.security.auth.x500.X500Principal r3 = r3.getSubjectX500Principal()     // Catch:{ NameNotFoundException -> 0x0077, CertificateException -> 0x0070 }
            javax.security.auth.x500.X500Principal r6 = r8.DEBUG_CERT     // Catch:{ NameNotFoundException -> 0x0077, CertificateException -> 0x0070 }
            boolean r5 = kotlin.jvm.internal.m.a(r3, r6)     // Catch:{ NameNotFoundException -> 0x0077, CertificateException -> 0x0070 }
            if (r5 != 0) goto L_0x007b
            int r4 = r4 + 1
            goto L_0x0043
        L_0x0070:
            r0 = move-exception
            java.lang.String r1 = "Certificate exception"
            com.unity3d.services.core.log.DeviceLog.exception(r1, r0)
            goto L_0x007b
        L_0x0077:
            r1 = move-exception
            com.unity3d.services.core.log.DeviceLog.exception(r0, r1)
        L_0x007b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.isAppDebuggable():boolean");
    }

    private final boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo, String str) {
        if (getApiLevel() >= 29) {
            return isHardwareAcceleratedV29(mediaCodecInfo);
        }
        return !isSoftwareOnly(mediaCodecInfo, str);
    }

    private final boolean isHardwareAcceleratedV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private final boolean isRooted() {
        try {
            return searchPathForBinary(BINARY_SU);
        } catch (Exception e10) {
            DeviceLog.exception("Rooted check failed", e10);
            return false;
        }
    }

    private final boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo, String str) {
        if (getApiLevel() >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        String name = mediaCodecInfo.getName();
        m.d(name, "codecInfo.name");
        Locale locale = Locale.ROOT;
        m.d(locale, "ROOT");
        String lowerCase = name.toLowerCase(locale);
        m.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (o.r(lowerCase, "arc.", false, 2, (Object) null)) {
            return false;
        }
        if (o.r(lowerCase, "omx.google.", false, 2, (Object) null) || o.r(lowerCase, "omx.ffmpeg.", false, 2, (Object) null) || ((o.r(lowerCase, "omx.sec.", false, 2, (Object) null) && p.u(lowerCase, ".sw.", false, 2, (Object) null)) || m.a(lowerCase, "omx.qcom.video.decoder.hevcswvdec") || o.r(lowerCase, "c2.android.", false, 2, (Object) null) || o.r(lowerCase, "c2.google.", false, 2, (Object) null) || (!o.r(lowerCase, "omx.", false, 2, (Object) null) && !o.r(lowerCase, "c2.", false, 2, (Object) null)))) {
            return true;
        }
        return false;
    }

    private final boolean isSoftwareOnlyV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private final boolean isTestMode() {
        return SdkProperties.isTestMode();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean searchPathForBinary(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "PATH"
            java.lang.String r0 = java.lang.System.getenv(r0)
            r1 = 0
            if (r0 == 0) goto L_0x008a
            ne.e r2 = new ne.e
            java.lang.String r3 = ":"
            r2.<init>((java.lang.String) r3)
            java.util.List r0 = r2.b(r0, r1)
            if (r0 == 0) goto L_0x008a
            boolean r2 = r0.isEmpty()
            r3 = 1
            if (r2 != 0) goto L_0x0046
            int r2 = r0.size()
            java.util.ListIterator r2 = r0.listIterator(r2)
        L_0x0025:
            boolean r4 = r2.hasPrevious()
            if (r4 == 0) goto L_0x0046
            java.lang.Object r4 = r2.previous()
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0039
            r4 = 1
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            if (r4 != 0) goto L_0x0025
            int r2 = r2.nextIndex()
            int r2 = r2 + r3
            java.util.List r0 = td.y.H(r0, r2)
            goto L_0x004a
        L_0x0046:
            java.util.List r0 = td.q.d()
        L_0x004a:
            if (r0 == 0) goto L_0x008a
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 == 0) goto L_0x008a
            int r2 = r0.length
            r4 = 0
        L_0x0058:
            if (r4 >= r2) goto L_0x008a
            r5 = r0[r4]
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            boolean r5 = r6.exists()
            if (r5 == 0) goto L_0x0087
            boolean r5 = r6.isDirectory()
            if (r5 == 0) goto L_0x0087
            java.io.File[] r5 = r6.listFiles()
            if (r5 == 0) goto L_0x0087
            int r6 = r5.length
            r7 = 0
        L_0x0075:
            if (r7 >= r6) goto L_0x0087
            r8 = r5[r7]
            java.lang.String r8 = r8.getName()
            boolean r8 = kotlin.jvm.internal.m.a(r8, r10)
            if (r8 == 0) goto L_0x0084
            return r3
        L_0x0084:
            int r7 = r7 + 1
            goto L_0x0075
        L_0x0087:
            int r4 = r4 + 1
            goto L_0x0058
        L_0x008a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.searchPathForBinary(java.lang.String):boolean");
    }

    private final List<MediaCodecInfo> selectAllDecodeCodecs(String str) {
        ArrayList arrayList = new ArrayList();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i10 = 0; i10 < codecCount; i10++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
            if (!codecInfoAt.isEncoder()) {
                for (String l10 : codecInfoAt.getSupportedTypes()) {
                    if (o.l(l10, str, true)) {
                        m.d(codecInfoAt, "codecInfo");
                        if (isHardwareAccelerated(codecInfoAt, str)) {
                            arrayList.add(codecInfoAt);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetch(java.util.List<java.lang.String> r6, xd.d<? super vb.b3> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1 r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1 r0 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.lang.Object r6 = r0.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource) r0
            sd.p.b(r7)
            goto L_0x0062
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            sd.p.b(r7)
            vb.b3 r7 = r5.staticDeviceInfo
            java.lang.String r7 = r7.G0()
            if (r7 == 0) goto L_0x004e
            int r7 = r7.length()
            if (r7 != 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r7 = 0
            goto L_0x004f
        L_0x004e:
            r7 = 1
        L_0x004f:
            if (r7 != 0) goto L_0x0054
            vb.b3 r6 = r5.staticDeviceInfo
            return r6
        L_0x0054:
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.getGPUModel(r0)
            if (r7 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r0 = r5
        L_0x0062:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x006c
            int r1 = r7.length()
            if (r1 != 0) goto L_0x006d
        L_0x006c:
            r3 = 1
        L_0x006d:
            if (r3 == 0) goto L_0x0072
            vb.b3 r6 = r0.staticDeviceInfo
            return r6
        L_0x0072:
            vb.b3 r1 = r0.staticDeviceInfo
            vb.z2$a$a r2 = vb.z2.a.f39130b
            com.google.protobuf.z$a r1 = r1.b()
            java.lang.String r3 = "this.toBuilder()"
            kotlin.jvm.internal.m.d(r1, r3)
            vb.b3$b r1 = (vb.b3.b) r1
            vb.z2$a r1 = r2.a(r1)
            r1.m(r7)
            s8.b r7 = r1.d()
            r1.c(r7)
            s8.b r7 = r1.d()
            java.util.List r6 = r0.getStores(r6)
            r1.b(r7, r6)
            vb.b3 r6 = r1.a()
            r0.staticDeviceInfo = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.fetch(java.util.List, xd.d):java.lang.Object");
    }

    public b3 fetchCached() {
        return this.staticDeviceInfo;
    }

    public final String getAdvertisingTrackingId() {
        String advertisingTrackingId = AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? MaxReward.DEFAULT_LABEL : advertisingTrackingId;
    }

    public String getAnalyticsUserId() {
        return this.analyticsDataSource.getUserId();
    }

    public String getAppName() {
        String packageName = this.context.getPackageName();
        m.d(packageName, "context.packageName");
        return packageName;
    }

    public Object getAuid(d<? super String> dVar) {
        String string = AndroidPreferences.getString(UnityAdsConstants.Preferences.PREF_NAME_AUID, "auid");
        if (string == null) {
            return null;
        }
        return string;
    }

    public final String getBoard() {
        String str = Build.BOARD;
        return str == null ? MaxReward.DEFAULT_LABEL : str;
    }

    public final String getBootloader() {
        String str = Build.BOOTLOADER;
        return str == null ? MaxReward.DEFAULT_LABEL : str;
    }

    public final String getBrand() {
        String str = Build.BRAND;
        return str == null ? MaxReward.DEFAULT_LABEL : str;
    }

    public final String getBuildId() {
        return Build.ID;
    }

    public final String getBuildVersionIncremental() {
        return Build.VERSION.INCREMENTAL;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getDevice() {
        String str = Build.DEVICE;
        return str == null ? MaxReward.DEFAULT_LABEL : str;
    }

    public final String getDisplay() {
        String str = Build.DISPLAY;
        return str == null ? MaxReward.DEFAULT_LABEL : str;
    }

    public final String getHardware() {
        String str = Build.HARDWARE;
        return str == null ? MaxReward.DEFAULT_LABEL : str;
    }

    public final String getHost() {
        String str = Build.HOST;
        return str == null ? MaxReward.DEFAULT_LABEL : str;
    }

    public Object getIdfi(d<? super String> dVar) {
        String string = AndroidPreferences.getString(UnityAdsConstants.Preferences.PREF_NAME_IDFI, UnityAdsConstants.Preferences.PREF_KEY_IDFI);
        if (string == null) {
            string = null;
        }
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        AndroidPreferences.setString(UnityAdsConstants.Preferences.PREF_NAME_IDFI, UnityAdsConstants.Preferences.PREF_KEY_IDFI, uuid);
        return uuid;
    }

    public String getManufacturer() {
        String str = Build.MANUFACTURER;
        return str == null ? MaxReward.DEFAULT_LABEL : str;
    }

    public String getModel() {
        String str = Build.MODEL;
        return str == null ? MaxReward.DEFAULT_LABEL : str;
    }

    public String getOsVersion() {
        String str = Build.VERSION.RELEASE;
        return str == null ? MaxReward.DEFAULT_LABEL : str;
    }

    public final String getProduct() {
        String str = Build.PRODUCT;
        return str == null ? MaxReward.DEFAULT_LABEL : str;
    }

    public final List<Sensor> getSensorList() {
        Object systemService = this.context.getSystemService("sensor");
        m.c(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        List<Sensor> sensorList = ((SensorManager) systemService).getSensorList(-1);
        m.d(sensorList, "sensorManager.getSensorList(Sensor.TYPE_ALL)");
        return sensorList;
    }

    public final List<String> getSupportedAbis() {
        if (getApiLevel() < 21) {
            return getOldAbiList();
        }
        return getNewAbiList();
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    public final long getTotalSpace(File file) {
        if (file == null || !file.exists()) {
            return -1;
        }
        return (long) c.b((float) (file.getTotalSpace() / ((long) 1024)));
    }

    public final boolean hasX264Decoder() {
        return !selectAllDecodeCodecs(MimeTypes.VIDEO_H264).isEmpty();
    }

    public final boolean hasX265Decoder() {
        return !selectAllDecodeCodecs(MimeTypes.VIDEO_H265).isEmpty();
    }

    public final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }
}
