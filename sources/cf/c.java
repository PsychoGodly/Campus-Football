package cf;

import bf.a0;
import bf.q;
import bf.r;
import bf.t;
import bf.y;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import lf.e;
import lf.f;
import lf.s;

/* compiled from: Util */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f31983a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f31984b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public static final a0 f31985c;

    /* renamed from: d  reason: collision with root package name */
    public static final y f31986d;

    /* renamed from: e  reason: collision with root package name */
    private static final f f31987e = f.e("efbbbf");

    /* renamed from: f  reason: collision with root package name */
    private static final f f31988f = f.e("feff");

    /* renamed from: g  reason: collision with root package name */
    private static final f f31989g = f.e("fffe");

    /* renamed from: h  reason: collision with root package name */
    private static final f f31990h = f.e("0000ffff");

    /* renamed from: i  reason: collision with root package name */
    private static final f f31991i = f.e("ffff0000");

    /* renamed from: j  reason: collision with root package name */
    public static final Charset f31992j = Charset.forName("UTF-8");

    /* renamed from: k  reason: collision with root package name */
    public static final Charset f31993k = Charset.forName("ISO-8859-1");

    /* renamed from: l  reason: collision with root package name */
    private static final Charset f31994l = Charset.forName("UTF-16BE");

    /* renamed from: m  reason: collision with root package name */
    private static final Charset f31995m = Charset.forName("UTF-16LE");

    /* renamed from: n  reason: collision with root package name */
    private static final Charset f31996n = Charset.forName("UTF-32BE");

    /* renamed from: o  reason: collision with root package name */
    private static final Charset f31997o = Charset.forName("UTF-32LE");

    /* renamed from: p  reason: collision with root package name */
    public static final TimeZone f31998p = TimeZone.getTimeZone("GMT");

    /* renamed from: q  reason: collision with root package name */
    public static final Comparator<String> f31999q = new a();

    /* renamed from: r  reason: collision with root package name */
    private static final Method f32000r;

    /* renamed from: s  reason: collision with root package name */
    private static final Pattern f32001s = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* compiled from: Util */
    class a implements Comparator<String> {
        a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* compiled from: Util */
    class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f32002a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f32003b;

        b(String str, boolean z10) {
            this.f32002a = str;
            this.f32003b = z10;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f32002a);
            thread.setDaemon(this.f32003b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f31983a = bArr;
        Method method = null;
        f31985c = a0.q((t) null, bArr);
        f31986d = y.d((t) null, bArr);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
        f32000r = method;
    }

    public static boolean A(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean B(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static X509TrustManager C() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e10) {
            throw b("No System TLS", e10);
        }
    }

    public static boolean D(s sVar, int i10, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long c10 = sVar.e().e() ? sVar.e().c() - nanoTime : Long.MAX_VALUE;
        sVar.e().d(Math.min(c10, timeUnit.toNanos((long) i10)) + nanoTime);
        try {
            lf.c cVar = new lf.c();
            while (sVar.P(cVar, 8192) != -1) {
                cVar.i();
            }
            if (c10 == Long.MAX_VALUE) {
                sVar.e().a();
            } else {
                sVar.e().d(nanoTime + c10);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c10 == Long.MAX_VALUE) {
                sVar.e().a();
            } else {
                sVar.e().d(nanoTime + c10);
            }
            return false;
        } catch (Throwable th) {
            if (c10 == Long.MAX_VALUE) {
                sVar.e().a();
            } else {
                sVar.e().d(nanoTime + c10);
            }
            throw th;
        }
    }

    public static int E(String str, int i10, int i11) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int F(String str, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            char charAt = str.charAt(i12);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i12 + 1;
            }
        }
        return i10;
    }

    public static ThreadFactory G(String str, boolean z10) {
        return new b(str, z10);
    }

    public static q H(List<hf.c> list) {
        q.a aVar = new q.a();
        for (hf.c next : list) {
            a.f31981a.b(aVar, next.f33084a.u(), next.f33085b.u());
        }
        return aVar.d();
    }

    public static String I(String str, int i10, int i11) {
        int E = E(str, i10, i11);
        return str.substring(E, F(str, E, i11));
    }

    public static boolean J(String str) {
        return f32001s.matcher(str).matches();
    }

    public static void a(Throwable th, Throwable th2) {
        Method method = f32000r;
        if (method != null) {
            try {
                method.invoke(th, new Object[]{th2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static AssertionError b(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    public static Charset c(e eVar, Charset charset) throws IOException {
        f fVar = f31987e;
        if (eVar.d0(0, fVar)) {
            eVar.skip((long) fVar.p());
            return f31992j;
        }
        f fVar2 = f31988f;
        if (eVar.d0(0, fVar2)) {
            eVar.skip((long) fVar2.p());
            return f31994l;
        }
        f fVar3 = f31989g;
        if (eVar.d0(0, fVar3)) {
            eVar.skip((long) fVar3.p());
            return f31995m;
        }
        f fVar4 = f31990h;
        if (eVar.d0(0, fVar4)) {
            eVar.skip((long) fVar4.p());
            return f31996n;
        }
        f fVar5 = f31991i;
        if (!eVar.d0(0, fVar5)) {
            return charset;
        }
        eVar.skip((long) fVar5.p());
        return f31997o;
    }

    public static String d(String str) {
        InetAddress inetAddress;
        if (str.contains(":")) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = m(str, 0, str.length());
            } else {
                inetAddress = m(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                return y(address);
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !j(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static int e(String str, long j10, TimeUnit timeUnit) {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 >= 0) {
            Objects.requireNonNull(timeUnit, "unit == null");
            long millis = timeUnit.toMillis(j10);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            } else if (millis != 0 || i10 <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(str + " too small.");
            }
        } else {
            throw new IllegalArgumentException(str + " < 0");
        }
    }

    public static void f(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static void h(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e10) {
                if (!A(e10)) {
                    throw e10;
                }
            } catch (RuntimeException e11) {
                if (!"bio == null".equals(e11.getMessage())) {
                    throw e11;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static String[] i(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    private static boolean j(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int k(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    private static boolean l(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char charAt = str.charAt(i14);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i14++;
                }
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        if (i13 != i12 + 4) {
            return false;
        }
        return true;
    }

    private static InetAddress m(String str, int i10, int i11) {
        byte[] bArr = new byte[16];
        int i12 = 0;
        int i13 = -1;
        int i14 = -1;
        while (true) {
            if (i10 >= i11) {
                break;
            } else if (i12 == 16) {
                return null;
            } else {
                int i15 = i10 + 2;
                if (i15 > i11 || !str.regionMatches(i10, "::", 0, 2)) {
                    if (i12 != 0) {
                        if (str.regionMatches(i10, ":", 0, 1)) {
                            i10++;
                        } else if (!str.regionMatches(i10, ".", 0, 1) || !l(str, i14, i11, bArr, i12 - 2)) {
                            return null;
                        } else {
                            i12 += 2;
                        }
                    }
                    i14 = i10;
                } else if (i13 != -1) {
                    return null;
                } else {
                    i12 += 2;
                    i13 = i12;
                    if (i15 == i11) {
                        break;
                    }
                    i14 = i15;
                }
                i10 = i14;
                int i16 = 0;
                while (i10 < i11) {
                    int k10 = k(str.charAt(i10));
                    if (k10 == -1) {
                        break;
                    }
                    i16 = (i16 << 4) + k10;
                    i10++;
                }
                int i17 = i10 - i14;
                if (i17 == 0 || i17 > 4) {
                    return null;
                }
                int i18 = i12 + 1;
                bArr[i12] = (byte) ((i16 >>> 8) & 255);
                i12 = i18 + 1;
                bArr[i18] = (byte) (i16 & 255);
            }
        }
        if (i12 != 16) {
            if (i13 == -1) {
                return null;
            }
            int i19 = i12 - i13;
            System.arraycopy(bArr, i13, bArr, 16 - i19, i19);
            Arrays.fill(bArr, i13, (16 - i12) + i13, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    public static int n(String str, int i10, int i11, char c10) {
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int o(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static boolean p(s sVar, int i10, TimeUnit timeUnit) {
        try {
            return D(sVar, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean q(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String r(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String s(r rVar, boolean z10) {
        String str;
        if (rVar.l().contains(":")) {
            str = "[" + rVar.l() + "]";
        } else {
            str = rVar.l();
        }
        if (!z10 && rVar.w() == r.d(rVar.B())) {
            return str;
        }
        return str + ":" + rVar.w();
    }

    public static <T> List<T> t(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> u(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static <K, V> Map<K, V> v(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static int w(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static int x(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt >= 127) {
                return i10;
            }
        }
        return -1;
    }

    private static String y(byte[] bArr) {
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i11 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        lf.c cVar = new lf.c();
        while (i10 < bArr.length) {
            if (i10 == i11) {
                cVar.G(58);
                i10 += i13;
                if (i10 == 16) {
                    cVar.G(58);
                }
            } else {
                if (i10 > 0) {
                    cVar.G(58);
                }
                cVar.b0((long) (((bArr[i10] & 255) << 8) | (bArr[i10 + 1] & 255)));
                i10 += 2;
            }
        }
        return cVar.l0();
    }

    public static String[] z(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i10++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
