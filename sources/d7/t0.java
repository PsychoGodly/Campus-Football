package d7;

import com.google.android.gms.internal.p001firebaseauthapi.zzafk;
import com.google.android.gms.internal.p001firebaseauthapi.zzag;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import y6.f;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    Map<String, Task<RecaptchaTasksClient>> f28619a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public zzafk f28620b;

    /* renamed from: c  reason: collision with root package name */
    f f28621c;

    /* renamed from: d  reason: collision with root package name */
    private FirebaseAuth f28622d;

    /* renamed from: e  reason: collision with root package name */
    s0 f28623e;

    public t0(f fVar, FirebaseAuth firebaseAuth) {
        this(fVar, firebaseAuth, new r0());
    }

    private final Task<RecaptchaTasksClient> e(String str) {
        return this.f28619a.get(str);
    }

    private static String f(String str) {
        return zzag.zzc(str) ? "*" : str;
    }

    public final Task<RecaptchaTasksClient> a(String str, Boolean bool) {
        Task<RecaptchaTasksClient> e10;
        String f10 = f(str);
        if (bool.booleanValue() || (e10 = e(f10)) == null) {
            return this.f28622d.X("RECAPTCHA_ENTERPRISE").continueWithTask(new w0(this, f10));
        }
        return e10;
    }

    public final Task<String> b(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        String f10 = f(str);
        Task<RecaptchaTasksClient> e10 = e(f10);
        if (bool.booleanValue() || e10 == null) {
            e10 = a(f10, bool);
        }
        return e10.continueWithTask(new v0(this, recaptchaAction));
    }

    public final boolean d(String str) {
        zzafk zzafk = this.f28620b;
        return zzafk != null && zzafk.zzb(str);
    }

    private t0(f fVar, FirebaseAuth firebaseAuth, s0 s0Var) {
        this.f28619a = new HashMap();
        this.f28621c = fVar;
        this.f28622d = firebaseAuth;
        this.f28623e = s0Var;
    }
}
