package r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import r.h;

/* compiled from: CardViewBaseImpl */
class d implements f {

    /* renamed from: a  reason: collision with root package name */
    final RectF f21848a = new RectF();

    /* compiled from: CardViewBaseImpl */
    class a implements h.a {
        a() {
        }

        public void a(Canvas canvas, RectF rectF, float f10, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f11 = 2.0f * f10;
            float width = (rectF.width() - f11) - 1.0f;
            float height = (rectF.height() - f11) - 1.0f;
            if (f10 >= 1.0f) {
                float f12 = f10 + 0.5f;
                float f13 = -f12;
                d.this.f21848a.set(f13, f13, f12, f12);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f12, rectF2.top + f12);
                Paint paint2 = paint;
                canvas.drawArc(d.this.f21848a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(d.this.f21848a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(d.this.f21848a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(d.this.f21848a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f14 = rectF2.top;
                canvas.drawRect((rectF2.left + f12) - 1.0f, f14, (rectF2.right - f12) + 1.0f, f14 + f12, paint2);
                float f15 = rectF2.bottom;
                Canvas canvas3 = canvas;
                canvas3.drawRect((rectF2.left + f12) - 1.0f, f15 - f12, (rectF2.right - f12) + 1.0f, f15, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f10, rectF2.right, rectF2.bottom - f10, paint);
        }
    }

    d() {
    }

    private h o(Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        return new h(context.getResources(), colorStateList, f10, f11, f12);
    }

    private h p(e eVar) {
        return (h) eVar.f();
    }

    public void a(e eVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        h o10 = o(context, colorStateList, f10, f11, f12);
        o10.m(eVar.d());
        eVar.c(o10);
        q(eVar);
    }

    public float b(e eVar) {
        return p(eVar).j();
    }

    public ColorStateList c(e eVar) {
        return p(eVar).f();
    }

    public float d(e eVar) {
        return p(eVar).l();
    }

    public void e(e eVar, float f10) {
        p(eVar).r(f10);
    }

    public void f(e eVar) {
        p(eVar).m(eVar.d());
        q(eVar);
    }

    public float g(e eVar) {
        return p(eVar).i();
    }

    public float h(e eVar) {
        return p(eVar).k();
    }

    public void i(e eVar) {
    }

    public void j(e eVar, float f10) {
        p(eVar).p(f10);
        q(eVar);
    }

    public float k(e eVar) {
        return p(eVar).g();
    }

    public void l() {
        h.f21862r = new a();
    }

    public void m(e eVar, float f10) {
        p(eVar).q(f10);
        q(eVar);
    }

    public void n(e eVar, ColorStateList colorStateList) {
        p(eVar).o(colorStateList);
    }

    public void q(e eVar) {
        Rect rect = new Rect();
        p(eVar).h(rect);
        eVar.a((int) Math.ceil((double) h(eVar)), (int) Math.ceil((double) b(eVar)));
        eVar.b(rect.left, rect.top, rect.right, rect.bottom);
    }
}
