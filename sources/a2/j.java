package a2;

import com.google.auto.value.AutoValue;
import java.util.List;
import k7.a;
import m7.d;

@AutoValue
/* compiled from: BatchedLogRequest */
public abstract class j {
    public static j a(List<m> list) {
        return new d(list);
    }

    public static a b() {
        return new d().j(b.f31a).k(true).i();
    }

    public abstract List<m> c();
}
