package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.p;
import java.util.regex.Pattern;

/* compiled from: TopicOperation */
final class z0 {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f26927d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    private final String f26928a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26929b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26930c;

    private z0(String str, String str2) {
        this.f26928a = d(str2, str);
        this.f26929b = str;
        this.f26930c = str + "!" + str2;
    }

    static z0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new z0(split[0], split[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str2}));
            str = str.substring(8);
        }
        if (str != null && f26927d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str, "[a-zA-Z0-9-_.~%]{1,900}"}));
    }

    public static z0 f(String str) {
        return new z0("S", str);
    }

    public static z0 g(String str) {
        return new z0("U", str);
    }

    public String b() {
        return this.f26929b;
    }

    public String c() {
        return this.f26928a;
    }

    public String e() {
        return this.f26930c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (!this.f26928a.equals(z0Var.f26928a) || !this.f26929b.equals(z0Var.f26929b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return p.b(this.f26929b, this.f26928a);
    }
}
