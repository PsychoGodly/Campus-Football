package d7;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.h0;
import com.google.firebase.auth.i0;
import com.google.firebase.auth.j0;
import com.google.firebase.auth.l0;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class h extends h0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final d f28558a;

    public h(d dVar) {
        q.k(dVar);
        this.f28558a = dVar;
    }

    public final Task<Void> a(i0 i0Var, String str) {
        q.k(i0Var);
        d dVar = this.f28558a;
        return FirebaseAuth.getInstance(dVar.l0()).P(dVar, i0Var, str);
    }

    public final List<j0> b() {
        return this.f28558a.zzh();
    }

    public final Task<l0> c() {
        return this.f28558a.w(false).continueWithTask(new k(this));
    }

    public final Task<Void> d(String str) {
        q.g(str);
        d dVar = this.f28558a;
        return FirebaseAuth.getInstance(dVar.l0()).T(dVar, str);
    }
}
