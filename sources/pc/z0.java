package pc;

import pc.a1;

/* compiled from: FlutterFirebaseTotpSecret */
public class z0 implements a1.l {
    public void a(String str, String str2, a1.f0<Void> f0Var) {
        y0.f37260a.get(str).h(str2);
        f0Var.success(null);
    }

    public void b(String str, String str2, String str3, a1.f0<String> f0Var) {
        com.google.firebase.auth.z0 z0Var = y0.f37260a.get(str);
        if (str2 == null || str3 == null) {
            f0Var.success(z0Var.d());
        } else {
            f0Var.success(z0Var.c(str2, str3));
        }
    }
}
