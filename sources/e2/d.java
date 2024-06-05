package e2;

import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: LogSourceMetrics */
public final class d {

    /* renamed from: c  reason: collision with root package name */
    private static final d f17780c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final String f17781a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f17782b;

    /* compiled from: LogSourceMetrics */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f17783a = MaxReward.DEFAULT_LABEL;

        /* renamed from: b  reason: collision with root package name */
        private List<c> f17784b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f17783a, Collections.unmodifiableList(this.f17784b));
        }

        public a b(List<c> list) {
            this.f17784b = list;
            return this;
        }

        public a c(String str) {
            this.f17783a = str;
            return this;
        }
    }

    d(String str, List<c> list) {
        this.f17781a = str;
        this.f17782b = list;
    }

    public static a c() {
        return new a();
    }

    @n7.d(tag = 2)
    public List<c> a() {
        return this.f17782b;
    }

    @n7.d(tag = 1)
    public String b() {
        return this.f17781a;
    }
}
