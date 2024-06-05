package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t0;
import com.applovin.impl.ve;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static AppLovinSdk instance;
    private static final Object instanceLock = new Object();
    private static final Map<String, AppLovinSdk> sdkInstances = new HashMap(1);
    private static final Object sdkInstancesLock = new Object();
    private final k coreSdk;

    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    private static class a extends AppLovinSdkSettings {
        a(Context context) {
            super(context);
        }
    }

    private AppLovinSdk(k kVar) {
        this.coreSdk = kVar;
    }

    public static AppLovinSdk getInstance(Context context) {
        AppLovinSdk appLovinSdk;
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        } else if (t0.a(context).a("applovin.sdk.key", (String) null) != null) {
            return getInstance(new a(context), context);
        } else {
            synchronized (instanceLock) {
                if (instance == null) {
                    k kVar = new k(context);
                    AppLovinSdk appLovinSdk2 = new AppLovinSdk(kVar);
                    kVar.a(appLovinSdk2);
                    instance = appLovinSdk2;
                }
                appLovinSdk = instance;
            }
            return appLovinSdk;
        }
    }

    private static Collection<AppLovinSdk> getInstances() {
        Collection<AppLovinSdk> values;
        AppLovinSdk appLovinSdk = instance;
        if (appLovinSdk != null) {
            return Arrays.asList(new AppLovinSdk[]{appLovinSdk});
        }
        synchronized (sdkInstancesLock) {
            values = sdkInstances.values();
        }
        return values;
    }

    private static String getVersion() {
        return "12.5.0";
    }

    private static int getVersionCode() {
        return 12050099;
    }

    private void reinitialize(Boolean bool, Boolean bool2, Boolean bool3) {
        this.coreSdk.S0();
        this.coreSdk.P0();
        if (bool != null) {
            this.coreSdk.L();
            if (t.a()) {
                t L = this.coreSdk.L();
                L.d(TAG, "Toggled 'huc' to " + bool);
            }
            getEventService().trackEvent("huc", CollectionUtils.map("value", bool.toString()));
        }
        if (bool2 != null) {
            this.coreSdk.L();
            if (t.a()) {
                t L2 = this.coreSdk.L();
                L2.d(TAG, "Toggled 'aru' to " + bool2);
            }
            getEventService().trackEvent("aru", CollectionUtils.map("value", bool2.toString()));
        }
        if (bool3 != null) {
            this.coreSdk.L();
            if (t.a()) {
                t L3 = this.coreSdk.L();
                L3.d(TAG, "Toggled 'dns' to " + bool3);
            }
            getEventService().trackEvent("dns", CollectionUtils.map("value", bool3.toString()));
        }
    }

    static void reinitializeAll(Boolean bool, Boolean bool2, Boolean bool3) {
        synchronized (sdkInstancesLock) {
            for (AppLovinSdk reinitialize : getInstances()) {
                reinitialize.reinitialize(bool, bool2, bool3);
            }
        }
    }

    public k a() {
        return this.coreSdk;
    }

    public AppLovinAdService getAdService() {
        return this.coreSdk.i();
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        JSONArray a10 = ve.a(this.coreSdk);
        ArrayList arrayList = new ArrayList(a10.length());
        for (int i10 = 0; i10 < a10.length(); i10++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(a10, i10, (JSONObject) null)));
        }
        return arrayList;
    }

    public AppLovinCmpService getCmpService() {
        return this.coreSdk.n();
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.q();
    }

    public AppLovinEventService getEventService() {
        return this.coreSdk.C();
    }

    public String getMediationProvider() {
        return this.coreSdk.Q();
    }

    @Deprecated
    public AppLovinPostbackService getPostbackService() {
        return this.coreSdk.a0();
    }

    public String getSdkKey() {
        return this.coreSdk.d0();
    }

    public AppLovinSdkSettings getSettings() {
        return this.coreSdk.g0();
    }

    public AppLovinTargetingData getTargetingData() {
        return this.coreSdk.j0();
    }

    @Deprecated
    public String getUserIdentifier() {
        return this.coreSdk.q0();
    }

    public AppLovinUserSegment getUserSegment() {
        return this.coreSdk.r0();
    }

    public AppLovinUserService getUserService() {
        return this.coreSdk.s0();
    }

    public void initialize(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.a(appLovinSdkInitializationConfiguration, sdkInitializationListener);
    }

    @Deprecated
    public void initializeSdk() {
    }

    @Deprecated
    public void initializeSdk(SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.a(sdkInitializationListener);
    }

    public boolean isInitialized() {
        return this.coreSdk.y0();
    }

    @Deprecated
    public void setMediationProvider(String str) {
        this.coreSdk.e(str);
    }

    @Deprecated
    public void setPluginVersion(String str) {
        this.coreSdk.f(str);
    }

    @Deprecated
    public void setUserIdentifier(String str) {
        this.coreSdk.g(str);
    }

    public void showCreativeDebugger() {
        this.coreSdk.W0();
    }

    public void showMediationDebugger() {
        this.coreSdk.X0();
    }

    public String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isInitialized=" + isInitialized() + ", isFirstSession=" + this.coreSdk.z0() + '}';
    }

    @Deprecated
    public static void initializeSdk(Context context) {
        initializeSdk(context, (SdkInitializationListener) null);
    }

    public void showMediationDebugger(Map<String, List<?>> map) {
        this.coreSdk.a((Map) map);
    }

    @Deprecated
    public static void initializeSdk(Context context, SdkInitializationListener sdkInitializationListener) {
        if (context != null) {
            AppLovinSdk instance2 = getInstance(context);
            if (instance2 != null) {
                instance2.initializeSdk(sdkInitializationListener);
            } else {
                t.h(TAG, "Unable to initialize AppLovin SDK: SDK object not created");
            }
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    @Deprecated
    public static AppLovinSdk getInstance(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (context != null) {
            return getInstance(t0.a(context).a("applovin.sdk.key", MaxReward.DEFAULT_LABEL), appLovinSdkSettings, context);
        }
        throw new IllegalArgumentException("No context specified");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        r1 = sdkInstancesLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0 = sdkInstances;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
        if (r0.containsKey(r5) == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
        r5 = r0.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        r2 = java.io.File.separator;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r5.contains(r2) == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        com.applovin.impl.sdk.t.h(TAG, "\n**************************************************\nINVALID SDK KEY: " + r5 + "\n**************************************************\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        if (r0.isEmpty() != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        r5 = r0.values().iterator().next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006b, code lost:
        r5 = r5.replace(r2, com.applovin.mediation.MaxReward.DEFAULT_LABEL);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        r2 = new com.applovin.impl.sdk.k(r7);
        r2.a(r5, r6);
        r7 = new com.applovin.sdk.AppLovinSdk(r2);
        r2.a(r7);
        r6.attachAppLovinSdk(r2);
        r0.put(r5, r7);
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        return r5;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.applovin.sdk.AppLovinSdk getInstance(java.lang.String r5, com.applovin.sdk.AppLovinSdkSettings r6, android.content.Context r7) {
        /*
            if (r6 == 0) goto L_0x0098
            if (r7 == 0) goto L_0x0090
            java.lang.Object r0 = instanceLock
            monitor-enter(r0)
            com.applovin.sdk.AppLovinSdk r1 = instance     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x0019
            java.lang.String r1 = r1.getSdkKey()     // Catch:{ all -> 0x008d }
            boolean r1 = r5.equals(r1)     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x0019
            com.applovin.sdk.AppLovinSdk r5 = instance     // Catch:{ all -> 0x008d }
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            return r5
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            java.lang.Object r1 = sdkInstancesLock
            monitor-enter(r1)
            java.util.Map<java.lang.String, com.applovin.sdk.AppLovinSdk> r0 = sdkInstances     // Catch:{ all -> 0x008a }
            boolean r2 = r0.containsKey(r5)     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x002c
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x008a }
            com.applovin.sdk.AppLovinSdk r5 = (com.applovin.sdk.AppLovinSdk) r5     // Catch:{ all -> 0x008a }
            goto L_0x0088
        L_0x002c:
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x008a }
            if (r2 != 0) goto L_0x0071
            java.lang.String r2 = java.io.File.separator     // Catch:{ all -> 0x008a }
            boolean r3 = r5.contains(r2)     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0071
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r3.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r4 = "\n**************************************************\nINVALID SDK KEY: "
            r3.append(r4)     // Catch:{ all -> 0x008a }
            r3.append(r5)     // Catch:{ all -> 0x008a }
            java.lang.String r4 = "\n**************************************************\n"
            r3.append(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x008a }
            java.lang.String r4 = "AppLovinSdk"
            com.applovin.impl.sdk.t.h(r4, r3)     // Catch:{ all -> 0x008a }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x008a }
            if (r3 != 0) goto L_0x006b
            java.util.Collection r5 = r0.values()     // Catch:{ all -> 0x008a }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x008a }
            java.lang.Object r5 = r5.next()     // Catch:{ all -> 0x008a }
            com.applovin.sdk.AppLovinSdk r5 = (com.applovin.sdk.AppLovinSdk) r5     // Catch:{ all -> 0x008a }
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            return r5
        L_0x006b:
            java.lang.String r3 = ""
            java.lang.String r5 = r5.replace(r2, r3)     // Catch:{ all -> 0x008a }
        L_0x0071:
            com.applovin.impl.sdk.k r2 = new com.applovin.impl.sdk.k     // Catch:{ all -> 0x008a }
            r2.<init>(r7)     // Catch:{ all -> 0x008a }
            r2.a((java.lang.String) r5, (com.applovin.sdk.AppLovinSdkSettings) r6)     // Catch:{ all -> 0x008a }
            com.applovin.sdk.AppLovinSdk r7 = new com.applovin.sdk.AppLovinSdk     // Catch:{ all -> 0x008a }
            r7.<init>(r2)     // Catch:{ all -> 0x008a }
            r2.a((com.applovin.sdk.AppLovinSdk) r7)     // Catch:{ all -> 0x008a }
            r6.attachAppLovinSdk(r2)     // Catch:{ all -> 0x008a }
            r0.put(r5, r7)     // Catch:{ all -> 0x008a }
            r5 = r7
        L_0x0088:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            return r5
        L_0x008a:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            throw r5
        L_0x008d:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            throw r5
        L_0x0090:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "No context specified"
            r5.<init>(r6)
            throw r5
        L_0x0098:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "No userSettings specified"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.sdk.AppLovinSdk.getInstance(java.lang.String, com.applovin.sdk.AppLovinSdkSettings, android.content.Context):com.applovin.sdk.AppLovinSdk");
    }
}
