package com.google.firebase.auth;

import com.google.android.gms.common.internal.q;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class k {
    public static h a(String str, String str2) {
        q.g(str);
        q.g(str2);
        return new j(str, str2);
    }

    public static h b(String str, String str2) {
        if (j.z(str2)) {
            return new j(str, (String) null, str2, (String) null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }
}
