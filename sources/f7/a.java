package f7;

import b8.b;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f32578a = new a();

    private /* synthetic */ a() {
    }

    public final Object get() {
        return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
    }
}
