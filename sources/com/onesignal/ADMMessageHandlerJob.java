package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.onesignal.k0;
import com.onesignal.k3;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

/* compiled from: ADMMessageHandlerJob.kt */
public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {

    /* compiled from: ADMMessageHandlerJob.kt */
    public static final class a implements k0.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f27479a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27480b;

        a(Bundle bundle, Context context) {
            this.f27479a = bundle;
            this.f27480b = context;
        }

        public void a(k0.f fVar) {
            if (fVar == null || !fVar.c()) {
                JSONObject a10 = k0.a(this.f27479a);
                m.d(a10, "bundleAsJSONObject(bundle)");
                w1 w1Var = new w1(a10);
                b2 b2Var = new b2(this.f27480b);
                Context context = this.f27480b;
                b2Var.q(a10);
                b2Var.o(context);
                b2Var.r(w1Var);
                k0.m(b2Var, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMessage(Context context, Intent intent) {
        Bundle extras = intent == null ? null : intent.getExtras();
        k0.h(context, extras, new a(extras, context));
    }

    /* access modifiers changed from: protected */
    public void onRegistered(Context context, String str) {
        k3.a(k3.r0.INFO, m.m("ADM registration ID: ", str));
        b4.c(str);
    }

    /* access modifiers changed from: protected */
    public void onRegistrationError(Context context, String str) {
        k3.r0 r0Var = k3.r0.ERROR;
        k3.a(r0Var, m.m("ADM:onRegistrationError: ", str));
        if (m.a("INVALID_SENDER", str)) {
            k3.a(r0Var, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        b4.c((String) null);
    }

    /* access modifiers changed from: protected */
    public void onUnregistered(Context context, String str) {
        k3.a(k3.r0.INFO, m.m("ADM:onUnregistered: ", str));
    }
}
