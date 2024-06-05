package com.startapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.startapp.sdk.adsbase.e;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.HashSet;
import java.util.List;

/* compiled from: Sta */
public class m6 implements CookieStore {

    /* renamed from: a  reason: collision with root package name */
    public final CookieStore f16142a = new CookieManager().getCookieStore();

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f16143b;

    public m6(Context context) {
        HttpCookie httpCookie;
        e eVar = new e(context.getSharedPreferences("com.startapp.android.publish.CookiePrefsFile", 0));
        this.f16143b = eVar;
        String string = eVar.getString("names", (String) null);
        if (string != null) {
            for (String str : TextUtils.split(string, ";")) {
                SharedPreferences sharedPreferences = this.f16143b;
                String string2 = sharedPreferences.getString("cookie_" + str, (String) null);
                if (!(string2 == null || (httpCookie = (HttpCookie) g4.a(string2, HttpCookie.class)) == null)) {
                    if (httpCookie.hasExpired()) {
                        b(httpCookie);
                        a();
                    } else if (httpCookie.getDomain() != null) {
                        this.f16142a.add(URI.create(httpCookie.getDomain()), httpCookie);
                    }
                }
            }
        }
    }

    public final void a() {
        SharedPreferences.Editor edit = this.f16143b.edit();
        HashSet hashSet = new HashSet();
        for (HttpCookie a10 : this.f16142a.getCookies()) {
            hashSet.add(a(a10));
        }
        edit.putString("names", TextUtils.join(";", hashSet));
        edit.apply();
    }

    public void add(URI uri, HttpCookie httpCookie) {
        String a10 = a(httpCookie);
        this.f16142a.add(uri, httpCookie);
        SharedPreferences.Editor edit = this.f16143b.edit();
        edit.putString("cookie_" + a10, String.valueOf(g4.b(httpCookie)));
        edit.apply();
        a();
    }

    public final void b(HttpCookie httpCookie) {
        SharedPreferences.Editor edit = this.f16143b.edit();
        StringBuilder a10 = p0.a("cookie_");
        a10.append(a(httpCookie));
        edit.remove(a10.toString());
        edit.apply();
    }

    public List<HttpCookie> get(URI uri) {
        return this.f16142a.get(uri);
    }

    public List<HttpCookie> getCookies() {
        return this.f16142a.getCookies();
    }

    public List<URI> getURIs() {
        return this.f16142a.getURIs();
    }

    public boolean remove(URI uri, HttpCookie httpCookie) {
        if (!this.f16142a.remove(uri, httpCookie)) {
            return false;
        }
        b(httpCookie);
        a();
        return true;
    }

    public boolean removeAll() {
        if (!this.f16142a.removeAll()) {
            return false;
        }
        SharedPreferences.Editor edit = this.f16143b.edit();
        edit.clear();
        edit.apply();
        a();
        return true;
    }

    public final String a(HttpCookie httpCookie) {
        return httpCookie.getDomain() + "_" + httpCookie.getName();
    }
}
