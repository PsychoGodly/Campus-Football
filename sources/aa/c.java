package aa;

import aa.a;
import android.view.View;
import ca.e;
import ca.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;
import x9.o;

public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f24262a;

    public c(a aVar) {
        this.f24262a = aVar;
    }

    public JSONObject a(View view) {
        JSONObject c10 = ca.c.c(0, 0, 0, 0);
        ca.c.j(c10, e.a());
        return c10;
    }

    public void a(View view, JSONObject jSONObject, a.C0256a aVar, boolean z10, boolean z11) {
        Iterator<View> it = b().iterator();
        while (it.hasNext()) {
            aVar.a(it.next(), this.f24262a, jSONObject, z11);
        }
    }

    /* access modifiers changed from: package-private */
    public ArrayList<View> b() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        z9.c e10 = z9.c.e();
        if (e10 != null) {
            Collection<o> a10 = e10.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a10.size() * 2) + 3);
            for (o h10 : a10) {
                View h11 = h10.h();
                if (h11 != null && h.e(h11) && (rootView = h11.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float c10 = h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.c(arrayList.get(size - 1)) > c10) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }
}
