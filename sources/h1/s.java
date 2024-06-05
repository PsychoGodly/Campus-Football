package h1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f18697a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f18698b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<m> f18699c = new ArrayList<>();

    @Deprecated
    public s() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f18698b == sVar.f18698b && this.f18697a.equals(sVar.f18697a);
    }

    public int hashCode() {
        return (this.f18698b.hashCode() * 31) + this.f18697a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f18698b + "\n") + "    values:";
        for (String next : this.f18697a.keySet()) {
            str = str + "    " + next + ": " + this.f18697a.get(next) + "\n";
        }
        return str;
    }

    public s(View view) {
        this.f18698b = view;
    }
}
