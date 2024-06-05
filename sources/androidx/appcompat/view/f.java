package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.collection.g;
import java.util.ArrayList;

/* compiled from: SupportActionModeWrapper */
public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f1026a;

    /* renamed from: b  reason: collision with root package name */
    final b f1027b;

    /* compiled from: SupportActionModeWrapper */
    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f1028a;

        /* renamed from: b  reason: collision with root package name */
        final Context f1029b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f> f1030c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        final g<Menu, Menu> f1031d = new g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f1029b = context;
            this.f1028a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f1031d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.f1029b, (a0.a) menu);
            this.f1031d.put(menu, oVar);
            return oVar;
        }

        public void a(b bVar) {
            this.f1028a.onDestroyActionMode(e(bVar));
        }

        public boolean b(b bVar, Menu menu) {
            return this.f1028a.onCreateActionMode(e(bVar), f(menu));
        }

        public boolean c(b bVar, Menu menu) {
            return this.f1028a.onPrepareActionMode(e(bVar), f(menu));
        }

        public boolean d(b bVar, MenuItem menuItem) {
            return this.f1028a.onActionItemClicked(e(bVar), new j(this.f1029b, (a0.b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f1030c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f1030c.get(i10);
                if (fVar != null && fVar.f1027b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f1029b, bVar);
            this.f1030c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f1026a = context;
        this.f1027b = bVar;
    }

    public void finish() {
        this.f1027b.c();
    }

    public View getCustomView() {
        return this.f1027b.d();
    }

    public Menu getMenu() {
        return new o(this.f1026a, (a0.a) this.f1027b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.f1027b.f();
    }

    public CharSequence getSubtitle() {
        return this.f1027b.g();
    }

    public Object getTag() {
        return this.f1027b.h();
    }

    public CharSequence getTitle() {
        return this.f1027b.i();
    }

    public boolean getTitleOptionalHint() {
        return this.f1027b.j();
    }

    public void invalidate() {
        this.f1027b.k();
    }

    public boolean isTitleOptional() {
        return this.f1027b.l();
    }

    public void setCustomView(View view) {
        this.f1027b.m(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1027b.o(charSequence);
    }

    public void setTag(Object obj) {
        this.f1027b.p(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1027b.r(charSequence);
    }

    public void setTitleOptionalHint(boolean z10) {
        this.f1027b.s(z10);
    }

    public void setSubtitle(int i10) {
        this.f1027b.n(i10);
    }

    public void setTitle(int i10) {
        this.f1027b.q(i10);
    }
}
