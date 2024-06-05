package ub;

import android.content.ContentResolver;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.applovin.sdk.AppLovinEventTypes;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.Arrays;
import java.util.HashMap;
import lc.j;
import lc.k;

/* compiled from: MethodCallHandlerImpl */
class b implements k.c {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f38743b = new String[0];

    /* renamed from: a  reason: collision with root package name */
    private final PackageManager f38744a;

    b(ContentResolver contentResolver, PackageManager packageManager) {
        this.f38744a = packageManager;
    }

    private String[] a() {
        FeatureInfo[] systemAvailableFeatures = this.f38744a.getSystemAvailableFeatures();
        if (systemAvailableFeatures == null) {
            return f38743b;
        }
        String[] strArr = new String[systemAvailableFeatures.length];
        for (int i10 = 0; i10 < systemAvailableFeatures.length; i10++) {
            strArr[i10] = systemAvailableFeatures[i10].name;
        }
        return strArr;
    }

    private boolean b() {
        if (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) {
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                String str2 = Build.HARDWARE;
                if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                    String str3 = Build.MODEL;
                    if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                        String str4 = Build.PRODUCT;
                        return str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains(ServiceProvider.NAMED_SDK) || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains("simulator");
                    }
                }
            }
        }
    }

    public void onMethodCall(j jVar, k.d dVar) {
        if (jVar.f36116a.equals("getAndroidDeviceInfo")) {
            HashMap hashMap = new HashMap();
            hashMap.put("board", Build.BOARD);
            hashMap.put("bootloader", Build.BOOTLOADER);
            hashMap.put("brand", Build.BRAND);
            hashMap.put("device", Build.DEVICE);
            hashMap.put("display", Build.DISPLAY);
            hashMap.put("fingerprint", Build.FINGERPRINT);
            hashMap.put("hardware", Build.HARDWARE);
            hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, Build.HOST);
            hashMap.put("id", Build.ID);
            hashMap.put("manufacturer", Build.MANUFACTURER);
            hashMap.put("model", Build.MODEL);
            hashMap.put(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                hashMap.put("supported32BitAbis", Arrays.asList(Build.SUPPORTED_32_BIT_ABIS));
                hashMap.put("supported64BitAbis", Arrays.asList(Build.SUPPORTED_64_BIT_ABIS));
                hashMap.put("supportedAbis", Arrays.asList(Build.SUPPORTED_ABIS));
            } else {
                String[] strArr = f38743b;
                hashMap.put("supported32BitAbis", Arrays.asList(strArr));
                hashMap.put("supported64BitAbis", Arrays.asList(strArr));
                hashMap.put("supportedAbis", Arrays.asList(strArr));
            }
            hashMap.put("tags", Build.TAGS);
            hashMap.put("type", Build.TYPE);
            hashMap.put("isPhysicalDevice", Boolean.valueOf(!b()));
            hashMap.put("systemFeatures", Arrays.asList(a()));
            HashMap hashMap2 = new HashMap();
            if (i10 >= 23) {
                hashMap2.put("baseOS", Build.VERSION.BASE_OS);
                hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
                hashMap2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
            }
            hashMap2.put("codename", Build.VERSION.CODENAME);
            hashMap2.put("incremental", Build.VERSION.INCREMENTAL);
            hashMap2.put("release", Build.VERSION.RELEASE);
            hashMap2.put("sdkInt", Integer.valueOf(i10));
            hashMap.put("version", hashMap2);
            dVar.success(hashMap);
            return;
        }
        dVar.notImplemented();
    }
}
