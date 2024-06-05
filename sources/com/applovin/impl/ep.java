package com.applovin.impl;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.List;

public interface ep {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f7487a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7488b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f7489c;

        public a(String str, int i10, byte[] bArr) {
            this.f7487a = str;
            this.f7488b = i10;
            this.f7489c = bArr;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f7490a;

        /* renamed from: b  reason: collision with root package name */
        public final String f7491b;

        /* renamed from: c  reason: collision with root package name */
        public final List f7492c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f7493d;

        public b(int i10, String str, List list, byte[] bArr) {
            List list2;
            this.f7490a = i10;
            this.f7491b = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f7492c = list2;
            this.f7493d = bArr;
        }
    }

    public interface c {
        SparseArray a();

        ep a(int i10, b bVar);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f7494a;

        /* renamed from: b  reason: collision with root package name */
        private final int f7495b;

        /* renamed from: c  reason: collision with root package name */
        private final int f7496c;

        /* renamed from: d  reason: collision with root package name */
        private int f7497d;

        /* renamed from: e  reason: collision with root package name */
        private String f7498e;

        public d(int i10, int i11) {
            this(RecyclerView.UNDEFINED_DURATION, i10, i11);
        }

        private void d() {
            if (this.f7497d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f7497d;
            this.f7497d = i10 == Integer.MIN_VALUE ? this.f7495b : i10 + this.f7496c;
            this.f7498e = this.f7494a + this.f7497d;
        }

        public String b() {
            d();
            return this.f7498e;
        }

        public int c() {
            d();
            return this.f7497d;
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH;
            } else {
                str = MaxReward.DEFAULT_LABEL;
            }
            this.f7494a = str;
            this.f7495b = i11;
            this.f7496c = i12;
            this.f7497d = RecyclerView.UNDEFINED_DURATION;
            this.f7498e = MaxReward.DEFAULT_LABEL;
        }
    }

    void a();

    void a(io ioVar, k8 k8Var, d dVar);

    void a(yg ygVar, int i10);
}
