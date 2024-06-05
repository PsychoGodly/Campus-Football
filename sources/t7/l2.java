package t7;

import android.database.Cursor;
import java.util.List;
import y7.n;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l2 implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f38450a;

    public /* synthetic */ l2(List list) {
        this.f38450a = list;
    }

    public final void accept(Object obj) {
        this.f38450a.add(((Cursor) obj).getString(0));
    }
}
