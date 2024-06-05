package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: MaterialTextInputPicker */
public final class k<S> extends p<S> {

    /* renamed from: d0  reason: collision with root package name */
    private d<S> f25676d0;

    /* renamed from: e0  reason: collision with root package name */
    private a f25677e0;

    /* compiled from: MaterialTextInputPicker */
    class a implements o<S> {
        a() {
        }

        public void a(S s10) {
            Iterator it = k.this.f25699c0.iterator();
            while (it.hasNext()) {
                ((o) it.next()).a(s10);
            }
        }
    }

    static <T> k<T> H1(d<T> dVar, a aVar) {
        k<T> kVar = new k<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        kVar.u1(bundle);
        return kVar;
    }

    public void I0(Bundle bundle) {
        super.I0(bundle);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f25676d0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f25677e0);
    }

    public void m0(Bundle bundle) {
        super.m0(bundle);
        if (bundle == null) {
            bundle = n();
        }
        this.f25676d0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f25677e0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public View q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f25676d0.O(layoutInflater, viewGroup, bundle, this.f25677e0, new a());
    }
}
