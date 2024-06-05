package u7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: FieldPath */
public final class r extends e<r> {

    /* renamed from: b  reason: collision with root package name */
    public static final r f30633b = q("__name__");

    /* renamed from: c  reason: collision with root package name */
    public static final r f30634c = new r(Collections.emptyList());

    private r(List<String> list) {
        super(list);
    }

    public static r o(List<String> list) {
        return list.isEmpty() ? f30634c : new r(list);
    }

    public static r p(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt == '\\') {
                i10++;
                if (i10 != str.length()) {
                    sb2.append(str.charAt(i10));
                } else {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
            } else if (charAt == '.') {
                if (!z10) {
                    String sb3 = sb2.toString();
                    if (!sb3.isEmpty()) {
                        StringBuilder sb4 = new StringBuilder();
                        arrayList.add(sb3);
                        sb2 = sb4;
                    } else {
                        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
                    }
                } else {
                    sb2.append(charAt);
                }
            } else if (charAt == '`') {
                z10 = !z10;
            } else {
                sb2.append(charAt);
            }
            i10++;
        }
        String sb5 = sb2.toString();
        if (!sb5.isEmpty()) {
            arrayList.add(sb5);
            return new r(arrayList);
        }
        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
    }

    public static r q(String str) {
        return new r(Collections.singletonList(str));
    }

    private static boolean s(String str) {
        if (str.isEmpty()) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt != '_' && ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z'))) {
            return false;
        }
        for (int i10 = 1; i10 < str.length(); i10++) {
            char charAt2 = str.charAt(i10);
            if (charAt2 != '_' && ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && (charAt2 < '0' || charAt2 > '9')))) {
                return false;
            }
        }
        return true;
    }

    public String d() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f30614a.size(); i10++) {
            if (i10 > 0) {
                sb2.append(".");
            }
            String replace = this.f30614a.get(i10).replace("\\", "\\\\").replace("`", "\\`");
            if (!s(replace)) {
                replace = '`' + replace + '`';
            }
            sb2.append(replace);
        }
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public r f(List<String> list) {
        return new r(list);
    }

    public boolean r() {
        return equals(f30633b);
    }
}
