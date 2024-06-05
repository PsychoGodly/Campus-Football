package uc;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.ads.nativetemplates.TemplateView;
import java.util.Objects;
import y1.a;

/* compiled from: FlutterNativeTemplateStyle */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    final d f38751a;

    /* renamed from: b  reason: collision with root package name */
    final ColorDrawable f38752b;

    /* renamed from: c  reason: collision with root package name */
    final c f38753c;

    /* renamed from: d  reason: collision with root package name */
    final c f38754d;

    /* renamed from: e  reason: collision with root package name */
    final c f38755e;

    /* renamed from: f  reason: collision with root package name */
    final c f38756f;

    public b(d dVar, ColorDrawable colorDrawable, c cVar, c cVar2, c cVar3, c cVar4) {
        this.f38751a = dVar;
        this.f38752b = colorDrawable;
        this.f38753c = cVar;
        this.f38754d = cVar2;
        this.f38755e = cVar3;
        this.f38756f = cVar4;
    }

    public a a() {
        a.C0248a aVar = new a.C0248a();
        ColorDrawable colorDrawable = this.f38752b;
        if (colorDrawable != null) {
            aVar.f(colorDrawable);
        }
        c cVar = this.f38753c;
        if (cVar != null) {
            if (cVar.a() != null) {
                aVar.b(this.f38753c.a());
            }
            if (this.f38753c.d() != null) {
                aVar.e(this.f38753c.d().getColor());
            }
            if (this.f38753c.b() != null) {
                aVar.d(this.f38753c.b().c());
            }
            if (this.f38753c.c() != null) {
                aVar.c(this.f38753c.c().floatValue());
            }
        }
        c cVar2 = this.f38754d;
        if (cVar2 != null) {
            if (cVar2.a() != null) {
                aVar.g(this.f38754d.a());
            }
            if (this.f38754d.d() != null) {
                aVar.j(this.f38754d.d().getColor());
            }
            if (this.f38754d.b() != null) {
                aVar.i(this.f38754d.b().c());
            }
            if (this.f38754d.c() != null) {
                aVar.h(this.f38754d.c().floatValue());
            }
        }
        c cVar3 = this.f38755e;
        if (cVar3 != null) {
            if (cVar3.a() != null) {
                aVar.k(this.f38755e.a());
            }
            if (this.f38755e.d() != null) {
                aVar.n(this.f38755e.d().getColor());
            }
            if (this.f38755e.b() != null) {
                aVar.m(this.f38755e.b().c());
            }
            if (this.f38755e.c() != null) {
                aVar.l(this.f38755e.c().floatValue());
            }
        }
        c cVar4 = this.f38756f;
        if (cVar4 != null) {
            if (cVar4.a() != null) {
                aVar.o(this.f38756f.a());
            }
            if (this.f38756f.d() != null) {
                aVar.r(this.f38756f.d().getColor());
            }
            if (this.f38756f.b() != null) {
                aVar.q(this.f38756f.b().c());
            }
            if (this.f38756f.c() != null) {
                aVar.p(this.f38756f.c().floatValue());
            }
        }
        return aVar.a();
    }

    public TemplateView b(Context context) {
        TemplateView templateView = (TemplateView) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.f38751a.c(), (ViewGroup) null);
        templateView.setStyles(a());
        return templateView;
    }

    public c c() {
        return this.f38753c;
    }

    public ColorDrawable d() {
        return this.f38752b;
    }

    public c e() {
        return this.f38754d;
    }

    public boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f38751a != bVar.f38751a || ((((colorDrawable = this.f38752b) != null || bVar.f38752b != null) && colorDrawable.getColor() != bVar.f38752b.getColor()) || !Objects.equals(this.f38753c, bVar.f38753c) || !Objects.equals(this.f38754d, bVar.f38754d) || !Objects.equals(this.f38755e, bVar.f38755e) || !Objects.equals(this.f38756f, bVar.f38756f))) {
            return false;
        }
        return true;
    }

    public c f() {
        return this.f38755e;
    }

    public d g() {
        return this.f38751a;
    }

    public c h() {
        return this.f38756f;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        ColorDrawable colorDrawable = this.f38752b;
        objArr[0] = colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor());
        objArr[1] = this.f38753c;
        objArr[2] = this.f38754d;
        objArr[3] = this.f38755e;
        objArr[4] = this.f38756f;
        return Objects.hash(objArr);
    }
}
