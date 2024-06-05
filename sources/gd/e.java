package gd;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: Headers */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f32889a;

    /* compiled from: Headers */
    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f32890a = new ArrayList(20);

        private void d(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if (charAt <= 31 || charAt >= 127) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i10), str}));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        char charAt2 = str2.charAt(i11);
                        if (charAt2 <= 31 || charAt2 >= 127) {
                            throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", new Object[]{Integer.valueOf(charAt2), Integer.valueOf(i11), str2}));
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("value == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }

        /* access modifiers changed from: package-private */
        public b b(String str, String str2) {
            this.f32890a.add(str);
            this.f32890a.add(str2.trim());
            return this;
        }

        public e c() {
            return new e(this);
        }

        public b e(String str) {
            int i10 = 0;
            while (i10 < this.f32890a.size()) {
                if (str.equalsIgnoreCase(this.f32890a.get(i10))) {
                    this.f32890a.remove(i10);
                    this.f32890a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public b f(String str, String str2) {
            d(str, str2);
            e(str);
            b(str, str2);
            return this;
        }
    }

    public String a(int i10) {
        int i11 = i10 * 2;
        if (i11 < 0) {
            return null;
        }
        String[] strArr = this.f32889a;
        if (i11 >= strArr.length) {
            return null;
        }
        return strArr[i11];
    }

    public int b() {
        return this.f32889a.length / 2;
    }

    public String c(int i10) {
        int i11 = (i10 * 2) + 1;
        if (i11 < 0) {
            return null;
        }
        String[] strArr = this.f32889a;
        if (i11 >= strArr.length) {
            return null;
        }
        return strArr[i11];
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int b10 = b();
        for (int i10 = 0; i10 < b10; i10++) {
            sb2.append(a(i10));
            sb2.append(": ");
            sb2.append(c(i10));
            sb2.append("\n");
        }
        return sb2.toString();
    }

    private e(b bVar) {
        this.f32889a = (String[]) bVar.f32890a.toArray(new String[bVar.f32890a.size()]);
    }
}
