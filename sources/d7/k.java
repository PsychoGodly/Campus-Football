package d7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.c0;
import com.google.firebase.auth.l0;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class k implements Continuation<c0, Task<l0>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ h f28568a;

    k(h hVar) {
        this.f28568a = hVar;
    }

    public final /* synthetic */ Object then(Task task) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(task.getException());
        }
        return Tasks.forResult(o.w(((c0) task.getResult()).g(), this.f28568a.f28558a));
    }
}
