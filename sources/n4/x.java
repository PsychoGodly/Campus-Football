package n4;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.internal.ads.zzbza;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public class x {

    /* renamed from: e  reason: collision with root package name */
    public static final List f20960e = Arrays.asList(new String[]{"MA", "T", "PG", "G"});

    /* renamed from: a  reason: collision with root package name */
    private final int f20961a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20962b;

    /* renamed from: c  reason: collision with root package name */
    private final String f20963c;

    /* renamed from: d  reason: collision with root package name */
    private final List f20964d;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f20965a = -1;

        /* renamed from: b  reason: collision with root package name */
        private int f20966b = -1;

        /* renamed from: c  reason: collision with root package name */
        private String f20967c = null;

        /* renamed from: d  reason: collision with root package name */
        private final List f20968d = new ArrayList();

        public x a() {
            return new x(this.f20965a, this.f20966b, this.f20967c, this.f20968d, (j0) null);
        }

        public a b(String str) {
            if (str == null || MaxReward.DEFAULT_LABEL.equals(str)) {
                this.f20967c = null;
            } else if ("G".equals(str) || "PG".equals(str) || "T".equals(str) || "MA".equals(str)) {
                this.f20967c = str;
            } else {
                zzbza.zzj("Invalid value passed to setMaxAdContentRating: ".concat(str));
            }
            return this;
        }

        public a c(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.f20965a = i10;
            } else {
                zzbza.zzj("Invalid value passed to setTagForChildDirectedTreatment: " + i10);
            }
            return this;
        }

        public a d(int i10) {
            if (i10 == -1 || i10 == 0 || i10 == 1) {
                this.f20966b = i10;
            } else {
                zzbza.zzj("Invalid value passed to setTagForUnderAgeOfConsent: " + i10);
            }
            return this;
        }

        public a e(List<String> list) {
            this.f20968d.clear();
            if (list != null) {
                this.f20968d.addAll(list);
            }
            return this;
        }
    }

    /* synthetic */ x(int i10, int i11, String str, List list, j0 j0Var) {
        this.f20961a = i10;
        this.f20962b = i11;
        this.f20963c = str;
        this.f20964d = list;
    }

    public String a() {
        String str = this.f20963c;
        return str == null ? MaxReward.DEFAULT_LABEL : str;
    }

    public int b() {
        return this.f20961a;
    }

    public int c() {
        return this.f20962b;
    }

    public List<String> d() {
        return new ArrayList(this.f20964d);
    }

    public a e() {
        a aVar = new a();
        aVar.c(this.f20961a);
        aVar.d(this.f20962b);
        aVar.b(this.f20963c);
        aVar.e(this.f20964d);
        return aVar;
    }
}
