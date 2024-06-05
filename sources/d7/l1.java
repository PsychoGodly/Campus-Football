package d7;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzagt;
import com.google.firebase.auth.a1;
import com.google.firebase.auth.d0;
import com.google.firebase.auth.d2;
import com.google.firebase.auth.f0;
import com.google.firebase.auth.h;
import com.google.firebase.auth.l;
import com.google.firebase.auth.u0;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class l1 {
    public static zzagt a(h hVar, String str) {
        q.k(hVar);
        if (f0.class.isAssignableFrom(hVar.getClass())) {
            return f0.y((f0) hVar, str);
        }
        if (l.class.isAssignableFrom(hVar.getClass())) {
            return l.y((l) hVar, str);
        }
        if (a1.class.isAssignableFrom(hVar.getClass())) {
            return a1.y((a1) hVar, str);
        }
        if (d0.class.isAssignableFrom(hVar.getClass())) {
            return d0.y((d0) hVar, str);
        }
        if (u0.class.isAssignableFrom(hVar.getClass())) {
            return u0.y((u0) hVar, str);
        }
        if (d2.class.isAssignableFrom(hVar.getClass())) {
            return d2.C((d2) hVar, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
