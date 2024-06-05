package ia;

import com.onesignal.c3;
import com.onesignal.v1;
import ja.b;
import ja.c;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSChannelTracker.kt */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private c f29019a;

    /* renamed from: b  reason: collision with root package name */
    private v1 f29020b;

    /* renamed from: c  reason: collision with root package name */
    private c3 f29021c;

    /* renamed from: d  reason: collision with root package name */
    private c f29022d;

    /* renamed from: e  reason: collision with root package name */
    private JSONArray f29023e;

    /* renamed from: f  reason: collision with root package name */
    private String f29024f;

    public a(c cVar, v1 v1Var, c3 c3Var) {
        m.e(cVar, "dataRepository");
        m.e(v1Var, "logger");
        m.e(c3Var, "timeProvider");
        this.f29019a = cVar;
        this.f29020b = v1Var;
        this.f29021c = c3Var;
    }

    private final boolean q() {
        return this.f29019a.m();
    }

    private final boolean r() {
        return this.f29019a.n();
    }

    private final boolean s() {
        return this.f29019a.o();
    }

    public abstract void a(JSONObject jSONObject, ja.a aVar);

    public abstract void b();

    public abstract int c();

    public abstract b d();

    public final ja.a e() {
        b d10 = d();
        c cVar = c.DISABLED;
        ja.a aVar = new ja.a(d10, cVar, (JSONArray) null);
        if (this.f29022d == null) {
            p();
        }
        c cVar2 = this.f29022d;
        if (cVar2 != null) {
            cVar = cVar2;
        }
        if (cVar.d()) {
            if (q()) {
                aVar.e(new JSONArray().put(g()));
                aVar.f(c.DIRECT);
            }
        } else if (cVar.f()) {
            if (r()) {
                aVar.e(j());
                aVar.f(c.INDIRECT);
            }
        } else if (s()) {
            aVar.f(c.UNATTRIBUTED);
        }
        return aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !m.a(getClass(), obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f29022d != aVar.f29022d || !m.a(aVar.h(), h())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final c f() {
        return this.f29019a;
    }

    public final String g() {
        return this.f29024f;
    }

    public abstract String h();

    public int hashCode() {
        c cVar = this.f29022d;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + h().hashCode();
    }

    public abstract int i();

    public final JSONArray j() {
        return this.f29023e;
    }

    public final c k() {
        return this.f29022d;
    }

    public abstract JSONArray l() throws JSONException;

    public abstract JSONArray m(String str);

    public final JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray l10 = l();
            this.f29020b.d(m.m("OneSignal ChannelTracker getLastReceivedIds lastChannelObjectReceived: ", l10));
            long i10 = ((long) (i() * 60)) * 1000;
            long b10 = this.f29021c.b();
            int i11 = 0;
            int length = l10.length();
            if (length > 0) {
                while (true) {
                    int i12 = i11 + 1;
                    JSONObject jSONObject = l10.getJSONObject(i11);
                    if (b10 - jSONObject.getLong("time") <= i10) {
                        jSONArray.put(jSONObject.getString(h()));
                    }
                    if (i12 >= length) {
                        break;
                    }
                    i11 = i12;
                }
            }
        } catch (JSONException e10) {
            this.f29020b.c("Generating tracker getLastReceivedIds JSONObject ", e10);
        }
        return jSONArray;
    }

    public final v1 o() {
        return this.f29020b;
    }

    public abstract void p();

    public final void t() {
        int i10;
        this.f29024f = null;
        JSONArray n10 = n();
        this.f29023e = n10;
        if (n10 == null) {
            i10 = 0;
        } else {
            i10 = n10.length();
        }
        this.f29022d = i10 > 0 ? c.INDIRECT : c.UNATTRIBUTED;
        b();
        v1 v1Var = this.f29020b;
        v1Var.d("OneSignal OSChannelTracker resetAndInitInfluence: " + h() + " finish with influenceType: " + this.f29022d);
    }

    public String toString() {
        return "OSChannelTracker{tag=" + h() + ", influenceType=" + this.f29022d + ", indirectIds=" + this.f29023e + ", directId=" + this.f29024f + '}';
    }

    public abstract void u(JSONArray jSONArray);

    public final void v(String str) {
        v1 v1Var = this.f29020b;
        v1Var.d("OneSignal OSChannelTracker for: " + h() + " saveLastId: " + str);
        if (str != null) {
            if (!(str.length() == 0)) {
                JSONArray m10 = m(str);
                v1 v1Var2 = this.f29020b;
                v1Var2.d("OneSignal OSChannelTracker for: " + h() + " saveLastId with lastChannelObjectsReceived: " + m10);
                try {
                    m10.put(new JSONObject().put(h(), str).put("time", this.f29021c.b()));
                    if (m10.length() > c()) {
                        int length = m10.length() - c();
                        JSONArray jSONArray = new JSONArray();
                        int length2 = m10.length();
                        if (length < length2) {
                            while (true) {
                                int i10 = length + 1;
                                try {
                                    jSONArray.put(m10.get(length));
                                } catch (JSONException e10) {
                                    this.f29020b.c("Generating tracker lastChannelObjectsReceived get JSONObject ", e10);
                                }
                                if (i10 >= length2) {
                                    break;
                                }
                                length = i10;
                            }
                        }
                        m10 = jSONArray;
                    }
                    v1 v1Var3 = this.f29020b;
                    v1Var3.d("OneSignal OSChannelTracker for: " + h() + " with channelObjectToSave: " + m10);
                    u(m10);
                } catch (JSONException e11) {
                    this.f29020b.c("Generating tracker newInfluenceId JSONObject ", e11);
                }
            }
        }
    }

    public final void w(String str) {
        this.f29024f = str;
    }

    public final void x(JSONArray jSONArray) {
        this.f29023e = jSONArray;
    }

    public final void y(c cVar) {
        this.f29022d = cVar;
    }
}
