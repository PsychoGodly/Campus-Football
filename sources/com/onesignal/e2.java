package com.onesignal;

import android.content.Context;
import android.net.Uri;
import com.applovin.mediation.MaxReward;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

/* compiled from: OSNotificationOpenBehaviorFromPushPayload.kt */
public final class e2 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f27666a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f27667b;

    public e2(Context context, JSONObject jSONObject) {
        m.e(context, "context");
        m.e(jSONObject, "fcmPayload");
        this.f27666a = context;
        this.f27667b = jSONObject;
    }

    public final boolean a() {
        return d2.f27648a.a(this.f27666a) && b() == null;
    }

    public final Uri b() {
        d2 d2Var = d2.f27648a;
        if (!d2Var.a(this.f27666a) || d2Var.b(this.f27666a)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(this.f27667b.optString("custom"));
        if (jSONObject.has("u")) {
            String optString = jSONObject.optString("u");
            if (!m.a(optString, MaxReward.DEFAULT_LABEL)) {
                m.d(optString, "url");
                int length = optString.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = m.f(optString.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (!z10) {
                        if (!z11) {
                            z10 = true;
                        } else {
                            i10++;
                        }
                    } else if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                }
                return Uri.parse(optString.subSequence(i10, length + 1).toString());
            }
        }
        return null;
    }
}
