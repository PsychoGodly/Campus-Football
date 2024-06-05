package d7;

import com.google.android.gms.tasks.OnFailureListener;
import y6.m;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class u implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ r f28624a;

    u(r rVar) {
        this.f28624a = rVar;
    }

    public final void onFailure(Exception exc) {
        if (exc instanceof m) {
            s.f28610h.g("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f28624a.f28606b.d();
        }
    }
}
