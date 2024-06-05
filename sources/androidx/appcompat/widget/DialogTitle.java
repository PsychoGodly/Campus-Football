package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import h.j;

public class DialogTitle extends c0 {
    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int lineCount;
        super.onMeasure(i10, i11);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            setSingleLine(false);
            setMaxLines(2);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, j.E2, 16842817, 16973892);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.F2, 0);
            if (dimensionPixelSize != 0) {
                setTextSize(0, (float) dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            super.onMeasure(i10, i11);
        }
    }
}
