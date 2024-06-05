package com.google.firebase.auth;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Task;
import d7.o;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class x0 {
    public static Task<z0> a(l0 l0Var) {
        q.k(l0Var);
        o oVar = (o) l0Var;
        return FirebaseAuth.getInstance(oVar.v().l0()).W(oVar);
    }

    public static w0 b(z0 z0Var, String str) {
        return new w0((String) q.k(str), (z0) q.k(z0Var), (String) null);
    }

    public static w0 c(String str, String str2) {
        return new w0((String) q.k(str2), (z0) null, (String) q.k(str));
    }
}
