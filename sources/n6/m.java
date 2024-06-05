package n6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapePath */
public class m {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f29388a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f29389b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f29390c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f29391d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f29392e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f29393f;

    /* renamed from: g  reason: collision with root package name */
    private final List<f> f29394g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<g> f29395h = new ArrayList();

    /* compiled from: ShapePath */
    class a extends g {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f29396b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Matrix f29397c;

        a(List list, Matrix matrix) {
            this.f29396b = list;
            this.f29397c = matrix;
        }

        public void a(Matrix matrix, m6.a aVar, int i10, Canvas canvas) {
            for (g a10 : this.f29396b) {
                a10.a(this.f29397c, aVar, i10, canvas);
            }
        }
    }

    /* compiled from: ShapePath */
    static class b extends g {

        /* renamed from: b  reason: collision with root package name */
        private final d f29399b;

        public b(d dVar) {
            this.f29399b = dVar;
        }

        public void a(Matrix matrix, m6.a aVar, int i10, Canvas canvas) {
            float h10 = this.f29399b.m();
            float i11 = this.f29399b.n();
            aVar.a(canvas, matrix, new RectF(this.f29399b.k(), this.f29399b.o(), this.f29399b.l(), this.f29399b.j()), i10, h10, i11);
        }
    }

    /* compiled from: ShapePath */
    static class c extends g {

        /* renamed from: b  reason: collision with root package name */
        private final e f29400b;

        /* renamed from: c  reason: collision with root package name */
        private final float f29401c;

        /* renamed from: d  reason: collision with root package name */
        private final float f29402d;

        public c(e eVar, float f10, float f11) {
            this.f29400b = eVar;
            this.f29401c = f10;
            this.f29402d = f11;
        }

        public void a(Matrix matrix, m6.a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f29400b.f29411c - this.f29402d), (double) (this.f29400b.f29410b - this.f29401c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f29401c, this.f29402d);
            matrix2.preRotate(c());
            aVar.b(canvas, matrix2, rectF, i10);
        }

        /* access modifiers changed from: package-private */
        public float c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f29400b.f29411c - this.f29402d) / (this.f29400b.f29410b - this.f29401c))));
        }
    }

    /* compiled from: ShapePath */
    public static class d extends f {

        /* renamed from: h  reason: collision with root package name */
        private static final RectF f29403h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f29404b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f29405c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f29406d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f29407e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f29408f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f29409g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* access modifiers changed from: private */
        public float j() {
            return this.f29407e;
        }

        /* access modifiers changed from: private */
        public float k() {
            return this.f29404b;
        }

        /* access modifiers changed from: private */
        public float l() {
            return this.f29406d;
        }

        /* access modifiers changed from: private */
        public float m() {
            return this.f29408f;
        }

        /* access modifiers changed from: private */
        public float n() {
            return this.f29409g;
        }

        /* access modifiers changed from: private */
        public float o() {
            return this.f29405c;
        }

        private void p(float f10) {
            this.f29407e = f10;
        }

        private void q(float f10) {
            this.f29404b = f10;
        }

        private void r(float f10) {
            this.f29406d = f10;
        }

        /* access modifiers changed from: private */
        public void s(float f10) {
            this.f29408f = f10;
        }

        /* access modifiers changed from: private */
        public void t(float f10) {
            this.f29409g = f10;
        }

        private void u(float f10) {
            this.f29405c = f10;
        }

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f29412a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f29403h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath */
    public static class e extends f {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public float f29410b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public float f29411c;

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f29412a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f29410b, this.f29411c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath */
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        protected final Matrix f29412a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath */
    static abstract class g {

        /* renamed from: a  reason: collision with root package name */
        static final Matrix f29413a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, m6.a aVar, int i10, Canvas canvas);

        public final void b(m6.a aVar, int i10, Canvas canvas) {
            a(f29413a, aVar, i10, canvas);
        }
    }

    public m() {
        m(0.0f, 0.0f);
    }

    private void b(float f10) {
        if (f() != f10) {
            float f11 = ((f10 - f()) + 360.0f) % 360.0f;
            if (f11 <= 180.0f) {
                d dVar = new d(h(), i(), h(), i());
                dVar.s(f());
                dVar.t(f11);
                this.f29395h.add(new b(dVar));
                o(f10);
            }
        }
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f29395h.add(gVar);
        o(f11);
    }

    private float f() {
        return this.f29392e;
    }

    private float g() {
        return this.f29393f;
    }

    private void o(float f10) {
        this.f29392e = f10;
    }

    private void p(float f10) {
        this.f29393f = f10;
    }

    private void q(float f10) {
        this.f29390c = f10;
    }

    private void r(float f10) {
        this.f29391d = f10;
    }

    private void s(float f10) {
        this.f29388a = f10;
    }

    private void t(float f10) {
        this.f29389b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f29394g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = (double) f16;
        q(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        r(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f29394g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f29394g.get(i10).a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    public g e(Matrix matrix) {
        b(g());
        return new a(new ArrayList(this.f29395h), matrix);
    }

    /* access modifiers changed from: package-private */
    public float h() {
        return this.f29390c;
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.f29391d;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.f29388a;
    }

    /* access modifiers changed from: package-private */
    public float k() {
        return this.f29389b;
    }

    public void l(float f10, float f11) {
        e eVar = new e();
        float unused = eVar.f29410b = f10;
        float unused2 = eVar.f29411c = f11;
        this.f29394g.add(eVar);
        c cVar = new c(eVar, h(), i());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        q(f10);
        r(f11);
    }

    public void m(float f10, float f11) {
        n(f10, f11, 270.0f, 0.0f);
    }

    public void n(float f10, float f11, float f12, float f13) {
        s(f10);
        t(f11);
        q(f10);
        r(f11);
        o(f12);
        p((f12 + f13) % 360.0f);
        this.f29394g.clear();
        this.f29395h.clear();
    }
}
