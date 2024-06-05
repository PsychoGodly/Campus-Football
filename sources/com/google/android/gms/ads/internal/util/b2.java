package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import androidx.browser.customtabs.d;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.zzbaj;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbub;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzdmt;
import com.google.android.gms.internal.ads.zzeyc;
import com.google.android.gms.internal.ads.zzeyf;
import com.google.android.gms.internal.ads.zzfkr;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfut;
import com.google.android.gms.internal.ads.zzgxm;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import m5.g;
import m5.i;
import o5.c;
import q4.o;
import s4.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class b2 {

    /* renamed from: i  reason: collision with root package name */
    public static final zzfkr f14773i = new o1(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference f14774a = new AtomicReference((Object) null);

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference f14775b = new AtomicReference((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f14776c = true;

    /* renamed from: d  reason: collision with root package name */
    private final Object f14777d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private String f14778e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14779f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f14780g = false;

    /* renamed from: h  reason: collision with root package name */
    private final Executor f14781h = Executors.newSingleThreadExecutor();

    public static void E(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzbzn.zza.execute(runnable);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean K(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L_0x0009
        L_0x0007:
            r2 = r0
            goto L_0x0013
        L_0x0009:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0007
            android.app.Activity r2 = (android.app.Activity) r2
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.b2.K(android.view.View):boolean");
    }

    public static final void L(Context context, Intent intent) {
        Bundle bundle;
        if (intent != null) {
            if (intent.getExtras() != null) {
                bundle = intent.getExtras();
            } else {
                bundle = new Bundle();
            }
            bundle.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(bundle);
        }
    }

    public static final String M(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return w(v(context));
    }

    static final String N() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        sb2.append("; ");
        sb2.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb2.append("; ");
            sb2.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb2.append(" Build/");
                sb2.append(str3);
            }
        }
        sb2.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb2.toString();
    }

    public static final String O() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final DisplayMetrics P(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    protected static final int[] Q() {
        return new int[]{0, 0};
    }

    public static final long R(View view) {
        float f10;
        int i10;
        float f11 = Float.MAX_VALUE;
        Object obj = view;
        do {
            f10 = 0.0f;
            if (!(obj instanceof View)) {
                break;
            }
            View view2 = (View) obj;
            f11 = Math.min(f11, view2.getAlpha());
            i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            obj = view2.getParent();
        } while (i10 > 0);
        if (f11 >= 0.0f) {
            f10 = f11;
        }
        return (long) Math.round(f10 * 100.0f);
    }

    public static final WebResourceResponse S(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", t.r().B(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new q0(context).b(0, str2, hashMap, (byte[]) null).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e10) {
            zzbza.zzk("Could not fetch MRAID JS.", e10);
        }
        return null;
    }

    public static final String T() {
        Resources zzd = t.q().zzd();
        return zzd != null ? zzd.getString(b.f22503q) : "Test Ad";
    }

    public static final t0 U(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzbza.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof t0 ? (t0) queryLocalInterface : new r0(iBinder);
        } catch (Exception e10) {
            t.q().zzu(e10, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean V(Context context, String str) {
        Context zza = zzbub.zza(context);
        return c.a(zza).b(str, zza.getPackageName()) == 0;
    }

    public static final boolean W(Context context) {
        try {
            return i.b(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean X(String str) {
        if (!zzbyz.zzl()) {
            return false;
        }
        if (!((Boolean) a0.c().zzb(zzbar.zzey)).booleanValue()) {
            return false;
        }
        String str2 = (String) a0.c().zzb(zzbar.zzeA);
        if (!str2.isEmpty()) {
            for (String equals : str2.split(";")) {
                if (equals.equals(str)) {
                    return false;
                }
            }
        }
        String str3 = (String) a0.c().zzb(zzbar.zzez);
        if (str3.isEmpty()) {
            return true;
        }
        for (String equals2 : str3.split(";")) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean Y(Context context) {
        KeyguardManager u10;
        if (context == null || (u10 = u(context)) == null || !u10.isKeyguardLocked()) {
            return false;
        }
        return true;
    }

    public static final boolean a(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzbza.zzh("Error loading class.", th);
            t.q().zzu(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean b() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public static final boolean c(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (Process.myPid() == next.pid) {
                            if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                                return true;
                            }
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager == null) {
                                return true;
                            }
                            if (powerManager.isScreenOn()) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean d(Context context) {
        Bundle v10 = v(context);
        return TextUtils.isEmpty(w(v10)) && !TextUtils.isEmpty(v10.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static final boolean e(Context context) {
        Window window;
        if (!(!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, (Point) null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final void f(View view, int i10, MotionEvent motionEvent) {
        int i11;
        String str;
        int i12;
        int i13;
        String str2;
        zzeyc zzD;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof zzdmt) {
                view2 = ((zzdmt) view2).getChildAt(0);
            }
            if ((view2 instanceof o) || (view2 instanceof NativeAdView)) {
                str = "NATIVE";
                i11 = 1;
            } else {
                str = "UNKNOWN";
                i11 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i12 = rect.width();
                i13 = rect.height();
            } else {
                i13 = 0;
                i12 = 0;
            }
            t.r();
            long R = R(view2);
            view2.getLocationOnScreen(iArr);
            int i14 = iArr[0];
            int i15 = iArr[1];
            String str3 = "none";
            if (view2 instanceof zzcff) {
                zzeyf zzP = ((zzcff) view2).zzP();
                if (zzP != null) {
                    str2 = zzP.zzb;
                    int hashCode = view2.hashCode();
                    view2.setContentDescription(str2 + ":" + hashCode);
                    if ((view2 instanceof zzcdz) && (zzD = ((zzcdz) view2).zzD()) != null) {
                        str = zzeyc.zza(zzD.zzb);
                        i11 = zzD.zzf;
                        str3 = zzD.zzF;
                    }
                    zzbza.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[]{Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i11), view2.getClass().getName(), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i12), Integer.valueOf(i13), Long.valueOf(R), Integer.toString(i10, 2)}));
                }
            }
            str2 = str3;
            str = zzeyc.zza(zzD.zzb);
            i11 = zzD.zzf;
            str3 = zzD.zzF;
            zzbza.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[]{Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i11), view2.getClass().getName(), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i12), Integer.valueOf(i13), Long.valueOf(R), Integer.toString(i10, 2)}));
        } catch (Exception e10) {
            zzbza.zzh("Failure getting view location.", e10);
        }
    }

    public static final AlertDialog.Builder g(Context context) {
        return new AlertDialog.Builder(context, t.s().a());
    }

    public static final void h(Context context, String str, String str2) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str2);
        for (String a1Var : arrayList) {
            new a1(context, str, a1Var).zzb();
        }
    }

    public static final void i(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) zzbct.zzb.zze()).booleanValue()) {
                    g.a(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final String j(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb2 = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb2.toString();
            }
            sb2.append(cArr, 0, read);
        }
    }

    public static final int k(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            zzbza.zzj("Could not parse value:".concat(e10.toString()));
            return 0;
        }
    }

    public static final Map l(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String next : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, uri.getQueryParameter(next));
            }
        }
        return hashMap;
    }

    public static final WebResourceResponse m(HttpURLConnection httpURLConnection) throws IOException {
        String str;
        t.r();
        String contentType = httpURLConnection.getContentType();
        boolean isEmpty = TextUtils.isEmpty(contentType);
        String str2 = MaxReward.DEFAULT_LABEL;
        if (isEmpty) {
            str = str2;
        } else {
            str = contentType.split(";")[0].trim();
        }
        t.r();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i10 = 1;
                while (true) {
                    if (i10 >= split.length) {
                        break;
                    }
                    if (split[i10].trim().startsWith("charset")) {
                        String[] split2 = split[i10].trim().split("=");
                        if (split2.length > 1) {
                            str2 = split2[1].trim();
                            break;
                        }
                    }
                    i10++;
                }
            }
        }
        String str3 = str2;
        Map headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((List) entry.getValue()).isEmpty())) {
                hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return t.s().c(str, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static final int[] n(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window == null || (findViewById = window.findViewById(16908290)) == null) {
            return Q();
        }
        return new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.findViewById(16908290);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[] o(android.app.Activity r6) {
        /*
            android.view.Window r0 = r6.getWindow()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0021
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r4)
            if (r0 == 0) goto L_0x0021
            int[] r4 = new int[r1]
            int r5 = r0.getTop()
            r4[r3] = r5
            int r0 = r0.getBottom()
            r4[r2] = r0
            goto L_0x0025
        L_0x0021:
            int[] r4 = Q()
        L_0x0025:
            int[] r0 = new int[r1]
            com.google.android.gms.internal.ads.zzbyt r1 = com.google.android.gms.ads.internal.client.x.b()
            r5 = r4[r3]
            int r1 = r1.zzb(r6, r5)
            r0[r3] = r1
            com.google.android.gms.internal.ads.zzbyt r1 = com.google.android.gms.ads.internal.client.x.b()
            r3 = r4[r2]
            int r6 = r1.zzb(r6, r3)
            r0[r2] = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.b2.o(android.app.Activity):int[]");
    }

    public static final boolean p(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z10 = t.r().f14776c || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || K(view);
        long R = R(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z10)) {
            if (!((Boolean) a0.c().zzb(zzbar.zzbe)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) a0.c().zzb(zzbar.zziW)).booleanValue()) {
                    return true;
                }
                if (R < ((long) ((Integer) a0.c().zzb(zzbar.zziY)).intValue())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final void q(Context context, Intent intent) {
        if (((Boolean) a0.c().zzb(zzbar.zzjo)).booleanValue()) {
            try {
                y(context, intent);
            } catch (SecurityException e10) {
                zzbza.zzk(MaxReward.DEFAULT_LABEL, e10);
                t.q().zzu(e10, "AdUtil.startActivityWithUnknownContext");
            }
        } else {
            y(context, intent);
        }
    }

    public static final void r(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            L(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            zzbza.zze("Opening " + uri2 + " in a new browser.");
        } catch (ActivityNotFoundException e10) {
            zzbza.zzh("No browser is found.", e10);
        }
    }

    public static final int[] s(Activity activity) {
        int[] n10 = n(activity);
        return new int[]{x.b().zzb(activity, n10[0]), x.b().zzb(activity, n10[1])};
    }

    public static final boolean t(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return p(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, u(context));
    }

    private static KeyguardManager u(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static Bundle v(Context context) {
        try {
            return c.a(context).c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            n1.b("Error getting metadata", e10);
            return null;
        }
    }

    private static String w(Bundle bundle) {
        if (bundle == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return MaxReward.DEFAULT_LABEL;
        }
        if (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) {
            return string;
        }
        return MaxReward.DEFAULT_LABEL;
    }

    private static boolean x(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static final void y(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static int z(int i10) {
        if (i10 >= 5000) {
            return i10;
        }
        if (i10 <= 0) {
            return 60000;
        }
        zzbza.zzj("HTTP timeout too low: " + i10 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    public final zzfut A(Uri uri) {
        return zzfuj.zzj(new u1(uri), this.f14781h);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:11|12|(1:14)(3:15|(1:17)(1:18)|19)|20|21|22|(1:24)|25|(1:27)|28|(3:29|30|(1:32))|36|37|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[Catch:{ Exception -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b A[Catch:{ Exception -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083 A[Catch:{ Exception -> 0x0099 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String B(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f14777d
            monitor-enter(r0)
            java.lang.String r1 = r4.f14778e     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return r1
        L_0x0009:
            if (r6 != 0) goto L_0x0011
            java.lang.String r5 = N()     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return r5
        L_0x0011:
            com.google.android.gms.ads.internal.util.h1 r1 = com.google.android.gms.ads.internal.util.h1.a()     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = r1.f14811a     // Catch:{ Exception -> 0x0045 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0045 }
            if (r2 != 0) goto L_0x001e
            goto L_0x0041
        L_0x001e:
            boolean r2 = m5.d.a()     // Catch:{ Exception -> 0x0045 }
            if (r2 == 0) goto L_0x0030
            com.google.android.gms.ads.internal.util.f1 r2 = new com.google.android.gms.ads.internal.util.f1     // Catch:{ Exception -> 0x0045 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r2 = com.google.android.gms.ads.internal.util.e1.a(r5, r2)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0045 }
            goto L_0x003f
        L_0x0030:
            android.content.Context r2 = h5.j.e(r5)     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.ads.internal.util.g1 r3 = new com.google.android.gms.ads.internal.util.g1     // Catch:{ Exception -> 0x0045 }
            r3.<init>(r2, r5)     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r2 = com.google.android.gms.ads.internal.util.e1.a(r5, r3)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0045 }
        L_0x003f:
            r1.f14811a = r2     // Catch:{ Exception -> 0x0045 }
        L_0x0041:
            java.lang.String r1 = r1.f14811a     // Catch:{ Exception -> 0x0045 }
            r4.f14778e = r1     // Catch:{ Exception -> 0x0045 }
        L_0x0045:
            java.lang.String r1 = r4.f14778e     // Catch:{ all -> 0x00ba }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0053
            java.lang.String r1 = android.webkit.WebSettings.getDefaultUserAgent(r5)     // Catch:{ all -> 0x00ba }
            r4.f14778e = r1     // Catch:{ all -> 0x00ba }
        L_0x0053:
            java.lang.String r1 = r4.f14778e     // Catch:{ all -> 0x00ba }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = N()     // Catch:{ all -> 0x00ba }
            r4.f14778e = r1     // Catch:{ all -> 0x00ba }
        L_0x0061:
            java.lang.String r1 = r4.f14778e     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r2.<init>()     // Catch:{ all -> 0x00ba }
            r2.append(r1)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = " (Mobile; "
            r2.append(r1)     // Catch:{ all -> 0x00ba }
            r2.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00ba }
            r4.f14778e = r6     // Catch:{ all -> 0x00ba }
            o5.b r5 = o5.c.a(r5)     // Catch:{ Exception -> 0x0099 }
            boolean r5 = r5.g()     // Catch:{ Exception -> 0x0099 }
            if (r5 == 0) goto L_0x00a3
            java.lang.String r5 = r4.f14778e     // Catch:{ Exception -> 0x0099 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r6.<init>()     // Catch:{ Exception -> 0x0099 }
            r6.append(r5)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = ";aia"
            r6.append(r5)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0099 }
            r4.f14778e = r5     // Catch:{ Exception -> 0x0099 }
            goto L_0x00a3
        L_0x0099:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzbyj r6 = com.google.android.gms.ads.internal.t.q()     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.zzu(r5, r1)     // Catch:{ all -> 0x00ba }
        L_0x00a3:
            java.lang.String r5 = r4.f14778e     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r6.<init>()     // Catch:{ all -> 0x00ba }
            r6.append(r5)     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = ")"
            r6.append(r5)     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x00ba }
            r4.f14778e = r5     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return r5
        L_0x00ba:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.b2.B(android.content.Context, java.lang.String):java.lang.String");
    }

    public final void D(Context context, String str, boolean z10, HttpURLConnection httpURLConnection, boolean z11, int i10) {
        int z12 = z(i10);
        zzbza.zzi("HTTP timeout: " + z12 + " milliseconds.");
        httpURLConnection.setConnectTimeout(z12);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(z12);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", B(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final boolean F(String str) {
        return x(str, this.f14774a, (String) a0.c().zzb(zzbar.zzZ));
    }

    public final boolean G(String str) {
        return x(str, this.f14775b, (String) a0.c().zzb(zzbar.zzaa));
    }

    public final boolean H(Context context) {
        if (this.f14780g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbar.zzc(context);
        if (!((Boolean) a0.c().zzb(zzbar.zzjn)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new y1(this, (x1) null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new y1(this, (x1) null), intentFilter, 4);
        }
        this.f14780g = true;
        return true;
    }

    public final boolean I(Context context) {
        if (this.f14779f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbar.zzc(context);
        if (!((Boolean) a0.c().zzb(zzbar.zzjn)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new a2(this, (z1) null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new a2(this, (z1) null), intentFilter, 4);
        }
        this.f14779f = true;
        return true;
    }

    public final int J(Context context, Uri uri) {
        int i10;
        if (context == null) {
            n1.a("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            n1.a("Chrome Custom Tabs can only work with Activity context.");
            i10 = 2;
        } else {
            i10 = 0;
        }
        zzbaj zzbaj = zzbar.zzee;
        zzbaj zzbaj2 = zzbar.zzef;
        if (true == ((Boolean) a0.c().zzb(zzbaj)).equals(a0.c().zzb(zzbaj2))) {
            i10 = 9;
        }
        if (i10 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i10;
        }
        if (((Boolean) a0.c().zzb(zzbaj)).booleanValue()) {
            zzbbs zzbbs = new zzbbs();
            zzbbs.zze(new w1(this, zzbbs, context, uri));
            zzbbs.zzb((Activity) context);
        }
        if (!((Boolean) a0.c().zzb(zzbaj2)).booleanValue()) {
            return 5;
        }
        d b10 = new d.b().b();
        b10.f1921a.setPackage(zzgxm.zza(context));
        b10.b(context, uri);
        return 5;
    }
}
