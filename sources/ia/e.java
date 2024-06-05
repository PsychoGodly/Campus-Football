package ia;

import com.onesignal.c3;
import com.onesignal.k3;
import com.onesignal.t2;
import com.onesignal.u3;
import com.onesignal.v1;
import ja.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

/* compiled from: OSTrackerFactory.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, a> f29026a;

    /* renamed from: b  reason: collision with root package name */
    private final c f29027b;

    /* compiled from: OSTrackerFactory.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29028a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.NOTIFICATION.ordinal()] = 1;
            iArr[b.IAM.ordinal()] = 2;
            f29028a = iArr;
        }
    }

    public e(t2 t2Var, v1 v1Var, c3 c3Var) {
        m.e(t2Var, "preferences");
        m.e(v1Var, "logger");
        m.e(c3Var, "timeProvider");
        ConcurrentHashMap<String, a> concurrentHashMap = new ConcurrentHashMap<>();
        this.f29026a = concurrentHashMap;
        c cVar = new c(t2Var);
        this.f29027b = cVar;
        ha.a aVar = ha.a.f28994a;
        concurrentHashMap.put(aVar.a(), new b(cVar, v1Var, c3Var));
        concurrentHashMap.put(aVar.b(), new d(cVar, v1Var, c3Var));
    }

    public final void a(JSONObject jSONObject, List<ja.a> list) {
        m.e(jSONObject, "jsonObject");
        m.e(list, "influences");
        for (ja.a aVar : list) {
            if (a.f29028a[aVar.c().ordinal()] == 1) {
                g().a(jSONObject, aVar);
            }
        }
    }

    public final a b(k3.i0 i0Var) {
        m.e(i0Var, "entryAction");
        if (i0Var.d()) {
            return g();
        }
        return null;
    }

    public final List<a> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(g());
        arrayList.add(e());
        return arrayList;
    }

    public final List<a> d(k3.i0 i0Var) {
        m.e(i0Var, "entryAction");
        ArrayList arrayList = new ArrayList();
        if (i0Var.a()) {
            return arrayList;
        }
        a g10 = i0Var.c() ? g() : null;
        if (g10 != null) {
            arrayList.add(g10);
        }
        arrayList.add(e());
        return arrayList;
    }

    public final a e() {
        a aVar = this.f29026a.get(ha.a.f28994a.a());
        m.b(aVar);
        m.d(aVar, "trackers[OSInfluenceConstants.IAM_TAG]!!");
        return aVar;
    }

    public final List<ja.a> f() {
        Collection<a> values = this.f29026a.values();
        m.d(values, "trackers.values");
        ArrayList arrayList = new ArrayList(r.j(values, 10));
        for (a e10 : values) {
            arrayList.add(e10.e());
        }
        return arrayList;
    }

    public final a g() {
        a aVar = this.f29026a.get(ha.a.f28994a.b());
        m.b(aVar);
        m.d(aVar, "trackers[OSInfluenceConstants.NOTIFICATION_TAG]!!");
        return aVar;
    }

    public final List<ja.a> h() {
        Collection<a> values = this.f29026a.values();
        m.d(values, "trackers.values");
        ArrayList<a> arrayList = new ArrayList<>();
        for (T next : values) {
            if (!m.a(((a) next).h(), ha.a.f28994a.a())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.j(arrayList, 10));
        for (a e10 : arrayList) {
            arrayList2.add(e10.e());
        }
        return arrayList2;
    }

    public final void i() {
        Collection<a> values = this.f29026a.values();
        m.d(values, "trackers.values");
        for (a p10 : values) {
            p10.p();
        }
    }

    public final void j(u3.e eVar) {
        m.e(eVar, "influenceParams");
        this.f29027b.q(eVar);
    }
}
