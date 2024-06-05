package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.icu.util.VersionInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.c;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.x;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

public abstract class zp {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f13958a = {60, 60, 24, 7, 4, 12};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f13959b = {" second", " minute", " hour", " day", " week", " month"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f13960c = {"s", "m", "h", "d", "w", "mth"};

    /* renamed from: d  reason: collision with root package name */
    private static final DecimalFormat f13961d = new DecimalFormat();

    /* renamed from: e  reason: collision with root package name */
    private static Boolean f13962e;

    /* renamed from: f  reason: collision with root package name */
    private static Boolean f13963f;

    /* renamed from: g  reason: collision with root package name */
    private static String f13964g;

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f13965h;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    public interface b {
        void onCachedResourcesChecked(boolean z10);
    }

    public static double a(long j10) {
        return ((double) j10) / 1024.0d;
    }

    public static int a(int i10, int i11) {
        return (i10 < 0 || i10 > 100) ? i11 : i10;
    }

    public static void a() {
    }

    public static boolean a(long j10, long j11) {
        return (j10 & j11) != 0;
    }

    public static boolean a(MaxAdFormat maxAdFormat, MaxAdFormat maxAdFormat2) {
        return (maxAdFormat == null || maxAdFormat2 == null || (maxAdFormat != maxAdFormat2 && (!maxAdFormat.isBannerOrLeaderAd() || !maxAdFormat2.isBannerOrLeaderAd()))) ? false : true;
    }

    public static float b(float f10) {
        return f10 * 1000.0f;
    }

    public static int b(int i10) {
        return i10 * 1024;
    }

    public static long b(long j10) {
        return j10 * 8;
    }

    public static String b(Context context) {
        if (context == null) {
            return null;
        }
        if (StringUtils.isValidString(f13964g)) {
            return f13964g;
        }
        try {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                t.c("Utils", "No running app processes. Unable to determine process name");
                return null;
            }
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (myPid == next.pid) {
                    String str = next.processName;
                    f13964g = str;
                    return str;
                }
            }
            return null;
        } catch (Throwable th) {
            t.b("Utils", "Unable to determine process name", th);
        }
    }

    public static void b() {
    }

    public static double c(long j10) {
        return a(b(j10));
    }

    public static void c() {
    }

    public static double d(long j10) {
        return ((double) j10) / 1000.0d;
    }

    public static Context d(Context context) {
        return j(context) ? context : k.k();
    }

    public static boolean e(Context context) {
        return t0.a(context).a("applovin.sdk.is_test_environment");
    }

    public static int f() {
        return 2015001;
    }

    public static int f(String str) {
        int i10 = 0;
        for (String str2 : str.replaceAll("-beta", ".").split("\\.")) {
            if (str2.length() > 2) {
                t.h("Utils", "Version number components cannot be longer than two digits -> " + str);
                return i10;
            }
            i10 = (i10 * 100) + Integer.parseInt(str2);
        }
        return !str.contains("-beta") ? (i10 * 100) + 99 : i10;
    }

    public static Boolean g(Context context) {
        if (context == null) {
            return null;
        }
        Boolean bool = f13965h;
        if (bool != null) {
            return bool;
        }
        try {
            String a10 = t0.a(context).a();
            String b10 = b(context);
            if (b10 == null) {
                return null;
            }
            if (b10.equals(a10)) {
                Boolean bool2 = Boolean.TRUE;
                f13965h = bool2;
                return bool2;
            } else if (!TextUtils.isEmpty(a10) || !b10.equals(context.getPackageName())) {
                Boolean bool3 = Boolean.FALSE;
                f13965h = bool3;
                return bool3;
            } else {
                Boolean bool4 = Boolean.TRUE;
                f13965h = bool4;
                return bool4;
            }
        } catch (Throwable th) {
            t.b("Utils", "Unable to determine if the current process is the main process", th);
            return null;
        }
    }

    public static boolean h() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean i(Context context) {
        String packageName = context.getPackageName();
        return "com.revolverolver.fliptrickster".equals(packageName) || "com.mindstormstudios.idlemakeover".equals(packageName);
    }

    public static boolean j(Context context) {
        if (context == null) {
            return false;
        }
        try {
            context.getResources();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean k(Context context) {
        if (context == null) {
            context = k.k();
        }
        if (context != null) {
            return t0.a(context).a("applovin.sdk.verbose_logging", false);
        }
        return false;
    }

    public static String l(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (!queryIntentActivities.isEmpty()) {
            return queryIntentActivities.get(0).activityInfo.name;
        }
        return null;
    }

    public static List a(boolean z10, com.applovin.impl.sdk.ad.b bVar, k kVar, Context context) {
        Uri s02;
        if (bVar instanceof bq) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Uri uri : new ArrayList(bVar.i())) {
            if (!kVar.D().b(uri.getLastPathSegment(), context)) {
                kVar.L();
                if (t.a()) {
                    t L = kVar.L();
                    L.b("Utils", "Cached HTML asset missing: " + uri);
                }
                arrayList.add(uri);
            }
        }
        if (z10 && (s02 = bVar.s0()) != null && !kVar.D().b(s02.getLastPathSegment(), context)) {
            kVar.L();
            if (t.a()) {
                t L2 = kVar.L();
                L2.b("Utils", "Cached video missing: " + s02);
            }
            arrayList.add(s02);
        }
        return arrayList;
    }

    public static int c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getRotation();
    }

    public static boolean d(k kVar) {
        String str = kVar.g0().getExtraParameters().get("user_agent_collection_enabled");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return true;
    }

    public static boolean e(k kVar) {
        if (((Boolean) kVar.a(oj.f10450y2)).booleanValue()) {
            return kVar.g0().isMuted();
        }
        return ((Boolean) kVar.a(oj.f10434w2)).booleanValue();
    }

    public static boolean h(Context context) {
        if (f13963f == null) {
            f13963f = Boolean.valueOf("com.applovin.apps.playables".equals(context.getPackageName()));
        }
        return f13963f.booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000a A[Catch:{ all -> 0x002e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean j() {
        /*
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ all -> 0x002e }
        L_0x0004:
            boolean r1 = r0.hasMoreElements()     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.nextElement()     // Catch:{ all -> 0x002e }
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch:{ all -> 0x002e }
            java.lang.String r1 = r1.getDisplayName()     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "tun"
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x002c
            java.lang.String r2 = "ppp"
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x002c
            java.lang.String r2 = "ipsec"
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0004
        L_0x002c:
            r0 = 1
            return r0
        L_0x002e:
            r0 = move-exception
            java.lang.String r1 = "Utils"
            java.lang.String r2 = "Unable to check Network Interfaces"
            com.applovin.impl.sdk.t.c(r1, r2, r0)
        L_0x0036:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.zp.j():boolean");
    }

    public static boolean i() {
        return !a("com.applovin.sdk.AppLovinSdk");
    }

    public static boolean k() {
        Context k10 = k.k();
        if (k10 != null) {
            return t0.a(k10).a("applovin.sdk.verbose_logging");
        }
        return false;
    }

    public static boolean c(String str) {
        return str != null && (str.contains("applovin.com") || str.contains("applvn.com"));
    }

    public static boolean c(k kVar) {
        String str = kVar.g0().getExtraParameters().get("run_in_release_mode");
        if ((!StringUtils.isValidString(str) || !Boolean.parseBoolean(str)) && (k.k().getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static long d(String str) {
        if (!StringUtils.isValidString(str)) {
            return Long.MAX_VALUE;
        }
        try {
            return (long) Color.parseColor(str);
        } catch (Throwable unused) {
            return Long.MAX_VALUE;
        }
    }

    public static String e(String str) {
        return (str == null || str.length() <= 4) ? "NOKEY" : str.substring(str.length() - 4);
    }

    public static byte[] d(byte[] bArr) {
        if (bArr == null || bArr.length == 0 || !b(bArr)) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr2);
            if (read > 0) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static String e() {
        try {
            for (Field field : Build.VERSION_CODES.class.getFields()) {
                if (field.getInt((Object) null) == Build.VERSION.SDK_INT) {
                    return field.getName();
                }
            }
            return MaxReward.DEFAULT_LABEL;
        } catch (Throwable th) {
            t.c("Utils", "Unable to get Android SDK codename", th);
            return MaxReward.DEFAULT_LABEL;
        }
    }

    public static boolean f(Context context) {
        if (f13962e == null) {
            f13962e = Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
        }
        return f13962e.booleanValue();
    }

    public static long c(float f10) {
        return a(b(f10));
    }

    public static String b(Class cls, String str) {
        try {
            Field a10 = a(cls, str);
            a10.setAccessible(true);
            return (String) a10.get((Object) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long c(byte[] bArr) {
        return a(bArr, 0);
    }

    public static boolean g() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable th) {
            t.c("Utils", "Exception thrown while getting memory state.", th);
        }
        int i10 = runningAppProcessInfo.importance;
        return i10 == 100 || i10 == 200;
    }

    public static void a(boolean z10, com.applovin.impl.sdk.ad.b bVar, k kVar, Context context, b bVar2) {
        kVar.l0().a((xl) new kn(kVar, "checkIfAdContainsUnavailableCachedResources", new n90(new WeakReference(bVar2), bVar, kVar, context, z10)));
    }

    public static String b(String str) {
        return str.replace("ALPlayableAnalytics.trackEvent = ", "ALPlayableAnalytics.trackEvent = function (eventName) {const SDK_URL = 'applovin://com.applovin.sdk/playable_event';if (!Object.values(ALPlayableEvent).includes(eventName)) {var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=0&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();return;}var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=1&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();}; ALPlayableAnalytics.trackEvent_ignore = ");
    }

    public static boolean b(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 31 && bArr[1] == -117;
    }

    public static String d() {
        try {
            return Build.VERSION.RELEASE + " (" + e() + " - API " + Build.VERSION.SDK_INT + ")";
        } catch (Throwable th) {
            t.c("Utils", "Unable to get Android OS info", th);
            return MaxReward.DEFAULT_LABEL;
        }
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void b(String str, String str2) {
        if (str != null && str.length() > b(8)) {
            t.j(str2, "Provided custom data parameter longer than supported (" + str.length() + " bytes, " + b(8) + " maximum)");
        }
    }

    public static boolean a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (a((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static WebView b(Context context, String str) {
        return a(context, str, false);
    }

    public static void b(AppLovinAd appLovinAd, k kVar) {
        if (appLovinAd instanceof AppLovinAdBase) {
            String d02 = kVar.d0();
            String d03 = ((AppLovinAdBase) appLovinAd).getSdk().d0();
            if (!d02.equals(d03)) {
                t.h("AppLovinAd", "Ad was loaded from sdk with key: " + d03 + ", but is being rendered from sdk with key: " + d02);
                kVar.F().c(aa.f6355q);
            }
        }
    }

    public static void a(Closeable closeable, k kVar) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                if (kVar != null) {
                    kVar.L();
                    if (t.a()) {
                        t L = kVar.L();
                        L.a("Utils", "Unable to close stream: " + closeable, th);
                    }
                }
            }
        }
    }

    public static int a(String str, String str2) {
        String digitsOnlyVersionString = StringUtils.toDigitsOnlyVersionString(str);
        String digitsOnlyVersionString2 = StringUtils.toDigitsOnlyVersionString(str2);
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                int compareTo = VersionInfo.getInstance(digitsOnlyVersionString).compareTo(VersionInfo.getInstance(digitsOnlyVersionString2));
                if (compareTo == 0) {
                    return compareTo;
                }
                if (compareTo > 0) {
                    return 1;
                }
                return -1;
            }
            String[] split = digitsOnlyVersionString.split("\\.");
            String[] split2 = digitsOnlyVersionString2.split("\\.");
            int max = Math.max(split.length, split2.length);
            int i10 = 0;
            while (i10 < max) {
                String str3 = "0";
                String str4 = StringUtils.isValidString(split[i10]) ? split[i10] : str3;
                if (StringUtils.isValidString(split2[i10])) {
                    str3 = split2[i10];
                }
                int parseInt = i10 < split.length ? Integer.parseInt(str4) : 0;
                int parseInt2 = i10 < split2.length ? Integer.parseInt(str3) : 0;
                if (parseInt < parseInt2) {
                    return -1;
                }
                if (parseInt > parseInt2) {
                    return 1;
                }
                i10++;
            }
            return 0;
        } catch (Throwable th) {
            t.c("Utils", "Failed to process version string.", th);
            return 0;
        }
    }

    public static boolean b(k kVar) {
        if (!x3.e()) {
            return true;
        }
        try {
            JSONObject.wrap(JSONObject.NULL);
            return true;
        } catch (Throwable th) {
            kVar.L();
            if (!t.a()) {
                return false;
            }
            kVar.L().d("Utils", "Failed to wrap JSONObject with exception", th);
            return false;
        }
    }

    public static boolean b(List list) {
        Context k10 = k.k();
        if (k10 != null) {
            return list.contains(k10.getPackageName());
        }
        t.h("Utils", "Failed to check whether or not app is member of package names");
        return false;
    }

    public static void a(HttpURLConnection httpURLConnection, k kVar) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                if (kVar != null) {
                    kVar.L();
                    if (t.a()) {
                        t L = kVar.L();
                        L.a("Utils", "Unable to disconnect connection: " + httpURLConnection, th);
                    }
                }
            }
        }
    }

    public static String a(Map map, boolean z10) {
        if (map == null || map.isEmpty()) {
            return MaxReward.DEFAULT_LABEL;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            TreeMap treeMap = new TreeMap(new a());
            treeMap.putAll(map);
            map = treeMap;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) value;
                if (str.contains("&")) {
                    value = str.replace("&", "%26");
                }
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(value);
        }
        return sb2.toString();
    }

    private static long a(float f10) {
        return (long) Math.round(f10);
    }

    private static List a(List list, k kVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                arrayList.add(Class.forName(str));
            } catch (ClassNotFoundException unused) {
                kVar.L();
                if (t.a()) {
                    t L = kVar.L();
                    L.b("Utils", "Failed to create class for name: " + str);
                }
            }
        }
        return arrayList;
    }

    public static String a(Object obj) {
        if (obj instanceof be) {
            return ((be) obj).Q();
        }
        if (ve.b(obj)) {
            return ((com.applovin.impl.sdk.ad.b) obj).H();
        }
        return null;
    }

    public static int a(Context context) {
        x3.d();
        return Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0);
    }

    public static String a(kh khVar, k kVar) {
        if (khVar == null) {
            return "Unknown error";
        }
        Throwable cause = khVar.getCause();
        String message = cause != null ? cause.getMessage() : "Unknown";
        String name = cause != null ? cause.getClass().getName() : MaxReward.DEFAULT_LABEL;
        return "Code: " + khVar.f9014a + ", Name: " + khVar.a() + ", Message: " + khVar.getMessage() + ", Cause Class: " + name + ", Cause Message: " + message;
    }

    public static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return a(superclass, str);
        }
    }

    public static String a(Uri uri, String str, k kVar) {
        List c10 = kVar.c(oj.f10259a1);
        String lastPathSegment = uri.getLastPathSegment();
        if (c10.contains(lastPathSegment)) {
            return lastPathSegment;
        }
        ArrayList arrayList = new ArrayList();
        for (String queryParameter : uri.getQueryParameterNames()) {
            String queryParameter2 = uri.getQueryParameter(queryParameter);
            if (StringUtils.isValidString(queryParameter2)) {
                arrayList.add(queryParameter2);
            }
        }
        arrayList.addAll(uri.getPathSegments());
        String encodeUriString = StringUtils.encodeUriString(TextUtils.join("_", arrayList));
        Integer num = (Integer) kVar.a(oj.f10266b1);
        int length = StringUtils.emptyIfNull(encodeUriString).length() + StringUtils.emptyIfNull(str).length();
        if (length > num.intValue() && StringUtils.isValidString(encodeUriString)) {
            encodeUriString = encodeUriString.substring(length - num.intValue());
        }
        if (!StringUtils.isValidString(encodeUriString) || !StringUtils.isValidString(str)) {
            return encodeUriString;
        }
        return str + encodeUriString;
    }

    public static ActivityManager.MemoryInfo a(ActivityManager activityManager) {
        if (activityManager == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Throwable th) {
            t.b("Utils", "Unable to collect memory info.", th);
            return null;
        }
    }

    public static Map a(AppLovinSdkSettings appLovinSdkSettings) {
        try {
            Field a10 = a((Class) appLovinSdkSettings.getClass(), "metaData");
            if (a10 != null) {
                a10.setAccessible(true);
            }
            return (Map) a10.get(appLovinSdkSettings);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List a(JSONObject jSONObject, String str, String str2, k kVar) {
        return a(jSONObject, str, (Map) null, str2, (Map) null, false, kVar);
    }

    public static List a(JSONObject jSONObject, String str, Map map, String str2, Map map2, boolean z10, k kVar) {
        if (map == null) {
            map = new HashMap(1);
        }
        Map map3 = map;
        map3.put("{CLCODE}", str);
        return a(jSONObject, map3, str2, map2, z10, kVar);
    }

    public static List a(JSONObject jSONObject, Map map, String str, Map map2, boolean z10, k kVar) {
        ArrayList arrayList = new ArrayList(jSONObject.length() + 1);
        if (StringUtils.isValidString(str)) {
            arrayList.add(new s(str, (String) null, map2, z10));
        }
        if (jSONObject.length() <= 0) {
            return arrayList;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    String optString = jSONObject.optString(next);
                    String replace = StringUtils.replace(next, map);
                    if (AppLovinSdkUtils.isValidString(optString)) {
                        optString = StringUtils.replace(optString, map);
                    }
                    arrayList.add(new s(replace, optString, map2, z10));
                }
            } catch (Throwable th) {
                kVar.L();
                if (t.a()) {
                    kVar.L().a("Utils", "Failed to create and add postback url.", th);
                }
            }
        }
        return arrayList;
    }

    public static String a(long j10, boolean z10) {
        String[] strArr = z10 ? f13959b : f13960c;
        long currentTimeMillis = (System.currentTimeMillis() - j10) / 1000;
        int i10 = 0;
        while (i10 < strArr.length) {
            long j11 = (long) f13958a[i10];
            if (currentTimeMillis >= j11) {
                currentTimeMillis /= j11;
                i10++;
            } else if (currentTimeMillis <= 0) {
                return z10 ? "just now" : "now";
            } else {
                String str = MaxReward.DEFAULT_LABEL;
                String str2 = (!z10 || currentTimeMillis <= 1) ? str : "s";
                if (z10) {
                    str = " ago";
                }
                return String.format("%d%s%s%s", new Object[]{Long.valueOf(currentTimeMillis), strArr[i10], str2, str});
            }
        }
        return z10 ? "just now" : "now";
    }

    public static String a(int i10, Context context, k kVar) {
        if (i10 == 0) {
            return MaxReward.DEFAULT_LABEL;
        }
        try {
            InputStream openRawResource = context.getResources().openRawResource(i10);
            try {
                byte[] bArr = new byte[openRawResource.available()];
                openRawResource.read(bArr);
                return new String(bArr);
            } catch (IOException e10) {
                if (kVar != null) {
                    kVar.L();
                    if (t.a()) {
                        kVar.L().a("Utils", "Opening raw resource file threw exception", e10);
                    }
                }
                return MaxReward.DEFAULT_LABEL;
            } finally {
                a((Closeable) openRawResource, kVar);
            }
        } catch (Throwable th) {
            if (kVar != null) {
                kVar.L();
                if (t.a()) {
                    t L = kVar.L();
                    L.a("Utils", "Failed to retrieve resource " + i10, th);
                }
            }
            return MaxReward.DEFAULT_LABEL;
        }
    }

    public static long a(k kVar) {
        long longValue = ((Long) kVar.a(oj.E5)).longValue();
        long longValue2 = ((Long) kVar.a(oj.F5)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        return (longValue <= 0 || longValue2 <= 0) ? currentTimeMillis : currentTimeMillis + (longValue - longValue2);
    }

    public static boolean a(Integer num) {
        if (num.intValue() <= 0 || num.intValue() > 100 || ((int) (Math.random() * 100.0d)) + 1 > num.intValue()) {
            return false;
        }
        return true;
    }

    public static int a(int i10) {
        return a(i10, 95);
    }

    public static h0 a(JSONObject jSONObject, k kVar) {
        return h0.a(AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", (String) null)), AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", (String) null)), JsonUtils.getString(jSONObject, "zone_id", (String) null), true, JsonUtils.getBoolean(jSONObject, "is_direct_sold", Boolean.FALSE).booleanValue());
    }

    public static byte[] a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean a(AppLovinAdSize appLovinAdSize) {
        return appLovinAdSize == AppLovinAdSize.BANNER || appLovinAdSize == AppLovinAdSize.MREC || appLovinAdSize == AppLovinAdSize.LEADER;
    }

    public static boolean a(String str, List list) {
        return StringUtils.startsWithAtLeastOnePrefix(str, list);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(WeakReference weakReference, com.applovin.impl.sdk.ad.b bVar, k kVar, Context context, boolean z10) {
        b bVar2 = (b) weakReference.get();
        if (bVar2 != null) {
            if (bVar instanceof bq) {
                AppLovinSdkUtils.runOnUiThread(new m90(bVar2));
                return;
            }
            for (Uri uri : new ArrayList(bVar.i())) {
                if (!kVar.D().c(uri.getLastPathSegment(), context)) {
                    kVar.L();
                    if (t.a()) {
                        t L = kVar.L();
                        L.b("Utils", "Cached HTML asset unavailable: " + uri);
                    }
                    AppLovinSdkUtils.runOnUiThread(new l90(bVar2));
                    return;
                }
            }
            if (z10) {
                Uri s02 = bVar.s0();
                if (!kVar.D().c(s02.getLastPathSegment(), context)) {
                    kVar.L();
                    if (t.a()) {
                        t L2 = kVar.L();
                        L2.b("Utils", "Cached video unavailable: " + s02);
                    }
                    AppLovinSdkUtils.runOnUiThread(new k90(bVar2));
                    return;
                }
            }
            AppLovinSdkUtils.runOnUiThread(new j90(bVar2));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, String str) {
        Toast makeText = Toast.makeText(context, str, 0);
        makeText.setMargin(0.0f, 0.1f);
        makeText.show();
    }

    public static void a(String str, MaxAdFormat maxAdFormat, JSONObject jSONObject, k kVar) {
        if (jSONObject.has("no_fill_reason")) {
            Object object = JsonUtils.getObject(jSONObject, "no_fill_reason", new Object());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\n**************************************************\nNO FILL received:\n..ID: \"");
            sb2.append(str);
            sb2.append("\"\n..FORMAT: \"");
            sb2.append(maxAdFormat != null ? maxAdFormat.getLabel() : "None");
            sb2.append("\"\n..SDK KEY: \"");
            sb2.append(kVar.d0());
            sb2.append("\"\n..PACKAGE NAME: \"");
            sb2.append(k.k().getPackageName());
            sb2.append("\"\n..Reason: ");
            sb2.append(object);
            sb2.append("\n**************************************************\n");
            String sb3 = sb2.toString();
            kVar.L();
            if (t.a()) {
                kVar.L().b("AppLovinSdk", sb3);
            }
        }
    }

    public static AppLovinAd a(AppLovinAd appLovinAd, k kVar) {
        if (!(appLovinAd instanceof c)) {
            return appLovinAd;
        }
        c cVar = (c) appLovinAd;
        AppLovinAd dequeueAd = kVar.i().dequeueAd(cVar.getAdZone());
        kVar.L();
        if (t.a()) {
            t L = kVar.L();
            L.a("Utils", "Dequeued ad for dummy ad: " + dequeueAd);
        }
        if (dequeueAd == null) {
            return cVar.e();
        }
        cVar.a(dequeueAd);
        ((AppLovinAdImpl) dequeueAd).setDummyAd(cVar);
        return dequeueAd;
    }

    public static boolean a(Object obj, List list, k kVar) {
        if (list == null) {
            return false;
        }
        for (Class isInstance : a(list, kVar)) {
            if (isInstance.isInstance(obj)) {
                if (obj instanceof Map) {
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        if (!(entry.getKey() instanceof String)) {
                            kVar.L();
                            if (t.a()) {
                                kVar.L().a("Utils", "Invalid key type used. Map keys should be of type String.");
                            }
                            return false;
                        } else if (!a(entry.getValue(), list, kVar)) {
                            return false;
                        }
                    }
                    return true;
                } else if (!(obj instanceof List)) {
                    return true;
                } else {
                    for (Object a10 : (List) obj) {
                        if (!a(a10, list, kVar)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        kVar.L();
        if (t.a()) {
            t L = kVar.L();
            L.a("Utils", "Object '" + obj + "' does not match any of the required types '" + list + "'.");
        }
        return false;
    }

    public static void a(String str, String str2, Map map) {
        if (map.containsKey(str)) {
            map.put(str2, map.get(str));
            map.remove(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009a, code lost:
        r4 = ((java.lang.Integer) r5.a(com.applovin.impl.oj.U0)).intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object a(java.lang.Object r4, com.applovin.impl.sdk.k r5) {
        /*
            boolean r0 = r4 instanceof java.util.Map
            if (r0 == 0) goto L_0x003f
            java.util.Map r4 = (java.util.Map) r4
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0017:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x003e
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x002e
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0032
        L_0x002e:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L_0x0032:
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r1 = a((java.lang.Object) r1, (com.applovin.impl.sdk.k) r5)
            r0.put(r2, r1)
            goto L_0x0017
        L_0x003e:
            return r0
        L_0x003f:
            boolean r0 = r4 instanceof java.util.List
            if (r0 == 0) goto L_0x0065
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L_0x0052:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r4.next()
            java.lang.Object r1 = a((java.lang.Object) r1, (com.applovin.impl.sdk.k) r5)
            r0.add(r1)
            goto L_0x0052
        L_0x0064:
            return r0
        L_0x0065:
            boolean r0 = r4 instanceof java.util.Date
            if (r0 == 0) goto L_0x0074
            java.util.Date r4 = (java.util.Date) r4
            long r4 = r4.getTime()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
        L_0x0074:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            boolean r1 = r4 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto L_0x0096
            com.applovin.impl.oj r4 = com.applovin.impl.oj.T0
            java.lang.Object r4 = r5.a((com.applovin.impl.oj) r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 <= 0) goto L_0x00b2
            int r5 = r0.length()
            if (r5 <= r4) goto L_0x00b2
            java.lang.String r0 = r0.substring(r2, r4)
            goto L_0x00b2
        L_0x0096:
            boolean r4 = r4 instanceof android.net.Uri
            if (r4 == 0) goto L_0x00b2
            com.applovin.impl.oj r4 = com.applovin.impl.oj.U0
            java.lang.Object r4 = r5.a((com.applovin.impl.oj) r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 <= 0) goto L_0x00b2
            int r5 = r0.length()
            if (r5 <= r4) goto L_0x00b2
            java.lang.String r0 = r0.substring(r2, r4)
        L_0x00b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.zp.a(java.lang.Object, com.applovin.impl.sdk.k):java.lang.Object");
    }

    public static boolean a(oj ojVar, k kVar) {
        String str = kVar.g0().getExtraParameters().get("enable_black_screen_fixes");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return ((Boolean) kVar.a(ojVar)).booleanValue();
    }

    public static void a(MaxError maxError, String str, Context context) {
        StringBuilder sb2 = new StringBuilder();
        if (maxError.getCode() == -5001) {
            for (MaxNetworkResponseInfo next : maxError.getWaterfall().getNetworkResponses()) {
                MaxError error = next.getError();
                String name = next.getMediatedNetwork().getName();
                sb2.append("\nFailed to load " + str + " from " + name + ":\n");
                sb2.append("\nMAX Error " + error.getCode() + ": " + error.getMessage() + "\n");
                sb2.append("\n" + name + " Error " + error.getMediatedNetworkErrorCode() + ": " + error.getMediatedNetworkErrorMessage() + "\n\n");
            }
        } else {
            sb2.append("Failed to load " + str + " with error " + maxError.getCode() + ": " + maxError.getMessage());
        }
        a(MaxReward.DEFAULT_LABEL, sb2.toString(), context);
    }

    public static void a(String str, Context context) {
        AppLovinSdkUtils.runOnUiThread(new i90(context, str));
    }

    public static void a(String str, MaxAd maxAd, Context context) {
        Toast.makeText(context, maxAd.getFormat().getLabel() + ": " + str, 1).show();
    }

    public static void a(Uri uri, Activity activity, k kVar) {
        if (activity == null) {
            activity = kVar.p0();
        }
        Intent intent = new Intent(activity, AppLovinWebViewActivity.class);
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, kVar.d0());
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, uri.toString());
        activity.startActivity(intent);
    }

    public static Map a(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                hashMap.put((String) entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return hashMap;
    }

    public static long a(byte[] bArr, int i10) {
        int i11 = i10 + 8;
        if (bArr.length >= i11) {
            long j10 = 0;
            while (i10 < i11) {
                j10 |= (((long) bArr[i10]) & 255) << (i10 * 8);
                i10++;
            }
            return j10;
        }
        throw new IllegalArgumentException("byte array must be at least 8 bytes long");
    }

    public static Map a(Map map, k kVar) {
        Map map2 = CollectionUtils.map(map);
        for (String str : map2.keySet()) {
            String str2 = (String) map2.get(str);
            if (str2 != null) {
                map2.put(str, StringUtils.encodeUriString(str2));
            }
        }
        return map2;
    }

    public static double a(String str, double d10) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable th) {
            t.c("Utils", "Failed to parse double from String: " + str, th);
            return d10;
        }
    }

    public static WebView a(Context context, String str, boolean z10) {
        try {
            WebView webView = new WebView(context);
            if (z10) {
                webView.setWebViewClient(new x());
            }
            return webView;
        } catch (Throwable th) {
            t.c("Utils", "Failed to initialize WebView for " + str + ".", th);
            return null;
        }
    }

    public static void a(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        thread.start();
    }

    public static void a(String str, String str2, Context context) {
        new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(17039370, (DialogInterface.OnClickListener) null).create().show();
    }

    public static String a(double d10, int i10) {
        DecimalFormat decimalFormat = f13961d;
        decimalFormat.setMaximumFractionDigits(i10);
        return decimalFormat.format(d10);
    }
}
