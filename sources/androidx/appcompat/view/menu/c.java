package androidx.appcompat.view.menu;

import a0.b;
import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.g;

/* compiled from: BaseMenuWrapper */
abstract class c {

    /* renamed from: a  reason: collision with root package name */
    final Context f1139a;

    /* renamed from: b  reason: collision with root package name */
    private g<b, MenuItem> f1140b;

    /* renamed from: c  reason: collision with root package name */
    private g<a0.c, SubMenu> f1141c;

    c(Context context) {
        this.f1139a = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.f1140b == null) {
            this.f1140b = new g<>();
        }
        MenuItem menuItem2 = this.f1140b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.f1139a, bVar);
        this.f1140b.put(bVar, jVar);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof a0.c)) {
            return subMenu;
        }
        a0.c cVar = (a0.c) subMenu;
        if (this.f1141c == null) {
            this.f1141c = new g<>();
        }
        SubMenu subMenu2 = this.f1141c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.f1139a, cVar);
        this.f1141c.put(cVar, sVar);
        return sVar;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        g<b, MenuItem> gVar = this.f1140b;
        if (gVar != null) {
            gVar.clear();
        }
        g<a0.c, SubMenu> gVar2 = this.f1141c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(int i10) {
        if (this.f1140b != null) {
            int i11 = 0;
            while (i11 < this.f1140b.size()) {
                if (this.f1140b.j(i11).getGroupId() == i10) {
                    this.f1140b.l(i11);
                    i11--;
                }
                i11++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(int i10) {
        if (this.f1140b != null) {
            for (int i11 = 0; i11 < this.f1140b.size(); i11++) {
                if (this.f1140b.j(i11).getItemId() == i10) {
                    this.f1140b.l(i11);
                    return;
                }
            }
        }
    }
}
