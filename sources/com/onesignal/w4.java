package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.g0;
import com.onesignal.k3;
import com.onesignal.v3;
import com.onesignal.y3;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserStateSynchronizer */
abstract class w4 {

    /* renamed from: a  reason: collision with root package name */
    protected final Object f28360a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public y3.d f28361b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f28362c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public AtomicBoolean f28363d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    private final Queue<k3.j0> f28364e = new ConcurrentLinkedQueue();

    /* renamed from: f  reason: collision with root package name */
    private final Queue<k3.v0> f28365f = new ConcurrentLinkedQueue();

    /* renamed from: g  reason: collision with root package name */
    private final Queue<y3.b> f28366g = new ConcurrentLinkedQueue();

    /* renamed from: h  reason: collision with root package name */
    HashMap<Integer, f> f28367h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private final Object f28368i = new a();

    /* renamed from: j  reason: collision with root package name */
    protected boolean f28369j = false;

    /* renamed from: k  reason: collision with root package name */
    private o4 f28370k;

    /* renamed from: l  reason: collision with root package name */
    private o4 f28371l;

    /* compiled from: UserStateSynchronizer */
    class a {
        a() {
        }
    }

    /* compiled from: UserStateSynchronizer */
    class b extends v3.g {
        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(int i10, String str, Throwable th) {
            k3.r0 r0Var = k3.r0.WARN;
            k3.a(r0Var, "Failed last request. statusCode: " + i10 + "\nresponse: " + str);
            if (w4.this.U(i10, str, "already logged out of email")) {
                w4.this.O();
            } else if (w4.this.U(i10, str, "not a valid device_type")) {
                w4.this.J();
            } else {
                w4.this.I(i10);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(String str) {
            w4.this.O();
        }
    }

    /* compiled from: UserStateSynchronizer */
    class c extends v3.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f28374a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f28375b;

        c(JSONObject jSONObject, JSONObject jSONObject2) {
            this.f28374a = jSONObject;
            this.f28375b = jSONObject2;
        }

        /* access modifiers changed from: package-private */
        public void a(int i10, String str, Throwable th) {
            k3.r0 r0Var = k3.r0.ERROR;
            k3.a(r0Var, "Failed PUT sync request with status code: " + i10 + " and response: " + str);
            synchronized (w4.this.f28360a) {
                if (w4.this.U(i10, str, "No user with this id found")) {
                    w4.this.J();
                } else {
                    w4.this.I(i10);
                }
            }
            if (this.f28374a.has("tags")) {
                w4.this.Z(new k3.j1(i10, str));
            }
            if (this.f28374a.has("external_user_id")) {
                k3.A1(r0Var, "Error setting external user id for push with status code: " + i10 + " and message: " + str);
                w4.this.u();
            }
            if (this.f28374a.has("language")) {
                w4.this.p(new y3.c(i10, str));
            }
        }

        /* access modifiers changed from: package-private */
        public void b(String str) {
            synchronized (w4.this.f28360a) {
                w4.this.A().r(this.f28375b, this.f28374a);
                w4.this.Q(this.f28374a);
            }
            if (this.f28374a.has("tags")) {
                w4.this.a0();
            }
            if (this.f28374a.has("external_user_id")) {
                w4.this.v();
            }
            if (this.f28374a.has("language")) {
                w4.this.q();
            }
        }
    }

    /* compiled from: UserStateSynchronizer */
    class d extends v3.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f28377a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f28378b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f28379c;

        d(JSONObject jSONObject, JSONObject jSONObject2, String str) {
            this.f28377a = jSONObject;
            this.f28378b = jSONObject2;
            this.f28379c = str;
        }

        /* access modifiers changed from: package-private */
        public void a(int i10, String str, Throwable th) {
            synchronized (w4.this.f28360a) {
                w4.this.f28369j = false;
                k3.r0 r0Var = k3.r0.WARN;
                k3.a(r0Var, "Failed last request. statusCode: " + i10 + "\nresponse: " + str);
                if (w4.this.U(i10, str, "not a valid device_type")) {
                    w4.this.J();
                } else {
                    w4.this.I(i10);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(String str) {
            synchronized (w4.this.f28360a) {
                w4 w4Var = w4.this;
                w4Var.f28369j = false;
                w4Var.A().r(this.f28377a, this.f28378b);
                try {
                    k3.r0 r0Var = k3.r0.DEBUG;
                    k3.A1(r0Var, "doCreateOrNewSession:response: " + str);
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("id")) {
                        String optString = jSONObject.optString("id");
                        w4.this.g0(optString);
                        k3.r0 r0Var2 = k3.r0.INFO;
                        k3.a(r0Var2, "Device registered, UserId = " + optString);
                    } else {
                        k3.r0 r0Var3 = k3.r0.INFO;
                        k3.a(r0Var3, "session sent, UserId = " + this.f28379c);
                    }
                    w4.this.H().s("session", Boolean.FALSE);
                    w4.this.H().q();
                    if (jSONObject.has("in_app_messages")) {
                        k3.n0().p0(jSONObject.getJSONArray("in_app_messages"));
                    }
                    w4.this.Q(this.f28378b);
                } catch (JSONException e10) {
                    k3.b(k3.r0.ERROR, "ERROR parsing on_session or create JSON Response.", e10);
                }
            }
        }
    }

    /* compiled from: UserStateSynchronizer */
    static class e {

        /* renamed from: a  reason: collision with root package name */
        boolean f28381a;

        /* renamed from: b  reason: collision with root package name */
        JSONObject f28382b;

        e(boolean z10, JSONObject jSONObject) {
            this.f28381a = z10;
            this.f28382b = jSONObject;
        }
    }

    /* compiled from: UserStateSynchronizer */
    class f extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        int f28383a;

        /* renamed from: b  reason: collision with root package name */
        Handler f28384b = new Handler(getLooper());

        /* renamed from: c  reason: collision with root package name */
        int f28385c;

        /* compiled from: UserStateSynchronizer */
        class a implements Runnable {
            a() {
            }

            public void run() {
                if (!w4.this.f28363d.get()) {
                    w4.this.e0(false);
                }
            }
        }

        f(int i10) {
            super("OSH_NetworkHandlerThread_" + w4.this.f28361b);
            this.f28383a = i10;
            start();
        }

        private Runnable b() {
            if (this.f28383a != 0) {
                return null;
            }
            return new a();
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            boolean hasMessages;
            synchronized (this.f28384b) {
                boolean z10 = this.f28385c < 3;
                boolean hasMessages2 = this.f28384b.hasMessages(0);
                if (z10 && !hasMessages2) {
                    this.f28385c++;
                    this.f28384b.postDelayed(b(), (long) (this.f28385c * 15000));
                }
                hasMessages = this.f28384b.hasMessages(0);
            }
            return hasMessages;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (w4.this.f28362c) {
                synchronized (this.f28384b) {
                    this.f28385c = 0;
                    this.f28384b.removeCallbacksAndMessages((Object) null);
                    this.f28384b.postDelayed(b(), UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS);
                }
            }
        }
    }

    w4(y3.d dVar) {
        this.f28361b = dVar;
    }

    /* access modifiers changed from: private */
    public void I(int i10) {
        if (i10 == 403) {
            k3.a(k3.r0.FATAL, "403 error updating player, omitting further retries!");
            x();
        } else if (!D(0).a()) {
            x();
        }
    }

    /* access modifiers changed from: private */
    public void J() {
        k3.a(k3.r0.WARN, "Creating new player based on missing player_id noted above.");
        k3.Y0();
        T();
        g0((String) null);
        W();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (r9 != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        t(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        r(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void M(boolean r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.B()
            boolean r1 = r8.d0()
            if (r1 == 0) goto L_0x0010
            if (r0 == 0) goto L_0x0010
            r8.s(r0)
            return
        L_0x0010:
            com.onesignal.o4 r1 = r8.f28370k
            if (r1 != 0) goto L_0x0017
            r8.L()
        L_0x0017:
            if (r9 != 0) goto L_0x0021
            boolean r9 = r8.N()
            if (r9 == 0) goto L_0x0021
            r9 = 1
            goto L_0x0022
        L_0x0021:
            r9 = 0
        L_0x0022:
            java.lang.Object r1 = r8.f28360a
            monitor-enter(r1)
            com.onesignal.o4 r2 = r8.A()     // Catch:{ all -> 0x0082 }
            com.onesignal.o4 r3 = r8.G()     // Catch:{ all -> 0x0082 }
            org.json.JSONObject r2 = r2.d(r3, r9)     // Catch:{ all -> 0x0082 }
            com.onesignal.o4 r3 = r8.G()     // Catch:{ all -> 0x0082 }
            com.onesignal.o4 r4 = r8.A()     // Catch:{ all -> 0x0082 }
            r5 = 0
            org.json.JSONObject r3 = r4.f(r3, r5)     // Catch:{ all -> 0x0082 }
            com.onesignal.k3$r0 r4 = com.onesignal.k3.r0.DEBUG     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r6.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = "UserStateSynchronizer internalSyncUserState from session call: "
            r6.append(r7)     // Catch:{ all -> 0x0082 }
            r6.append(r9)     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = " jsonBody: "
            r6.append(r7)     // Catch:{ all -> 0x0082 }
            r6.append(r2)     // Catch:{ all -> 0x0082 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0082 }
            com.onesignal.k3.A1(r4, r6)     // Catch:{ all -> 0x0082 }
            if (r2 != 0) goto L_0x0070
            com.onesignal.o4 r9 = r8.A()     // Catch:{ all -> 0x0082 }
            r9.r(r3, r5)     // Catch:{ all -> 0x0082 }
            r8.a0()     // Catch:{ all -> 0x0082 }
            r8.v()     // Catch:{ all -> 0x0082 }
            r8.q()     // Catch:{ all -> 0x0082 }
            monitor-exit(r1)     // Catch:{ all -> 0x0082 }
            return
        L_0x0070:
            com.onesignal.o4 r4 = r8.G()     // Catch:{ all -> 0x0082 }
            r4.q()     // Catch:{ all -> 0x0082 }
            monitor-exit(r1)     // Catch:{ all -> 0x0082 }
            if (r9 != 0) goto L_0x007e
            r8.t(r0, r2, r3)
            goto L_0x0081
        L_0x007e:
            r8.r(r0, r2, r3)
        L_0x0081:
            return
        L_0x0082:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0082 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.w4.M(boolean):void");
    }

    private boolean N() {
        return (G().i().b("session") || B() == null) && !this.f28369j;
    }

    /* access modifiers changed from: private */
    public void O() {
        G().v("logoutEmail");
        this.f28371l.v("email_auth_hash");
        this.f28371l.w("parent_player_id");
        this.f28371l.w("email");
        this.f28371l.q();
        A().v("email_auth_hash");
        A().w("parent_player_id");
        String f10 = A().l().f("email");
        A().w("email");
        y3.x();
        k3.r0 r0Var = k3.r0.INFO;
        k3.a(r0Var, "Device successfully logged out of email: " + f10);
        k3.Y0();
    }

    /* access modifiers changed from: private */
    public boolean U(int i10, String str, String str2) {
        if (i10 == 400 && str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("errors") || !jSONObject.optString("errors").contains(str2)) {
                    return false;
                }
                return true;
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void Z(k3.j1 j1Var) {
        while (true) {
            k3.j0 poll = this.f28364e.poll();
            if (poll != null) {
                poll.i(j1Var);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void a0() {
        JSONObject jSONObject = y3.i(false).f28382b;
        while (true) {
            k3.j0 poll = this.f28364e.poll();
            if (poll != null) {
                poll.a(jSONObject);
            } else {
                return;
            }
        }
    }

    private boolean d0() {
        return G().i().c("logoutEmail", false);
    }

    /* access modifiers changed from: private */
    public void p(y3.c cVar) {
        while (true) {
            y3.b poll = this.f28366g.poll();
            if (poll != null) {
                poll.a(cVar);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void q() {
        String d10 = y3.d();
        while (true) {
            y3.b poll = this.f28366g.poll();
            if (poll != null) {
                poll.b(d10);
            } else {
                return;
            }
        }
    }

    private void r(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2;
        if (str == null) {
            str2 = "players";
        } else {
            str2 = "players/" + str + "/on_session";
        }
        this.f28369j = true;
        n(jSONObject);
        v3.k(str2, jSONObject, new d(jSONObject2, jSONObject, str));
    }

    private void s(String str) {
        String str2 = "players/" + str + "/email_logout";
        JSONObject jSONObject = new JSONObject();
        try {
            c0 i10 = A().i();
            if (i10.a("email_auth_hash")) {
                jSONObject.put("email_auth_hash", i10.f("email_auth_hash"));
            }
            c0 l10 = A().l();
            if (l10.a("parent_player_id")) {
                jSONObject.put("parent_player_id", l10.f("parent_player_id"));
            }
            jSONObject.put("app_id", l10.f("app_id"));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        v3.k(str2, jSONObject, new b());
    }

    private void t(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (str == null) {
            k3.A1(C(), "Error updating the user record because of the null user id");
            Z(new k3.j1(-1, "Unable to update tags: the current user is not registered with OneSignal"));
            u();
            p(new y3.c(-1, "Unable to set Language: the current user is not registered with OneSignal"));
            return;
        }
        v3.m("players/" + str, jSONObject, new c(jSONObject, jSONObject2));
    }

    /* access modifiers changed from: private */
    public void u() {
        while (true) {
            k3.v0 poll = this.f28365f.poll();
            if (poll != null) {
                poll.a(z(), false);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void v() {
        while (true) {
            k3.v0 poll = this.f28365f.poll();
            if (poll != null) {
                poll.a(z(), true);
            } else {
                return;
            }
        }
    }

    private void x() {
        JSONObject d10 = A().d(this.f28371l, false);
        if (d10 != null) {
            w(d10);
        }
        if (G().i().c("logoutEmail", false)) {
            k3.V0();
        }
    }

    /* access modifiers changed from: protected */
    public o4 A() {
        if (this.f28370k == null) {
            synchronized (this.f28360a) {
                if (this.f28370k == null) {
                    this.f28370k = P("CURRENT_STATE", true);
                }
            }
        }
        return this.f28370k;
    }

    /* access modifiers changed from: protected */
    public abstract String B();

    /* access modifiers changed from: protected */
    public abstract k3.r0 C();

    /* access modifiers changed from: protected */
    public f D(Integer num) {
        f fVar;
        synchronized (this.f28368i) {
            if (!this.f28367h.containsKey(num)) {
                this.f28367h.put(num, new f(num.intValue()));
            }
            fVar = this.f28367h.get(num);
        }
        return fVar;
    }

    /* access modifiers changed from: package-private */
    public String E() {
        return G().l().g("identifier", (String) null);
    }

    /* access modifiers changed from: package-private */
    public boolean F() {
        return H().i().b("session");
    }

    /* access modifiers changed from: protected */
    public o4 G() {
        if (this.f28371l == null) {
            synchronized (this.f28360a) {
                if (this.f28371l == null) {
                    this.f28371l = P("TOSYNC_STATE", true);
                }
            }
        }
        return this.f28371l;
    }

    /* access modifiers changed from: protected */
    public o4 H() {
        if (this.f28371l == null) {
            this.f28371l = A().c("TOSYNC_STATE");
        }
        W();
        return this.f28371l;
    }

    /* access modifiers changed from: package-private */
    public boolean K() {
        return this.f28365f.size() > 0;
    }

    /* access modifiers changed from: package-private */
    public void L() {
        if (this.f28370k == null) {
            synchronized (this.f28360a) {
                if (this.f28370k == null) {
                    this.f28370k = P("CURRENT_STATE", true);
                }
            }
        }
        G();
    }

    /* access modifiers changed from: protected */
    public abstract o4 P(String str, boolean z10);

    /* access modifiers changed from: protected */
    public abstract void Q(JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    public boolean R() {
        boolean z10 = false;
        if (this.f28371l == null) {
            return false;
        }
        synchronized (this.f28360a) {
            if (A().d(this.f28371l, N()) != null) {
                z10 = true;
            }
            this.f28371l.q();
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void S(boolean z10) {
        boolean z11 = this.f28362c != z10;
        this.f28362c = z10;
        if (z11 && z10) {
            W();
        }
    }

    /* access modifiers changed from: package-private */
    public void T() {
        A().A(new JSONObject());
        A().q();
    }

    /* access modifiers changed from: package-private */
    public abstract void V(String str);

    /* access modifiers changed from: protected */
    public abstract void W();

    /* access modifiers changed from: package-private */
    public void X(JSONObject jSONObject, v3.g gVar) {
        v3.j("players/" + B() + "/on_purchase", jSONObject, gVar);
    }

    /* access modifiers changed from: package-private */
    public void Y(JSONObject jSONObject, k3.j0 j0Var) {
        if (j0Var != null) {
            this.f28364e.add(j0Var);
        }
        H().h(jSONObject, (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    public void b0(String str, String str2, k3.v0 v0Var) throws JSONException {
        if (v0Var != null) {
            this.f28365f.add(v0Var);
        }
        o4 H = H();
        H.t("external_user_id", str);
        if (str2 != null) {
            H.t("external_user_id_auth_hash", str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void c0() {
        try {
            synchronized (this.f28360a) {
                H().s("session", Boolean.TRUE);
                H().q();
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void e0(boolean z10) {
        this.f28363d.set(true);
        M(z10);
        this.f28363d.set(false);
    }

    /* access modifiers changed from: package-private */
    public void f0(JSONObject jSONObject, y3.b bVar) {
        if (bVar != null) {
            this.f28366g.add(bVar);
        }
        H().h(jSONObject, (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    public abstract void g0(String str);

    /* access modifiers changed from: package-private */
    public void h0(g0.d dVar) {
        H().z(dVar);
    }

    /* access modifiers changed from: protected */
    public abstract void n(JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    public void o() {
        G().b();
        G().q();
    }

    /* access modifiers changed from: protected */
    public abstract void w(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public JSONObject y(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject b10;
        synchronized (this.f28360a) {
            b10 = f0.b(jSONObject, jSONObject2, jSONObject3, set);
        }
        return b10;
    }

    /* access modifiers changed from: package-private */
    public String z() {
        return this.f28361b.name().toLowerCase();
    }
}
