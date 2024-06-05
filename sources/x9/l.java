package x9;

import ca.g;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private final String f31274a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31275b;

    private l(String str, String str2) {
        this.f31274a = str;
        this.f31275b = str2;
    }

    public static l a(String str, String str2) {
        g.d(str, "Name is null or empty");
        g.d(str2, "Version is null or empty");
        return new l(str, str2);
    }

    public String b() {
        return this.f31274a;
    }

    public String c() {
        return this.f31275b;
    }
}
