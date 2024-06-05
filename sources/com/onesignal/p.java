package com.onesignal;

import android.os.PersistableBundle;

/* compiled from: BundleCompat */
class p implements m<PersistableBundle> {

    /* renamed from: a  reason: collision with root package name */
    private PersistableBundle f28084a = new PersistableBundle();

    p() {
    }

    public void a(String str, Long l10) {
        this.f28084a.putLong(str, l10.longValue());
    }

    public Long b(String str) {
        return Long.valueOf(this.f28084a.getLong(str));
    }

    public Integer d(String str) {
        return Integer.valueOf(this.f28084a.getInt(str));
    }

    public String e(String str) {
        return this.f28084a.getString(str);
    }

    public boolean f(String str) {
        return this.f28084a.containsKey(str);
    }

    /* renamed from: g */
    public PersistableBundle c() {
        return this.f28084a;
    }

    public boolean getBoolean(String str, boolean z10) {
        return this.f28084a.getBoolean(str, z10);
    }

    public void putString(String str, String str2) {
        this.f28084a.putString(str, str2);
    }
}
