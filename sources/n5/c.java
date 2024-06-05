package n5;

import com.google.android.gms.common.internal.q;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class c implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f20978a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f20979b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    private final ThreadFactory f20980c = Executors.defaultThreadFactory();

    public c(String str) {
        q.l(str, "Name must not be null");
        this.f20978a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f20980c.newThread(new d(runnable, 0));
        String str = this.f20978a;
        int andIncrement = this.f20979b.getAndIncrement();
        newThread.setName(str + "[" + andIncrement + "]");
        return newThread;
    }
}
