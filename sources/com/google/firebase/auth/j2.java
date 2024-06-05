package com.google.firebase.auth;

import android.util.Log;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import d7.d0;
import d7.g1;
import y6.l;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class j2 implements OnCompleteListener<g1> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ p0 f26260a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f26261b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f26262c;

    j2(FirebaseAuth firebaseAuth, p0 p0Var, String str) {
        this.f26262c = firebaseAuth;
        this.f26260a = p0Var;
        this.f26261b = str;
    }

    public final void onComplete(Task<g1> task) {
        String str;
        String str2 = null;
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            Log.e("FirebaseAuth", "Error while validating application identity: " + (exception != null ? exception.getMessage() : MaxReward.DEFAULT_LABEL));
            if (exception == null || !d0.f(exception)) {
                Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                str = null;
            } else {
                FirebaseAuth.l0((l) exception, this.f26260a, this.f26261b);
                return;
            }
        } else {
            str2 = task.getResult().c();
            str = task.getResult().a();
        }
        this.f26262c.j0(this.f26260a, str2, str);
    }
}
