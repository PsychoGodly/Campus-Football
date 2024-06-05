package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.t;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdmt extends FrameLayout {
    private final t zza;

    public zzdmt(Context context, View view, t tVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.zza = tVar;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.zza.m(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && (childAt instanceof zzcei)) {
                arrayList.add((zzcei) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((zzcei) arrayList.get(i11)).destroy();
        }
    }
}
