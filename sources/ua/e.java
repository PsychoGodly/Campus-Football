package ua;

import lc.c;
import lc.d;

/* compiled from: BetterEventChannel */
public class e implements d.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public d.b f23019a;

    /* compiled from: BetterEventChannel */
    class a implements d.C0413d {
        a() {
        }

        public void g(Object obj) {
            d.b unused = e.this.f23019a = null;
        }

        public void h(Object obj, d.b bVar) {
            d.b unused = e.this.f23019a = bVar;
        }
    }

    public e(c cVar, String str) {
        new d(cVar, str).d(new a());
    }

    public void a() {
        d.b bVar = this.f23019a;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void error(String str, String str2, Object obj) {
        d.b bVar = this.f23019a;
        if (bVar != null) {
            bVar.error(str, str2, obj);
        }
    }

    public void success(Object obj) {
        d.b bVar = this.f23019a;
        if (bVar != null) {
            bVar.success(obj);
        }
    }
}
