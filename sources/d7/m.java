package d7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.i;
import com.google.firebase.auth.x;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class m implements Continuation<i, Task<i>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ j f28574a;

    m(j jVar) {
        this.f28574a = jVar;
    }

    public final /* synthetic */ Object then(Task task) throws Exception {
        if (this.f28574a.f28564d == null) {
            return task;
        }
        if (task.isSuccessful()) {
            i iVar = (i) task.getResult();
            return Tasks.forResult(new w1((d) iVar.V(), (u1) iVar.P(), this.f28574a.f28564d));
        }
        Exception exception = task.getException();
        if (exception instanceof x) {
            ((x) exception).d(this.f28574a.f28564d);
        }
        return Tasks.forException(exception);
    }
}
