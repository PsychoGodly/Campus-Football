package ne;

import java.nio.charset.Charset;
import kotlin.jvm.internal.m;

/* compiled from: Charsets.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f36511a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f36512b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f36513c;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f36514d;

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f36515e;

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f36516f;

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f36517g;

    static {
        Charset forName = Charset.forName("UTF-8");
        m.d(forName, "forName(\"UTF-8\")");
        f36512b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        m.d(forName2, "forName(\"UTF-16\")");
        f36513c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        m.d(forName3, "forName(\"UTF-16BE\")");
        f36514d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        m.d(forName4, "forName(\"UTF-16LE\")");
        f36515e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        m.d(forName5, "forName(\"US-ASCII\")");
        f36516f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        m.d(forName6, "forName(\"ISO-8859-1\")");
        f36517g = forName6;
    }

    private c() {
    }
}
