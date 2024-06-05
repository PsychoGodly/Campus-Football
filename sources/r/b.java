package r;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import r.h;

/* compiled from: CardViewApi17Impl */
class b extends d {

    /* compiled from: CardViewApi17Impl */
    class a implements h.a {
        a() {
        }

        public void a(Canvas canvas, RectF rectF, float f10, Paint paint) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    b() {
    }

    public void l() {
        h.f21862r = new a();
    }
}
