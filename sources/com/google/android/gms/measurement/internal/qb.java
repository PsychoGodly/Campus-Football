package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class qb {

    /* renamed from: a  reason: collision with root package name */
    private final w5 f24987a;

    public qb(w5 w5Var) {
        this.f24987a = w5Var;
    }

    private final boolean d() {
        return this.f24987a.A().f25286x.a() > 0;
    }

    private final boolean e() {
        if (d() && this.f24987a.zzb().a() - this.f24987a.A().f25286x.a() > this.f24987a.u().s((String) null, e0.V)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        String str;
        this.f24987a.zzl().i();
        if (d()) {
            if (e()) {
                this.f24987a.A().f25285w.b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f24987a.C().u0("auto", "_cmpx", bundle);
            } else {
                String a10 = this.f24987a.A().f25285w.a();
                if (TextUtils.isEmpty(a10)) {
                    this.f24987a.zzj().D().a("Cache still valid but referrer not found");
                } else {
                    long a11 = ((this.f24987a.A().f25286x.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a10);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a11);
                    Object obj = pair.first;
                    if (obj == null) {
                        str = "app";
                    } else {
                        str = (String) obj;
                    }
                    this.f24987a.C().u0(str, "_cmp", (Bundle) pair.second);
                }
                this.f24987a.A().f25285w.b((String) null);
            }
            this.f24987a.A().f25286x.b(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, Bundle bundle) {
        String str2;
        this.f24987a.zzl().i();
        if (!this.f24987a.k()) {
            if (bundle == null || bundle.isEmpty()) {
                str2 = null;
            } else {
                if (str == null || str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f24987a.A().f25285w.b(str2);
                this.f24987a.A().f25286x.b(this.f24987a.zzb().a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (d() && e()) {
            this.f24987a.A().f25285w.b((String) null);
        }
    }
}
