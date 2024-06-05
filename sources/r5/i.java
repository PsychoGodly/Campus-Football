package r5;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.d;
import com.google.android.gms.measurement.internal.d0;
import com.google.android.gms.measurement.internal.hb;
import com.google.android.gms.measurement.internal.lb;
import com.google.android.gms.measurement.internal.na;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public interface i extends IInterface {
    List<hb> G(String str, String str2, String str3, boolean z10) throws RemoteException;

    void L(lb lbVar) throws RemoteException;

    void M(Bundle bundle, lb lbVar) throws RemoteException;

    void N(lb lbVar) throws RemoteException;

    void O0(d dVar) throws RemoteException;

    c S0(lb lbVar) throws RemoteException;

    List<hb> Y0(String str, String str2, boolean z10, lb lbVar) throws RemoteException;

    String Z(lb lbVar) throws RemoteException;

    void c1(d0 d0Var, String str, String str2) throws RemoteException;

    List<na> e1(lb lbVar, Bundle bundle) throws RemoteException;

    void h0(d0 d0Var, lb lbVar) throws RemoteException;

    List<hb> j1(lb lbVar, boolean z10) throws RemoteException;

    void l0(long j10, String str, String str2, String str3) throws RemoteException;

    List<d> n(String str, String str2, lb lbVar) throws RemoteException;

    byte[] n0(d0 d0Var, String str) throws RemoteException;

    void p0(lb lbVar) throws RemoteException;

    List<d> q0(String str, String str2, String str3) throws RemoteException;

    void r1(d dVar, lb lbVar) throws RemoteException;

    void s(lb lbVar) throws RemoteException;

    void t1(hb hbVar, lb lbVar) throws RemoteException;
}
