package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import x5.a;
import y5.h;
import y5.j;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    private Map<View, Integer> f26035i;

    public FabTransformationSheetBehavior() {
    }

    private void g0(View view, boolean z10) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z10) {
                this.f26035i = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z11 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z11) {
                    if (!z10) {
                        Map<View, Integer> map = this.f26035i;
                        if (map != null && map.containsKey(childAt)) {
                            a0.x0(childAt, this.f26035i.get(childAt).intValue());
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f26035i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        a0.x0(childAt, 4);
                    }
                }
            }
            if (!z10) {
                this.f26035i = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean H(View view, View view2, boolean z10, boolean z11) {
        g0(view2, z10);
        return super.H(view, view2, z10, z11);
    }

    /* access modifiers changed from: protected */
    public FabTransformationBehavior.e e0(Context context, boolean z10) {
        int i10;
        if (z10) {
            i10 = a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i10 = a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f26028a = h.c(context, i10);
        eVar.f26029b = new j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
