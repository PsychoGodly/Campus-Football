package d0;

import android.database.Cursor;
import android.widget.Filter;

/* compiled from: CursorFilter */
class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    a f17629a;

    /* compiled from: CursorFilter */
    interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence c(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    b(a aVar) {
        this.f17629a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f17629a.c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d10 = this.f17629a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d10 != null) {
            filterResults.count = d10.getCount();
            filterResults.values = d10;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b10 = this.f17629a.b();
        Object obj = filterResults.values;
        if (obj != null && obj != b10) {
            this.f17629a.a((Cursor) obj);
        }
    }
}
