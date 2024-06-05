package com.onesignal;

import com.onesignal.v3;
import org.json.JSONObject;

/* compiled from: OneSignalRestClientWrapper */
class w3 implements l3 {

    /* compiled from: OneSignalRestClientWrapper */
    class a extends v3.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n3 f28358a;

        a(n3 n3Var) {
            this.f28358a = n3Var;
        }

        public void a(int i10, String str, Throwable th) {
            this.f28358a.a(i10, str, th);
        }

        public void b(String str) {
            this.f28358a.b(str);
        }
    }

    w3() {
    }

    public void a(String str, JSONObject jSONObject, n3 n3Var) {
        v3.j(str, jSONObject, new a(n3Var));
    }
}
