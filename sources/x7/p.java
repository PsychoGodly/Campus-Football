package x7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f39304a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HashMap f39305b;

    public /* synthetic */ p(q qVar, HashMap hashMap) {
        this.f39304a = qVar;
        this.f39305b = hashMap;
    }

    public final Object then(Task task) {
        return this.f39304a.o(this.f39305b, task);
    }
}
