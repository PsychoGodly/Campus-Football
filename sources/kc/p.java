package kc;

import java.util.HashMap;
import lc.a;
import lc.f;
import xb.b;

/* compiled from: SystemChannel */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public final a<Object> f35948a;

    public p(zb.a aVar) {
        this.f35948a = new a<>(aVar, "flutter/system", f.f36114a);
    }

    public void a() {
        b.f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f35948a.c(hashMap);
    }
}
