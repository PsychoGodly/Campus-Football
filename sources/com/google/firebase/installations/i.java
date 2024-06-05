package com.google.firebase.installations;

import android.text.TextUtils;
import e8.d;
import g8.a;
import g8.b;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Utils */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final long f26694b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f26695c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    private static i f26696d;

    /* renamed from: a  reason: collision with root package name */
    private final a f26697a;

    private i(a aVar) {
        this.f26697a = aVar;
    }

    public static i c() {
        return d(b.b());
    }

    public static i d(a aVar) {
        if (f26696d == null) {
            f26696d = new i(aVar);
        }
        return f26696d;
    }

    static boolean g(String str) {
        return f26695c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f26697a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(d dVar) {
        if (!TextUtils.isEmpty(dVar.b()) && dVar.h() + dVar.c() >= b() + f26694b) {
            return false;
        }
        return true;
    }
}
