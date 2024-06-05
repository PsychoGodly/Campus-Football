package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.z0;
import androidx.core.view.a0;
import h.a;
import h.f;
import h.g;
import h.j;

public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a  reason: collision with root package name */
    private i f1092a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f1093b;

    /* renamed from: c  reason: collision with root package name */
    private RadioButton f1094c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f1095d;

    /* renamed from: f  reason: collision with root package name */
    private CheckBox f1096f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f1097g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f1098h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f1099i;

    /* renamed from: j  reason: collision with root package name */
    private LinearLayout f1100j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f1101k;

    /* renamed from: l  reason: collision with root package name */
    private int f1102l;

    /* renamed from: m  reason: collision with root package name */
    private Context f1103m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1104n;

    /* renamed from: o  reason: collision with root package name */
    private Drawable f1105o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1106p;

    /* renamed from: q  reason: collision with root package name */
    private LayoutInflater f1107q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1108r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.D);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f1100j;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.f18274h, this, false);
        this.f1096f = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(g.f18275i, this, false);
        this.f1093b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.f18277k, this, false);
        this.f1094c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f1107q == null) {
            this.f1107q = LayoutInflater.from(getContext());
        }
        return this.f1107q;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f1098h;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1099i;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1099i.getLayoutParams();
            rect.top += this.f1099i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public boolean d() {
        return false;
    }

    public void e(i iVar, int i10) {
        this.f1092a = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    public i getItemData() {
        return this.f1092a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (!z10 || !this.f1092a.A()) ? 8 : 0;
        if (i10 == 0) {
            this.f1097g.setText(this.f1092a.h());
        }
        if (this.f1097g.getVisibility() != i10) {
            this.f1097g.setVisibility(i10);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        a0.r0(this, this.f1101k);
        TextView textView = (TextView) findViewById(f.M);
        this.f1095d = textView;
        int i10 = this.f1102l;
        if (i10 != -1) {
            textView.setTextAppearance(this.f1103m, i10);
        }
        this.f1097g = (TextView) findViewById(f.F);
        ImageView imageView = (ImageView) findViewById(f.I);
        this.f1098h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1105o);
        }
        this.f1099i = (ImageView) findViewById(f.f18258r);
        this.f1100j = (LinearLayout) findViewById(f.f18252l);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (this.f1093b != null && this.f1104n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1093b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z10 || this.f1094c != null || this.f1096f != null) {
            if (this.f1092a.m()) {
                if (this.f1094c == null) {
                    g();
                }
                compoundButton2 = this.f1094c;
                compoundButton = this.f1096f;
            } else {
                if (this.f1096f == null) {
                    c();
                }
                compoundButton2 = this.f1096f;
                compoundButton = this.f1094c;
            }
            if (z10) {
                compoundButton2.setChecked(this.f1092a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f1096f;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f1094c;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f1092a.m()) {
            if (this.f1094c == null) {
                g();
            }
            compoundButton = this.f1094c;
        } else {
            if (this.f1096f == null) {
                c();
            }
            compoundButton = this.f1096f;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f1108r = z10;
        this.f1104n = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f1099i;
        if (imageView != null) {
            imageView.setVisibility((this.f1106p || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f1092a.z() || this.f1108r;
        if (z10 || this.f1104n) {
            ImageView imageView = this.f1093b;
            if (imageView != null || drawable != null || this.f1104n) {
                if (imageView == null) {
                    f();
                }
                if (drawable != null || this.f1104n) {
                    ImageView imageView2 = this.f1093b;
                    if (!z10) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f1093b.getVisibility() != 0) {
                        this.f1093b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f1093b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1095d.setText(charSequence);
            if (this.f1095d.getVisibility() != 0) {
                this.f1095d.setVisibility(0);
            }
        } else if (this.f1095d.getVisibility() != 8) {
            this.f1095d.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        z0 v10 = z0.v(getContext(), attributeSet, j.T1, i10, 0);
        this.f1101k = v10.g(j.V1);
        this.f1102l = v10.n(j.U1, -1);
        this.f1104n = v10.a(j.W1, false);
        this.f1103m = context;
        this.f1105o = v10.g(j.X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, a.A, 0);
        this.f1106p = obtainStyledAttributes.hasValue(0);
        v10.w();
        obtainStyledAttributes.recycle();
    }
}
