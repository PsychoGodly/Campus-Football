package h5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.errorprone.annotations.RestrictedInheritance;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class k {

    /* renamed from: c  reason: collision with root package name */
    private static k f18849c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f18850a;

    /* renamed from: b  reason: collision with root package name */
    private volatile String f18851b;

    public k(Context context) {
        this.f18850a = context.getApplicationContext();
    }

    public static k a(Context context) {
        q.k(context);
        synchronized (k.class) {
            if (f18849c == null) {
                b0.d(context);
                f18849c = new k(context);
            }
        }
        return f18849c;
    }

    static final x d(PackageInfo packageInfo, x... xVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        y yVar = new y(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            if (xVarArr[i10].equals(yVar)) {
                return xVarArr[i10];
            }
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z10) {
        x xVar;
        if (z10 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z10) {
                xVar = d(packageInfo, a0.f18802a);
            } else {
                xVar = d(packageInfo, a0.f18802a[0]);
            }
            if (xVar != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r8 = r8.applicationInfo;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final h5.l0 f(java.lang.String r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r7 = "null pkg"
            if (r6 != 0) goto L_0x0009
            h5.l0 r6 = h5.l0.c(r7)
            return r6
        L_0x0009:
            java.lang.String r8 = r5.f18851b
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0090
            boolean r8 = h5.b0.e()
            r0 = 0
            if (r8 == 0) goto L_0x0023
            android.content.Context r7 = r5.f18850a
            boolean r7 = h5.j.g(r7)
            h5.l0 r7 = h5.b0.b(r6, r7, r0, r0)
            goto L_0x007d
        L_0x0023:
            android.content.Context r8 = r5.f18850a     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0084 }
            r1 = 64
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r6, r1)     // Catch:{ NameNotFoundException -> 0x0084 }
            android.content.Context r1 = r5.f18850a
            boolean r1 = h5.j.g(r1)
            if (r8 != 0) goto L_0x003c
            h5.l0 r7 = h5.l0.c(r7)
            goto L_0x007d
        L_0x003c:
            android.content.pm.Signature[] r7 = r8.signatures
            if (r7 == 0) goto L_0x0077
            int r7 = r7.length
            r2 = 1
            if (r7 == r2) goto L_0x0045
            goto L_0x0077
        L_0x0045:
            h5.y r7 = new h5.y
            android.content.pm.Signature[] r3 = r8.signatures
            r3 = r3[r0]
            byte[] r3 = r3.toByteArray()
            r7.<init>(r3)
            java.lang.String r3 = r8.packageName
            h5.l0 r1 = h5.b0.a(r3, r7, r1, r0)
            boolean r4 = r1.f18854a
            if (r4 == 0) goto L_0x0075
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo
            if (r8 == 0) goto L_0x0075
            int r8 = r8.flags
            r8 = r8 & 2
            if (r8 == 0) goto L_0x0075
            h5.l0 r7 = h5.b0.a(r3, r7, r0, r2)
            boolean r7 = r7.f18854a
            if (r7 == 0) goto L_0x0075
            java.lang.String r7 = "debuggable release cert app rejected"
            h5.l0 r7 = h5.l0.c(r7)
            goto L_0x007d
        L_0x0075:
            r7 = r1
            goto L_0x007d
        L_0x0077:
            java.lang.String r7 = "single cert required"
            h5.l0 r7 = h5.l0.c(r7)
        L_0x007d:
            boolean r8 = r7.f18854a
            if (r8 == 0) goto L_0x0083
            r5.f18851b = r6
        L_0x0083:
            return r7
        L_0x0084:
            r7 = move-exception
            java.lang.String r8 = "no pkg "
            java.lang.String r6 = r8.concat(r6)
            h5.l0 r6 = h5.l0.d(r6, r7)
            return r6
        L_0x0090:
            h5.l0 r6 = h5.l0.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.k.f(java.lang.String, boolean, boolean):h5.l0");
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (j.g(this.f18850a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i10) {
        l0 l0Var;
        int length;
        String[] packagesForUid = this.f18850a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            l0Var = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    q.k(l0Var);
                    break;
                }
                l0Var = f(packagesForUid[i11], false, false);
                if (l0Var.f18854a) {
                    break;
                }
                i11++;
            }
        } else {
            l0Var = l0.c("no pkgs");
        }
        l0Var.e();
        return l0Var.f18854a;
    }
}
