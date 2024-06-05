package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import r5.s;
import s6.u;
import s6.x;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.0 */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final x<String> f26139a = x.B("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b  reason: collision with root package name */
    private static final u<String> f26140b = u.D("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c  reason: collision with root package name */
    private static final u<String> f26141c = u.B("auto", "app", "am");

    /* renamed from: d  reason: collision with root package name */
    private static final u<String> f26142d = u.A("_r", "_dbg");

    /* renamed from: e  reason: collision with root package name */
    private static final u<String> f26143e = new u.a().i(s.f29778a).i(s.f29779b).k();

    /* renamed from: f  reason: collision with root package name */
    private static final u<String> f26144f = u.A("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static void a(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1);
        }
    }

    public static boolean b(String str, Bundle bundle) {
        if (f26140b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        u<String> uVar = f26142d;
        int size = uVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str2 = uVar.get(i10);
            i10++;
            if (bundle.containsKey(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f26143e.contains(str2)) {
            return false;
        }
        u<String> uVar = f26144f;
        int size = uVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str3 = uVar.get(i10);
            i10++;
            if (str2.matches(str3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!e(str) || bundle == null) {
            return false;
        }
        u<String> uVar = f26142d;
        int size = uVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str3 = uVar.get(i10);
            i10++;
            if (bundle.containsKey(str3)) {
                return false;
            }
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 101200:
                if (str.equals("fcm")) {
                    c10 = 0;
                    break;
                }
                break;
            case 101230:
                if (str.equals("fdl")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3142703:
                if (str.equals("fiam")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bundle.putString("_cis", "fcm_integration");
                return true;
            case 1:
                bundle.putString("_cis", "fdl_integration");
                return true;
            case 2:
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static boolean e(String str) {
        return !f26141c.contains(str);
    }
}
