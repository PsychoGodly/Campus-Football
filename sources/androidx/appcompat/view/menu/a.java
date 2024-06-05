package androidx.appcompat.view.menu;

import a0.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionMenuItem */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final int f1109a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1110b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1111c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f1112d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f1113e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f1114f;

    /* renamed from: g  reason: collision with root package name */
    private char f1115g;

    /* renamed from: h  reason: collision with root package name */
    private int f1116h = 4096;

    /* renamed from: i  reason: collision with root package name */
    private char f1117i;

    /* renamed from: j  reason: collision with root package name */
    private int f1118j = 4096;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f1119k;

    /* renamed from: l  reason: collision with root package name */
    private Context f1120l;

    /* renamed from: m  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f1121m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f1122n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f1123o;

    /* renamed from: p  reason: collision with root package name */
    private ColorStateList f1124p = null;

    /* renamed from: q  reason: collision with root package name */
    private PorterDuff.Mode f1125q = null;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1126r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1127s = false;

    /* renamed from: t  reason: collision with root package name */
    private int f1128t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f1120l = context;
        this.f1109a = i11;
        this.f1110b = i10;
        this.f1111c = i13;
        this.f1112d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f1119k;
        if (drawable == null) {
            return;
        }
        if (this.f1126r || this.f1127s) {
            Drawable r10 = androidx.core.graphics.drawable.a.r(drawable);
            this.f1119k = r10;
            Drawable mutate = r10.mutate();
            this.f1119k = mutate;
            if (this.f1126r) {
                androidx.core.graphics.drawable.a.o(mutate, this.f1124p);
            }
            if (this.f1127s) {
                androidx.core.graphics.drawable.a.p(this.f1119k, this.f1125q);
            }
        }
    }

    public b a(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    public androidx.core.view.b b() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f1118j;
    }

    public char getAlphabeticShortcut() {
        return this.f1117i;
    }

    public CharSequence getContentDescription() {
        return this.f1122n;
    }

    public int getGroupId() {
        return this.f1110b;
    }

    public Drawable getIcon() {
        return this.f1119k;
    }

    public ColorStateList getIconTintList() {
        return this.f1124p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1125q;
    }

    public Intent getIntent() {
        return this.f1114f;
    }

    public int getItemId() {
        return this.f1109a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f1116h;
    }

    public char getNumericShortcut() {
        return this.f1115g;
    }

    public int getOrder() {
        return this.f1111c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f1112d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1113e;
        return charSequence != null ? charSequence : this.f1112d;
    }

    public CharSequence getTooltipText() {
        return this.f1123o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f1128t & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f1128t & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f1128t & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f1128t & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        this.f1117i = Character.toLowerCase(c10);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        this.f1128t = z10 | (this.f1128t & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        this.f1128t = (z10 ? 2 : 0) | (this.f1128t & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        this.f1128t = (z10 ? 16 : 0) | (this.f1128t & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1119k = drawable;
        c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1124p = colorStateList;
        this.f1126r = true;
        c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1125q = mode;
        this.f1127s = true;
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1114f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        this.f1115g = c10;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1121m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f1115g = c10;
        this.f1117i = Character.toLowerCase(c11);
        return this;
    }

    public void setShowAsAction(int i10) {
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1112d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1113e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f1128t & 8;
        if (z10) {
            i10 = 0;
        }
        this.f1128t = i11 | i10;
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f1117i = Character.toLowerCase(c10);
        this.f1118j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public b setContentDescription(CharSequence charSequence) {
        this.f1122n = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f1115g = c10;
        this.f1116h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public MenuItem setTitle(int i10) {
        this.f1112d = this.f1120l.getResources().getString(i10);
        return this;
    }

    public b setTooltipText(CharSequence charSequence) {
        this.f1123o = charSequence;
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f1119k = androidx.core.content.a.getDrawable(this.f1120l, i10);
        c();
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1115g = c10;
        this.f1116h = KeyEvent.normalizeMetaState(i10);
        this.f1117i = Character.toLowerCase(c11);
        this.f1118j = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
