package com.onesignal;

import com.onesignal.k3;
import ia.e;
import ja.c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: OSSessionManager */
public class s2 {

    /* renamed from: a  reason: collision with root package name */
    protected e f28172a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public b f28173b;

    /* renamed from: c  reason: collision with root package name */
    private v1 f28174c;

    /* compiled from: OSSessionManager */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f28175a;

        a(List list) {
            this.f28175a = list;
        }

        public void run() {
            Thread.currentThread().setPriority(10);
            s2.this.f28173b.a(this.f28175a);
        }
    }

    /* compiled from: OSSessionManager */
    public interface b {
        void a(List<ja.a> list);
    }

    public s2(b bVar, e eVar, v1 v1Var) {
        this.f28173b = bVar;
        this.f28172a = eVar;
        this.f28174c = v1Var;
    }

    private void d(k3.i0 i0Var, String str) {
        boolean z10;
        ja.a aVar;
        this.f28174c.d("OneSignal SessionManager attemptSessionUpgrade with entryAction: " + i0Var);
        ia.a b10 = this.f28172a.b(i0Var);
        List<ia.a> d10 = this.f28172a.d(i0Var);
        ArrayList arrayList = new ArrayList();
        if (b10 != null) {
            aVar = b10.e();
            c cVar = c.DIRECT;
            if (str == null) {
                str = b10.g();
            }
            z10 = o(b10, cVar, str, (JSONArray) null);
        } else {
            z10 = false;
            aVar = null;
        }
        if (z10) {
            this.f28174c.d("OneSignal SessionManager attemptSessionUpgrade channel updated, search for ending direct influences on channels: " + d10);
            arrayList.add(aVar);
            for (ia.a next : d10) {
                if (next.k().d()) {
                    arrayList.add(next.e());
                    next.t();
                }
            }
        }
        this.f28174c.d("OneSignal SessionManager attemptSessionUpgrade try UNATTRIBUTED to INDIRECT upgrade");
        for (ia.a next2 : d10) {
            if (next2.k().g()) {
                JSONArray n10 = next2.n();
                if (n10.length() > 0 && !i0Var.a()) {
                    ja.a e10 = next2.e();
                    if (o(next2, c.INDIRECT, (String) null, n10)) {
                        arrayList.add(e10);
                    }
                }
            }
        }
        k3.a(k3.r0.DEBUG, "Trackers after update attempt: " + this.f28172a.c().toString());
        n(arrayList);
    }

    private void n(List<ja.a> list) {
        v1 v1Var = this.f28174c;
        v1Var.d("OneSignal SessionManager sendSessionEndingWithInfluences with influences: " + list);
        if (list.size() > 0) {
            new Thread(new a(list), "OS_END_CURRENT_SESSION").start();
        }
    }

    private boolean o(ia.a aVar, c cVar, String str, JSONArray jSONArray) {
        if (!p(aVar, cVar, str, jSONArray)) {
            return false;
        }
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.a(r0Var, "OSChannelTracker changed: " + aVar.h() + "\nfrom:\ninfluenceType: " + aVar.k() + ", directNotificationId: " + aVar.g() + ", indirectNotificationIds: " + aVar.j() + "\nto:\ninfluenceType: " + cVar + ", directNotificationId: " + str + ", indirectNotificationIds: " + jSONArray);
        aVar.y(cVar);
        aVar.w(str);
        aVar.x(jSONArray);
        aVar.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Trackers changed to: ");
        sb2.append(this.f28172a.c().toString());
        k3.a(r0Var, sb2.toString());
        return true;
    }

    private boolean p(ia.a aVar, c cVar, String str, JSONArray jSONArray) {
        if (!cVar.equals(aVar.k())) {
            return true;
        }
        c k10 = aVar.k();
        if (k10.d() && aVar.g() != null && !aVar.g().equals(str)) {
            return true;
        }
        if (!k10.f() || aVar.j() == null || aVar.j().length() <= 0 || f0.a(aVar.j(), jSONArray)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void b(JSONObject jSONObject, List<ja.a> list) {
        v1 v1Var = this.f28174c;
        v1Var.d("OneSignal SessionManager addSessionData with influences: " + list.toString());
        this.f28172a.a(jSONObject, list);
        v1 v1Var2 = this.f28174c;
        v1Var2.d("OneSignal SessionManager addSessionIds on jsonObject: " + jSONObject);
    }

    /* access modifiers changed from: package-private */
    public void c(k3.i0 i0Var) {
        d(i0Var, (String) null);
    }

    /* access modifiers changed from: package-private */
    public List<ja.a> e() {
        return this.f28172a.f();
    }

    /* access modifiers changed from: package-private */
    public List<ja.a> f() {
        return this.f28172a.h();
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.f28172a.i();
    }

    /* access modifiers changed from: package-private */
    public void h(String str) {
        v1 v1Var = this.f28174c;
        v1Var.d("OneSignal SessionManager onDirectInfluenceFromIAMClick messageId: " + str);
        o(this.f28172a.e(), c.DIRECT, str, (JSONArray) null);
    }

    /* access modifiers changed from: package-private */
    public void i() {
        this.f28174c.d("OneSignal SessionManager onDirectInfluenceFromIAMClickFinished");
        this.f28172a.e().t();
    }

    /* access modifiers changed from: package-private */
    public void j(k3.i0 i0Var, String str) {
        v1 v1Var = this.f28174c;
        v1Var.d("OneSignal SessionManager onDirectInfluenceFromNotificationOpen notificationId: " + str);
        if (str != null && !str.isEmpty()) {
            d(i0Var, str);
        }
    }

    /* access modifiers changed from: package-private */
    public void k(String str) {
        v1 v1Var = this.f28174c;
        v1Var.d("OneSignal SessionManager onInAppMessageReceived messageId: " + str);
        ia.a e10 = this.f28172a.e();
        e10.v(str);
        e10.t();
    }

    /* access modifiers changed from: package-private */
    public void l(String str) {
        v1 v1Var = this.f28174c;
        v1Var.d("OneSignal SessionManager onNotificationReceived notificationId: " + str);
        if (str != null && !str.isEmpty()) {
            this.f28172a.g().v(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void m(k3.i0 i0Var) {
        boolean z10;
        List<ia.a> d10 = this.f28172a.d(i0Var);
        ArrayList arrayList = new ArrayList();
        v1 v1Var = this.f28174c;
        v1Var.d("OneSignal SessionManager restartSessionIfNeeded with entryAction: " + i0Var + "\n channelTrackers: " + d10.toString());
        for (ia.a next : d10) {
            JSONArray n10 = next.n();
            v1 v1Var2 = this.f28174c;
            v1Var2.d("OneSignal SessionManager restartSessionIfNeeded lastIds: " + n10);
            ja.a e10 = next.e();
            if (n10.length() > 0) {
                z10 = o(next, c.INDIRECT, (String) null, n10);
            } else {
                z10 = o(next, c.UNATTRIBUTED, (String) null, (JSONArray) null);
            }
            if (z10) {
                arrayList.add(e10);
            }
        }
        n(arrayList);
    }
}
