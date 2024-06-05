package tc;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.messaging.e;
import lc.k;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f38579a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k.d f38580b;

    public /* synthetic */ l(e eVar, k.d dVar) {
        this.f38579a = eVar;
        this.f38580b = dVar;
    }

    public final void onComplete(Task task) {
        this.f38579a.H(this.f38580b, task);
    }
}
