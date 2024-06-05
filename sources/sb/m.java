package sb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import lc.a;
import lc.i;
import sb.a;

/* compiled from: Pigeon */
public final /* synthetic */ class m {

    /* compiled from: Pigeon */
    class a implements a.m<a.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f38096a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f38097b;

        a(Map map, a.e eVar) {
            this.f38096a = map;
            this.f38097b = eVar;
        }

        public void a(Throwable th) {
            this.f38096a.put("error", a.b(th));
            this.f38097b.a(this.f38096a);
        }

        /* renamed from: b */
        public void success(a.f fVar) {
            this.f38096a.put("result", fVar);
            this.f38097b.a(this.f38096a);
        }
    }

    /* compiled from: Pigeon */
    class b implements a.m<a.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f38098a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f38099b;

        b(Map map, a.e eVar) {
            this.f38098a = map;
            this.f38099b = eVar;
        }

        public void a(Throwable th) {
            this.f38098a.put("error", a.b(th));
            this.f38099b.a(this.f38098a);
        }

        /* renamed from: b */
        public void success(a.f fVar) {
            this.f38098a.put("result", fVar);
            this.f38099b.a(this.f38098a);
        }
    }

    /* compiled from: Pigeon */
    class c implements a.m<a.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f38100a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f38101b;

        c(Map map, a.e eVar) {
            this.f38100a = map;
            this.f38101b = eVar;
        }

        public void a(Throwable th) {
            this.f38100a.put("error", a.b(th));
            this.f38101b.a(this.f38100a);
        }

        /* renamed from: b */
        public void success(a.f fVar) {
            this.f38100a.put("result", fVar);
            this.f38101b.a(this.f38100a);
        }
    }

    /* compiled from: Pigeon */
    class d implements a.m<a.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f38102a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f38103b;

        d(Map map, a.e eVar) {
            this.f38102a = map;
            this.f38103b = eVar;
        }

        public void a(Throwable th) {
            this.f38102a.put("error", a.b(th));
            this.f38103b.a(this.f38102a);
        }

        /* renamed from: b */
        public void success(a.b bVar) {
            this.f38102a.put("result", bVar);
            this.f38103b.a(this.f38102a);
        }
    }

    /* compiled from: Pigeon */
    class e implements a.m<a.k> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f38104a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f38105b;

        e(Map map, a.e eVar) {
            this.f38104a = map;
            this.f38105b = eVar;
        }

        public void a(Throwable th) {
            this.f38104a.put("error", a.b(th));
            this.f38105b.a(this.f38104a);
        }

        /* renamed from: b */
        public void success(a.k kVar) {
            this.f38104a.put("result", kVar);
            this.f38105b.a(this.f38104a);
        }
    }

    /* compiled from: Pigeon */
    class f implements a.m<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f38106a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f38107b;

        f(Map map, a.e eVar) {
            this.f38106a = map;
            this.f38107b = eVar;
        }

        public void a(Throwable th) {
            this.f38106a.put("error", a.b(th));
            this.f38107b.a(this.f38106a);
        }

        /* renamed from: b */
        public void success(Void voidR) {
            this.f38106a.put("result", (Object) null);
            this.f38107b.a(this.f38106a);
        }
    }

    /* compiled from: Pigeon */
    class g implements a.m<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f38108a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f38109b;

        g(Map map, a.e eVar) {
            this.f38108a = map;
            this.f38109b = eVar;
        }

        public void a(Throwable th) {
            this.f38108a.put("error", a.b(th));
            this.f38109b.a(this.f38108a);
        }

        /* renamed from: b */
        public void success(Void voidR) {
            this.f38108a.put("result", (Object) null);
            this.f38109b.a(this.f38108a);
        }
    }

    public static i<Object> l() {
        return a.h.f38047d;
    }

    public static /* synthetic */ void m(a.g gVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            a.d dVar = (a.d) ((ArrayList) obj).get(0);
            if (dVar != null) {
                gVar.i(dVar, new a(hashMap, eVar));
                return;
            }
            throw new NullPointerException("messageArg unexpectedly null.");
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", a.b(e10));
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void n(a.g gVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            a.e eVar2 = (a.e) ((ArrayList) obj).get(0);
            if (eVar2 != null) {
                gVar.g(eVar2, new b(hashMap, eVar));
                return;
            }
            throw new NullPointerException("messageArg unexpectedly null.");
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", a.b(e10));
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void o(a.g gVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            a.n nVar = (a.n) ((ArrayList) obj).get(0);
            if (nVar != null) {
                gVar.c(nVar);
                hashMap.put("result", (Object) null);
                eVar.a(hashMap);
                return;
            }
            throw new NullPointerException("messageArg unexpectedly null.");
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", a.b(e10));
        }
    }

    public static /* synthetic */ void p(a.g gVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            a.e eVar2 = (a.e) ((ArrayList) obj).get(0);
            if (eVar2 != null) {
                gVar.h(eVar2, new c(hashMap, eVar));
                return;
            }
            throw new NullPointerException("messageArg unexpectedly null.");
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", a.b(e10));
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void q(a.g gVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            a.c cVar = (a.c) ((ArrayList) obj).get(0);
            if (cVar != null) {
                gVar.b(cVar);
                hashMap.put("result", (Object) null);
                eVar.a(hashMap);
                return;
            }
            throw new NullPointerException("messageArg unexpectedly null.");
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", a.b(e10));
        }
    }

    public static /* synthetic */ void r(a.g gVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            a.C0429a aVar = (a.C0429a) ((ArrayList) obj).get(0);
            if (aVar != null) {
                gVar.e(aVar, new d(hashMap, eVar));
                return;
            }
            throw new NullPointerException("messageArg unexpectedly null.");
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", a.b(e10));
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void s(a.g gVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            a.j jVar = (a.j) ((ArrayList) obj).get(0);
            if (jVar != null) {
                gVar.k(jVar, new e(hashMap, eVar));
                return;
            }
            throw new NullPointerException("messageArg unexpectedly null.");
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", a.b(e10));
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void t(a.g gVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            a.c cVar = (a.c) ((ArrayList) obj).get(0);
            if (cVar != null) {
                gVar.d(cVar);
                hashMap.put("result", (Object) null);
                eVar.a(hashMap);
                return;
            }
            throw new NullPointerException("messageArg unexpectedly null.");
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", a.b(e10));
        }
    }

    public static /* synthetic */ void u(a.g gVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", gVar.j());
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", a.b(e10));
        }
        eVar.a(hashMap);
    }

    public static /* synthetic */ void v(a.g gVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            a.o oVar = (a.o) ((ArrayList) obj).get(0);
            if (oVar != null) {
                gVar.f(oVar, new f(hashMap, eVar));
                return;
            }
            throw new NullPointerException("messageArg unexpectedly null.");
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", a.b(e10));
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void w(a.g gVar, Object obj, a.e eVar) {
        HashMap hashMap = new HashMap();
        try {
            a.l lVar = (a.l) ((ArrayList) obj).get(0);
            if (lVar != null) {
                gVar.a(lVar, new g(hashMap, eVar));
                return;
            }
            throw new NullPointerException("messageArg unexpectedly null.");
        } catch (Error | RuntimeException e10) {
            hashMap.put("error", a.b(e10));
            eVar.a(hashMap);
        }
    }

    public static void x(lc.c cVar, a.g gVar) {
        lc.a aVar = new lc.a(cVar, "dev.flutter.pigeon.PdfxApi.openDocumentData", l());
        if (gVar != null) {
            aVar.e(new g(gVar));
        } else {
            aVar.e((a.d) null);
        }
        lc.a aVar2 = new lc.a(cVar, "dev.flutter.pigeon.PdfxApi.openDocumentFile", l());
        if (gVar != null) {
            aVar2.e(new i(gVar));
        } else {
            aVar2.e((a.d) null);
        }
        lc.a aVar3 = new lc.a(cVar, "dev.flutter.pigeon.PdfxApi.openDocumentAsset", l());
        if (gVar != null) {
            aVar3.e(new j(gVar));
        } else {
            aVar3.e((a.d) null);
        }
        lc.a aVar4 = new lc.a(cVar, "dev.flutter.pigeon.PdfxApi.closeDocument", l());
        if (gVar != null) {
            aVar4.e(new h(gVar));
        } else {
            aVar4.e((a.d) null);
        }
        lc.a aVar5 = new lc.a(cVar, "dev.flutter.pigeon.PdfxApi.getPage", l());
        if (gVar != null) {
            aVar5.e(new d(gVar));
        } else {
            aVar5.e((a.d) null);
        }
        lc.a aVar6 = new lc.a(cVar, "dev.flutter.pigeon.PdfxApi.renderPage", l());
        if (gVar != null) {
            aVar6.e(new k(gVar));
        } else {
            aVar6.e((a.d) null);
        }
        lc.a aVar7 = new lc.a(cVar, "dev.flutter.pigeon.PdfxApi.closePage", l());
        if (gVar != null) {
            aVar7.e(new f(gVar));
        } else {
            aVar7.e((a.d) null);
        }
        lc.a aVar8 = new lc.a(cVar, "dev.flutter.pigeon.PdfxApi.registerTexture", l());
        if (gVar != null) {
            aVar8.e(new l(gVar));
        } else {
            aVar8.e((a.d) null);
        }
        lc.a aVar9 = new lc.a(cVar, "dev.flutter.pigeon.PdfxApi.updateTexture", l());
        if (gVar != null) {
            aVar9.e(new b(gVar));
        } else {
            aVar9.e((a.d) null);
        }
        lc.a aVar10 = new lc.a(cVar, "dev.flutter.pigeon.PdfxApi.resizeTexture", l());
        if (gVar != null) {
            aVar10.e(new e(gVar));
        } else {
            aVar10.e((a.d) null);
        }
        lc.a aVar11 = new lc.a(cVar, "dev.flutter.pigeon.PdfxApi.unregisterTexture", l());
        if (gVar != null) {
            aVar11.e(new c(gVar));
        } else {
            aVar11.e((a.d) null);
        }
    }
}
