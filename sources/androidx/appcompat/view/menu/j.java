package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import java.lang.reflect.Method;

/* compiled from: MenuItemWrapperICS */
public class j extends c implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    private final a0.b f1250d;

    /* renamed from: e  reason: collision with root package name */
    private Method f1251e;

    /* compiled from: MenuItemWrapperICS */
    private class a extends androidx.core.view.b {

        /* renamed from: d  reason: collision with root package name */
        final ActionProvider f1252d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1252d = actionProvider;
        }

        public boolean a() {
            return this.f1252d.hasSubMenu();
        }

        public View c() {
            return this.f1252d.onCreateActionView();
        }

        public boolean e() {
            return this.f1252d.onPerformDefaultAction();
        }

        public void f(SubMenu subMenu) {
            this.f1252d.onPrepareSubMenu(j.this.d(subMenu));
        }
    }

    /* compiled from: MenuItemWrapperICS */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f  reason: collision with root package name */
        private b.C0047b f1254f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public boolean b() {
            return this.f1252d.isVisible();
        }

        public View d(MenuItem menuItem) {
            return this.f1252d.onCreateActionView(menuItem);
        }

        public boolean g() {
            return this.f1252d.overridesItemVisibility();
        }

        public void j(b.C0047b bVar) {
            this.f1254f = bVar;
            this.f1252d.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z10) {
            b.C0047b bVar = this.f1254f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    /* compiled from: MenuItemWrapperICS */
    static class c extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: a  reason: collision with root package name */
        final CollapsibleActionView f1256a;

        c(View view) {
            super(view.getContext());
            this.f1256a = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        public View a() {
            return (View) this.f1256a;
        }

        public void c() {
            this.f1256a.onActionViewExpanded();
        }

        public void f() {
            this.f1256a.onActionViewCollapsed();
        }
    }

    /* compiled from: MenuItemWrapperICS */
    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f1257a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1257a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1257a.onMenuItemActionCollapse(j.this.c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1257a.onMenuItemActionExpand(j.this.c(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f1259a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1259a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1259a.onMenuItemClick(j.this.c(menuItem));
        }
    }

    public j(Context context, a0.b bVar) {
        super(context);
        if (bVar != null) {
            this.f1250d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f1250d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f1250d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        androidx.core.view.b b10 = this.f1250d.b();
        if (b10 instanceof a) {
            return ((a) b10).f1252d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f1250d.getActionView();
        return actionView instanceof c ? ((c) actionView).a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f1250d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f1250d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f1250d.getContentDescription();
    }

    public int getGroupId() {
        return this.f1250d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f1250d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f1250d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1250d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f1250d.getIntent();
    }

    public int getItemId() {
        return this.f1250d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1250d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f1250d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f1250d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f1250d.getOrder();
    }

    public SubMenu getSubMenu() {
        return d(this.f1250d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f1250d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f1250d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f1250d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f1251e == null) {
                this.f1251e = this.f1250d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f1251e.invoke(this.f1250d, new Object[]{Boolean.valueOf(z10)});
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    public boolean hasSubMenu() {
        return this.f1250d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f1250d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f1250d.isCheckable();
    }

    public boolean isChecked() {
        return this.f1250d.isChecked();
    }

    public boolean isEnabled() {
        return this.f1250d.isEnabled();
    }

    public boolean isVisible() {
        return this.f1250d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        androidx.core.view.b bVar;
        if (Build.VERSION.SDK_INT >= 16) {
            bVar = new b(this.f1139a, actionProvider);
        } else {
            bVar = new a(this.f1139a, actionProvider);
        }
        a0.b bVar2 = this.f1250d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f1250d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        this.f1250d.setAlphabeticShortcut(c10);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        this.f1250d.setCheckable(z10);
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        this.f1250d.setChecked(z10);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1250d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        this.f1250d.setEnabled(z10);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1250d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1250d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1250d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1250d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        this.f1250d.setNumericShortcut(c10);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1250d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1250d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f1250d.setShortcut(c10, c11);
        return this;
    }

    public void setShowAsAction(int i10) {
        this.f1250d.setShowAsAction(i10);
    }

    public MenuItem setShowAsActionFlags(int i10) {
        this.f1250d.setShowAsActionFlags(i10);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1250d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1250d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1250d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        return this.f1250d.setVisible(z10);
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f1250d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f1250d.setIcon(i10);
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f1250d.setNumericShortcut(c10, i10);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1250d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    public MenuItem setTitle(int i10) {
        this.f1250d.setTitle(i10);
        return this;
    }

    public MenuItem setActionView(int i10) {
        this.f1250d.setActionView(i10);
        View actionView = this.f1250d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1250d.setActionView((View) new c(actionView));
        }
        return this;
    }
}
