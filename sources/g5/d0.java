package g5;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f18125a;

    public /* synthetic */ d0(TaskCompletionSource taskCompletionSource) {
        this.f18125a = taskCompletionSource;
    }

    public final void run() {
        if (this.f18125a.trySetException(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }
}
