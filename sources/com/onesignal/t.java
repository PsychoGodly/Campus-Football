package com.onesignal;

import com.onesignal.k3;
import com.onesignal.v3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FocusTimeController */
class t {

    /* renamed from: a  reason: collision with root package name */
    private Long f28187a;

    /* renamed from: b  reason: collision with root package name */
    private Object f28188b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private b1 f28189c;

    /* renamed from: d  reason: collision with root package name */
    private v1 f28190d;

    /* compiled from: FocusTimeController */
    private enum a {
        BACKGROUND,
        END_SESSION
    }

    /* compiled from: FocusTimeController */
    static class b extends c {
        b() {
            this.f28194a = 1;
            this.f28195b = "OS_UNSENT_ATTRIBUTED_ACTIVE_TIME";
        }

        /* access modifiers changed from: protected */
        public void h(JSONObject jSONObject) {
            k3.J0().b(jSONObject, j());
        }

        /* access modifiers changed from: protected */
        public List<ja.a> j() {
            ArrayList arrayList = new ArrayList();
            for (String aVar : t3.g(t3.f28204a, "PREFS_OS_ATTRIBUTED_INFLUENCES", new HashSet())) {
                try {
                    arrayList.add(new ja.a(aVar));
                } catch (JSONException e10) {
                    k3.r0 r0Var = k3.r0.ERROR;
                    k3.a(r0Var, getClass().getSimpleName() + ": error generation OSInfluence from json object: " + e10);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: protected */
        public void m(List<ja.a> list) {
            HashSet hashSet = new HashSet();
            for (ja.a g10 : list) {
                try {
                    hashSet.add(g10.g());
                } catch (JSONException e10) {
                    k3.r0 r0Var = k3.r0.ERROR;
                    k3.a(r0Var, getClass().getSimpleName() + ": error generation json object OSInfluence: " + e10);
                }
            }
            t3.n(t3.f28204a, "PREFS_OS_ATTRIBUTED_INFLUENCES", hashSet);
        }

        /* access modifiers changed from: protected */
        public void r(a aVar) {
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.A1(r0Var, getClass().getSimpleName() + " sendTime with: " + aVar);
            if (aVar.equals(a.END_SESSION)) {
                u();
            } else {
                x2.q().s(k3.f27912f);
            }
        }
    }

    /* compiled from: FocusTimeController */
    static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        protected long f28194a;

        /* renamed from: b  reason: collision with root package name */
        protected String f28195b;

        /* renamed from: c  reason: collision with root package name */
        private Long f28196c = null;

        /* renamed from: d  reason: collision with root package name */
        private final AtomicBoolean f28197d = new AtomicBoolean();

        /* compiled from: FocusTimeController */
        class a extends v3.g {
            a() {
            }

            /* access modifiers changed from: package-private */
            public void a(int i10, String str, Throwable th) {
                k3.p1("sending on_focus Failed", i10, th, str);
            }

            /* access modifiers changed from: package-private */
            public void b(String str) {
                c.this.o(0);
            }
        }

        c() {
        }

        /* access modifiers changed from: private */
        public void g(long j10, List<ja.a> list, a aVar) {
            n(j10, list);
            t(aVar);
        }

        private JSONObject i(long j10) throws JSONException {
            JSONObject put = new JSONObject().put("app_id", k3.F0()).put("type", 1).put("state", "ping").put("active_time", j10).put("device_type", new OSUtils().e());
            k3.z(put);
            return put;
        }

        private long k() {
            if (this.f28196c == null) {
                this.f28196c = Long.valueOf(t3.d(t3.f28204a, this.f28195b, 0));
            }
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.a(r0Var, getClass().getSimpleName() + ":getUnsentActiveTime: " + this.f28196c);
            return this.f28196c.longValue();
        }

        private boolean l() {
            return k() >= this.f28194a;
        }

        /* access modifiers changed from: private */
        public void n(long j10, List<ja.a> list) {
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.a(r0Var, getClass().getSimpleName() + ":saveUnsentActiveData with lastFocusTimeInfluences: " + list.toString());
            m(list);
            o(k() + j10);
        }

        /* access modifiers changed from: private */
        public void o(long j10) {
            this.f28196c = Long.valueOf(j10);
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.a(r0Var, getClass().getSimpleName() + ":saveUnsentActiveTime: " + this.f28196c);
            t3.l(t3.f28204a, this.f28195b, j10);
        }

        private void p(long j10) {
            try {
                k3.r0 r0Var = k3.r0.DEBUG;
                k3.a(r0Var, getClass().getSimpleName() + ":sendOnFocus with totalTimeActive: " + j10);
                JSONObject i10 = i(j10);
                h(i10);
                q(k3.R0(), i10);
                if (k3.a1()) {
                    q(k3.i0(), i(j10));
                }
                if (k3.b1()) {
                    q(k3.C0(), i(j10));
                }
                m(new ArrayList());
            } catch (JSONException e10) {
                k3.b(k3.r0.ERROR, "Generating on_focus:JSON Failed.", e10);
            }
        }

        private void q(String str, JSONObject jSONObject) {
            a aVar = new a();
            v3.k("players/" + str + "/on_focus", jSONObject, aVar);
        }

        /* access modifiers changed from: private */
        public void s() {
            List<ja.a> j10 = j();
            long k10 = k();
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.a(r0Var, getClass().getSimpleName() + ":sendUnsentTimeNow with time: " + k10 + " and influences: " + j10.toString());
            t(a.BACKGROUND);
        }

        /* access modifiers changed from: private */
        public void t(a aVar) {
            if (!k3.c1()) {
                k3.r0 r0Var = k3.r0.WARN;
                k3.a(r0Var, getClass().getSimpleName() + ":sendUnsentTimeNow not possible due to user id null");
                return;
            }
            r(aVar);
        }

        /* access modifiers changed from: private */
        public void v() {
            if (l()) {
                u();
            }
        }

        /* access modifiers changed from: protected */
        public void h(JSONObject jSONObject) {
        }

        /* access modifiers changed from: protected */
        public abstract List<ja.a> j();

        /* access modifiers changed from: protected */
        public abstract void m(List<ja.a> list);

        /* access modifiers changed from: protected */
        public abstract void r(a aVar);

        /* access modifiers changed from: protected */
        public void u() {
            if (!this.f28197d.get()) {
                synchronized (this.f28197d) {
                    this.f28197d.set(true);
                    if (l()) {
                        p(k());
                    }
                    this.f28197d.set(false);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void w() {
            if (l()) {
                x2.q().s(k3.f27912f);
            }
        }
    }

    /* compiled from: FocusTimeController */
    static class d extends c {
        d() {
            this.f28194a = 60;
            this.f28195b = "GT_UNSENT_ACTIVE_TIME";
        }

        /* access modifiers changed from: protected */
        public List<ja.a> j() {
            return new ArrayList();
        }

        /* access modifiers changed from: protected */
        public void m(List<ja.a> list) {
        }

        /* access modifiers changed from: protected */
        public void r(a aVar) {
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.A1(r0Var, getClass().getSimpleName() + " sendTime with: " + aVar);
            if (!aVar.equals(a.END_SESSION)) {
                w();
            }
        }
    }

    t(b1 b1Var, v1 v1Var) {
        this.f28189c = b1Var;
        this.f28190d = v1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Long e() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f28188b
            monitor-enter(r0)
            java.lang.Long r1 = r7.f28187a     // Catch:{ all -> 0x003a }
            r2 = 0
            if (r1 != 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return r2
        L_0x000a:
            com.onesignal.c3 r1 = com.onesignal.k3.N0()     // Catch:{ all -> 0x003a }
            long r3 = r1.a()     // Catch:{ all -> 0x003a }
            java.lang.Long r1 = r7.f28187a     // Catch:{ all -> 0x003a }
            long r5 = r1.longValue()     // Catch:{ all -> 0x003a }
            long r3 = r3 - r5
            double r3 = (double) r3     // Catch:{ all -> 0x003a }
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 / r5
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r3 = r3 + r5
            long r3 = (long) r3     // Catch:{ all -> 0x003a }
            r5 = 1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0038
            r5 = 86400(0x15180, double:4.26873E-319)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0032
            goto L_0x0038
        L_0x0032:
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return r1
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return r2
        L_0x003a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.t.e():java.lang.Long");
    }

    private boolean f(List<ja.a> list, a aVar) {
        Long e10 = e();
        if (e10 == null) {
            return false;
        }
        this.f28189c.c(list).g(e10.longValue(), list, aVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        synchronized (this.f28188b) {
            v1 v1Var = this.f28190d;
            v1Var.d("Application backgrounded focus time: " + this.f28187a);
            this.f28189c.b().s();
            this.f28187a = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        synchronized (this.f28188b) {
            this.f28187a = Long.valueOf(k3.N0().a());
            v1 v1Var = this.f28190d;
            v1Var.d("Application foregrounded focus time: " + this.f28187a);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        Long e10 = e();
        synchronized (this.f28188b) {
            v1 v1Var = this.f28190d;
            v1Var.d("Application stopped focus time: " + this.f28187a + " timeElapsed: " + e10);
        }
        if (e10 != null) {
            List<ja.a> f10 = k3.J0().f();
            this.f28189c.c(f10).n(e10.longValue(), f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (!k3.h1()) {
            this.f28189c.b().v();
        }
    }

    /* access modifiers changed from: package-private */
    public void g(List<ja.a> list) {
        a aVar = a.END_SESSION;
        if (!f(list, aVar)) {
            this.f28189c.c(list).t(aVar);
        }
    }
}
