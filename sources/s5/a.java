package s5;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-cronet@@17.0.1 */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f30116a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f30117b;

    public /* synthetic */ a(Context context, TaskCompletionSource taskCompletionSource) {
        this.f30116a = context;
        this.f30117b = taskCompletionSource;
    }

    public final void run() {
        Context context = this.f30116a;
        TaskCompletionSource taskCompletionSource = this.f30117b;
        String str = com.google.android.gms.net.a.f25330a;
        try {
            com.google.android.gms.net.a.e(context);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }
}
