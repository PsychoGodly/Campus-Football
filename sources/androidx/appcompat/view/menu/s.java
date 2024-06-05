package androidx.appcompat.view.menu;

import a0.c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: SubMenuWrapperICS */
class s extends o implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    private final c f1299e;

    s(Context context, c cVar) {
        super(context, cVar);
        this.f1299e = cVar;
    }

    public void clearHeader() {
        this.f1299e.clearHeader();
    }

    public MenuItem getItem() {
        return c(this.f1299e.getItem());
    }

    public SubMenu setHeaderIcon(int i10) {
        this.f1299e.setHeaderIcon(i10);
        return this;
    }

    public SubMenu setHeaderTitle(int i10) {
        this.f1299e.setHeaderTitle(i10);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f1299e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i10) {
        this.f1299e.setIcon(i10);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f1299e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1299e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1299e.setIcon(drawable);
        return this;
    }
}
