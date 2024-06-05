package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.q;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import r5.j;
import r5.r;
import r5.s;
import r5.t;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class m4 {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<String[]> f24820b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReference<String[]> f24821c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReference<String[]> f24822d = new AtomicReference<>();

    /* renamed from: a  reason: collision with root package name */
    private final j f24823a;

    public m4(j jVar) {
        this.f24823a = jVar;
    }

    private static String d(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        q.k(strArr);
        q.k(strArr2);
        q.k(atomicReference);
        q.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str3 = strArr[i10];
            if (str == str3 || (str != null && str.equals(str3))) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i10] == null) {
                        strArr3[i10] = strArr2[i10] + "(" + strArr[i10] + ")";
                    }
                    str2 = strArr3[i10];
                }
                return str2;
            }
        }
        return str;
    }

    private final String e(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = a(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(str);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!this.f24823a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str2 : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(f(str2));
            sb2.append("=");
            Object obj = bundle.get(str2);
            if (obj instanceof Bundle) {
                str = e(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = e((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = e(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            sb2.append(str);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public final String b(d0 d0Var) {
        String str = null;
        if (d0Var == null) {
            return null;
        }
        if (!this.f24823a.zza()) {
            return d0Var.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(d0Var.f24459c);
        sb2.append(",name=");
        sb2.append(c(d0Var.f24457a));
        sb2.append(",params=");
        z zVar = d0Var.f24458b;
        if (zVar != null) {
            if (!this.f24823a.zza()) {
                str = zVar.toString();
            } else {
                str = a(zVar.w());
            }
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f24823a.zza()) {
            return str;
        }
        return d(str, r.f29776c, r.f29774a, f24820b);
    }

    /* access modifiers changed from: protected */
    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f24823a.zza()) {
            return str;
        }
        return d(str, t.f29781b, t.f29780a, f24821c);
    }

    /* access modifiers changed from: protected */
    public final String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f24823a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return d(str, s.f29779b, s.f29778a, f24822d);
        }
        return "experiment_id" + "(" + str + ")";
    }
}
