package com.onesignal.flutter;

import com.onesignal.k3;
import java.util.List;
import java.util.Map;
import lc.c;
import lc.j;
import lc.k;
import org.json.JSONObject;

/* compiled from: OneSignalTagsController */
public class g extends a implements k.c {

    /* renamed from: d  reason: collision with root package name */
    private k f27796d;

    private void t(j jVar, k.d dVar) {
        try {
            k3.K((List) jVar.f36117b, new b(this.f27774c, this.f27796d, dVar));
        } catch (ClassCastException e10) {
            p(dVar, "OneSignal", "deleteTags failed with error: " + e10.getMessage() + "\n" + e10.getStackTrace(), (Object) null);
        }
    }

    private void u(j jVar, k.d dVar) {
        k3.M0(new b(this.f27774c, this.f27796d, dVar));
    }

    static void v(c cVar) {
        g gVar = new g();
        gVar.f27774c = cVar;
        k kVar = new k(cVar, "OneSignal#tags");
        gVar.f27796d = kVar;
        kVar.e(gVar);
    }

    private void w(j jVar, k.d dVar) {
        try {
            k3.k2(new JSONObject((Map) jVar.f36117b), new b(this.f27774c, this.f27796d, dVar));
        } catch (ClassCastException e10) {
            p(dVar, "OneSignal", "sendTags failed with error: " + e10.getMessage() + "\n" + e10.getStackTrace(), (Object) null);
        }
    }

    public void onMethodCall(j jVar, k.d dVar) {
        if (jVar.f36116a.contentEquals("OneSignal#getTags")) {
            u(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#sendTags")) {
            w(jVar, dVar);
        } else if (jVar.f36116a.contentEquals("OneSignal#deleteTags")) {
            t(jVar, dVar);
        } else {
            q(dVar);
        }
    }
}
