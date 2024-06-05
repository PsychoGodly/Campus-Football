package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

/* compiled from: DaysOfWeekAdapter */
class g extends BaseAdapter {

    /* renamed from: d  reason: collision with root package name */
    private static final int f25627d = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f25628a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25629b;

    /* renamed from: c  reason: collision with root package name */
    private final int f25630c;

    public g() {
        Calendar k10 = r.k();
        this.f25628a = k10;
        this.f25629b = k10.getMaximum(7);
        this.f25630c = k10.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f25630c;
        int i12 = this.f25629b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    /* renamed from: a */
    public Integer getItem(int i10) {
        if (i10 >= this.f25629b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    public int getCount() {
        return this.f25629b;
    }

    public long getItemId(int i10) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0017
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = x5.h.mtrl_calendar_day_of_week
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r7 = r5.f25628a
            int r6 = r5.b(r6)
            r2 = 7
            r7.set(r2, r6)
            java.util.Calendar r6 = r5.f25628a
            int r7 = f25627d
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.getDisplayName(r2, r7, r3)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            int r7 = x5.i.mtrl_picker_day_of_week_column_header
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f25628a
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.g.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
