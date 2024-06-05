package com.google.firebase.firestore;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import u7.r;
import y7.x;

/* compiled from: FieldPath */
public final class q {

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f26518b = Pattern.compile("[~*/\\[\\]]");

    /* renamed from: c  reason: collision with root package name */
    private static final q f26519c = new q(r.f30633b);

    /* renamed from: a  reason: collision with root package name */
    private final r f26520a;

    private q(List<String> list) {
        this.f26520a = r.o(list);
    }

    public static q a() {
        return f26519c;
    }

    static q b(String str) {
        x.c(str, "Provided field path must not be null.");
        x.a(!f26518b.matcher(str).find(), "Use FieldPath.of() for field names containing '~*/[]'.", new Object[0]);
        try {
            return d(str.split("\\.", -1));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
        }
    }

    public static q d(String... strArr) {
        x.a(strArr.length > 0, "Invalid field path. Provided path must not be empty.", new Object[0]);
        int i10 = 0;
        while (i10 < strArr.length) {
            boolean z10 = strArr[i10] != null && !strArr[i10].isEmpty();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid field name at argument ");
            i10++;
            sb2.append(i10);
            sb2.append(". Field names must not be null or empty.");
            x.a(z10, sb2.toString(), new Object[0]);
        }
        return new q((List<String>) Arrays.asList(strArr));
    }

    /* access modifiers changed from: package-private */
    public r c() {
        return this.f26520a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        return this.f26520a.equals(((q) obj).f26520a);
    }

    public int hashCode() {
        return this.f26520a.hashCode();
    }

    public String toString() {
        return this.f26520a.toString();
    }

    private q(r rVar) {
        this.f26520a = rVar;
    }
}
