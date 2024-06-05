package la;

import com.onesignal.v1;
import com.unity3d.ads.metadata.MediationMetaData;
import ja.a;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m;
import ma.b;
import ma.c;

/* compiled from: OSOutcomeEventsRepository.kt */
public abstract class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final v1 f29215a;

    /* renamed from: b  reason: collision with root package name */
    private final a f29216b;

    /* renamed from: c  reason: collision with root package name */
    private final j f29217c;

    public d(v1 v1Var, a aVar, j jVar) {
        m.e(v1Var, "logger");
        m.e(aVar, "outcomeEventsCache");
        m.e(jVar, "outcomeEventsService");
        this.f29215a = v1Var;
        this.f29216b = aVar;
        this.f29217c = jVar;
    }

    public void b(b bVar) {
        m.e(bVar, "eventParams");
        this.f29216b.m(bVar);
    }

    public List<a> c(String str, List<a> list) {
        m.e(str, MediationMetaData.KEY_NAME);
        m.e(list, "influences");
        List<a> g10 = this.f29216b.g(str, list);
        this.f29215a.d(m.m("OneSignal getNotCachedUniqueOutcome influences: ", g10));
        return g10;
    }

    public void d(b bVar) {
        m.e(bVar, "outcomeEvent");
        this.f29216b.d(bVar);
    }

    public List<b> e() {
        return this.f29216b.e();
    }

    public void f(Set<String> set) {
        m.e(set, "unattributedUniqueOutcomeEvents");
        this.f29215a.d(m.m("OneSignal save unattributedUniqueOutcomeEvents: ", set));
        this.f29216b.l(set);
    }

    public void g(b bVar) {
        m.e(bVar, "event");
        this.f29216b.k(bVar);
    }

    public void h(String str, String str2) {
        m.e(str, "notificationTableName");
        m.e(str2, "notificationIdColumnName");
        this.f29216b.c(str, str2);
    }

    public Set<String> i() {
        Set<String> i10 = this.f29216b.i();
        this.f29215a.d(m.m("OneSignal getUnattributedUniqueOutcomeEventsSentByChannel: ", i10));
        return i10;
    }

    /* access modifiers changed from: protected */
    public final v1 j() {
        return this.f29215a;
    }

    public final j k() {
        return this.f29217c;
    }
}
