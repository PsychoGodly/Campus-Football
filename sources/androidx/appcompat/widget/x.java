package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import h.a;

/* compiled from: AppCompatSeekBar */
public class x extends SeekBar {

    /* renamed from: a  reason: collision with root package name */
    private final y f1846a;

    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.I);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1846a.h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1846a.i();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1846a.g(canvas);
    }

    public x(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        u0.a(this, getContext());
        y yVar = new y(this);
        this.f1846a = yVar;
        yVar.c(attributeSet, i10);
    }
}
