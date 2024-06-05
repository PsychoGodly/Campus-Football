package t7;

import android.database.Cursor;
import java.util.ArrayList;
import y7.n;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class x1 implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f38527a;

    public /* synthetic */ x1(ArrayList arrayList) {
        this.f38527a = arrayList;
    }

    public final void accept(Object obj) {
        this.f38527a.add(f.b(((Cursor) obj).getString(0)));
    }
}
