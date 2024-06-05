package d7;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzafj;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.security.MessageDigest;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class f1 implements Continuation<zzafj, Task<IntegrityTokenResponse>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f28553a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IntegrityManager f28554b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ d0 f28555c;

    f1(d0 d0Var, String str, IntegrityManager integrityManager) {
        this.f28555c = d0Var;
        this.f28553a = str;
        this.f28554b = integrityManager;
    }

    public final /* synthetic */ Object then(Task task) throws Exception {
        if (task.isSuccessful()) {
            this.f28555c.f28535a = ((zzafj) task.getResult()).zza();
            return this.f28554b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(((zzafj) task.getResult()).zza())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f28553a.getBytes("UTF-8")), 11))).build());
        }
        String g10 = d0.f28533b;
        String message = task.getException().getMessage();
        Log.e(g10, "Problem retrieving Play Integrity producer project:  " + message);
        return Tasks.forException(task.getException());
    }
}
