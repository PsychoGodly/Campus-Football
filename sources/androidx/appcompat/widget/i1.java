package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.ads.AdError;
import h.d;
import h.f;
import h.g;
import h.i;

/* compiled from: TooltipPopup */
class i1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1656a;

    /* renamed from: b  reason: collision with root package name */
    private final View f1657b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f1658c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f1659d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f1660e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f1661f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    private final int[] f1662g = new int[2];

    i1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1659d = layoutParams;
        this.f1656a = context;
        View inflate = LayoutInflater.from(context).inflate(g.f18285s, (ViewGroup) null);
        this.f1657b = inflate;
        this.f1658c = (TextView) inflate.findViewById(f.f18259s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.f18299a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int i12;
        int i13;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1656a.getResources().getDimensionPixelOffset(d.f18212m);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1656a.getResources().getDimensionPixelOffset(d.f18211l);
            i13 = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            i13 = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1656a.getResources().getDimensionPixelOffset(z10 ? d.f18214o : d.f18213n);
        View b10 = b(view);
        if (b10 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b10.getWindowVisibleDisplayFrame(this.f1660e);
        Rect rect = this.f1660e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1656a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1660e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b10.getLocationOnScreen(this.f1662g);
        view.getLocationOnScreen(this.f1661f);
        int[] iArr = this.f1661f;
        int i14 = iArr[0];
        int[] iArr2 = this.f1662g;
        iArr[0] = i14 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i10) - (b10.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1657b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1657b.getMeasuredHeight();
        int[] iArr3 = this.f1661f;
        int i15 = ((iArr3[1] + i12) - dimensionPixelOffset3) - measuredHeight;
        int i16 = iArr3[1] + i13 + dimensionPixelOffset3;
        if (z10) {
            if (i15 >= 0) {
                layoutParams.y = i15;
            } else {
                layoutParams.y = i16;
            }
        } else if (measuredHeight + i16 <= this.f1660e.height()) {
            layoutParams.y = i16;
        } else {
            layoutParams.y = i15;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (d()) {
            ((WindowManager) this.f1656a.getSystemService("window")).removeView(this.f1657b);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f1657b.getParent() != null;
    }

    /* access modifiers changed from: package-private */
    public void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1658c.setText(charSequence);
        a(view, i10, i11, z10, this.f1659d);
        ((WindowManager) this.f1656a.getSystemService("window")).addView(this.f1657b, this.f1659d);
    }
}
