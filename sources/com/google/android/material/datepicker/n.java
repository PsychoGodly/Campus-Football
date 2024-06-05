package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.a0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import x5.f;

/* compiled from: MonthsPagerAdapter */
class n extends RecyclerView.g<b> {

    /* renamed from: a  reason: collision with root package name */
    private final a f25691a;

    /* renamed from: b  reason: collision with root package name */
    private final d<?> f25692b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final h.l f25693c;

    /* renamed from: d  reason: collision with root package name */
    private final int f25694d;

    /* compiled from: MonthsPagerAdapter */
    class a implements AdapterView.OnItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f25695a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f25695a = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.f25695a.getAdapter().j(i10)) {
                n.this.f25693c.a(this.f25695a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    /* compiled from: MonthsPagerAdapter */
    public static class b extends RecyclerView.d0 {

        /* renamed from: a  reason: collision with root package name */
        final TextView f25697a;

        /* renamed from: b  reason: collision with root package name */
        final MaterialCalendarGridView f25698b;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(f.month_title);
            this.f25697a = textView;
            a0.o0(textView, true);
            this.f25698b = (MaterialCalendarGridView) linearLayout.findViewById(f.month_grid);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    n(Context context, d<?> dVar, a aVar, h.l lVar) {
        l j10 = aVar.j();
        l g10 = aVar.g();
        l i10 = aVar.i();
        if (j10.compareTo(i10) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (i10.compareTo(g10) <= 0) {
            this.f25694d = (m.f25686f * h.U1(context)) + (i.j2(context) ? h.U1(context) : 0);
            this.f25691a = aVar;
            this.f25692b = dVar;
            this.f25693c = lVar;
            setHasStableIds(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: package-private */
    public l b(int i10) {
        return this.f25691a.j().j(i10);
    }

    /* access modifiers changed from: package-private */
    public CharSequence c(int i10) {
        return b(i10).h();
    }

    /* access modifiers changed from: package-private */
    public int d(l lVar) {
        return this.f25691a.j().k(lVar);
    }

    /* renamed from: e */
    public void onBindViewHolder(b bVar, int i10) {
        l j10 = this.f25691a.j().j(i10);
        bVar.f25697a.setText(j10.h());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f25698b.findViewById(f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !j10.equals(materialCalendarGridView.getAdapter().f25687a)) {
            m mVar = new m(j10, this.f25692b, this.f25691a);
            materialCalendarGridView.setNumColumns(j10.f25683f);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    /* renamed from: f */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(x5.h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!i.j2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f25694d));
        return new b(linearLayout, true);
    }

    public int getItemCount() {
        return this.f25691a.h();
    }

    public long getItemId(int i10) {
        return this.f25691a.j().j(i10).i();
    }
}
