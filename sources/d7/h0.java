package d7;

import com.google.android.gms.internal.p001firebaseauthapi.zzxw;
import com.google.firebase.auth.c0;
import java.util.HashMap;
import java.util.Map;
import k5.a;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private static final a f28559a = new a("GetTokenResultFactory", new String[0]);

    public static c0 a(String str) {
        Map map;
        try {
            map = j0.b(str);
        } catch (zzxw e10) {
            f28559a.b("Error parsing token claims", e10, new Object[0]);
            map = new HashMap();
        }
        return new c0(str, map);
    }
}
