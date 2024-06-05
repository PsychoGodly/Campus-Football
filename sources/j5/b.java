package j5;

import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final /* synthetic */ class b implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f19494a;

    public /* synthetic */ b(u uVar) {
        this.f19494a = uVar;
    }

    public final void accept(Object obj, Object obj2) {
        u uVar = this.f19494a;
        int i10 = d.f19498d;
        ((a) ((e) obj).getService()).M0(uVar);
        ((TaskCompletionSource) obj2).setResult(null);
    }
}
