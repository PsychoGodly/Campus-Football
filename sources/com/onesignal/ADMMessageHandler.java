package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.onesignal.k0;
import com.onesignal.k3;
import org.json.JSONObject;

public class ADMMessageHandler extends ADMMessageHandlerBase {
    private static final int JOB_ID = 123891;

    class a implements k0.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f27476a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27477b;

        a(Bundle bundle, Context context) {
            this.f27476a = bundle;
            this.f27477b = context;
        }

        public void a(k0.f fVar) {
            if (!fVar.c()) {
                JSONObject a10 = k0.a(this.f27476a);
                w1 w1Var = new w1(a10);
                b2 b2Var = new b2(this.f27477b);
                b2Var.q(a10);
                b2Var.o(this.f27477b);
                b2Var.r(w1Var);
                k0.m(b2Var, true);
            }
        }
    }

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    /* access modifiers changed from: protected */
    public void onMessage(Intent intent) {
        Context applicationContext = getApplicationContext();
        Bundle extras = intent.getExtras();
        k0.h(applicationContext, extras, new a(extras, applicationContext));
    }

    /* access modifiers changed from: protected */
    public void onRegistered(String str) {
        k3.r0 r0Var = k3.r0.INFO;
        k3.a(r0Var, "ADM registration ID: " + str);
        b4.c(str);
    }

    /* access modifiers changed from: protected */
    public void onRegistrationError(String str) {
        k3.r0 r0Var = k3.r0.ERROR;
        k3.a(r0Var, "ADM:onRegistrationError: " + str);
        if ("INVALID_SENDER".equals(str)) {
            k3.a(r0Var, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        b4.c((String) null);
    }

    /* access modifiers changed from: protected */
    public void onUnregistered(String str) {
        k3.r0 r0Var = k3.r0.INFO;
        k3.a(r0Var, "ADM:onUnregistered: " + str);
    }
}
