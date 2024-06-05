package p7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f36885a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f36886b;

    public /* synthetic */ g(i iVar, int i10) {
        this.f36885a = iVar;
        this.f36886b = i10;
    }

    public final Object then(Task task) {
        return this.f36885a.i(this.f36886b, task);
    }
}
