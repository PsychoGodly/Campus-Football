package f7;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements b8.b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f32579a = new b();

    private /* synthetic */ b() {
    }

    public final Object get() {
        return ExecutorsRegistrar.u(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
    }
}
