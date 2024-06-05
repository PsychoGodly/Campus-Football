package com.startapp;

import android.os.Handler;
import android.os.SystemClock;
import android.widget.TextView;

/* compiled from: Sta */
public class i5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h5 f15924a;

    public i5(h5 h5Var) {
        this.f15924a = h5Var;
    }

    public void run() {
        long j10 = 1000;
        long uptimeMillis = (((long) this.f15924a.f16013s) * 1000) - SystemClock.uptimeMillis();
        h5 h5Var = this.f15924a;
        long j11 = uptimeMillis + h5Var.f15726z;
        TextView textView = h5Var.O;
        if (textView != null) {
            long j12 = j11 / 1000;
            if (j12 > 0 && j11 % 1000 < 100) {
                j12--;
            }
            textView.setText(String.valueOf(j12));
        }
        if (j11 >= 1000) {
            Handler handler = this.f15924a.S;
            long j13 = j11 % 1000;
            if (j13 != 0) {
                j10 = j13;
            }
            handler.postDelayed(this, j10);
            return;
        }
        h5 h5Var2 = this.f15924a;
        if (h5Var2.O != null) {
            h5Var2.P.setVisibility(8);
            this.f15924a.O.setVisibility(8);
        }
        this.f15924a.t();
    }
}
