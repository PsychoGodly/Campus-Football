package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.c0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuBuilder */
public class g implements a0.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    private final Context f1193a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f1194b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1195c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1196d;

    /* renamed from: e  reason: collision with root package name */
    private a f1197e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<i> f1198f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<i> f1199g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1200h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<i> f1201i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<i> f1202j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1203k;

    /* renamed from: l  reason: collision with root package name */
    private int f1204l = 0;

    /* renamed from: m  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f1205m;

    /* renamed from: n  reason: collision with root package name */
    CharSequence f1206n;

    /* renamed from: o  reason: collision with root package name */
    Drawable f1207o;

    /* renamed from: p  reason: collision with root package name */
    View f1208p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1209q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1210r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1211s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1212t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1213u = false;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<i> f1214v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<m>> f1215w = new CopyOnWriteArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    private i f1216x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f1217y = false;

    /* renamed from: z  reason: collision with root package name */
    private boolean f1218z;

    /* compiled from: MenuBuilder */
    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    /* compiled from: MenuBuilder */
    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
        this.f1193a = context;
        this.f1194b = context.getResources();
        this.f1198f = new ArrayList<>();
        this.f1199g = new ArrayList<>();
        this.f1200h = true;
        this.f1201i = new ArrayList<>();
        this.f1202j = new ArrayList<>();
        this.f1203k = true;
        c0(true);
    }

    private static int B(int i10) {
        int i11 = (-65536 & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f1198f.size()) {
            this.f1198f.remove(i10);
            if (z10) {
                K(true);
            }
        }
    }

    private void W(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources C = C();
        if (view != null) {
            this.f1208p = view;
            this.f1206n = null;
            this.f1207o = null;
        } else {
            if (i10 > 0) {
                this.f1206n = C.getText(i10);
            } else if (charSequence != null) {
                this.f1206n = charSequence;
            }
            if (i11 > 0) {
                this.f1207o = androidx.core.content.a.getDrawable(u(), i11);
            } else if (drawable != null) {
                this.f1207o = drawable;
            }
            this.f1208p = null;
        }
        K(false);
    }

    private void c0(boolean z10) {
        boolean z11 = true;
        if (!z10 || this.f1194b.getConfiguration().keyboard == 1 || !c0.e(ViewConfiguration.get(this.f1193a), this.f1193a)) {
            z11 = false;
        }
        this.f1196d = z11;
    }

    private i g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new i(this, i10, i11, i12, i13, charSequence, i14);
    }

    private void i(boolean z10) {
        if (!this.f1215w.isEmpty()) {
            e0();
            Iterator<WeakReference<m>> it = this.f1215w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.f1215w.remove(next);
                } else {
                    mVar.c(z10);
                }
            }
            d0();
        }
    }

    private boolean j(r rVar, m mVar) {
        boolean z10 = false;
        if (this.f1215w.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z10 = mVar.j(rVar);
        }
        Iterator<WeakReference<m>> it = this.f1215w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            m mVar2 = (m) next.get();
            if (mVar2 == null) {
                this.f1215w.remove(next);
            } else if (!z10) {
                z10 = mVar2.j(rVar);
            }
        }
        return z10;
    }

    private static int n(ArrayList<i> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f1212t;
    }

    /* access modifiers changed from: package-private */
    public Resources C() {
        return this.f1194b;
    }

    public g D() {
        return this;
    }

    public ArrayList<i> E() {
        if (!this.f1200h) {
            return this.f1199g;
        }
        this.f1199g.clear();
        int size = this.f1198f.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = this.f1198f.get(i10);
            if (iVar.isVisible()) {
                this.f1199g.add(iVar);
            }
        }
        this.f1200h = false;
        this.f1203k = true;
        return this.f1199g;
    }

    public boolean F() {
        return this.f1217y;
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return this.f1195c;
    }

    public boolean H() {
        return this.f1196d;
    }

    /* access modifiers changed from: package-private */
    public void I(i iVar) {
        this.f1203k = true;
        K(true);
    }

    /* access modifiers changed from: package-private */
    public void J(i iVar) {
        this.f1200h = true;
        K(true);
    }

    public void K(boolean z10) {
        if (!this.f1209q) {
            if (z10) {
                this.f1200h = true;
                this.f1203k = true;
            }
            i(z10);
            return;
        }
        this.f1210r = true;
        if (z10) {
            this.f1211s = true;
        }
    }

    public boolean L(MenuItem menuItem, int i10) {
        return M(menuItem, (m) null, i10);
    }

    public boolean M(MenuItem menuItem, m mVar, int i10) {
        i iVar = (i) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        boolean k10 = iVar.k();
        androidx.core.view.b b10 = iVar.b();
        boolean z10 = b10 != null && b10.a();
        if (iVar.j()) {
            k10 |= iVar.expandActionView();
            if (k10) {
                e(true);
            }
        } else if (iVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                e(false);
            }
            if (!iVar.hasSubMenu()) {
                iVar.x(new r(u(), this, iVar));
            }
            r rVar = (r) iVar.getSubMenu();
            if (z10) {
                b10.f(rVar);
            }
            k10 |= j(rVar, mVar);
            if (!k10) {
                e(true);
            }
        } else if ((i10 & 1) == 0) {
            e(true);
        }
        return k10;
    }

    public void O(m mVar) {
        Iterator<WeakReference<m>> it = this.f1215w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            m mVar2 = (m) next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f1215w.remove(next);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(t());
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = getItem(i10);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((r) item.getSubMenu()).P(bundle);
                }
            }
            int i11 = bundle.getInt("android:menu:expandedactionview");
            if (i11 > 0 && (findItem = findItem(i11)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f1197e = aVar;
    }

    public g S(int i10) {
        this.f1204l = i10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1198f.size();
        e0();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = this.f1198f.get(i10);
            if (iVar.getGroupId() == groupId && iVar.m() && iVar.isCheckable()) {
                iVar.s(iVar == menuItem);
            }
        }
        d0();
    }

    /* access modifiers changed from: protected */
    public g U(int i10) {
        W(0, (CharSequence) null, i10, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g V(Drawable drawable) {
        W(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g X(int i10) {
        W(i10, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g Y(CharSequence charSequence) {
        W(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g Z(View view) {
        W(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int B = B(i12);
        i g10 = g(i10, i11, i12, B, charSequence, this.f1204l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1205m;
        if (contextMenuInfo != null) {
            g10.v(contextMenuInfo);
        }
        ArrayList<i> arrayList = this.f1198f;
        arrayList.add(n(arrayList, B), g10);
        K(true);
        return g10;
    }

    public void a0(boolean z10) {
        this.f1212t = z10;
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f1193a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(m mVar) {
        c(mVar, this.f1193a);
    }

    public void b0(boolean z10) {
        this.f1218z = z10;
    }

    public void c(m mVar, Context context) {
        this.f1215w.add(new WeakReference(mVar));
        mVar.h(context, this);
        this.f1203k = true;
    }

    public void clear() {
        i iVar = this.f1216x;
        if (iVar != null) {
            f(iVar);
        }
        this.f1198f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f1207o = null;
        this.f1206n = null;
        this.f1208p = null;
        K(false);
    }

    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f1197e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        this.f1209q = false;
        if (this.f1210r) {
            this.f1210r = false;
            K(this.f1211s);
        }
    }

    public final void e(boolean z10) {
        if (!this.f1213u) {
            this.f1213u = true;
            Iterator<WeakReference<m>> it = this.f1215w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.f1215w.remove(next);
                } else {
                    mVar.a(this, z10);
                }
            }
            this.f1213u = false;
        }
    }

    public void e0() {
        if (!this.f1209q) {
            this.f1209q = true;
            this.f1210r = false;
            this.f1211s = false;
        }
    }

    public boolean f(i iVar) {
        boolean z10 = false;
        if (!this.f1215w.isEmpty() && this.f1216x == iVar) {
            e0();
            Iterator<WeakReference<m>> it = this.f1215w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.f1215w.remove(next);
                } else {
                    z10 = mVar.e(this, iVar);
                    if (z10) {
                        break;
                    }
                }
            }
            d0();
            if (z10) {
                this.f1216x = null;
            }
        }
        return z10;
    }

    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = this.f1198f.get(i11);
            if (iVar.getItemId() == i10) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public MenuItem getItem(int i10) {
        return this.f1198f.get(i10);
    }

    /* access modifiers changed from: package-private */
    public boolean h(g gVar, MenuItem menuItem) {
        a aVar = this.f1197e;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    public boolean hasVisibleItems() {
        if (this.f1218z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f1198f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return p(i10, keyEvent) != null;
    }

    public boolean k(i iVar) {
        boolean z10 = false;
        if (this.f1215w.isEmpty()) {
            return false;
        }
        e0();
        Iterator<WeakReference<m>> it = this.f1215w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            m mVar = (m) next.get();
            if (mVar == null) {
                this.f1215w.remove(next);
            } else {
                z10 = mVar.f(this, iVar);
                if (z10) {
                    break;
                }
            }
        }
        d0();
        if (z10) {
            this.f1216x = iVar;
        }
        return z10;
    }

    public int l(int i10) {
        return m(i10, 0);
    }

    public int m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f1198f.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public int o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f1198f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public i p(int i10, KeyEvent keyEvent) {
        char c10;
        ArrayList<i> arrayList = this.f1214v;
        arrayList.clear();
        q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean G = G();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = arrayList.get(i11);
            if (G) {
                c10 = iVar.getAlphabeticShortcut();
            } else {
                c10 = iVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (G && c10 == 8 && i10 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i10, int i11) {
        return L(findItem(i10), i11);
    }

    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        i p10 = p(i10, keyEvent);
        boolean L = p10 != null ? L(p10, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return L;
    }

    /* access modifiers changed from: package-private */
    public void q(List<i> list, int i10, KeyEvent keyEvent) {
        boolean G = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f1198f.size();
            for (int i11 = 0; i11 < size; i11++) {
                i iVar = this.f1198f.get(i11);
                if (iVar.hasSubMenu()) {
                    ((g) iVar.getSubMenu()).q(list, i10, keyEvent);
                }
                char alphabeticShortcut = G ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == 8 && i10 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<i> E = E();
        if (this.f1203k) {
            Iterator<WeakReference<m>> it = this.f1215w.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.f1215w.remove(next);
                } else {
                    z10 |= mVar.d();
                }
            }
            if (z10) {
                this.f1201i.clear();
                this.f1202j.clear();
                int size = E.size();
                for (int i10 = 0; i10 < size; i10++) {
                    i iVar = E.get(i10);
                    if (iVar.l()) {
                        this.f1201i.add(iVar);
                    } else {
                        this.f1202j.add(iVar);
                    }
                }
            } else {
                this.f1201i.clear();
                this.f1202j.clear();
                this.f1202j.addAll(E());
            }
            this.f1203k = false;
        }
    }

    public void removeGroup(int i10) {
        int l10 = l(i10);
        if (l10 >= 0) {
            int size = this.f1198f.size() - l10;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f1198f.get(l10).getGroupId() != i10) {
                    K(true);
                } else {
                    N(l10, false);
                    i11 = i12;
                }
            }
            K(true);
        }
    }

    public void removeItem(int i10) {
        N(o(i10), true);
    }

    public ArrayList<i> s() {
        r();
        return this.f1201i;
    }

    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f1198f.size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = this.f1198f.get(i11);
            if (iVar.getGroupId() == i10) {
                iVar.t(z11);
                iVar.setCheckable(z10);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z10) {
        this.f1217y = z10;
    }

    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f1198f.size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = this.f1198f.get(i11);
            if (iVar.getGroupId() == i10) {
                iVar.setEnabled(z10);
            }
        }
    }

    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f1198f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = this.f1198f.get(i11);
            if (iVar.getGroupId() == i10 && iVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            K(true);
        }
    }

    public void setQwertyMode(boolean z10) {
        this.f1195c = z10;
        K(false);
    }

    public int size() {
        return this.f1198f.size();
    }

    /* access modifiers changed from: protected */
    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f1193a;
    }

    public i v() {
        return this.f1216x;
    }

    public Drawable w() {
        return this.f1207o;
    }

    public CharSequence x() {
        return this.f1206n;
    }

    public View y() {
        return this.f1208p;
    }

    public ArrayList<i> z() {
        r();
        return this.f1202j;
    }

    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f1194b.getString(i10));
    }

    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f1194b.getString(i10));
    }

    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        i iVar = (i) a(i10, i11, i12, charSequence);
        r rVar = new r(this.f1193a, this, iVar);
        iVar.x(rVar);
        return rVar;
    }

    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f1194b.getString(i13));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, (CharSequence) this.f1194b.getString(i13));
    }
}
