package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.a0;
import com.google.android.gms.common.api.a;
import h.j;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AppCompatTextViewAutoSizeHelper */
class d0 {

    /* renamed from: l  reason: collision with root package name */
    private static final RectF f1554l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f1555m = new ConcurrentHashMap<>();

    /* renamed from: n  reason: collision with root package name */
    private static ConcurrentHashMap<String, Field> f1556n = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private int f1557a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1558b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f1559c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f1560d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f1561e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f1562f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f1563g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f1564h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f1565i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f1566j;

    /* renamed from: k  reason: collision with root package name */
    private final f f1567k;

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static final class b {
        static boolean a(View view) {
            return view.isInLayout();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static final class c {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = a.e.API_PRIORITY_OTHER;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class d extends f {
        d() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) d0.p(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class e extends d {
        e() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class f {
        f() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        /* access modifiers changed from: package-private */
        public boolean b(TextView textView) {
            return ((Boolean) d0.p(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    d0(TextView textView) {
        this.f1565i = textView;
        this.f1566j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.f1567k = new e();
        } else if (i10 >= 23) {
            this.f1567k = new d();
        } else {
            this.f1567k = new f();
        }
    }

    private boolean A(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1565i.getText();
        TransformationMethod transformationMethod = this.f1565i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1565i)) == null)) {
            text = transformation;
        }
        int b10 = Build.VERSION.SDK_INT >= 16 ? a.b(this.f1565i) : -1;
        o(i10);
        StaticLayout e10 = e(text, (Layout.Alignment) p(this.f1565i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b10);
        return (b10 == -1 || (e10.getLineCount() <= b10 && e10.getLineEnd(e10.getLineCount() - 1) == text.length())) && ((float) e10.getHeight()) <= rectF.bottom;
    }

    private boolean B() {
        return !(this.f1565i instanceof k);
    }

    private void C(float f10, float f11, float f12) throws IllegalArgumentException {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 > 0.0f) {
            this.f1557a = 1;
            this.f1560d = f10;
            this.f1561e = f11;
            this.f1559c = f12;
            this.f1563g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
    }

    private static <T> T a(Object obj, String str, T t10) {
        try {
            Field m10 = m(str);
            if (m10 == null) {
                return t10;
            }
            return m10.get(obj);
        } catch (IllegalAccessException e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e10);
            return t10;
        }
    }

    private int[] c(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    private void d() {
        this.f1557a = 0;
        this.f1560d = -1.0f;
        this.f1561e = -1.0f;
        this.f1559c = -1.0f;
        this.f1562f = new int[0];
        this.f1558b = false;
    }

    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i10) {
        return new StaticLayout(charSequence, this.f1564h, i10, alignment, ((Float) a(this.f1565i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.f1565i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.f1565i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    private int g(RectF rectF) {
        int length = this.f1562f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                if (A(this.f1562f[i13], rectF)) {
                    int i14 = i13 + 1;
                    i12 = i11;
                    i11 = i14;
                } else {
                    i12 = i13 - 1;
                    i10 = i12;
                }
            }
            return this.f1562f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private static Field m(String str) {
        try {
            Field field = f1556n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1556n.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e10);
            return null;
        }
    }

    private static Method n(String str) {
        try {
            Method method = f1555m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1555m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    static <T> T p(Object obj, String str, T t10) {
        try {
            return n(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    private void v(float f10) {
        if (f10 != this.f1565i.getPaint().getTextSize()) {
            this.f1565i.getPaint().setTextSize(f10);
            boolean a10 = Build.VERSION.SDK_INT >= 18 ? b.a(this.f1565i) : false;
            if (this.f1565i.getLayout() != null) {
                this.f1558b = false;
                try {
                    Method n10 = n("nullLayouts");
                    if (n10 != null) {
                        n10.invoke(this.f1565i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!a10) {
                    this.f1565i.requestLayout();
                } else {
                    this.f1565i.forceLayout();
                }
                this.f1565i.invalidate();
            }
        }
    }

    private boolean x() {
        if (!B() || this.f1557a != 1) {
            this.f1558b = false;
        } else {
            if (!this.f1563g || this.f1562f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1561e - this.f1560d) / this.f1559c))) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f1560d + (((float) i10) * this.f1559c));
                }
                this.f1562f = c(iArr);
            }
            this.f1558b = true;
        }
        return this.f1558b;
    }

    private void y(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f1562f = c(iArr);
            z();
        }
    }

    private boolean z() {
        int[] iArr = this.f1562f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f1563g = z10;
        if (z10) {
            this.f1557a = 1;
            this.f1560d = (float) iArr[0];
            this.f1561e = (float) iArr[length - 1];
            this.f1559c = -1.0f;
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int i10;
        if (q()) {
            if (this.f1558b) {
                if (this.f1565i.getMeasuredHeight() > 0 && this.f1565i.getMeasuredWidth() > 0) {
                    if (this.f1567k.b(this.f1565i)) {
                        i10 = 1048576;
                    } else {
                        i10 = (this.f1565i.getMeasuredWidth() - this.f1565i.getTotalPaddingLeft()) - this.f1565i.getTotalPaddingRight();
                    }
                    int height = (this.f1565i.getHeight() - this.f1565i.getCompoundPaddingBottom()) - this.f1565i.getCompoundPaddingTop();
                    if (i10 > 0 && height > 0) {
                        RectF rectF = f1554l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) i10;
                            rectF.bottom = (float) height;
                            float g10 = (float) g(rectF);
                            if (g10 != this.f1565i.getTextSize()) {
                                w(0, g10);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1558b = true;
        }
    }

    /* access modifiers changed from: package-private */
    public StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23) {
            return c.a(charSequence, alignment, i10, i11, this.f1565i, this.f1564h, this.f1567k);
        } else if (i12 >= 16) {
            return a.a(charSequence, alignment, i10, this.f1565i, this.f1564h);
        } else {
            return f(charSequence, alignment, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return Math.round(this.f1561e);
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return Math.round(this.f1560d);
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return Math.round(this.f1559c);
    }

    /* access modifiers changed from: package-private */
    public int[] k() {
        return this.f1562f;
    }

    /* access modifiers changed from: package-private */
    public int l() {
        return this.f1557a;
    }

    /* access modifiers changed from: package-private */
    public void o(int i10) {
        TextPaint textPaint = this.f1564h;
        if (textPaint == null) {
            this.f1564h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1564h.set(this.f1565i.getPaint());
        this.f1564h.setTextSize((float) i10);
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return B() && this.f1557a != 0;
    }

    /* access modifiers changed from: package-private */
    public void r(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f1566j;
        int[] iArr = j.f18335g0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f1565i;
        a0.l0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int i11 = j.f18360l0;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f1557a = obtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = j.f18355k0;
        float dimension = obtainStyledAttributes.hasValue(i12) ? obtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = j.f18345i0;
        float dimension2 = obtainStyledAttributes.hasValue(i13) ? obtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = j.f18340h0;
        float dimension3 = obtainStyledAttributes.hasValue(i14) ? obtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = j.f18350j0;
        if (obtainStyledAttributes.hasValue(i15) && (resourceId = obtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            y(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!B()) {
            this.f1557a = 0;
        } else if (this.f1557a == 1) {
            if (!this.f1563g) {
                DisplayMetrics displayMetrics = this.f1566j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                C(dimension2, dimension3, dimension);
            }
            x();
        }
    }

    /* access modifiers changed from: package-private */
    public void s(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (B()) {
            DisplayMetrics displayMetrics = this.f1566j.getResources().getDisplayMetrics();
            C(TypedValue.applyDimension(i13, (float) i10, displayMetrics), TypedValue.applyDimension(i13, (float) i11, displayMetrics), TypedValue.applyDimension(i13, (float) i12, displayMetrics));
            if (x()) {
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int[] iArr, int i10) throws IllegalArgumentException {
        if (B()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1566j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, (float) iArr[i11], displayMetrics));
                    }
                }
                this.f1562f = c(iArr2);
                if (!z()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1563g = false;
            }
            if (x()) {
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void u(int i10) {
        if (!B()) {
            return;
        }
        if (i10 == 0) {
            d();
        } else if (i10 == 1) {
            DisplayMetrics displayMetrics = this.f1566j.getResources().getDisplayMetrics();
            C(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (x()) {
                b();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void w(int i10, float f10) {
        Resources resources;
        Context context = this.f1566j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        v(TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics()));
    }
}
