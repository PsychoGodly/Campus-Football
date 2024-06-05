package v3;

import android.net.Uri;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import n2.r1;
import o3.c;
import r2.m;

/* compiled from: HlsMultivariantPlaylist */
public class h extends i {

    /* renamed from: n  reason: collision with root package name */
    public static final h f23256n = new h(MaxReward.DEFAULT_LABEL, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (r1) null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d  reason: collision with root package name */
    public final List<Uri> f23257d;

    /* renamed from: e  reason: collision with root package name */
    public final List<b> f23258e;

    /* renamed from: f  reason: collision with root package name */
    public final List<a> f23259f;

    /* renamed from: g  reason: collision with root package name */
    public final List<a> f23260g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a> f23261h;

    /* renamed from: i  reason: collision with root package name */
    public final List<a> f23262i;

    /* renamed from: j  reason: collision with root package name */
    public final r1 f23263j;

    /* renamed from: k  reason: collision with root package name */
    public final List<r1> f23264k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, String> f23265l;

    /* renamed from: m  reason: collision with root package name */
    public final List<m> f23266m;

    /* compiled from: HlsMultivariantPlaylist */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f23267a;

        /* renamed from: b  reason: collision with root package name */
        public final r1 f23268b;

        /* renamed from: c  reason: collision with root package name */
        public final String f23269c;

        /* renamed from: d  reason: collision with root package name */
        public final String f23270d;

        public a(Uri uri, r1 r1Var, String str, String str2) {
            this.f23267a = uri;
            this.f23268b = r1Var;
            this.f23269c = str;
            this.f23270d = str2;
        }
    }

    /* compiled from: HlsMultivariantPlaylist */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f23271a;

        /* renamed from: b  reason: collision with root package name */
        public final r1 f23272b;

        /* renamed from: c  reason: collision with root package name */
        public final String f23273c;

        /* renamed from: d  reason: collision with root package name */
        public final String f23274d;

        /* renamed from: e  reason: collision with root package name */
        public final String f23275e;

        /* renamed from: f  reason: collision with root package name */
        public final String f23276f;

        public b(Uri uri, r1 r1Var, String str, String str2, String str3, String str4) {
            this.f23271a = uri;
            this.f23272b = r1Var;
            this.f23273c = str;
            this.f23274d = str2;
            this.f23275e = str3;
            this.f23276f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new r1.b().U("0").M("application/x-mpegURL").G(), (String) null, (String) null, (String) null, (String) null);
        }

        public b a(r1 r1Var) {
            return new b(this.f23271a, r1Var, this.f23273c, this.f23274d, this.f23275e, this.f23276f);
        }
    }

    public h(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, r1 r1Var, List<r1> list7, boolean z10, Map<String, String> map, List<m> list8) {
        super(str, list, z10);
        this.f23257d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f23258e = Collections.unmodifiableList(list2);
        this.f23259f = Collections.unmodifiableList(list3);
        this.f23260g = Collections.unmodifiableList(list4);
        this.f23261h = Collections.unmodifiableList(list5);
        this.f23262i = Collections.unmodifiableList(list6);
        this.f23263j = r1Var;
        this.f23264k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f23265l = Collections.unmodifiableMap(map);
        this.f23266m = Collections.unmodifiableList(list8);
    }

    private static void b(List<a> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f23267a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> d(List<T> list, int i10, List<c> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= list2.size()) {
                    break;
                }
                c cVar = list2.get(i12);
                if (cVar.f21072b == i10 && cVar.f21073c == i11) {
                    arrayList.add(t10);
                    break;
                }
                i12++;
            }
        }
        return arrayList;
    }

    public static h e(String str) {
        return new h(MaxReward.DEFAULT_LABEL, Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (r1) null, (List<r1>) null, false, Collections.emptyMap(), Collections.emptyList());
    }

    private static List<Uri> f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f23271a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public h a(List<c> list) {
        return new h(this.f23277a, this.f23278b, d(this.f23258e, 0, list), Collections.emptyList(), d(this.f23260g, 1, list), d(this.f23261h, 2, list), Collections.emptyList(), this.f23263j, this.f23264k, this.f23279c, this.f23265l, this.f23266m);
    }
}
