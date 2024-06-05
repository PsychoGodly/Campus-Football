package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

/* compiled from: GenerateNotificationOpenIntentFromPushPayload.kt */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f28388a = new x();

    private x() {
    }

    private final Intent b(Uri uri) {
        if (uri == null) {
            return null;
        }
        return OSUtils.P(uri);
    }

    private final boolean c(boolean z10, JSONObject jSONObject) {
        return z10 | (n1.a(jSONObject) != null);
    }

    public final w a(Context context, JSONObject jSONObject) {
        m.e(context, "context");
        m.e(jSONObject, "fcmPayload");
        e2 e2Var = new e2(context, jSONObject);
        return new w(context, b(e2Var.b()), c(e2Var.a(), jSONObject));
    }
}
