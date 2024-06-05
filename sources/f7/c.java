package f7;

import b8.b;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ c f32580a = new c();

    private /* synthetic */ c() {
    }

    public final Object get() {
        return ExecutorsRegistrar.u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.t())));
    }
}
