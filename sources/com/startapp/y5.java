package com.startapp;

import android.net.Uri;
import com.startapp.sdk.adsbase.remoteconfig.NetworkDiagnosticConfig;
import com.startapp.sdk.common.SDKException;

/* compiled from: Sta */
public class y5 {

    /* renamed from: a  reason: collision with root package name */
    public final v5 f17562a;

    /* renamed from: b  reason: collision with root package name */
    public final long f17563b = j9.a();

    public y5(v5 v5Var) {
        this.f17562a = v5Var;
    }

    public void a(String str, String str2, SDKException sDKException) {
        int i10;
        String str3;
        long a10 = j9.a();
        v5 v5Var = this.f17562a;
        long j10 = a10 - this.f17563b;
        NetworkDiagnosticConfig a11 = v5Var.a();
        if (a11 != null) {
            if (sDKException == null) {
                str3 = "Success";
                i10 = 4;
            } else if (sDKException.getCause() != null) {
                StringBuilder a12 = p0.a("Failure: ");
                a12.append(sDKException.getCause().getClass().getName());
                str3 = a12.toString();
                i10 = 2;
            } else {
                StringBuilder a13 = p0.a("Error: ");
                a13.append(sDKException.a());
                str3 = a13.toString();
                i10 = 1;
            }
            if ((a11.d() & i10) != 0) {
                Uri b10 = sDKException != null ? sDKException.b() : null;
                if (b10 == null) {
                    b10 = Uri.parse(str2).buildUpon().query((String) null).build();
                }
                v5Var.f17402c.execute(new w5(v5Var, str + ' ' + b10, str3, j10));
            }
            if (i10 == 4) {
                v5Var.f17402c.execute(v5Var.f17404e);
            }
        }
    }
}
