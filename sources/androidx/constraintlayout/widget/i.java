package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import v.e;

/* compiled from: Placeholder */
public class i extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f2373a;

    /* renamed from: b  reason: collision with root package name */
    private View f2374b;

    /* renamed from: c  reason: collision with root package name */
    private int f2375c;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f2374b != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f2374b.getLayoutParams();
            bVar2.f2200v0.g1(0);
            e.b y10 = bVar.f2200v0.y();
            e.b bVar3 = e.b.FIXED;
            if (y10 != bVar3) {
                bVar.f2200v0.h1(bVar2.f2200v0.U());
            }
            if (bVar.f2200v0.R() != bVar3) {
                bVar.f2200v0.I0(bVar2.f2200v0.v());
            }
            bVar2.f2200v0.g1(8);
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f2373a == -1 && !isInEditMode()) {
            setVisibility(this.f2375c);
        }
        View findViewById = constraintLayout.findViewById(this.f2373a);
        this.f2374b = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).f2176j0 = true;
            this.f2374b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2374b;
    }

    public int getEmptyVisibility() {
        return this.f2375c;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i10) {
        View findViewById;
        if (this.f2373a != i10) {
            View view = this.f2374b;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.b) this.f2374b.getLayoutParams()).f2176j0 = false;
                this.f2374b = null;
            }
            this.f2373a = i10;
            if (i10 != -1 && (findViewById = ((View) getParent()).findViewById(i10)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i10) {
        this.f2375c = i10;
    }
}
