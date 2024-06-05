package t7;

import android.database.Cursor;
import java.util.List;
import u7.l;
import u7.u;
import y7.n;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class y1 implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f38533a;

    public /* synthetic */ y1(List list) {
        this.f38533a = list;
    }

    public final void accept(Object obj) {
        this.f38533a.add(l.g(u.p(((Cursor) obj).getString(0))));
    }
}
