package h8;

import com.google.android.gms.common.internal.p;

/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private String f28942a;

    public b(String str) {
        this.f28942a = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return p.a(this.f28942a, ((b) obj).f28942a);
    }

    public int hashCode() {
        return p.b(this.f28942a);
    }

    public String toString() {
        return p.c(this).a("token", this.f28942a).toString();
    }
}
