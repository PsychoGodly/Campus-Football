package t7;

import android.database.Cursor;
import java.util.Set;
import y7.n;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class v2 implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Set f38518a;

    public /* synthetic */ v2(Set set) {
        this.f38518a = set;
    }

    public final void accept(Object obj) {
        this.f38518a.add(((Cursor) obj).getString(0));
    }
}
