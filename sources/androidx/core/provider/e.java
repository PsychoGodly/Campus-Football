package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.h;
import java.util.List;

/* compiled from: FontRequest */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f2997a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2998b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2999c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f3000d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3001e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f3002f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f2997a = (String) h.f(str);
        this.f2998b = (String) h.f(str2);
        this.f2999c = (String) h.f(str3);
        this.f3000d = (List) h.f(list);
        this.f3002f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f3000d;
    }

    public int c() {
        return this.f3001e;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.f3002f;
    }

    public String e() {
        return this.f2997a;
    }

    public String f() {
        return this.f2998b;
    }

    public String g() {
        return this.f2999c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f2997a + ", mProviderPackage: " + this.f2998b + ", mQuery: " + this.f2999c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f3000d.size(); i10++) {
            sb2.append(" [");
            List list = this.f3000d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f3001e);
        return sb2.toString();
    }
}
