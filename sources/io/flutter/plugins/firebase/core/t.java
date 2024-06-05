package io.flutter.plugins.firebase.core;

import io.flutter.plugins.firebase.core.p;
import java.util.ArrayList;
import java.util.List;
import lc.a;
import lc.i;

/* compiled from: GeneratedAndroidFirebaseCore */
public final /* synthetic */ class t {

    /* compiled from: GeneratedAndroidFirebaseCore */
    class a implements p.g<p.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f33856a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f33857b;

        a(ArrayList arrayList, a.e eVar) {
            this.f33856a = arrayList;
            this.f33857b = eVar;
        }

        public void a(Throwable th) {
            this.f33857b.a(p.a(th));
        }

        /* renamed from: b */
        public void success(p.f fVar) {
            this.f33856a.add(0, fVar);
            this.f33857b.a(this.f33856a);
        }
    }

    /* compiled from: GeneratedAndroidFirebaseCore */
    class b implements p.g<List<p.f>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f33858a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f33859b;

        b(ArrayList arrayList, a.e eVar) {
            this.f33858a = arrayList;
            this.f33859b = eVar;
        }

        public void a(Throwable th) {
            this.f33859b.a(p.a(th));
        }

        /* renamed from: b */
        public void success(List<p.f> list) {
            this.f33858a.add(0, list);
            this.f33859b.a(this.f33858a);
        }
    }

    /* compiled from: GeneratedAndroidFirebaseCore */
    class c implements p.g<p.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f33860a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f33861b;

        c(ArrayList arrayList, a.e eVar) {
            this.f33860a = arrayList;
            this.f33861b = eVar;
        }

        public void a(Throwable th) {
            this.f33861b.a(p.a(th));
        }

        /* renamed from: b */
        public void success(p.e eVar) {
            this.f33860a.add(0, eVar);
            this.f33861b.a(this.f33860a);
        }
    }

    public static i<Object> d() {
        return p.c.f33814d;
    }

    public static /* synthetic */ void e(p.b bVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        bVar.a((String) arrayList.get(0), (p.e) arrayList.get(1), new a(new ArrayList(), eVar));
    }

    public static void h(lc.c cVar, p.b bVar) {
        lc.a aVar = new lc.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", d());
        if (bVar != null) {
            aVar.e(new s(bVar));
        } else {
            aVar.e((a.d) null);
        }
        lc.a aVar2 = new lc.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", d());
        if (bVar != null) {
            aVar2.e(new q(bVar));
        } else {
            aVar2.e((a.d) null);
        }
        lc.a aVar3 = new lc.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", d());
        if (bVar != null) {
            aVar3.e(new r(bVar));
        } else {
            aVar3.e((a.d) null);
        }
    }
}
