package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* compiled from: CalendarConstraints */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0272a();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final l f25600a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final l f25601b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final l f25602c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final c f25603d;

    /* renamed from: f  reason: collision with root package name */
    private final int f25604f;

    /* renamed from: g  reason: collision with root package name */
    private final int f25605g;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    /* compiled from: CalendarConstraints */
    static class C0272a implements Parcelable.Creator<a> {
        C0272a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a((l) parcel.readParcelable(l.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (C0272a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* compiled from: CalendarConstraints */
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        static final long f25606e = r.a(l.c(1900, 0).f25685h);

        /* renamed from: f  reason: collision with root package name */
        static final long f25607f = r.a(l.c(AdError.BROKEN_MEDIA_ERROR_CODE, 11).f25685h);

        /* renamed from: a  reason: collision with root package name */
        private long f25608a = f25606e;

        /* renamed from: b  reason: collision with root package name */
        private long f25609b = f25607f;

        /* renamed from: c  reason: collision with root package name */
        private Long f25610c;

        /* renamed from: d  reason: collision with root package name */
        private c f25611d = f.a(Long.MIN_VALUE);

        b(a aVar) {
            this.f25608a = aVar.f25600a.f25685h;
            this.f25609b = aVar.f25601b.f25685h;
            this.f25610c = Long.valueOf(aVar.f25602c.f25685h);
            this.f25611d = aVar.f25603d;
        }

        public a a() {
            if (this.f25610c == null) {
                long l22 = i.l2();
                long j10 = this.f25608a;
                if (j10 > l22 || l22 > this.f25609b) {
                    l22 = j10;
                }
                this.f25610c = Long.valueOf(l22);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f25611d);
            return new a(l.d(this.f25608a), l.d(this.f25609b), l.d(this.f25610c.longValue()), (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY"), (C0272a) null);
        }

        public b b(long j10) {
            this.f25610c = Long.valueOf(j10);
            return this;
        }
    }

    /* compiled from: CalendarConstraints */
    public interface c extends Parcelable {
        boolean o(long j10);
    }

    /* synthetic */ a(l lVar, l lVar2, l lVar3, c cVar, C0272a aVar) {
        this(lVar, lVar2, lVar3, cVar);
    }

    public int describeContents() {
        return 0;
    }

    public c e() {
        return this.f25603d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f25600a.equals(aVar.f25600a) || !this.f25601b.equals(aVar.f25601b) || !this.f25602c.equals(aVar.f25602c) || !this.f25603d.equals(aVar.f25603d)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public l g() {
        return this.f25601b;
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f25605g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25600a, this.f25601b, this.f25602c, this.f25603d});
    }

    /* access modifiers changed from: package-private */
    public l i() {
        return this.f25602c;
    }

    /* access modifiers changed from: package-private */
    public l j() {
        return this.f25600a;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f25604f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f25600a, 0);
        parcel.writeParcelable(this.f25601b, 0);
        parcel.writeParcelable(this.f25602c, 0);
        parcel.writeParcelable(this.f25603d, 0);
    }

    private a(l lVar, l lVar2, l lVar3, c cVar) {
        this.f25600a = lVar;
        this.f25601b = lVar2;
        this.f25602c = lVar3;
        this.f25603d = cVar;
        if (lVar.compareTo(lVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (lVar3.compareTo(lVar2) <= 0) {
            this.f25605g = lVar.k(lVar2) + 1;
            this.f25604f = (lVar2.f25682d - lVar.f25682d) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }
}
