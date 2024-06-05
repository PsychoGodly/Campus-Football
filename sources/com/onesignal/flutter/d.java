package com.onesignal.flutter;

import com.onesignal.k3;
import java.util.Collection;
import java.util.Map;
import lc.c;
import lc.j;
import lc.k;

/* compiled from: OneSignalInAppMessagingController */
public class d extends a implements k.c {

    /* renamed from: d  reason: collision with root package name */
    private k f27793d;

    private void t(j jVar, k.d dVar) {
        try {
            k3.D((Map) jVar.f36117b);
            r(dVar, (Object) null);
        } catch (ClassCastException e10) {
            p(dVar, "OneSignal", "Add triggers failed with error: " + e10.getMessage() + "\n" + e10.getStackTrace(), (Object) null);
        }
    }

    private void u(j jVar, k.d dVar) {
        k3.C1(((Boolean) jVar.f36117b).booleanValue());
        r(dVar, (Object) null);
    }

    static void v(c cVar) {
        d dVar = new d();
        dVar.f27774c = cVar;
        k kVar = new k(cVar, "OneSignal#inAppMessages");
        dVar.f27793d = kVar;
        kVar.e(dVar);
    }

    private void w(j jVar, k.d dVar) {
        k3.V1((String) jVar.f36117b);
        r(dVar, (Object) null);
    }

    private void x(j jVar, k.d dVar) {
        try {
            k3.W1((Collection) jVar.f36117b);
            r(dVar, (Object) null);
        } catch (ClassCastException e10) {
            p(dVar, "OneSignal", "Remove triggers for keys failed with error: " + e10.getMessage() + "\n" + e10.getStackTrace(), (Object) null);
        }
    }

    public void onMethodCall(j jVar, k.d dVar) {
        if (jVar.f36116a.contentEquals("OneSignal#addTrigger")) {
            t(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#addTriggers")) {
            t(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#removeTriggerForKey")) {
            w(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#removeTriggersForKeys")) {
            x(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#getTriggerValueForKey")) {
            r(dVar, k3.Q0((String) jVar.f36117b));
        } else if (jVar.f36116a.contentEquals("OneSignal#pauseInAppMessages")) {
            u(jVar, dVar);
        } else {
            q(dVar);
        }
    }
}
