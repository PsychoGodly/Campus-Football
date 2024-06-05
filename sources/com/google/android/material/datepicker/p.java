package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* compiled from: PickerFragment */
abstract class p<S> extends Fragment {

    /* renamed from: c0  reason: collision with root package name */
    protected final LinkedHashSet<o<S>> f25699c0 = new LinkedHashSet<>();

    p() {
    }

    /* access modifiers changed from: package-private */
    public boolean F1(o<S> oVar) {
        return this.f25699c0.add(oVar);
    }

    /* access modifiers changed from: package-private */
    public void G1() {
        this.f25699c0.clear();
    }
}
