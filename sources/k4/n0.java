package k4;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import com.facebook.ads.AdError;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import n2.g3;
import n2.r1;
import n2.y2;
import r6.c;
import r6.e;

/* compiled from: Util */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f19738a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f19739b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f19740c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f19741d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f19742e;

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f19743f = new byte[0];

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f19744g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f19745h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f19746i = Pattern.compile("%([A-Fa-f0-9]{2})");

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f19747j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);

    /* renamed from: k  reason: collision with root package name */
    private static HashMap<String, String> f19748k;

    /* renamed from: l  reason: collision with root package name */
    private static final String[] f19749l = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f19750m = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f19751n = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f19752o = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, R.styleable.AppCompatTheme_tooltipFrameBackground, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};

    static {
        int i10 = Build.VERSION.SDK_INT;
        f19738a = i10;
        String str = Build.DEVICE;
        f19739b = str;
        String str2 = Build.MANUFACTURER;
        f19740c = str2;
        String str3 = Build.MODEL;
        f19741d = str3;
        f19742e = str + ", " + str3 + ", " + str2 + ", " + i10;
    }

    private static HashMap<String, String> A() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f19749l.length);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f19749l;
            if (i10 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    private static String A0(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f19750m;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                return strArr[i10 + 1] + str.substring(strArr[i10].length());
            }
            i10 += 2;
        }
    }

    public static Uri B(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f19747j.matcher(path);
        return (!matcher.matches() || matcher.group(1) != null) ? uri : Uri.withAppendedPath(uri, "Manifest");
    }

    public static <T> void B0(List<T> list, int i10, int i11, int i12) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(list.remove(i10 + i13));
        }
        list.addAll(Math.min(i12, list.size()), arrayDeque);
    }

    public static String C(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static long C0(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static String D(byte[] bArr) {
        return new String(bArr, e.f29803c);
    }

    public static ExecutorService D0(String str) {
        return Executors.newSingleThreadExecutor(new m0(str));
    }

    public static String E(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, e.f29803c);
    }

    public static String E0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String e10 = c.e(str);
        String str2 = S0(e10, "-")[0];
        if (f19748k == null) {
            f19748k = A();
        }
        String str3 = f19748k.get(str2);
        if (str3 != null) {
            e10 = str3 + e10.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? A0(e10) : e10;
    }

    public static int F(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static <T> T[] F0(T[] tArr, T t10) {
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length + 1);
        copyOf[tArr.length] = t10;
        return k(copyOf);
    }

    public static int G(int i10) {
        if (i10 == 12) {
            return 743676;
        }
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    public static <T> T[] G0(T[] tArr, T[] tArr2) {
        T[] copyOf = Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, copyOf, tArr.length, tArr2.length);
        return copyOf;
    }

    public static g3.b H(g3 g3Var, g3.b bVar) {
        boolean i10 = g3Var.i();
        boolean z10 = g3Var.z();
        boolean r10 = g3Var.r();
        boolean E = g3Var.E();
        boolean M = g3Var.M();
        boolean H = g3Var.H();
        boolean u10 = g3Var.J().u();
        boolean z11 = false;
        g3.b.a d10 = new g3.b.a().b(bVar).d(4, !i10).d(5, z10 && !i10).d(6, r10 && !i10).d(7, !u10 && (r10 || !M || z10) && !i10).d(8, E && !i10).d(9, !u10 && (E || (M && H)) && !i10).d(10, !i10).d(11, z10 && !i10);
        if (z10 && !i10) {
            z11 = true;
        }
        return d10.d(12, z11).e();
    }

    public static <T> T[] H0(T[] tArr, int i10) {
        a.a(i10 <= tArr.length);
        return Arrays.copyOf(tArr, i10);
    }

    public static int I(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static <T> T[] I0(T[] tArr, int i10, int i11) {
        boolean z10 = true;
        a.a(i10 >= 0);
        if (i11 > tArr.length) {
            z10 = false;
        }
        a.a(z10);
        return Arrays.copyOfRange(tArr, i10, i11);
    }

    public static byte[] J(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((Character.digit(str.charAt(i11), 16) << 4) + Character.digit(str.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    public static long J0(String str) throws y2 {
        Matcher matcher = f19744g.matcher(str);
        if (matcher.matches()) {
            int i10 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i10 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    i10 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            return i10 != 0 ? timeInMillis - (((long) i10) * 60000) : timeInMillis;
        }
        throw y2.a("Invalid date/time format: " + str, (Throwable) null);
    }

    public static int K(String str, int i10) {
        int i11 = 0;
        for (String m10 : T0(str)) {
            if (i10 == v.m(m10)) {
                i11++;
            }
        }
        return i11;
    }

    public static long K0(String str) {
        Matcher matcher = f19745h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d10 = 0.0d;
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        if (group6 != null) {
            d10 = Double.parseDouble(group6);
        }
        long j10 = (long) ((parseDouble5 + d10) * 1000.0d);
        return isEmpty ? -j10 : j10;
    }

    public static String L(String str, int i10) {
        String[] T0 = T0(str);
        if (T0.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : T0) {
            if (i10 == v.m(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static boolean L0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static String M(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    public static boolean M0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static String N(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return c.f(networkCountryIso);
            }
        }
        return c.f(Locale.getDefault().getCountry());
    }

    public static <T> void N0(List<T> list, int i10, int i11) {
        if (i10 < 0 || i11 > list.size() || i10 > i11) {
            throw new IllegalArgumentException();
        } else if (i10 != i11) {
            list.subList(i10, i11).clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = (android.hardware.display.DisplayManager) r2.getSystemService("display");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point O(android.content.Context r2) {
        /*
            int r0 = f19738a
            r1 = 17
            if (r0 < r1) goto L_0x0016
            java.lang.String r0 = "display"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            if (r0 == 0) goto L_0x0016
            r1 = 0
            android.view.Display r0 = r0.getDisplay(r1)
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "window"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            java.lang.Object r0 = k4.a.e(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
        L_0x002b:
            android.graphics.Point r2 = P(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.n0.O(android.content.Context):android.graphics.Point");
    }

    public static long O0(long j10, long j11, long j12) {
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 >= 0 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (i10 < 0 && j11 % j12 == 0) {
            return j10 * (j11 / j12);
        }
        return (long) (((double) j10) * (((double) j11) / ((double) j12)));
    }

    public static Point P(Context context, Display display) {
        String str;
        if (display.getDisplayId() == 0 && x0(context)) {
            if (f19738a < 28) {
                str = j0("sys.display-size");
            } else {
                str = j0("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] R0 = R0(str.trim(), "x");
                    if (R0.length == 2) {
                        int parseInt = Integer.parseInt(R0[0]);
                        int parseInt2 = Integer.parseInt(R0[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                r.c("Util", "Invalid display size: " + str);
            }
            if ("Sony".equals(f19740c) && f19741d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i10 = f19738a;
        if (i10 >= 23) {
            T(display, point);
        } else if (i10 >= 17) {
            S(display, point);
        } else {
            R(display, point);
        }
        return point;
    }

    public static long[] P0(List<Long> list, long j10, long j11) {
        int size = list.size();
        long[] jArr = new long[size];
        int i10 = 0;
        int i11 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i11 >= 0 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < size) {
                jArr[i10] = list.get(i10).longValue() / j12;
                i10++;
            }
        } else if (i11 >= 0 || j10 % j11 != 0) {
            double d10 = ((double) j10) / ((double) j11);
            while (i10 < size) {
                jArr[i10] = (long) (((double) list.get(i10).longValue()) * d10);
                i10++;
            }
        } else {
            long j13 = j10 / j11;
            while (i10 < size) {
                jArr[i10] = list.get(i10).longValue() * j13;
                i10++;
            }
        }
        return jArr;
    }

    public static Looper Q() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static void Q0(long[] jArr, long j10, long j11) {
        int i10 = 0;
        int i11 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i11 >= 0 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j12;
                i10++;
            }
        } else if (i11 >= 0 || j10 % j11 != 0) {
            double d10 = ((double) j10) / ((double) j11);
            while (i10 < jArr.length) {
                jArr[i10] = (long) (((double) jArr[i10]) * d10);
                i10++;
            }
        } else {
            long j13 = j10 / j11;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] * j13;
                i10++;
            }
        }
    }

    private static void R(Display display, Point point) {
        display.getSize(point);
    }

    public static String[] R0(String str, String str2) {
        return str.split(str2, -1);
    }

    private static void S(Display display, Point point) {
        display.getRealSize(point);
    }

    public static String[] S0(String str, String str2) {
        return str.split(str2, 2);
    }

    private static void T(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static String[] T0(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return R0(str.trim(), "(\\s*,\\s*)");
    }

    public static int U(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i10) {
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    public static long U0(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    public static int V(String str) {
        String[] R0;
        int length;
        if (str == null || (length = R0.length) < 2) {
            return 0;
        }
        String str2 = (R0 = R0(str, "_"))[length - 1];
        boolean z10 = length >= 3 && "neg".equals(R0[length - 2]);
        try {
            int parseInt = Integer.parseInt((String) a.e(str2));
            return z10 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static byte[] V0(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static String W(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static long W0(int i10, int i11) {
        return X0(i11) | (X0(i10) << 32);
    }

    public static String X(Locale locale) {
        return f19738a >= 21 ? Y(locale) : locale.toString();
    }

    public static long X0(int i10) {
        return ((long) i10) & 4294967295L;
    }

    private static String Y(Locale locale) {
        return locale.toLanguageTag();
    }

    public static CharSequence Y0(CharSequence charSequence, int i10) {
        return charSequence.length() <= i10 ? charSequence : charSequence.subSequence(0, i10);
    }

    public static long Z(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(((double) j10) * ((double) f10));
    }

    public static long Z0(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static long a0(long j10) {
        if (j10 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j10 + SystemClock.elapsedRealtime();
    }

    public static void a1(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static long b(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    public static int b0(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static r1 c0(int i10, int i11, int i12) {
        return new r1.b().g0("audio/raw").J(i11).h0(i12).a0(i10).G();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends java.lang.Comparable<? super T>> int d(java.util.List<? extends java.lang.Comparable<? super T>> r3, T r4, boolean r5, boolean r6) {
        /*
            int r0 = java.util.Collections.binarySearch(r3, r4)
            if (r0 >= 0) goto L_0x0008
            int r4 = ~r0
            goto L_0x0023
        L_0x0008:
            int r1 = r3.size()
        L_0x000c:
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x001d
            java.lang.Object r2 = r3.get(r0)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r2.compareTo(r4)
            if (r2 != 0) goto L_0x001d
            goto L_0x000c
        L_0x001d:
            if (r5 == 0) goto L_0x0022
            int r4 = r0 + -1
            goto L_0x0023
        L_0x0022:
            r4 = r0
        L_0x0023:
            if (r6 == 0) goto L_0x002f
            int r3 = r3.size()
            int r3 = r3 + -1
            int r4 = java.lang.Math.min(r3, r4)
        L_0x002f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.n0.d(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    public static int d0(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 268435456) {
                    if (i10 == 536870912) {
                        return i11 * 3;
                    }
                    if (i10 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i11 * 4;
        }
        return i11 * 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int e(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0008
            int r5 = ~r0
            goto L_0x001a
        L_0x0008:
            int r0 = r0 + 1
            int r1 = r4.length
            if (r0 >= r1) goto L_0x0014
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0014
            goto L_0x0008
        L_0x0014:
            if (r7 == 0) goto L_0x0019
            int r5 = r0 + -1
            goto L_0x001a
        L_0x0019:
            r5 = r0
        L_0x001a:
            if (r8 == 0) goto L_0x0023
            int r4 = r4.length
            int r4 = r4 + -1
            int r5 = java.lang.Math.min(r4, r5)
        L_0x0023:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.n0.e(long[], long, boolean, boolean):int");
    }

    public static long e0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(((double) j10) / ((double) f10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends java.lang.Comparable<? super T>> int f(java.util.List<? extends java.lang.Comparable<? super T>> r2, T r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Collections.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0021
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x001b
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r3)
            if (r1 != 0) goto L_0x001b
            goto L_0x000a
        L_0x001b:
            if (r4 == 0) goto L_0x0020
            int r2 = r0 + 1
            goto L_0x0021
        L_0x0020:
            r2 = r0
        L_0x0021:
            if (r5 == 0) goto L_0x0028
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.n0.f(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    public static int f0(int i10) {
        if (i10 == 13) {
            return 1;
        }
        switch (i10) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static int g(s sVar, long j10, boolean z10, boolean z11) {
        int i10;
        int c10 = sVar.c() - 1;
        int i11 = 0;
        while (i11 <= c10) {
            int i12 = (i11 + c10) >>> 1;
            if (sVar.b(i12) < j10) {
                i11 = i12 + 1;
            } else {
                c10 = i12 - 1;
            }
        }
        if (z10 && (i10 = c10 + 1) < sVar.c() && sVar.b(i10) == j10) {
            return i10;
        }
        if (!z11 || c10 != -1) {
            return c10;
        }
        return 0;
    }

    public static String[] g0() {
        String[] h02 = h0();
        for (int i10 = 0; i10 < h02.length; i10++) {
            h02[i10] = E0(h02[i10]);
        }
        return h02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int h(int[] r2, int r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0019
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0013
            r1 = r2[r0]
            if (r1 != r3) goto L_0x0013
            goto L_0x000a
        L_0x0013:
            if (r4 == 0) goto L_0x0018
            int r2 = r0 + 1
            goto L_0x0019
        L_0x0018:
            r2 = r0
        L_0x0019:
            if (r5 == 0) goto L_0x0020
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.n0.h(int[], int, boolean, boolean):int");
    }

    private static String[] h0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (f19738a >= 24) {
            return i0(configuration);
        }
        return new String[]{X(configuration.locale)};
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int i(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r4 = -r0
            goto L_0x001b
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0015
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0015
            goto L_0x000a
        L_0x0015:
            if (r7 == 0) goto L_0x001a
            int r4 = r0 + 1
            goto L_0x001b
        L_0x001a:
            r4 = r0
        L_0x001b:
            if (r8 == 0) goto L_0x0022
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
        L_0x0022:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.n0.i(long[], long, boolean, boolean):int");
    }

    private static String[] i0(Configuration configuration) {
        return R0(configuration.getLocales().toLanguageTags(), ",");
    }

    public static <T> T j(T t10) {
        return t10;
    }

    private static String j0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e10) {
            r.d("Util", "Failed to read system property " + str, e10);
            return null;
        }
    }

    public static <T> T[] k(T[] tArr) {
        return tArr;
    }

    public static String k0(int i10) {
        switch (i10) {
            case IntegrityErrorCode.PLAY_STORE_NOT_FOUND /*-2*/:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return MimeTypes.BASE_TYPE_AUDIO;
            case 2:
                return MimeTypes.BASE_TYPE_VIDEO;
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i10 < 10000) {
                    return "?";
                }
                return "custom (" + i10 + ")";
        }
    }

    public static int l(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static String l0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") " + "ExoPlayerLib/2.18.7";
    }

    public static long m(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    public static byte[] m0(String str) {
        return str.getBytes(e.f29803c);
    }

    public static void n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int n0(Uri uri) {
        int o02;
        String scheme = uri.getScheme();
        if (scheme != null && c.a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0 && (o02 = o0(lastPathSegment.substring(lastIndexOf + 1))) != 4) {
            return o02;
        }
        Matcher matcher = f19747j.matcher((CharSequence) a.e(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (group.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static int o(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 == 0 ? 0 : 1;
    }

    public static int o0(String str) {
        String e10 = c.e(str);
        e10.hashCode();
        char c10 = 65535;
        switch (e10.hashCode()) {
            case 104579:
                if (e10.equals("ism")) {
                    c10 = 0;
                    break;
                }
                break;
            case 108321:
                if (e10.equals("mpd")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3242057:
                if (e10.equals("isml")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3299913:
                if (e10.equals("m3u8")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 2:
                return 1;
            case 1:
                return 0;
            case 3:
                return 2;
            default:
                return 4;
        }
    }

    public static float p(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int p0(Uri uri, String str) {
        if (str == null) {
            return n0(uri);
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    c10 = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    c10 = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 0;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    public static int q(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static boolean q0(a0 a0Var, a0 a0Var2, Inflater inflater) {
        if (a0Var.a() <= 0) {
            return false;
        }
        if (a0Var2.b() < a0Var.a()) {
            a0Var2.c(a0Var.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(a0Var.e(), a0Var.f(), a0Var.a());
        int i10 = 0;
        while (true) {
            try {
                i10 += inflater.inflate(a0Var2.e(), i10, a0Var2.b() - i10);
                if (inflater.finished()) {
                    a0Var2.S(i10);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else if (i10 == a0Var2.b()) {
                    a0Var2.c(a0Var2.b() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static long r(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static String r0(int i10) {
        return Integer.toString(i10, 36);
    }

    public static boolean s(Object[] objArr, Object obj) {
        for (Object c10 : objArr) {
            if (c(c10, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s0(Context context) {
        return f19738a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static int t(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f19751n[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static boolean t0(int i10) {
        return i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static int u(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f19752o[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    public static boolean u0(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static Handler v(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static boolean v0(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static Handler w() {
        return x((Handler.Callback) null);
    }

    public static boolean w0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static Handler x(Handler.Callback callback) {
        return v((Looper) a.h(Looper.myLooper()), callback);
    }

    public static boolean x0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static Handler y() {
        return z((Handler.Callback) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Thread y0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static Handler z(Handler.Callback callback) {
        return v(Q(), callback);
    }

    public static int z0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }
}
