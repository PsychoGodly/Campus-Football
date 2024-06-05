package com.onesignal.flutter;

import com.onesignal.k3;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.c;
import lc.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OneSignalTagsController */
class b extends a implements k3.j0, k3.t0 {

    /* renamed from: d  reason: collision with root package name */
    private k.d f27789d;

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f27790f = new AtomicBoolean(false);

    b(c cVar, k kVar, k.d dVar) {
        this.f27774c = cVar;
        this.f27773b = kVar;
        this.f27789d = dVar;
    }

    public void a(JSONObject jSONObject) {
        if (!this.f27790f.getAndSet(true)) {
            try {
                r(this.f27789d, f.h(jSONObject));
            } catch (JSONException e10) {
                k.d dVar = this.f27789d;
                p(dVar, "OneSignal", "Encountered an error serializing tags into hashmap: " + e10.getMessage() + "\n" + e10.getStackTrace(), (Object) null);
            }
        }
    }

    public void c(JSONObject jSONObject) {
        if (!this.f27790f.getAndSet(true)) {
            try {
                r(this.f27789d, f.h(jSONObject));
            } catch (JSONException e10) {
                k.d dVar = this.f27789d;
                p(dVar, "OneSignal", "Encountered an error serializing tags into hashmap: " + e10.getMessage() + "\n" + e10.getStackTrace(), (Object) null);
            }
        }
    }

    public void i(k3.j1 j1Var) {
        if (!this.f27790f.getAndSet(true)) {
            k.d dVar = this.f27789d;
            p(dVar, "OneSignal", "Encountered an error updating tags (" + j1Var.a() + "): " + j1Var.b(), (Object) null);
        }
    }
}
