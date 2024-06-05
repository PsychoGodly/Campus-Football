package dd;

import dd.l;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import r6.h;
import r6.o;

/* compiled from: DecompressorRegistry */
public final class v {

    /* renamed from: c  reason: collision with root package name */
    static final h f32371c = h.f(',');

    /* renamed from: d  reason: collision with root package name */
    private static final v f32372d = a().f(new l.a(), true).f(l.b.f32286a, false);

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f32373a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f32374b;

    /* compiled from: DecompressorRegistry */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final u f32375a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f32376b;

        a(u uVar, boolean z10) {
            this.f32375a = (u) o.p(uVar, "decompressor");
            this.f32376b = z10;
        }
    }

    private v(u uVar, boolean z10, v vVar) {
        String a10 = uVar.a();
        o.e(!a10.contains(","), "Comma is currently not allowed in message encoding");
        int size = vVar.f32373a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(!vVar.f32373a.containsKey(uVar.a()) ? size + 1 : size);
        for (a next : vVar.f32373a.values()) {
            String a11 = next.f32375a.a();
            if (!a11.equals(a10)) {
                linkedHashMap.put(a11, new a(next.f32375a, next.f32376b));
            }
        }
        linkedHashMap.put(a10, new a(uVar, z10));
        this.f32373a = Collections.unmodifiableMap(linkedHashMap);
        this.f32374b = f32371c.d(b()).getBytes(Charset.forName("US-ASCII"));
    }

    public static v a() {
        return new v();
    }

    public static v c() {
        return f32372d;
    }

    public Set<String> b() {
        HashSet hashSet = new HashSet(this.f32373a.size());
        for (Map.Entry next : this.f32373a.entrySet()) {
            if (((a) next.getValue()).f32376b) {
                hashSet.add((String) next.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    public byte[] d() {
        return this.f32374b;
    }

    public u e(String str) {
        a aVar = this.f32373a.get(str);
        if (aVar != null) {
            return aVar.f32375a;
        }
        return null;
    }

    public v f(u uVar, boolean z10) {
        return new v(uVar, z10, this);
    }

    private v() {
        this.f32373a = new LinkedHashMap(0);
        this.f32374b = new byte[0];
    }
}
