package yc;

import java.util.ArrayList;
import java.util.List;
import lc.a;
import lc.c;
import lc.i;
import lc.r;
import yc.a;

/* compiled from: Messages */
public final /* synthetic */ class j {
    public static i<Object> i() {
        return new r();
    }

    public static /* synthetic */ void j(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.remove((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void k(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.f((String) arrayList2.get(0), (Boolean) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void l(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.e((String) arrayList2.get(0), (String) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void m(a.b bVar, Object obj, a.e eVar) {
        Long l10;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        String str = (String) arrayList2.get(0);
        Number number = (Number) arrayList2.get(1);
        if (number == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(number.longValue());
            } catch (Throwable th) {
                arrayList = a.a(th);
            }
        }
        arrayList.add(0, bVar.d(str, l10));
        eVar.a(arrayList);
    }

    public static /* synthetic */ void n(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.g((String) arrayList2.get(0), (Double) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void o(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.c((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void p(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.b((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void q(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.a((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static void r(c cVar, a.b bVar) {
        lc.a aVar = new lc.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.remove", i(), cVar.b());
        if (bVar != null) {
            aVar.e(new i(bVar));
        } else {
            aVar.e((a.d) null);
        }
        lc.a aVar2 = new lc.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setBool", i(), cVar.b());
        if (bVar != null) {
            aVar2.e(new b(bVar));
        } else {
            aVar2.e((a.d) null);
        }
        lc.a aVar3 = new lc.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setString", i(), cVar.b());
        if (bVar != null) {
            aVar3.e(new c(bVar));
        } else {
            aVar3.e((a.d) null);
        }
        lc.a aVar4 = new lc.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setInt", i(), cVar.b());
        if (bVar != null) {
            aVar4.e(new h(bVar));
        } else {
            aVar4.e((a.d) null);
        }
        lc.a aVar5 = new lc.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setDouble", i(), cVar.b());
        if (bVar != null) {
            aVar5.e(new g(bVar));
        } else {
            aVar5.e((a.d) null);
        }
        lc.a aVar6 = new lc.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.setStringList", i(), cVar.b());
        if (bVar != null) {
            aVar6.e(new d(bVar));
        } else {
            aVar6.e((a.d) null);
        }
        lc.a aVar7 = new lc.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.clear", i(), cVar.b());
        if (bVar != null) {
            aVar7.e(new f(bVar));
        } else {
            aVar7.e((a.d) null);
        }
        lc.a aVar8 = new lc.a(cVar, "dev.flutter.pigeon.SharedPreferencesApi.getAll", i(), cVar.b());
        if (bVar != null) {
            aVar8.e(new e(bVar));
        } else {
            aVar8.e((a.d) null);
        }
    }
}
