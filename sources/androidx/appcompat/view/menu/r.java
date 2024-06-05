package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.g;

/* compiled from: SubMenuBuilder */
public class r extends g implements SubMenu {
    private g B;
    private i C;

    public r(Context context, g gVar, i iVar) {
        super(context);
        this.B = gVar;
        this.C = iVar;
    }

    public g D() {
        return this.B.D();
    }

    public boolean F() {
        return this.B.F();
    }

    public boolean G() {
        return this.B.G();
    }

    public boolean H() {
        return this.B.H();
    }

    public void R(g.a aVar) {
        this.B.R(aVar);
    }

    public boolean f(i iVar) {
        return this.B.f(iVar);
    }

    public Menu f0() {
        return this.B;
    }

    public MenuItem getItem() {
        return this.C;
    }

    /* access modifiers changed from: package-private */
    public boolean h(g gVar, MenuItem menuItem) {
        return super.h(gVar, menuItem) || this.B.h(gVar, menuItem);
    }

    public boolean k(i iVar) {
        return this.B.k(iVar);
    }

    public void setGroupDividerEnabled(boolean z10) {
        this.B.setGroupDividerEnabled(z10);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.V(drawable);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.Y(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.Z(view);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z10) {
        this.B.setQwertyMode(z10);
    }

    public String t() {
        i iVar = this.C;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.t() + ":" + itemId;
    }

    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.U(i10);
    }

    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.X(i10);
    }

    public SubMenu setIcon(int i10) {
        this.C.setIcon(i10);
        return this;
    }
}
