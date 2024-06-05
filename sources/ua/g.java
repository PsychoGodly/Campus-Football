package ua;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.c;
import lc.j;
import lc.k;

/* compiled from: MainMethodCallHandler */
public class g implements k.c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f23024a;

    /* renamed from: b  reason: collision with root package name */
    private final c f23025b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, d> f23026c = new HashMap();

    public g(Context context, c cVar) {
        this.f23024a = context;
        this.f23025b = cVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Iterator it = new ArrayList(this.f23026c.values()).iterator();
        while (it.hasNext()) {
            ((d) it.next()).z0();
        }
        this.f23026c.clear();
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3237136:
                if (str.equals("init")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1999985120:
                if (str.equals("disposePlayer")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2146443344:
                if (str.equals("disposeAllPlayers")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                String str2 = (String) jVar.a("id");
                if (this.f23026c.containsKey(str2)) {
                    dVar.error("Platform player " + str2 + " already exists", (String) null, (Object) null);
                    return;
                }
                String str3 = str2;
                this.f23026c.put(str2, new d(this.f23024a, this.f23025b, str3, (Map) jVar.a("audioLoadConfiguration"), (List) jVar.a("androidAudioEffects"), (Boolean) jVar.a("androidOffloadSchedulingEnabled")));
                dVar.success((Object) null);
                return;
            case 1:
                String str4 = (String) jVar.a("id");
                d dVar2 = this.f23026c.get(str4);
                if (dVar2 != null) {
                    dVar2.z0();
                    this.f23026c.remove(str4);
                }
                dVar.success(new HashMap());
                return;
            case 2:
                a();
                dVar.success(new HashMap());
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
