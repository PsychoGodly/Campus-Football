package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
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
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzew {
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;
    public static final byte[] zzf = new byte[0];
    private static final Pattern zzg = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
    private static final Pattern zzh = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    private static final Pattern zzi = Pattern.compile("%([A-Fa-f0-9]{2})");
    private static final Pattern zzj = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
    private static HashMap zzk;
    private static final String[] zzl = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
    private static final String[] zzm = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
    private static final int[] zzn = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    private static final int[] zzo = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, R.styleable.AppCompatTheme_tooltipFrameBackground, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};

    static {
        int i10 = Build.VERSION.SDK_INT;
        zza = i10;
        String str = Build.DEVICE;
        zzb = str;
        String str2 = Build.MANUFACTURER;
        zzc = str2;
        String str3 = Build.MODEL;
        zzd = str3;
        zze = str + ", " + str3 + ", " + str2 + ", " + i10;
    }

    public static Intent zzA(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (zza < 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, 4);
    }

    public static Point zzB(Context context) {
        String str;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Objects.requireNonNull(windowManager);
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzY(context)) {
            if (zza < 28) {
                str = zzaj("sys.display-size");
            } else {
                str = zzaj("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] split = str.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzee.zzb("Util", "Invalid display size: ".concat(String.valueOf(str)));
            }
            if ("Sony".equals(zzc) && zzd.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (zza >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        }
        display.getRealSize(point);
        return point;
    }

    public static Handler zzC(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static Handler zzD(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        zzdl.zzb(myLooper);
        return new Handler(myLooper, (Handler.Callback) null);
    }

    public static Looper zzE() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }

    public static zzaf zzF(int i10, int i11, int i12) {
        zzad zzad = new zzad();
        zzad.zzS("audio/raw");
        zzad.zzw(i11);
        zzad.zzT(i12);
        zzad.zzN(i10);
        return zzad.zzY();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzcc zzG(com.google.android.gms.internal.ads.zzcg r11, com.google.android.gms.internal.ads.zzcc r12) {
        /*
            boolean r0 = r11.zzA()
            boolean r1 = r11.zzd()
            r2 = r11
            com.google.android.gms.internal.ads.zzm r2 = (com.google.android.gms.internal.ads.zzm) r2
            com.google.android.gms.internal.ads.zzcn r3 = r2.zzq()
            boolean r4 = r3.zzo()
            r5 = -1
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x001a
        L_0x0018:
            r3 = 0
            goto L_0x002b
        L_0x001a:
            int r4 = r2.zzg()
            r2.zzk()
            r2.zzz()
            int r3 = r3.zzk(r4, r7, r7)
            if (r3 == r5) goto L_0x0018
            r3 = 1
        L_0x002b:
            com.google.android.gms.internal.ads.zzcn r4 = r2.zzq()
            boolean r8 = r4.zzo()
            if (r8 == 0) goto L_0x0037
        L_0x0035:
            r2 = 0
            goto L_0x0048
        L_0x0037:
            int r8 = r2.zzg()
            r2.zzk()
            r2.zzz()
            int r2 = r4.zzj(r8, r7, r7)
            if (r2 == r5) goto L_0x0035
            r2 = 1
        L_0x0048:
            boolean r4 = r11.zzc()
            boolean r5 = r11.zzb()
            com.google.android.gms.internal.ads.zzcn r11 = r11.zzq()
            boolean r11 = r11.zzo()
            com.google.android.gms.internal.ads.zzca r8 = new com.google.android.gms.internal.ads.zzca
            r8.<init>()
            r8.zzb(r12)
            r12 = 4
            r9 = r0 ^ 1
            r8.zzd(r12, r9)
            if (r1 == 0) goto L_0x006c
            if (r0 != 0) goto L_0x006c
            r12 = 1
            goto L_0x006d
        L_0x006c:
            r12 = 0
        L_0x006d:
            r10 = 5
            r8.zzd(r10, r12)
            if (r3 == 0) goto L_0x0077
            if (r0 != 0) goto L_0x0077
            r12 = 1
            goto L_0x0078
        L_0x0077:
            r12 = 0
        L_0x0078:
            r10 = 6
            r8.zzd(r10, r12)
            if (r11 != 0) goto L_0x0088
            if (r3 != 0) goto L_0x0084
            if (r4 == 0) goto L_0x0084
            if (r1 == 0) goto L_0x0088
        L_0x0084:
            if (r0 != 0) goto L_0x0088
            r12 = 1
            goto L_0x0089
        L_0x0088:
            r12 = 0
        L_0x0089:
            r3 = 7
            r8.zzd(r3, r12)
            if (r2 == 0) goto L_0x0093
            if (r0 != 0) goto L_0x0093
            r12 = 1
            goto L_0x0094
        L_0x0093:
            r12 = 0
        L_0x0094:
            r3 = 8
            r8.zzd(r3, r12)
            if (r11 != 0) goto L_0x00a5
            if (r2 != 0) goto L_0x00a1
            if (r4 == 0) goto L_0x00a5
            if (r5 == 0) goto L_0x00a5
        L_0x00a1:
            if (r0 != 0) goto L_0x00a5
            r11 = 1
            goto L_0x00a6
        L_0x00a5:
            r11 = 0
        L_0x00a6:
            r12 = 9
            r8.zzd(r12, r11)
            r11 = 10
            r8.zzd(r11, r9)
            if (r1 == 0) goto L_0x00b6
            if (r0 != 0) goto L_0x00b6
            r11 = 1
            goto L_0x00b7
        L_0x00b6:
            r11 = 0
        L_0x00b7:
            r12 = 11
            r8.zzd(r12, r11)
            if (r1 == 0) goto L_0x00c1
            if (r0 != 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r6 = 0
        L_0x00c2:
            r11 = 12
            r8.zzd(r11, r6)
            com.google.android.gms.internal.ads.zzcc r11 = r8.zze()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzew.zzG(com.google.android.gms.internal.ads.zzcg, com.google.android.gms.internal.ads.zzcc):com.google.android.gms.internal.ads.zzcc");
    }

    public static Object zzH(Object obj) {
        return obj;
    }

    public static String zzI(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String zzJ(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, zzfnh.zzc);
    }

    public static String zzK(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            int length = objArr.length;
            if (i10 >= length) {
                return sb2.toString();
            }
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < length - 1) {
                sb2.append(", ");
            }
            i10++;
        }
    }

    public static String zzL(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return zzfnb.zzb(networkCountryIso);
            }
        }
        return zzfnb.zzb(Locale.getDefault().getCountry());
    }

    public static String zzM(int i10) {
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

    public static String zzN(Locale locale) {
        if (zza >= 21) {
            return locale.toLanguageTag();
        }
        return locale.toString();
    }

    public static String zzO(int i10) {
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
            default:
                return "camera motion";
        }
    }

    public static String zzP(int i10) {
        return Integer.toString(i10, 36);
    }

    public static String zzQ(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String zza2 = zzfnb.zza(str);
        int i10 = 0;
        String str2 = zza2.split("-", 2)[0];
        if (zzk == null) {
            zzk = zzak();
        }
        String str3 = (String) zzk.get(str2);
        if (str3 != null) {
            zza2 = str3.concat(String.valueOf(zza2.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return zza2;
        }
        while (true) {
            String[] strArr = zzm;
            int length = strArr.length;
            if (i10 >= 18) {
                return zza2;
            }
            if (zza2.startsWith(strArr[i10])) {
                return String.valueOf(strArr[i10 + 1]).concat(String.valueOf(zza2.substring(strArr[i10].length())));
            }
            i10 += 2;
        }
    }

    public static ExecutorService zzR(String str) {
        return Executors.newSingleThreadExecutor(new zzev(str));
    }

    public static void zzS(long[] jArr, long j10, long j11) {
        int i10 = 0;
        int i11 = (j11 > 1000000 ? 1 : (j11 == 1000000 ? 0 : -1));
        if (i11 >= 0 && j11 % 1000000 == 0) {
            long j12 = j11 / 1000000;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j12;
                i10++;
            }
        } else if (i11 >= 0 || 1000000 % j11 != 0) {
            double d10 = (double) j11;
            while (i10 < jArr.length) {
                jArr[i10] = (long) (((double) jArr[i10]) * (1000000.0d / d10));
                i10++;
            }
        } else {
            long j13 = 1000000 / j11;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] * j13;
                i10++;
            }
        }
    }

    public static void zzT(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static boolean zzU(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean zzV(int i10) {
        return i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static boolean zzW(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static boolean zzX(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static boolean zzY(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzZ(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static float zza(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static boolean zzaa(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static byte[] zzab(String str) {
        return str.getBytes(zzfnh.zzc);
    }

    public static byte[] zzac(InputStream inputStream) throws IOException {
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

    public static Object[] zzad(Object[] objArr) {
        return objArr;
    }

    public static Object[] zzae(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    public static Object[] zzaf(Object[] objArr, int i10) {
        zzdl.zzd(i10 <= objArr.length);
        return Arrays.copyOf(objArr, i10);
    }

    public static String[] zzag() {
        String[] strArr;
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (zza >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            strArr = new String[]{zzN(configuration.locale)};
        }
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr[i10] = zzQ(strArr[i10]);
        }
        return strArr;
    }

    public static String[] zzah(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] zzai(String str, String str2) {
        return str.split(str2, 2);
    }

    private static String zzaj(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e10) {
            zzee.zzc("Util", "Failed to read system property ".concat(str), e10);
            return null;
        }
    }

    private static HashMap zzak() {
        int length = zzl.length;
        HashMap hashMap = new HashMap(r2 + 88);
        int i10 = 0;
        for (String str : Locale.getISOLanguages()) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zzl;
            int length2 = strArr.length;
            if (i10 >= 88) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzb(long[] r3, long r4, boolean r6, boolean r7) {
        /*
            int r7 = java.util.Arrays.binarySearch(r3, r4)
            if (r7 >= 0) goto L_0x0008
            int r3 = ~r7
            goto L_0x0016
        L_0x0008:
            int r7 = r7 + 1
            int r0 = r3.length
            if (r7 >= r0) goto L_0x0013
            r0 = r3[r7]
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0008
        L_0x0013:
            if (r6 != 0) goto L_0x0017
            r3 = r7
        L_0x0016:
            return r3
        L_0x0017:
            int r7 = r7 + -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzew.zzb(long[], long, boolean, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzc(int[] r2, int r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0018
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0012
            r1 = r2[r0]
            if (r1 == r3) goto L_0x000a
        L_0x0012:
            if (r4 == 0) goto L_0x0017
            int r2 = r0 + 1
            goto L_0x0018
        L_0x0017:
            r2 = r0
        L_0x0018:
            if (r5 == 0) goto L_0x001f
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzew.zzc(int[], int, boolean, boolean):int");
    }

    public static int zzd(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || jArr[binarySearch] != j10) {
                    i10 = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (jArr[binarySearch] != j10);
            i10 = binarySearch + 1;
        }
        return z11 ? Math.max(0, i10) : i10;
    }

    public static int zze(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int zzf(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static int zzg(byte[] bArr, int i10, int i11, int i12) {
        int i13 = -1;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 = zzn[(i13 >>> 24) ^ (bArr[i14] & 255)] ^ (i13 << 8);
        }
        return i13;
    }

    public static int zzh(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        while (i10 < i11) {
            i13 = zzo[i13 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i13;
    }

    public static int zzi(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static int zzj(int i10) {
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

    public static int zzk(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static int zzl(int i10) {
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

    public static int zzm(String str) {
        String[] split;
        int length;
        int i10 = 0;
        if (str == null || (length = split.length) < 2) {
            return 0;
        }
        String str2 = (split = str.split("_", -1))[length - 1];
        boolean z10 = length >= 3 && "neg".equals(split[length + -2]);
        Objects.requireNonNull(str2);
        try {
            i10 = Integer.parseInt(str2);
            if (z10) {
                return -i10;
            }
        } catch (NumberFormatException unused) {
        }
        return i10;
    }

    public static int zzn(int i10) {
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

    public static int zzo(int i10, int i11) {
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
        return i11 + i11;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzp(android.net.Uri r7) {
        /*
            java.lang.String r0 = r7.getScheme()
            r1 = 3
            if (r0 == 0) goto L_0x0011
            java.lang.String r2 = "rtsp"
            boolean r0 = com.google.android.gms.internal.ads.zzfnb.zzc(r2, r0)
            if (r0 != 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            return r1
        L_0x0011:
            java.lang.String r0 = r7.getLastPathSegment()
            r2 = 4
            if (r0 != 0) goto L_0x0019
            return r2
        L_0x0019:
            r3 = 46
            int r3 = r0.lastIndexOf(r3)
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 < 0) goto L_0x0071
            int r3 = r3 + r6
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfnb.zza(r0)
            int r3 = r0.hashCode()
            switch(r3) {
                case 104579: goto L_0x0053;
                case 108321: goto L_0x0049;
                case 3242057: goto L_0x003f;
                case 3299913: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x005d
        L_0x0035:
            java.lang.String r3 = "m3u8"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005d
            r0 = 1
            goto L_0x005e
        L_0x003f:
            java.lang.String r3 = "isml"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005d
            r0 = 3
            goto L_0x005e
        L_0x0049:
            java.lang.String r3 = "mpd"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005d
            r0 = 0
            goto L_0x005e
        L_0x0053:
            java.lang.String r3 = "ism"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005d
            r0 = 2
            goto L_0x005e
        L_0x005d:
            r0 = -1
        L_0x005e:
            if (r0 == 0) goto L_0x006c
            if (r0 == r6) goto L_0x006a
            if (r0 == r5) goto L_0x0068
            if (r0 == r1) goto L_0x0068
            r0 = 4
            goto L_0x006d
        L_0x0068:
            r0 = 1
            goto L_0x006d
        L_0x006a:
            r0 = 2
            goto L_0x006d
        L_0x006c:
            r0 = 0
        L_0x006d:
            if (r0 != r2) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            return r0
        L_0x0071:
            java.util.regex.Pattern r0 = zzj
            java.lang.String r7 = r7.getPath()
            java.util.Objects.requireNonNull(r7)
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r0 = r7.matches()
            if (r0 == 0) goto L_0x009d
            java.lang.String r7 = r7.group(r5)
            if (r7 == 0) goto L_0x009c
            java.lang.String r0 = "format=mpd-time-csf"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x0093
            return r4
        L_0x0093:
            java.lang.String r0 = "format=m3u8-aapl"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L_0x009c
            return r5
        L_0x009c:
            return r6
        L_0x009d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzew.zzp(android.net.Uri):int");
    }

    public static long zzq(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        if (((j10 ^ j13) & (j11 ^ j13)) < 0) {
            return Long.MAX_VALUE;
        }
        return j13;
    }

    public static long zzr(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static long zzs(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(((double) j10) * ((double) f10));
    }

    public static long zzt(long j10) {
        if (j10 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j10 + SystemClock.elapsedRealtime();
    }

    public static long zzu(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(((double) j10) / ((double) f10));
    }

    public static long zzv(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static long zzw(long j10, long j11, long j12) {
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 < 0 || j12 % j11 != 0) {
            return (i10 >= 0 || j11 % j12 != 0) ? (long) (((double) j10) * (((double) j11) / ((double) j12))) : j10 * (j11 / j12);
        }
        return j10 / (j12 / j11);
    }

    public static long zzx(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        if (((j10 ^ j13) & (j11 ^ j10)) < 0) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    public static long zzy(int i10, int i11) {
        return (((long) i11) & 4294967295L) | ((((long) i10) & 4294967295L) << 32);
    }

    public static long zzz(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }
}
