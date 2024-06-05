package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityNodeInfoCompat */
public class c {

    /* renamed from: d  reason: collision with root package name */
    private static int f3118d;

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityNodeInfo f3119a;

    /* renamed from: b  reason: collision with root package name */
    public int f3120b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f3121c = -1;

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;

        /* renamed from: e  reason: collision with root package name */
        public static final a f3122e = new a(1, (CharSequence) null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f3123f = new a(2, (CharSequence) null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f3124g = new a(4, (CharSequence) null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f3125h = new a(8, (CharSequence) null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f3126i = new a(16, (CharSequence) null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f3127j = new a(32, (CharSequence) null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f3128k = new a(64, (CharSequence) null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f3129l = new a(128, (CharSequence) null);

        /* renamed from: m  reason: collision with root package name */
        public static final a f3130m;

        /* renamed from: n  reason: collision with root package name */
        public static final a f3131n;

        /* renamed from: o  reason: collision with root package name */
        public static final a f3132o;

        /* renamed from: p  reason: collision with root package name */
        public static final a f3133p;

        /* renamed from: q  reason: collision with root package name */
        public static final a f3134q = new a(4096, (CharSequence) null);

        /* renamed from: r  reason: collision with root package name */
        public static final a f3135r = new a(8192, (CharSequence) null);

        /* renamed from: s  reason: collision with root package name */
        public static final a f3136s = new a(16384, (CharSequence) null);

        /* renamed from: t  reason: collision with root package name */
        public static final a f3137t = new a(32768, (CharSequence) null);

        /* renamed from: u  reason: collision with root package name */
        public static final a f3138u = new a(65536, (CharSequence) null);

        /* renamed from: v  reason: collision with root package name */
        public static final a f3139v = new a(131072, (CharSequence) null, f.g.class);

        /* renamed from: w  reason: collision with root package name */
        public static final a f3140w = new a(262144, (CharSequence) null);

        /* renamed from: x  reason: collision with root package name */
        public static final a f3141x = new a(524288, (CharSequence) null);

        /* renamed from: y  reason: collision with root package name */
        public static final a f3142y = new a(1048576, (CharSequence) null);

        /* renamed from: z  reason: collision with root package name */
        public static final a f3143z = new a(2097152, (CharSequence) null, f.h.class);

        /* renamed from: a  reason: collision with root package name */
        final Object f3144a;

        /* renamed from: b  reason: collision with root package name */
        private final int f3145b;

        /* renamed from: c  reason: collision with root package name */
        private final Class<? extends f.a> f3146c;

        /* renamed from: d  reason: collision with root package name */
        protected final f f3147d;

        static {
            Class<f.c> cls = f.c.class;
            Class<f.b> cls2 = f.b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            f3130m = new a(256, (CharSequence) null, cls2);
            f3131n = new a(512, (CharSequence) null, cls2);
            f3132o = new a(1024, (CharSequence) null, cls);
            f3133p = new a(2048, (CharSequence) null, cls);
            int i10 = Build.VERSION.SDK_INT;
            A = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            B = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (f) null, f.e.class);
            C = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            D = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            E = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            F = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            K = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            L = new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (f) null, f.C0046f.class);
            M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (f) null, f.d.class);
            N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            if (i10 >= 33) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            }
            U = new a(accessibilityAction, 16908376, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        }

        public a(int i10, CharSequence charSequence) {
            this((Object) null, i10, charSequence, (f) null, (Class<? extends f.a>) null);
        }

        public a a(CharSequence charSequence, f fVar) {
            return new a((Object) null, this.f3145b, charSequence, fVar, this.f3146c);
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f3144a).getId();
            }
            return 0;
        }

        public CharSequence c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f3144a).getLabel();
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean d(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                androidx.core.view.accessibility.f r0 = r4.f3147d
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends androidx.core.view.accessibility.f$a> r2 = r4.f3146c
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                androidx.core.view.accessibility.f$a r1 = (androidx.core.view.accessibility.f.a) r1     // Catch:{ Exception -> 0x0020 }
                r1.a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends androidx.core.view.accessibility.f$a> r1 = r4.f3146c
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                androidx.core.view.accessibility.f r6 = r4.f3147d
                boolean r5 = r6.a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.c.a.d(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f3144a;
            if (obj2 == null) {
                if (aVar.f3144a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f3144a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.f3144a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String i10 = c.i(this.f3145b);
            if (i10.equals("ACTION_UNKNOWN") && c() != null) {
                i10 = c().toString();
            }
            sb2.append(i10);
            return sb2.toString();
        }

        a(Object obj) {
            this(obj, 0, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        }

        private a(int i10, CharSequence charSequence, Class<? extends f.a> cls) {
            this((Object) null, i10, charSequence, (f) null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.f3145b = i10;
            this.f3147d = fVar;
            if (Build.VERSION.SDK_INT < 21 || obj != null) {
                this.f3144a = obj;
            } else {
                this.f3144a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            }
            this.f3146c = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    private static class b {
        public static Bundle a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    /* renamed from: androidx.core.view.accessibility.c$c  reason: collision with other inner class name */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C0045c {

        /* renamed from: a  reason: collision with root package name */
        final Object f3148a;

        C0045c(Object obj) {
            this.f3148a = obj;
        }

        public static C0045c a(int i10, int i11, boolean z10, int i12) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 21) {
                return new C0045c(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
            }
            if (i13 >= 19) {
                return new C0045c(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
            }
            return new C0045c((Object) null);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        final Object f3149a;

        d(Object obj) {
            this.f3149a = obj;
        }

        public static d a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 21) {
                return new d(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
            }
            if (i14 >= 19) {
                return new d(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
            }
            return new d((Object) null);
        }
    }

    private c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3119a = accessibilityNodeInfo;
    }

    public static c L() {
        return v0(AccessibilityNodeInfo.obtain());
    }

    public static c M(View view) {
        return v0(AccessibilityNodeInfo.obtain(view));
    }

    public static c N(c cVar) {
        return v0(AccessibilityNodeInfo.obtain(cVar.f3119a));
    }

    private void Q(View view) {
        SparseArray<WeakReference<ClickableSpan>> u10 = u(view);
        if (u10 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < u10.size(); i10++) {
                if (u10.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                u10.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private void S(int i10, boolean z10) {
        Bundle r10 = r();
        if (r10 != null) {
            int i11 = r10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            r10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    private void d(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    private void f() {
        if (Build.VERSION.SDK_INT >= 19) {
            b.a(this.f3119a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            b.a(this.f3119a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            b.a(this.f3119a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            b.a(this.f3119a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private List<Integer> g(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = b.a(this.f3119a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        b.a(this.f3119a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String i(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i10) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean k(int i10) {
        Bundle r10 = r();
        if (r10 != null && (r10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10) {
            return true;
        }
        return false;
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> s(View view) {
        SparseArray<WeakReference<ClickableSpan>> u10 = u(view);
        if (u10 != null) {
            return u10;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(z.d.Q, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> u(View view) {
        return (SparseArray) view.getTag(z.d.Q);
    }

    public static c v0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    private boolean y() {
        return !g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int z(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f3118d;
        f3118d = i11 + 1;
        return i11;
    }

    public boolean A() {
        return this.f3119a.isCheckable();
    }

    public boolean B() {
        return this.f3119a.isChecked();
    }

    public boolean C() {
        return this.f3119a.isClickable();
    }

    public boolean D() {
        return this.f3119a.isEnabled();
    }

    public boolean E() {
        return this.f3119a.isFocusable();
    }

    public boolean F() {
        return this.f3119a.isFocused();
    }

    public boolean G() {
        return this.f3119a.isLongClickable();
    }

    public boolean H() {
        return this.f3119a.isPassword();
    }

    public boolean I() {
        return this.f3119a.isScrollable();
    }

    public boolean J() {
        return this.f3119a.isSelected();
    }

    public boolean K() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f3119a.isShowingHintText();
        }
        return k(4);
    }

    public boolean O(int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f3119a.performAction(i10, bundle);
        }
        return false;
    }

    @Deprecated
    public void P() {
    }

    public void R(boolean z10) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3119a.setAccessibilityFocused(z10);
        }
    }

    @Deprecated
    public void T(Rect rect) {
        this.f3119a.setBoundsInParent(rect);
    }

    public void U(Rect rect) {
        this.f3119a.setBoundsInScreen(rect);
    }

    public void V(boolean z10) {
        this.f3119a.setCheckable(z10);
    }

    public void W(boolean z10) {
        this.f3119a.setChecked(z10);
    }

    public void X(CharSequence charSequence) {
        this.f3119a.setClassName(charSequence);
    }

    public void Y(boolean z10) {
        this.f3119a.setClickable(z10);
    }

    public void Z(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f3119a;
            if (obj == null) {
                collectionInfo = null;
            } else {
                collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((C0045c) obj).f3148a;
            }
            accessibilityNodeInfo.setCollectionInfo(collectionInfo);
        }
    }

    public void a(int i10) {
        this.f3119a.addAction(i10);
    }

    public void a0(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f3119a;
            if (obj == null) {
                collectionItemInfo = null;
            } else {
                collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((d) obj).f3149a;
            }
            accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
        }
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3119a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f3144a);
        }
    }

    public void b0(CharSequence charSequence) {
        this.f3119a.setContentDescription(charSequence);
    }

    public void c(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3119a.addChild(view, i10);
        }
    }

    public void c0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3119a.setContentInvalid(z10);
        }
    }

    public void d0(boolean z10) {
        this.f3119a.setEnabled(z10);
    }

    public void e(CharSequence charSequence, View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19 && i10 < 26) {
            f();
            Q(view);
            ClickableSpan[] p10 = p(charSequence);
            if (p10 != null && p10.length > 0) {
                r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", z.d.f24042a);
                SparseArray<WeakReference<ClickableSpan>> s10 = s(view);
                for (int i11 = 0; i11 < p10.length; i11++) {
                    int z10 = z(p10[i11], s10);
                    s10.put(z10, new WeakReference(p10[i11]));
                    d(p10[i11], (Spanned) charSequence, z10);
                }
            }
        }
    }

    public void e0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3119a.setError(charSequence);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3119a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f3119a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f3119a)) {
            return false;
        }
        return this.f3121c == cVar.f3121c && this.f3120b == cVar.f3120b;
    }

    public void f0(boolean z10) {
        this.f3119a.setFocusable(z10);
    }

    public void g0(boolean z10) {
        this.f3119a.setFocused(z10);
    }

    public List<a> h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f3119a.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public void h0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3119a.setHeading(z10);
        } else {
            S(2, z10);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3119a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f3119a.setHintText(charSequence);
        } else if (i10 >= 19) {
            b.a(this.f3119a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    @Deprecated
    public int j() {
        return this.f3119a.getActions();
    }

    public void j0(CharSequence charSequence) {
        this.f3119a.setPackageName(charSequence);
    }

    public void k0(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f3119a.setPaneTitle(charSequence);
        } else if (i10 >= 19) {
            b.a(this.f3119a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    @Deprecated
    public void l(Rect rect) {
        this.f3119a.getBoundsInParent(rect);
    }

    public void l0(View view) {
        this.f3120b = -1;
        this.f3119a.setParent(view);
    }

    public void m(Rect rect) {
        this.f3119a.getBoundsInScreen(rect);
    }

    public void m0(View view, int i10) {
        this.f3120b = i10;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3119a.setParent(view, i10);
        }
    }

    public int n() {
        return this.f3119a.getChildCount();
    }

    public void n0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3119a.setScreenReaderFocusable(z10);
        } else {
            S(1, z10);
        }
    }

    public CharSequence o() {
        return this.f3119a.getClassName();
    }

    public void o0(boolean z10) {
        this.f3119a.setScrollable(z10);
    }

    public void p0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3119a.setShowingHintText(z10);
        } else {
            S(4, z10);
        }
    }

    public CharSequence q() {
        return this.f3119a.getContentDescription();
    }

    public void q0(View view, int i10) {
        this.f3121c = i10;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3119a.setSource(view, i10);
        }
    }

    public Bundle r() {
        if (Build.VERSION.SDK_INT >= 19) {
            return b.a(this.f3119a);
        }
        return new Bundle();
    }

    public void r0(CharSequence charSequence) {
        if (androidx.core.os.a.b()) {
            this.f3119a.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            b.a(this.f3119a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void s0(CharSequence charSequence) {
        this.f3119a.setText(charSequence);
    }

    public CharSequence t() {
        return this.f3119a.getPackageName();
    }

    public void t0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3119a.setVisibleToUser(z10);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        sb2.append("; boundsInParent: " + rect);
        m(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(t());
        sb2.append("; className: ");
        sb2.append(o());
        sb2.append("; text: ");
        sb2.append(v());
        sb2.append("; contentDescription: ");
        sb2.append(q());
        sb2.append("; viewId: ");
        sb2.append(x());
        sb2.append("; uniqueId: ");
        sb2.append(w());
        sb2.append("; checkable: ");
        sb2.append(A());
        sb2.append("; checked: ");
        sb2.append(B());
        sb2.append("; focusable: ");
        sb2.append(E());
        sb2.append("; focused: ");
        sb2.append(F());
        sb2.append("; selected: ");
        sb2.append(J());
        sb2.append("; clickable: ");
        sb2.append(C());
        sb2.append("; longClickable: ");
        sb2.append(G());
        sb2.append("; enabled: ");
        sb2.append(D());
        sb2.append("; password: ");
        sb2.append(H());
        sb2.append("; scrollable: " + I());
        sb2.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> h10 = h();
            for (int i10 = 0; i10 < h10.size(); i10++) {
                a aVar = h10.get(i10);
                String i11 = i(aVar.b());
                if (i11.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                    i11 = aVar.c().toString();
                }
                sb2.append(i11);
                if (i10 != h10.size() - 1) {
                    sb2.append(", ");
                }
            }
        } else {
            int j10 = j();
            while (j10 != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(j10);
                j10 &= ~numberOfTrailingZeros;
                sb2.append(i(numberOfTrailingZeros));
                if (j10 != 0) {
                    sb2.append(", ");
                }
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public AccessibilityNodeInfo u0() {
        return this.f3119a;
    }

    public CharSequence v() {
        if (!y()) {
            return this.f3119a.getText();
        }
        List<Integer> g10 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> g11 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> g12 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> g13 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f3119a.getText(), 0, this.f3119a.getText().length()));
        for (int i10 = 0; i10 < g10.size(); i10++) {
            spannableString.setSpan(new a(g13.get(i10).intValue(), this, r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), g10.get(i10).intValue(), g11.get(i10).intValue(), g12.get(i10).intValue());
        }
        return spannableString;
    }

    public String w() {
        if (androidx.core.os.a.d()) {
            return this.f3119a.getUniqueId();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return b.a(this.f3119a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        return null;
    }

    public String x() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f3119a.getViewIdResourceName();
        }
        return null;
    }
}
