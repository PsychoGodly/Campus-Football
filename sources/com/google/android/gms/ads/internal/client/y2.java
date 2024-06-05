package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbza;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class y2 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f14609a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f14610b = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f14611c = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f14612d = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f14613e = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f14614f = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Date f14615g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public String f14616h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final List f14617i = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public int f14618j = -1;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public String f14619k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public String f14620l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f14621m = -1;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f14622n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public String f14623o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public int f14624p = 60000;

    public final void A(String str) {
        this.f14612d.add(str);
    }

    public final void B(String str) {
        this.f14612d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void C(String str) {
        this.f14623o = str;
    }

    @Deprecated
    public final void D(Date date) {
        this.f14615g = date;
    }

    public final void E(String str) {
        this.f14616h = str;
    }

    @Deprecated
    public final void a(int i10) {
        this.f14618j = i10;
    }

    public final void b(int i10) {
        this.f14624p = i10;
    }

    @Deprecated
    public final void c(boolean z10) {
        this.f14622n = z10;
    }

    public final void d(List list) {
        this.f14617i.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                zzbza.zzj("neighboring content URL should not be null or empty");
            } else {
                this.f14617i.add(str);
            }
        }
    }

    public final void e(String str) {
        this.f14619k = str;
    }

    public final void f(String str) {
        this.f14620l = str;
    }

    @Deprecated
    public final void g(boolean z10) {
        this.f14621m = z10 ? 1 : 0;
    }

    public final void x(String str, String str2) {
        this.f14613e.putString(str, str2);
    }

    public final void y(String str) {
        this.f14609a.add(str);
    }

    public final void z(Class cls, Bundle bundle) {
        this.f14610b.putBundle(cls.getName(), bundle);
    }
}
