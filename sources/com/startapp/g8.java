package com.startapp;

import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import java.util.List;

/* compiled from: Sta */
public class g8 extends TelephonyManager.CellInfoCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h8 f15865a;

    public g8(h8 h8Var) {
        this.f15865a = h8Var;
    }

    public void onCellInfo(List<CellInfo> list) {
        this.f15865a.b(false);
    }
}
