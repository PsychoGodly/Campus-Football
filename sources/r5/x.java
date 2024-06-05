package r5;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final /* synthetic */ class x implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ x f29785a = new x();

    private /* synthetic */ x() {
    }

    public final int compare(Object obj, Object obj2) {
        return (((Long) obj).longValue() > ((Long) obj2).longValue() ? 1 : (((Long) obj).longValue() == ((Long) obj2).longValue() ? 0 : -1));
    }
}
