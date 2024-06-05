package com.onesignal;

import com.onesignal.g0;
import com.onesignal.k3;
import com.onesignal.v3;
import com.onesignal.w4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OneSignalStateSynchronizer */
class y3 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f28453a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static HashMap<d, w4> f28454b = new HashMap<>();

    /* compiled from: OneSignalStateSynchronizer */
    class a implements k3.v0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f28455a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k3.s0 f28456b;

        /* renamed from: com.onesignal.y3$a$a  reason: collision with other inner class name */
        /* compiled from: OneSignalStateSynchronizer */
        class C0296a implements Runnable {
            C0296a() {
            }

            public void run() {
                a aVar = a.this;
                k3.s0 s0Var = aVar.f28456b;
                if (s0Var != null) {
                    s0Var.a(aVar.f28455a);
                }
            }
        }

        a(JSONObject jSONObject, k3.s0 s0Var) {
            this.f28455a = jSONObject;
            this.f28456b = s0Var;
        }

        public void a(String str, boolean z10) {
            k3.r0 r0Var = k3.r0.VERBOSE;
            k3.A1(r0Var, "Completed request to update external user id for channel: " + str + " and success: " + z10);
            try {
                this.f28455a.put(str, new JSONObject().put("success", z10));
            } catch (JSONException e10) {
                k3.r0 r0Var2 = k3.r0.ERROR;
                k3.A1(r0Var2, "Error while adding the success status of external id for channel: " + str);
                e10.printStackTrace();
            }
            for (w4 w4Var : y3.f28454b.values()) {
                if (w4Var.K()) {
                    k3.r0 r0Var3 = k3.r0.VERBOSE;
                    k3.A1(r0Var3, "External user id handlers are still being processed for channel: " + w4Var.z() + " , wait until finished before proceeding");
                    return;
                }
            }
            q.f28088a.b(new C0296a());
        }
    }

    /* compiled from: OneSignalStateSynchronizer */
    interface b {
        void a(c cVar);

        void b(String str);
    }

    /* compiled from: OneSignalStateSynchronizer */
    static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f28458a;

        /* renamed from: b  reason: collision with root package name */
        public String f28459b;

        c(int i10, String str) {
            this.f28458a = i10;
            this.f28459b = str;
        }
    }

    /* compiled from: OneSignalStateSynchronizer */
    enum d {
        PUSH,
        EMAIL,
        SMS
    }

    static void A(boolean z10) {
        e().r0(z10);
    }

    static void B(boolean z10) {
        e().e0(z10);
        c().e0(z10);
        g().e0(z10);
    }

    static void C(JSONObject jSONObject, b bVar) {
        e().f0(jSONObject, bVar);
        c().f0(jSONObject, bVar);
        g().f0(jSONObject, bVar);
    }

    static void D(g0.d dVar) {
        e().h0(dVar);
        c().h0(dVar);
        g().h0(dVar);
    }

    static void E(JSONObject jSONObject) {
        e().s0(jSONObject);
    }

    static void b() {
        e().o();
        c().o();
        g().o();
    }

    static q4 c() {
        HashMap<d, w4> hashMap = f28454b;
        d dVar = d.EMAIL;
        if (!hashMap.containsKey(dVar) || f28454b.get(dVar) == null) {
            synchronized (f28453a) {
                if (f28454b.get(dVar) == null) {
                    f28454b.put(dVar, new q4());
                }
            }
        }
        return (q4) f28454b.get(dVar);
    }

    static String d() {
        return e().j0();
    }

    static s4 e() {
        HashMap<d, w4> hashMap = f28454b;
        d dVar = d.PUSH;
        if (!hashMap.containsKey(dVar) || f28454b.get(dVar) == null) {
            synchronized (f28453a) {
                if (f28454b.get(dVar) == null) {
                    f28454b.put(dVar, new s4());
                }
            }
        }
        return (s4) f28454b.get(dVar);
    }

    static String f() {
        return e().E();
    }

    static u4 g() {
        HashMap<d, w4> hashMap = f28454b;
        d dVar = d.SMS;
        if (!hashMap.containsKey(dVar) || f28454b.get(dVar) == null) {
            synchronized (f28453a) {
                if (f28454b.get(dVar) == null) {
                    f28454b.put(dVar, new u4());
                }
            }
        }
        return (u4) f28454b.get(dVar);
    }

    static boolean h() {
        return e().F() || c().F() || g().F();
    }

    static w4.e i(boolean z10) {
        return e().k0(z10);
    }

    static List<w4> j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(e());
        if (k3.a1()) {
            arrayList.add(c());
        }
        if (k3.b1()) {
            arrayList.add(g());
        }
        return arrayList;
    }

    static boolean k() {
        return e().l0();
    }

    static void l() {
        e().L();
        c().L();
        g().L();
    }

    static void m() {
        e().m0();
        c().p0();
    }

    static void n() {
        g().p0();
        e().n0();
    }

    static boolean o() {
        boolean R = e().R();
        boolean R2 = c().R();
        boolean R3 = g().R();
        if (R2) {
            R2 = c().E() != null;
        }
        if (R3) {
            R3 = g().E() != null;
        }
        if (R || R2 || R3) {
            return true;
        }
        return false;
    }

    static void p(boolean z10) {
        e().S(z10);
        c().S(z10);
        g().S(z10);
    }

    static void q() {
        c().n0();
        g().n0();
    }

    static void r() {
        e().T();
        c().T();
        g().T();
        e().V((String) null);
        c().V((String) null);
        g().V((String) null);
        k3.u2(-3660);
    }

    static void s(JSONObject jSONObject, v3.g gVar) {
        for (w4 X : j()) {
            X.X(jSONObject, gVar);
        }
    }

    static void t(JSONObject jSONObject, k3.j0 j0Var) {
        try {
            JSONObject put = new JSONObject().put("tags", jSONObject);
            e().Y(put, j0Var);
            c().Y(put, j0Var);
            g().Y(put, j0Var);
        } catch (JSONException e10) {
            if (j0Var != null) {
                j0Var.i(new k3.j1(-1, "Encountered an error attempting to serialize your tags into JSON: " + e10.getMessage() + "\n" + e10.getStackTrace()));
            }
            e10.printStackTrace();
        }
    }

    static void u(String str, String str2) {
        e().o0(str, str2);
        c().o0(str, str2);
    }

    static void v(String str, String str2, k3.s0 s0Var) throws JSONException {
        a aVar = new a(new JSONObject(), s0Var);
        for (w4 b02 : j()) {
            b02.b0(str, str2, aVar);
        }
    }

    static void w() {
        e().c0();
        c().c0();
        g().c0();
    }

    static void x() {
        c().c0();
    }

    static void y(boolean z10) {
        e().p0(z10);
    }

    static void z(String str, String str2) {
        e().q0(str, str2);
        g().o0(str, str2);
    }
}
