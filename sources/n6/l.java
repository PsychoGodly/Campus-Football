package n6;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: ShapeAppearancePathProvider */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final m[] f29376a = new m[4];

    /* renamed from: b  reason: collision with root package name */
    private final Matrix[] f29377b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix[] f29378c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    private final PointF f29379d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    private final m f29380e = new m();

    /* renamed from: f  reason: collision with root package name */
    private final float[] f29381f = new float[2];

    /* renamed from: g  reason: collision with root package name */
    private final float[] f29382g = new float[2];

    /* compiled from: ShapeAppearancePathProvider */
    public interface a {
        void a(m mVar, Matrix matrix, int i10);

        void b(m mVar, Matrix matrix, int i10);
    }

    /* compiled from: ShapeAppearancePathProvider */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final k f29383a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f29384b;

        /* renamed from: c  reason: collision with root package name */
        public final RectF f29385c;

        /* renamed from: d  reason: collision with root package name */
        public final a f29386d;

        /* renamed from: e  reason: collision with root package name */
        public final float f29387e;

        b(k kVar, float f10, RectF rectF, a aVar, Path path) {
            this.f29386d = aVar;
            this.f29383a = kVar;
            this.f29387e = f10;
            this.f29385c = rectF;
            this.f29384b = path;
        }
    }

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f29376a[i10] = new m();
            this.f29377b[i10] = new Matrix();
            this.f29378c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return (float) ((i10 + 1) * 90);
    }

    private void b(b bVar, int i10) {
        this.f29381f[0] = this.f29376a[i10].j();
        this.f29381f[1] = this.f29376a[i10].k();
        this.f29377b[i10].mapPoints(this.f29381f);
        if (i10 == 0) {
            Path path = bVar.f29384b;
            float[] fArr = this.f29381f;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = bVar.f29384b;
            float[] fArr2 = this.f29381f;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f29376a[i10].d(this.f29377b[i10], bVar.f29384b);
        a aVar = bVar.f29386d;
        if (aVar != null) {
            aVar.a(this.f29376a[i10], this.f29377b[i10], i10);
        }
    }

    private void c(b bVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f29381f[0] = this.f29376a[i10].h();
        this.f29381f[1] = this.f29376a[i10].i();
        this.f29377b[i10].mapPoints(this.f29381f);
        this.f29382g[0] = this.f29376a[i11].j();
        this.f29382g[1] = this.f29376a[i11].k();
        this.f29377b[i11].mapPoints(this.f29382g);
        float[] fArr = this.f29381f;
        float f10 = fArr[0];
        float[] fArr2 = this.f29382g;
        float max = Math.max(((float) Math.hypot((double) (f10 - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i12 = i(bVar.f29385c, i10);
        this.f29380e.m(0.0f, 0.0f);
        j(i10, bVar.f29383a).a(max, i12, bVar.f29387e, this.f29380e);
        this.f29380e.d(this.f29378c[i10], bVar.f29384b);
        a aVar = bVar.f29386d;
        if (aVar != null) {
            aVar.b(this.f29380e, this.f29378c[i10], i10);
        }
    }

    private void f(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private c g(int i10, k kVar) {
        if (i10 == 1) {
            return kVar.l();
        }
        if (i10 == 2) {
            return kVar.j();
        }
        if (i10 != 3) {
            return kVar.t();
        }
        return kVar.r();
    }

    private d h(int i10, k kVar) {
        if (i10 == 1) {
            return kVar.k();
        }
        if (i10 == 2) {
            return kVar.i();
        }
        if (i10 != 3) {
            return kVar.s();
        }
        return kVar.q();
    }

    private float i(RectF rectF, int i10) {
        float[] fArr = this.f29381f;
        m[] mVarArr = this.f29376a;
        fArr[0] = mVarArr[i10].f29390c;
        fArr[1] = mVarArr[i10].f29391d;
        this.f29377b[i10].mapPoints(fArr);
        if (i10 == 1 || i10 == 3) {
            return Math.abs(rectF.centerX() - this.f29381f[0]);
        }
        return Math.abs(rectF.centerY() - this.f29381f[1]);
    }

    private f j(int i10, k kVar) {
        if (i10 == 1) {
            return kVar.h();
        }
        if (i10 == 2) {
            return kVar.n();
        }
        if (i10 != 3) {
            return kVar.o();
        }
        return kVar.p();
    }

    private void k(b bVar, int i10) {
        h(i10, bVar.f29383a).b(this.f29376a[i10], 90.0f, bVar.f29387e, bVar.f29385c, g(i10, bVar.f29383a));
        float a10 = a(i10);
        this.f29377b[i10].reset();
        f(i10, bVar.f29385c, this.f29379d);
        Matrix matrix = this.f29377b[i10];
        PointF pointF = this.f29379d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f29377b[i10].preRotate(a10);
    }

    private void l(int i10) {
        this.f29381f[0] = this.f29376a[i10].h();
        this.f29381f[1] = this.f29376a[i10].i();
        this.f29377b[i10].mapPoints(this.f29381f);
        float a10 = a(i10);
        this.f29378c[i10].reset();
        Matrix matrix = this.f29378c[i10];
        float[] fArr = this.f29381f;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f29378c[i10].preRotate(a10);
    }

    public void d(k kVar, float f10, RectF rectF, Path path) {
        e(kVar, f10, rectF, (a) null, path);
    }

    public void e(k kVar, float f10, RectF rectF, a aVar, Path path) {
        path.rewind();
        b bVar = new b(kVar, f10, rectF, aVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            k(bVar, i10);
            l(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(bVar, i11);
            c(bVar, i11);
        }
        path.close();
    }
}
