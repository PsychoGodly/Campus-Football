package com.onesignal;

import android.os.Bundle;

/* compiled from: BundleCompat */
class n implements m<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private Bundle f28058a = new Bundle();

    n() {
    }

    public void a(String str, Long l10) {
        this.f28058a.putLong(str, l10.longValue());
    }

    public Long b(String str) {
        return Long.valueOf(this.f28058a.getLong(str));
    }

    public Integer d(String str) {
        return Integer.valueOf(this.f28058a.getInt(str));
    }

    public String e(String str) {
        return this.f28058a.getString(str);
    }

    public boolean f(String str) {
        return this.f28058a.containsKey(str);
    }

    /* renamed from: g */
    public Bundle c() {
        return this.f28058a;
    }

    public boolean getBoolean(String str, boolean z10) {
        return this.f28058a.getBoolean(str, z10);
    }

    public void putString(String str, String str2) {
        this.f28058a.putString(str, str2);
    }
}
