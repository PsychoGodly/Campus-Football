package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;

/* compiled from: MonthAdapter */
class m extends BaseAdapter {

    /* renamed from: f  reason: collision with root package name */
    static final int f25686f = r.k().getMaximum(4);

    /* renamed from: a  reason: collision with root package name */
    final l f25687a;

    /* renamed from: b  reason: collision with root package name */
    final d<?> f25688b;

    /* renamed from: c  reason: collision with root package name */
    c f25689c;

    /* renamed from: d  reason: collision with root package name */
    final a f25690d;

    m(l lVar, d<?> dVar, a aVar) {
        this.f25687a = lVar;
        this.f25688b = dVar;
        this.f25690d = aVar;
    }

    private void e(Context context) {
        if (this.f25689c == null) {
            this.f25689c = new c(context);
        }
    }

    /* access modifiers changed from: package-private */
    public int a(int i10) {
        return b() + (i10 - 1);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f25687a.e();
    }

    /* renamed from: c */
    public Long getItem(int i10) {
        if (i10 < this.f25687a.e() || i10 > h()) {
            return null;
        }
        return Long.valueOf(this.f25687a.g(i(i10)));
    }

    /* JADX WARNING: type inference failed for: r7v19, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0070  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = x5.h.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.b()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L_0x0061
            com.google.android.material.datepicker.l r2 = r5.f25687a
            int r3 = r2.f25684g
            if (r7 < r3) goto L_0x002e
            goto L_0x0061
        L_0x002e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.l r2 = r5.f25687a
            long r2 = r2.g(r7)
            com.google.android.material.datepicker.l r7 = r5.f25687a
            int r7 = r7.f25682d
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.l.l()
            int r4 = r4.f25682d
            if (r7 != r4) goto L_0x0053
            java.lang.String r7 = com.google.android.material.datepicker.e.a(r2)
            r0.setContentDescription(r7)
            goto L_0x005a
        L_0x0053:
            java.lang.String r7 = com.google.android.material.datepicker.e.c(r2)
            r0.setContentDescription(r7)
        L_0x005a:
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L_0x0069
        L_0x0061:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x0069:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0070
            return r0
        L_0x0070:
            com.google.android.material.datepicker.a r7 = r5.f25690d
            com.google.android.material.datepicker.a$c r7 = r7.e()
            long r2 = r6.longValue()
            boolean r7 = r7.o(r2)
            if (r7 == 0) goto L_0x00d5
            r0.setEnabled(r8)
            com.google.android.material.datepicker.d<?> r7 = r5.f25688b
            java.util.Collection r7 = r7.U()
            java.util.Iterator r7 = r7.iterator()
        L_0x008d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b5
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            long r3 = r6.longValue()
            long r3 = com.google.android.material.datepicker.r.a(r3)
            long r1 = com.google.android.material.datepicker.r.a(r1)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x008d
            com.google.android.material.datepicker.c r6 = r5.f25689c
            com.google.android.material.datepicker.b r6 = r6.f25619b
            r6.d(r0)
            return r0
        L_0x00b5:
            java.util.Calendar r7 = com.google.android.material.datepicker.r.i()
            long r7 = r7.getTimeInMillis()
            long r1 = r6.longValue()
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x00cd
            com.google.android.material.datepicker.c r6 = r5.f25689c
            com.google.android.material.datepicker.b r6 = r6.f25620c
            r6.d(r0)
            return r0
        L_0x00cd:
            com.google.android.material.datepicker.c r6 = r5.f25689c
            com.google.android.material.datepicker.b r6 = r6.f25618a
            r6.d(r0)
            return r0
        L_0x00d5:
            r0.setEnabled(r1)
            com.google.android.material.datepicker.c r6 = r5.f25689c
            com.google.android.material.datepicker.b r6 = r6.f25624g
            r6.d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* access modifiers changed from: package-private */
    public boolean f(int i10) {
        return i10 % this.f25687a.f25683f == 0;
    }

    /* access modifiers changed from: package-private */
    public boolean g(int i10) {
        return (i10 + 1) % this.f25687a.f25683f == 0;
    }

    public int getCount() {
        return this.f25687a.f25684g + b();
    }

    public long getItemId(int i10) {
        return (long) (i10 / this.f25687a.f25683f);
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return (this.f25687a.e() + this.f25687a.f25684g) - 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public int i(int i10) {
        return (i10 - this.f25687a.e()) + 1;
    }

    /* access modifiers changed from: package-private */
    public boolean j(int i10) {
        return i10 >= b() && i10 <= h();
    }
}
