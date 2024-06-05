package com.onesignal;

import com.applovin.mediation.MaxReward;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageInternal */
class i1 extends c1 {

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, HashMap<String, String>> f27845b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<ArrayList<f3>> f27846c;

    /* renamed from: d  reason: collision with root package name */
    private Set<String> f27847d;

    /* renamed from: e  reason: collision with root package name */
    private r1 f27848e = new r1();

    /* renamed from: f  reason: collision with root package name */
    private double f27849f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f27850g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f27851h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f27852i;

    /* renamed from: j  reason: collision with root package name */
    private Date f27853j;

    /* renamed from: k  reason: collision with root package name */
    boolean f27854k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f27855l;

    i1(boolean z10) {
        super(MaxReward.DEFAULT_LABEL);
        this.f27854k = z10;
    }

    private Date k(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("end_time");
            if (string.equals("null")) {
                return null;
            }
            try {
                return x3.a().parse(string);
            } catch (ParseException e10) {
                e10.printStackTrace();
                return null;
            }
        } catch (JSONException unused) {
            return null;
        }
    }

    private HashMap<String, HashMap<String, String>> m(JSONObject jSONObject) throws JSONException {
        HashMap<String, HashMap<String, String>> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            HashMap hashMap2 = new HashMap();
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                hashMap2.put(next2, jSONObject2.getString(next2));
            }
            hashMap.put(next, hashMap2);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public void b(String str) {
        this.f27847d.add(str);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f27847d.clear();
    }

    /* access modifiers changed from: package-private */
    public Set<String> d() {
        return this.f27847d;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f27855l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f27580a.equals(((i1) obj).f27580a);
    }

    /* access modifiers changed from: package-private */
    public r1 f() {
        return this.f27848e;
    }

    /* access modifiers changed from: package-private */
    public boolean g(String str) {
        return !this.f27847d.contains(str);
    }

    public boolean h() {
        return this.f27850g;
    }

    public int hashCode() {
        return this.f27580a.hashCode();
    }

    public boolean i() {
        if (this.f27853j == null) {
            return false;
        }
        return this.f27853j.before(new Date());
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.f27851h;
    }

    /* access modifiers changed from: protected */
    public ArrayList<ArrayList<f3>> l(JSONArray jSONArray) throws JSONException {
        ArrayList<ArrayList<f3>> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList2.add(new f3(jSONArray2.getJSONObject(i11)));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void n(String str) {
        this.f27847d.remove(str);
    }

    /* access modifiers changed from: package-private */
    public void o(double d10) {
        this.f27849f = d10;
    }

    public void p(boolean z10) {
        this.f27850g = z10;
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z10) {
        this.f27851h = z10;
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        if (this.f27852i) {
            return false;
        }
        this.f27852i = true;
        return true;
    }

    public String toString() {
        return "OSInAppMessage{messageId='" + this.f27580a + '\'' + ", variants=" + this.f27845b + ", triggers=" + this.f27846c + ", clickedClickIds=" + this.f27847d + ", redisplayStats=" + this.f27848e + ", displayDuration=" + this.f27849f + ", displayedInSession=" + this.f27850g + ", triggerChanged=" + this.f27851h + ", actionTaken=" + this.f27852i + ", isPreview=" + this.f27854k + ", endTime=" + this.f27853j + ", hasLiquid=" + this.f27855l + '}';
    }

    i1(String str, Set<String> set, boolean z10, r1 r1Var) {
        super(str);
        this.f27847d = set;
        this.f27850g = z10;
        this.f27848e = r1Var;
    }

    i1(JSONObject jSONObject) throws JSONException {
        super(jSONObject.getString("id"));
        this.f27845b = m(jSONObject.getJSONObject("variants"));
        this.f27846c = l(jSONObject.getJSONArray("triggers"));
        this.f27847d = new HashSet();
        this.f27853j = k(jSONObject);
        if (jSONObject.has("has_liquid")) {
            this.f27855l = jSONObject.getBoolean("has_liquid");
        }
        if (jSONObject.has("redisplay")) {
            this.f27848e = new r1(jSONObject.getJSONObject("redisplay"));
        }
    }
}
