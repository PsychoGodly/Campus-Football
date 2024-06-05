package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.p;
import androidx.core.view.a0;
import androidx.core.view.y;

/* compiled from: AppCompatSpinner */
public class z extends Spinner implements y {

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f1858j = {16843505};

    /* renamed from: a  reason: collision with root package name */
    private final e f1859a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1860b;

    /* renamed from: c  reason: collision with root package name */
    private k0 f1861c;

    /* renamed from: d  reason: collision with root package name */
    private SpinnerAdapter f1862d;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1863f;

    /* renamed from: g  reason: collision with root package name */
    private j f1864g;

    /* renamed from: h  reason: collision with root package name */
    int f1865h;

    /* renamed from: i  reason: collision with root package name */
    final Rect f1866i;

    /* compiled from: AppCompatSpinner */
    class a extends k0 {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ h f1867k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, h hVar) {
            super(view);
            this.f1867k = hVar;
        }

        public p b() {
            return this.f1867k;
        }

        public boolean c() {
            if (z.this.getInternalPopup().b()) {
                return true;
            }
            z.this.b();
            return true;
        }
    }

    /* compiled from: AppCompatSpinner */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        public void onGlobalLayout() {
            if (!z.this.getInternalPopup().b()) {
                z.this.b();
            }
            ViewTreeObserver viewTreeObserver = z.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                c.a(viewTreeObserver, this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* compiled from: AppCompatSpinner */
    private static final class c {
        static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* compiled from: AppCompatSpinner */
    private static final class d {
        static int a(View view) {
            return view.getTextAlignment();
        }

        static int b(View view) {
            return view.getTextDirection();
        }

        static void c(View view, int i10) {
            view.setTextAlignment(i10);
        }

        static void d(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* compiled from: AppCompatSpinner */
    private static final class e {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!androidx.core.util.c.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* compiled from: AppCompatSpinner */
    class f implements j, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        androidx.appcompat.app.c f1870a;

        /* renamed from: b  reason: collision with root package name */
        private ListAdapter f1871b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f1872c;

        f() {
        }

        public void a(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public boolean b() {
            androidx.appcompat.app.c cVar = this.f1870a;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        public int c() {
            return 0;
        }

        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f1870a;
            if (cVar != null) {
                cVar.dismiss();
                this.f1870a = null;
            }
        }

        public void e(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public CharSequence f() {
            return this.f1872c;
        }

        public Drawable h() {
            return null;
        }

        public void j(CharSequence charSequence) {
            this.f1872c = charSequence;
        }

        public void k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public void l(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public void m(int i10, int i11) {
            if (this.f1871b != null) {
                c.a aVar = new c.a(z.this.getPopupContext());
                CharSequence charSequence = this.f1872c;
                if (charSequence != null) {
                    aVar.n(charSequence);
                }
                androidx.appcompat.app.c a10 = aVar.m(this.f1871b, z.this.getSelectedItemPosition(), this).a();
                this.f1870a = a10;
                ListView h10 = a10.h();
                if (Build.VERSION.SDK_INT >= 17) {
                    d.d(h10, i10);
                    d.c(h10, i11);
                }
                this.f1870a.show();
            }
        }

        public int n() {
            return 0;
        }

        public void o(ListAdapter listAdapter) {
            this.f1871b = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            z.this.setSelection(i10);
            if (z.this.getOnItemClickListener() != null) {
                z.this.performItemClick((View) null, i10, this.f1871b.getItemId(i10));
            }
            dismiss();
        }
    }

    /* compiled from: AppCompatSpinner */
    private static class g implements ListAdapter, SpinnerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private SpinnerAdapter f1874a;

        /* renamed from: b  reason: collision with root package name */
        private ListAdapter f1875b;

        public g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1874a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1875b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                e.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            } else if (spinnerAdapter instanceof v0) {
                v0 v0Var = (v0) spinnerAdapter;
                if (v0Var.getDropDownViewTheme() == null) {
                    v0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1875b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1874a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1874a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1874a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1874a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i10);
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1874a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1875b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1874a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1874a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* compiled from: AppCompatSpinner */
    class h extends m0 implements j {
        private CharSequence K;
        ListAdapter L;
        private final Rect M = new Rect();
        private int N;

        /* compiled from: AppCompatSpinner */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ z f1876a;

            a(z zVar) {
                this.f1876a = zVar;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                z.this.setSelection(i10);
                if (z.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    z.this.performItemClick(view, i10, hVar.L.getItemId(i10));
                }
                h.this.dismiss();
            }
        }

        /* compiled from: AppCompatSpinner */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.P(z.this)) {
                    h.this.dismiss();
                    return;
                }
                h.this.N();
                h.super.show();
            }
        }

        /* compiled from: AppCompatSpinner */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1879a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1879a = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = z.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1879a);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            y(z.this);
            E(true);
            J(0);
            G(new a(z.this));
        }

        /* access modifiers changed from: package-private */
        public void N() {
            int i10;
            int i11;
            Drawable h10 = h();
            int i12 = 0;
            if (h10 != null) {
                h10.getPadding(z.this.f1866i);
                if (k1.b(z.this)) {
                    i11 = z.this.f1866i.right;
                } else {
                    i11 = -z.this.f1866i.left;
                }
                i12 = i11;
            } else {
                Rect rect = z.this.f1866i;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = z.this.getPaddingLeft();
            int paddingRight = z.this.getPaddingRight();
            int width = z.this.getWidth();
            z zVar = z.this;
            int i13 = zVar.f1865h;
            if (i13 == -2) {
                int a10 = zVar.a((SpinnerAdapter) this.L, h());
                int i14 = z.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = z.this.f1866i;
                int i15 = (i14 - rect2.left) - rect2.right;
                if (a10 > i15) {
                    a10 = i15;
                }
                A(Math.max(a10, (width - paddingLeft) - paddingRight));
            } else if (i13 == -1) {
                A((width - paddingLeft) - paddingRight);
            } else {
                A(i13);
            }
            if (k1.b(z.this)) {
                i10 = i12 + (((width - paddingRight) - u()) - O());
            } else {
                i10 = i12 + paddingLeft + O();
            }
            e(i10);
        }

        public int O() {
            return this.N;
        }

        /* access modifiers changed from: package-private */
        public boolean P(View view) {
            return a0.Q(view) && view.getGlobalVisibleRect(this.M);
        }

        public CharSequence f() {
            return this.K;
        }

        public void j(CharSequence charSequence) {
            this.K = charSequence;
        }

        public void l(int i10) {
            this.N = i10;
        }

        public void m(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean b10 = b();
            N();
            D(2);
            super.show();
            ListView i12 = i();
            i12.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                d.d(i12, i10);
                d.c(i12, i11);
            }
            K(z.this.getSelectedItemPosition());
            if (!b10 && (viewTreeObserver = z.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                F(new c(bVar));
            }
        }

        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.L = listAdapter;
        }
    }

    /* compiled from: AppCompatSpinner */
    static class i extends View.BaseSavedState {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        boolean f1881a;

        /* compiled from: AppCompatSpinner */
        class a implements Parcelable.Creator<i> {
            a() {
            }

            /* renamed from: a */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            /* renamed from: b */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        i(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1881a ? (byte) 1 : 0);
        }

        i(Parcel parcel) {
            super(parcel);
            this.f1881a = parcel.readByte() != 0;
        }
    }

    /* compiled from: AppCompatSpinner */
    interface j {
        void a(Drawable drawable);

        boolean b();

        int c();

        void dismiss();

        void e(int i10);

        CharSequence f();

        Drawable h();

        void j(CharSequence charSequence);

        void k(int i10);

        void l(int i10);

        void m(int i10, int i11);

        int n();

        void o(ListAdapter listAdapter);
    }

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.J);
    }

    /* access modifiers changed from: package-private */
    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.f1866i);
        Rect rect = this.f1866i;
        return i11 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1864g.m(d.b(this), d.a(this));
        } else {
            this.f1864g.m(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1859a;
        if (eVar != null) {
            eVar.b();
        }
    }

    public int getDropDownHorizontalOffset() {
        j jVar = this.f1864g;
        if (jVar != null) {
            return jVar.c();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        j jVar = this.f1864g;
        if (jVar != null) {
            return jVar.n();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f1864g != null) {
            return this.f1865h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final j getInternalPopup() {
        return this.f1864g;
    }

    public Drawable getPopupBackground() {
        j jVar = this.f1864g;
        if (jVar != null) {
            return jVar.h();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f1860b;
    }

    public CharSequence getPrompt() {
        j jVar = this.f1864g;
        return jVar != null ? jVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1859a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1859a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f1864g;
        if (jVar != null && jVar.b()) {
            this.f1864g.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1864g != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (iVar.f1881a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        j jVar = this.f1864g;
        iVar.f1881a = jVar != null && jVar.b();
        return iVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        k0 k0Var = this.f1861c;
        if (k0Var == null || !k0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        j jVar = this.f1864g;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.b()) {
            return true;
        }
        b();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1859a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1859a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setDropDownHorizontalOffset(int i10) {
        j jVar = this.f1864g;
        if (jVar != null) {
            jVar.l(i10);
            this.f1864g.e(i10);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i10);
        }
    }

    public void setDropDownVerticalOffset(int i10) {
        j jVar = this.f1864g;
        if (jVar != null) {
            jVar.k(i10);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i10);
        }
    }

    public void setDropDownWidth(int i10) {
        if (this.f1864g != null) {
            this.f1865h = i10;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i10);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        j jVar = this.f1864g;
        if (jVar != null) {
            jVar.a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(i.a.b(getPopupContext(), i10));
    }

    public void setPrompt(CharSequence charSequence) {
        j jVar = this.f1864g;
        if (jVar != null) {
            jVar.j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1859a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1859a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public z(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1863f) {
            this.f1862d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1864g != null) {
            Context context = this.f1860b;
            if (context == null) {
                context = getContext();
            }
            this.f1864g.o(new g(spinnerAdapter, context.getTheme()));
        }
    }

    public z(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r11 != null) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1866i = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.u0.a(r6, r0)
            int[] r0 = h.j.f18422x2
            r1 = 0
            androidx.appcompat.widget.z0 r0 = androidx.appcompat.widget.z0.v(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1859a = r2
            if (r11 == 0) goto L_0x0029
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
            r6.f1860b = r2
            goto L_0x003b
        L_0x0029:
            int r11 = h.j.C2
            int r11 = r0.n(r11, r1)
            if (r11 == 0) goto L_0x0039
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r7, (int) r11)
            r6.f1860b = r2
            goto L_0x003b
        L_0x0039:
            r6.f1860b = r7
        L_0x003b:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x006b
            int[] r11 = f1858j     // Catch:{ Exception -> 0x0057, all -> 0x0055 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0057, all -> 0x0055 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0053 }
            if (r3 == 0) goto L_0x004f
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0053 }
        L_0x004f:
            r11.recycle()
            goto L_0x006b
        L_0x0053:
            r3 = move-exception
            goto L_0x0059
        L_0x0055:
            r7 = move-exception
            goto L_0x0065
        L_0x0057:
            r3 = move-exception
            r11 = r2
        L_0x0059:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x006b
            goto L_0x004f
        L_0x0063:
            r7 = move-exception
            r2 = r11
        L_0x0065:
            if (r2 == 0) goto L_0x006a
            r2.recycle()
        L_0x006a:
            throw r7
        L_0x006b:
            r11 = 1
            if (r10 == 0) goto L_0x00a8
            if (r10 == r11) goto L_0x0071
            goto L_0x00b8
        L_0x0071:
            androidx.appcompat.widget.z$h r10 = new androidx.appcompat.widget.z$h
            android.content.Context r3 = r6.f1860b
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1860b
            int[] r4 = h.j.f18422x2
            androidx.appcompat.widget.z0 r1 = androidx.appcompat.widget.z0.v(r3, r8, r4, r9, r1)
            int r3 = h.j.B2
            r4 = -2
            int r3 = r1.m(r3, r4)
            r6.f1865h = r3
            int r3 = h.j.f18432z2
            android.graphics.drawable.Drawable r3 = r1.g(r3)
            r10.a(r3)
            int r3 = h.j.A2
            java.lang.String r3 = r0.o(r3)
            r10.j(r3)
            r1.w()
            r6.f1864g = r10
            androidx.appcompat.widget.z$a r1 = new androidx.appcompat.widget.z$a
            r1.<init>(r6, r10)
            r6.f1861c = r1
            goto L_0x00b8
        L_0x00a8:
            androidx.appcompat.widget.z$f r10 = new androidx.appcompat.widget.z$f
            r10.<init>()
            r6.f1864g = r10
            int r1 = h.j.A2
            java.lang.String r1 = r0.o(r1)
            r10.j(r1)
        L_0x00b8:
            int r10 = h.j.f18427y2
            java.lang.CharSequence[] r10 = r0.q(r10)
            if (r10 == 0) goto L_0x00d0
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = h.g.f18286t
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00d0:
            r0.w()
            r6.f1863f = r11
            android.widget.SpinnerAdapter r7 = r6.f1862d
            if (r7 == 0) goto L_0x00de
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f1862d = r2
        L_0x00de:
            androidx.appcompat.widget.e r7 = r6.f1859a
            r7.e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
