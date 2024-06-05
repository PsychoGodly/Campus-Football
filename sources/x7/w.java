package x7;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import x7.y;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class w implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f39315a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y.e f39316b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f39317c;

    public /* synthetic */ w(y yVar, y.e eVar, Object obj) {
        this.f39315a = yVar;
        this.f39316b = eVar;
        this.f39317c = obj;
    }

    public final void onComplete(Task task) {
        this.f39315a.k(this.f39316b, this.f39317c, task);
    }
}
