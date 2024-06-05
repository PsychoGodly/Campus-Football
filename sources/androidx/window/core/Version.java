package androidx.window.core;

import com.applovin.mediation.MaxReward;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import sd.g;

/* compiled from: Version.kt */
public final class Version implements Comparable<Version> {
    /* access modifiers changed from: private */
    public static final Version CURRENT;
    public static final Companion Companion = new Companion((h) null);
    /* access modifiers changed from: private */
    public static final Version UNKNOWN = new Version(0, 0, 0, MaxReward.DEFAULT_LABEL);
    /* access modifiers changed from: private */
    public static final Version VERSION_0_1 = new Version(0, 1, 0, MaxReward.DEFAULT_LABEL);
    /* access modifiers changed from: private */
    public static final Version VERSION_1_0;
    private static final String VERSION_PATTERN_STRING = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";
    private final g bigInteger$delegate;
    private final String description;
    private final int major;
    private final int minor;
    private final int patch;

    /* compiled from: Version.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final Version getCURRENT() {
            return Version.CURRENT;
        }

        public final Version getUNKNOWN() {
            return Version.UNKNOWN;
        }

        public final Version getVERSION_0_1() {
            return Version.VERSION_0_1;
        }

        public final Version getVERSION_1_0() {
            return Version.VERSION_1_0;
        }

        public final Version parse(String str) {
            if (str == null || o.m(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile(Version.VERSION_PATTERN_STRING).matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            String group = matcher.group(1);
            Integer valueOf = group == null ? null : Integer.valueOf(Integer.parseInt(group));
            if (valueOf == null) {
                return null;
            }
            int intValue = valueOf.intValue();
            String group2 = matcher.group(2);
            Integer valueOf2 = group2 == null ? null : Integer.valueOf(Integer.parseInt(group2));
            if (valueOf2 == null) {
                return null;
            }
            int intValue2 = valueOf2.intValue();
            String group3 = matcher.group(3);
            Integer valueOf3 = group3 == null ? null : Integer.valueOf(Integer.parseInt(group3));
            if (valueOf3 == null) {
                return null;
            }
            int intValue3 = valueOf3.intValue();
            String group4 = matcher.group(4) != null ? matcher.group(4) : MaxReward.DEFAULT_LABEL;
            m.d(group4, "description");
            return new Version(intValue, intValue2, intValue3, group4, (h) null);
        }
    }

    static {
        Version version = new Version(1, 0, 0, MaxReward.DEFAULT_LABEL);
        VERSION_1_0 = version;
        CURRENT = version;
    }

    private Version(int i10, int i11, int i12, String str) {
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
        this.description = str;
        this.bigInteger$delegate = i.a(new Version$bigInteger$2(this));
    }

    public /* synthetic */ Version(int i10, int i11, int i12, String str, h hVar) {
        this(i10, i11, i12, str);
    }

    private final BigInteger getBigInteger() {
        Object value = this.bigInteger$delegate.getValue();
        m.d(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public static final Version parse(String str) {
        return Companion.parse(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        if (this.major == version.major && this.minor == version.minor && this.patch == version.patch) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return ((((527 + this.major) * 31) + this.minor) * 31) + this.patch;
    }

    public String toString() {
        String m10 = o.m(this.description) ^ true ? m.m("-", this.description) : MaxReward.DEFAULT_LABEL;
        return this.major + '.' + this.minor + '.' + this.patch + m10;
    }

    public int compareTo(Version version) {
        m.e(version, "other");
        return getBigInteger().compareTo(version.getBigInteger());
    }
}
