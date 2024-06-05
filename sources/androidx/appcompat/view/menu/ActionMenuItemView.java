package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.e1;
import androidx.appcompat.widget.k0;
import h.j;

public class ActionMenuItemView extends c0 implements n.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: i  reason: collision with root package name */
    i f1077i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f1078j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f1079k;

    /* renamed from: l  reason: collision with root package name */
    g.b f1080l;

    /* renamed from: m  reason: collision with root package name */
    private k0 f1081m;

    /* renamed from: n  reason: collision with root package name */
    b f1082n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1083o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1084p;

    /* renamed from: q  reason: collision with root package name */
    private int f1085q;

    /* renamed from: r  reason: collision with root package name */
    private int f1086r;

    /* renamed from: s  reason: collision with root package name */
    private int f1087s;

    private class a extends k0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public p b() {
            b bVar = ActionMenuItemView.this.f1082n;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public boolean c() {
            p b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f1080l;
            if (bVar == null || !bVar.a(actionMenuItemView.f1077i) || (b10 = b()) == null || !b10.b()) {
                return false;
            }
            return true;
        }
    }

    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean s() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void t() {
        CharSequence charSequence;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1078j);
        if (this.f1079k != null && (!this.f1077i.B() || (!this.f1083o && !this.f1084p))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence2 = null;
        setText(z12 ? this.f1078j : null);
        CharSequence contentDescription = this.f1077i.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z12) {
                charSequence = null;
            } else {
                charSequence = this.f1077i.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1077i.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z12) {
                charSequence2 = this.f1077i.getTitle();
            }
            e1.a(this, charSequence2);
            return;
        }
        e1.a(this, tooltipText);
    }

    public boolean a() {
        return r();
    }

    public boolean b() {
        return r() && this.f1077i.getIcon() == null;
    }

    public boolean d() {
        return true;
    }

    public void e(i iVar, int i10) {
        this.f1077i = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f1081m == null) {
            this.f1081m = new a();
        }
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public i getItemData() {
        return this.f1077i;
    }

    public void onClick(View view) {
        g.b bVar = this.f1080l;
        if (bVar != null) {
            bVar.a(this.f1077i);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1083o = s();
        t();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean r10 = r();
        if (r10 && (i13 = this.f1086r) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(size, this.f1085q);
        } else {
            i12 = this.f1085q;
        }
        if (mode != 1073741824 && this.f1085q > 0 && measuredWidth < i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
        if (!r10 && this.f1079k != null) {
            super.setPadding((getMeasuredWidth() - this.f1079k.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        k0 k0Var;
        if (!this.f1077i.hasSubMenu() || (k0Var = this.f1081m) == null || !k0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean r() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f1084p != z10) {
            this.f1084p = z10;
            i iVar = this.f1077i;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1079k = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f1087s;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i10) / ((float) intrinsicWidth)));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i10) / ((float) intrinsicHeight)));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        t();
    }

    public void setItemInvoker(g.b bVar) {
        this.f1080l = bVar;
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f1086r = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f1082n = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1078j = charSequence;
        t();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f1083o = s();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f18409v, i10, 0);
        this.f1085q = obtainStyledAttributes.getDimensionPixelSize(j.f18414w, 0);
        obtainStyledAttributes.recycle();
        this.f1087s = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1086r = -1;
        setSaveEnabled(false);
    }
}
