package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzot;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import h5.j;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import m5.e;
import m5.f;
import o5.c;
import r5.g0;
import r5.r;
import r5.s;
import r5.t;
import v0.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class ib extends u6 {

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f24697i = {"firebase_", "google_", "ga_"};

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f24698j = {"_err"};

    /* renamed from: c  reason: collision with root package name */
    private SecureRandom f24699c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicLong f24700d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    private int f24701e;

    /* renamed from: f  reason: collision with root package name */
    private a f24702f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f24703g;

    /* renamed from: h  reason: collision with root package name */
    private Integer f24704h = null;

    ib(w5 w5Var) {
        super(w5Var);
    }

    public static Bundle A(List<hb> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (hb next : list) {
            String str = next.f24644g;
            if (str != null) {
                bundle.putString(next.f24640b, str);
            } else {
                Long l10 = next.f24642d;
                if (l10 != null) {
                    bundle.putLong(next.f24640b, l10.longValue());
                } else {
                    Double d10 = next.f24646i;
                    if (d10 != null) {
                        bundle.putDouble(next.f24640b, d10.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    private final Object C(int i10, Object obj, boolean z10, boolean z11) {
        Bundle m02;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return D(String.valueOf(obj), i10, z10);
            }
            if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if ((parcelable instanceof Bundle) && (m02 = m0((Bundle) parcelable)) != null && !m02.isEmpty()) {
                    arrayList.add(m02);
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    static boolean C0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static String D(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (!z10) {
            return null;
        }
        String substring = str.substring(0, str.offsetByCodePoints(0, i10));
        return substring + "...";
    }

    static boolean E0(String str) {
        q.g(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    private static void F(Bundle bundle, int i10, String str, String str2, Object obj) {
        if (q0(bundle, i10)) {
            bundle.putString("_ev", D(str, 40, true));
            if (obj != null) {
                q.k(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    public static boolean G0(String str) {
        for (String equals : f24698j) {
            if (equals.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int H0(String str) {
        if (!r0("event param", str)) {
            return 3;
        }
        if (!i0("event param", (String[]) null, str)) {
            return 14;
        }
        if (!d0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    private final int I0(String str) {
        if (!x0("event param", str)) {
            return 3;
        }
        if (!i0("event param", (String[]) null, str)) {
            return 14;
        }
        if (!d0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    private static int J0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        if (!"_lgclid".equals(str) && !"_gbraid".equals(str)) {
            return 36;
        }
        return 100;
    }

    private static boolean M0(String str) {
        q.k(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    static MessageDigest O0() {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static void R(p8 p8Var, Bundle bundle, boolean z10) {
        if (bundle != null && p8Var != null && (!bundle.containsKey("_sc") || z10)) {
            String str = p8Var.f24932a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = p8Var.f24933b;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", p8Var.f24934c);
        } else if (bundle != null && p8Var == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void S(kb kbVar, int i10, String str, String str2, int i11) {
        T(kbVar, (String) null, i10, str, str2, i11);
    }

    private final boolean S0() {
        Integer num;
        if (this.f24703g == null) {
            a L0 = L0();
            boolean z10 = false;
            if (L0 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = L0.b().get(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z10 = true;
                        }
                    } catch (CancellationException e10) {
                        e = e10;
                        num2 = num;
                        zzj().G().b("Measurement manager api exception", e);
                        this.f24703g = Boolean.FALSE;
                        num = num2;
                        zzj().F().b("Measurement manager api status result", num);
                        return this.f24703g.booleanValue();
                    } catch (ExecutionException e11) {
                        e = e11;
                        num2 = num;
                        zzj().G().b("Measurement manager api exception", e);
                        this.f24703g = Boolean.FALSE;
                        num = num2;
                        zzj().F().b("Measurement manager api status result", num);
                        return this.f24703g.booleanValue();
                    } catch (InterruptedException e12) {
                        e = e12;
                        num2 = num;
                        zzj().G().b("Measurement manager api exception", e);
                        this.f24703g = Boolean.FALSE;
                        num = num2;
                        zzj().F().b("Measurement manager api status result", num);
                        return this.f24703g.booleanValue();
                    } catch (TimeoutException e13) {
                        e = e13;
                        num2 = num;
                        zzj().G().b("Measurement manager api exception", e);
                        this.f24703g = Boolean.FALSE;
                        num = num2;
                        zzj().F().b("Measurement manager api status result", num);
                        return this.f24703g.booleanValue();
                    }
                }
                this.f24703g = Boolean.valueOf(z10);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e14) {
                e = e14;
                zzj().G().b("Measurement manager api exception", e);
                this.f24703g = Boolean.FALSE;
                num = num2;
                zzj().F().b("Measurement manager api status result", num);
                return this.f24703g.booleanValue();
            }
            zzj().F().b("Measurement manager api status result", num);
        }
        return this.f24703g.booleanValue();
    }

    static void T(kb kbVar, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        q0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", (long) i11);
        }
        kbVar.a(str, "_err", bundle);
    }

    private final void U(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z10) {
        int i10;
        String str4;
        int i11;
        String str5 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            int q10 = a().q();
            int i12 = 0;
            for (String str6 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str6)) {
                    i10 = !z10 ? I0(str6) : 0;
                    if (i10 == 0) {
                        i10 = H0(str6);
                    }
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    F(bundle2, i10, str6, str6, i10 == 3 ? str6 : null);
                    bundle2.remove(str6);
                } else {
                    if (b0(bundle2.get(str6))) {
                        zzj().H().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str5, str3, str6);
                        i11 = 22;
                        str4 = str6;
                    } else {
                        String str7 = str3;
                        str4 = str6;
                        i11 = s(str, str2, str6, bundle2.get(str6), bundle, list, z10, false);
                    }
                    if (i11 != 0 && !"_ev".equals(str4)) {
                        F(bundle2, i11, str4, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (E0(str4) && !h0(str4, t.f29783d)) {
                        int i13 = i12 + 1;
                        if (!W(231100000, true)) {
                            zzj().C().c("Item array not supported on client's version of Google Play Services (Android Only)", d().c(str5), d().a(bundle2));
                            q0(bundle2, 23);
                            bundle2.remove(str4);
                        } else if (i13 > q10) {
                            if (!zzot.zza() || !a().n(e0.I0)) {
                                zzj().C().c("Item cannot contain custom parameters", d().c(str5), d().a(bundle2));
                                q0(bundle2, 23);
                                bundle2.remove(str4);
                            } else {
                                p4 C = zzj().C();
                                C.c("Item can't contain more than " + q10 + " item-scoped custom params", d().c(str5), d().a(bundle2));
                                q0(bundle2, 28);
                                bundle2.remove(str4);
                            }
                        }
                        i12 = i13;
                    }
                }
            }
        }
    }

    static boolean X(Context context) {
        ActivityInfo receiverInfo;
        q.k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    static boolean Y(Context context, boolean z10) {
        q.k(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return w0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return w0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean Z(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean a0(Bundle bundle, int i10) {
        int i11 = 0;
        if (bundle.size() <= i10) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i11++;
            if (i11 > i10) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean b0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    static boolean g0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            q.k(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty || !isEmpty2) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    private static boolean h0(String str, String[] strArr) {
        q.k(strArr);
        for (String a10 : strArr) {
            if (g0.a(str, a10)) {
                return true;
            }
        }
        return false;
    }

    static byte[] k0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList<Bundle> o0(List<d> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (d next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", next.f24446a);
            bundle.putString("origin", next.f24447b);
            bundle.putLong("creation_timestamp", next.f24449d);
            bundle.putString(MediationMetaData.KEY_NAME, next.f24448c.f24640b);
            r5.q.b(bundle, q.k(next.f24448c.v()));
            bundle.putBoolean("active", next.f24450f);
            String str = next.f24451g;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            d0 d0Var = next.f24452h;
            if (d0Var != null) {
                bundle.putString("timed_out_event_name", d0Var.f24457a);
                z zVar = d0Var.f24458b;
                if (zVar != null) {
                    bundle.putBundle("timed_out_event_params", zVar.w());
                }
            }
            bundle.putLong("trigger_timeout", next.f24453i);
            d0 d0Var2 = next.f24454j;
            if (d0Var2 != null) {
                bundle.putString("triggered_event_name", d0Var2.f24457a);
                z zVar2 = d0Var2.f24458b;
                if (zVar2 != null) {
                    bundle.putBundle("triggered_event_params", zVar2.w());
                }
            }
            bundle.putLong("triggered_timestamp", next.f24448c.f24641c);
            bundle.putLong("time_to_live", next.f24455k);
            d0 d0Var3 = next.f24456l;
            if (d0Var3 != null) {
                bundle.putString("expired_event_name", d0Var3.f24457a);
                z zVar3 = d0Var3.f24458b;
                if (zVar3 != null) {
                    bundle.putBundle("expired_event_params", zVar3.w());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private final boolean p0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo f10 = c.a(context).f(str, 64);
            if (f10 == null || (signatureArr = f10.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e10) {
            zzj().B().b("Error obtaining certificate", e10);
            return true;
        } catch (PackageManager.NameNotFoundException e11) {
            zzj().B().b("Package name not found", e11);
            return true;
        }
    }

    private static boolean q0(Bundle bundle, int i10) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i10);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0160 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int s(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Object r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, boolean r22, boolean r23) {
        /*
            r15 = this;
            r7 = r15
            r8 = r18
            r0 = r19
            r1 = r20
            r15.i()
            boolean r2 = b0(r19)
            java.lang.String r3 = "param"
            r9 = 0
            r10 = 1
            if (r2 == 0) goto L_0x0091
            if (r23 == 0) goto L_0x008e
            java.lang.String[] r2 = r5.t.f29782c
            boolean r2 = h0(r8, r2)
            if (r2 != 0) goto L_0x0021
            r0 = 20
            return r0
        L_0x0021:
            com.google.android.gms.measurement.internal.w5 r2 = r7.f25124a
            com.google.android.gms.measurement.internal.v8 r2 = r2.E()
            boolean r2 = r2.Y()
            if (r2 != 0) goto L_0x0030
            r0 = 25
            return r0
        L_0x0030:
            boolean r2 = r0 instanceof android.os.Parcelable[]
            r4 = 200(0xc8, float:2.8E-43)
            if (r2 == 0) goto L_0x003b
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L_0x0046
        L_0x003b:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x005b
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x0046:
            if (r5 <= r4) goto L_0x005b
            com.google.android.gms.measurement.internal.n4 r6 = r15.zzj()
            com.google.android.gms.measurement.internal.p4 r6 = r6.H()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r11 = "Parameter array is too long; discarded. Value kind, name, array length"
            r6.d(r11, r3, r8, r5)
            r5 = 0
            goto L_0x005c
        L_0x005b:
            r5 = 1
        L_0x005c:
            if (r5 != 0) goto L_0x0091
            r5 = 17
            if (r2 == 0) goto L_0x0072
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r6 = r2.length
            if (r6 <= r4) goto L_0x008b
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x008b
        L_0x0072:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x008b
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r6 = r2.size()
            if (r6 <= r4) goto L_0x008b
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r9, r4)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x008b:
            r11 = 17
            goto L_0x0092
        L_0x008e:
            r0 = 21
            return r0
        L_0x0091:
            r11 = 0
        L_0x0092:
            boolean r1 = C0(r17)
            if (r1 != 0) goto L_0x00b2
            boolean r1 = C0(r18)
            if (r1 == 0) goto L_0x009f
            goto L_0x00b2
        L_0x009f:
            com.google.android.gms.measurement.internal.f r1 = r15.a()
            com.google.android.gms.measurement.internal.w5 r2 = r7.f25124a
            com.google.android.gms.measurement.internal.i4 r2 = r2.w()
            java.lang.String r2 = r2.A()
            int r1 = r1.o(r2)
            goto L_0x00c4
        L_0x00b2:
            com.google.android.gms.measurement.internal.f r1 = r15.a()
            com.google.android.gms.measurement.internal.w5 r2 = r7.f25124a
            com.google.android.gms.measurement.internal.i4 r2 = r2.w()
            java.lang.String r2 = r2.A()
            int r1 = r1.r(r2)
        L_0x00c4:
            boolean r1 = r15.f0(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00cb
            return r11
        L_0x00cb:
            if (r23 == 0) goto L_0x0161
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00e5
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r6 = r22
            r0.U(r1, r2, r3, r4, r5, r6)
        L_0x00e2:
            r9 = 1
            goto L_0x015e
        L_0x00e5:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x011c
            r12 = r0
            android.os.Parcelable[] r12 = (android.os.Parcelable[]) r12
            int r13 = r12.length
            r14 = 0
        L_0x00ee:
            if (r14 >= r13) goto L_0x00e2
            r0 = r12[r14]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0108
            com.google.android.gms.measurement.internal.n4 r1 = r15.zzj()
            com.google.android.gms.measurement.internal.p4 r1 = r1.H()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.c(r2, r0, r8)
            goto L_0x015e
        L_0x0108:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r6 = r22
            r0.U(r1, r2, r3, r4, r5, r6)
            int r14 = r14 + 1
            goto L_0x00ee
        L_0x011c:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x015e
            r12 = r0
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            int r13 = r12.size()
            r0 = 0
        L_0x0128:
            if (r0 >= r13) goto L_0x00e2
            java.lang.Object r1 = r12.get(r0)
            int r14 = r0 + 1
            boolean r0 = r1 instanceof android.os.Bundle
            if (r0 != 0) goto L_0x014b
            com.google.android.gms.measurement.internal.n4 r0 = r15.zzj()
            com.google.android.gms.measurement.internal.p4 r0 = r0.H()
            if (r1 == 0) goto L_0x0143
            java.lang.Class r1 = r1.getClass()
            goto L_0x0145
        L_0x0143:
            java.lang.String r1 = "null"
        L_0x0145:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r0.c(r2, r1, r8)
            goto L_0x015e
        L_0x014b:
            r4 = r1
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r6 = r22
            r0.U(r1, r2, r3, r4, r5, r6)
            r0 = r14
            goto L_0x0128
        L_0x015e:
            if (r9 == 0) goto L_0x0161
            return r11
        L_0x0161:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ib.s(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    static Bundle[] s0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public static long t(long j10, long j11) {
        return (j10 + (j11 * 60000)) / 86400000;
    }

    static int t0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static long v(z zVar) {
        long j10 = 0;
        if (zVar == null) {
            return 0;
        }
        Iterator<String> it = zVar.iterator();
        while (it.hasNext()) {
            Object y10 = zVar.y(it.next());
            if (y10 instanceof Parcelable[]) {
                j10 += (long) ((Parcelable[]) y10).length;
            }
        }
        return j10;
    }

    static long w(byte[] bArr) {
        q.k(bArr);
        int i10 = 0;
        q.n(bArr.length > 0);
        long j10 = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j10 += (((long) bArr[length]) & 255) << i10;
            i10 += 8;
            length--;
        }
        return j10;
    }

    private static boolean w0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static Bundle y(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        if (parcelableArr[i10] instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelableArr[i10]);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        return bundle2;
    }

    static boolean y0(String str) {
        String a10 = e0.f24494b0.a(null);
        return a10.equals("*") || Arrays.asList(a10.split(",")).contains(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean A0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return a().I().equals(str);
    }

    /* access modifiers changed from: package-private */
    public final d0 B(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (q(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle z12 = z(str, str2, bundle3, f.b("_o"), true);
            if (z10) {
                z12 = m0(z12);
            }
            q.k(z12);
            return new d0(str2, new z(z12), str3, j10);
        }
        zzj().B().b("Invalid conditional property event name", d().g(str2));
        throw new IllegalArgumentException();
    }

    public final int B0() {
        if (this.f24704h == null) {
            this.f24704h = Integer.valueOf(h5.f.h().b(zza()) / 1000);
        }
        return this.f24704h.intValue();
    }

    /* access modifiers changed from: package-private */
    public final long D0() {
        long j10;
        i();
        if (!y0(this.f25124a.w().A())) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j10 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j10 = 8;
        } else {
            j10 = t0() < e0.X.a(null).intValue() ? 16 : 0;
        }
        if (!z0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0 && !S0()) {
            j10 |= 64;
        }
        if (j10 == 0) {
            return 1;
        }
        return j10;
    }

    public final URL E(long j10, String str, String str2, long j11, String str3) {
        try {
            q.g(str2);
            q.g(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{Long.valueOf(j10), Integer.valueOf(B0())}), str2, str, Long.valueOf(j11)});
            if (str.equals(a().J())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e10) {
            zzj().B().b("Failed to create BOW URL for Deferred Deep Link. exception", e10.getMessage());
            return null;
        }
    }

    public final boolean F0(String str) {
        List<ResolveInfo> queryIntentActivities;
        if (!TextUtils.isEmpty(str) && (queryIntentActivities = zza().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) != null && !queryIntentActivities.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void G(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            zzj().G().b("Params already contained engagement", Long.valueOf(j11));
        }
        bundle.putLong("_et", j10 + j11);
    }

    /* access modifiers changed from: package-private */
    public final void H(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    f().I(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void I(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                zzj().H().c("Not putting event parameter. Invalid value type. name, type", d().f(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    public final void J(zzcv zzcv, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, i10);
        try {
            zzcv.zza(bundle);
        } catch (RemoteException e10) {
            this.f25124a.zzj().G().b("Error returning int value to wrapper", e10);
        }
    }

    public final void K(zzcv zzcv, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, j10);
        try {
            zzcv.zza(bundle);
        } catch (RemoteException e10) {
            this.f25124a.zzj().G().b("Error returning long value to wrapper", e10);
        }
    }

    public final long K0() {
        long andIncrement;
        long j10;
        if (this.f24700d.get() == 0) {
            synchronized (this.f24700d) {
                long nextLong = new Random(System.nanoTime() ^ zzb().a()).nextLong();
                int i10 = this.f24701e + 1;
                this.f24701e = i10;
                j10 = nextLong + ((long) i10);
            }
            return j10;
        }
        synchronized (this.f24700d) {
            this.f24700d.compareAndSet(-1, 1);
            andIncrement = this.f24700d.getAndIncrement();
        }
        return andIncrement;
    }

    public final void L(zzcv zzcv, Bundle bundle) {
        try {
            zzcv.zza(bundle);
        } catch (RemoteException e10) {
            this.f25124a.zzj().G().b("Error returning bundle value to wrapper", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final a L0() {
        if (this.f24702f == null) {
            this.f24702f = a.a(zza());
        }
        return this.f24702f;
    }

    public final void M(zzcv zzcv, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, str);
        try {
            zzcv.zza(bundle);
        } catch (RemoteException e10) {
            this.f25124a.zzj().G().b("Error returning string value to wrapper", e10);
        }
    }

    public final void N(zzcv zzcv, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, arrayList);
        try {
            zzcv.zza(bundle);
        } catch (RemoteException e10) {
            this.f25124a.zzj().G().b("Error returning bundle list to wrapper", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final String N0() {
        byte[] bArr = new byte[16];
        P0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final void O(zzcv zzcv, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, z10);
        try {
            zzcv.zza(bundle);
        } catch (RemoteException e10) {
            this.f25124a.zzj().G().b("Error returning boolean value to wrapper", e10);
        }
    }

    public final void P(zzcv zzcv, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, bArr);
        try {
            zzcv.zza(bundle);
        } catch (RemoteException e10) {
            this.f25124a.zzj().G().b("Error returning byte array to wrapper", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final SecureRandom P0() {
        i();
        if (this.f24699c == null) {
            this.f24699c = new SecureRandom();
        }
        return this.f24699c;
    }

    /* access modifiers changed from: package-private */
    public final void Q(r4 r4Var, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(r4Var.f24995d.keySet())) {
            if (E0(str) && (i11 = i11 + 1) > i10) {
                zzj().C().c("Event can't contain more than " + i10 + " params", d().c(r4Var.f24992a), d().a(r4Var.f24995d));
                q0(r4Var.f24995d, 5);
                r4Var.f24995d.remove(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean Q0() {
        i();
        return D0() == 1;
    }

    public final boolean R0() {
        try {
            zza().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void V(Parcelable[] parcelableArr, int i10, boolean z10) {
        q.k(parcelableArr);
        for (Bundle bundle : parcelableArr) {
            int i11 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (E0(str) && !h0(str, t.f29783d) && (i11 = i11 + 1) > i10) {
                    if (z10) {
                        zzj().C().c("Param can't contain more than " + i10 + " item-scoped custom parameters", d().f(str), d().a(bundle));
                        q0(bundle, 28);
                    } else {
                        zzj().C().c("Param cannot contain item-scoped custom parameters", d().f(str), d().a(bundle));
                        q0(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean W(int i10, boolean z10) {
        Boolean R = this.f25124a.E().R();
        if (B0() < i10 / 1000) {
            return R != null && !R.booleanValue();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    /* access modifiers changed from: package-private */
    public final boolean c0(String str, double d10) {
        try {
            SharedPreferences.Editor edit = zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d10));
            return edit.commit();
        } catch (RuntimeException e10) {
            zzj().B().b("Failed to persist Deferred Deep Link. exception", e10);
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    /* access modifiers changed from: package-private */
    public final boolean d0(String str, int i10, String str2) {
        if (str2 == null) {
            zzj().C().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        } else {
            zzj().C().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    /* access modifiers changed from: package-private */
    public final boolean e0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (M0(str)) {
                return true;
            }
            if (this.f25124a.m()) {
                zzj().C().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", n4.q(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f25124a.m()) {
                zzj().C().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (M0(str2)) {
            return true;
        } else {
            zzj().C().b("Invalid admob_app_id. Analytics disabled.", n4.q(str2));
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    /* access modifiers changed from: package-private */
    public final boolean f0(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i10) {
                zzj().H().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* access modifiers changed from: package-private */
    public final boolean i0(String str, String[] strArr, String str2) {
        return j0(str, strArr, (String[]) null, str2);
    }

    /* access modifiers changed from: package-private */
    public final boolean j0(String str, String[] strArr, String[] strArr2, String str2) {
        boolean z10;
        if (str2 == null) {
            zzj().C().b("Name is required and can't be null. Type", str);
            return false;
        }
        q.k(str2);
        String[] strArr3 = f24697i;
        int length = strArr3.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            } else if (str2.startsWith(strArr3[i10])) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            zzj().C().c("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        } else if (strArr == null || !h0(str2, strArr) || (strArr2 != null && h0(str2, strArr2))) {
            return true;
        } else {
            zzj().C().c("Name is reserved. Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final int l0(String str) {
        if (!r0("user property", str)) {
            return 6;
        }
        if (!i0("user property", s.f29778a, str)) {
            return 15;
        }
        if (!d0("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final Bundle m0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object n02 = n0(str, bundle.get(str));
                if (n02 == null) {
                    zzj().H().b("Param value can't be null", d().f(str));
                } else {
                    I(bundle2, str, n02);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Object n0(String str, Object obj) {
        int i10;
        if ("_ev".equals(str)) {
            return C(a().r(this.f25124a.w().A()), obj, true, true);
        }
        if (C0(str)) {
            i10 = a().r(this.f25124a.w().A());
        } else {
            i10 = a().o(this.f25124a.w().A());
        }
        return C(i10, obj, false, true);
    }

    /* access modifiers changed from: protected */
    public final void o() {
        i();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                zzj().G().a("Utils falling back to Random for random id");
            }
        }
        this.f24700d.set(nextLong);
    }

    public final int p(int i10) {
        return h5.f.h().j(zza(), j.f18843a);
    }

    /* access modifiers changed from: package-private */
    public final int q(String str) {
        if (!r0("event", str)) {
            return 2;
        }
        if (!j0("event", r.f29774a, r.f29775b, str)) {
            return 13;
        }
        if (!d0("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int r(String str, Object obj) {
        boolean z10;
        if ("_ldl".equals(str)) {
            z10 = f0("user property referrer", str, J0(str), obj);
        } else {
            z10 = f0("user property", str, J0(str), obj);
        }
        return z10 ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    public final boolean r0(String str, String str2) {
        if (str2 == null) {
            zzj().C().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            zzj().C().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        zzj().C().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            zzj().C().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final long u(Context context, String str) {
        i();
        q.k(context);
        q.g(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest O0 = O0();
        if (O0 == null) {
            zzj().B().a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!p0(context, str)) {
                    Signature[] signatureArr = c.a(context).f(zza().getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        return w(O0.digest(signatureArr[0].toByteArray()));
                    }
                    zzj().G().a("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                zzj().B().b("Package name not found", e10);
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final long u0(String str) {
        if (zza().getPackageManager() == null) {
            return 0;
        }
        int i10 = 0;
        try {
            ApplicationInfo c10 = c.a(zza()).c(str, 0);
            if (c10 != null) {
                i10 = c10.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            zzj().E().b("PackageManager failed to find running app: app_id", str);
        }
        return (long) i10;
    }

    /* access modifiers changed from: package-private */
    public final Object v0(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return C(J0(str), obj, true, false);
        }
        return C(J0(str), obj, false, false);
    }

    /* access modifiers changed from: package-private */
    public final Bundle x(Uri uri, boolean z10, boolean z11) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Uri uri2 = uri;
        if (uri2 == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str9 = uri2.getQueryParameter("utm_campaign");
                str8 = uri2.getQueryParameter("utm_source");
                str7 = uri2.getQueryParameter("utm_medium");
                str6 = uri2.getQueryParameter("gclid");
                str5 = z11 ? uri2.getQueryParameter("gbraid") : null;
                str4 = uri2.getQueryParameter("utm_id");
                str3 = uri2.getQueryParameter("dclid");
                str2 = uri2.getQueryParameter("srsltid");
                str = z10 ? uri2.getQueryParameter("sfmc_id") : null;
            } else {
                str9 = null;
                str8 = null;
                str7 = null;
                str6 = null;
                str5 = null;
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str9) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str6) && ((!z11 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && (!z10 || TextUtils.isEmpty(str)))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str9)) {
                str10 = "sfmc_id";
                bundle.putString("campaign", str9);
            } else {
                str10 = "sfmc_id";
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("source", str8);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("medium", str7);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("gclid", str6);
            }
            if (z11 && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri2.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri2.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri2.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri2.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri2.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign_id", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("dclid", str3);
            }
            String queryParameter6 = uri2.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("source_platform", queryParameter6);
            }
            String queryParameter7 = uri2.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("creative_format", queryParameter7);
            }
            String queryParameter8 = uri2.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("marketing_tactic", queryParameter8);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("srsltid", str2);
            }
            if (z10 && !TextUtils.isEmpty(str)) {
                bundle.putString(str10, str);
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            zzj().G().b("Install referrer url isn't a hierarchical URI", e10);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean x0(String str, String str2) {
        if (str2 == null) {
            zzj().C().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            zzj().C().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                zzj().C().c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    zzj().C().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle z(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24) {
        /*
            r19 = this;
            r9 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            java.lang.String[] r0 = r5.r.f29777d
            boolean r13 = h0(r10, r0)
            if (r11 == 0) goto L_0x00e8
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r11)
            com.google.android.gms.measurement.internal.f r0 = r19.a()
            int r8 = r0.z()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = 0
        L_0x002e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0046
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r0 = 0
            goto L_0x0054
        L_0x0046:
            if (r24 != 0) goto L_0x004d
            int r0 = r9.I0(r7)
            goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            if (r0 != 0) goto L_0x0054
            int r0 = r9.H0(r7)
        L_0x0054:
            if (r0 == 0) goto L_0x0064
            r1 = 3
            if (r0 != r1) goto L_0x005b
            r1 = r7
            goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            F(r15, r0, r7, r7, r1)
            r15.remove(r7)
            r9 = r8
            goto L_0x00a0
        L_0x0064:
            java.lang.Object r4 = r11.get(r7)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r7
            r5 = r15
            r6 = r23
            r14 = r7
            r7 = r24
            r9 = r8
            r8 = r13
            int r0 = r0.s(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 17
            if (r0 != r1) goto L_0x0085
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            F(r15, r0, r14, r14, r1)
            goto L_0x00a4
        L_0x0085:
            if (r0 == 0) goto L_0x00a4
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x00a4
            r1 = 21
            if (r0 != r1) goto L_0x0095
            r7 = r10
            goto L_0x0096
        L_0x0095:
            r7 = r14
        L_0x0096:
            java.lang.Object r1 = r11.get(r14)
            F(r15, r0, r7, r14, r1)
            r15.remove(r14)
        L_0x00a0:
            r8 = r9
            r9 = r19
            goto L_0x002e
        L_0x00a4:
            boolean r0 = E0(r14)
            if (r0 == 0) goto L_0x00a0
            int r0 = r18 + 1
            if (r0 <= r9) goto L_0x00e3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Event can't contain more than "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.n4 r2 = r19.zzj()
            com.google.android.gms.measurement.internal.p4 r2 = r2.C()
            com.google.android.gms.measurement.internal.m4 r3 = r19.d()
            java.lang.String r3 = r3.c(r10)
            com.google.android.gms.measurement.internal.m4 r4 = r19.d()
            java.lang.String r4 = r4.a(r11)
            r2.c(r1, r3, r4)
            r1 = 5
            q0(r15, r1)
            r15.remove(r14)
        L_0x00e3:
            r18 = r0
            goto L_0x00a0
        L_0x00e6:
            r14 = r15
            goto L_0x00e9
        L_0x00e8:
            r14 = 0
        L_0x00e9:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ib.z(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    public final boolean z0(String str) {
        i();
        if (c.a(zza()).a(str) == 0) {
            return true;
        }
        zzj().A().b("Permission not granted", str);
        return false;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
