package r2;

import android.net.Uri;
import android.text.TextUtils;
import j4.c0;
import j4.l;
import j4.n;
import j4.o0;
import j4.p;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k4.a;
import k4.n0;
import n2.i;
import r2.g0;
import s6.v;

/* compiled from: HttpMediaDrmCallback */
public final class l0 implements n0 {

    /* renamed from: a  reason: collision with root package name */
    private final l.a f22073a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22074b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f22075c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f22076d;

    public l0(String str, boolean z10, l.a aVar) {
        a.a(!z10 || !TextUtils.isEmpty(str));
        this.f22073a = aVar;
        this.f22074b = str;
        this.f22075c = z10;
        this.f22076d = new HashMap();
    }

    private static byte[] c(l.a aVar, String str, byte[] bArr, Map<String, String> map) throws o0 {
        n nVar;
        o0 o0Var = new o0(aVar.a());
        p a10 = new p.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i10 = 0;
        p pVar = a10;
        while (true) {
            try {
                nVar = new n(o0Var, pVar);
                byte[] V0 = n0.V0(nVar);
                n0.n(nVar);
                return V0;
            } catch (c0 e10) {
                String d10 = d(e10, i10);
                if (d10 != null) {
                    i10++;
                    pVar = pVar.a().j(d10).a();
                    n0.n(nVar);
                } else {
                    throw e10;
                }
            } catch (Exception e11) {
                throw new o0(a10, (Uri) a.e(o0Var.r()), o0Var.k(), o0Var.q(), e11);
            } catch (Throwable th) {
                n0.n(nVar);
                throw th;
            }
        }
    }

    private static String d(c0 c0Var, int i10) {
        Map<String, List<String>> map;
        List list;
        int i11 = c0Var.f19295d;
        if (((i11 == 307 || i11 == 308) && i10 < 5) && (map = c0Var.f19297g) != null && (list = map.get("Location")) != null && !list.isEmpty()) {
            return (String) list.get(0);
        }
        return null;
    }

    public byte[] a(UUID uuid, g0.d dVar) throws o0 {
        return c(this.f22073a, dVar.b() + "&signedRequest=" + n0.D(dVar.a()), (byte[]) null, Collections.emptyMap());
    }

    public byte[] b(UUID uuid, g0.a aVar) throws o0 {
        String str;
        String b10 = aVar.b();
        if (this.f22075c || TextUtils.isEmpty(b10)) {
            b10 = this.f22074b;
        }
        if (!TextUtils.isEmpty(b10)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = i.f20440e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else {
                str = i.f20438c.equals(uuid) ? "application/json" : "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f22076d) {
                hashMap.putAll(this.f22076d);
            }
            return c(this.f22073a, b10, aVar.a(), hashMap);
        }
        throw new o0(new p.b().i(Uri.EMPTY).a(), Uri.EMPTY, v.k(), 0, new IllegalStateException("No license URL"));
    }

    public void e(String str, String str2) {
        a.e(str);
        a.e(str2);
        synchronized (this.f22076d) {
            this.f22076d.put(str, str2);
        }
    }
}
