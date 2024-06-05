package m3;

import f3.a;
import n2.e2;
import n2.r1;

/* compiled from: SpliceCommand */
public abstract class b implements a.b {
    public /* synthetic */ r1 F() {
        return f3.b.b(this);
    }

    public /* synthetic */ void M(e2.b bVar) {
        f3.b.c(this, bVar);
    }

    public /* synthetic */ byte[] a0() {
        return f3.b.a(this);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
