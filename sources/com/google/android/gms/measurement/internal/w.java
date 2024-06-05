package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    final String f25172a;

    /* renamed from: b  reason: collision with root package name */
    final String f25173b;

    /* renamed from: c  reason: collision with root package name */
    private final String f25174c;

    /* renamed from: d  reason: collision with root package name */
    final long f25175d;

    /* renamed from: e  reason: collision with root package name */
    final long f25176e;

    /* renamed from: f  reason: collision with root package name */
    final z f25177f;

    w(w5 w5Var, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        z zVar;
        q.g(str2);
        q.g(str3);
        this.f25172a = str2;
        this.f25173b = str3;
        this.f25174c = TextUtils.isEmpty(str) ? null : str;
        this.f25175d = j10;
        this.f25176e = j11;
        if (j11 != 0 && j11 > j10) {
            w5Var.zzj().G().b("Event created with reverse previous/current timestamps. appId", n4.q(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zVar = new z(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    w5Var.zzj().B().a("Param name can't be null");
                    it.remove();
                } else {
                    Object n02 = w5Var.G().n0(str4, bundle2.get(str4));
                    if (n02 == null) {
                        w5Var.zzj().G().b("Param value can't be null", w5Var.y().f(str4));
                        it.remove();
                    } else {
                        w5Var.G().I(bundle2, str4, n02);
                    }
                }
            }
            zVar = new z(bundle2);
        }
        this.f25177f = zVar;
    }

    /* access modifiers changed from: package-private */
    public final w a(w5 w5Var, long j10) {
        return new w(w5Var, this.f25174c, this.f25172a, this.f25173b, this.f25175d, j10, this.f25177f);
    }

    public final String toString() {
        String str = this.f25172a;
        String str2 = this.f25173b;
        String valueOf = String.valueOf(this.f25177f);
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + valueOf + "}";
    }

    private w(w5 w5Var, String str, String str2, String str3, long j10, long j11, z zVar) {
        q.g(str2);
        q.g(str3);
        q.k(zVar);
        this.f25172a = str2;
        this.f25173b = str3;
        this.f25174c = TextUtils.isEmpty(str) ? null : str;
        this.f25175d = j10;
        this.f25176e = j11;
        if (j11 != 0 && j11 > j10) {
            w5Var.zzj().G().c("Event created with reverse previous/current timestamps. appId, name", n4.q(str2), n4.q(str3));
        }
        this.f25177f = zVar;
    }
}
