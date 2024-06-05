package d0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ResourceCursorAdapter */
public abstract class c extends a {

    /* renamed from: j  reason: collision with root package name */
    private int f17630j;

    /* renamed from: k  reason: collision with root package name */
    private int f17631k;

    /* renamed from: l  reason: collision with root package name */
    private LayoutInflater f17632l;

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f17631k = i10;
        this.f17630j = i10;
        this.f17632l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f17632l.inflate(this.f17631k, viewGroup, false);
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f17632l.inflate(this.f17630j, viewGroup, false);
    }
}
