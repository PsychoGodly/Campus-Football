package com.unity3d.ads.core.data.datasource;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.WindowManager;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinEventTypes;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.log.DeviceLog;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import sd.s;
import se.e;
import se.g;
import se.k0;
import se.v;
import vb.a1;
import vb.w0;
import vb.x0;
import vb.z0;
import xd.d;

/* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
public final class AndroidDynamicDeviceInfoDataSource implements DynamicDeviceInfoDataSource {
    public static final Companion Companion = new Companion((h) null);
    public static final String DIRECTORY_MEM_INFO = "/proc/meminfo";
    public static final String DIRECTORY_MODE_READ = "r";
    public static final String DIRECTORY_PROCESS_INFO = "/proc/self/stat";
    public static final String INTENT_USB_STATE = "android.hardware.usb.action.USB_STATE";
    public static final String KEY_STAT_CONTENT = "stat";
    public static final String USB_EXTRA_CONNECTED = "connected";
    private final Context context;
    private final LifecycleDataSource lifecycleDataSource;
    private final v<Map<String, Boolean>> reportedWarning = k0.a(k0.g());
    private final e<VolumeSettingsChange> volumeSettingsChange = g.e(new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this, (d<? super AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1>) null));

    /* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
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
                vb.z0[] r0 = vb.z0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                vb.z0 r3 = vb.z0.CONNECTION_TYPE_WIFI     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                vb.z0 r1 = vb.z0.CONNECTION_TYPE_CELLULAR     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                vb.z0 r1 = vb.z0.CONNECTION_TYPE_UNSPECIFIED     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.WhenMappings.<clinit>():void");
        }
    }

    public AndroidDynamicDeviceInfoDataSource(Context context2, LifecycleDataSource lifecycleDataSource2) {
        m.e(context2, "context");
        m.e(lifecycleDataSource2, "lifecycleDataSource");
        this.context = context2;
        this.lifecycleDataSource = lifecycleDataSource2;
    }

    private final boolean adbStatus() {
        Boolean bool;
        try {
            boolean z10 = true;
            if (1 != Settings.Global.getInt(this.context.getContentResolver(), "adb_enabled", 0)) {
                z10 = false;
            }
            bool = Boolean.valueOf(z10);
        } catch (Exception e10) {
            DeviceLog.exception("Problems fetching adb enabled status", e10);
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final a1.a fetchAndroidDynamicDeviceInfo() {
        x0 x0Var = x0.f39112a;
        w0.a aVar = w0.f39107b;
        a1.a.C0450a s02 = a1.a.s0();
        m.d(s02, "newBuilder()");
        w0 a10 = aVar.a(s02);
        a10.f(isActiveNetworkConnected());
        a10.h(getNetworkType());
        a10.g(getNetworkMetered());
        a10.i(getNetworkType());
        a10.b(isAdbEnabled());
        a10.j(isUSBConnected());
        a10.k(getStreamVolume(3));
        a10.e(getStreamMaxVolume(3));
        a10.c(getElapsedRealtime());
        a10.d(getUptime());
        return a10.a();
    }

    private final AudioManager getAudioManager() {
        Object systemService = this.context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (systemService instanceof AudioManager) {
            return (AudioManager) systemService;
        }
        return null;
    }

    private final double getBatteryLevel() {
        Intent registerReceiver = this.context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return -1.0d;
        }
        return ((double) registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0)) / ((double) registerReceiver.getIntExtra("scale", 0));
    }

    private final int getBatteryStatus() {
        Intent registerReceiver = this.context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("status", 0);
        }
        return -1;
    }

    private final z0 getConnectionType() {
        if (isUsingWifi()) {
            return z0.CONNECTION_TYPE_WIFI;
        }
        if (isActiveNetworkConnected()) {
            return z0.CONNECTION_TYPE_CELLULAR;
        }
        return z0.CONNECTION_TYPE_UNSPECIFIED;
    }

    private final ConnectivityManager getConnectivityManager() {
        Object systemService = this.context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }

    private final long getElapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    private final long getEventTimeStamp() {
        return System.currentTimeMillis() / ((long) 1000);
    }

    private final long getFreeSpace(File file) {
        if (file == null || !file.exists()) {
            return -1;
        }
        return (long) c.b((float) (file.getFreeSpace() / ((long) 1024)));
    }

    private final String getLanguage() {
        String locale = Locale.getDefault().toString();
        m.d(locale, "getDefault().toString()");
        return locale;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        ce.b.a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long getMemoryInfo(com.unity3d.services.core.device.Device.MemoryInfoType r5) {
        /*
            r4 = this;
            int[] r0 = com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 2
            r1 = 1
            if (r5 == r1) goto L_0x0010
            if (r5 == r0) goto L_0x0011
            r0 = -1
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile
            java.lang.String r1 = "/proc/meminfo"
            java.lang.String r2 = "r"
            r5.<init>(r1, r2)
            r1 = 0
            r2 = 0
            r3 = r2
        L_0x001d:
            if (r1 >= r0) goto L_0x0026
            java.lang.String r3 = r5.readLine()     // Catch:{ all -> 0x0030 }
            int r1 = r1 + 1
            goto L_0x001d
        L_0x0026:
            sd.w r0 = sd.w.f38141a     // Catch:{ all -> 0x0030 }
            ce.b.a(r5, r2)
            long r0 = r4.getMemoryValueFromString(r3)
            return r0
        L_0x0030:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r1 = move-exception
            ce.b.a(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.getMemoryInfo(com.unity3d.services.core.device.Device$MemoryInfoType):long");
    }

    private final long getMemoryValueFromString(String str) {
        if (str == null) {
            return -1;
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

    private final boolean getNetworkMetered() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager == null || !connectivityManager.isActiveNetworkMetered()) {
            return false;
        }
        return true;
    }

    private final String getNetworkOperator() {
        TelephonyManager telephonyManager = getTelephonyManager();
        String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
        return networkOperator == null ? MaxReward.DEFAULT_LABEL : networkOperator;
    }

    private final String getNetworkOperatorName() {
        TelephonyManager telephonyManager = getTelephonyManager();
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? MaxReward.DEFAULT_LABEL : networkOperatorName;
    }

    private final int getNetworkType() {
        Map<String, Boolean> value;
        TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager == null) {
            return -1;
        }
        try {
            return telephonyManager.getNetworkType();
        } catch (SecurityException unused) {
            if (m.a(this.reportedWarning.getValue().get("getNetworkType"), Boolean.TRUE)) {
                return -1;
            }
            v<Map<String, Boolean>> vVar = this.reportedWarning;
            do {
                value = vVar.getValue();
            } while (!vVar.a(value, k0.o(value, s.a("getNetworkType", Boolean.TRUE))));
            DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
            return -1;
        }
    }

    /* access modifiers changed from: private */
    public final double getStreamVolume(int i10) {
        AudioManager audioManager = getAudioManager();
        return (double) (audioManager != null ? audioManager.getStreamVolume(i10) : -2);
    }

    private final TelephonyManager getTelephonyManager() {
        Object systemService = this.context.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            return (TelephonyManager) systemService;
        }
        return null;
    }

    private final String getTimeZone() {
        try {
            String displayName = TimeZone.getDefault().getDisplayName(false, 0, Locale.US);
            m.d(displayName, "{\n            TimeZone.g…ORT, Locale.US)\n        }");
            return displayName;
        } catch (AssertionError e10) {
            DeviceLog.error("Could not read timeZone information: %s", e10.getMessage());
            return MaxReward.DEFAULT_LABEL;
        }
    }

    private final long getTimeZoneOffset() {
        return ((long) TimeZone.getDefault().getOffset(System.currentTimeMillis())) / ((long) 1000);
    }

    private final long getUptime() {
        return SystemClock.uptimeMillis();
    }

    private final long getUsableSpace(File file) {
        if (file == null || !file.exists()) {
            return -1;
        }
        return (long) c.b((float) (file.getUsableSpace() / ((long) 1024)));
    }

    private final boolean hasInternetConnection() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    private final boolean hasInternetConnectionM() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
            return true;
        }
        return false;
    }

    private final boolean isActiveNetworkConnected() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private final boolean isAdbEnabled() {
        return adbStatus();
    }

    private final boolean isAppActive() {
        return this.lifecycleDataSource.appIsForeground();
    }

    private final boolean isLimitAdTrackingEnabled() {
        return AdvertisingId.getLimitedAdTracking();
    }

    private final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    private final boolean isUSBConnected() {
        Intent registerReceiver = this.context.registerReceiver((BroadcastReceiver) null, new IntentFilter(INTENT_USB_STATE));
        if (registerReceiver != null) {
            return registerReceiver.getBooleanExtra(USB_EXTRA_CONNECTED, false);
        }
        return false;
    }

    private final boolean isUsingWifi() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager == null) {
            return false;
        }
        TelephonyManager telephonyManager = getTelephonyManager();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !connectivityManager.getBackgroundDataSetting() || !activeNetworkInfo.isConnected() || telephonyManager == null || activeNetworkInfo.getType() != 1 || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    private final boolean isWiredHeadsetOn() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null || !audioManager.isWiredHeadsetOn()) {
            return false;
        }
        return true;
    }

    public a1 fetch() {
        x0.a.C0453a aVar = x0.a.f39113b;
        a1.b x02 = a1.x0();
        m.d(x02, "newBuilder()");
        x0.a a10 = aVar.a(x02);
        a10.i(getLanguage());
        a10.l(getNetworkOperator());
        a10.m(getNetworkOperatorName());
        a10.g(getUsableSpace(this.context.getExternalFilesDir((String) null)));
        a10.h(getFreeMemory());
        a10.p(isWiredHeadsetOn());
        a10.n(getTimeZone());
        a10.o(getTimeZoneOffset());
        a10.k(isLimitAdTrackingEnabled());
        a10.j(isLimitOpenAdTrackingEnabled());
        a10.d(getBatteryLevel());
        a10.e(getBatteryStatus());
        a10.f(getConnectionType());
        a10.b(fetchAndroidDynamicDeviceInfo());
        a10.c(isAppActive());
        return a10.a();
    }

    public String getConnectionTypeStr() {
        int i10 = WhenMappings.$EnumSwitchMapping$1[getConnectionType().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? "none" : "cellular";
        }
        return "wifi";
    }

    public final Context getContext() {
        return this.context;
    }

    public final long getFreeMemory() {
        return getMemoryInfo(Device.MemoryInfoType.FREE_MEMORY);
    }

    public final String getNetworkCountryISO() {
        TelephonyManager telephonyManager = getTelephonyManager();
        String networkCountryIso = telephonyManager != null ? telephonyManager.getNetworkCountryIso() : null;
        return networkCountryIso == null ? MaxReward.DEFAULT_LABEL : networkCountryIso;
    }

    public String getOrientation() {
        WindowManager windowManager;
        Display defaultDisplay;
        Context context2 = this.context;
        String str = null;
        Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
        Integer valueOf = (activity == null || (windowManager = activity.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? null : Integer.valueOf(defaultDisplay.getRotation());
        if (valueOf != null && valueOf.intValue() == 0) {
            str = "portrait";
        } else if (valueOf != null && valueOf.intValue() == 1) {
            str = "landscape";
        } else if (valueOf != null && valueOf.intValue() == 2) {
            str = "reversePortrait";
        } else if (valueOf != null && valueOf.intValue() == 3) {
            str = "reverseLandscape";
        }
        if (str != null) {
            return str;
        }
        int i10 = this.context.getResources().getConfiguration().orientation;
        if (i10 == 1) {
            return "portrait";
        }
        if (i10 != 2) {
            return "unknown";
        }
        return "landscape";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        ce.b.a(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.String> getProcessInfo() {
        /*
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r2 = "/proc/self/stat"
            java.lang.String r3 = "r"
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.readLine()     // Catch:{ all -> 0x0023 }
            java.lang.String r3 = "stat"
            java.lang.String r4 = "statContent"
            kotlin.jvm.internal.m.d(r2, r4)     // Catch:{ all -> 0x0023 }
            r0.put(r3, r2)     // Catch:{ all -> 0x0023 }
            sd.w r2 = sd.w.f38141a     // Catch:{ all -> 0x0023 }
            r2 = 0
            ce.b.a(r1, r2)
            return r0
        L_0x0023:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r2 = move-exception
            ce.b.a(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.getProcessInfo():java.util.Map");
    }

    public int getRingerMode() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            return audioManager.getRingerMode();
        }
        return -2;
    }

    public final int getScreenBrightness() {
        return Settings.System.getInt(this.context.getContentResolver(), "screen_brightness", -1);
    }

    public final double getStreamMaxVolume(int i10) {
        AudioManager audioManager = getAudioManager();
        return (double) (audioManager != null ? audioManager.getStreamMaxVolume(i10) : -2);
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    public e<VolumeSettingsChange> getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    public boolean hasInternet() {
        if (Build.VERSION.SDK_INT >= 23) {
            return hasInternetConnectionM();
        }
        return hasInternetConnection();
    }
}
