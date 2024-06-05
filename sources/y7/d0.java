package y7;

import java.util.Comparator;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d0 implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Comparator f39389a;

    public /* synthetic */ d0(Comparator comparator) {
        this.f39389a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f39389a.compare(((Map.Entry) obj).getValue(), ((Map.Entry) obj2).getValue());
    }
}
