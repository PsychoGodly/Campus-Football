package d7;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzacf;
import com.google.android.gms.internal.p001firebaseauthapi.zzadr;
import com.google.android.gms.internal.p001firebaseauthapi.zzaed;
import com.google.android.gms.internal.p001firebaseauthapi.zzafj;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.t;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class d0 {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final String f28533b = "d0";

    /* renamed from: c  reason: collision with root package name */
    private static final d0 f28534c = new d0();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f28535a;

    private d0() {
    }

    public static d0 b() {
        return f28534c;
    }

    private final void d(FirebaseAuth firebaseAuth, e1 e1Var, Activity activity, TaskCompletionSource<g1> taskCompletionSource) {
        Task task;
        if (activity == null) {
            taskCompletionSource.setException(new t());
            return;
        }
        m0.d(firebaseAuth.l().m(), firebaseAuth);
        q.k(activity);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        if (!v.b().h(activity, taskCompletionSource2)) {
            task = Tasks.forException(zzacf.zza(new Status(17057, "reCAPTCHA flow already in progress")));
        } else {
            new zzadr(firebaseAuth, activity).zza();
            task = taskCompletionSource2.getTask();
        }
        task.addOnSuccessListener(new h1(this, taskCompletionSource)).addOnFailureListener(new b1(this, taskCompletionSource));
    }

    public static boolean f(Exception exc) {
        if (!(exc instanceof t)) {
            return (exc instanceof com.google.firebase.auth.q) && ((com.google.firebase.auth.q) exc).a().endsWith("UNAUTHORIZED_DOMAIN");
        }
        return true;
    }

    public final Task<g1> a(FirebaseAuth firebaseAuth, String str, Activity activity, boolean z10, boolean z11) {
        Task<zzafj> task;
        e eVar = (e) firebaseAuth.o();
        e1 f10 = e1.f();
        if (zzaed.zza(firebaseAuth.l()) || eVar.h()) {
            return Tasks.forResult(new n1().a());
        }
        String str2 = f28533b;
        boolean f11 = eVar.f();
        Log.i(str2, "ForceRecaptchaFlow from phoneAuthOptions = " + z11 + ", ForceRecaptchaFlow from firebaseSettings = " + f11);
        boolean f12 = z11 | eVar.f();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Task<String> e10 = f10.e();
        if (e10 != null) {
            if (e10.isSuccessful()) {
                return Tasks.forResult(new n1().c(e10.getResult()).a());
            }
            String message = e10.getException().getMessage();
            Log.e(str2, "Error in previous reCAPTCHA flow: " + message);
            Log.e(str2, "Continuing with application verification as normal");
        }
        if (!z10 || f12) {
            d(firebaseAuth, f10, activity, taskCompletionSource);
        } else {
            IntegrityManager create = IntegrityManagerFactory.create(firebaseAuth.l().m());
            if (!TextUtils.isEmpty(this.f28535a)) {
                task = Tasks.forResult(new zzafj(this.f28535a));
            } else {
                task = firebaseAuth.J();
            }
            task.continueWithTask(firebaseAuth.D0(), new f1(this, str, create)).addOnCompleteListener(new c(this, taskCompletionSource, firebaseAuth, f10, activity));
        }
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, e1 e1Var, Activity activity, Task task) {
        if (task.isSuccessful() && task.getResult() != null && !TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) {
            taskCompletionSource.setResult(new n1().b(((IntegrityTokenResponse) task.getResult()).token()).a());
            return;
        }
        String message = task.getException() == null ? MaxReward.DEFAULT_LABEL : task.getException().getMessage();
        String str = f28533b;
        Log.e(str, "Play Integrity Token fetch failed, falling back to Recaptcha" + message);
        d(firebaseAuth, e1Var, activity, taskCompletionSource);
    }
}
