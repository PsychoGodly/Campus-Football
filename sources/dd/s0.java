package dd;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import dd.a1;
import dd.r0;
import java.util.Map;
import r6.i;

/* compiled from: LoadBalancerProvider */
public abstract class s0 extends r0.c {

    /* renamed from: a  reason: collision with root package name */
    private static final a1.c f32358a = a1.c.a(new a());

    /* compiled from: LoadBalancerProvider */
    private static final class a {
        a() {
        }

        public String toString() {
            return "service config is unused";
        }
    }

    public abstract String b();

    public abstract int c();

    public abstract boolean d();

    public a1.c e(Map<String, ?> map) {
        return f32358a;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return i.c(this).d("policy", b()).b(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, c()).e("available", d()).toString();
    }
}
