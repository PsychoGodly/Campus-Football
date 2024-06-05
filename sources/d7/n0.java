package d7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final /* synthetic */ class n0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ RecaptchaAction f28581a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ FirebaseAuth f28582b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ String f28583c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ Continuation f28584d;

    public /* synthetic */ n0(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation) {
        this.f28581a = recaptchaAction;
        this.f28582b = firebaseAuth;
        this.f28583c = str;
        this.f28584d = continuation;
    }

    public final Object then(Task task) {
        return o0.a(this.f28581a, this.f28582b, this.f28583c, this.f28584d, task);
    }
}
