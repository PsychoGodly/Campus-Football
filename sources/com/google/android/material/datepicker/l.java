package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: Month */
final class l implements Comparable<l>, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f25679a;

    /* renamed from: b  reason: collision with root package name */
    private final String f25680b;

    /* renamed from: c  reason: collision with root package name */
    final int f25681c;

    /* renamed from: d  reason: collision with root package name */
    final int f25682d;

    /* renamed from: f  reason: collision with root package name */
    final int f25683f;

    /* renamed from: g  reason: collision with root package name */
    final int f25684g;

    /* renamed from: h  reason: collision with root package name */
    final long f25685h;

    /* compiled from: Month */
    static class a implements Parcelable.Creator<l> {
        a() {
        }

        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return l.c(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    private l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d10 = r.d(calendar);
        this.f25679a = d10;
        this.f25681c = d10.get(2);
        this.f25682d = d10.get(1);
        this.f25683f = d10.getMaximum(7);
        this.f25684g = d10.getActualMaximum(5);
        this.f25680b = r.n().format(d10.getTime());
        this.f25685h = d10.getTimeInMillis();
    }

    static l c(int i10, int i11) {
        Calendar k10 = r.k();
        k10.set(1, i10);
        k10.set(2, i11);
        return new l(k10);
    }

    static l d(long j10) {
        Calendar k10 = r.k();
        k10.setTimeInMillis(j10);
        return new l(k10);
    }

    static l l() {
        return new l(r.i());
    }

    /* renamed from: a */
    public int compareTo(l lVar) {
        return this.f25679a.compareTo(lVar.f25679a);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        int firstDayOfWeek = this.f25679a.get(7) - this.f25679a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f25683f : firstDayOfWeek;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f25681c == lVar.f25681c && this.f25682d == lVar.f25682d) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public long g(int i10) {
        Calendar d10 = r.d(this.f25679a);
        d10.set(5, i10);
        return d10.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public String h() {
        return this.f25680b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25681c), Integer.valueOf(this.f25682d)});
    }

    /* access modifiers changed from: package-private */
    public long i() {
        return this.f25679a.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public l j(int i10) {
        Calendar d10 = r.d(this.f25679a);
        d10.add(2, i10);
        return new l(d10);
    }

    /* access modifiers changed from: package-private */
    public int k(l lVar) {
        if (this.f25679a instanceof GregorianCalendar) {
            return ((lVar.f25682d - this.f25682d) * 12) + (lVar.f25681c - this.f25681c);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f25682d);
        parcel.writeInt(this.f25681c);
    }
}
