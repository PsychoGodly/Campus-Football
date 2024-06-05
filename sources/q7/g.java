package q7;

import android.util.Base64;
import com.applovin.mediation.MaxReward;
import com.google.protobuf.e1;
import com.google.protobuf.i;
import com.google.protobuf.t1;
import com.unity3d.ads.metadata.MediationMetaData;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p8.b;
import p8.d0;
import p8.u;
import r7.a1;
import r7.p;
import r7.q;
import r7.z0;
import u7.l;
import u7.r;
import u7.s;
import u7.t;
import u7.u;
import u7.w;
import u7.z;
import u8.a;
import x7.n0;

/* compiled from: BundleSerializer */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final SimpleDateFormat f29697a;

    /* renamed from: b  reason: collision with root package name */
    private final n0 f29698b;

    public g(n0 n0Var) {
        this.f29698b = n0Var;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        this.f29697a = simpleDateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
    }

    private void A(List<q> list, JSONObject jSONObject) throws JSONException {
        r j10 = j(jSONObject.getJSONObject("field"));
        String string = jSONObject.getString("op");
        string.hashCode();
        char c10 = 65535;
        switch (string.hashCode()) {
            case -2125479834:
                if (string.equals("IS_NAN")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1465346180:
                if (string.equals("IS_NULL")) {
                    c10 = 1;
                    break;
                }
                break;
            case -244195494:
                if (string.equals("IS_NOT_NAN")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1019893512:
                if (string.equals("IS_NOT_NULL")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                list.add(p.e(j10, p.b.EQUAL, z.f30659a));
                return;
            case 1:
                list.add(p.e(j10, p.b.EQUAL, z.f30660b));
                return;
            case 2:
                list.add(p.e(j10, p.b.NOT_EQUAL, z.f30659a));
                return;
            case 3:
                list.add(p.e(j10, p.b.NOT_EQUAL, z.f30660b));
                return;
            default:
                throw new IllegalArgumentException("Unexpected unary filter: " + string);
        }
    }

    private d0 B(JSONObject jSONObject) throws JSONException {
        d0.b C0 = d0.C0();
        if (jSONObject.has("nullValue")) {
            C0.P(e1.NULL_VALUE);
        } else if (jSONObject.has("booleanValue")) {
            C0.I(jSONObject.optBoolean("booleanValue", false));
        } else if (jSONObject.has("integerValue")) {
            C0.M(jSONObject.optLong("integerValue"));
        } else if (jSONObject.has("doubleValue")) {
            C0.K(jSONObject.optDouble("doubleValue"));
        } else if (jSONObject.has("timestampValue")) {
            y(C0, jSONObject.get("timestampValue"));
        } else if (jSONObject.has("stringValue")) {
            C0.R(jSONObject.optString("stringValue", MaxReward.DEFAULT_LABEL));
        } else if (jSONObject.has("bytesValue")) {
            C0.J(i.o(Base64.decode(jSONObject.getString("bytesValue"), 0)));
        } else if (jSONObject.has("referenceValue")) {
            C0.Q(jSONObject.getString("referenceValue"));
        } else if (jSONObject.has("geoPointValue")) {
            l(C0, jSONObject.getJSONObject("geoPointValue"));
        } else if (jSONObject.has("arrayValue")) {
            a(C0, jSONObject.getJSONObject("arrayValue").optJSONArray("values"));
        } else if (jSONObject.has("mapValue")) {
            o(C0, jSONObject.getJSONObject("mapValue").optJSONObject("fields"));
        } else {
            throw new IllegalArgumentException("Unexpected value type: " + jSONObject);
        }
        return (d0) C0.build();
    }

    private List<q> C(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            k(arrayList, jSONObject);
        }
        return arrayList;
    }

    private static int D(String str) {
        int i10 = 0;
        for (int i11 = 0; i11 < 9; i11++) {
            i10 *= 10;
            if (i11 < str.length()) {
                if (str.charAt(i11) < '0' || str.charAt(i11) > '9') {
                    throw new IllegalArgumentException("Invalid nanoseconds: " + str);
                }
                i10 += str.charAt(i11) - '0';
            }
        }
        return i10;
    }

    private void E(JSONArray jSONArray) {
        if (jSONArray.length() != 1) {
            throw new IllegalArgumentException("Only queries with a single 'from' clause are supported by the Android SDK");
        }
    }

    private void F(JSONObject jSONObject) {
        if (jSONObject.has("offset")) {
            throw new IllegalArgumentException("Queries with offsets are not supported by the Android SDK");
        }
    }

    private void G(JSONObject jSONObject) {
        if (jSONObject.has("select")) {
            throw new IllegalArgumentException("Queries with 'select' statements are not supported by the Android SDK");
        }
    }

    private void a(d0.b bVar, JSONArray jSONArray) throws JSONException {
        b.C0323b o02 = b.o0();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                o02.G(B(jSONArray.getJSONObject(i10)));
            }
        }
        bVar.G(o02);
    }

    private i d(JSONObject jSONObject) throws JSONException {
        String str;
        JSONObject jSONObject2 = jSONObject.getJSONObject("structuredQuery");
        G(jSONObject2);
        u p10 = p(jSONObject.getString("parent"));
        JSONArray jSONArray = jSONObject2.getJSONArray("from");
        E(jSONArray);
        JSONObject jSONObject3 = jSONArray.getJSONObject(0);
        if (jSONObject3.optBoolean("allDescendants", false)) {
            str = jSONObject3.getString("collectionId");
        } else {
            p10 = (u) p10.a(jSONObject3.getString("collectionId"));
            str = null;
        }
        List<q> C = C(jSONObject2.optJSONObject("where"));
        List<z0> r10 = r(jSONObject2.optJSONArray("orderBy"));
        r7.i u10 = u(jSONObject2.optJSONObject("startAt"));
        r7.i g10 = g(jSONObject2.optJSONObject("endAt"));
        F(jSONObject2);
        int m10 = m(jSONObject2);
        return new i(new a1(p10, str, C, r10, (long) m10, a1.a.LIMIT_TO_FIRST, u10, g10).D(), n(jSONObject));
    }

    private void e(List<q> list, JSONObject jSONObject) throws JSONException {
        if (jSONObject.getString("op").equals("AND")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("filters");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    k(list, optJSONArray.getJSONObject(i10));
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The Android SDK only supports composite filters of type 'AND'");
    }

    private r7.i g(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new r7.i(s(jSONObject), !jSONObject.optBoolean("before", false));
    }

    private void h(List<q> list, JSONObject jSONObject) throws JSONException {
        list.add(p.e(j(jSONObject.getJSONObject("field")), i(jSONObject.getString("op")), B(jSONObject.getJSONObject("value"))));
    }

    private p.b i(String str) {
        return p.b.valueOf(str);
    }

    private r j(JSONObject jSONObject) throws JSONException {
        return r.p(jSONObject.getString("fieldPath"));
    }

    private void k(List<q> list, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("compositeFilter")) {
            e(list, jSONObject.getJSONObject("compositeFilter"));
        } else if (jSONObject.has("fieldFilter")) {
            h(list, jSONObject.getJSONObject("fieldFilter"));
        } else if (jSONObject.has("unaryFilter")) {
            A(list, jSONObject.getJSONObject("unaryFilter"));
        }
    }

    private void l(d0.b bVar, JSONObject jSONObject) {
        bVar.L(a.k0().F(jSONObject.optDouble("latitude")).G(jSONObject.optDouble("longitude")));
    }

    private int m(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("limit");
        if (optJSONObject != null) {
            return optJSONObject.optInt("value", -1);
        }
        return jSONObject.optInt("limit", -1);
    }

    private a1.a n(JSONObject jSONObject) {
        String optString = jSONObject.optString("limitType", "FIRST");
        if (optString.equals("FIRST")) {
            return a1.a.LIMIT_TO_FIRST;
        }
        if (optString.equals("LAST")) {
            return a1.a.LIMIT_TO_LAST;
        }
        throw new IllegalArgumentException("Invalid limit type for bundle query: " + optString);
    }

    private void o(d0.b bVar, JSONObject jSONObject) throws JSONException {
        u.b o02 = p8.u.o0();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                o02.H(next, B(jSONObject.getJSONObject(next)));
            }
        }
        bVar.N(o02);
    }

    private u7.u p(String str) {
        u7.u p10 = u7.u.p(str);
        if (this.f29698b.c0(p10)) {
            return (u7.u) p10.l(5);
        }
        throw new IllegalArgumentException("Resource name is not valid for current instance: " + str);
    }

    private List<z0> r(JSONArray jSONArray) throws JSONException {
        z0.a aVar;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                r j10 = j(jSONObject.getJSONObject("field"));
                if (jSONObject.optString("direction", "ASCENDING").equals("ASCENDING")) {
                    aVar = z0.a.ASCENDING;
                } else {
                    aVar = z0.a.DESCENDING;
                }
                arrayList.add(z0.d(aVar, j10));
            }
        }
        return arrayList;
    }

    private List<d0> s(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("values");
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(B(optJSONArray.getJSONObject(i10)));
            }
        }
        return arrayList;
    }

    private w t(Object obj) throws JSONException {
        return new w(v(obj));
    }

    private r7.i u(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new r7.i(s(jSONObject), jSONObject.optBoolean("before", false));
    }

    private y6.q v(Object obj) throws JSONException {
        if (obj instanceof String) {
            return w((String) obj);
        }
        if (obj instanceof JSONObject) {
            return x((JSONObject) obj);
        }
        throw new IllegalArgumentException("Timestamps must be either ISO 8601-formatted strings or JSON objects");
    }

    private y6.q w(String str) {
        try {
            int indexOf = str.indexOf(84);
            if (indexOf != -1) {
                int indexOf2 = str.indexOf(90, indexOf);
                if (indexOf2 == -1) {
                    indexOf2 = str.indexOf(43, indexOf);
                }
                if (indexOf2 == -1) {
                    indexOf2 = str.indexOf(45, indexOf);
                }
                if (indexOf2 != -1) {
                    int i10 = 0;
                    String substring = str.substring(0, indexOf2);
                    String str2 = MaxReward.DEFAULT_LABEL;
                    int indexOf3 = substring.indexOf(46);
                    if (indexOf3 != -1) {
                        String substring2 = substring.substring(0, indexOf3);
                        str2 = substring.substring(indexOf3 + 1);
                        substring = substring2;
                    }
                    long time = this.f29697a.parse(substring).getTime() / 1000;
                    if (!str2.isEmpty()) {
                        i10 = D(str2);
                    }
                    if (str.charAt(indexOf2) != 'Z') {
                        long z10 = z(str.substring(indexOf2 + 1));
                        time = str.charAt(indexOf2) == '+' ? time - z10 : time + z10;
                    } else if (str.length() != indexOf2 + 1) {
                        throw new IllegalArgumentException("Invalid timestamp: Invalid trailing data \"" + str.substring(indexOf2) + "\"");
                    }
                    return new y6.q(time, i10);
                }
                throw new IllegalArgumentException("Invalid timestamp: Missing valid timezone offset: " + str);
            }
            throw new IllegalArgumentException("Invalid timestamp: " + str);
        } catch (ParseException e10) {
            throw new IllegalArgumentException("Failed to parse timestamp", e10);
        }
    }

    private y6.q x(JSONObject jSONObject) {
        return new y6.q(jSONObject.optLong("seconds"), jSONObject.optInt("nanos"));
    }

    private void y(d0.b bVar, Object obj) throws JSONException {
        y6.q v10 = v(obj);
        bVar.S(t1.k0().G(v10.d()).F(v10.c()));
    }

    private static long z(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            return ((Long.parseLong(str.substring(0, indexOf)) * 60) + Long.parseLong(str.substring(indexOf + 1))) * 60;
        }
        throw new IllegalArgumentException("Invalid offset value: " + str);
    }

    public e b(JSONObject jSONObject) throws JSONException {
        return new e(jSONObject.getString("id"), jSONObject.getInt("version"), t(jSONObject.get("createTime")), jSONObject.getInt("totalDocuments"), jSONObject.getLong("totalBytes"));
    }

    public h c(JSONObject jSONObject) throws JSONException {
        l g10 = l.g(p(jSONObject.getString(MediationMetaData.KEY_NAME)));
        w t10 = t(jSONObject.get("readTime"));
        boolean optBoolean = jSONObject.optBoolean("exists", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("queries");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(optJSONArray.getString(i10));
            }
        }
        return new h(g10, t10, optBoolean, arrayList);
    }

    /* access modifiers changed from: package-private */
    public b f(JSONObject jSONObject) throws JSONException {
        l g10 = l.g(p(jSONObject.getString(MediationMetaData.KEY_NAME)));
        w t10 = t(jSONObject.get("updateTime"));
        d0.b C0 = d0.C0();
        o(C0, jSONObject.getJSONObject("fields"));
        return new b(s.n(g10, t10, t.g(C0.F().i0())));
    }

    public j q(JSONObject jSONObject) throws JSONException {
        return new j(jSONObject.getString(MediationMetaData.KEY_NAME), d(jSONObject.getJSONObject("bundledQuery")), t(jSONObject.get("readTime")));
    }
}
