package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import i5.c;
import y6.l;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class q0 {

    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static class a extends i5.a {
        public static final Parcelable.Creator<a> CREATOR = new b2();

        a() {
        }

        public static a v() {
            return new a();
        }

        public void writeToParcel(Parcel parcel, int i10) {
            c.b(parcel, c.a(parcel));
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static abstract class b {
        private static final k5.a zza = new k5.a("PhoneAuthProvider", new String[0]);

        public void onCodeAutoRetrievalTimeOut(String str) {
            zza.e("Sms auto retrieval timed-out.", new Object[0]);
        }

        public void onCodeSent(String str, a aVar) {
        }

        public abstract void onVerificationCompleted(o0 o0Var);

        public abstract void onVerificationFailed(l lVar);
    }

    public static o0 a(String str, String str2) {
        return o0.z(str, str2);
    }

    public static void b(p0 p0Var) {
        q.k(p0Var);
        FirebaseAuth.i0(p0Var);
    }
}
