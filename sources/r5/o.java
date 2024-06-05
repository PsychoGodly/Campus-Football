package r5;

import com.google.android.gms.internal.measurement.zzx;
import com.google.android.gms.measurement.internal.i5;
import com.google.android.gms.measurement.internal.k5;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ i5 f29770a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f29771b;

    public /* synthetic */ o(i5 i5Var, String str) {
        this.f29770a = i5Var;
        this.f29771b = str;
    }

    public final Object call() {
        return new zzx("internal.appMetadata", new k5(this.f29770a, this.f29771b));
    }
}
