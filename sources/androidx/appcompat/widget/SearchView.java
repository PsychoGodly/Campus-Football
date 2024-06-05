package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.a0;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinEventParameters;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends l0 implements androidx.appcompat.view.c {

    /* renamed from: r0  reason: collision with root package name */
    static final o f1386r0 = (Build.VERSION.SDK_INT < 29 ? new o() : null);
    private Rect A;
    private Rect B;
    private int[] C;
    private int[] D;
    private final ImageView E;
    private final Drawable F;
    private final int G;
    private final int H;
    private final Intent I;
    private final Intent J;
    private final CharSequence K;
    private m L;
    private l M;
    View.OnFocusChangeListener N;
    private n O;
    private View.OnClickListener P;
    private boolean Q;
    private boolean R;
    d0.a S;
    private boolean T;
    private CharSequence U;
    private boolean V;
    private boolean W;

    /* renamed from: a0  reason: collision with root package name */
    private int f1387a0;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f1388b0;

    /* renamed from: c0  reason: collision with root package name */
    private CharSequence f1389c0;

    /* renamed from: d0  reason: collision with root package name */
    private CharSequence f1390d0;

    /* renamed from: e0  reason: collision with root package name */
    private boolean f1391e0;

    /* renamed from: f0  reason: collision with root package name */
    private int f1392f0;

    /* renamed from: g0  reason: collision with root package name */
    SearchableInfo f1393g0;

    /* renamed from: h0  reason: collision with root package name */
    private Bundle f1394h0;

    /* renamed from: i0  reason: collision with root package name */
    private final Runnable f1395i0;

    /* renamed from: j0  reason: collision with root package name */
    private Runnable f1396j0;

    /* renamed from: k0  reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1397k0;

    /* renamed from: l0  reason: collision with root package name */
    private final View.OnClickListener f1398l0;

    /* renamed from: m0  reason: collision with root package name */
    View.OnKeyListener f1399m0;

    /* renamed from: n0  reason: collision with root package name */
    private final TextView.OnEditorActionListener f1400n0;

    /* renamed from: o0  reason: collision with root package name */
    private final AdapterView.OnItemClickListener f1401o0;

    /* renamed from: p0  reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f1402p0;

    /* renamed from: q  reason: collision with root package name */
    final SearchAutoComplete f1403q;

    /* renamed from: q0  reason: collision with root package name */
    private TextWatcher f1404q0;

    /* renamed from: r  reason: collision with root package name */
    private final View f1405r;

    /* renamed from: s  reason: collision with root package name */
    private final View f1406s;

    /* renamed from: t  reason: collision with root package name */
    private final View f1407t;

    /* renamed from: u  reason: collision with root package name */
    final ImageView f1408u;

    /* renamed from: v  reason: collision with root package name */
    final ImageView f1409v;

    /* renamed from: w  reason: collision with root package name */
    final ImageView f1410w;

    /* renamed from: x  reason: collision with root package name */
    final ImageView f1411x;

    /* renamed from: y  reason: collision with root package name */
    private final View f1412y;

    /* renamed from: z  reason: collision with root package name */
    private q f1413z;

    public static class SearchAutoComplete extends d {

        /* renamed from: f  reason: collision with root package name */
        private int f1414f;

        /* renamed from: g  reason: collision with root package name */
        private SearchView f1415g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f1416h;

        /* renamed from: i  reason: collision with root package name */
        final Runnable f1417i;

        class a implements Runnable {
            a() {
            }

            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, h.a.f18180p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f1386r0.c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (this.f1416h) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1416h = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f1414f <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1416h) {
                removeCallbacks(this.f1417i);
                post(this.f1417i);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f1415g.Z();
        }

        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1415g.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1415g.hasFocus() && getVisibility() == 0) {
                this.f1416h = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f1416h = false;
                removeCallbacks(this.f1417i);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1416h = false;
                removeCallbacks(this.f1417i);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1416h = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f1415g = searchView;
        }

        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1414f = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1417i = new a();
            this.f1414f = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.Y(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            SearchView.this.f0();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            d0.a aVar = SearchView.this.S;
            if (aVar instanceof t0) {
                aVar.a((Cursor) null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.N;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.B();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1408u) {
                searchView.V();
            } else if (view == searchView.f1410w) {
                searchView.R();
            } else if (view == searchView.f1409v) {
                searchView.W();
            } else if (view == searchView.f1411x) {
                searchView.a0();
            } else if (view == searchView.f1403q) {
                searchView.H();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1393g0 == null) {
                return false;
            }
            if (searchView.f1403q.isPopupShowing() && SearchView.this.f1403q.getListSelection() != -1) {
                return SearchView.this.X(view, i10, keyEvent);
            }
            if (SearchView.this.f1403q.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, (String) null, searchView2.f1403q.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.S(i10, 0, (String) null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.T(i10);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
        boolean onClose();
    }

    public interface m {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    public interface n {
        boolean a(int i10);

        boolean b(int i10);
    }

    private static class o {

        /* renamed from: a  reason: collision with root package name */
        private Method f1429a = null;

        /* renamed from: b  reason: collision with root package name */
        private Method f1430b = null;

        /* renamed from: c  reason: collision with root package name */
        private Method f1431c = null;

        o() {
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1429a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1430b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1431c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1430b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1429a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1431c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    static class p extends e0.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f1432c;

        class a implements Parcelable.ClassLoaderCreator<p> {
            a() {
            }

            /* renamed from: a */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            /* renamed from: c */
            public p[] newArray(int i10) {
                return new p[i10];
            }
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1432c + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1432c));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1432c = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    private static class q extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f1433a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f1434b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        private final Rect f1435c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        private final Rect f1436d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        private final int f1437e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1438f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1437e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f1433a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1434b.set(rect);
            this.f1436d.set(rect);
            Rect rect3 = this.f1436d;
            int i10 = this.f1437e;
            rect3.inset(-i10, -i10);
            this.f1435c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f1438f
                r7.f1438f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f1438f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f1436d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f1434b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f1438f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x0072
                if (r2 == 0) goto L_0x005f
                android.graphics.Rect r2 = r7.f1435c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005f
                android.view.View r0 = r7.f1433a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f1433a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x006c
            L_0x005f:
                android.graphics.Rect r2 = r7.f1435c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x006c:
                android.view.View r0 = r7.f1433a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x0072:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.q.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1390d0);
        if (str3 != null) {
            intent.putExtra(AppLovinEventParameters.SEARCH_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1394h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1393g0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i10, String str) {
        int i11;
        Uri uri;
        String o10;
        try {
            String o11 = t0.o(cursor, "suggest_intent_action");
            if (o11 == null) {
                o11 = this.f1393g0.getSuggestIntentAction();
            }
            if (o11 == null) {
                o11 = "android.intent.action.SEARCH";
            }
            String str2 = o11;
            String o12 = t0.o(cursor, "suggest_intent_data");
            if (o12 == null) {
                o12 = this.f1393g0.getSuggestIntentData();
            }
            if (!(o12 == null || (o10 = t0.o(cursor, "suggest_intent_data_id")) == null)) {
                o12 = o12 + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + Uri.encode(o10);
            }
            if (o12 == null) {
                uri = null;
            } else {
                uri = Uri.parse(o12);
            }
            return C(str2, uri, t0.o(cursor, "suggest_intent_extra_data"), t0.o(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                i11 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1394h0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i10 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    private void G() {
        this.f1403q.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.C);
        getLocationInWindow(this.D);
        int[] iArr = this.C;
        int i10 = iArr[1];
        int[] iArr2 = this.D;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.Q || this.F == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1403q.getTextSize()) * 1.25d);
        this.F.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.f1393g0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1393g0.getVoiceSearchLaunchWebSearch()) {
            intent = this.I;
        } else if (this.f1393g0.getVoiceSearchLaunchRecognizer()) {
            intent = this.J;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.T || this.f1388b0) && !L();
    }

    private void O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e10) {
                Log.e("SearchView", "Failed launch activity: " + intent, e10);
            }
        }
    }

    private boolean Q(int i10, int i11, String str) {
        Cursor b10 = this.S.b();
        if (b10 == null || !b10.moveToPosition(i10)) {
            return false;
        }
        O(D(b10, i11, str));
        return true;
    }

    private void b0() {
        post(this.f1395i0);
    }

    private void c0(int i10) {
        Editable text = this.f1403q.getText();
        Cursor b10 = this.S.b();
        if (b10 != null) {
            if (b10.moveToPosition(i10)) {
                CharSequence c10 = this.S.c(b10);
                if (c10 != null) {
                    setQuery(c10);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    private void e0() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1403q.getText());
        int i10 = 0;
        if (!z11 && (!this.Q || this.f1391e0)) {
            z10 = false;
        }
        ImageView imageView = this.f1410w;
        if (!z10) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        Drawable drawable = this.f1410w.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1403q;
        if (queryHint == null) {
            queryHint = MaxReward.DEFAULT_LABEL;
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(h.d.f18206g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(h.d.f18207h);
    }

    private void h0() {
        this.f1403q.setThreshold(this.f1393g0.getSuggestThreshold());
        this.f1403q.setImeOptions(this.f1393g0.getImeOptions());
        int inputType = this.f1393g0.getInputType();
        int i10 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1393g0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1403q.setInputType(inputType);
        d0.a aVar = this.S;
        if (aVar != null) {
            aVar.a((Cursor) null);
        }
        if (this.f1393g0.getSuggestAuthority() != null) {
            t0 t0Var = new t0(getContext(), this, this.f1393g0, this.f1397k0);
            this.S = t0Var;
            this.f1403q.setAdapter(t0Var);
            t0 t0Var2 = (t0) this.S;
            if (this.V) {
                i10 = 2;
            }
            t0Var2.x(i10);
        }
    }

    private void i0() {
        this.f1407t.setVisibility((!N() || !(this.f1409v.getVisibility() == 0 || this.f1411x.getVisibility() == 0)) ? 8 : 0);
    }

    private void j0(boolean z10) {
        this.f1409v.setVisibility((!this.T || !N() || !hasFocus() || (!z10 && this.f1388b0)) ? 8 : 0);
    }

    private void k0(boolean z10) {
        this.R = z10;
        int i10 = 0;
        int i11 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.f1403q.getText());
        this.f1408u.setVisibility(i11);
        j0(z11);
        this.f1405r.setVisibility(z10 ? 8 : 0);
        if (this.E.getDrawable() == null || this.Q) {
            i10 = 8;
        }
        this.E.setVisibility(i10);
        e0();
        l0(!z11);
        i0();
    }

    private void l0(boolean z10) {
        int i10 = 8;
        if (this.f1388b0 && !L() && z10) {
            this.f1409v.setVisibility(8);
            i10 = 0;
        }
        this.f1411x.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1403q.setText(charSequence);
        this.f1403q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    public void B() {
        int i10;
        if (this.f1412y.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1406s.getPaddingLeft();
            Rect rect = new Rect();
            boolean b10 = k1.b(this);
            int dimensionPixelSize = this.Q ? resources.getDimensionPixelSize(h.d.f18204e) + resources.getDimensionPixelSize(h.d.f18205f) : 0;
            this.f1403q.getDropDownBackground().getPadding(rect);
            if (b10) {
                i10 = -rect.left;
            } else {
                i10 = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f1403q.setDropDownHorizontalOffset(i10);
            this.f1403q.setDropDownWidth((((this.f1412y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f1403q);
            return;
        }
        o oVar = f1386r0;
        oVar.b(this.f1403q);
        oVar.a(this.f1403q);
    }

    public boolean L() {
        return this.R;
    }

    /* access modifiers changed from: package-private */
    public void P(int i10, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i10, str));
    }

    /* access modifiers changed from: package-private */
    public void R() {
        if (!TextUtils.isEmpty(this.f1403q.getText())) {
            this.f1403q.setText(MaxReward.DEFAULT_LABEL);
            this.f1403q.requestFocus();
            this.f1403q.setImeVisibility(true);
        } else if (this.Q) {
            l lVar = this.M;
            if (lVar == null || !lVar.onClose()) {
                clearFocus();
                k0(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean S(int i10, int i11, String str) {
        n nVar = this.O;
        if (nVar != null && nVar.b(i10)) {
            return false;
        }
        Q(i10, 0, (String) null);
        this.f1403q.setImeVisibility(false);
        G();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean T(int i10) {
        n nVar = this.O;
        if (nVar != null && nVar.a(i10)) {
            return false;
        }
        c0(i10);
        return true;
    }

    /* access modifiers changed from: protected */
    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    public void V() {
        k0(false);
        this.f1403q.requestFocus();
        this.f1403q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void W() {
        Editable text = this.f1403q.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            m mVar = this.L;
            if (mVar == null || !mVar.onQueryTextSubmit(text.toString())) {
                if (this.f1393g0 != null) {
                    P(0, (String) null, text.toString());
                }
                this.f1403q.setImeVisibility(false);
                G();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean X(View view, int i10, KeyEvent keyEvent) {
        int i11;
        if (this.f1393g0 != null && this.S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return S(this.f1403q.getListSelection(), 0, (String) null);
            }
            if (i10 == 21 || i10 == 22) {
                if (i10 == 21) {
                    i11 = 0;
                } else {
                    i11 = this.f1403q.length();
                }
                this.f1403q.setSelection(i11);
                this.f1403q.setListSelection(0);
                this.f1403q.clearListSelection();
                this.f1403q.b();
                return true;
            } else if (i10 == 19) {
                this.f1403q.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void Y(CharSequence charSequence) {
        Editable text = this.f1403q.getText();
        this.f1390d0 = text;
        boolean z10 = !TextUtils.isEmpty(text);
        j0(z10);
        l0(!z10);
        e0();
        i0();
        if (this.L != null && !TextUtils.equals(charSequence, this.f1389c0)) {
            this.L.onQueryTextChange(charSequence.toString());
        }
        this.f1389c0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    public void Z() {
        k0(L());
        b0();
        if (this.f1403q.hasFocus()) {
            H();
        }
    }

    /* access modifiers changed from: package-private */
    public void a0() {
        SearchableInfo searchableInfo = this.f1393g0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(F(this.I, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(E(this.J, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public void c() {
        if (!this.f1391e0) {
            this.f1391e0 = true;
            int imeOptions = this.f1403q.getImeOptions();
            this.f1392f0 = imeOptions;
            this.f1403q.setImeOptions(imeOptions | 33554432);
            this.f1403q.setText(MaxReward.DEFAULT_LABEL);
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.W = true;
        super.clearFocus();
        this.f1403q.clearFocus();
        this.f1403q.setImeVisibility(false);
        this.W = false;
    }

    public void d0(CharSequence charSequence, boolean z10) {
        this.f1403q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1403q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1390d0 = charSequence;
        }
        if (z10 && !TextUtils.isEmpty(charSequence)) {
            W();
        }
    }

    public void f() {
        d0(MaxReward.DEFAULT_LABEL, false);
        clearFocus();
        k0(true);
        this.f1403q.setImeOptions(this.f1392f0);
        this.f1391e0 = false;
    }

    /* access modifiers changed from: package-private */
    public void f0() {
        int[] iArr = this.f1403q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1406s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1407t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1403q.getImeOptions();
    }

    public int getInputType() {
        return this.f1403q.getInputType();
    }

    public int getMaxWidth() {
        return this.f1387a0;
    }

    public CharSequence getQuery() {
        return this.f1403q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1393g0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.K;
        }
        return getContext().getText(this.f1393g0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.H;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.G;
    }

    public d0.a getSuggestionsAdapter() {
        return this.S;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1395i0);
        post(this.f1396j0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            I(this.f1403q, this.A);
            Rect rect = this.B;
            Rect rect2 = this.A;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            q qVar = this.f1413z;
            if (qVar == null) {
                q qVar2 = new q(this.B, this.A, this.f1403q);
                this.f1413z = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            qVar.a(this.B, this.A);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        if (L()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f1387a0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1387a0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f1387a0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.c());
        k0(pVar.f1432c);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f1432c = L();
        return pVar;
    }

    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        b0();
    }

    public boolean requestFocus(int i10, Rect rect) {
        if (this.W || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.f1403q.requestFocus(i10, rect);
        if (requestFocus) {
            k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1394h0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
            k0(z10);
            g0();
        }
    }

    public void setImeOptions(int i10) {
        this.f1403q.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f1403q.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f1387a0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.M = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.L = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.P = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.O = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.U = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.V = z10;
        d0.a aVar = this.S;
        if (aVar instanceof t0) {
            ((t0) aVar).x(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1393g0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K2 = K();
        this.f1388b0 = K2;
        if (K2) {
            this.f1403q.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.T = z10;
        k0(L());
    }

    public void setSuggestionsAdapter(d0.a aVar) {
        this.S = aVar;
        this.f1403q.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.H);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new int[2];
        this.D = new int[2];
        this.f1395i0 = new b();
        this.f1396j0 = new c();
        this.f1397k0 = new WeakHashMap<>();
        f fVar = new f();
        this.f1398l0 = fVar;
        this.f1399m0 = new g();
        h hVar = new h();
        this.f1400n0 = hVar;
        i iVar = new i();
        this.f1401o0 = iVar;
        j jVar = new j();
        this.f1402p0 = jVar;
        this.f1404q0 = new a();
        int[] iArr = h.j.f18332f2;
        AttributeSet attributeSet2 = attributeSet;
        int i11 = i10;
        z0 v10 = z0.v(context, attributeSet2, iArr, i11, 0);
        a0.l0(this, context, iArr, attributeSet2, v10.r(), i11, 0);
        LayoutInflater.from(context).inflate(v10.n(h.j.f18382p2, h.g.f18284r), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(h.f.D);
        this.f1403q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1405r = findViewById(h.f.f18266z);
        View findViewById = findViewById(h.f.C);
        this.f1406s = findViewById;
        View findViewById2 = findViewById(h.f.J);
        this.f1407t = findViewById2;
        ImageView imageView = (ImageView) findViewById(h.f.f18264x);
        this.f1408u = imageView;
        ImageView imageView2 = (ImageView) findViewById(h.f.A);
        this.f1409v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(h.f.f18265y);
        this.f1410w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(h.f.E);
        this.f1411x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(h.f.B);
        this.E = imageView5;
        a0.r0(findViewById, v10.g(h.j.f18387q2));
        a0.r0(findViewById2, v10.g(h.j.f18407u2));
        int i12 = h.j.f18402t2;
        imageView.setImageDrawable(v10.g(i12));
        imageView2.setImageDrawable(v10.g(h.j.f18372n2));
        imageView3.setImageDrawable(v10.g(h.j.f18357k2));
        imageView4.setImageDrawable(v10.g(h.j.f18417w2));
        imageView5.setImageDrawable(v10.g(i12));
        this.F = v10.g(h.j.f18397s2);
        e1.a(imageView, getResources().getString(h.h.f18298l));
        this.G = v10.n(h.j.f18412v2, h.g.f18283q);
        this.H = v10.n(h.j.f18362l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1404q0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1399m0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v10.a(h.j.f18377o2, true));
        int f10 = v10.f(h.j.f18342h2, -1);
        if (f10 != -1) {
            setMaxWidth(f10);
        }
        this.K = v10.p(h.j.f18367m2);
        this.U = v10.p(h.j.f18392r2);
        int k10 = v10.k(h.j.f18352j2, -1);
        if (k10 != -1) {
            setImeOptions(k10);
        }
        int k11 = v10.k(h.j.f18347i2, -1);
        if (k11 != -1) {
            setInputType(k11);
        }
        setFocusable(v10.a(h.j.f18337g2, true));
        v10.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.J = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1412y = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.Q);
        g0();
    }
}
