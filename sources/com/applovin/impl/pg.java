package com.applovin.impl;

import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public class pg {

    /* renamed from: a  reason: collision with root package name */
    private final String f10643a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10644b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10645c;

    /* renamed from: d  reason: collision with root package name */
    private final String f10646d;

    /* renamed from: e  reason: collision with root package name */
    private final String f10647e;

    /* renamed from: f  reason: collision with root package name */
    private final int f10648f;

    /* renamed from: g  reason: collision with root package name */
    private final int f10649g;

    /* renamed from: h  reason: collision with root package name */
    private final String f10650h;

    /* renamed from: i  reason: collision with root package name */
    private final JSONArray f10651i;

    /* renamed from: j  reason: collision with root package name */
    private final List f10652j;

    /* renamed from: k  reason: collision with root package name */
    private final List f10653k;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f10654a;

        /* renamed from: b  reason: collision with root package name */
        private String f10655b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f10656c;

        /* renamed from: d  reason: collision with root package name */
        private String f10657d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f10658e;

        /* renamed from: f  reason: collision with root package name */
        private String f10659f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f10660g;

        /* renamed from: h  reason: collision with root package name */
        private String f10661h;

        /* renamed from: i  reason: collision with root package name */
        private String f10662i;

        /* renamed from: j  reason: collision with root package name */
        private int f10663j;

        /* renamed from: k  reason: collision with root package name */
        private int f10664k;

        /* renamed from: l  reason: collision with root package name */
        private String f10665l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f10666m;

        /* renamed from: n  reason: collision with root package name */
        private JSONArray f10667n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f10668o;

        /* renamed from: p  reason: collision with root package name */
        private List f10669p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f10670q;

        /* renamed from: r  reason: collision with root package name */
        private List f10671r;

        a() {
        }

        public a a(String str) {
            this.f10659f = str;
            this.f10658e = true;
            return this;
        }

        public a b(String str) {
            this.f10661h = str;
            this.f10660g = true;
            return this;
        }

        public a c(String str) {
            this.f10665l = str;
            return this;
        }

        public a d(String str) {
            this.f10662i = str;
            return this;
        }

        public a e(String str) {
            this.f10657d = str;
            this.f10656c = true;
            return this;
        }

        public a f(String str) {
            this.f10655b = str;
            this.f10654a = true;
            return this;
        }

        public String toString() {
            return "OpenRtbAdConfiguration.Builder(version$value=" + this.f10655b + ", title$value=" + this.f10657d + ", advertiser$value=" + this.f10659f + ", body$value=" + this.f10661h + ", mainImageUrl=" + this.f10662i + ", mainImageWidth=" + this.f10663j + ", mainImageHeight=" + this.f10664k + ", clickDestinationUrl=" + this.f10665l + ", clickTrackingUrls$value=" + this.f10667n + ", jsTrackers$value=" + this.f10669p + ", impressionUrls$value=" + this.f10671r + ")";
        }

        public pg a() {
            String str = this.f10655b;
            if (!this.f10654a) {
                str = pg.g();
            }
            String str2 = str;
            String str3 = this.f10657d;
            if (!this.f10656c) {
                str3 = pg.f();
            }
            String str4 = str3;
            String str5 = this.f10659f;
            if (!this.f10658e) {
                str5 = pg.a();
            }
            String str6 = str5;
            String str7 = this.f10661h;
            if (!this.f10660g) {
                str7 = pg.b();
            }
            String str8 = str7;
            JSONArray jSONArray = this.f10667n;
            if (!this.f10666m) {
                jSONArray = pg.c();
            }
            JSONArray jSONArray2 = jSONArray;
            List list = this.f10669p;
            if (!this.f10668o) {
                list = pg.e();
            }
            List list2 = list;
            List list3 = this.f10671r;
            if (!this.f10670q) {
                list3 = pg.d();
            }
            return new pg(str2, str4, str6, str8, this.f10662i, this.f10663j, this.f10664k, this.f10665l, jSONArray2, list2, list3);
        }

        public a b(List list) {
            this.f10669p = list;
            this.f10668o = true;
            return this;
        }

        public a a(JSONArray jSONArray) {
            this.f10667n = jSONArray;
            this.f10666m = true;
            return this;
        }

        public a b(int i10) {
            this.f10663j = i10;
            return this;
        }

        public a a(List list) {
            this.f10671r = list;
            this.f10670q = true;
            return this;
        }

        public a a(int i10) {
            this.f10664k = i10;
            return this;
        }
    }

    pg(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, JSONArray jSONArray, List list, List list2) {
        this.f10643a = str;
        this.f10644b = str2;
        this.f10645c = str3;
        this.f10646d = str4;
        this.f10647e = str5;
        this.f10648f = i10;
        this.f10649g = i11;
        this.f10650h = str6;
        this.f10651i = jSONArray;
        this.f10652j = list;
        this.f10653k = list2;
    }

    /* access modifiers changed from: private */
    public static String a() {
        return MaxReward.DEFAULT_LABEL;
    }

    /* access modifiers changed from: private */
    public static String b() {
        return MaxReward.DEFAULT_LABEL;
    }

    /* access modifiers changed from: private */
    public static JSONArray c() {
        return new JSONArray();
    }

    /* access modifiers changed from: private */
    public static List d() {
        return new ArrayList();
    }

    /* access modifiers changed from: private */
    public static List e() {
        return new ArrayList();
    }

    /* access modifiers changed from: private */
    public static String f() {
        return MaxReward.DEFAULT_LABEL;
    }

    /* access modifiers changed from: private */
    public static String g() {
        return MaxReward.DEFAULT_LABEL;
    }

    public static a o() {
        return new a();
    }

    public String p() {
        return this.f10645c;
    }

    public String q() {
        return this.f10646d;
    }

    public String r() {
        return this.f10650h;
    }

    public JSONArray s() {
        return this.f10651i;
    }

    public List t() {
        return this.f10653k;
    }

    public List u() {
        return this.f10652j;
    }

    public int v() {
        return this.f10649g;
    }

    public String w() {
        return this.f10647e;
    }

    public int x() {
        return this.f10648f;
    }

    public String y() {
        return this.f10644b;
    }

    public String z() {
        return this.f10643a;
    }
}
