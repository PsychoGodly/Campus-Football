package io.flutter.embedding.engine;

import android.content.Context;
import bc.f;
import io.flutter.embedding.engine.a;
import io.flutter.plugin.platform.q;
import java.util.ArrayList;
import java.util.List;
import zb.a;

/* compiled from: FlutterEngineGroup */
public class d {

    /* renamed from: a  reason: collision with root package name */
    final List<a> f33584a = new ArrayList();

    /* compiled from: FlutterEngineGroup */
    class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33585a;

        a(a aVar) {
            this.f33585a = aVar;
        }

        public void a() {
            d.this.f33584a.remove(this.f33585a);
        }

        public void b() {
        }
    }

    /* compiled from: FlutterEngineGroup */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Context f33587a;

        /* renamed from: b  reason: collision with root package name */
        private a.c f33588b;

        /* renamed from: c  reason: collision with root package name */
        private String f33589c;

        /* renamed from: d  reason: collision with root package name */
        private List<String> f33590d;

        /* renamed from: e  reason: collision with root package name */
        private q f33591e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f33592f = true;

        /* renamed from: g  reason: collision with root package name */
        private boolean f33593g = false;

        public b(Context context) {
            this.f33587a = context;
        }

        public boolean a() {
            return this.f33592f;
        }

        public Context b() {
            return this.f33587a;
        }

        public a.c c() {
            return this.f33588b;
        }

        public List<String> d() {
            return this.f33590d;
        }

        public String e() {
            return this.f33589c;
        }

        public q f() {
            return this.f33591e;
        }

        public boolean g() {
            return this.f33593g;
        }

        public b h(boolean z10) {
            this.f33592f = z10;
            return this;
        }

        public b i(a.c cVar) {
            this.f33588b = cVar;
            return this;
        }

        public b j(List<String> list) {
            this.f33590d = list;
            return this;
        }

        public b k(String str) {
            this.f33589c = str;
            return this;
        }

        public b l(boolean z10) {
            this.f33593g = z10;
            return this;
        }
    }

    public d(Context context, String[] strArr) {
        f c10 = xb.a.e().c();
        if (!c10.n()) {
            c10.r(context.getApplicationContext());
            c10.g(context.getApplicationContext(), strArr);
        }
    }

    public a a(b bVar) {
        a aVar;
        Context b10 = bVar.b();
        a.c c10 = bVar.c();
        String e10 = bVar.e();
        List<String> d10 = bVar.d();
        q f10 = bVar.f();
        if (f10 == null) {
            f10 = new q();
        }
        q qVar = f10;
        boolean a10 = bVar.a();
        boolean g10 = bVar.g();
        a.c a11 = c10 == null ? a.c.a() : c10;
        if (this.f33584a.size() == 0) {
            aVar = b(b10, qVar, a10, g10);
            if (e10 != null) {
                aVar.n().c(e10);
            }
            aVar.j().l(a11, d10);
        } else {
            aVar = this.f33584a.get(0).y(b10, a11, e10, d10, qVar, a10, g10);
        }
        this.f33584a.add(aVar);
        aVar.e(new a(aVar));
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public a b(Context context, q qVar, boolean z10, boolean z11) {
        return new a(context, (f) null, (FlutterJNI) null, qVar, (String[]) null, z10, z11, this);
    }
}
