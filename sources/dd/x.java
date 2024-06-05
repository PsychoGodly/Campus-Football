package dd;

import com.unity3d.services.UnityAdsConstants;
import dd.a;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r6.o;

/* compiled from: EquivalentAddressGroup */
public final class x {

    /* renamed from: d  reason: collision with root package name */
    public static final a.c<String> f32377d = a.c.a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: a  reason: collision with root package name */
    private final List<SocketAddress> f32378a;

    /* renamed from: b  reason: collision with root package name */
    private final a f32379b;

    /* renamed from: c  reason: collision with root package name */
    private final int f32380c;

    public x(List<SocketAddress> list) {
        this(list, a.f32108c);
    }

    public List<SocketAddress> a() {
        return this.f32378a;
    }

    public a b() {
        return this.f32379b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f32378a.size() != xVar.f32378a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f32378a.size(); i10++) {
            if (!this.f32378a.get(i10).equals(xVar.f32378a.get(i10))) {
                return false;
            }
        }
        if (!this.f32379b.equals(xVar.f32379b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f32380c;
    }

    public String toString() {
        return "[" + this.f32378a + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + this.f32379b + "]";
    }

    public x(List<SocketAddress> list, a aVar) {
        o.e(!list.isEmpty(), "addrs is empty");
        List<SocketAddress> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f32378a = unmodifiableList;
        this.f32379b = (a) o.p(aVar, "attrs");
        this.f32380c = unmodifiableList.hashCode();
    }

    public x(SocketAddress socketAddress) {
        this(socketAddress, a.f32108c);
    }

    public x(SocketAddress socketAddress, a aVar) {
        this((List<SocketAddress>) Collections.singletonList(socketAddress), aVar);
    }
}
