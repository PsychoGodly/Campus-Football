package bf;

import cf.c;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* compiled from: Headers */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f31815a;

    /* compiled from: Headers */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final List<String> f31816a = new ArrayList(20);

        public a a(String str, String str2) {
            q.a(str);
            q.b(str2, str);
            return c(str, str2);
        }

        /* access modifiers changed from: package-private */
        public a b(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                return c(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            if (str.startsWith(":")) {
                return c(MaxReward.DEFAULT_LABEL, str.substring(1));
            }
            return c(MaxReward.DEFAULT_LABEL, str);
        }

        /* access modifiers changed from: package-private */
        public a c(String str, String str2) {
            this.f31816a.add(str);
            this.f31816a.add(str2.trim());
            return this;
        }

        public q d() {
            return new q(this);
        }

        public a e(String str) {
            int i10 = 0;
            while (i10 < this.f31816a.size()) {
                if (str.equalsIgnoreCase(this.f31816a.get(i10))) {
                    this.f31816a.remove(i10);
                    this.f31816a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public a f(String str, String str2) {
            q.a(str);
            q.b(str2, str);
            e(str);
            c(str, str2);
            return this;
        }
    }

    q(a aVar) {
        List<String> list = aVar.f31816a;
        this.f31815a = (String[]) list.toArray(new String[list.size()]);
    }

    static void a(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!str.isEmpty()) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(c.r("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str));
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty");
    }

    static void b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                char charAt = str.charAt(i10);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i10++;
                } else {
                    throw new IllegalArgumentException(c.r("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }

    private static String d(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public String c(String str) {
        return d(this.f31815a, str);
    }

    public String e(int i10) {
        return this.f31815a[i10 * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && Arrays.equals(((q) obj).f31815a, this.f31815a);
    }

    public a f() {
        a aVar = new a();
        Collections.addAll(aVar.f31816a, this.f31815a);
        return aVar;
    }

    public int g() {
        return this.f31815a.length / 2;
    }

    public Map<String, List<String>> h() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int g10 = g();
        for (int i10 = 0; i10 < g10; i10++) {
            String lowerCase = e(i10).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(i(i10));
        }
        return treeMap;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f31815a);
    }

    public String i(int i10) {
        return this.f31815a[(i10 * 2) + 1];
    }

    public List<String> j(String str) {
        int g10 = g();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < g10; i10++) {
            if (str.equalsIgnoreCase(e(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(i(i10));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int g10 = g();
        for (int i10 = 0; i10 < g10; i10++) {
            sb2.append(e(i10));
            sb2.append(": ");
            sb2.append(i(i10));
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
