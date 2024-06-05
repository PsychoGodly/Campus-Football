package com.onesignal.flutter;

import com.onesignal.k3;
import lc.c;
import lc.j;
import lc.k;

/* compiled from: OneSignalOutcomeEventsController */
public class e extends a implements k.c {

    /* renamed from: d  reason: collision with root package name */
    private k f27794d;

    static void t(c cVar) {
        e eVar = new e();
        eVar.f27774c = cVar;
        k kVar = new k(cVar, "OneSignal#outcomes");
        eVar.f27794d = kVar;
        kVar.e(eVar);
    }

    private void u(j jVar, k.d dVar) {
        String str = (String) jVar.f36117b;
        if (str == null || str.isEmpty()) {
            p(dVar, "OneSignal", "sendOutcome() name must not be null or empty", (Object) null);
        } else {
            k3.g2(str, new c(this.f27774c, this.f27794d, dVar));
        }
    }

    private void v(j jVar, k.d dVar) {
        String str = (String) jVar.a("outcome_name");
        Double d10 = (Double) jVar.a("outcome_value");
        if (str == null || str.isEmpty()) {
            p(dVar, "OneSignal", "sendOutcomeWithValue() name must not be null or empty", (Object) null);
        } else if (d10 == null) {
            p(dVar, "OneSignal", "sendOutcomeWithValue() value must not be null", (Object) null);
        } else {
            k3.h2(str, d10.floatValue(), new c(this.f27774c, this.f27794d, dVar));
        }
    }

    private void w(j jVar, k.d dVar) {
        String str = (String) jVar.f36117b;
        if (str == null || str.isEmpty()) {
            p(dVar, "OneSignal", "sendUniqueOutcome() name must not be null or empty", (Object) null);
        } else {
            k3.l2(str, new c(this.f27774c, this.f27794d, dVar));
        }
    }

    public void onMethodCall(j jVar, k.d dVar) {
        if (jVar.f36116a.contentEquals("OneSignal#sendOutcome")) {
            u(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#sendUniqueOutcome")) {
            w(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#sendOutcomeWithValue")) {
            v(jVar, dVar);
        } else {
            q(dVar);
        }
    }
}
