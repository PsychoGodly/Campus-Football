package io.flutter.plugins.firebase.core;

import io.flutter.plugins.firebase.core.p;
import java.util.ArrayList;
import lc.a;
import lc.i;
import lc.r;

/* compiled from: GeneratedAndroidFirebaseCore */
public final /* synthetic */ class o {

    /* compiled from: GeneratedAndroidFirebaseCore */
    class a implements p.g<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f33808a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f33809b;

        a(ArrayList arrayList, a.e eVar) {
            this.f33808a = arrayList;
            this.f33809b = eVar;
        }

        public void a(Throwable th) {
            this.f33809b.a(p.a(th));
        }

        /* renamed from: b */
        public void success(Void voidR) {
            this.f33808a.add(0, (Object) null);
            this.f33809b.a(this.f33808a);
        }
    }

    /* compiled from: GeneratedAndroidFirebaseCore */
    class b implements p.g<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f33810a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f33811b;

        b(ArrayList arrayList, a.e eVar) {
            this.f33810a = arrayList;
            this.f33811b = eVar;
        }

        public void a(Throwable th) {
            this.f33811b.a(p.a(th));
        }

        /* renamed from: b */
        public void success(Void voidR) {
            this.f33810a.add(0, (Object) null);
            this.f33811b.a(this.f33810a);
        }
    }

    /* compiled from: GeneratedAndroidFirebaseCore */
    class c implements p.g<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f33812a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f33813b;

        c(ArrayList arrayList, a.e eVar) {
            this.f33812a = arrayList;
            this.f33813b = eVar;
        }

        public void a(Throwable th) {
            this.f33813b.a(p.a(th));
        }

        /* renamed from: b */
        public void success(Void voidR) {
            this.f33812a.add(0, (Object) null);
            this.f33813b.a(this.f33812a);
        }
    }

    public static i<Object> d() {
        return new r();
    }

    public static /* synthetic */ void e(p.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        aVar.f((String) arrayList.get(0), (Boolean) arrayList.get(1), new a(new ArrayList(), eVar));
    }

    public static /* synthetic */ void f(p.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        aVar.d((String) arrayList.get(0), (Boolean) arrayList.get(1), new b(new ArrayList(), eVar));
    }

    public static void h(lc.c cVar, p.a aVar) {
        lc.a aVar2 = new lc.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", d());
        if (aVar != null) {
            aVar2.e(new l(aVar));
        } else {
            aVar2.e((a.d) null);
        }
        lc.a aVar3 = new lc.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", d());
        if (aVar != null) {
            aVar3.e(new m(aVar));
        } else {
            aVar3.e((a.d) null);
        }
        lc.a aVar4 = new lc.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.delete", d());
        if (aVar != null) {
            aVar4.e(new n(aVar));
        } else {
            aVar4.e((a.d) null);
        }
    }
}
