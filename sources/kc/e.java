package kc;

import java.util.HashMap;
import java.util.Map;
import lc.c;
import lc.j;
import lc.k;
import lc.s;

/* compiled from: KeyboardChannel */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final k f35811a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public b f35812b;

    /* renamed from: c  reason: collision with root package name */
    public final k.c f35813c;

    /* compiled from: KeyboardChannel */
    class a implements k.c {

        /* renamed from: a  reason: collision with root package name */
        Map<Long, Long> f35814a = new HashMap();

        a() {
        }

        public void onMethodCall(j jVar, k.d dVar) {
            if (e.this.f35812b == null) {
                dVar.success(this.f35814a);
                return;
            }
            String str = jVar.f36116a;
            str.hashCode();
            if (!str.equals("getKeyboardState")) {
                dVar.notImplemented();
                return;
            }
            try {
                this.f35814a = e.this.f35812b.b();
            } catch (IllegalStateException e10) {
                dVar.error("error", e10.getMessage(), (Object) null);
            }
            dVar.success(this.f35814a);
        }
    }

    /* compiled from: KeyboardChannel */
    public interface b {
        Map<Long, Long> b();
    }

    public e(c cVar) {
        a aVar = new a();
        this.f35813c = aVar;
        k kVar = new k(cVar, "flutter/keyboard", s.f36131b);
        this.f35811a = kVar;
        kVar.e(aVar);
    }

    public void b(b bVar) {
        this.f35812b = bVar;
    }
}
