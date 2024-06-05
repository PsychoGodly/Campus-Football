package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.l0;
import androidx.core.view.a0;
import androidx.core.widget.NestedScrollView;
import h.j;
import java.lang.ref.WeakReference;

class AlertController {
    NestedScrollView A;
    private int B = 0;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    int I = -1;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    private int Q = 0;
    Handler R;
    private final View.OnClickListener S = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f754a;

    /* renamed from: b  reason: collision with root package name */
    final k f755b;

    /* renamed from: c  reason: collision with root package name */
    private final Window f756c;

    /* renamed from: d  reason: collision with root package name */
    private final int f757d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f758e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f759f;

    /* renamed from: g  reason: collision with root package name */
    ListView f760g;

    /* renamed from: h  reason: collision with root package name */
    private View f761h;

    /* renamed from: i  reason: collision with root package name */
    private int f762i;

    /* renamed from: j  reason: collision with root package name */
    private int f763j;

    /* renamed from: k  reason: collision with root package name */
    private int f764k;

    /* renamed from: l  reason: collision with root package name */
    private int f765l;

    /* renamed from: m  reason: collision with root package name */
    private int f766m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f767n = false;

    /* renamed from: o  reason: collision with root package name */
    Button f768o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f769p;

    /* renamed from: q  reason: collision with root package name */
    Message f770q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f771r;

    /* renamed from: s  reason: collision with root package name */
    Button f772s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f773t;

    /* renamed from: u  reason: collision with root package name */
    Message f774u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f775v;

    /* renamed from: w  reason: collision with root package name */
    Button f776w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f777x;

    /* renamed from: y  reason: collision with root package name */
    Message f778y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable f779z;

    public static class RecycleListView extends ListView {

        /* renamed from: a  reason: collision with root package name */
        private final int f780a;

        /* renamed from: b  reason: collision with root package name */
        private final int f781b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f18317c2);
            this.f781b = obtainStyledAttributes.getDimensionPixelOffset(j.f18322d2, -1);
            this.f780a = obtainStyledAttributes.getDimensionPixelOffset(j.f18327e2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (!z11 || !z10) {
                setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f780a, getPaddingRight(), z11 ? getPaddingBottom() : this.f781b);
            }
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r3 = r0.f778y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f768o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f770q
                if (r1 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x000f:
                android.widget.Button r1 = r0.f772s
                if (r3 != r1) goto L_0x001c
                android.os.Message r1 = r0.f774u
                if (r1 == 0) goto L_0x001c
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x001c:
                android.widget.Button r1 = r0.f776w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f778y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.R
                r1 = 1
                androidx.appcompat.app.k r3 = r3.f755b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    class b implements NestedScrollView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f783a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f784b;

        b(View view, View view2) {
            this.f783a = view;
            this.f784b = view2;
        }

        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.f(nestedScrollView, this.f783a, this.f784b);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f786a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f787b;

        c(View view, View view2) {
            this.f786a = view;
            this.f787b = view2;
        }

        public void run() {
            AlertController.f(AlertController.this.A, this.f786a, this.f787b);
        }
    }

    class d implements AbsListView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f789a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f790b;

        d(View view, View view2) {
            this.f789a = view;
            this.f790b = view2;
        }

        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.f(absListView, this.f789a, this.f790b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f792a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f793b;

        e(View view, View view2) {
            this.f792a = view;
            this.f793b = view2;
        }

        public void run() {
            AlertController.f(AlertController.this.f760g, this.f792a, this.f793b);
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E = false;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public int I = -1;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;
        public boolean P = true;

        /* renamed from: a  reason: collision with root package name */
        public final Context f795a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f796b;

        /* renamed from: c  reason: collision with root package name */
        public int f797c = 0;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f798d;

        /* renamed from: e  reason: collision with root package name */
        public int f799e = 0;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f800f;

        /* renamed from: g  reason: collision with root package name */
        public View f801g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f802h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f803i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f804j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f805k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f806l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f807m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f808n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f809o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f810p;

        /* renamed from: q  reason: collision with root package name */
        public DialogInterface.OnClickListener f811q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f812r;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f813s;

        /* renamed from: t  reason: collision with root package name */
        public DialogInterface.OnDismissListener f814t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f815u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence[] f816v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f817w;

        /* renamed from: x  reason: collision with root package name */
        public DialogInterface.OnClickListener f818x;

        /* renamed from: y  reason: collision with root package name */
        public int f819y;

        /* renamed from: z  reason: collision with root package name */
        public View f820z;

        class a extends ArrayAdapter<CharSequence> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RecycleListView f821a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f821a = recycleListView;
            }

            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f821a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        class b extends CursorAdapter {

            /* renamed from: a  reason: collision with root package name */
            private final int f823a;

            /* renamed from: b  reason: collision with root package name */
            private final int f824b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ RecycleListView f825c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ AlertController f826d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f825c = recycleListView;
                this.f826d = alertController;
                Cursor cursor2 = getCursor();
                this.f823a = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f824b = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f823a));
                RecycleListView recycleListView = this.f825c;
                int position = cursor.getPosition();
                boolean z10 = true;
                if (cursor.getInt(this.f824b) != 1) {
                    z10 = false;
                }
                recycleListView.setItemChecked(position, z10);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f796b.inflate(this.f826d.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AlertController f828a;

            c(AlertController alertController) {
                this.f828a = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                f.this.f818x.onClick(this.f828a.f755b, i10);
                if (!f.this.H) {
                    this.f828a.f755b.dismiss();
                }
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RecycleListView f830a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AlertController f831b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f830a = recycleListView;
                this.f831b = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f830a.isItemChecked(i10);
                }
                f.this.J.onClick(this.f831b.f755b, i10, this.f830a.isItemChecked(i10));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f795a = context;
            this.f812r = true;
            this.f796b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v23, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f796b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f795a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f816v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f795a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f795a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f817w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f795a
                java.lang.CharSequence[] r3 = r10.f816v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.O
                if (r1 == 0) goto L_0x0072
                r1.a(r0)
            L_0x0072:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f818x
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
                r0.setOnItemClickListener(r1)
                goto L_0x0091
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L_0x0091
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                r0.setOnItemClickListener(r1)
            L_0x0091:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.N
                if (r1 == 0) goto L_0x0098
                r0.setOnItemSelectedListener(r1)
            L_0x0098:
                boolean r1 = r10.H
                if (r1 == 0) goto L_0x00a0
                r0.setChoiceMode(r8)
                goto L_0x00a8
            L_0x00a0:
                boolean r1 = r10.G
                if (r1 == 0) goto L_0x00a8
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a8:
                r11.f760g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.f.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f801g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f800f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f798d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f797c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f799e;
                if (i11 != 0) {
                    alertController.m(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f802h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f803i;
            if (!(charSequence3 == null && this.f804j == null)) {
                alertController.k(-1, charSequence3, this.f805k, (Message) null, this.f804j);
            }
            CharSequence charSequence4 = this.f806l;
            if (!(charSequence4 == null && this.f807m == null)) {
                alertController.k(-2, charSequence4, this.f808n, (Message) null, this.f807m);
            }
            CharSequence charSequence5 = this.f809o;
            if (!(charSequence5 == null && this.f810p == null)) {
                alertController.k(-3, charSequence5, this.f811q, (Message) null, this.f810p);
            }
            if (!(this.f816v == null && this.K == null && this.f817w == null)) {
                b(alertController);
            }
            View view2 = this.f820z;
            if (view2 == null) {
                int i12 = this.f819y;
                if (i12 != 0) {
                    alertController.r(i12);
                }
            } else if (this.E) {
                alertController.t(view2, this.A, this.B, this.C, this.D);
            } else {
                alertController.s(view2);
            }
        }
    }

    private static final class g extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DialogInterface> f833a;

        public g(DialogInterface dialogInterface) {
            this.f833a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f833a.get(), message.what);
            } else if (i10 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, k kVar, Window window) {
        this.f754a = context;
        this.f755b = kVar;
        this.f756c = window;
        this.R = new g(kVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j.F, h.a.f18178n, 0);
        this.J = obtainStyledAttributes.getResourceId(j.G, 0);
        this.K = obtainStyledAttributes.getResourceId(j.I, 0);
        this.L = obtainStyledAttributes.getResourceId(j.K, 0);
        this.M = obtainStyledAttributes.getResourceId(j.L, 0);
        this.N = obtainStyledAttributes.getResourceId(j.N, 0);
        this.O = obtainStyledAttributes.getResourceId(j.J, 0);
        this.P = obtainStyledAttributes.getBoolean(j.M, true);
        this.f757d = obtainStyledAttributes.getDimensionPixelSize(j.H, 0);
        obtainStyledAttributes.recycle();
        kVar.g(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void f(View view, View view2, View view3) {
        int i10 = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i10 = 4;
            }
            view3.setVisibility(i10);
        }
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i10 = this.K;
        if (i10 == 0) {
            return this.J;
        }
        if (this.Q == 1) {
            return i10;
        }
        return this.J;
    }

    private void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f756c.findViewById(h.f.f18262v);
        View findViewById2 = this.f756c.findViewById(h.f.f18261u);
        if (Build.VERSION.SDK_INT >= 23) {
            a0.C0(view, i10, i11);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i10 & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i10 & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById != null || findViewById2 != null) {
            if (this.f759f != null) {
                this.A.setOnScrollChangeListener(new b(findViewById, findViewById2));
                this.A.post(new c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f760g;
            if (listView != null) {
                listView.setOnScrollListener(new d(findViewById, findViewById2));
                this.f760g.post(new e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
            }
        }
    }

    private void u(ViewGroup viewGroup) {
        boolean z10;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f768o = button;
        button.setOnClickListener(this.S);
        boolean z11 = true;
        if (!TextUtils.isEmpty(this.f769p) || this.f771r != null) {
            this.f768o.setText(this.f769p);
            Drawable drawable = this.f771r;
            if (drawable != null) {
                int i10 = this.f757d;
                drawable.setBounds(0, 0, i10, i10);
                this.f768o.setCompoundDrawables(this.f771r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f768o.setVisibility(0);
            z10 = true;
        } else {
            this.f768o.setVisibility(8);
            z10 = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f772s = button2;
        button2.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f773t) || this.f775v != null) {
            this.f772s.setText(this.f773t);
            Drawable drawable2 = this.f775v;
            if (drawable2 != null) {
                int i11 = this.f757d;
                drawable2.setBounds(0, 0, i11, i11);
                this.f772s.setCompoundDrawables(this.f775v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f772s.setVisibility(0);
            z10 |= true;
        } else {
            this.f772s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f776w = button3;
        button3.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f777x) || this.f779z != null) {
            this.f776w.setText(this.f777x);
            Drawable drawable3 = this.f779z;
            if (drawable3 != null) {
                int i12 = this.f757d;
                drawable3.setBounds(0, 0, i12, i12);
                this.f776w.setCompoundDrawables(this.f779z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f776w.setVisibility(0);
            z10 |= true;
        } else {
            this.f776w.setVisibility(8);
        }
        if (z(this.f754a)) {
            if (z10) {
                b(this.f768o);
            } else if (z10) {
                b(this.f772s);
            } else if (z10) {
                b(this.f776w);
            }
        }
        if (!z10) {
            z11 = false;
        }
        if (!z11) {
            viewGroup.setVisibility(8);
        }
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f756c.findViewById(h.f.f18263w);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f759f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.A.removeView(this.F);
            if (this.f760g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f760g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    private void w(ViewGroup viewGroup) {
        View view = this.f761h;
        boolean z10 = false;
        if (view == null) {
            view = this.f762i != 0 ? LayoutInflater.from(this.f754a).inflate(this.f762i, viewGroup, false) : null;
        }
        if (view != null) {
            z10 = true;
        }
        if (!z10 || !a(view)) {
            this.f756c.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) this.f756c.findViewById(h.f.f18254n);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f767n) {
                frameLayout.setPadding(this.f763j, this.f764k, this.f765l, this.f766m);
            }
            if (this.f760g != null) {
                ((l0.a) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f756c.findViewById(h.f.O).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f756c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f758e)) || !this.P) {
            this.f756c.findViewById(h.f.O).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f756c.findViewById(h.f.f18250j);
        this.E = textView;
        textView.setText(this.f758e);
        int i10 = this.B;
        if (i10 != 0) {
            this.D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
            return;
        }
        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
        this.D.setVisibility(8);
    }

    private void y() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f756c.findViewById(h.f.f18260t);
        int i10 = h.f.P;
        View findViewById4 = findViewById3.findViewById(i10);
        int i11 = h.f.f18253m;
        View findViewById5 = findViewById3.findViewById(i11);
        int i12 = h.f.f18251k;
        View findViewById6 = findViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(h.f.f18255o);
        w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i10);
        View findViewById8 = viewGroup.findViewById(i11);
        View findViewById9 = viewGroup.findViewById(i12);
        ViewGroup i13 = i(findViewById7, findViewById4);
        ViewGroup i14 = i(findViewById8, findViewById5);
        ViewGroup i15 = i(findViewById9, findViewById6);
        v(i14);
        u(i15);
        x(i13);
        char c10 = 0;
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (i13 == null || i13.getVisibility() == 8) ? false : true;
        boolean z12 = (i15 == null || i15.getVisibility() == 8) ? false : true;
        if (!(z12 || i14 == null || (findViewById2 = i14.findViewById(h.f.K)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z11) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f759f == null && this.f760g == null)) {
                view = i13.findViewById(h.f.N);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(i14 == null || (findViewById = i14.findViewById(h.f.L)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f760g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view2 = this.f760g;
            if (view2 == null) {
                view2 = this.A;
            }
            if (view2 != null) {
                if (z12) {
                    c10 = 2;
                }
                p(i14, view2, z11 | c10 ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f760g;
        if (listView2 != null && (listAdapter = this.H) != null) {
            listView2.setAdapter(listAdapter);
            int i16 = this.I;
            if (i16 > -1) {
                listView2.setItemChecked(i16, true);
                listView2.setSelection(i16);
            }
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(h.a.f18177m, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f754a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f760g;
    }

    public void e() {
        this.f755b.setContentView(j());
        y();
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.m(keyEvent);
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.m(keyEvent);
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f777x = charSequence;
            this.f778y = message;
            this.f779z = drawable;
        } else if (i10 == -2) {
            this.f773t = charSequence;
            this.f774u = message;
            this.f775v = drawable;
        } else if (i10 == -1) {
            this.f769p = charSequence;
            this.f770q = message;
            this.f771r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (i10 != 0) {
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
            return;
        }
        imageView.setVisibility(8);
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    public void o(CharSequence charSequence) {
        this.f759f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f758e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i10) {
        this.f761h = null;
        this.f762i = i10;
        this.f767n = false;
    }

    public void s(View view) {
        this.f761h = view;
        this.f762i = 0;
        this.f767n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f761h = view;
        this.f762i = 0;
        this.f767n = true;
        this.f763j = i10;
        this.f764k = i11;
        this.f765l = i12;
        this.f766m = i13;
    }
}
