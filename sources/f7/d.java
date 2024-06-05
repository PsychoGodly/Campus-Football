package f7;

import b8.b;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ d f32581a = new d();

    private /* synthetic */ d() {
    }

    public final Object get() {
        return ExecutorsRegistrar.u(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
    }
}
