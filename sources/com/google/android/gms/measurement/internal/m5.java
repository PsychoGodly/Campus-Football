package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.measurement.zzv;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class m5 implements zzv {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ i5 f24824a;

    m5(i5 i5Var) {
        this.f24824a = i5Var;
    }

    public final void zza(zzs zzs, String str, List<String> list, boolean z10, boolean z11) {
        p4 p4Var;
        int i10 = o5.f24881a[zzs.ordinal()];
        if (i10 == 1) {
            p4Var = this.f24824a.zzj().A();
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    p4Var = this.f24824a.zzj().E();
                } else {
                    p4Var = this.f24824a.zzj().F();
                }
            } else if (z10) {
                p4Var = this.f24824a.zzj().I();
            } else if (!z11) {
                p4Var = this.f24824a.zzj().H();
            } else {
                p4Var = this.f24824a.zzj().G();
            }
        } else if (z10) {
            p4Var = this.f24824a.zzj().D();
        } else if (!z11) {
            p4Var = this.f24824a.zzj().C();
        } else {
            p4Var = this.f24824a.zzj().B();
        }
        int size = list.size();
        if (size == 1) {
            p4Var.b(str, list.get(0));
        } else if (size == 2) {
            p4Var.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            p4Var.a(str);
        } else {
            p4Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
