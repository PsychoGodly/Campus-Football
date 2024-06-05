package kc;

import java.util.ArrayList;
import lc.j;
import lc.k;
import lc.s;

/* compiled from: SpellCheckChannel */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public final k f35944a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public b f35945b;

    /* renamed from: c  reason: collision with root package name */
    public final k.c f35946c;

    /* compiled from: SpellCheckChannel */
    class a implements k.c {
        a() {
        }

        public void onMethodCall(j jVar, k.d dVar) {
            if (o.this.f35945b == null) {
                xb.b.f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = jVar.f36116a;
            Object obj = jVar.f36117b;
            xb.b.f("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.notImplemented();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                o.this.f35945b.a((String) arrayList.get(0), (String) arrayList.get(1), dVar);
            } catch (IllegalStateException e10) {
                dVar.error("error", e10.getMessage(), (Object) null);
            }
        }
    }

    /* compiled from: SpellCheckChannel */
    public interface b {
        void a(String str, String str2, k.d dVar);
    }

    public o(zb.a aVar) {
        a aVar2 = new a();
        this.f35946c = aVar2;
        k kVar = new k(aVar, "flutter/spellcheck", s.f36131b);
        this.f35944a = kVar;
        kVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f35945b = bVar;
    }
}
