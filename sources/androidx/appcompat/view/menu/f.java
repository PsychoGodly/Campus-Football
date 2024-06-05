package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* compiled from: MenuAdapter */
public class f extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    g f1187a;

    /* renamed from: b  reason: collision with root package name */
    private int f1188b = -1;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1189c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f1190d;

    /* renamed from: f  reason: collision with root package name */
    private final LayoutInflater f1191f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1192g;

    public f(g gVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f1190d = z10;
        this.f1191f = layoutInflater;
        this.f1187a = gVar;
        this.f1192g = i10;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        i v10 = this.f1187a.v();
        if (v10 != null) {
            ArrayList<i> z10 = this.f1187a.z();
            int size = z10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (z10.get(i10) == v10) {
                    this.f1188b = i10;
                    return;
                }
            }
        }
        this.f1188b = -1;
    }

    public g b() {
        return this.f1187a;
    }

    /* renamed from: c */
    public i getItem(int i10) {
        ArrayList<i> z10 = this.f1190d ? this.f1187a.z() : this.f1187a.E();
        int i11 = this.f1188b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return z10.get(i10);
    }

    public void d(boolean z10) {
        this.f1189c = z10;
    }

    public int getCount() {
        ArrayList<i> z10 = this.f1190d ? this.f1187a.z() : this.f1187a.E();
        if (this.f1188b < 0) {
            return z10.size();
        }
        return z10.size() - 1;
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1191f.inflate(this.f1192g, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1187a.F() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f1189c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i10), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
