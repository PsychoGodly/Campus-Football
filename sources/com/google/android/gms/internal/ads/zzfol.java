package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzfol {
    private static final Object zza;
    private static final Method zzb;
    private static final Method zzc;

    static {
        Method method;
        Object zzb2 = zzb();
        zza = zzb2;
        Method method2 = null;
        if (zzb2 == null) {
            method = null;
        } else {
            method = zzc("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        zzb = method;
        if (zzb2 != null) {
            method2 = zzd(zzb2);
        }
        zzc = method2;
    }

    public static String zza(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static Object zzb() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method zzc(String str, Class... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method zzd(Object obj) {
        try {
            Method zzc2 = zzc("getStackTraceDepth", Throwable.class);
            if (zzc2 == null) {
                return null;
            }
            zzc2.invoke(obj, new Object[]{new Throwable()});
            return zzc2;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }
}
