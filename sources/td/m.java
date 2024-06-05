package td;

import com.applovin.mediation.MaxReward;
import fe.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: _Arrays.kt */
class m extends l {
    public static final String A(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super Long, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.m.e(jArr, "<this>");
        kotlin.jvm.internal.m.e(charSequence, "separator");
        kotlin.jvm.internal.m.e(charSequence2, "prefix");
        kotlin.jvm.internal.m.e(charSequence3, "postfix");
        kotlin.jvm.internal.m.e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) u(jArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        kotlin.jvm.internal.m.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final <T> String B(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.m.e(tArr, "<this>");
        kotlin.jvm.internal.m.e(charSequence, "separator");
        kotlin.jvm.internal.m.e(charSequence2, "prefix");
        kotlin.jvm.internal.m.e(charSequence3, "postfix");
        kotlin.jvm.internal.m.e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) v(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        kotlin.jvm.internal.m.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final String C(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super Short, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.m.e(sArr, "<this>");
        kotlin.jvm.internal.m.e(charSequence, "separator");
        kotlin.jvm.internal.m.e(charSequence2, "prefix");
        kotlin.jvm.internal.m.e(charSequence3, "postfix");
        kotlin.jvm.internal.m.e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) w(sArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        kotlin.jvm.internal.m.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String D(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        int i12 = i11 & 2;
        CharSequence charSequence5 = MaxReward.DEFAULT_LABEL;
        CharSequence charSequence6 = i12 != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i13 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return x(dArr, charSequence, charSequence6, charSequence5, i13, charSequence7, lVar);
    }

    public static /* synthetic */ String E(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        int i12 = i11 & 2;
        CharSequence charSequence5 = MaxReward.DEFAULT_LABEL;
        CharSequence charSequence6 = i12 != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i13 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return y(fArr, charSequence, charSequence6, charSequence5, i13, charSequence7, lVar);
    }

    public static /* synthetic */ String F(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        int i12 = i11 & 2;
        CharSequence charSequence5 = MaxReward.DEFAULT_LABEL;
        CharSequence charSequence6 = i12 != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i13 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return z(iArr, charSequence, charSequence6, charSequence5, i13, charSequence7, lVar);
    }

    public static /* synthetic */ String G(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        int i12 = i11 & 2;
        CharSequence charSequence5 = MaxReward.DEFAULT_LABEL;
        CharSequence charSequence6 = i12 != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i13 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return A(jArr, charSequence, charSequence6, charSequence5, i13, charSequence7, lVar);
    }

    public static /* synthetic */ String H(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        int i12 = i11 & 2;
        CharSequence charSequence5 = MaxReward.DEFAULT_LABEL;
        CharSequence charSequence6 = i12 != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i13 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return B(objArr, charSequence, charSequence6, charSequence5, i13, charSequence7, lVar);
    }

    public static /* synthetic */ String I(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        int i12 = i11 & 2;
        CharSequence charSequence5 = MaxReward.DEFAULT_LABEL;
        CharSequence charSequence6 = i12 != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i13 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return C(sArr, charSequence, charSequence6, charSequence5, i13, charSequence7, lVar);
    }

    public static char J(char[] cArr) {
        kotlin.jvm.internal.m.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static <T> T K(T[] tArr) {
        kotlin.jvm.internal.m.e(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> List<T> L(T[] tArr, int i10) {
        kotlin.jvm.internal.m.e(tArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return q.d();
        } else {
            int length = tArr.length;
            if (i10 >= length) {
                return R(tArr);
            }
            if (i10 == 1) {
                return p.b(tArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = length - i10; i11 < length; i11++) {
                arrayList.add(tArr[i11]);
            }
            return arrayList;
        }
    }

    public static List<Byte> M(byte[] bArr) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return q.d();
        }
        if (length != 1) {
            return T(bArr);
        }
        return p.b(Byte.valueOf(bArr[0]));
    }

    public static List<Double> N(double[] dArr) {
        kotlin.jvm.internal.m.e(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return q.d();
        }
        if (length != 1) {
            return U(dArr);
        }
        return p.b(Double.valueOf(dArr[0]));
    }

    public static List<Float> O(float[] fArr) {
        kotlin.jvm.internal.m.e(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return q.d();
        }
        if (length != 1) {
            return V(fArr);
        }
        return p.b(Float.valueOf(fArr[0]));
    }

    public static List<Integer> P(int[] iArr) {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return q.d();
        }
        if (length != 1) {
            return W(iArr);
        }
        return p.b(Integer.valueOf(iArr[0]));
    }

    public static List<Long> Q(long[] jArr) {
        kotlin.jvm.internal.m.e(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return q.d();
        }
        if (length != 1) {
            return X(jArr);
        }
        return p.b(Long.valueOf(jArr[0]));
    }

    public static <T> List<T> R(T[] tArr) {
        kotlin.jvm.internal.m.e(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return q.d();
        }
        if (length != 1) {
            return Y(tArr);
        }
        return p.b(tArr[0]);
    }

    public static List<Short> S(short[] sArr) {
        kotlin.jvm.internal.m.e(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return q.d();
        }
        if (length != 1) {
            return Z(sArr);
        }
        return p.b(Short.valueOf(sArr[0]));
    }

    public static final List<Byte> T(byte[] bArr) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte valueOf : bArr) {
            arrayList.add(Byte.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final List<Double> U(double[] dArr) {
        kotlin.jvm.internal.m.e(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double valueOf : dArr) {
            arrayList.add(Double.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final List<Float> V(float[] fArr) {
        kotlin.jvm.internal.m.e(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final List<Integer> W(int[] iArr) {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final List<Long> X(long[] jArr) {
        kotlin.jvm.internal.m.e(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final <T> List<T> Y(T[] tArr) {
        kotlin.jvm.internal.m.e(tArr, "<this>");
        return new ArrayList(q.c(tArr));
    }

    public static final List<Short> Z(short[] sArr) {
        kotlin.jvm.internal.m.e(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short valueOf : sArr) {
            arrayList.add(Short.valueOf(valueOf));
        }
        return arrayList;
    }

    public static boolean h(char[] cArr, char c10) {
        kotlin.jvm.internal.m.e(cArr, "<this>");
        return p(cArr, c10) >= 0;
    }

    public static <T> boolean i(T[] tArr, T t10) {
        kotlin.jvm.internal.m.e(tArr, "<this>");
        return q(tArr, t10) >= 0;
    }

    public static <T> List<T> j(T[] tArr, int i10) {
        kotlin.jvm.internal.m.e(tArr, "<this>");
        if (i10 >= 0) {
            return L(tArr, i.a(tArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> List<T> k(T[] tArr) {
        kotlin.jvm.internal.m.e(tArr, "<this>");
        return (List) l(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C l(T[] tArr, C c10) {
        kotlin.jvm.internal.m.e(tArr, "<this>");
        kotlin.jvm.internal.m.e(c10, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    public static <T> T m(T[] tArr) {
        kotlin.jvm.internal.m.e(tArr, "<this>");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> int n(T[] tArr) {
        kotlin.jvm.internal.m.e(tArr, "<this>");
        return tArr.length - 1;
    }

    public static <T> T o(T[] tArr, int i10) {
        kotlin.jvm.internal.m.e(tArr, "<this>");
        if (i10 < 0 || i10 > n(tArr)) {
            return null;
        }
        return tArr[i10];
    }

    public static final int p(char[] cArr, char c10) {
        kotlin.jvm.internal.m.e(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final <T> int q(T[] tArr, T t10) {
        kotlin.jvm.internal.m.e(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (kotlin.jvm.internal.m.a(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <A extends Appendable> A r(double[] dArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super Double, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.m.e(dArr, "<this>");
        kotlin.jvm.internal.m.e(a10, "buffer");
        kotlin.jvm.internal.m.e(charSequence, "separator");
        kotlin.jvm.internal.m.e(charSequence2, "prefix");
        kotlin.jvm.internal.m.e(charSequence3, "postfix");
        kotlin.jvm.internal.m.e(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (double d10 : dArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                a10.append((CharSequence) lVar.invoke(Double.valueOf(d10)));
            } else {
                a10.append(String.valueOf(d10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <A extends Appendable> A s(float[] fArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super Float, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.m.e(fArr, "<this>");
        kotlin.jvm.internal.m.e(a10, "buffer");
        kotlin.jvm.internal.m.e(charSequence, "separator");
        kotlin.jvm.internal.m.e(charSequence2, "prefix");
        kotlin.jvm.internal.m.e(charSequence3, "postfix");
        kotlin.jvm.internal.m.e(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (float f10 : fArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                a10.append((CharSequence) lVar.invoke(Float.valueOf(f10)));
            } else {
                a10.append(String.valueOf(f10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <A extends Appendable> A t(int[] iArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        kotlin.jvm.internal.m.e(a10, "buffer");
        kotlin.jvm.internal.m.e(charSequence, "separator");
        kotlin.jvm.internal.m.e(charSequence2, "prefix");
        kotlin.jvm.internal.m.e(charSequence3, "postfix");
        kotlin.jvm.internal.m.e(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (int i12 : iArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                a10.append((CharSequence) lVar.invoke(Integer.valueOf(i12)));
            } else {
                a10.append(String.valueOf(i12));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <A extends Appendable> A u(long[] jArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super Long, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.m.e(jArr, "<this>");
        kotlin.jvm.internal.m.e(a10, "buffer");
        kotlin.jvm.internal.m.e(charSequence, "separator");
        kotlin.jvm.internal.m.e(charSequence2, "prefix");
        kotlin.jvm.internal.m.e(charSequence3, "postfix");
        kotlin.jvm.internal.m.e(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (long j10 : jArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                a10.append((CharSequence) lVar.invoke(Long.valueOf(j10)));
            } else {
                a10.append(String.valueOf(j10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <T, A extends Appendable> A v(T[] tArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.m.e(tArr, "<this>");
        kotlin.jvm.internal.m.e(a10, "buffer");
        kotlin.jvm.internal.m.e(charSequence, "separator");
        kotlin.jvm.internal.m.e(charSequence2, "prefix");
        kotlin.jvm.internal.m.e(charSequence3, "postfix");
        kotlin.jvm.internal.m.e(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : tArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            g.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <A extends Appendable> A w(short[] sArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super Short, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.m.e(sArr, "<this>");
        kotlin.jvm.internal.m.e(a10, "buffer");
        kotlin.jvm.internal.m.e(charSequence, "separator");
        kotlin.jvm.internal.m.e(charSequence2, "prefix");
        kotlin.jvm.internal.m.e(charSequence3, "postfix");
        kotlin.jvm.internal.m.e(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (short s10 : sArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                a10.append((CharSequence) lVar.invoke(Short.valueOf(s10)));
            } else {
                a10.append(String.valueOf(s10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final String x(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super Double, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.m.e(dArr, "<this>");
        kotlin.jvm.internal.m.e(charSequence, "separator");
        kotlin.jvm.internal.m.e(charSequence2, "prefix");
        kotlin.jvm.internal.m.e(charSequence3, "postfix");
        kotlin.jvm.internal.m.e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) r(dArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        kotlin.jvm.internal.m.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final String y(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super Float, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.m.e(fArr, "<this>");
        kotlin.jvm.internal.m.e(charSequence, "separator");
        kotlin.jvm.internal.m.e(charSequence2, "prefix");
        kotlin.jvm.internal.m.e(charSequence3, "postfix");
        kotlin.jvm.internal.m.e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) s(fArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        kotlin.jvm.internal.m.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final String z(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        kotlin.jvm.internal.m.e(charSequence, "separator");
        kotlin.jvm.internal.m.e(charSequence2, "prefix");
        kotlin.jvm.internal.m.e(charSequence3, "postfix");
        kotlin.jvm.internal.m.e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) t(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        kotlin.jvm.internal.m.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }
}
