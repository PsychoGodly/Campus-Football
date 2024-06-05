package t5;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamite.DynamiteModule;
import h5.f;
import h5.g;
import h5.h;
import h5.j;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final f f30337a = f.h();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f30338b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static Method f30339c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Method f30340d = null;

    public static void a(Context context) throws h, g {
        Context context2;
        q.l(context, "Context must not be null");
        f30337a.n(context, 11925000);
        synchronized (f30338b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.e(context, DynamiteModule.f15500f, "com.google.android.gms.providerinstaller.dynamite").b();
            } catch (DynamiteModule.a e10) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage())));
                context2 = null;
            }
            if (context2 == null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Context e11 = j.e(context);
                if (e11 != null) {
                    try {
                        if (f30340d == null) {
                            Class cls = Long.TYPE;
                            f30340d = b(e11, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                        }
                        f30340d.invoke((Object) null, new Object[]{context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2)});
                    } catch (Exception e12) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e12.getMessage())));
                    }
                }
                if (e11 != null) {
                    c(e11, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new g(8);
                }
            } else {
                c(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
            }
        }
    }

    private static Method b(Context context, String str, String str2, Class[] clsArr) throws ClassNotFoundException, NoSuchMethodException {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    private static void c(Context context, Context context2, String str) throws g {
        try {
            if (f30339c == null) {
                f30339c = b(context, str, "insertProvider", new Class[]{Context.class});
            }
            f30339c.invoke((Object) null, new Object[]{context});
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.getMessage() : cause.getMessage())));
            }
            throw new g(8);
        }
    }
}
