package d7;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001firebaseauthapi.zzacf;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class e0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Activity> f28540a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource<String> f28541b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ v f28542c;

    e0(v vVar, Activity activity, TaskCompletionSource<String> taskCompletionSource) {
        this.f28542c = vVar;
        this.f28540a = new WeakReference<>(activity);
        this.f28541b = taskCompletionSource;
    }

    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f28540a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f28541b.setException(zzacf.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            v.d(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                v.e(this.f28542c, intent, this.f28541b, context);
                return;
            }
            TaskCompletionSource<String> taskCompletionSource = this.f28541b;
            taskCompletionSource.setException(zzacf.zza(q.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        } else if (c1.d(intent)) {
            this.f28541b.setException(zzacf.zza(c1.a(intent)));
            v.d(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f28541b.setException(zzacf.zza(q.a("WEB_CONTEXT_CANCELED")));
            v.d(context);
        }
    }
}
