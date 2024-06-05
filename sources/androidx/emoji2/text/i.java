package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.util.h;

/* compiled from: EmojiSpan */
public abstract class i extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    private final Paint.FontMetricsInt f3384a = new Paint.FontMetricsInt();

    /* renamed from: b  reason: collision with root package name */
    private final g f3385b;

    /* renamed from: c  reason: collision with root package name */
    private short f3386c = -1;

    /* renamed from: d  reason: collision with root package name */
    private short f3387d = -1;

    /* renamed from: f  reason: collision with root package name */
    private float f3388f = 1.0f;

    i(g gVar) {
        h.g(gVar, "metadata cannot be null");
        this.f3385b = gVar;
    }

    public final g a() {
        return this.f3385b;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.f3386c;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f3384a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f3384a;
        this.f3388f = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f3385b.e());
        this.f3387d = (short) ((int) (((float) this.f3385b.e()) * this.f3388f));
        short i12 = (short) ((int) (((float) this.f3385b.i()) * this.f3388f));
        this.f3386c = i12;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f3384a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i12;
    }
}
