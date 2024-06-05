package d7;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzab;
import com.google.android.gms.internal.p001firebaseauthapi.zzafk;
import com.google.android.gms.internal.p001firebaseauthapi.zzag;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class w0 implements Continuation<zzafk, Task<RecaptchaTasksClient>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f28637a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ t0 f28638b;

    w0(t0 t0Var, String str) {
        this.f28638b = t0Var;
        this.f28637a = str;
    }

    public final /* synthetic */ Object then(Task task) throws Exception {
        String str;
        if (!task.isSuccessful()) {
            return Tasks.forException(new u0((String) q.k(((Exception) q.k(task.getException())).getMessage())));
        }
        zzafk zzafk = (zzafk) task.getResult();
        String zza = zzafk.zza();
        if (zzag.zzc(zza)) {
            String str2 = this.f28637a;
            return Tasks.forException(new u0("No Recaptcha Enterprise siteKey configured for tenant/project " + str2));
        }
        List<String> zza2 = zzab.zza('/').zza((CharSequence) zza);
        if (zza2.size() != 4) {
            str = null;
        } else {
            str = zza2.get(3);
        }
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception("Invalid siteKey format " + zza));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            String str3 = this.f28637a;
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + str3);
        }
        this.f28638b.f28620b = zzafk;
        t0 t0Var = this.f28638b;
        Task<RecaptchaTasksClient> a10 = t0Var.f28623e.a((Application) t0Var.f28621c.m(), str);
        this.f28638b.f28619a.put(this.f28637a, a10);
        return a10;
    }
}
