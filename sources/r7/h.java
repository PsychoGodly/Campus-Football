package r7;

import com.google.firebase.firestore.o;
import com.google.firebase.firestore.z;
import java.util.concurrent.Executor;

/* compiled from: AsyncEventListener */
public class h<T> implements o<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f29905a;

    /* renamed from: b  reason: collision with root package name */
    private final o<T> f29906b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f29907c = false;

    public h(Executor executor, o<T> oVar) {
        this.f29905a = executor;
        this.f29906b = oVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Object obj, z zVar) {
        if (!this.f29907c) {
            this.f29906b.a(obj, zVar);
        }
    }

    public void a(T t10, z zVar) {
        this.f29905a.execute(new g(this, t10, zVar));
    }

    public void d() {
        this.f29907c = true;
    }
}
