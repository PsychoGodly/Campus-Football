package com.iab.omid.library.applovin.processor;

import android.view.View;
import com.iab.omid.library.applovin.adsession.a;
import com.iab.omid.library.applovin.processor.a;
import com.iab.omid.library.applovin.utils.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f27409a;

    public c(a aVar) {
        this.f27409a = aVar;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.applovin.internal.c c10 = com.iab.omid.library.applovin.internal.c.c();
        if (c10 != null) {
            Collection<a> a10 = c10.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a10.size() * 2) + 3);
            for (a c11 : a10) {
                View c12 = c11.c();
                if (c12 != null && h.e(c12) && (rootView = c12.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float c13 = h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.c(arrayList.get(size - 1)) > c13) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    public JSONObject a(View view) {
        JSONObject a10 = com.iab.omid.library.applovin.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.applovin.utils.c.a(a10, e.a());
        return a10;
    }

    public void a(View view, JSONObject jSONObject, a.C0285a aVar, boolean z10, boolean z11) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            aVar.a(it.next(), this.f27409a, jSONObject, z11);
        }
    }
}
