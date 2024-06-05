package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* compiled from: TypefaceEmojiSpan */
public final class o extends i {

    /* renamed from: g  reason: collision with root package name */
    private static Paint f3414g;

    public o(g gVar) {
        super(gVar);
    }

    private static Paint c() {
        if (f3414g == null) {
            TextPaint textPaint = new TextPaint();
            f3414g = textPaint;
            textPaint.setColor(e.b().c());
            f3414g.setStyle(Paint.Style.FILL);
        }
        return f3414g;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        if (e.b().i()) {
            canvas.drawRect(f10, (float) i12, f10 + ((float) b()), (float) i14, c());
        }
        a().a(canvas, f10, (float) i13, paint);
    }
}
