package rc;

import com.google.android.gms.tasks.OnFailureListener;
import lc.d;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f37914a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.b f37915b;

    public /* synthetic */ c(e eVar, d.b bVar) {
        this.f37914a = eVar;
        this.f37915b = bVar;
    }

    public final void onFailure(Exception exc) {
        this.f37914a.b(this.f37915b, exc);
    }
}
