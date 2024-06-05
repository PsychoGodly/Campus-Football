package t7;

import android.database.Cursor;
import java.util.Map;
import u7.l;
import u7.q;
import u7.w;
import y7.n;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class z1 implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f38537a;

    public /* synthetic */ z1(Map map) {
        this.f38537a = map;
    }

    public final void accept(Object obj) {
        this.f38537a.put(Integer.valueOf(((Cursor) obj).getInt(0)), q.b.b(((Cursor) obj).getLong(1), new w(new y6.q(((Cursor) obj).getLong(2), ((Cursor) obj).getInt(3))), l.g(f.b(((Cursor) obj).getString(4))), ((Cursor) obj).getInt(5)));
    }
}
