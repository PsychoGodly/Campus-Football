package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: UtcDates */
class r {
    static long a(long j10) {
        Calendar k10 = k();
        k10.setTimeInMillis(j10);
        return d(k10).getTimeInMillis();
    }

    static DateFormat b(Locale locale) {
        return c("MMMEd", locale);
    }

    private static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(j());
        return instanceForSkeleton;
    }

    static Calendar d(Calendar calendar) {
        Calendar l10 = l(calendar);
        Calendar k10 = k();
        k10.set(l10.get(1), l10.get(2), l10.get(5));
        return k10;
    }

    private static java.text.DateFormat e(int i10, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i10, locale);
        dateInstance.setTimeZone(h());
        return dateInstance;
    }

    static java.text.DateFormat f(Locale locale) {
        return e(0, locale);
    }

    private static SimpleDateFormat g(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(h());
        return simpleDateFormat;
    }

    private static TimeZone h() {
        return TimeZone.getTimeZone("UTC");
    }

    static Calendar i() {
        return d(Calendar.getInstance());
    }

    private static android.icu.util.TimeZone j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static Calendar k() {
        return l((Calendar) null);
    }

    static Calendar l(Calendar calendar) {
        Calendar instance = Calendar.getInstance(h());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    static DateFormat m(Locale locale) {
        return c("yMMMEd", locale);
    }

    static SimpleDateFormat n() {
        return o(Locale.getDefault());
    }

    private static SimpleDateFormat o(Locale locale) {
        return g("MMMM, yyyy", locale);
    }
}
