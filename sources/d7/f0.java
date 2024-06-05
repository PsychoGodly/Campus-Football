package d7;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001firebaseauthapi.zzacf;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.i;
import java.lang.ref.WeakReference;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class f0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Activity> f28548a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource<i> f28549b;

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseAuth f28550c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f28551d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ v f28552e;

    f0(v vVar, Activity activity, TaskCompletionSource<i> taskCompletionSource, FirebaseAuth firebaseAuth, a0 a0Var) {
        this.f28552e = vVar;
        this.f28548a = new WeakReference<>(activity);
        this.f28549b = taskCompletionSource;
        this.f28550c = firebaseAuth;
        this.f28551d = a0Var;
    }

    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f28548a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f28549b.setException(zzacf.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            v.d(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
                this.f28550c.A(v.a(intent)).addOnSuccessListener(new x(this.f28552e, this.f28549b, context)).addOnFailureListener(new y(this.f28552e, this.f28549b, context));
            } else if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
                this.f28551d.I(v.a(intent)).addOnSuccessListener(new z(this.f28552e, this.f28549b, context)).addOnFailureListener(new a0(this.f28552e, this.f28549b, context));
            } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
                this.f28551d.J(v.a(intent)).addOnSuccessListener(new b0(this.f28552e, this.f28549b, context)).addOnFailureListener(new c0(this.f28552e, this.f28549b, context));
            } else {
                TaskCompletionSource<i> taskCompletionSource = this.f28549b;
                taskCompletionSource.setException(zzacf.zza(q.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
            }
        } else if (c1.d(intent)) {
            this.f28549b.setException(zzacf.zza(c1.a(intent)));
            v.d(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f28549b.setException(zzacf.zza(q.a("WEB_CONTEXT_CANCELED")));
            v.d(context);
        }
    }
}
