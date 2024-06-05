package com.pichillilorenzo.flutter_inappwebview_android;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.applovin.mediation.MaxReward;
import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import lc.k;
import lc.o;
import org.json.JSONArray;
import org.json.JSONObject;

public class Util {
    public static final String ANDROID_ASSET_URL = "file:///android_asset/";
    static final String LOG_TAG = "Util";

    public static class PrivateKeyAndCertificates {
        public X509Certificate[] certificates;
        public PrivateKey privateKey;

        public PrivateKeyAndCertificates(PrivateKey privateKey2, X509Certificate[] x509CertificateArr) {
            this.privateKey = privateKey2;
            this.certificates = x509CertificateArr;
        }
    }

    private Util() {
    }

    public static String JSONStringify(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj).toString();
        }
        if (obj instanceof List) {
            return new JSONArray((List) obj).toString();
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        return JSONObject.wrap(obj).toString();
    }

    public static Drawable drawableFromBytes(Context context, byte[] bArr) {
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    public static InputStream getFileAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) throws IOException {
        o oVar = inAppWebViewFlutterPlugin.registrar;
        return inAppWebViewFlutterPlugin.applicationContext.getResources().getAssets().open(oVar != null ? oVar.f(str) : inAppWebViewFlutterPlugin.flutterAssets.a(str));
    }

    public static Size2D getFullscreenSize(Context context) {
        Size2D size2D = new Size2D(-1.0d, -1.0d);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
                int i10 = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
                int i11 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
                Rect bounds = currentWindowMetrics.getBounds();
                size2D.setWidth((double) (bounds.width() - i10));
                size2D.setHeight((double) (bounds.height() - i11));
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                size2D.setWidth((double) displayMetrics.widthPixels);
                size2D.setHeight((double) displayMetrics.heightPixels);
            }
        }
        return size2D;
    }

    public static <T> T getOrDefault(Map<String, Object> map, String str, T t10) {
        return map.containsKey(str) ? map.get(str) : t10;
    }

    public static float getPixelDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static String getUrlAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) throws IOException {
        o oVar = inAppWebViewFlutterPlugin.registrar;
        String f10 = oVar != null ? oVar.f(str) : inAppWebViewFlutterPlugin.flutterAssets.a(str);
        IOException e10 = null;
        InputStream fileAsset = getFileAsset(inAppWebViewFlutterPlugin, str);
        if (fileAsset != null) {
            try {
                fileAsset.close();
            } catch (IOException e11) {
                e10 = e11;
            }
        }
        if (e10 == null) {
            return ANDROID_ASSET_URL + f10;
        }
        throw e10;
    }

    public static X509Certificate getX509CertFromSslCertHack(SslCertificate sslCertificate) {
        byte[] byteArray = SslCertificate.saveState(sslCertificate).getByteArray("x509-certificate");
        if (byteArray == null) {
            return null;
        }
        try {
            return (X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(byteArray));
        } catch (CertificateException unused) {
            return null;
        }
    }

    public static <T> T invokeMethodAndWaitResult(final k kVar, final String str, final Object obj, final SyncBaseCallbackResultImpl<T> syncBaseCallbackResultImpl) throws InterruptedException {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                k.this.d(str, obj, syncBaseCallbackResultImpl);
            }
        });
        syncBaseCallbackResultImpl.latch.await();
        return syncBaseCallbackResultImpl.result;
    }

    public static <O> Object invokeMethodIfExists(O o10, String str, Object... objArr) {
        Method[] methods = o10.getClass().getMethods();
        int length = methods.length;
        int i10 = 0;
        while (i10 < length) {
            Method method = methods[i10];
            if (method.getName().equals(str)) {
                try {
                    return method.invoke(o10, objArr);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                    return null;
                }
            } else {
                i10++;
            }
        }
        return null;
    }

    public static boolean isClass(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean isIPv6(String str) {
        try {
            Inet6Address.getByName(str);
            return true;
        } catch (UnknownHostException unused) {
            return false;
        }
    }

    public static PrivateKeyAndCertificates loadPrivateKeyAndCertificate(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str, String str2, String str3) {
        FileInputStream fileInputStream;
        PrivateKeyAndCertificates privateKeyAndCertificates = null;
        try {
            fileInputStream = getFileAsset(inAppWebViewFlutterPlugin, str);
        } catch (IOException unused) {
            fileInputStream = null;
        }
        if (fileInputStream == null) {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Exception e10) {
                Log.e(LOG_TAG, MaxReward.DEFAULT_LABEL, e10);
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Throwable th) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e11) {
                        Log.e(LOG_TAG, MaxReward.DEFAULT_LABEL, e11);
                    }
                }
                throw th;
            }
        }
        KeyStore instance = KeyStore.getInstance(str3);
        instance.load(fileInputStream, (str2 != null ? str2 : MaxReward.DEFAULT_LABEL).toCharArray());
        String nextElement = instance.aliases().nextElement();
        if (str2 == null) {
            str2 = MaxReward.DEFAULT_LABEL;
        }
        Key key = instance.getKey(nextElement, str2.toCharArray());
        if (key instanceof PrivateKey) {
            privateKeyAndCertificates = new PrivateKeyAndCertificates((PrivateKey) key, new X509Certificate[]{(X509Certificate) instance.getCertificate(nextElement)});
        }
        fileInputStream.close();
        try {
            fileInputStream.close();
        } catch (IOException e12) {
            Log.e(LOG_TAG, MaxReward.DEFAULT_LABEL, e12);
        }
        return privateKeyAndCertificates;
    }

    public static void log(String str, String str2) {
        int min;
        int length = str2.length();
        int i10 = 0;
        while (i10 < length) {
            int indexOf = str2.indexOf(10, i10);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i10 + 4000);
                Log.d(str, str2.substring(i10, min));
                if (min >= indexOf) {
                    break;
                }
                i10 = min;
            }
            i10 = min + 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.HttpURLConnection makeHttpRequest(java.lang.String r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0056 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0056 }
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ Exception -> 0x0056 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x0056 }
            r3.setRequestMethod(r4)     // Catch:{ Exception -> 0x0054 }
            if (r5 == 0) goto L_0x0035
            java.util.Set r5 = r5.entrySet()     // Catch:{ Exception -> 0x0054 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0054 }
        L_0x0019:
            boolean r1 = r5.hasNext()     // Catch:{ Exception -> 0x0054 }
            if (r1 == 0) goto L_0x0035
            java.lang.Object r1 = r5.next()     // Catch:{ Exception -> 0x0054 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Exception -> 0x0054 }
            java.lang.Object r2 = r1.getKey()     // Catch:{ Exception -> 0x0054 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0054 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x0054 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0054 }
            r3.setRequestProperty(r2, r1)     // Catch:{ Exception -> 0x0054 }
            goto L_0x0019
        L_0x0035:
            r5 = 15000(0x3a98, float:2.102E-41)
            r3.setConnectTimeout(r5)     // Catch:{ Exception -> 0x0054 }
            r3.setReadTimeout(r5)     // Catch:{ Exception -> 0x0054 }
            r5 = 1
            r3.setDoInput(r5)     // Catch:{ Exception -> 0x0054 }
            r3.setInstanceFollowRedirects(r5)     // Catch:{ Exception -> 0x0054 }
            java.lang.String r5 = "GET"
            boolean r4 = r5.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0054 }
            if (r4 == 0) goto L_0x0050
            r4 = 0
            r3.setDoOutput(r4)     // Catch:{ Exception -> 0x0054 }
        L_0x0050:
            r3.connect()     // Catch:{ Exception -> 0x0054 }
            return r3
        L_0x0054:
            r4 = move-exception
            goto L_0x0058
        L_0x0056:
            r4 = move-exception
            r3 = r0
        L_0x0058:
            boolean r5 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 != 0) goto L_0x0063
            java.lang.String r5 = "Util"
            java.lang.String r1 = ""
            android.util.Log.e(r5, r1, r4)
        L_0x0063:
            if (r3 == 0) goto L_0x0068
            r3.disconnect()
        L_0x0068:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.Util.makeHttpRequest(java.lang.String, java.lang.String, java.util.Map):java.net.HttpURLConnection");
    }

    public static String normalizeIPv6(String str) throws Exception {
        if (isIPv6(str)) {
            return InetAddress.getByName(str).getCanonicalHostName();
        }
        throw new Exception("Invalid address: " + str);
    }

    public static boolean objEquals(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static byte[] readAllBytes(InputStream inputStream) {
        byte[] bArr = null;
        if (inputStream == null) {
            return null;
        }
        byte[] bArr2 = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int read = inputStream.read(bArr2, 0, 4096);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            } catch (IOException e10) {
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    if (Build.VERSION.SDK_INT >= 19) {
                        e10.addSuppressed(e11);
                    }
                }
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e12) {
                    if (Build.VERSION.SDK_INT >= 19) {
                        e10.addSuppressed(e12);
                    }
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                    int i10 = Build.VERSION.SDK_INT;
                }
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused2) {
                    int i11 = Build.VERSION.SDK_INT;
                }
                throw th;
            }
        }
        bArr = byteArrayOutputStream.toByteArray();
        try {
            inputStream.close();
        } catch (IOException unused3) {
            int i12 = Build.VERSION.SDK_INT;
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused4) {
            int i13 = Build.VERSION.SDK_INT;
        }
        return bArr;
    }

    public static String replaceAll(String str, String str2, String str3) {
        return TextUtils.join(str3, str.split(Pattern.quote(str2)));
    }
}
