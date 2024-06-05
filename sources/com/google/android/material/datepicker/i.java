package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.a0;
import androidx.fragment.app.w;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n6.g;
import x5.e;
import x5.f;
import x5.h;
import x5.j;

/* compiled from: MaterialDatePicker */
public final class i<S> extends androidx.fragment.app.d {
    static final Object I0 = "CONFIRM_BUTTON_TAG";
    static final Object J0 = "CANCEL_BUTTON_TAG";
    static final Object K0 = "TOGGLE_BUTTON_TAG";
    private h<S> A0;
    private int B0;
    private CharSequence C0;
    private boolean D0;
    private TextView E0;
    /* access modifiers changed from: private */
    public CheckableImageButton F0;
    private g G0;
    /* access modifiers changed from: private */
    public Button H0;
    /* access modifiers changed from: private */

    /* renamed from: s0  reason: collision with root package name */
    public final LinkedHashSet<j<? super S>> f25664s0 = new LinkedHashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: t0  reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f25665t0 = new LinkedHashSet<>();

    /* renamed from: u0  reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f25666u0 = new LinkedHashSet<>();

    /* renamed from: v0  reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f25667v0 = new LinkedHashSet<>();

    /* renamed from: w0  reason: collision with root package name */
    private int f25668w0;
    /* access modifiers changed from: private */

    /* renamed from: x0  reason: collision with root package name */
    public d<S> f25669x0;

    /* renamed from: y0  reason: collision with root package name */
    private p<S> f25670y0;

    /* renamed from: z0  reason: collision with root package name */
    private a f25671z0;

    /* compiled from: MaterialDatePicker */
    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            Iterator it = i.this.f25664s0.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(i.this.g2());
            }
            i.this.I1();
        }
    }

    /* compiled from: MaterialDatePicker */
    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            Iterator it = i.this.f25665t0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            i.this.I1();
        }
    }

    /* compiled from: MaterialDatePicker */
    class c implements o<S> {
        c() {
        }

        public void a(S s10) {
            i.this.m2();
            if (i.this.f25669x0.T()) {
                i.this.H0.setEnabled(true);
            } else {
                i.this.H0.setEnabled(false);
            }
        }
    }

    /* compiled from: MaterialDatePicker */
    class d implements View.OnClickListener {
        d() {
        }

        public void onClick(View view) {
            i.this.F0.toggle();
            i iVar = i.this;
            iVar.n2(iVar.F0);
            i.this.k2();
        }
    }

    private static Drawable c2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, i.a.b(context, e.ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], i.a.b(context, e.ic_edit_black_24dp));
        return stateListDrawable;
    }

    private static int d2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(x5.d.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(x5.d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(x5.d.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(x5.d.mtrl_calendar_days_of_week_height);
        int i10 = m.f25686f;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(x5.d.mtrl_calendar_day_height) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(x5.d.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(x5.d.mtrl_calendar_bottom_padding);
    }

    private static int f2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(x5.d.mtrl_calendar_content_padding);
        int i10 = l.l().f25683f;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(x5.d.mtrl_calendar_day_width) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(x5.d.mtrl_calendar_month_horizontal_padding));
    }

    private int h2(Context context) {
        int i10 = this.f25668w0;
        if (i10 != 0) {
            return i10;
        }
        return this.f25669x0.S(context);
    }

    private void i2(Context context) {
        this.F0.setTag(K0);
        this.F0.setImageDrawable(c2(context));
        a0.n0(this.F0, (androidx.core.view.a) null);
        n2(this.F0);
        this.F0.setOnClickListener(new d());
    }

    static boolean j2(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(k6.b.c(context, x5.b.materialCalendarStyle, h.class.getCanonicalName()), new int[]{16843277});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    /* access modifiers changed from: private */
    public void k2() {
        this.A0 = h.W1(this.f25669x0, h2(m1()), this.f25671z0);
        this.f25670y0 = this.F0.isChecked() ? k.H1(this.f25669x0, this.f25671z0) : this.A0;
        m2();
        w l10 = o().l();
        l10.m(f.mtrl_calendar_frame, this.f25670y0);
        l10.h();
        this.f25670y0.F1(new c());
    }

    public static long l2() {
        return l.l().f25685h;
    }

    /* access modifiers changed from: private */
    public void m2() {
        String e22 = e2();
        this.E0.setContentDescription(String.format(O(x5.i.mtrl_picker_announce_current_selection), new Object[]{e22}));
        this.E0.setText(e22);
    }

    /* access modifiers changed from: private */
    public void n2(CheckableImageButton checkableImageButton) {
        String str;
        if (this.F0.isChecked()) {
            str = checkableImageButton.getContext().getString(x5.i.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(x5.i.mtrl_picker_toggle_to_text_input_mode);
        }
        this.F0.setContentDescription(str);
    }

    public final void I0(Bundle bundle) {
        super.I0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f25668w0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f25669x0);
        a.b bVar = new a.b(this.f25671z0);
        if (this.A0.S1() != null) {
            bVar.b(this.A0.S1().f25685h);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.B0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.C0);
    }

    public void J0() {
        super.J0();
        Window window = Q1().getWindow();
        if (this.D0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.G0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = I().getDimensionPixelOffset(x5.d.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.G0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new e6.a(Q1(), rect));
        }
        k2();
    }

    public void K0() {
        this.f25670y0.G1();
        super.K0();
    }

    public final Dialog M1(Bundle bundle) {
        Dialog dialog = new Dialog(m1(), h2(m1()));
        Context context = dialog.getContext();
        this.D0 = j2(context);
        int c10 = k6.b.c(context, x5.b.colorSurface, i.class.getCanonicalName());
        g gVar = new g(context, (AttributeSet) null, x5.b.materialCalendarStyle, j.Widget_MaterialComponents_MaterialCalendar);
        this.G0 = gVar;
        gVar.L(context);
        this.G0.T(ColorStateList.valueOf(c10));
        this.G0.S(a0.v(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public String e2() {
        return this.f25669x0.f(p());
    }

    public final S g2() {
        return this.f25669x0.W();
    }

    public final void m0(Bundle bundle) {
        super.m0(bundle);
        if (bundle == null) {
            bundle = n();
        }
        this.f25668w0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f25669x0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f25671z0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.B0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.C0 = bundle.getCharSequence("TITLE_TEXT_KEY");
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f25666u0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f25667v0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) Q();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final View q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.D0 ? h.mtrl_picker_fullscreen : h.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.D0) {
            inflate.findViewById(f.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(f2(context), -2));
        } else {
            View findViewById = inflate.findViewById(f.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(f.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(f2(context), -1));
            findViewById2.setMinimumHeight(d2(m1()));
        }
        TextView textView = (TextView) inflate.findViewById(f.mtrl_picker_header_selection_text);
        this.E0 = textView;
        a0.p0(textView, 1);
        this.F0 = (CheckableImageButton) inflate.findViewById(f.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(f.mtrl_picker_title_text);
        CharSequence charSequence = this.C0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.B0);
        }
        i2(context);
        this.H0 = (Button) inflate.findViewById(f.confirm_button);
        if (this.f25669x0.T()) {
            this.H0.setEnabled(true);
        } else {
            this.H0.setEnabled(false);
        }
        this.H0.setTag(I0);
        this.H0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(f.cancel_button);
        button.setTag(J0);
        button.setOnClickListener(new b());
        return inflate;
    }
}
