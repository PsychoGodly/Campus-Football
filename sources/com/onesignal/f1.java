package com.onesignal;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.mediation.MaxReward;
import com.onesignal.d1;
import com.onesignal.k3;
import com.onesignal.s1;
import com.onesignal.v0;
import com.onesignal.y2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageController */
class f1 extends s0 implements v0.c, y2.c {
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public static final Object f27677v = new Object();

    /* renamed from: w  reason: collision with root package name */
    private static ArrayList<String> f27678w = new i();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final v1 f27679a;

    /* renamed from: b  reason: collision with root package name */
    private final z2 f27680b;

    /* renamed from: c  reason: collision with root package name */
    private final ka.a f27681c;

    /* renamed from: d  reason: collision with root package name */
    private y2 f27682d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public s1 f27683e;

    /* renamed from: f  reason: collision with root package name */
    private j1 f27684f;

    /* renamed from: g  reason: collision with root package name */
    g3 f27685g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<i1> f27686h;

    /* renamed from: i  reason: collision with root package name */
    private final Set<String> f27687i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Set<String> f27688j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final Set<String> f27689k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final Set<String> f27690l;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayList<i1> f27691m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public List<i1> f27692n = null;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public o1 f27693o = null;

    /* renamed from: p  reason: collision with root package name */
    private boolean f27694p = true;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f27695q = false;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public String f27696r = MaxReward.DEFAULT_LABEL;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public e1 f27697s = null;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public boolean f27698t = false;

    /* renamed from: u  reason: collision with root package name */
    Date f27699u = null;

    /* compiled from: OSInAppMessageController */
    class a implements s1.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f27700a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i1 f27701b;

        a(String str, i1 i1Var) {
            this.f27700a = str;
            this.f27701b = i1Var;
        }

        public void a(String str) {
            f1.this.f27690l.remove(this.f27700a);
            this.f27701b.n(this.f27700a);
        }

        public void b(String str) {
        }
    }

    /* compiled from: OSInAppMessageController */
    class b extends k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i1 f27703a;

        b(i1 i1Var) {
            this.f27703a = i1Var;
        }

        public void run() {
            super.run();
            f1.this.f27683e.A(this.f27703a);
            f1.this.f27683e.B(f1.this.f27699u);
        }
    }

    /* compiled from: OSInAppMessageController */
    class c implements k3.t0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f27705a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i1 f27706b;

        c(boolean z10, i1 i1Var) {
            this.f27705a = z10;
            this.f27706b = i1Var;
        }

        public void c(JSONObject jSONObject) {
            boolean unused = f1.this.f27698t = false;
            if (jSONObject != null) {
                String unused2 = f1.this.f27696r = jSONObject.toString();
            }
            if (f1.this.f27697s != null) {
                if (!this.f27705a) {
                    k3.J0().k(this.f27706b.f27580a);
                }
                e1 n10 = f1.this.f27697s;
                f1 f1Var = f1.this;
                n10.h(f1Var.A0(f1Var.f27697s.a()));
                x4.I(this.f27706b, f1.this.f27697s);
                e1 unused3 = f1.this.f27697s = null;
            }
        }
    }

    /* compiled from: OSInAppMessageController */
    class d implements s1.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i1 f27708a;

        d(i1 i1Var) {
            this.f27708a = i1Var;
        }

        public void a(String str) {
            boolean unused = f1.this.f27695q = false;
            try {
                if (new JSONObject(str).getBoolean("retry")) {
                    f1.this.o0(this.f27708a);
                } else {
                    f1.this.c0(this.f27708a, true);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }

        public void b(String str) {
            try {
                e1 p10 = f1.this.l0(new JSONObject(str), this.f27708a);
                if (p10.a() == null) {
                    f1.this.f27679a.d("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                } else if (f1.this.f27698t) {
                    e1 unused = f1.this.f27697s = p10;
                } else {
                    k3.J0().k(this.f27708a.f27580a);
                    f1.this.j0(this.f27708a);
                    p10.h(f1.this.A0(p10.a()));
                    x4.I(this.f27708a, p10);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: OSInAppMessageController */
    class e implements s1.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i1 f27710a;

        e(i1 i1Var) {
            this.f27710a = i1Var;
        }

        public void a(String str) {
            f1.this.H((i1) null);
        }

        public void b(String str) {
            try {
                e1 p10 = f1.this.l0(new JSONObject(str), this.f27710a);
                if (p10.a() == null) {
                    f1.this.f27679a.d("displayPreviewMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                } else if (f1.this.f27698t) {
                    e1 unused = f1.this.f27697s = p10;
                } else {
                    f1.this.j0(this.f27710a);
                    p10.h(f1.this.A0(p10.a()));
                    x4.I(this.f27710a, p10);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: OSInAppMessageController */
    class f extends k {
        f() {
        }

        public void run() {
            super.run();
            f1.this.f27683e.h();
        }
    }

    /* compiled from: OSInAppMessageController */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f27713a;

        g(Map map) {
            this.f27713a = map;
        }

        public void run() {
            f1.this.f27679a.d("Delaying addTriggers due to redisplay data not retrieved yet");
            f1.this.F(this.f27713a.keySet());
        }
    }

    /* compiled from: OSInAppMessageController */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Collection f27715a;

        h(Collection collection) {
            this.f27715a = collection;
        }

        public void run() {
            f1.this.f27679a.d("Delaying removeTriggersForKeys due to redisplay data not retrieved yet");
            f1.this.F(this.f27715a);
        }
    }

    /* compiled from: OSInAppMessageController */
    class i extends ArrayList<String> {
        i() {
            add("android");
            add("app");
            add("all");
        }
    }

    /* compiled from: OSInAppMessageController */
    class j extends k {
        j() {
        }

        public void run() {
            super.run();
            synchronized (f1.f27677v) {
                f1 f1Var = f1.this;
                List unused = f1Var.f27692n = f1Var.f27683e.k();
                v1 v10 = f1.this.f27679a;
                v10.d("Retrieved IAMs from DB redisplayedInAppMessages: " + f1.this.f27692n.toString());
            }
        }
    }

    /* compiled from: OSInAppMessageController */
    class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONArray f27718a;

        k(JSONArray jSONArray) {
            this.f27718a = jSONArray;
        }

        public void run() {
            f1.this.r0();
            try {
                f1.this.n0(this.f27718a);
            } catch (JSONException e10) {
                f1.this.f27679a.c("ERROR processing InAppMessageJson JSON Response.", e10);
            }
        }
    }

    /* compiled from: OSInAppMessageController */
    class l implements Runnable {
        l() {
        }

        public void run() {
            f1.this.f27679a.d("Delaying evaluateInAppMessages due to redisplay data not retrieved yet");
            f1.this.K();
        }
    }

    /* compiled from: OSInAppMessageController */
    class m implements s1.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i1 f27721a;

        m(i1 i1Var) {
            this.f27721a = i1Var;
        }

        public void a(String str) {
            f1.this.f27688j.remove(this.f27721a.f27580a);
        }

        public void b(String str) {
        }
    }

    /* compiled from: OSInAppMessageController */
    class n implements k3.z0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i1 f27723a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f27724b;

        n(i1 i1Var, List list) {
            this.f27723a = i1Var;
            this.f27724b = list;
        }

        public void a(k3.g1 g1Var) {
            o1 unused = f1.this.f27693o = null;
            v1 v10 = f1.this.f27679a;
            v10.d("IAM prompt to handle finished with result: " + g1Var);
            i1 i1Var = this.f27723a;
            if (!i1Var.f27854k || g1Var != k3.g1.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                f1.this.z0(i1Var, this.f27724b);
            } else {
                f1.this.y0(i1Var, this.f27724b);
            }
        }
    }

    /* compiled from: OSInAppMessageController */
    class o implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i1 f27726a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f27727b;

        o(i1 i1Var, List list) {
            this.f27726a = i1Var;
            this.f27727b = list;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            f1.this.z0(this.f27726a, this.f27727b);
        }
    }

    /* compiled from: OSInAppMessageController */
    class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f27729a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d1 f27730b;

        p(String str, d1 d1Var) {
            this.f27729a = str;
            this.f27730b = d1Var;
        }

        public void run() {
            k3.J0().h(this.f27729a);
            k3.f27938t.k(this.f27730b);
        }
    }

    /* compiled from: OSInAppMessageController */
    class q implements s1.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f27732a;

        q(String str) {
            this.f27732a = str;
        }

        public void a(String str) {
            f1.this.f27689k.remove(this.f27732a);
        }

        public void b(String str) {
        }
    }

    protected f1(r3 r3Var, z2 z2Var, v1 v1Var, t2 t2Var, ka.a aVar) {
        this.f27680b = z2Var;
        this.f27686h = new ArrayList<>();
        Set<String> L = OSUtils.L();
        this.f27687i = L;
        this.f27691m = new ArrayList<>();
        Set<String> L2 = OSUtils.L();
        this.f27688j = L2;
        Set<String> L3 = OSUtils.L();
        this.f27689k = L3;
        Set<String> L4 = OSUtils.L();
        this.f27690l = L4;
        this.f27685g = new g3(this);
        this.f27682d = new y2(this);
        this.f27681c = aVar;
        this.f27679a = v1Var;
        s1 S = S(r3Var, v1Var, t2Var);
        this.f27683e = S;
        Set<String> m10 = S.m();
        if (m10 != null) {
            L.addAll(m10);
        }
        Set<String> p10 = this.f27683e.p();
        if (p10 != null) {
            L2.addAll(p10);
        }
        Set<String> s10 = this.f27683e.s();
        if (s10 != null) {
            L3.addAll(s10);
        }
        Set<String> l10 = this.f27683e.l();
        if (l10 != null) {
            L4.addAll(l10);
        }
        Date q10 = this.f27683e.q();
        if (q10 != null) {
            this.f27699u = q10;
        }
        W();
    }

    private String B0(i1 i1Var) {
        String b10 = this.f27681c.b();
        Iterator<String> it = f27678w.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (i1Var.f27845b.containsKey(next)) {
                HashMap hashMap = i1Var.f27845b.get(next);
                if (hashMap.containsKey(b10)) {
                    return (String) hashMap.get(b10);
                }
                return (String) hashMap.get("default");
            }
        }
        return null;
    }

    private void D() {
        synchronized (this.f27691m) {
            if (!this.f27682d.c()) {
                this.f27679a.e("In app message not showing due to system condition not correct");
                return;
            }
            v1 v1Var = this.f27679a;
            v1Var.d("displayFirstIAMOnQueue: " + this.f27691m);
            if (this.f27691m.size() <= 0 || Y()) {
                v1 v1Var2 = this.f27679a;
                v1Var2.d("In app message is currently showing or there are no IAMs left in the queue! isInAppMessageShowing: " + Y());
                return;
            }
            this.f27679a.d("No IAM showing currently, showing first item in the queue!");
            I(this.f27691m.get(0));
        }
    }

    private void E(i1 i1Var, List<o1> list) {
        if (list.size() > 0) {
            v1 v1Var = this.f27679a;
            v1Var.d("IAM showing prompts from IAM: " + i1Var.toString());
            x4.x();
            z0(i1Var, list);
        }
    }

    /* access modifiers changed from: private */
    public void F(Collection<String> collection) {
        a0(collection);
        K();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void H(com.onesignal.i1 r6) {
        /*
            r5 = this;
            com.onesignal.s2 r0 = com.onesignal.k3.J0()
            r0.i()
            boolean r0 = r5.x0()
            if (r0 == 0) goto L_0x0015
            com.onesignal.v1 r6 = r5.f27679a
            java.lang.String r0 = "Stop evaluateMessageDisplayQueue because prompt is currently displayed"
            r6.d(r0)
            return
        L_0x0015:
            r0 = 0
            r5.f27695q = r0
            java.util.ArrayList<com.onesignal.i1> r1 = r5.f27691m
            monitor-enter(r1)
            if (r6 == 0) goto L_0x005f
            boolean r2 = r6.f27854k     // Catch:{ all -> 0x009f }
            if (r2 != 0) goto L_0x005f
            java.util.ArrayList<com.onesignal.i1> r2 = r5.f27691m     // Catch:{ all -> 0x009f }
            int r2 = r2.size()     // Catch:{ all -> 0x009f }
            if (r2 <= 0) goto L_0x005f
            java.util.ArrayList<com.onesignal.i1> r2 = r5.f27691m     // Catch:{ all -> 0x009f }
            boolean r6 = r2.contains(r6)     // Catch:{ all -> 0x009f }
            if (r6 != 0) goto L_0x003a
            com.onesignal.v1 r6 = r5.f27679a     // Catch:{ all -> 0x009f }
            java.lang.String r0 = "Message already removed from the queue!"
            r6.d(r0)     // Catch:{ all -> 0x009f }
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            return
        L_0x003a:
            java.util.ArrayList<com.onesignal.i1> r6 = r5.f27691m     // Catch:{ all -> 0x009f }
            java.lang.Object r6 = r6.remove(r0)     // Catch:{ all -> 0x009f }
            com.onesignal.i1 r6 = (com.onesignal.i1) r6     // Catch:{ all -> 0x009f }
            java.lang.String r6 = r6.f27580a     // Catch:{ all -> 0x009f }
            com.onesignal.v1 r2 = r5.f27679a     // Catch:{ all -> 0x009f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r3.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r4 = "In app message with id: "
            r3.append(r4)     // Catch:{ all -> 0x009f }
            r3.append(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = ", dismissed (removed) from the queue!"
            r3.append(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x009f }
            r2.d(r6)     // Catch:{ all -> 0x009f }
        L_0x005f:
            java.util.ArrayList<com.onesignal.i1> r6 = r5.f27691m     // Catch:{ all -> 0x009f }
            int r6 = r6.size()     // Catch:{ all -> 0x009f }
            if (r6 <= 0) goto L_0x0093
            com.onesignal.v1 r6 = r5.f27679a     // Catch:{ all -> 0x009f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r2.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r3 = "In app message on queue available: "
            r2.append(r3)     // Catch:{ all -> 0x009f }
            java.util.ArrayList<com.onesignal.i1> r3 = r5.f27691m     // Catch:{ all -> 0x009f }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x009f }
            com.onesignal.i1 r3 = (com.onesignal.i1) r3     // Catch:{ all -> 0x009f }
            java.lang.String r3 = r3.f27580a     // Catch:{ all -> 0x009f }
            r2.append(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x009f }
            r6.d(r2)     // Catch:{ all -> 0x009f }
            java.util.ArrayList<com.onesignal.i1> r6 = r5.f27691m     // Catch:{ all -> 0x009f }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ all -> 0x009f }
            com.onesignal.i1 r6 = (com.onesignal.i1) r6     // Catch:{ all -> 0x009f }
            r5.I(r6)     // Catch:{ all -> 0x009f }
            goto L_0x009d
        L_0x0093:
            com.onesignal.v1 r6 = r5.f27679a     // Catch:{ all -> 0x009f }
            java.lang.String r0 = "In app message dismissed evaluating messages"
            r6.d(r0)     // Catch:{ all -> 0x009f }
            r5.K()     // Catch:{ all -> 0x009f }
        L_0x009d:
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            return
        L_0x009f:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.f1.H(com.onesignal.i1):void");
    }

    private void I(i1 i1Var) {
        if (!this.f27694p) {
            this.f27679a.b("In app messaging is currently paused, in app messages will not be shown!");
            return;
        }
        this.f27695q = true;
        T(i1Var, false);
        this.f27683e.n(k3.f27916h, i1Var.f27580a, B0(i1Var), new d(i1Var));
    }

    /* access modifiers changed from: private */
    public void K() {
        this.f27679a.d("Starting evaluateInAppMessages");
        if (w0()) {
            this.f27680b.c(new l());
            return;
        }
        Iterator<i1> it = this.f27686h.iterator();
        while (it.hasNext()) {
            i1 next = it.next();
            if (this.f27685g.c(next)) {
                t0(next);
                if (!this.f27687i.contains(next.f27580a) && !next.i()) {
                    o0(next);
                }
            }
        }
    }

    private void M(d1 d1Var) {
        if (d1Var.d() != null && !d1Var.d().isEmpty()) {
            if (d1Var.h() == d1.a.BROWSER) {
                OSUtils.O(d1Var.d());
            } else if (d1Var.h() == d1.a.IN_APP_WEBVIEW) {
                p3.b(d1Var.d(), true);
            }
        }
    }

    private void N(String str, List<l1> list) {
        k3.J0().h(str);
        k3.f2(list);
    }

    private void O(String str, d1 d1Var) {
        if (k3.f27938t != null) {
            q.f28088a.b(new p(str, d1Var));
        }
    }

    private void P(i1 i1Var, d1 d1Var) {
        String B0 = B0(i1Var);
        if (B0 != null) {
            String b10 = d1Var.b();
            if ((i1Var.f().e() && i1Var.g(b10)) || !this.f27690l.contains(b10)) {
                this.f27690l.add(b10);
                i1Var.b(b10);
                this.f27683e.D(k3.f27916h, k3.R0(), B0, new OSUtils().e(), i1Var.f27580a, b10, d1Var.i(), this.f27690l, new a(b10, i1Var));
            }
        }
    }

    private void Q(i1 i1Var, m1 m1Var) {
        String B0 = B0(i1Var);
        if (B0 != null) {
            String a10 = m1Var.a();
            String str = i1Var.f27580a + a10;
            if (this.f27689k.contains(str)) {
                this.f27679a.b("Already sent page impression for id: " + a10);
                return;
            }
            this.f27689k.add(str);
            this.f27683e.F(k3.f27916h, k3.R0(), B0, new OSUtils().e(), i1Var.f27580a, a10, this.f27689k, new q(str));
        }
    }

    private void R(d1 d1Var) {
        if (d1Var.g() != null) {
            t1 g10 = d1Var.g();
            if (g10.a() != null) {
                k3.j2(g10.a());
            }
            if (g10.b() != null) {
                k3.L(g10.b(), (k3.j0) null);
            }
        }
    }

    private void T(i1 i1Var, boolean z10) {
        this.f27698t = false;
        if (z10 || i1Var.e()) {
            this.f27698t = true;
            k3.M0(new c(z10, i1Var));
        }
    }

    private boolean V(i1 i1Var) {
        if (this.f27685g.g(i1Var)) {
            return !i1Var.h();
        }
        boolean z10 = !i1Var.h() && i1Var.f27846c.isEmpty();
        if (i1Var.j() || z10) {
            return true;
        }
        return false;
    }

    private void Z(d1 d1Var) {
        if (d1Var.g() != null) {
            v1 v1Var = this.f27679a;
            v1Var.d("Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + d1Var.g().toString());
        }
        if (d1Var.e().size() > 0) {
            v1 v1Var2 = this.f27679a;
            v1Var2.d("Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + d1Var.e().toString());
        }
    }

    private void a0(Collection<String> collection) {
        Iterator<i1> it = this.f27686h.iterator();
        while (it.hasNext()) {
            i1 next = it.next();
            if (!next.j() && this.f27692n.contains(next) && this.f27685g.f(next, collection)) {
                v1 v1Var = this.f27679a;
                v1Var.d("Trigger changed for message: " + next.toString());
                next.q(true);
            }
        }
    }

    /* access modifiers changed from: private */
    public e1 l0(JSONObject jSONObject, i1 i1Var) {
        e1 e1Var = new e1(jSONObject);
        i1Var.o(e1Var.b().doubleValue());
        return e1Var;
    }

    private void m0(i1 i1Var) {
        i1Var.f().h(k3.N0().b() / 1000);
        i1Var.f().c();
        i1Var.q(false);
        i1Var.p(true);
        d(new b(i1Var), "OS_IAM_DB_ACCESS");
        int indexOf = this.f27692n.indexOf(i1Var);
        if (indexOf != -1) {
            this.f27692n.set(indexOf, i1Var);
        } else {
            this.f27692n.add(i1Var);
        }
        v1 v1Var = this.f27679a;
        v1Var.d("persistInAppMessageForRedisplay: " + i1Var.toString() + " with msg array data: " + this.f27692n.toString());
    }

    /* access modifiers changed from: private */
    public void n0(JSONArray jSONArray) throws JSONException {
        synchronized (f27677v) {
            ArrayList<i1> arrayList = new ArrayList<>();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                i1 i1Var = new i1(jSONArray.getJSONObject(i10));
                if (i1Var.f27580a != null) {
                    arrayList.add(i1Var);
                }
            }
            this.f27686h = arrayList;
        }
        K();
    }

    /* access modifiers changed from: private */
    public void o0(i1 i1Var) {
        synchronized (this.f27691m) {
            if (!this.f27691m.contains(i1Var)) {
                this.f27691m.add(i1Var);
                v1 v1Var = this.f27679a;
                v1Var.d("In app message with id: " + i1Var.f27580a + ", added to the queue");
            }
            D();
        }
    }

    /* access modifiers changed from: private */
    public void r0() {
        for (i1 p10 : this.f27692n) {
            p10.p(false);
        }
    }

    private void t0(i1 i1Var) {
        boolean contains = this.f27687i.contains(i1Var.f27580a);
        int indexOf = this.f27692n.indexOf(i1Var);
        if (contains && indexOf != -1) {
            i1 i1Var2 = this.f27692n.get(indexOf);
            i1Var.f().g(i1Var2.f());
            i1Var.p(i1Var2.h());
            boolean V = V(i1Var);
            v1 v1Var = this.f27679a;
            v1Var.d("setDataForRedisplay: " + i1Var.toString() + " triggerHasChanged: " + V);
            if (V && i1Var.f().d() && i1Var.f().i()) {
                v1 v1Var2 = this.f27679a;
                v1Var2.d("setDataForRedisplay message available for redisplay: " + i1Var.f27580a);
                this.f27687i.remove(i1Var.f27580a);
                this.f27688j.remove(i1Var.f27580a);
                this.f27689k.clear();
                this.f27683e.C(this.f27689k);
                i1Var.c();
            }
        }
    }

    private boolean x0() {
        return this.f27693o != null;
    }

    /* access modifiers changed from: private */
    public void y0(i1 i1Var, List<o1> list) {
        String string = k3.f27912f.getString(i4.location_permission_missing_title);
        new AlertDialog.Builder(k3.Z()).setTitle(string).setMessage(k3.f27912f.getString(i4.location_permission_missing_message)).setPositiveButton(17039370, new o(i1Var, list)).show();
    }

    /* access modifiers changed from: private */
    public void z0(i1 i1Var, List<o1> list) {
        Iterator<o1> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            o1 next = it.next();
            if (!next.c()) {
                this.f27693o = next;
                break;
            }
        }
        if (this.f27693o != null) {
            v1 v1Var = this.f27679a;
            v1Var.d("IAM prompt to handle: " + this.f27693o.toString());
            this.f27693o.d(true);
            this.f27693o.b(new n(i1Var, list));
            return;
        }
        v1 v1Var2 = this.f27679a;
        v1Var2.d("No IAM prompt to handle, dismiss message: " + i1Var.f27580a);
        b0(i1Var);
    }

    /* access modifiers changed from: package-private */
    public String A0(String str) {
        String str2 = this.f27696r;
        return str + String.format("\n\n<script>\n    setPlayerTags(%s);\n</script>", new Object[]{str2});
    }

    /* access modifiers changed from: package-private */
    public void C(Map<String, Object> map) {
        v1 v1Var = this.f27679a;
        v1Var.d("Triggers added: " + map.toString());
        this.f27685g.a(map);
        if (w0()) {
            this.f27680b.c(new g(map));
        } else {
            F(map.keySet());
        }
    }

    /* access modifiers changed from: package-private */
    public void G() {
        d(new f(), "OS_IAM_DB_ACCESS");
    }

    /* access modifiers changed from: package-private */
    public void J(String str) {
        this.f27695q = true;
        i1 i1Var = new i1(true);
        T(i1Var, true);
        this.f27683e.o(k3.f27916h, str, new e(i1Var));
    }

    /* access modifiers changed from: package-private */
    public void L(Runnable runnable) {
        synchronized (f27677v) {
            if (w0()) {
                this.f27679a.d("Delaying task due to redisplay data not retrieved yet");
                this.f27680b.c(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public s1 S(r3 r3Var, v1 v1Var, t2 t2Var) {
        if (this.f27683e == null) {
            this.f27683e = new s1(r3Var, v1Var, t2Var);
        }
        return this.f27683e;
    }

    /* access modifiers changed from: package-private */
    public Object U(String str) {
        return this.f27685g.e(str);
    }

    /* access modifiers changed from: protected */
    public void W() {
        this.f27680b.c(new j());
        this.f27680b.f();
    }

    /* access modifiers changed from: package-private */
    public void X() {
        if (!this.f27686h.isEmpty()) {
            v1 v1Var = this.f27679a;
            v1Var.d("initWithCachedInAppMessages with already in memory messages: " + this.f27686h);
            return;
        }
        String r10 = this.f27683e.r();
        v1 v1Var2 = this.f27679a;
        v1Var2.d("initWithCachedInAppMessages: " + r10);
        if (r10 != null && !r10.isEmpty()) {
            synchronized (f27677v) {
                try {
                    if (this.f27686h.isEmpty()) {
                        n0(new JSONArray(r10));
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Y() {
        return this.f27695q;
    }

    public void a() {
        this.f27679a.d("messageTriggerConditionChanged called");
        K();
    }

    public void b(String str) {
        v1 v1Var = this.f27679a;
        v1Var.d("messageDynamicTriggerCompleted called with triggerId: " + str);
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        a0(hashSet);
    }

    /* access modifiers changed from: package-private */
    public void b0(i1 i1Var) {
        c0(i1Var, false);
    }

    public void c() {
        D();
    }

    /* access modifiers changed from: package-private */
    public void c0(i1 i1Var, boolean z10) {
        if (!i1Var.f27854k) {
            this.f27687i.add(i1Var.f27580a);
            if (!z10) {
                this.f27683e.x(this.f27687i);
                this.f27699u = new Date();
                m0(i1Var);
            }
            v1 v1Var = this.f27679a;
            v1Var.d("OSInAppMessageController messageWasDismissed dismissedMessages: " + this.f27687i.toString());
        }
        if (!x0()) {
            f0(i1Var);
        }
        H(i1Var);
    }

    /* access modifiers changed from: package-private */
    public void d0(i1 i1Var, JSONObject jSONObject) throws JSONException {
        d1 d1Var = new d1(jSONObject);
        d1Var.l(i1Var.r());
        O(i1Var.f27580a, d1Var);
        E(i1Var, d1Var.f());
        M(d1Var);
        P(i1Var, d1Var);
        R(d1Var);
        N(i1Var.f27580a, d1Var.e());
    }

    /* access modifiers changed from: package-private */
    public void e0(i1 i1Var, JSONObject jSONObject) throws JSONException {
        d1 d1Var = new d1(jSONObject);
        d1Var.l(i1Var.r());
        O(i1Var.f27580a, d1Var);
        E(i1Var, d1Var.f());
        M(d1Var);
        Z(d1Var);
    }

    /* access modifiers changed from: package-private */
    public void f0(i1 i1Var) {
        j1 j1Var = this.f27684f;
        if (j1Var == null) {
            this.f27679a.b("OSInAppMessageController onMessageDidDismiss: inAppMessageLifecycleHandler is null");
        } else {
            j1Var.a(i1Var);
        }
    }

    /* access modifiers changed from: package-private */
    public void g0(i1 i1Var) {
        j1 j1Var = this.f27684f;
        if (j1Var == null) {
            this.f27679a.b("OSInAppMessageController onMessageDidDisplay: inAppMessageLifecycleHandler is null");
        } else {
            j1Var.b(i1Var);
        }
    }

    /* access modifiers changed from: package-private */
    public void h0(i1 i1Var) {
        g0(i1Var);
        if (!i1Var.f27854k && !this.f27688j.contains(i1Var.f27580a)) {
            this.f27688j.add(i1Var.f27580a);
            String B0 = B0(i1Var);
            if (B0 != null) {
                this.f27683e.E(k3.f27916h, k3.R0(), B0, new OSUtils().e(), i1Var.f27580a, this.f27688j, new m(i1Var));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i0(i1 i1Var) {
        j1 j1Var = this.f27684f;
        if (j1Var == null) {
            this.f27679a.b("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
        } else {
            j1Var.c(i1Var);
        }
    }

    /* access modifiers changed from: package-private */
    public void j0(i1 i1Var) {
        j1 j1Var = this.f27684f;
        if (j1Var == null) {
            this.f27679a.b("OSInAppMessageController onMessageWillDisplay: inAppMessageLifecycleHandler is null");
        } else {
            j1Var.d(i1Var);
        }
    }

    /* access modifiers changed from: package-private */
    public void k0(i1 i1Var, JSONObject jSONObject) {
        m1 m1Var = new m1(jSONObject);
        if (!i1Var.f27854k) {
            Q(i1Var, m1Var);
        }
    }

    /* access modifiers changed from: package-private */
    public void p0(JSONArray jSONArray) throws JSONException {
        this.f27683e.y(jSONArray.toString());
        L(new k(jSONArray));
    }

    /* access modifiers changed from: package-private */
    public void q0(Collection<String> collection) {
        v1 v1Var = this.f27679a;
        v1Var.d("Triggers key to remove: " + collection.toString());
        this.f27685g.h(collection);
        if (w0()) {
            this.f27680b.c(new h(collection));
        } else {
            F(collection);
        }
    }

    /* access modifiers changed from: package-private */
    public void s0() {
        v0.e();
    }

    /* access modifiers changed from: package-private */
    public void u0(j1 j1Var) {
        this.f27684f = j1Var;
    }

    /* access modifiers changed from: package-private */
    public void v0(boolean z10) {
        this.f27694p = z10;
        if (z10) {
            K();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean w0() {
        boolean z10;
        synchronized (f27677v) {
            z10 = this.f27692n == null && this.f27680b.e();
        }
        return z10;
    }
}
