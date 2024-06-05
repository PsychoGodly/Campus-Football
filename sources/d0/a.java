package d0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import d0.b;

/* compiled from: CursorAdapter */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f17619a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f17620b;

    /* renamed from: c  reason: collision with root package name */
    protected Cursor f17621c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f17622d;

    /* renamed from: f  reason: collision with root package name */
    protected int f17623f;

    /* renamed from: g  reason: collision with root package name */
    protected C0175a f17624g;

    /* renamed from: h  reason: collision with root package name */
    protected DataSetObserver f17625h;

    /* renamed from: i  reason: collision with root package name */
    protected b f17626i;

    /* renamed from: d0.a$a  reason: collision with other inner class name */
    /* compiled from: CursorAdapter */
    private class C0175a extends ContentObserver {
        C0175a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z10) {
            a.this.i();
        }
    }

    /* compiled from: CursorAdapter */
    private class b extends DataSetObserver {
        b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f17619a = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f17619a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j10 = j(cursor);
        if (j10 != null) {
            j10.close();
        }
    }

    public Cursor b() {
        return this.f17621c;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    public void f(Context context, Cursor cursor, int i10) {
        boolean z10 = false;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f17620b = true;
        } else {
            this.f17620b = false;
        }
        if (cursor != null) {
            z10 = true;
        }
        this.f17621c = cursor;
        this.f17619a = z10;
        this.f17622d = context;
        this.f17623f = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f17624g = new C0175a();
            this.f17625h = new b();
        } else {
            this.f17624g = null;
            this.f17625h = null;
        }
        if (z10) {
            C0175a aVar = this.f17624g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f17625h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f17619a || (cursor = this.f17621c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f17619a) {
            return null;
        }
        this.f17621c.moveToPosition(i10);
        if (view == null) {
            view = g(this.f17622d, this.f17621c, viewGroup);
        }
        e(view, this.f17622d, this.f17621c);
        return view;
    }

    public Filter getFilter() {
        if (this.f17626i == null) {
            this.f17626i = new b(this);
        }
        return this.f17626i;
    }

    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f17619a || (cursor = this.f17621c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f17621c;
    }

    public long getItemId(int i10) {
        Cursor cursor;
        if (!this.f17619a || (cursor = this.f17621c) == null || !cursor.moveToPosition(i10)) {
            return 0;
        }
        return this.f17621c.getLong(this.f17623f);
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f17619a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f17621c.moveToPosition(i10)) {
            if (view == null) {
                view = h(this.f17622d, this.f17621c, viewGroup);
            }
            e(view, this.f17622d, this.f17621c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i10);
        }
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public void i() {
        Cursor cursor;
        if (this.f17620b && (cursor = this.f17621c) != null && !cursor.isClosed()) {
            this.f17619a = this.f17621c.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f17621c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0175a aVar = this.f17624g;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f17625h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f17621c = cursor;
        if (cursor != null) {
            C0175a aVar2 = this.f17624g;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f17625h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f17623f = cursor.getColumnIndexOrThrow("_id");
            this.f17619a = true;
            notifyDataSetChanged();
        } else {
            this.f17623f = -1;
            this.f17619a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
