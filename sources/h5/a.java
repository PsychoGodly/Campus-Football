package h5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.q;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    boolean f18800a = false;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue f18801b = new LinkedBlockingQueue();

    public IBinder a(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        q.j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f18800a) {
            this.f18800a = true;
            IBinder iBinder = (IBinder) this.f18801b.poll(j10, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f18801b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
