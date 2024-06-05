package b6;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: CircularRevealWidget */
public interface d {

    /* compiled from: CircularRevealWidget */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f24267b = new b();

        /* renamed from: a  reason: collision with root package name */
        private final e f24268a = new e();

        /* renamed from: a */
        public e evaluate(float f10, e eVar, e eVar2) {
            this.f24268a.a(i6.a.c(eVar.f24271a, eVar2.f24271a, f10), i6.a.c(eVar.f24272b, eVar2.f24272b, f10), i6.a.c(eVar.f24273c, eVar2.f24273c, f10));
            return this.f24268a;
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class c extends Property<d, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, e> f24269a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        /* renamed from: a */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: b6.d$d  reason: collision with other inner class name */
    /* compiled from: CircularRevealWidget */
    public static class C0258d extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, Integer> f24270a = new C0258d("circularRevealScrimColor");

        private C0258d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f24271a;

        /* renamed from: b  reason: collision with root package name */
        public float f24272b;

        /* renamed from: c  reason: collision with root package name */
        public float f24273c;

        public void a(float f10, float f11, float f12) {
            this.f24271a = f10;
            this.f24272b = f11;
            this.f24273c = f12;
        }

        private e() {
        }

        public e(float f10, float f11, float f12) {
            this.f24271a = f10;
            this.f24272b = f11;
            this.f24273c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(e eVar);
}
