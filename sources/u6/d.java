package u6;

/* compiled from: MathPreconditions */
final class d {
    static void a(boolean z10, String str, long j10, long j11) {
        if (!z10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 54);
            sb2.append("overflow: ");
            sb2.append(str);
            sb2.append("(");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append(")");
            throw new ArithmeticException(sb2.toString());
        }
    }

    static int b(String str, int i10) {
        if (i10 > 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(i10);
        sb2.append(") must be > 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    static void c(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
