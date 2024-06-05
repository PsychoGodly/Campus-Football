package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.z4;
import com.unity3d.services.core.network.model.HttpRequest;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import n4.f;
import n4.h;
import n4.j;
import o4.b;
import o4.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u4.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbyt {
    public static final Handler zza = new zzfkr(Looper.getMainLooper());
    private static final String zzb = j.class.getName();
    private static final String zzc = a.class.getName();
    private static final String zzd = b.class.getName();
    private static final String zze = c.class.getName();
    private static final String zzf = c5.b.class.getName();
    private static final String zzg = f.class.getName();
    private float zzh = -1.0f;

    private static String zzA(String str, String str2) {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str2);
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i10++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    private final JSONArray zzB(Collection collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object zzC : collection) {
            zzC(jSONArray, zzC);
        }
        return jSONArray;
    }

    private final void zzC(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(zzi((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(zzj((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(zzB((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(zzh((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private final void zzD(JSONObject jSONObject, String str, Object obj) throws JSONException {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) a0.c().zzb(zzbar.zzr)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, zzi((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, zzj((Map) obj));
        } else if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), zzB((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, zzB(Arrays.asList((Object[]) obj)));
        } else {
            int i10 = 0;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    numArr = new Integer[0];
                } else {
                    int length = iArr.length;
                    Integer[] numArr2 = new Integer[length];
                    while (i10 < length) {
                        numArr2[i10] = Integer.valueOf(iArr[i10]);
                        i10++;
                    }
                    numArr = numArr2;
                }
                jSONObject.put(str, zzh(numArr));
            } else if (obj instanceof double[]) {
                double[] dArr2 = (double[]) obj;
                if (dArr2 == null) {
                    dArr = new Double[0];
                } else {
                    int length2 = dArr2.length;
                    Double[] dArr3 = new Double[length2];
                    while (i10 < length2) {
                        dArr3[i10] = Double.valueOf(dArr2[i10]);
                        i10++;
                    }
                    dArr = dArr3;
                }
                jSONObject.put(str, zzh(dArr));
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    lArr = new Long[0];
                } else {
                    int length3 = jArr.length;
                    Long[] lArr2 = new Long[length3];
                    while (i10 < length3) {
                        lArr2[i10] = Long.valueOf(jArr[i10]);
                        i10++;
                    }
                    lArr = lArr2;
                }
                jSONObject.put(str, zzh(lArr));
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    boolArr = new Boolean[0];
                } else {
                    int length4 = zArr.length;
                    Boolean[] boolArr2 = new Boolean[length4];
                    while (i10 < length4) {
                        boolArr2[i10] = Boolean.valueOf(zArr[i10]);
                        i10++;
                    }
                    boolArr = boolArr2;
                }
                jSONObject.put(str, zzh(boolArr));
            } else {
                jSONObject.put(str, obj);
            }
        }
    }

    private static final void zzE(ViewGroup viewGroup, z4 z4Var, String str, int i10, int i11) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i10);
            textView.setBackgroundColor(i11);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i10);
            int zzy = zzy(context, 3);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(z4Var.f14651g - zzy, z4Var.f14648c - zzy, 17));
            viewGroup.addView(frameLayout, z4Var.f14651g, z4Var.f14648c);
        }
    }

    public static int zza(Context context, int i10) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i11 = configuration.orientation;
        if (i10 == 0) {
            i10 = i11;
        }
        if (i10 == i11) {
            return Math.round(((float) displayMetrics.heightPixels) / displayMetrics.density);
        }
        return Math.round(((float) displayMetrics.widthPixels) / displayMetrics.density);
    }

    public static h zzc(Context context, int i10, int i11, int i12) {
        int zza2 = zza(context, i12);
        if (zza2 == -1) {
            return h.f20935q;
        }
        return new h(i10, Math.max(Math.min(i10 > 655 ? Math.round((((float) i10) / 728.0f) * 90.0f) : i10 > 632 ? 81 : i10 > 526 ? Math.round((((float) i10) / 468.0f) * 60.0f) : i10 > 432 ? 68 : Math.round((((float) i10) / 320.0f) * 50.0f), Math.min(90, Math.round(((float) zza2) * 0.15f))), 50));
    }

    public static String zzd() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static String zze(String str) {
        return zzA(str, "MD5");
    }

    public static String zzf(String str) {
        return zzA(str, "SHA-256");
    }

    public static Throwable zzg(Throwable th) {
        if (((Boolean) zzbct.zzf.zze()).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z10 = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (zzp(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z10 = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                        arrayList.add(stackTraceElement);
                    } else {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
            }
            if (z10) {
                if (th2 == null) {
                    th2 = new Throwable(th3.getMessage());
                } else {
                    th2 = new Throwable(th3.getMessage(), th2);
                }
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    public static boolean zzp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzbct.zzd.zze());
    }

    public static final int zzq(DisplayMetrics displayMetrics, int i10) {
        return (int) TypedValue.applyDimension(1, (float) i10, displayMetrics);
    }

    public static final String zzr(StackTraceElement[] stackTraceElementArr, String str) {
        int i10;
        String str2;
        int i11 = 0;
        while (true) {
            i10 = i11 + 1;
            if (i10 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            String className = stackTraceElement.getClassName();
            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!zzb.equalsIgnoreCase(className) && !zzc.equalsIgnoreCase(className) && !zzd.equalsIgnoreCase(className) && !zze.equalsIgnoreCase(className) && !zzf.equalsIgnoreCase(className) && !zzg.equalsIgnoreCase(className))) {
                i11 = i10;
            }
        }
        str2 = stackTraceElementArr[i10].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb2 = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb2.append(stringTokenizer.nextToken());
                for (int i12 = 2; i12 > 0 && stringTokenizer.hasMoreElements(); i12--) {
                    sb2.append(".");
                    sb2.append(stringTokenizer.nextToken());
                }
                str = sb2.toString();
            }
            if (str2 == null || str2.contains(str)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    public static final boolean zzs() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator");
    }

    public static final boolean zzt(Context context, int i10) {
        return h5.f.h().j(context, i10) == 0;
    }

    public static final boolean zzu(Context context) {
        int j10 = h5.f.h().j(context, h5.j.f18843a);
        return j10 == 0 || j10 == 2;
    }

    public static final boolean zzv() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int zzw(DisplayMetrics displayMetrics, int i10) {
        return Math.round(((float) i10) / displayMetrics.density);
    }

    public static final void zzx(Context context, String str, String str2, Bundle bundle, boolean z10, zzbys zzbys) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = h5.f.h().b(context) + ".230500000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzbys.zza(appendQueryParameter.toString());
    }

    public static final int zzy(Context context, int i10) {
        return zzq(context.getResources().getDisplayMetrics(), i10);
    }

    public static final String zzz(Context context) {
        String str;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        if (str == null || zzs()) {
            str = "emulator";
        }
        return zzA(str, "MD5");
    }

    public final int zzb(Context context, int i10) {
        if (this.zzh < 0.0f) {
            synchronized (this) {
                if (this.zzh < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.zzh = displayMetrics.density;
                }
            }
        }
        return Math.round(((float) i10) / this.zzh);
    }

    /* access modifiers changed from: package-private */
    public final JSONArray zzh(Object[] objArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object zzC : objArr) {
            zzC(jSONArray, zzC);
        }
        return jSONArray;
    }

    public final JSONObject zzi(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zzD(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject zzj(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                zzD(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e10) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e10.getMessage())));
        }
    }

    public final JSONObject zzk(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return zzi(bundle);
        } catch (JSONException e10) {
            zzbza.zzh("Error converting Bundle to JSON", e10);
            return null;
        }
    }

    public final void zzl(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject2.get(next);
            try {
                Object obj2 = jSONObject.get(next);
                if (JSONObject.class.isInstance(obj2) && JSONObject.class.isInstance(obj)) {
                    zzl((JSONObject) obj2, (JSONObject) obj);
                }
            } catch (JSONException unused) {
                jSONObject.put(next, obj);
            }
        }
    }

    public final void zzm(ViewGroup viewGroup, z4 z4Var, String str, String str2) {
        if (str2 != null) {
            zzbza.zzj(str2);
        }
        zzE(viewGroup, z4Var, str, -65536, -16777216);
    }

    public final void zzn(ViewGroup viewGroup, z4 z4Var, String str) {
        zzE(viewGroup, z4Var, "Ads by Google", -16777216, -1);
    }

    public final void zzo(Context context, String str, String str2, Bundle bundle, boolean z10) {
        zzx(context, str, "gmob-apps", bundle, true, new zzbyq(this));
    }
}
