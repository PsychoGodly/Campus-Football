package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryFilterConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
public class m3 {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f16131a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f16132b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f16133c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f16134d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f16135e;

    /* renamed from: f  reason: collision with root package name */
    public final long f16136f;

    /* compiled from: Sta */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f16137a;

        /* renamed from: b  reason: collision with root package name */
        public List<String> f16138b;

        /* renamed from: c  reason: collision with root package name */
        public List<String> f16139c;

        /* renamed from: d  reason: collision with root package name */
        public String f16140d;

        public List<String> a() {
            return this.f16138b;
        }

        public List<String> b() {
            return this.f16139c;
        }

        public List<String> c() {
            return this.f16137a;
        }

        public String d() {
            return this.f16140d;
        }

        public a a(String... strArr) {
            List list = this.f16139c;
            if (list == null) {
                list = new ArrayList();
                this.f16139c = list;
            }
            return a(strArr, list);
        }

        public final a a(String[] strArr, List<String> list) {
            for (String str : strArr) {
                if (str != null) {
                    list.add(str);
                }
            }
            return this;
        }
    }

    public m3(a aVar) {
        this.f16131a = j9.b(aVar.c());
        this.f16132b = j9.b(aVar.a());
        this.f16133c = j9.b((List) null);
        this.f16134d = j9.b((List) null);
        this.f16135e = j9.b(aVar.b());
        this.f16136f = Math.max(0, j9.e(aVar.d()));
    }

    public static List<m3> a(List<AnalyticsCategoryFilterConfig> list) {
        ArrayList arrayList = null;
        if (list == null) {
            return null;
        }
        for (AnalyticsCategoryFilterConfig next : list) {
            if (next != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList(list.size());
                }
                arrayList.add(new m3(next));
            }
        }
        return arrayList != null ? j9.b(arrayList) : arrayList;
    }

    public m3(AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig) {
        this.f16131a = j9.b(analyticsCategoryFilterConfig.e());
        this.f16132b = j9.b(analyticsCategoryFilterConfig.b());
        this.f16133c = j9.b(analyticsCategoryFilterConfig.d());
        this.f16134d = j9.b(analyticsCategoryFilterConfig.a());
        this.f16135e = j9.b(analyticsCategoryFilterConfig.c());
        this.f16136f = Math.max(0, j9.e(analyticsCategoryFilterConfig.f()));
    }
}
