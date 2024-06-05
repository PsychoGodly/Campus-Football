package g5;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class b0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f18109a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f18110b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ScheduledFuture f18111c;

    public /* synthetic */ b0(d dVar, String str, ScheduledFuture scheduledFuture) {
        this.f18109a = dVar;
        this.f18110b = str;
        this.f18111c = scheduledFuture;
    }

    public final void onComplete(Task task) {
        this.f18109a.e(this.f18110b, this.f18111c, task);
    }
}
