package ne;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.m;

/* compiled from: StringNumberConversions.kt */
class n extends m {
    public static Integer f(String str) {
        m.e(str, "<this>");
        return g(str, 10);
    }

    public static final Integer g(String str, int i10) {
        boolean z10;
        int i11;
        m.e(str, "<this>");
        a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        int i13 = -2147483647;
        int i14 = 1;
        if (m.f(charAt, 48) >= 0) {
            z10 = false;
            i14 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i13 = RecyclerView.UNDEFINED_DURATION;
                z10 = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z10 = false;
            }
        }
        int i15 = -59652323;
        while (i14 < length) {
            int b10 = a.b(str.charAt(i14), i10);
            if (b10 < 0) {
                return null;
            }
            if ((i12 < i15 && (i15 != -59652323 || i12 < (i15 = i13 / i10))) || (i11 = i12 * i10) < i13 + b10) {
                return null;
            }
            i12 = i11 - b10;
            i14++;
        }
        return z10 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    public static Long h(String str) {
        m.e(str, "<this>");
        return i(str, 10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Long i(java.lang.String r18, int r19) {
        /*
            r0 = r18
            r1 = r19
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.m.e(r0, r2)
            ne.a.a(r19)
            int r2 = r18.length()
            r3 = 0
            if (r2 != 0) goto L_0x0014
            return r3
        L_0x0014:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            int r6 = kotlin.jvm.internal.m.f(r5, r6)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 1
            if (r6 >= 0) goto L_0x0039
            if (r2 != r9) goto L_0x002a
            return r3
        L_0x002a:
            r6 = 45
            if (r5 != r6) goto L_0x0032
            r7 = -9223372036854775808
            r4 = 1
            goto L_0x003a
        L_0x0032:
            r6 = 43
            if (r5 != r6) goto L_0x0038
            r4 = 1
            goto L_0x0039
        L_0x0038:
            return r3
        L_0x0039:
            r9 = 0
        L_0x003a:
            r5 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r10 = 0
            r12 = r5
        L_0x0042:
            if (r4 >= r2) goto L_0x0073
            char r14 = r0.charAt(r4)
            int r14 = ne.a.b(r14, r1)
            if (r14 >= 0) goto L_0x004f
            return r3
        L_0x004f:
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x005f
            int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r15 != 0) goto L_0x005e
            long r12 = (long) r1
            long r12 = r7 / r12
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x005f
        L_0x005e:
            return r3
        L_0x005f:
            long r5 = (long) r1
            long r10 = r10 * r5
            long r5 = (long) r14
            long r16 = r7 + r5
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x006a
            return r3
        L_0x006a:
            long r10 = r10 - r5
            int r4 = r4 + 1
            r5 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            goto L_0x0042
        L_0x0073:
            if (r9 == 0) goto L_0x007a
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            goto L_0x007f
        L_0x007a:
            long r0 = -r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.n.i(java.lang.String, int):java.lang.Long");
    }
}
