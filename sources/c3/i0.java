package c3;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.List;
import k4.a0;
import k4.j0;
import n2.y2;
import s2.n;

/* compiled from: TsPayloadReader */
public interface i0 {

    /* compiled from: TsPayloadReader */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f5752a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5753b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f5754c;

        public a(String str, int i10, byte[] bArr) {
            this.f5752a = str;
            this.f5753b = i10;
            this.f5754c = bArr;
        }
    }

    /* compiled from: TsPayloadReader */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5755a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5756b;

        /* renamed from: c  reason: collision with root package name */
        public final List<a> f5757c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f5758d;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            List<a> list2;
            this.f5755a = i10;
            this.f5756b = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f5757c = list2;
            this.f5758d = bArr;
        }
    }

    /* compiled from: TsPayloadReader */
    public interface c {
        i0 a(int i10, b bVar);

        SparseArray<i0> b();
    }

    /* compiled from: TsPayloadReader */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f5759a;

        /* renamed from: b  reason: collision with root package name */
        private final int f5760b;

        /* renamed from: c  reason: collision with root package name */
        private final int f5761c;

        /* renamed from: d  reason: collision with root package name */
        private int f5762d;

        /* renamed from: e  reason: collision with root package name */
        private String f5763e;

        public d(int i10, int i11) {
            this(RecyclerView.UNDEFINED_DURATION, i10, i11);
        }

        private void d() {
            if (this.f5762d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f5762d;
            this.f5762d = i10 == Integer.MIN_VALUE ? this.f5760b : i10 + this.f5761c;
            this.f5763e = this.f5759a + this.f5762d;
        }

        public String b() {
            d();
            return this.f5763e;
        }

        public int c() {
            d();
            return this.f5762d;
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH;
            } else {
                str = MaxReward.DEFAULT_LABEL;
            }
            this.f5759a = str;
            this.f5760b = i11;
            this.f5761c = i12;
            this.f5762d = RecyclerView.UNDEFINED_DURATION;
            this.f5763e = MaxReward.DEFAULT_LABEL;
        }
    }

    void a(j0 j0Var, n nVar, d dVar);

    void b();

    void c(a0 a0Var, int i10) throws y2;
}
