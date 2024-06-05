package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.z0;

public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f1089c = {16842964, 16843049};

    /* renamed from: a  reason: collision with root package name */
    private g f1090a;

    /* renamed from: b  reason: collision with root package name */
    private int f1091b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public boolean a(i iVar) {
        return this.f1090a.L(iVar, 0);
    }

    public void b(g gVar) {
        this.f1090a = gVar;
    }

    public int getWindowAnimations() {
        return this.f1091b;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        a((i) getAdapter().getItem(i10));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        z0 v10 = z0.v(context, attributeSet, f1089c, i10, 0);
        if (v10.s(0)) {
            setBackgroundDrawable(v10.g(0));
        }
        if (v10.s(1)) {
            setDivider(v10.g(1));
        }
        v10.w();
    }
}
