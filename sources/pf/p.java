package pf;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import lc.d;
import sd.n;

/* compiled from: AudioplayersPlugin.kt */
public final class p implements d.C0413d {

    /* renamed from: a  reason: collision with root package name */
    private final d f37465a;

    /* renamed from: b  reason: collision with root package name */
    private d.b f37466b;

    public p(d dVar) {
        m.e(dVar, "eventChannel");
        this.f37465a = dVar;
        dVar.d(this);
    }

    public static /* synthetic */ void d(p pVar, String str, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = new HashMap();
        }
        pVar.c(str, map);
    }

    public final void a() {
        d.b bVar = this.f37466b;
        if (bVar != null) {
            bVar.a();
            g((Object) null);
        }
        this.f37465a.d((d.C0413d) null);
    }

    public final void b(String str, String str2, Object obj) {
        d.b bVar = this.f37466b;
        if (bVar != null) {
            bVar.error(str, str2, obj);
        }
    }

    public final void c(String str, Map<String, ? extends Object> map) {
        m.e(str, "method");
        m.e(map, "arguments");
        d.b bVar = this.f37466b;
        if (bVar != null) {
            bVar.success(k0.o(map, new n("event", str)));
        }
    }

    public void g(Object obj) {
        this.f37466b = null;
    }

    public void h(Object obj, d.b bVar) {
        this.f37466b = bVar;
    }
}
