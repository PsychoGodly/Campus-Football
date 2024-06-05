package com.applovin.impl;

import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class i1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f8403a;

    static final class a extends i1 {

        /* renamed from: b  reason: collision with root package name */
        public final long f8404b;

        /* renamed from: c  reason: collision with root package name */
        public final List f8405c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final List f8406d = new ArrayList();

        public a(int i10, long j10) {
            super(i10);
            this.f8404b = j10;
        }

        public void a(a aVar) {
            this.f8406d.add(aVar);
        }

        public a d(int i10) {
            int size = this.f8406d.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = (a) this.f8406d.get(i11);
                if (aVar.f8403a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        public b e(int i10) {
            int size = this.f8405c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) this.f8405c.get(i11);
                if (bVar.f8403a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public String toString() {
            return i1.a(this.f8403a) + " leaves: " + Arrays.toString(this.f8405c.toArray()) + " containers: " + Arrays.toString(this.f8406d.toArray());
        }

        public void a(b bVar) {
            this.f8405c.add(bVar);
        }
    }

    static final class b extends i1 {

        /* renamed from: b  reason: collision with root package name */
        public final yg f8407b;

        public b(int i10, yg ygVar) {
            super(i10);
            this.f8407b = ygVar;
        }
    }

    public i1(int i10) {
        this.f8403a = i10;
    }

    public static String a(int i10) {
        return MaxReward.DEFAULT_LABEL + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int b(int i10) {
        return i10 & 16777215;
    }

    public static int c(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return a(this.f8403a);
    }
}
