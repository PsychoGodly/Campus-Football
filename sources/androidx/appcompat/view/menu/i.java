package androidx.appcompat.view.menu;

import a0.b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.core.view.b;
import com.applovin.mediation.MaxReward;
import h.h;

/* compiled from: MenuItemImpl */
public final class i implements b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private boolean D = false;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a  reason: collision with root package name */
    private final int f1223a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1224b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1225c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1226d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f1227e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f1228f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f1229g;

    /* renamed from: h  reason: collision with root package name */
    private char f1230h;

    /* renamed from: i  reason: collision with root package name */
    private int f1231i = 4096;

    /* renamed from: j  reason: collision with root package name */
    private char f1232j;

    /* renamed from: k  reason: collision with root package name */
    private int f1233k = 4096;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f1234l;

    /* renamed from: m  reason: collision with root package name */
    private int f1235m = 0;

    /* renamed from: n  reason: collision with root package name */
    g f1236n;

    /* renamed from: o  reason: collision with root package name */
    private r f1237o;

    /* renamed from: p  reason: collision with root package name */
    private Runnable f1238p;

    /* renamed from: q  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f1239q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f1240r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f1241s;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f1242t = null;

    /* renamed from: u  reason: collision with root package name */
    private PorterDuff.Mode f1243u = null;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1244v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1245w = false;

    /* renamed from: x  reason: collision with root package name */
    private boolean f1246x = false;

    /* renamed from: y  reason: collision with root package name */
    private int f1247y = 16;

    /* renamed from: z  reason: collision with root package name */
    private int f1248z = 0;

    /* compiled from: MenuItemImpl */
    class a implements b.C0047b {
        a() {
        }

        public void onActionProviderVisibilityChanged(boolean z10) {
            i iVar = i.this;
            iVar.f1236n.J(iVar);
        }
    }

    i(g gVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f1236n = gVar;
        this.f1223a = i11;
        this.f1224b = i10;
        this.f1225c = i12;
        this.f1226d = i13;
        this.f1227e = charSequence;
        this.f1248z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f1246x && (this.f1244v || this.f1245w)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (this.f1244v) {
                androidx.core.graphics.drawable.a.o(drawable, this.f1242t);
            }
            if (this.f1245w) {
                androidx.core.graphics.drawable.a.p(drawable, this.f1243u);
            }
            this.f1246x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f1236n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f1248z & 4) == 4;
    }

    public a0.b a(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f1236n.K(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    public androidx.core.view.b b() {
        return this.B;
    }

    public void c() {
        this.f1236n.I(this);
    }

    public boolean collapseActionView() {
        if ((this.f1248z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1236n.f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1236n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f1226d;
    }

    /* access modifiers changed from: package-private */
    public char g() {
        return this.f1236n.G() ? this.f1232j : this.f1230h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View d10 = bVar.d(this);
        this.A = d10;
        return d10;
    }

    public int getAlphabeticModifiers() {
        return this.f1233k;
    }

    public char getAlphabeticShortcut() {
        return this.f1232j;
    }

    public CharSequence getContentDescription() {
        return this.f1240r;
    }

    public int getGroupId() {
        return this.f1224b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f1234l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f1235m == 0) {
            return null;
        }
        Drawable b10 = i.a.b(this.f1236n.u(), this.f1235m);
        this.f1235m = 0;
        this.f1234l = b10;
        return e(b10);
    }

    public ColorStateList getIconTintList() {
        return this.f1242t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1243u;
    }

    public Intent getIntent() {
        return this.f1229g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1223a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    public int getNumericModifiers() {
        return this.f1231i;
    }

    public char getNumericShortcut() {
        return this.f1230h;
    }

    public int getOrder() {
        return this.f1225c;
    }

    public SubMenu getSubMenu() {
        return this.f1237o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1227e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1228f;
        if (charSequence == null) {
            charSequence = this.f1227e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f1241s;
    }

    /* access modifiers changed from: package-private */
    public String h() {
        char g10 = g();
        if (g10 == 0) {
            return MaxReward.DEFAULT_LABEL;
        }
        Resources resources = this.f1236n.u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f1236n.u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(h.f18297k));
        }
        int i10 = this.f1236n.G() ? this.f1233k : this.f1231i;
        d(sb2, i10, 65536, resources.getString(h.f18293g));
        d(sb2, i10, 4096, resources.getString(h.f18289c));
        d(sb2, i10, 2, resources.getString(h.f18288b));
        d(sb2, i10, 1, resources.getString(h.f18294h));
        d(sb2, i10, 4, resources.getString(h.f18296j));
        d(sb2, i10, 8, resources.getString(h.f18292f));
        if (g10 == 8) {
            sb2.append(resources.getString(h.f18290d));
        } else if (g10 == 10) {
            sb2.append(resources.getString(h.f18291e));
        } else if (g10 != ' ') {
            sb2.append(g10);
        } else {
            sb2.append(resources.getString(h.f18295i));
        }
        return sb2.toString();
    }

    public boolean hasSubMenu() {
        return this.f1237o != null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence i(n.a aVar) {
        if (aVar == null || !aVar.d()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.D;
    }

    public boolean isCheckable() {
        return (this.f1247y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f1247y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f1247y & 16) != 0;
    }

    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        if (bVar == null || !bVar.g()) {
            if ((this.f1247y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f1247y & 8) != 0 || !this.B.b()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f1248z & 8) == 0) {
            return false;
        }
        if (this.A == null && (bVar = this.B) != null) {
            this.A = bVar.d(this);
        }
        if (this.A != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1239q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.f1236n;
        if (gVar.h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f1238p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1229g != null) {
            try {
                this.f1236n.u().startActivity(this.f1229g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null || !bVar.e()) {
            return false;
        }
        return true;
    }

    public boolean l() {
        return (this.f1247y & 32) == 32;
    }

    public boolean m() {
        return (this.f1247y & 4) != 0;
    }

    public boolean n() {
        return (this.f1248z & 1) == 1;
    }

    public boolean o() {
        return (this.f1248z & 2) == 2;
    }

    /* renamed from: p */
    public a0.b setActionView(int i10) {
        Context u10 = this.f1236n.u();
        setActionView(LayoutInflater.from(u10).inflate(i10, new LinearLayout(u10), false));
        return this;
    }

    /* renamed from: q */
    public a0.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f1223a) > 0) {
            view.setId(i10);
        }
        this.f1236n.I(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f1236n.K(false);
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z10) {
        int i10 = this.f1247y;
        int i11 = (z10 ? 2 : 0) | (i10 & -3);
        this.f1247y = i11;
        if (i10 != i11) {
            this.f1236n.K(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f1232j == c10) {
            return this;
        }
        this.f1232j = Character.toLowerCase(c10);
        this.f1236n.K(false);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f1247y;
        boolean z11 = z10 | (i10 & true);
        this.f1247y = z11 ? 1 : 0;
        if (i10 != z11) {
            this.f1236n.K(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        if ((this.f1247y & 4) != 0) {
            this.f1236n.T(this);
        } else {
            s(z10);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f1247y |= 16;
        } else {
            this.f1247y &= -17;
        }
        this.f1236n.K(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1235m = 0;
        this.f1234l = drawable;
        this.f1246x = true;
        this.f1236n.K(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1242t = colorStateList;
        this.f1244v = true;
        this.f1246x = true;
        this.f1236n.K(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1243u = mode;
        this.f1245w = true;
        this.f1246x = true;
        this.f1236n.K(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1229g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        if (this.f1230h == c10) {
            return this;
        }
        this.f1230h = c10;
        this.f1236n.K(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1239q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f1230h = c10;
        this.f1232j = Character.toLowerCase(c11);
        this.f1236n.K(false);
        return this;
    }

    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            this.f1248z = i10;
            this.f1236n.I(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1227e = charSequence;
        this.f1236n.K(false);
        r rVar = this.f1237o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1228f = charSequence;
        this.f1236n.K(false);
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f1236n.J(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f1247y = (z10 ? 4 : 0) | (this.f1247y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f1227e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f1247y |= 32;
        } else {
            this.f1247y &= -33;
        }
    }

    /* access modifiers changed from: package-private */
    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    /* renamed from: w */
    public a0.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(r rVar) {
        this.f1237o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    public boolean y(boolean z10) {
        int i10 = this.f1247y;
        int i11 = (z10 ? 0 : 8) | (i10 & -9);
        this.f1247y = i11;
        if (i10 != i11) {
            return true;
        }
        return false;
    }

    public boolean z() {
        return this.f1236n.A();
    }

    public a0.b setContentDescription(CharSequence charSequence) {
        this.f1240r = charSequence;
        this.f1236n.K(false);
        return this;
    }

    public a0.b setTooltipText(CharSequence charSequence) {
        this.f1241s = charSequence;
        this.f1236n.K(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f1232j == c10 && this.f1233k == i10) {
            return this;
        }
        this.f1232j = Character.toLowerCase(c10);
        this.f1233k = KeyEvent.normalizeMetaState(i10);
        this.f1236n.K(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f1230h == c10 && this.f1231i == i10) {
            return this;
        }
        this.f1230h = c10;
        this.f1231i = KeyEvent.normalizeMetaState(i10);
        this.f1236n.K(false);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1230h = c10;
        this.f1231i = KeyEvent.normalizeMetaState(i10);
        this.f1232j = Character.toLowerCase(c11);
        this.f1233k = KeyEvent.normalizeMetaState(i11);
        this.f1236n.K(false);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f1234l = null;
        this.f1235m = i10;
        this.f1246x = true;
        this.f1236n.K(false);
        return this;
    }

    public MenuItem setTitle(int i10) {
        return setTitle((CharSequence) this.f1236n.u().getString(i10));
    }
}
