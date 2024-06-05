package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Guideline */
public class h extends View {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2372a = true;

    public h(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f2372a = z10;
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (!this.f2372a || bVar.f2157a != i10) {
            bVar.f2157a = i10;
            setLayoutParams(bVar);
        }
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (!this.f2372a || bVar.f2159b != i10) {
            bVar.f2159b = i10;
            setLayoutParams(bVar);
        }
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (!this.f2372a || bVar.f2161c != f10) {
            bVar.f2161c = f10;
            setLayoutParams(bVar);
        }
    }

    public void setVisibility(int i10) {
    }
}
