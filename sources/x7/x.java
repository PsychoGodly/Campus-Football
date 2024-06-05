package x7;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import dd.g;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class x implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f39318a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g[] f39319b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j0 f39320c;

    public /* synthetic */ x(y yVar, g[] gVarArr, j0 j0Var) {
        this.f39318a = yVar;
        this.f39319b = gVarArr;
        this.f39320c = j0Var;
    }

    public final void onComplete(Task task) {
        this.f39318a.i(this.f39319b, this.f39320c, task);
    }
}
