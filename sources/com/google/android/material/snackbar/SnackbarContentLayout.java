package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.a0;
import x5.f;
import x5.k;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f25859a;

    /* renamed from: b  reason: collision with root package name */
    private Button f25860b;

    /* renamed from: c  reason: collision with root package name */
    private int f25861c;

    /* renamed from: d  reason: collision with root package name */
    private int f25862d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.L2);
        this.f25861c = obtainStyledAttributes.getDimensionPixelSize(k.M2, -1);
        this.f25862d = obtainStyledAttributes.getDimensionPixelSize(k.R2, -1);
        obtainStyledAttributes.recycle();
    }

    private static void a(View view, int i10, int i11) {
        if (a0.T(view)) {
            a0.A0(view, a0.G(view), i10, a0.F(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean b(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f25859a.getPaddingTop() == i11 && this.f25859a.getPaddingBottom() == i12) {
            return z10;
        }
        a(this.f25859a, i11, i12);
        return true;
    }

    public Button getActionView() {
        return this.f25860b;
    }

    public TextView getMessageView() {
        return this.f25859a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f25859a = (TextView) findViewById(f.snackbar_text);
        this.f25860b = (Button) findViewById(f.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (b(1, r0, r0 - r1) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (b(0, r0, r0) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f25861c
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f25861c
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = x5.d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = x5.d.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f25859a
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f25862d
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f25860b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f25862d
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.b(r4, r0, r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0060
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.b(r3, r0, r0)
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r3 = 1
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            super.onMeasure(r8, r9)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
