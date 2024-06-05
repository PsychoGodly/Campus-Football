package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* compiled from: ActionBarBackgroundDrawable */
class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    final ActionBarContainer f1493a;

    /* compiled from: ActionBarBackgroundDrawable */
    private static class a {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public b(ActionBarContainer actionBarContainer) {
        this.f1493a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1493a;
        if (actionBarContainer.f1307i) {
            Drawable drawable = actionBarContainer.f1306h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1304f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1493a;
        Drawable drawable3 = actionBarContainer2.f1305g;
        if (drawable3 != null && actionBarContainer2.f1308j) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f1493a;
        if (!actionBarContainer.f1307i) {
            Drawable drawable = actionBarContainer.f1304f;
            if (drawable != null) {
                a.a(drawable, outline);
            }
        } else if (actionBarContainer.f1306h != null) {
            a.a(actionBarContainer.f1304f, outline);
        }
    }

    public void setAlpha(int i10) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
