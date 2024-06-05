package bf;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MediaType */
public final class t {

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f31835e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f31836f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    private final String f31837a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31838b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31839c;

    /* renamed from: d  reason: collision with root package name */
    private final String f31840d;

    private t(String str, String str2, String str3, String str4) {
        this.f31837a = str;
        this.f31838b = str2;
        this.f31839c = str3;
        this.f31840d = str4;
    }

    public static t c(String str) {
        Matcher matcher = f31835e.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            String str2 = null;
            Matcher matcher2 = f31836f.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null && group2.equalsIgnoreCase("charset")) {
                        String group3 = matcher2.group(2);
                        if (group3 == null) {
                            group3 = matcher2.group(3);
                        } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                            group3 = group3.substring(1, group3.length() - 1);
                        }
                        if (str2 == null || group3.equalsIgnoreCase(str2)) {
                            str2 = group3;
                        } else {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + '\"');
                        }
                    }
                    end = matcher2.end();
                } else {
                    throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
                }
            }
            return new t(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    public static t d(String str) {
        try {
            return c(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public Charset a() {
        return b((Charset) null);
    }

    public Charset b(Charset charset) {
        try {
            String str = this.f31840d;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && ((t) obj).f31837a.equals(this.f31837a);
    }

    public int hashCode() {
        return this.f31837a.hashCode();
    }

    public String toString() {
        return this.f31837a;
    }
}
