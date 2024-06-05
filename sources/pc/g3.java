package pc;

import android.net.Uri;
import com.applovin.mediation.MaxReward;
import com.google.firebase.auth.a;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.b;
import com.google.firebase.auth.b1;
import com.google.firebase.auth.c0;
import com.google.firebase.auth.c1;
import com.google.firebase.auth.d;
import com.google.firebase.auth.e;
import com.google.firebase.auth.e0;
import com.google.firebase.auth.g;
import com.google.firebase.auth.g0;
import com.google.firebase.auth.h;
import com.google.firebase.auth.i;
import com.google.firebase.auth.j0;
import com.google.firebase.auth.k;
import com.google.firebase.auth.m;
import com.google.firebase.auth.m0;
import com.google.firebase.auth.n0;
import com.google.firebase.auth.q0;
import com.google.firebase.auth.t0;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import pc.a1;

/* compiled from: PigeonParser */
public class g3 {
    static e a(a1.q qVar) {
        e.a C = e.C();
        C.f(qVar.h());
        if (qVar.e() != null) {
            C.c(qVar.e());
        }
        C.d(qVar.f().booleanValue());
        if (qVar.d() != null) {
            C.b(qVar.d(), qVar.b().booleanValue(), qVar.c());
        }
        if (qVar.g() != null) {
            C.e(qVar.g());
        }
        return C.a();
    }

    static h b(Map<String, Object> map) {
        if (map.get("token") != null) {
            h hVar = u.f37186j.get(Integer.valueOf(((Integer) map.get("token")).intValue()));
            if (hVar != null) {
                return hVar;
            }
            throw v.b();
        }
        Object obj = map.get("signInMethod");
        Objects.requireNonNull(obj);
        String str = (String) obj;
        String str2 = (String) map.get("secret");
        String str3 = (String) map.get("idToken");
        String str4 = (String) map.get("accessToken");
        String str5 = (String) map.get("rawNonce");
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1830313082:
                if (str.equals("twitter.com")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1536293812:
                if (str.equals("google.com")) {
                    c10 = 1;
                    break;
                }
                break;
            case -364826023:
                if (str.equals("facebook.com")) {
                    c10 = 2;
                    break;
                }
                break;
            case 105516695:
                if (str.equals("oauth")) {
                    c10 = 3;
                    break;
                }
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1216985755:
                if (str.equals(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD)) {
                    c10 = 5;
                    break;
                }
                break;
            case 1985010934:
                if (str.equals("github.com")) {
                    c10 = 6;
                    break;
                }
                break;
            case 2120171958:
                if (str.equals("emailLink")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                Objects.requireNonNull(str4);
                Objects.requireNonNull(str2);
                return b1.a(str4, str2);
            case 1:
                return g0.a(str3, str4);
            case 2:
                Objects.requireNonNull(str4);
                return m.a(str4);
            case 3:
                Object obj2 = map.get("providerId");
                Objects.requireNonNull(obj2);
                n0.b f10 = n0.f((String) obj2);
                Objects.requireNonNull(str4);
                f10.b(str4);
                if (str5 == null) {
                    Objects.requireNonNull(str3);
                    f10.c(str3);
                } else {
                    Objects.requireNonNull(str3);
                    f10.d(str3, str5);
                }
                return f10.a();
            case 4:
                Object obj3 = map.get("verificationId");
                Objects.requireNonNull(obj3);
                Object obj4 = map.get("smsCode");
                Objects.requireNonNull(obj4);
                return q0.a((String) obj3, (String) obj4);
            case 5:
                Object obj5 = map.get("email");
                Objects.requireNonNull(obj5);
                Objects.requireNonNull(str2);
                return k.a((String) obj5, str2);
            case 6:
                Objects.requireNonNull(str4);
                return e0.a(str4);
            case 7:
                Object obj6 = map.get("email");
                Objects.requireNonNull(obj6);
                Object obj7 = map.get("emailLink");
                Objects.requireNonNull(obj7);
                return k.b((String) obj6, (String) obj7);
            default:
                return null;
        }
    }

    static List<List<Object>> c(List<j0> list) {
        ArrayList arrayList = new ArrayList();
        for (a1.v g10 : d(list)) {
            arrayList.add(g10.g());
        }
        return arrayList;
    }

    static List<a1.v> d(List<j0> list) {
        ArrayList arrayList = new ArrayList();
        for (j0 next : list) {
            if (next instanceof t0) {
                arrayList.add(new a1.v.a().e(((t0) next).getPhoneNumber()).b(next.m()).c(Double.valueOf((double) next.v())).f(next.c()).d(next.w()).a());
            } else {
                arrayList.add(new a1.v.a().b(next.m()).c(Double.valueOf((double) next.v())).f(next.c()).d(next.w()).a());
            }
        }
        return arrayList;
    }

    static a1.o e(d dVar) {
        a1.o.a aVar = new a1.o.a();
        a1.p.a aVar2 = new a1.p.a();
        int a10 = dVar.a();
        if (a10 == 0) {
            aVar.c(a1.a.PASSWORD_RESET);
        } else if (a10 == 1) {
            aVar.c(a1.a.VERIFY_EMAIL);
        } else if (a10 == 2) {
            aVar.c(a1.a.RECOVER_EMAIL);
        } else if (a10 == 4) {
            aVar.c(a1.a.EMAIL_SIGN_IN);
        } else if (a10 == 5) {
            aVar.c(a1.a.VERIFY_AND_CHANGE_EMAIL);
        } else if (a10 == 6) {
            aVar.c(a1.a.REVERT_SECOND_FACTOR_ADDITION);
        }
        b b10 = dVar.b();
        if ((b10 != null && a10 == 1) || a10 == 0) {
            aVar2.b(b10.a());
        } else if (a10 == 2 || a10 == 5) {
            Objects.requireNonNull(b10);
            a aVar3 = (a) b10;
            aVar2.b(aVar3.a());
            aVar2.c(aVar3.b());
        }
        aVar.b(aVar2.a());
        return aVar.a();
    }

    private static a1.r f(g gVar) {
        if (gVar == null) {
            return null;
        }
        a1.r.a aVar = new a1.r.a();
        aVar.b(Boolean.valueOf(gVar.X()));
        aVar.c(gVar.R());
        aVar.d(gVar.D());
        aVar.e(gVar.H());
        return aVar.a();
    }

    static a1.s g(h hVar) {
        if (hVar == null) {
            return null;
        }
        int hashCode = hVar.hashCode();
        u.f37186j.put(Integer.valueOf(hashCode), hVar);
        a1.s.a aVar = new a1.s.a();
        aVar.d(hVar.v());
        aVar.e(hVar.w());
        aVar.c(Long.valueOf((long) hashCode));
        if (hVar instanceof m0) {
            aVar.b(((m0) hVar).y());
        }
        return aVar.a();
    }

    static a1.a0 h(i iVar) {
        a1.a0.a aVar = new a1.a0.a();
        aVar.b(f(iVar.P()));
        aVar.c(g(iVar.Q()));
        aVar.d(i(iVar.V()));
        return aVar.a();
    }

    static a1.b0 i(a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        a1.b0.a aVar = new a1.b0.a();
        a1.c0.a aVar2 = new a1.c0.a();
        aVar2.c(a0Var.m());
        aVar2.d(a0Var.getEmail());
        aVar2.f(Boolean.valueOf(a0Var.g()));
        aVar2.e(Boolean.valueOf(a0Var.C()));
        if (a0Var.x() != null) {
            aVar2.b(Long.valueOf(a0Var.x().G()));
            aVar2.g(Long.valueOf(a0Var.x().N()));
        }
        aVar2.h(a0Var.getPhoneNumber());
        aVar2.i(j(a0Var.e()));
        aVar2.k(a0Var.c());
        aVar2.j(a0Var.B());
        aVar.c(aVar2.a());
        aVar.b(l(a0Var.z()));
        return aVar.a();
    }

    private static String j(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        if (MaxReward.DEFAULT_LABEL.equals(uri2)) {
            return null;
        }
        return uri2;
    }

    static a1.u k(c0 c0Var) {
        a1.u.a aVar = new a1.u.a();
        aVar.h(c0Var.g());
        aVar.f(c0Var.e());
        aVar.b(Long.valueOf(c0Var.a() * 1000));
        aVar.d(Long.valueOf(c0Var.c() * 1000));
        aVar.e(Long.valueOf(c0Var.d() * 1000));
        aVar.c(c0Var.b());
        aVar.g(c0Var.f());
        return aVar.a();
    }

    private static List<Map<Object, Object>> l(List<? extends c1> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            c1 c1Var = (c1) it.next();
            if (c1Var != null && !"firebase".equals(c1Var.D())) {
                arrayList.add(m(c1Var));
            }
        }
        return arrayList;
    }

    private static Map<Object, Object> m(c1 c1Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("displayName", c1Var.m());
        hashMap.put("email", c1Var.getEmail());
        hashMap.put("isEmailVerified", Boolean.valueOf(c1Var.g()));
        hashMap.put("phoneNumber", c1Var.getPhoneNumber());
        hashMap.put("photoUrl", j(c1Var.e()));
        hashMap.put("uid", c1Var.c() == null ? MaxReward.DEFAULT_LABEL : c1Var.c());
        hashMap.put("providerId", c1Var.D());
        hashMap.put("isAnonymous", Boolean.FALSE);
        return hashMap;
    }
}
