package h1;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18 */
class l0 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f18650a;

    l0(View view) {
        this.f18650a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof l0) && ((l0) obj).f18650a.equals(this.f18650a);
    }

    public int hashCode() {
        return this.f18650a.hashCode();
    }
}
