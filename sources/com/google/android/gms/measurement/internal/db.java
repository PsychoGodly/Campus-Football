package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzji;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.measurement.internal.y6;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import m5.e;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class db extends ua {
    db(va vaVar) {
        super(vaVar);
    }

    static <BuilderT extends zzkm> BuilderT A(BuilderT buildert, byte[] bArr) throws zzji {
        zzik zza = zzik.zza();
        if (zza != null) {
            return buildert.zza(bArr, zza);
        }
        return buildert.zza(bArr);
    }

    private static String G(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    static List<Long> H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 << 6) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    private static void K(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (!set.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    private static void L(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String split : strArr) {
            String[] split2 = split.split(",");
            String str = split2[0];
            String str2 = split2[split2.length - 1];
            String string = bundle.getString(str);
            if (string != null) {
                K(builder, str2, string, set);
            }
        }
    }

    static void M(zzfi.zze.zza zza, String str, Object obj) {
        List<zzfi.zzg> zzf = zza.zzf();
        int i10 = 0;
        while (true) {
            if (i10 >= zzf.size()) {
                i10 = -1;
                break;
            } else if (str.equals(zzf.get(i10).zzg())) {
                break;
            } else {
                i10++;
            }
        }
        zzfi.zzg.zza zza2 = zzfi.zzg.zze().zza(str);
        if (obj instanceof Long) {
            zza2.zza(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zza2.zzb((String) obj);
        } else if (obj instanceof Double) {
            zza2.zza(((Double) obj).doubleValue());
        }
        if (i10 >= 0) {
            zza.zza(i10, zza2);
        } else {
            zza.zza(zza2);
        }
    }

    private static void Q(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    private final void R(StringBuilder sb2, int i10, zzew.zzc zzc) {
        if (zzc != null) {
            Q(sb2, i10);
            sb2.append("filter {\n");
            if (zzc.zzg()) {
                U(sb2, i10, "complement", Boolean.valueOf(zzc.zzf()));
            }
            if (zzc.zzi()) {
                U(sb2, i10, "param_name", d().f(zzc.zze()));
            }
            if (zzc.zzj()) {
                int i11 = i10 + 1;
                zzew.zzf zzd = zzc.zzd();
                if (zzd != null) {
                    Q(sb2, i11);
                    sb2.append("string_filter");
                    sb2.append(" {\n");
                    if (zzd.zzj()) {
                        U(sb2, i11, "match_type", zzd.zzb().name());
                    }
                    if (zzd.zzi()) {
                        U(sb2, i11, "expression", zzd.zze());
                    }
                    if (zzd.zzh()) {
                        U(sb2, i11, "case_sensitive", Boolean.valueOf(zzd.zzg()));
                    }
                    if (zzd.zza() > 0) {
                        Q(sb2, i11 + 1);
                        sb2.append("expression_list {\n");
                        for (String append : zzd.zzf()) {
                            Q(sb2, i11 + 2);
                            sb2.append(append);
                            sb2.append("\n");
                        }
                        sb2.append("}\n");
                    }
                    Q(sb2, i11);
                    sb2.append("}\n");
                }
            }
            if (zzc.zzh()) {
                S(sb2, i10 + 1, "number_filter", zzc.zzc());
            }
            Q(sb2, i10);
            sb2.append("}\n");
        }
    }

    private static void S(StringBuilder sb2, int i10, String str, zzew.zzd zzd) {
        if (zzd != null) {
            Q(sb2, i10);
            sb2.append(str);
            sb2.append(" {\n");
            if (zzd.zzh()) {
                U(sb2, i10, "comparison_type", zzd.zza().name());
            }
            if (zzd.zzj()) {
                U(sb2, i10, "match_as_float", Boolean.valueOf(zzd.zzg()));
            }
            if (zzd.zzi()) {
                U(sb2, i10, "comparison_value", zzd.zzd());
            }
            if (zzd.zzl()) {
                U(sb2, i10, "min_comparison_value", zzd.zzf());
            }
            if (zzd.zzk()) {
                U(sb2, i10, "max_comparison_value", zzd.zze());
            }
            Q(sb2, i10);
            sb2.append("}\n");
        }
    }

    private static void T(StringBuilder sb2, int i10, String str, zzfi.zzl zzl) {
        if (zzl != null) {
            Q(sb2, 3);
            sb2.append(str);
            sb2.append(" {\n");
            if (zzl.zzb() != 0) {
                Q(sb2, 4);
                sb2.append("results: ");
                int i11 = 0;
                for (Long next : zzl.zzi()) {
                    int i12 = i11 + 1;
                    if (i11 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(next);
                    i11 = i12;
                }
                sb2.append(10);
            }
            if (zzl.zzd() != 0) {
                Q(sb2, 4);
                sb2.append("status: ");
                int i13 = 0;
                for (Long next2 : zzl.zzk()) {
                    int i14 = i13 + 1;
                    if (i13 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(next2);
                    i13 = i14;
                }
                sb2.append(10);
            }
            if (zzl.zza() != 0) {
                Q(sb2, 4);
                sb2.append("dynamic_filter_timestamps: {");
                int i15 = 0;
                for (zzfi.zzd next3 : zzl.zzh()) {
                    int i16 = i15 + 1;
                    if (i15 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(next3.zzf() ? Integer.valueOf(next3.zza()) : null);
                    sb2.append(":");
                    sb2.append(next3.zze() ? Long.valueOf(next3.zzb()) : null);
                    i15 = i16;
                }
                sb2.append("}\n");
            }
            if (zzl.zzc() != 0) {
                Q(sb2, 4);
                sb2.append("sequence_filter_timestamps: {");
                int i17 = 0;
                for (zzfi.zzm next4 : zzl.zzj()) {
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(next4.zzf() ? Integer.valueOf(next4.zzb()) : null);
                    sb2.append(": [");
                    int i19 = 0;
                    for (Long longValue : next4.zze()) {
                        long longValue2 = longValue.longValue();
                        int i20 = i19 + 1;
                        if (i19 != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(longValue2);
                        i19 = i20;
                    }
                    sb2.append("]");
                    i17 = i18;
                }
                sb2.append("}\n");
            }
            Q(sb2, 3);
            sb2.append("}\n");
        }
    }

    private static void U(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj != null) {
            Q(sb2, i10 + 1);
            sb2.append(str);
            sb2.append(": ");
            sb2.append(obj);
            sb2.append(10);
        }
    }

    private final void V(StringBuilder sb2, int i10, List<zzfi.zzg> list) {
        if (list != null) {
            int i11 = i10 + 1;
            for (zzfi.zzg next : list) {
                if (next != null) {
                    Q(sb2, i11);
                    sb2.append("param {\n");
                    Double d10 = null;
                    U(sb2, i11, MediationMetaData.KEY_NAME, next.zzm() ? d().f(next.zzg()) : null);
                    U(sb2, i11, "string_value", next.zzn() ? next.zzh() : null);
                    U(sb2, i11, "int_value", next.zzl() ? Long.valueOf(next.zzd()) : null);
                    if (next.zzj()) {
                        d10 = Double.valueOf(next.zza());
                    }
                    U(sb2, i11, "double_value", d10);
                    if (next.zzc() > 0) {
                        V(sb2, i11, next.zzi());
                    }
                    Q(sb2, i11);
                    sb2.append("}\n");
                }
            }
        }
    }

    static boolean X(d0 d0Var, lb lbVar) {
        q.k(d0Var);
        q.k(lbVar);
        return !TextUtils.isEmpty(lbVar.f24780b) || !TextUtils.isEmpty(lbVar.f24795r);
    }

    static boolean Y(List<Long> list, int i10) {
        if (i10 >= (list.size() << 6)) {
            return false;
        }
        return ((1 << (i10 % 64)) & list.get(i10 / 64).longValue()) != 0;
    }

    static Object Z(zzfi.zze zze, String str) {
        zzfi.zzg z10 = z(zze, str);
        if (z10 == null) {
            return null;
        }
        if (z10.zzn()) {
            return z10.zzh();
        }
        if (z10.zzl()) {
            return Long.valueOf(z10.zzd());
        }
        if (z10.zzj()) {
            return Double.valueOf(z10.zza());
        }
        if (z10.zzc() <= 0) {
            return null;
        }
        List<zzfi.zzg> zzi = z10.zzi();
        ArrayList arrayList = new ArrayList();
        for (zzfi.zzg next : zzi) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (zzfi.zzg next2 : next.zzi()) {
                    if (next2.zzn()) {
                        bundle.putString(next2.zzg(), next2.zzh());
                    } else if (next2.zzl()) {
                        bundle.putLong(next2.zzg(), next2.zzd());
                    } else if (next2.zzj()) {
                        bundle.putDouble(next2.zzg(), next2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static boolean a0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static int t(zzfi.zzj.zza zza, String str) {
        if (zza == null) {
            return -1;
        }
        for (int i10 = 0; i10 < zza.zzb(); i10++) {
            if (str.equals(zza.zzj(i10).zzg())) {
                return i10;
            }
        }
        return -1;
    }

    private final Bundle w(Map<String, Object> map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String next : map.keySet()) {
            Object obj = map.get(next);
            if (obj == null) {
                bundle.putString(next, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(next, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(next, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(next, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(w((Map) obj2, false));
                }
                bundle.putParcelableArray(next, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    static zzfi.zzg z(zzfi.zze zze, String str) {
        for (zzfi.zzg next : zze.zzh()) {
            if (next.zzg().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r0.get("_o");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.d0 B(com.google.android.gms.internal.measurement.zzad r9) {
        /*
            r8 = this;
            java.util.Map r0 = r9.zzc()
            r1 = 1
            android.os.Bundle r0 = r8.w(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001c
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r1.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r1 = "app"
        L_0x001e:
            r5 = r1
            java.lang.String r1 = r9.zzb()
            java.lang.String r1 = r5.r.b(r1)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = r9.zzb()
        L_0x002d:
            r3 = r1
            com.google.android.gms.measurement.internal.d0 r1 = new com.google.android.gms.measurement.internal.d0
            com.google.android.gms.measurement.internal.z r4 = new com.google.android.gms.measurement.internal.z
            r4.<init>(r0)
            long r6 = r9.zza()
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.db.B(com.google.android.gms.internal.measurement.zzad):com.google.android.gms.measurement.internal.d0");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.na C(java.lang.String r12, com.google.android.gms.internal.measurement.zzfi.zzj r13, com.google.android.gms.internal.measurement.zzfi.zze.zza r14, java.lang.String r15) {
        /*
            r11 = this;
            boolean r0 = com.google.android.gms.internal.measurement.zzpg.zza()
            if (r0 == 0) goto L_0x02c1
            com.google.android.gms.measurement.internal.f r0 = r11.a()
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.e0.L0
            boolean r0 = r0.w(r12, r1)
            if (r0 != 0) goto L_0x0014
            goto L_0x02c1
        L_0x0014:
            m5.e r0 = r11.zzb()
            long r0 = r0.a()
            com.google.android.gms.measurement.internal.f r2 = r11.a()
            com.google.android.gms.measurement.internal.h4<java.lang.String> r3 = com.google.android.gms.measurement.internal.e0.f24501e0
            java.lang.String r2 = r2.u(r12, r3)
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)
            java.util.HashSet r3 = new java.util.HashSet
            int r4 = r2.length
            r3.<init>(r4)
            int r4 = r2.length
            r5 = 0
            r6 = 0
        L_0x0035:
            if (r6 >= r4) goto L_0x0059
            r7 = r2[r6]
            r7.getClass()
            boolean r8 = r3.add(r7)
            if (r8 == 0) goto L_0x0045
            int r6 = r6 + 1
            goto L_0x0035
        L_0x0045:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "duplicate element: "
            r13.<init>(r14)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x0059:
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r3)
            com.google.android.gms.measurement.internal.ta r3 = r11.o()
            com.google.android.gms.measurement.internal.i5 r4 = r3.m()
            java.lang.String r4 = r4.L(r12)
            android.net.Uri$Builder r6 = new android.net.Uri$Builder
            r6.<init>()
            com.google.android.gms.measurement.internal.f r7 = r3.a()
            com.google.android.gms.measurement.internal.h4<java.lang.String> r8 = com.google.android.gms.measurement.internal.e0.Y
            java.lang.String r7 = r7.u(r12, r8)
            r6.scheme(r7)
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r8 = "."
            if (r7 != 0) goto L_0x00a3
            com.google.android.gms.measurement.internal.f r7 = r3.a()
            com.google.android.gms.measurement.internal.h4<java.lang.String> r9 = com.google.android.gms.measurement.internal.e0.Z
            java.lang.String r7 = r7.u(r12, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r9.append(r8)
            r9.append(r7)
            java.lang.String r4 = r9.toString()
            r6.authority(r4)
            goto L_0x00b0
        L_0x00a3:
            com.google.android.gms.measurement.internal.f r4 = r3.a()
            com.google.android.gms.measurement.internal.h4<java.lang.String> r7 = com.google.android.gms.measurement.internal.e0.Z
            java.lang.String r4 = r4.u(r12, r7)
            r6.authority(r4)
        L_0x00b0:
            com.google.android.gms.measurement.internal.f r3 = r3.a()
            com.google.android.gms.measurement.internal.h4<java.lang.String> r4 = com.google.android.gms.measurement.internal.e0.f24491a0
            java.lang.String r3 = r3.u(r12, r4)
            r6.path(r3)
            java.lang.String r3 = r13.zzah()
            java.lang.String r4 = "gmp_app_id"
            K(r6, r4, r3, r2)
            java.lang.String r3 = "gmp_version"
            java.lang.String r4 = "82001"
            K(r6, r3, r4, r2)
            java.lang.String r3 = r13.zzy()
            com.google.android.gms.measurement.internal.f r4 = r11.a()
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.e0.O0
            boolean r4 = r4.w(r12, r7)
            java.lang.String r9 = ""
            if (r4 == 0) goto L_0x00ea
            com.google.android.gms.measurement.internal.i5 r4 = r11.m()
            boolean r4 = r4.V(r12)
            if (r4 == 0) goto L_0x00ea
            r3 = r9
        L_0x00ea:
            java.lang.String r4 = "app_instance_id"
            K(r6, r4, r3, r2)
            java.lang.String r3 = r13.zzal()
            java.lang.String r4 = "rdid"
            K(r6, r4, r3, r2)
            java.lang.String r3 = r13.zzx()
            java.lang.String r4 = "bundle_id"
            K(r6, r4, r3, r2)
            java.lang.String r3 = r14.zze()
            java.lang.String r4 = r5.r.a(r3)
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            if (r10 != 0) goto L_0x0110
            r3 = r4
        L_0x0110:
            java.lang.String r4 = "app_event_name"
            K(r6, r4, r3, r2)
            int r3 = r13.zzb()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "app_version"
            K(r6, r4, r3, r2)
            java.lang.String r3 = r13.zzaj()
            com.google.android.gms.measurement.internal.f r4 = r11.a()
            boolean r4 = r4.w(r12, r7)
            if (r4 == 0) goto L_0x0157
            com.google.android.gms.measurement.internal.i5 r4 = r11.m()
            boolean r4 = r4.Z(r12)
            if (r4 == 0) goto L_0x0157
            com.google.android.gms.measurement.internal.f r4 = r11.a()
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.e0.B0
            boolean r4 = r4.w(r12, r7)
            if (r4 == 0) goto L_0x0158
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0157
            int r4 = r3.indexOf(r8)
            r7 = -1
            if (r4 == r7) goto L_0x0157
            java.lang.String r3 = r3.substring(r5, r4)
        L_0x0157:
            r9 = r3
        L_0x0158:
            java.lang.String r3 = "os_version"
            K(r6, r3, r9, r2)
            long r3 = r14.zzc()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "timestamp"
            K(r6, r4, r3, r2)
            boolean r3 = r13.zzat()
            java.lang.String r4 = "1"
            if (r3 == 0) goto L_0x0177
            java.lang.String r3 = "lat"
            K(r6, r3, r4, r2)
        L_0x0177:
            int r3 = r13.zza()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "privacy_sandbox_version"
            K(r6, r5, r3, r2)
            java.lang.String r3 = "trigger_uri_source"
            K(r6, r3, r4, r2)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r5 = "trigger_uri_timestamp"
            K(r6, r5, r3, r2)
            if (r15 == 0) goto L_0x0199
            java.lang.String r3 = "request_uuid"
            K(r6, r3, r15, r2)
        L_0x0199:
            java.util.List r14 = r14.zzf()
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x01a6:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x01fa
            java.lang.Object r3 = r14.next()
            com.google.android.gms.internal.measurement.zzfi$zzg r3 = (com.google.android.gms.internal.measurement.zzfi.zzg) r3
            java.lang.String r5 = r3.zzg()
            boolean r7 = r3.zzj()
            if (r7 == 0) goto L_0x01c8
            double r7 = r3.zza()
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r15.putString(r5, r3)
            goto L_0x01a6
        L_0x01c8:
            boolean r7 = r3.zzk()
            if (r7 == 0) goto L_0x01da
            float r3 = r3.zzb()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r15.putString(r5, r3)
            goto L_0x01a6
        L_0x01da:
            boolean r7 = r3.zzn()
            if (r7 == 0) goto L_0x01e8
            java.lang.String r3 = r3.zzh()
            r15.putString(r5, r3)
            goto L_0x01a6
        L_0x01e8:
            boolean r7 = r3.zzl()
            if (r7 == 0) goto L_0x01a6
            long r7 = r3.zzd()
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r15.putString(r5, r3)
            goto L_0x01a6
        L_0x01fa:
            com.google.android.gms.measurement.internal.f r14 = r11.a()
            com.google.android.gms.measurement.internal.h4<java.lang.String> r3 = com.google.android.gms.measurement.internal.e0.f24499d0
            java.lang.String r14 = r14.u(r12, r3)
            java.lang.String r3 = "\\|"
            java.lang.String[] r14 = r14.split(r3)
            L(r6, r14, r15, r2)
            java.util.List r14 = r13.zzaq()
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x021a:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x026e
            java.lang.Object r5 = r14.next()
            com.google.android.gms.internal.measurement.zzfi$zzn r5 = (com.google.android.gms.internal.measurement.zzfi.zzn) r5
            java.lang.String r7 = r5.zzg()
            boolean r8 = r5.zzi()
            if (r8 == 0) goto L_0x023c
            double r8 = r5.zza()
            java.lang.String r5 = java.lang.String.valueOf(r8)
            r15.putString(r7, r5)
            goto L_0x021a
        L_0x023c:
            boolean r8 = r5.zzj()
            if (r8 == 0) goto L_0x024e
            float r5 = r5.zzb()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r15.putString(r7, r5)
            goto L_0x021a
        L_0x024e:
            boolean r8 = r5.zzm()
            if (r8 == 0) goto L_0x025c
            java.lang.String r5 = r5.zzh()
            r15.putString(r7, r5)
            goto L_0x021a
        L_0x025c:
            boolean r8 = r5.zzk()
            if (r8 == 0) goto L_0x021a
            long r8 = r5.zzc()
            java.lang.String r5 = java.lang.String.valueOf(r8)
            r15.putString(r7, r5)
            goto L_0x021a
        L_0x026e:
            com.google.android.gms.measurement.internal.f r14 = r11.a()
            com.google.android.gms.measurement.internal.h4<java.lang.String> r5 = com.google.android.gms.measurement.internal.e0.f24497c0
            java.lang.String r12 = r14.u(r12, r5)
            java.lang.String[] r12 = r12.split(r3)
            L(r6, r12, r15, r2)
            boolean r12 = com.google.android.gms.internal.measurement.zznp.zza()
            if (r12 == 0) goto L_0x02b2
            com.google.android.gms.measurement.internal.f r12 = r11.a()
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.e0.T0
            boolean r12 = r12.n(r14)
            if (r12 == 0) goto L_0x02b2
            boolean r12 = r13.zzas()
            if (r12 == 0) goto L_0x0298
            goto L_0x029a
        L_0x0298:
            java.lang.String r4 = "0"
        L_0x029a:
            java.lang.String r12 = "dma"
            K(r6, r12, r4, r2)
            java.lang.String r12 = r13.zzad()
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x02b2
            java.lang.String r12 = r13.zzad()
            java.lang.String r13 = "dma_cps"
            K(r6, r13, r12, r2)
        L_0x02b2:
            com.google.android.gms.measurement.internal.na r12 = new com.google.android.gms.measurement.internal.na
            android.net.Uri r13 = r6.build()
            java.lang.String r13 = r13.toString()
            r14 = 1
            r12.<init>(r13, r0, r14)
            return r12
        L_0x02c1:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.db.C(java.lang.String, com.google.android.gms.internal.measurement.zzfi$zzj, com.google.android.gms.internal.measurement.zzfi$zze$zza, java.lang.String):com.google.android.gms.measurement.internal.na");
    }

    /* access modifiers changed from: package-private */
    public final String D(zzew.zzb zzb) {
        if (zzb == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (zzb.zzl()) {
            U(sb2, 0, "filter_id", Integer.valueOf(zzb.zzb()));
        }
        U(sb2, 0, "event_name", d().c(zzb.zzf()));
        String G = G(zzb.zzh(), zzb.zzi(), zzb.zzj());
        if (!G.isEmpty()) {
            U(sb2, 0, "filter_type", G);
        }
        if (zzb.zzk()) {
            S(sb2, 1, "event_count_filter", zzb.zze());
        }
        if (zzb.zza() > 0) {
            sb2.append("  filters {\n");
            for (zzew.zzc R : zzb.zzg()) {
                R(sb2, 2, R);
            }
        }
        Q(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public final String E(zzew.zze zze) {
        if (zze == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (zze.zzi()) {
            U(sb2, 0, "filter_id", Integer.valueOf(zze.zza()));
        }
        U(sb2, 0, "property_name", d().g(zze.zze()));
        String G = G(zze.zzf(), zze.zzg(), zze.zzh());
        if (!G.isEmpty()) {
            U(sb2, 0, "filter_type", G);
        }
        R(sb2, 1, zze.zzb());
        sb2.append("}\n");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public final String F(zzfi.zzi zzi) {
        zzfi.zzb zzt;
        if (zzi == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        for (zzfi.zzj next : zzi.zzd()) {
            if (next != null) {
                Q(sb2, 1);
                sb2.append("bundle {\n");
                if (next.zzbk()) {
                    U(sb2, 1, "protocol_version", Integer.valueOf(next.zze()));
                }
                if (zzps.zza() && a().w(next.zzx(), e0.f24541y0) && next.zzbn()) {
                    U(sb2, 1, "session_stitching_token", next.zzam());
                }
                U(sb2, 1, "platform", next.zzak());
                if (next.zzbf()) {
                    U(sb2, 1, "gmp_version", Long.valueOf(next.zzm()));
                }
                if (next.zzbs()) {
                    U(sb2, 1, "uploading_gmp_version", Long.valueOf(next.zzs()));
                }
                if (next.zzbd()) {
                    U(sb2, 1, "dynamite_version", Long.valueOf(next.zzk()));
                }
                if (next.zzay()) {
                    U(sb2, 1, "config_version", Long.valueOf(next.zzi()));
                }
                U(sb2, 1, "gmp_app_id", next.zzah());
                U(sb2, 1, "admob_app_id", next.zzw());
                U(sb2, 1, "app_id", next.zzx());
                U(sb2, 1, "app_version", next.zzaa());
                if (next.zzav()) {
                    U(sb2, 1, "app_version_major", Integer.valueOf(next.zzb()));
                }
                U(sb2, 1, "firebase_instance_id", next.zzag());
                if (next.zzbc()) {
                    U(sb2, 1, "dev_cert_hash", Long.valueOf(next.zzj()));
                }
                U(sb2, 1, "app_store", next.zzz());
                if (next.zzbr()) {
                    U(sb2, 1, "upload_timestamp_millis", Long.valueOf(next.zzr()));
                }
                if (next.zzbo()) {
                    U(sb2, 1, "start_timestamp_millis", Long.valueOf(next.zzp()));
                }
                if (next.zzbe()) {
                    U(sb2, 1, "end_timestamp_millis", Long.valueOf(next.zzl()));
                }
                if (next.zzbj()) {
                    U(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(next.zzo()));
                }
                if (next.zzbi()) {
                    U(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(next.zzn()));
                }
                U(sb2, 1, "app_instance_id", next.zzy());
                U(sb2, 1, "resettable_device_id", next.zzal());
                U(sb2, 1, "ds_id", next.zzaf());
                if (next.zzbh()) {
                    U(sb2, 1, "limited_ad_tracking", Boolean.valueOf(next.zzat()));
                }
                U(sb2, 1, "os_version", next.zzaj());
                U(sb2, 1, "device_model", next.zzae());
                U(sb2, 1, "user_default_language", next.zzan());
                if (next.zzbq()) {
                    U(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(next.zzg()));
                }
                if (next.zzax()) {
                    U(sb2, 1, "bundle_sequential_index", Integer.valueOf(next.zzc()));
                }
                if (next.zzbm()) {
                    U(sb2, 1, "service_upload", Boolean.valueOf(next.zzau()));
                }
                U(sb2, 1, "health_monitor", next.zzai());
                if (next.zzbl()) {
                    U(sb2, 1, "retry_counter", Integer.valueOf(next.zzf()));
                }
                if (next.zzba()) {
                    U(sb2, 1, "consent_signals", next.zzac());
                }
                if (next.zzbg()) {
                    U(sb2, 1, "is_dma_region", Boolean.valueOf(next.zzas()));
                }
                if (next.zzbb()) {
                    U(sb2, 1, "core_platform_services", next.zzad());
                }
                if (next.zzaz()) {
                    U(sb2, 1, "consent_diagnostics", next.zzab());
                }
                if (next.zzbp()) {
                    U(sb2, 1, "target_os_version", Long.valueOf(next.zzq()));
                }
                if (zzpg.zza() && a().w(next.zzx(), e0.L0)) {
                    U(sb2, 1, "ad_services_version", Integer.valueOf(next.zza()));
                    if (next.zzaw() && (zzt = next.zzt()) != null) {
                        Q(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        U(sb2, 2, "eligible", Boolean.valueOf(zzt.zzf()));
                        U(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzt.zzh()));
                        U(sb2, 2, "pre_r", Boolean.valueOf(zzt.zzi()));
                        U(sb2, 2, "r_extensions_too_old", Boolean.valueOf(zzt.zzj()));
                        U(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(zzt.zze()));
                        U(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(zzt.zzd()));
                        U(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(zzt.zzg()));
                        Q(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                List<zzfi.zzn> zzaq = next.zzaq();
                if (zzaq != null) {
                    for (zzfi.zzn next2 : zzaq) {
                        if (next2 != null) {
                            Q(sb2, 2);
                            sb2.append("user_property {\n");
                            Double d10 = null;
                            U(sb2, 2, "set_timestamp_millis", next2.zzl() ? Long.valueOf(next2.zzd()) : null);
                            U(sb2, 2, MediationMetaData.KEY_NAME, d().g(next2.zzg()));
                            U(sb2, 2, "string_value", next2.zzh());
                            U(sb2, 2, "int_value", next2.zzk() ? Long.valueOf(next2.zzc()) : null);
                            if (next2.zzi()) {
                                d10 = Double.valueOf(next2.zza());
                            }
                            U(sb2, 2, "double_value", d10);
                            Q(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<zzfi.zzc> zzao = next.zzao();
                next.zzx();
                if (zzao != null) {
                    for (zzfi.zzc next3 : zzao) {
                        if (next3 != null) {
                            Q(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (next3.zzg()) {
                                U(sb2, 2, "audience_id", Integer.valueOf(next3.zza()));
                            }
                            if (next3.zzh()) {
                                U(sb2, 2, "new_audience", Boolean.valueOf(next3.zzf()));
                            }
                            T(sb2, 2, "current_data", next3.zzd());
                            if (next3.zzi()) {
                                T(sb2, 2, "previous_data", next3.zze());
                            }
                            Q(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<zzfi.zze> zzap = next.zzap();
                if (zzap != null) {
                    for (zzfi.zze next4 : zzap) {
                        if (next4 != null) {
                            Q(sb2, 2);
                            sb2.append("event {\n");
                            U(sb2, 2, MediationMetaData.KEY_NAME, d().c(next4.zzg()));
                            if (next4.zzk()) {
                                U(sb2, 2, "timestamp_millis", Long.valueOf(next4.zzd()));
                            }
                            if (next4.zzj()) {
                                U(sb2, 2, "previous_timestamp_millis", Long.valueOf(next4.zzc()));
                            }
                            if (next4.zzi()) {
                                U(sb2, 2, "count", Integer.valueOf(next4.zza()));
                            }
                            if (next4.zzb() != 0) {
                                V(sb2, 2, next4.zzh());
                            }
                            Q(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                Q(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public final List<Long> I(List<Long> list, List<Integer> list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        for (Integer next : list2) {
            if (next.intValue() < 0) {
                zzj().G().b("Ignoring negative bit index to be cleared", next);
            } else {
                int intValue = next.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    zzj().G().c("Ignoring bit index greater than bitSet size", next, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (next.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i10);
    }

    /* access modifiers changed from: package-private */
    public final Map<String, Object> J(Bundle bundle, boolean z10) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(J((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(J((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(J((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final void N(zzfi.zzg.zza zza, Object obj) {
        q.k(obj);
        zza.zze().zzc().zzb().zzd();
        if (obj instanceof String) {
            zza.zzb((String) obj);
        } else if (obj instanceof Long) {
            zza.zza(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zza.zza(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    zzfi.zzg.zza zze = zzfi.zzg.zze();
                    for (String str : bundle.keySet()) {
                        zzfi.zzg.zza zza2 = zzfi.zzg.zze().zza(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            zza2.zza(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zza2.zzb((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zza2.zza(((Double) obj2).doubleValue());
                        }
                        zze.zza(zza2);
                    }
                    if (zze.zza() > 0) {
                        arrayList.add((zzfi.zzg) ((zzix) zze.zzab()));
                    }
                }
            }
            zza.zza((Iterable<? extends zzfi.zzg>) arrayList);
        } else {
            zzj().B().b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final void O(zzfi.zzj.zza zza) {
        zzj().F().a("Checking account type status for ad personalization signals");
        if (c0(zza.zzr())) {
            zzj().A().a("Turning off ad personalization due to account type");
            zzfi.zzn zzn = (zzfi.zzn) ((zzix) zzfi.zzn.zze().zza("_npa").zzb(c().p()).zza(1).zzab());
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= zza.zzb()) {
                    break;
                } else if ("_npa".equals(zza.zzj(i10).zzg())) {
                    zza.zza(i10, zzn);
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                zza.zza(zzn);
            }
            if (zznp.zza() && a().n(e0.T0)) {
                k b10 = k.b(zza.zzs());
                b10.d(y6.a.AD_PERSONALIZATION, j.CHILD_ACCOUNT);
                zza.zzf(b10.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void P(zzfi.zzn.zza zza, Object obj) {
        q.k(obj);
        zza.zzc().zzb().zza();
        if (obj instanceof String) {
            zza.zzb((String) obj);
        } else if (obj instanceof Long) {
            zza.zza(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zza.zza(((Double) obj).doubleValue());
        } else {
            zzj().B().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean W(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(zzb().a() - j10) > j11;
    }

    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    /* access modifiers changed from: package-private */
    public final byte[] b0(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            zzj().B().b("Failed to gzip content", e10);
            throw e10;
        }
    }

    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    /* access modifiers changed from: package-private */
    public final boolean c0(String str) {
        q.k(str);
        r5 y02 = l().y0(str);
        if (y02 != null && c().t() && y02.q() && m().Q(str)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    /* access modifiers changed from: package-private */
    public final byte[] d0(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e10) {
            zzj().B().b("Failed to ungzip content", e10);
            throw e10;
        }
    }

    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    /* access modifiers changed from: package-private */
    public final List<Integer> e0() {
        Map<String, String> c10 = e0.c(this.f25029b.zza());
        if (c10 == null || c10.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = e0.R.a(null).intValue();
        Iterator<Map.Entry<String, String>> it = c10.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (((String) next.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) next.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            zzj().G().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e10) {
                    zzj().G().b("Experiment ID NumberFormatException", e10);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
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

    public final /* bridge */ /* synthetic */ db j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ pb k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ m l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ i5 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ y9 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ ta o() {
        return super.o();
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long u(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return v(str.getBytes(Charset.forName("UTF-8")));
    }

    /* access modifiers changed from: package-private */
    public final long v(byte[] bArr) {
        q.k(bArr);
        f().i();
        MessageDigest O0 = ib.O0();
        if (O0 != null) {
            return ib.w(O0.digest(bArr));
        }
        zzj().B().a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        zzj().B().a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T x(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.n4 r5 = r4.zzj()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.p4 r5 = r5.B()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.db.x(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    public final zzfi.zze y(w wVar) {
        zzfi.zze.zza zza = zzfi.zze.zze().zza(wVar.f25176e);
        Iterator<String> it = wVar.f25177f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            zzfi.zzg.zza zza2 = zzfi.zzg.zze().zza(next);
            Object y10 = wVar.f25177f.y(next);
            q.k(y10);
            N(zza2, y10);
            zza.zza(zza2);
        }
        return (zzfi.zze) ((zzix) zza.zzab());
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
