package h5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.u0;
import com.google.android.gms.common.internal.v0;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import m5.a;
import m5.j;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class b0 {

    /* renamed from: a  reason: collision with root package name */
    static final z f18808a = new t(x.A1("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));

    /* renamed from: b  reason: collision with root package name */
    static final z f18809b = new u(x.A1("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));

    /* renamed from: c  reason: collision with root package name */
    static final z f18810c = new v(x.A1("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: d  reason: collision with root package name */
    static final z f18811d = new w(x.A1("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: e  reason: collision with root package name */
    private static volatile v0 f18812e;

    /* renamed from: f  reason: collision with root package name */
    private static final Object f18813f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static Context f18814g;

    static l0 a(String str, x xVar, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, xVar, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static l0 b(String str, boolean z10, boolean z11, boolean z12) {
        return g(str, z10, false, false, true);
    }

    static /* synthetic */ String c(boolean z10, String str, x xVar) throws Exception {
        String str2 = true != (!z10 && f(str, xVar, true, false).f18854a) ? "not allowed" : "debug cert rejected";
        MessageDigest b10 = a.b("SHA-256");
        q.k(b10);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", new Object[]{str2, str, j.a(b10.digest(xVar.B1())), Boolean.valueOf(z10), "12451000.false"});
    }

    static synchronized void d(Context context) {
        synchronized (b0.class) {
            if (f18814g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f18814g = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    static boolean e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            h();
            boolean zzi = f18812e.zzi();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return zzi;
        } catch (RemoteException | DynamiteModule.a e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static l0 f(String str, x xVar, boolean z10, boolean z11) {
        try {
            h();
            q.k(f18814g);
            try {
                return f18812e.x1(new g0(str, xVar, z10, z11), b.B1(f18814g.getPackageManager())) ? l0.b() : new j0(new s(z10, str, xVar), (i0) null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return l0.d("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return l0.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.google.android.gms.dynamic.a, android.os.IBinder] */
    private static l0 g(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        l0 l0Var;
        e0 e0Var;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            q.k(f18814g);
            try {
                h();
                c0 c0Var = new c0(str, z10, false, b.B1(f18814g), false);
                if (z13) {
                    e0Var = f18812e.O(c0Var);
                } else {
                    e0Var = f18812e.A(c0Var);
                }
                if (e0Var.v()) {
                    l0Var = l0.f(e0Var.w());
                } else {
                    String zza = e0Var.zza();
                    PackageManager.NameNotFoundException nameNotFoundException = e0Var.x() == 4 ? new PackageManager.NameNotFoundException() : null;
                    if (zza == null) {
                        zza = "error checking package certificate";
                    }
                    l0Var = l0.g(e0Var.w(), e0Var.x(), zza, nameNotFoundException);
                }
            } catch (DynamiteModule.a e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                l0Var = l0.d("module init: ".concat(String.valueOf(e10.getMessage())), e10);
            }
        } catch (RemoteException e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            l0Var = l0.d("module call", e11);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return l0Var;
    }

    private static void h() throws DynamiteModule.a {
        if (f18812e == null) {
            q.k(f18814g);
            synchronized (f18813f) {
                if (f18812e == null) {
                    f18812e = u0.M0(DynamiteModule.e(f18814g, DynamiteModule.f15500f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }
}
