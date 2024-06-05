package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.j5;
import com.applovin.impl.ma;
import com.applovin.impl.x7;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class na implements ld {

    /* renamed from: a  reason: collision with root package name */
    private final ma.b f9959a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9960b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9961c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f9962d;

    public na(String str, boolean z10, ma.b bVar) {
        a1.a(!z10 || !TextUtils.isEmpty(str));
        this.f9959a = bVar;
        this.f9960b = str;
        this.f9961c = z10;
        this.f9962d = new HashMap();
    }

    public byte[] a(UUID uuid, x7.a aVar) {
        String str;
        String b10 = aVar.b();
        if (this.f9961c || TextUtils.isEmpty(b10)) {
            b10 = this.f9960b;
        }
        if (!TextUtils.isEmpty(b10)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = r2.f11117e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else {
                str = r2.f11115c.equals(uuid) ? "application/json" : "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f9962d) {
                hashMap.putAll(this.f9962d);
            }
            return a(this.f9959a, b10, aVar.a(), hashMap);
        }
        j5.b bVar = new j5.b();
        Uri uri = Uri.EMPTY;
        throw new md(bVar.a(uri).a(), uri, cb.h(), 0, new IllegalStateException("No license URL"));
    }

    public byte[] a(UUID uuid, x7.d dVar) {
        return a(this.f9959a, dVar.b() + "&signedRequest=" + yp.a(dVar.a()), (byte[]) null, Collections.emptyMap());
    }

    private static String a(ma.e eVar, int i10) {
        Map map;
        List list;
        int i11 = eVar.f9336d;
        if ((i11 == 307 || i11 == 308) && i10 < 5 && (map = eVar.f9338g) != null && (list = (List) map.get("Location")) != null && !list.isEmpty()) {
            return (String) list.get(0);
        }
        return null;
    }

    public void a(String str, String str2) {
        a1.a((Object) str);
        a1.a((Object) str2);
        synchronized (this.f9962d) {
            this.f9962d.put(str, str2);
        }
    }

    private static byte[] a(ma.b bVar, String str, byte[] bArr, Map map) {
        i5 i5Var;
        cl clVar = new cl(bVar.a());
        j5 a10 = new j5.b().b(str).a(map).b(2).a(bArr).a(1).a();
        int i10 = 0;
        j5 j5Var = a10;
        while (true) {
            try {
                i5Var = new i5(clVar, j5Var);
                byte[] a11 = yp.a((InputStream) i5Var);
                yp.a((Closeable) i5Var);
                return a11;
            } catch (ma.e e10) {
                String a12 = a(e10, i10);
                if (a12 != null) {
                    i10++;
                    j5Var = j5Var.a().b(a12).a();
                    yp.a((Closeable) i5Var);
                } else {
                    throw e10;
                }
            } catch (Exception e11) {
                throw new md(a10, (Uri) a1.a((Object) clVar.h()), clVar.e(), clVar.g(), e11);
            } catch (Throwable th) {
                yp.a((Closeable) i5Var);
                throw th;
            }
        }
    }
}
