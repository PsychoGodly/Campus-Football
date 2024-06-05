package com.google.android.gms.net;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h5.f;
import h5.g;
import h5.h;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;

/* compiled from: com.google.android.gms:play-services-cronet@@17.0.1 */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f25330a = "Google-Play-Services-Cronet-Provider";

    /* renamed from: b  reason: collision with root package name */
    private static final String f25331b = "a";

    /* renamed from: c  reason: collision with root package name */
    private static final f f25332c = f.h();

    /* renamed from: d  reason: collision with root package name */
    private static final Object f25333d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static DynamiteModule f25334e = null;

    /* renamed from: f  reason: collision with root package name */
    private static String f25335f = "0";

    private a() {
    }

    public static Task<Void> a(Context context) {
        q.l(context, "Context must not be null");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (b()) {
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }
        new Thread(new s5.a(context, taskCompletionSource)).start();
        return taskCompletionSource.getTask();
    }

    public static boolean b() {
        return c() != null;
    }

    static DynamiteModule c() {
        DynamiteModule dynamiteModule;
        synchronized (f25333d) {
            dynamiteModule = f25334e;
        }
        return dynamiteModule;
    }

    static String d() {
        String str;
        synchronized (f25333d) {
            str = f25335f;
        }
        return str;
    }

    @Deprecated
    public static void e(Context context) throws g, h {
        Class<a> cls = a.class;
        synchronized (f25333d) {
            if (!b()) {
                q.l(context, "Context must not be null");
                try {
                    ((ClassLoader) q.k(cls.getClassLoader())).loadClass("org.chromium.net.CronetEngine");
                    int apiLevel = ApiVersion.getApiLevel();
                    f fVar = f25332c;
                    fVar.n(context, 11925000);
                    DynamiteModule e10 = DynamiteModule.e(context, DynamiteModule.f15496b, "com.google.android.gms.cronet_dynamite");
                    Class<?> loadClass = e10.b().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (loadClass.getClassLoader() != cls.getClassLoader()) {
                        Method method = loadClass.getMethod("getApiLevel", new Class[0]);
                        Method method2 = loadClass.getMethod("getCronetVersion", new Class[0]);
                        int intValue = ((Integer) q.k((Integer) method.invoke((Object) null, new Object[0]))).intValue();
                        f25335f = (String) q.k((String) method2.invoke((Object) null, new Object[0]));
                        if (apiLevel > intValue) {
                            Intent d10 = fVar.d(context, 2, "cr");
                            if (d10 == null) {
                                Log.e(f25331b, "Unable to fetch error resolution intent");
                                throw new g(2);
                            }
                            String str = f25335f;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 174);
                            sb2.append("Google Play Services update is required. The API Level of the client is ");
                            sb2.append(apiLevel);
                            sb2.append(". The API Level of the implementation is ");
                            sb2.append(intValue);
                            sb2.append(". The Cronet implementation version is ");
                            sb2.append(str);
                            throw new h(2, sb2.toString(), d10);
                        }
                        f25334e = e10;
                        return;
                    }
                    Log.e(f25331b, "ImplVersion class is missing from Cronet module.");
                    throw new g(8);
                } catch (ClassNotFoundException e11) {
                    Log.e(f25331b, "Cronet API is not available. Have you included all required dependencies?");
                    throw ((g) new g(10).initCause(e11));
                } catch (DynamiteModule.a e12) {
                    Log.e(f25331b, "Unable to load Cronet module", e12);
                    throw ((g) new g(8).initCause(e12));
                } catch (Exception e13) {
                    Log.e(f25331b, "Unable to read Cronet version from the Cronet module ", e13);
                    throw ((g) new g(8).initCause(e13));
                }
            }
        }
    }
}
