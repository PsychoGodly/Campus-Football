package com.onesignal;

import com.onesignal.t;
import ja.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: OSFocusTimeProcessorFactory */
class b1 {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, t.c> f27560a;

    public b1() {
        HashMap<String, t.c> hashMap = new HashMap<>();
        this.f27560a = hashMap;
        hashMap.put(t.d.class.getName(), new t.d());
        hashMap.put(t.b.class.getName(), new t.b());
    }

    private t.c a() {
        return this.f27560a.get(t.b.class.getName());
    }

    private t.c d() {
        return this.f27560a.get(t.d.class.getName());
    }

    /* access modifiers changed from: package-private */
    public t.c b() {
        t.c a10 = a();
        for (a d10 : a10.j()) {
            if (d10.d().c()) {
                return a10;
            }
        }
        return d();
    }

    /* access modifiers changed from: package-private */
    public t.c c(List<a> list) {
        boolean z10;
        Iterator<a> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().d().c()) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return a();
        }
        return d();
    }
}
