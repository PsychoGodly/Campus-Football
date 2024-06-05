package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class r2 implements Continuation<Void, Task<Void>> {
    r2(FirebaseAuth firebaseAuth) {
    }

    public final /* synthetic */ Object then(Task task) throws Exception {
        return (task.isSuccessful() || !(task.getException() instanceof q) || !((q) task.getException()).a().equals("ERROR_INTERNAL_SUCCESS_SIGN_OUT")) ? task : Tasks.forResult(null);
    }
}
