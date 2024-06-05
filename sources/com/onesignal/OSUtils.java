package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadSystemException;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.core.app.h;
import androidx.core.app.o;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.location.LocationListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.location.LocationCallback;
import com.onesignal.k3;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSUtils {

    /* renamed from: a  reason: collision with root package name */
    public static int f27517a = 3;

    /* renamed from: b  reason: collision with root package name */
    static final int[] f27518b = {401, 402, 403, 404, 410};

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27519a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.onesignal.OSUtils$b[] r0 = com.onesignal.OSUtils.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27519a = r0
                com.onesignal.OSUtils$b r1 = com.onesignal.OSUtils.b.DATA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27519a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.OSUtils$b r1 = com.onesignal.OSUtils.b.HTTPS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27519a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onesignal.OSUtils$b r1 = com.onesignal.OSUtils.b.HTTP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSUtils.a.<clinit>():void");
        }
    }

    public enum b {
        DATA(JsonStorageKeyNames.DATA_KEY),
        HTTPS(HttpRequest.DEFAULT_SCHEME),
        HTTP("http");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f27524a;

        private b(String str) {
            this.f27524a = str;
        }

        public static b a(String str) {
            for (b bVar : values()) {
                if (bVar.f27524a.equalsIgnoreCase(str)) {
                    return bVar;
                }
            }
            return null;
        }
    }

    OSUtils() {
    }

    static boolean B() {
        return new OSUtils().e() == 1;
    }

    static boolean C() {
        return new OSUtils().e() == 2;
    }

    static boolean D() {
        return Q("com.google.android.gms");
    }

    private static boolean E() {
        try {
            if (HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(k3.f27912f) == 0) {
                return true;
            }
            return false;
        } catch (Exception e10) {
            if (e10 instanceof DeadSystemException) {
                return false;
            }
            throw e10;
        }
    }

    private static boolean F() {
        return Q("com.huawei.hwid");
    }

    static boolean G() {
        return new OSUtils().e() == 13;
    }

    static boolean H() {
        return Thread.currentThread().equals(Looper.getMainLooper().getThread());
    }

    static boolean I(String str) {
        return !TextUtils.isEmpty(str);
    }

    static boolean J(String str) {
        if (str == null) {
            return false;
        }
        return Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(str).matches();
    }

    static boolean K(String str) {
        return str != null && !str.matches("^[0-9]");
    }

    static <T> Set<T> L() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    static Set<String> M(JSONArray jSONArray) throws JSONException {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            hashSet.add(jSONArray.getString(i10));
        }
        return hashSet;
    }

    private static void N(Uri uri) {
        k3.f27912f.startActivity(P(uri));
    }

    static void O(String str) {
        N(Uri.parse(str.trim()));
    }

    static Intent P(Uri uri) {
        Intent intent;
        b a10 = uri.getScheme() != null ? b.a(uri.getScheme()) : null;
        if (a10 == null) {
            a10 = b.HTTP;
            if (!uri.toString().contains("://")) {
                uri = Uri.parse("http://" + uri.toString());
            }
        }
        if (a.f27519a[a10.ordinal()] != 1) {
            intent = new Intent("android.intent.action.VIEW", uri);
        } else {
            intent = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            intent.setData(uri);
        }
        intent.addFlags(268435456);
        return intent;
    }

    private static boolean Q(String str) {
        PackageInfo a10;
        y a11 = z3.f28487a.a(k3.f27912f, str, 128);
        if (a11.b() && (a10 = a11.a()) != null) {
            return a10.applicationInfo.enabled;
        }
        return false;
    }

    static long[] R(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            Object opt = jSONObject.opt("vib_pt");
            if (opt instanceof String) {
                jSONArray = new JSONArray((String) opt);
            } else {
                jSONArray = (JSONArray) opt;
            }
            long[] jArr = new long[jSONArray.length()];
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                jArr[i10] = jSONArray.optLong(i10);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    static void S(Runnable runnable, int i10) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, (long) i10);
    }

    static void T(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static boolean U(String str) {
        if (str != null) {
            return false;
        }
        k3.a(k3.r0.INFO, "OneSignal was not initialized, ensure to always initialize OneSignal from the onCreate of your Application class.");
        return true;
    }

    public static boolean V(int i10) {
        for (int i11 : f27518b) {
            if (i10 == i11) {
                return false;
            }
        }
        return true;
    }

    static void W(int i10) {
        try {
            Thread.sleep((long) i10);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }

    static void X(Thread thread) {
        boolean z10 = false;
        while (!z10) {
            try {
                thread.start();
                z10 = true;
            } catch (OutOfMemoryError unused) {
                try {
                    Thread.sleep(250);
                } catch (InterruptedException unused2) {
                }
            }
        }
    }

    private boolean Y() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private boolean Z() {
        if (!r()) {
            return false;
        }
        return D();
    }

    static boolean a(Context context) {
        try {
            return o.e(k3.f27912f).a();
        } catch (Throwable unused) {
            return true;
        }
    }

    private boolean a0() {
        if (!u() || !p()) {
            return false;
        }
        return E();
    }

    private Integer b(Context context) {
        boolean z10 = z();
        boolean y10 = y();
        if (!z10 && !y10) {
            k3.a(k3.r0.FATAL, "Could not find the Android Support Library. Please make sure it has been correctly added to your project.");
            return -3;
        } else if (!z10 || !y10) {
            k3.a(k3.r0.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
            return -5;
        } else if (Build.VERSION.SDK_INT < 26 || o(context) < 26 || x()) {
            return null;
        } else {
            k3.a(k3.r0.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
            return -5;
        }
    }

    static String f(Context context, String str) {
        Bundle h10 = h(context);
        if (h10 != null) {
            return h10.getString(str);
        }
        return null;
    }

    static boolean g(Context context, String str) {
        Bundle h10 = h(context);
        if (h10 != null) {
            return h10.getBoolean(str);
        }
        return false;
    }

    static Bundle h(Context context) {
        ApplicationInfo a10 = j.f27861a.a(context);
        if (a10 == null) {
            return null;
        }
        return a10.metaData;
    }

    static int j(int i10, int i11) {
        return new Random().nextInt((i11 + 1) - i10) + i10;
    }

    static String k(Context context, String str, String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : str2;
    }

    static String l(Throwable th) {
        return m(th).getMessage();
    }

    static Throwable m(Throwable th) {
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        return th;
    }

    static Uri n(Context context, String str) {
        int identifier;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if (!K(str) || (identifier = resources.getIdentifier(str, "raw", packageName)) == 0) {
            int identifier2 = resources.getIdentifier("onesignal_default_sound", "raw", packageName);
            if (identifier2 == 0) {
                return null;
            }
            return Uri.parse("android.resource://" + packageName + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + identifier2);
        }
        return Uri.parse("android.resource://" + packageName + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + identifier);
    }

    static int o(Context context) {
        ApplicationInfo a10 = j.f27861a.a(context);
        if (a10 == null) {
            return 15;
        }
        return a10.targetSdkVersion;
    }

    @Keep
    private static boolean opaqueHasClass(Class<?> cls) {
        return true;
    }

    static boolean p() {
        return t() && w();
    }

    static boolean q(Activity activity, int i10) {
        try {
            return (activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).configChanges & i10) != 0;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    static boolean r() {
        try {
            return opaqueHasClass(FirebaseMessaging.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    static boolean s() {
        try {
            return opaqueHasClass(LocationListener.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    private static boolean t() {
        try {
            return opaqueHasClass(AGConnectServicesConfig.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    private static boolean u() {
        try {
            return opaqueHasClass(HuaweiApiAvailability.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    static boolean v() {
        try {
            return opaqueHasClass(LocationCallback.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    private static boolean w() {
        try {
            return opaqueHasClass(HmsInstanceId.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    private static boolean x() {
        Class<h> cls = h.class;
        return true;
    }

    private static boolean y() {
        return true;
    }

    private static boolean z() {
        Class<n0.a> cls = n0.a.class;
        return true;
    }

    /* access modifiers changed from: package-private */
    public int A(Context context, String str) {
        Integer c10;
        int e10 = e();
        try {
            UUID.fromString(str);
            if ("b2f7f966-d8cc-11e4-bed1-df8f05be55ba".equals(str) || "5eb5a37e-b458-11e3-ac11-000c2940e62c".equals(str)) {
                k3.a(k3.r0.ERROR, "OneSignal Example AppID detected, please update to your app's id found on OneSignal.com");
            }
            int i10 = 1;
            if (e10 == 1 && (c10 = c()) != null) {
                i10 = c10.intValue();
            }
            Integer b10 = b(context);
            return b10 != null ? b10.intValue() : i10;
        } catch (Throwable th) {
            k3.b(k3.r0.FATAL, "OneSignal AppId format is invalid.\nExample: 'b2f7f966-d8cc-11e4-bed1-df8f05be55ba'\n", th);
            return -999;
        }
    }

    /* access modifiers changed from: package-private */
    public Integer c() {
        if (r()) {
            return null;
        }
        k3.a(k3.r0.FATAL, "The Firebase FCM library is missing! Please make sure to include it in your project.");
        return -4;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        try {
            String networkOperatorName = ((TelephonyManager) k3.f27912f.getSystemService("phone")).getNetworkOperatorName();
            if (MaxReward.DEFAULT_LABEL.equals(networkOperatorName)) {
                return null;
            }
            return networkOperatorName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public int e() {
        if (Y()) {
            return 2;
        }
        boolean a02 = a0();
        boolean Z = Z();
        if (Z && a02) {
            Context context = k3.f27912f;
            if (context != null && g(context, "com.onesignal.preferHMS")) {
                return 13;
            }
            return 1;
        } else if (Z) {
            return 1;
        } else {
            if (a02) {
                return 13;
            }
            return (!D() && F()) ? 13 : 1;
        }
    }

    /* access modifiers changed from: package-private */
    public Integer i() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) k3.f27912f.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1 || type == 9) {
            return 0;
        }
        return 1;
    }
}
