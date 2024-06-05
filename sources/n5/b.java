package n5;

import com.google.android.gms.common.internal.q;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f20976a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadFactory f20977b = Executors.defaultThreadFactory();

    public b(String str) {
        q.l(str, "Name must not be null");
        this.f20976a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f20977b.newThread(new d(runnable, 0));
        newThread.setName(this.f20976a);
        return newThread;
    }
}
