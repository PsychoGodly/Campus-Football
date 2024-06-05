package n5;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f20975a;

    public a(Looper looper) {
        this.f20975a = new zzi(looper);
    }

    public final void execute(Runnable runnable) {
        this.f20975a.post(runnable);
    }
}
