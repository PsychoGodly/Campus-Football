package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import java.util.Calendar;
import java.util.Locale;
import x5.i;

/* compiled from: YearGridAdapter */
class s extends RecyclerView.g<b> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final h<?> f25701a;

    /* compiled from: YearGridAdapter */
    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f25702a;

        a(int i10) {
            this.f25702a = i10;
        }

        public void onClick(View view) {
            s.this.f25701a.Y1(l.c(this.f25702a, s.this.f25701a.S1().f25681c));
            s.this.f25701a.Z1(h.k.DAY);
        }
    }

    /* compiled from: YearGridAdapter */
    public static class b extends RecyclerView.d0 {

        /* renamed from: a  reason: collision with root package name */
        final TextView f25704a;

        b(TextView textView) {
            super(textView);
            this.f25704a = textView;
        }
    }

    s(h<?> hVar) {
        this.f25701a = hVar;
    }

    private View.OnClickListener b(int i10) {
        return new a(i10);
    }

    /* access modifiers changed from: package-private */
    public int c(int i10) {
        return i10 - this.f25701a.Q1().j().f25682d;
    }

    /* access modifiers changed from: package-private */
    public int d(int i10) {
        return this.f25701a.Q1().j().f25682d + i10;
    }

    /* renamed from: e */
    public void onBindViewHolder(b bVar, int i10) {
        int d10 = d(i10);
        String string = bVar.f25704a.getContext().getString(i.mtrl_picker_navigate_to_year_description);
        bVar.f25704a.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(d10)}));
        bVar.f25704a.setContentDescription(String.format(string, new Object[]{Integer.valueOf(d10)}));
        c R1 = this.f25701a.R1();
        Calendar i11 = r.i();
        b bVar2 = i11.get(1) == d10 ? R1.f25623f : R1.f25621d;
        for (Long longValue : this.f25701a.T1().U()) {
            i11.setTimeInMillis(longValue.longValue());
            if (i11.get(1) == d10) {
                bVar2 = R1.f25622e;
            }
        }
        bVar2.d(bVar.f25704a);
        bVar.f25704a.setOnClickListener(b(d10));
    }

    /* renamed from: f */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(x5.h.mtrl_calendar_year, viewGroup, false));
    }

    public int getItemCount() {
        return this.f25701a.Q1().k();
    }
}
