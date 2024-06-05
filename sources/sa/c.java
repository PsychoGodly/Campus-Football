package sa;

import dc.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import lc.j;
import lc.k;

/* compiled from: AudioSessionPlugin */
public class c implements a, k.c {

    /* renamed from: c  reason: collision with root package name */
    private static Map<?, ?> f22519c;

    /* renamed from: d  reason: collision with root package name */
    private static List<c> f22520d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    private k f22521a;

    /* renamed from: b  reason: collision with root package name */
    private b f22522b;

    private void a(String str, Object... objArr) {
        for (c cVar : f22520d) {
            cVar.f22521a.c(str, new ArrayList(Arrays.asList(objArr)));
        }
    }

    public void onAttachedToEngine(a.b bVar) {
        lc.c b10 = bVar.b();
        k kVar = new k(b10, "com.ryanheise.audio_session");
        this.f22521a = kVar;
        kVar.e(this);
        this.f22522b = new b(bVar.a(), b10);
        f22520d.add(this);
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f22521a.e((k.c) null);
        this.f22521a = null;
        this.f22522b.c();
        this.f22522b = null;
        f22520d.remove(this);
    }

    public void onMethodCall(j jVar, k.d dVar) {
        List list = (List) jVar.f36117b;
        String str = jVar.f36116a;
        str.hashCode();
        if (str.equals("setConfiguration")) {
            f22519c = (Map) list.get(0);
            dVar.success((Object) null);
            a("onConfigurationChanged", f22519c);
        } else if (!str.equals("getConfiguration")) {
            dVar.notImplemented();
        } else {
            dVar.success(f22519c);
        }
    }
}
