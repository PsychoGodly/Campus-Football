package d7;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.c0;
import y6.f;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f28605a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s f28606b;

    r(s sVar, String str) {
        this.f28606b = sVar;
        this.f28605a = q.g(str);
    }

    public final void run() {
        FirebaseAuth instance = FirebaseAuth.getInstance(f.p(this.f28605a));
        if (instance.m() != null) {
            Task<c0> d10 = instance.d(true);
            s.f28610h.g("Token refreshing started", new Object[0]);
            d10.addOnFailureListener(new u(this));
        }
    }
}
