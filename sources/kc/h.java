package kc;

import java.util.HashMap;
import lc.j;
import lc.k;
import lc.s;

/* compiled from: MouseCursorChannel */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final k f35831a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public b f35832b;

    /* renamed from: c  reason: collision with root package name */
    private final k.c f35833c;

    /* compiled from: MouseCursorChannel */
    class a implements k.c {
        a() {
        }

        public void onMethodCall(j jVar, k.d dVar) {
            if (h.this.f35832b != null) {
                String str = jVar.f36116a;
                xb.b.f("MouseCursorChannel", "Received '" + str + "' message.");
                char c10 = 65535;
                try {
                    if (str.hashCode() == -1307105544) {
                        if (str.equals("activateSystemCursor")) {
                            c10 = 0;
                        }
                    }
                    if (c10 == 0) {
                        try {
                            h.this.f35832b.a((String) ((HashMap) jVar.f36117b).get("kind"));
                            dVar.success(Boolean.TRUE);
                        } catch (Exception e10) {
                            dVar.error("error", "Error when setting cursors: " + e10.getMessage(), (Object) null);
                        }
                    }
                } catch (Exception e11) {
                    dVar.error("error", "Unhandled error: " + e11.getMessage(), (Object) null);
                }
            }
        }
    }

    /* compiled from: MouseCursorChannel */
    public interface b {
        void a(String str);
    }

    public h(zb.a aVar) {
        a aVar2 = new a();
        this.f35833c = aVar2;
        k kVar = new k(aVar, "flutter/mousecursor", s.f36131b);
        this.f35831a = kVar;
        kVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f35832b = bVar;
    }
}
