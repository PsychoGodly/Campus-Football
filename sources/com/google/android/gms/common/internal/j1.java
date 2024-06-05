package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class j1 {

    /* renamed from: f  reason: collision with root package name */
    private static final Uri f15419f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    private final String f15420a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15421b;

    /* renamed from: c  reason: collision with root package name */
    private final ComponentName f15422c = null;

    /* renamed from: d  reason: collision with root package name */
    private final int f15423d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f15424e;

    public j1(String str, String str2, int i10, boolean z10) {
        q.g(str);
        this.f15420a = str;
        q.g(str2);
        this.f15421b = str2;
        this.f15423d = i10;
        this.f15424e = z10;
    }

    public final int a() {
        return this.f15423d;
    }

    public final ComponentName b() {
        return this.f15422c;
    }

    public final Intent c(Context context) {
        Bundle bundle;
        if (this.f15420a == null) {
            return new Intent().setComponent(this.f15422c);
        }
        Intent intent = null;
        if (this.f15424e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f15420a);
            try {
                bundle = context.getContentResolver().call(f15419f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e10) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f15420a)));
            }
        }
        if (intent != null) {
            return intent;
        }
        return new Intent(this.f15420a).setPackage(this.f15421b);
    }

    public final String d() {
        return this.f15421b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return p.a(this.f15420a, j1Var.f15420a) && p.a(this.f15421b, j1Var.f15421b) && p.a(this.f15422c, j1Var.f15422c) && this.f15423d == j1Var.f15423d && this.f15424e == j1Var.f15424e;
    }

    public final int hashCode() {
        return p.b(this.f15420a, this.f15421b, this.f15422c, Integer.valueOf(this.f15423d), Boolean.valueOf(this.f15424e));
    }

    public final String toString() {
        String str = this.f15420a;
        if (str != null) {
            return str;
        }
        q.k(this.f15422c);
        return this.f15422c.flattenToString();
    }
}
