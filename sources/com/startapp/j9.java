package com.startapp;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import com.startapp.sdk.ads.banner.banner3d.Banner3DAd;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.ads.interstitials.ReturnAd;
import com.startapp.sdk.ads.nativead.NativeAd;
import com.startapp.sdk.ads.offerWall.offerWallHtml.OfferWallAd;
import com.startapp.sdk.ads.offerWall.offerWallJson.OfferWall3DAd;
import com.startapp.sdk.ads.splash.SplashAd;
import com.startapp.sdk.ads.video.VideoEnabledAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: Sta */
public class j9 {

    /* renamed from: a  reason: collision with root package name */
    public static Map<Activity, Integer> f15982a = new WeakHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static volatile Intent f15983b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile Boolean f15984c;

    /* renamed from: d  reason: collision with root package name */
    public static Random f15985d;

    /* renamed from: e  reason: collision with root package name */
    public static final a4 f15986e = new a();

    /* compiled from: Sta */
    public class a implements a4 {
        public int a(int i10) {
            Random random = j9.f15985d;
            if (random == null) {
                random = new Random();
                j9.f15985d = random;
            }
            return random.nextInt(i10);
        }
    }

    /* compiled from: Sta */
    public interface b {
        void a(int i10, String str);

        void a(boolean z10, long j10, long j11, boolean z11);
    }

    /* compiled from: Sta */
    public static class c {
        public static StackTraceElement[] a() {
            return Thread.currentThread().getStackTrace();
        }
    }

    public static String a(Drawable drawable, int i10, int i11, Bitmap.Config config) {
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, config);
        Drawable mutate = drawable.mutate();
        mutate.setBounds(0, 0, i10, i11);
        mutate.draw(new Canvas(createBitmap));
        e2 e2Var = new e2(i10 * i11);
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, e2Var);
        return new String(Base64.encode(e2Var.a(), 0, e2Var.b(), 2));
    }

    public static <T> boolean b(T t10, T t11) {
        Object obj;
        boolean z10 = false;
        try {
            Class<?> cls = t11.getClass();
            LinkedList<Field> linkedList = new LinkedList<>();
            linkedList.addAll(Arrays.asList(cls.getDeclaredFields()));
            if (cls.getSuperclass() != null) {
                a((List<Field>) linkedList, (Class<?>) cls.getSuperclass());
            }
            for (Field field : linkedList) {
                int modifiers = field.getModifiers();
                if (!Modifier.isTransient(modifiers)) {
                    if (!Modifier.isStatic(modifiers)) {
                        field.setAccessible(true);
                        if (field.get(t10) == null && (obj = field.get(t11)) != null) {
                            field.set(t10, obj);
                            z10 = true;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return z10;
    }

    public static String c(Context context) {
        ComponentName component;
        Intent a10 = a(context, (String) null);
        if (a10 == null || (component = a10.getComponent()) == null) {
            return null;
        }
        return component.getClassName();
    }

    public static boolean d(Context context) {
        boolean z10 = false;
        try {
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            boolean z11 = false;
            int i10 = 0;
            while (!z11) {
                try {
                    if (i10 >= activityInfoArr.length) {
                        return z11;
                    }
                    int i11 = i10 + 1;
                    ActivityInfo activityInfo = activityInfoArr[i10];
                    if (activityInfo.name.equals(OverlayActivity.class.getName())) {
                        int i12 = activityInfo.flags & 512;
                        i10 = i11;
                        z11 = i12 == 0;
                    } else {
                        i10 = i11;
                    }
                } catch (PackageManager.NameNotFoundException | Exception unused) {
                    z10 = z11;
                    return z10;
                }
            }
            return z11;
        } catch (PackageManager.NameNotFoundException | Exception unused2) {
            return z10;
        }
    }

    public static boolean e(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next != null && next.importance == 100 && packageName.equals(next.processName)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (!a(th, (Class<? extends Throwable>) SecurityException.class) && !a(th, (Class<? extends Throwable>) RemoteException.class)) {
                i3.a(th);
            }
        }
    }

    public static boolean f(Context context) {
        Boolean bool = f15984c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null) {
                bool = Boolean.valueOf((applicationInfo.flags & 2) != 0);
            }
        } catch (Throwable unused) {
        }
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        f15984c = bool;
        return bool.booleanValue();
    }

    public static boolean g(Context context) {
        return ComponentLocator.a(context).f().a();
    }

    public static boolean c(String str) {
        if (str == null) {
            return false;
        }
        try {
            String[] split = new URL(MetaData.f17070k.d()).getHost().split("\\.");
            if (split.length > 1) {
                Locale locale = Locale.ENGLISH;
                return str.toLowerCase(locale).contains(split[1].toLowerCase(locale));
            }
        } catch (MalformedURLException unused) {
        }
        return false;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004a */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent a(android.content.Context r8, java.lang.String r9) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = r8.getPackageName()     // Catch:{ all -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r1 = r0
        L_0x000a:
            if (r9 != 0) goto L_0x000d
            r9 = r1
        L_0x000d:
            if (r9 != 0) goto L_0x0010
            return r0
        L_0x0010:
            boolean r2 = r9.equals(r1)
            if (r2 == 0) goto L_0x0020
            android.content.Intent r2 = f15983b
            if (r2 == 0) goto L_0x0020
            android.content.Intent r8 = new android.content.Intent
            r8.<init>(r2)
            return r8
        L_0x0020:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            java.lang.Thread r3 = r3.getThread()
            if (r2 != r3) goto L_0x0031
            r2 = 100
            goto L_0x0033
        L_0x0031:
            r2 = 5000(0x1388, double:2.4703E-320)
        L_0x0033:
            r4 = 1
            android.content.Intent[] r4 = new android.content.Intent[r4]
            r5 = 0
            r4[r5] = r0
            monitor-enter(r4)
            java.lang.Thread r6 = new java.lang.Thread     // Catch:{ all -> 0x004a }
            com.startapp.i9 r7 = new com.startapp.i9     // Catch:{ all -> 0x004a }
            r7.<init>(r4, r8, r9)     // Catch:{ all -> 0x004a }
            r6.<init>(r7)     // Catch:{ all -> 0x004a }
            r6.start()     // Catch:{ all -> 0x004a }
            r4.wait(r2)     // Catch:{ all -> 0x004a }
        L_0x004a:
            monitor-exit(r4)     // Catch:{ all -> 0x005f }
            r8 = r4[r5]
            if (r8 == 0) goto L_0x005e
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x005d
            f15983b = r8
            android.content.Intent r9 = new android.content.Intent
            r9.<init>(r8)
            return r9
        L_0x005d:
            return r8
        L_0x005e:
            return r0
        L_0x005f:
            r8 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005f }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.j9.a(android.content.Context, java.lang.String):android.content.Intent");
    }

    public static String d(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public static long e(String str) {
        long j10;
        if (str == null || str.length() < 1) {
            return 0;
        }
        int length = str.length() - 1;
        long j11 = 0;
        long j12 = 0;
        char c10 = 0;
        boolean z10 = true;
        while (length >= 0) {
            char charAt = str.charAt(length);
            if (charAt < '0' || charAt > '9') {
                if (charAt == 'm' && c10 == 's') {
                    j12 = 1;
                    length--;
                    c10 = charAt;
                } else if (z10) {
                    if (charAt == 's') {
                        j10 = 1000;
                    } else if (charAt == 'm') {
                        j10 = 60000;
                    } else if (charAt == 'h') {
                        j10 = 3600000;
                    } else if (charAt == 'd') {
                        j10 = 86400000;
                    }
                    j12 = j10;
                    z10 = false;
                    length--;
                    c10 = charAt;
                }
            } else if (j12 != 0) {
                j11 += ((long) (charAt - '0')) * j12;
                j12 *= 10;
                z10 = true;
                length--;
                c10 = charAt;
            }
            return (long) (~length);
        }
        return j11;
    }

    public static int[][] f(String str) {
        int i10;
        int i11;
        ArrayList arrayList = null;
        for (String str2 : str.split(",")) {
            int indexOf = str2.indexOf("..");
            if (indexOf < 0) {
                i11 = Integer.parseInt(str2);
                i10 = i11;
            } else {
                String substring = str2.substring(0, indexOf);
                int parseInt = substring.length() > 0 ? Integer.parseInt(substring) : RecyclerView.UNDEFINED_DURATION;
                String substring2 = str2.substring(indexOf + 2);
                if (substring2.length() > 0) {
                    i10 = Integer.parseInt(substring2);
                    i11 = parseInt;
                } else {
                    i11 = parseInt;
                    i10 = a.e.API_PRIORITY_OTHER;
                }
            }
            if (arrayList == null) {
                arrayList = new ArrayList(2);
            }
            arrayList.add(new int[]{Math.min(i11, i10), Math.max(i11, i10)});
        }
        if (arrayList != null) {
            return (int[][]) arrayList.toArray(new int[0][]);
        }
        return null;
    }

    public static int b(int[] iArr) {
        int length = iArr.length;
        a4 a4Var = f15986e;
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        int i10 = 0;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i13 > 0) {
                i10 += i13;
                i11++;
                iArr2[i11] = i10 - 1;
                iArr3[i11] = i12;
            }
        }
        for (int i14 = i11 + 1; i14 < length; i14++) {
            iArr2[i14] = ((i10 + i14) - i11) - 1;
            iArr3[i14] = -1;
        }
        int binarySearch = Arrays.binarySearch(iArr2, ((a) a4Var).a(i10));
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        }
        return iArr3[binarySearch];
    }

    public static String a(String str, String str2, String str3) {
        int indexOf;
        int indexOf2;
        if (str == null || str2 == null || str3 == null || (indexOf = str.indexOf(str2)) == -1 || (indexOf2 = str.indexOf(str3, str2.length() + indexOf)) == -1) {
            return null;
        }
        return str.substring(str2.length() + indexOf, indexOf2);
    }

    public static String b(String str) throws IOException {
        byte[] bytes = str.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, new Deflater(9, true));
        deflaterOutputStream.write(bytes);
        deflaterOutputStream.close();
        return Base64.encodeToString(a.a(byteArrayOutputStream.toByteArray()), 10);
    }

    public static int a(Activity activity, int i10, boolean z10) {
        if (z10) {
            if (!((WeakHashMap) f15982a).containsKey(activity)) {
                ((WeakHashMap) f15982a).put(activity, Integer.valueOf(activity.getRequestedOrientation()));
            }
            if (i10 == activity.getResources().getConfiguration().orientation) {
                return a0.a(activity, i10, false);
            }
            return a0.a(activity, i10, true);
        }
        int i11 = -1;
        if (((WeakHashMap) f15982a).containsKey(activity)) {
            i11 = ((Integer) ((WeakHashMap) f15982a).get(activity)).intValue();
            int i12 = a0.f15596a;
            try {
                activity.setRequestedOrientation(i11);
            } catch (Throwable unused) {
            }
            ((WeakHashMap) f15982a).remove(activity);
        }
        return i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        return r7.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        return r7.getMessage();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(java.lang.Throwable r7) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ all -> 0x0029 }
            java.util.zip.DeflaterOutputStream r2 = new java.util.zip.DeflaterOutputStream     // Catch:{ all -> 0x0029 }
            android.util.Base64OutputStream r3 = new android.util.Base64OutputStream     // Catch:{ all -> 0x0029 }
            r4 = 10
            r3.<init>(r0, r4)     // Catch:{ all -> 0x0029 }
            java.util.zip.Deflater r4 = new java.util.zip.Deflater     // Catch:{ all -> 0x0029 }
            r5 = 9
            r6 = 1
            r4.<init>(r5, r6)     // Catch:{ all -> 0x0029 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0029 }
            r1.<init>(r2)     // Catch:{ all -> 0x0029 }
            a((java.lang.Throwable) r7, (java.io.PrintWriter) r1)     // Catch:{ all -> 0x0029 }
            r1.close()     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x0029 }
            return r7
        L_0x0029:
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x002e }
            return r7
        L_0x002e:
            java.lang.String r7 = r7.getMessage()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.j9.b(java.lang.Throwable):java.lang.String");
    }

    public static void a(Activity activity, boolean z10) {
        a(activity, activity.getResources().getConfiguration().orientation, z10);
    }

    public static List<Field> a(List<Field> list, Class<?> cls) {
        list.addAll(Arrays.asList(cls.getDeclaredFields()));
        if (cls.getSuperclass() != null) {
            a(list, (Class<?>) cls.getSuperclass());
        }
        return list;
    }

    public static String a(String str) {
        if (str == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static boolean b(Context context, String str) {
        if (Build.VERSION.SDK_INT < 15) {
            return false;
        }
        if (str.startsWith("sms:") || str.startsWith("smsto:")) {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse(str));
            intent.addFlags(268435456);
            try {
                context.startActivity(intent);
                return true;
            } catch (Throwable th) {
                i3.a(th);
            }
        }
        return false;
    }

    public static boolean a(double d10) {
        if (Double.compare(d10, 0.0d) <= 0) {
            return false;
        }
        if (Double.compare(d10, 1.0d) < 0 && Math.random() >= d10) {
            return false;
        }
        return true;
    }

    public static String a(Context context) {
        ActivityInfo activityInfo;
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) {
                return MaxReward.DEFAULT_LABEL;
            }
            String str = activityInfo.packageName;
            return str != null ? str.toLowerCase() : str;
        } catch (Exception unused) {
            return MaxReward.DEFAULT_LABEL;
        }
    }

    public static <T> List<T> b(List<T> list) {
        return list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
    }

    public static String b(Context context) {
        PackageManager packageManager;
        String str = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable unused) {
            packageManager = null;
        }
        if (packageManager == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT > 29) {
            try {
                InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(context.getPackageName());
                if (installSourceInfo != null) {
                    str = installSourceInfo.getInstallingPackageName();
                }
            } catch (Throwable unused2) {
            }
        }
        if (str != null) {
            return str;
        }
        try {
            return packageManager.getInstallerPackageName(context.getPackageName());
        } catch (Throwable unused3) {
            return str;
        }
    }

    public static void a(WebView webView, boolean z10, String str, Object... objArr) {
        if (webView != null) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("(");
                if (objArr != null) {
                    for (int i10 = 0; i10 < objArr.length; i10++) {
                        if (!z10 || !(objArr[i10] instanceof String)) {
                            sb2.append(objArr[i10]);
                        } else {
                            sb2.append("\"");
                            sb2.append(objArr[i10]);
                            sb2.append("\"");
                        }
                        if (i10 < objArr.length - 1) {
                            sb2.append(",");
                        }
                    }
                }
                sb2.append(")");
                webView.loadUrl("javascript:" + sb2.toString());
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(Context context, Class<? extends Activity> cls) {
        try {
            for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                if (activityInfo.name.equals(cls.getName())) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean a(WebView webView, String str) {
        try {
            webView.loadDataWithBaseURL(MetaData.f17070k.q(), str, "text/html", "utf-8", (String) null);
            return true;
        } catch (Throwable th) {
            i3.a(th);
            return false;
        }
    }

    public static <T> boolean a(T t10, T t11) {
        if (t10 == null) {
            return t11 == null;
        }
        return t10.equals(t11);
    }

    public static String a(int... iArr) {
        int length = iArr.length;
        char[] cArr = new char[length];
        char c10 = (char) length;
        for (int i10 = 0; i10 < length; i10++) {
            c10 = (char) (c10 + iArr[i10]);
            cArr[i10] = c10;
        }
        return new String(cArr);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static <T> String a(Iterable<T> iterable, String str) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        for (T next : iterable) {
            if (z10) {
                sb2.append(str);
            }
            sb2.append(next);
            z10 = true;
        }
        return sb2.toString();
    }

    public static StackTraceElement a(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        StackTraceElement[] a10 = c.a();
        if (a10 == null) {
            return null;
        }
        String name = c.class.getName();
        int length = a10.length;
        for (int i11 = 0; i11 < length; i11++) {
            StackTraceElement stackTraceElement = a10[i11];
            if (stackTraceElement != null && name.equals(stackTraceElement.getClassName())) {
                int i12 = i11 + 3 + i10;
                if (i12 < length) {
                    return a10[i12];
                }
                return null;
            }
        }
        return null;
    }

    public static String a(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null) {
            return "null";
        }
        return stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName() + "()";
    }

    public static List<String> a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            if (c(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static void a(Context context, int i10, String str, boolean z10) {
        Log.println(i10, "StartAppSDK", str);
        if (z10) {
            if (f(context) || a0.c(context)) {
                i3 i3Var = new i3(j3.f15951d);
                i3Var.f15914d = "Log for a publisher";
                i3Var.f15915e = str;
                i3Var.a();
            }
        }
    }

    public static String a(Ad ad2) {
        if (ad2 instanceof VideoEnabledAd) {
            VideoEnabledAd videoEnabledAd = (VideoEnabledAd) ad2;
            if (videoEnabledAd.getType() == Ad.AdType.VIDEO) {
                return "VIDEO";
            }
            return videoEnabledAd.getType() == Ad.AdType.REWARDED_VIDEO ? "REWARDED_VIDEO" : "INTERSTITIAL";
        } else if (ad2 instanceof ReturnAd) {
            return "RETURN";
        } else {
            if (ad2 instanceof OfferWallAd) {
                return "OFFER_WALL";
            }
            if (ad2 instanceof OfferWall3DAd) {
                return "OFFER_WALL_3D";
            }
            if (ad2 instanceof BannerStandardAd) {
                BannerStandardAd bannerStandardAd = (BannerStandardAd) ad2;
                if (bannerStandardAd.v() == 0) {
                    return AdPreferences.TYPE_BANNER;
                }
                if (bannerStandardAd.v() == 1) {
                    return "MREC";
                }
                return bannerStandardAd.v() == 2 ? "COVER" : "BANNER_UNDEFINED";
            } else if (ad2 instanceof Banner3DAd) {
                return "BANNER_3D";
            } else {
                if (ad2 instanceof NativeAd) {
                    return "NATIVE";
                }
                return ad2 instanceof SplashAd ? "SPLASH" : "UNDEFINED";
            }
        }
    }

    public static boolean a(int i10, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (iArr2 != null && iArr2.length > 1 && iArr2[0] <= i10 && i10 <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void a(Object obj, Throwable th) {
        if (obj.getClass().getName().startsWith("com.startapp.")) {
            i3.a(th);
        }
    }

    public static void a(Throwable th, PrintWriter printWriter) {
        String className;
        l8 l8Var = new l8(th);
        while (l8Var.hasNext()) {
            Throwable a10 = l8Var.next();
            if (l8Var.f16101d) {
                printWriter.println('-');
            }
            printWriter.println(a10.toString().trim());
            StackTraceElement[] stackTrace = a10.getStackTrace();
            if (stackTrace != null) {
                int length = stackTrace.length;
                StackTraceElement stackTraceElement = null;
                int i10 = 0;
                int i11 = 0;
                boolean z10 = false;
                while (i10 < length) {
                    StackTraceElement stackTraceElement2 = stackTrace[i10];
                    if (!(stackTraceElement2 == null || (className = stackTraceElement2.getClassName()) == null)) {
                        boolean z11 = i10 < 3;
                        boolean startsWith = className.startsWith("com.startapp.");
                        if (z11 || startsWith || z10) {
                            if (i11 > 0) {
                                printWriter.print(' ');
                                printWriter.println(i11);
                                i11 = 0;
                            }
                            if (stackTraceElement != null) {
                                printWriter.print(' ');
                                printWriter.print(stackTraceElement.getClassName());
                                printWriter.print('.');
                                printWriter.print(stackTraceElement.getMethodName());
                                printWriter.println("()");
                                stackTraceElement = null;
                            }
                            printWriter.print(' ');
                            printWriter.print(stackTraceElement2.getClassName());
                            printWriter.print('.');
                            printWriter.print(stackTraceElement2.getMethodName());
                            printWriter.println("()");
                        } else {
                            if (stackTraceElement != null) {
                                i11++;
                            }
                            stackTraceElement = stackTraceElement2;
                        }
                        z10 = startsWith;
                    }
                    i10++;
                }
                if (stackTraceElement != null) {
                    i11++;
                }
                if (i11 > 0) {
                    printWriter.print(' ');
                    printWriter.println(i11);
                }
            }
        }
    }

    public static StackTraceElement a(Throwable th) {
        String className;
        Throwable th2 = th;
        while (true) {
            StackTraceElement stackTraceElement = null;
            if (th2 == null) {
                return null;
            }
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                int length = stackTrace.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        StackTraceElement stackTraceElement2 = stackTrace[i10];
                        if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null && className.startsWith("com.startapp.")) {
                            stackTraceElement = stackTraceElement2;
                            break;
                        }
                        i10++;
                    } else {
                        break;
                    }
                }
            }
            if (stackTraceElement != null) {
                return stackTraceElement;
            }
            th2 = th2.getCause();
        }
    }

    public static boolean a(Throwable th, Class<? extends Throwable> cls) {
        while (th != null) {
            if (cls.isInstance(th)) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static long a() {
        if (Build.VERSION.SDK_INT < 17) {
            return SystemClock.elapsedRealtime() * 1000000;
        }
        return SystemClock.elapsedRealtimeNanos();
    }
}
