package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* compiled from: DateSelector */
public interface d<S> extends Parcelable {
    Collection<androidx.core.util.d<Long, Long>> E();

    View O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, o<S> oVar);

    int S(Context context);

    boolean T();

    Collection<Long> U();

    S W();

    void b0(long j10);

    String f(Context context);
}
