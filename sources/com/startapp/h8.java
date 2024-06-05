package com.startapp;

import android.content.Context;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.LocationMetadata;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class h8 extends j6<f8> {

    /* renamed from: j  reason: collision with root package name */
    public final u1 f15900j;

    /* renamed from: k  reason: collision with root package name */
    public final i2<TelephonyMetadata> f15901k;

    /* renamed from: l  reason: collision with root package name */
    public final i2<LocationMetadata> f15902l;

    /* compiled from: Sta */
    public class a implements Comparator<CellInfo> {
        public a(h8 h8Var) {
        }

        public int compare(Object obj, Object obj2) {
            CellInfo cellInfo = (CellInfo) obj;
            CellInfo cellInfo2 = (CellInfo) obj2;
            if (cellInfo.isRegistered() == cellInfo2.isRegistered()) {
                return h8.a(cellInfo2) - h8.a(cellInfo);
            }
            if (cellInfo.isRegistered()) {
                return -1;
            }
            return cellInfo2.isRegistered() ? 1 : 0;
        }
    }

    public h8(Context context, e eVar, v2 v2Var, u1 u1Var, i2<TelephonyMetadata> i2Var, i2<LocationMetadata> i2Var2) {
        super(context, eVar, v2Var, "c9c194d3e01bcf14", "086ea3852ae4e475");
        this.f15900j = u1Var;
        this.f15901k = i2Var;
        this.f15902l = i2Var2;
    }

    public final boolean a(int i10) {
        TelephonyMetadata a10 = this.f15901k.a();
        if (a10 == null || !a10.c()) {
            a10 = null;
        }
        if (a10 == null || (a10.a() & i10) != i10 || Math.random() >= a10.b()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c2 A[Catch:{ all -> 0x00b3, all -> 0x00c8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(boolean r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.f17478a     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x00ef }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ all -> 0x00ef }
            com.startapp.f8 r1 = new com.startapp.f8     // Catch:{ all -> 0x00ef }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x00ef }
            r2.<init>()     // Catch:{ all -> 0x00ef }
            r1.<init>(r2)     // Catch:{ all -> 0x00ef }
            int r2 = r0.getSimState()     // Catch:{ all -> 0x00ef }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00ef }
            r3 = 7
            r1.a(r3, r2)     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = r0.getSimOperator()     // Catch:{ all -> 0x00ef }
            r3 = 8
            r1.a(r3, r2)     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = r0.getSimOperatorName()     // Catch:{ all -> 0x00ef }
            r3 = 9
            r1.a(r3, r2)     // Catch:{ all -> 0x00ef }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00ef }
            r3 = 28
            if (r2 < r3) goto L_0x0052
            int r3 = r0.getSimCarrierId()     // Catch:{ all -> 0x00ef }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00ef }
            r4 = 15
            r1.a(r4, r3)     // Catch:{ all -> 0x00ef }
            java.lang.CharSequence r3 = r0.getSimCarrierIdName()     // Catch:{ all -> 0x00ef }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00ef }
            r4 = 16
            r1.a(r4, r3)     // Catch:{ all -> 0x00ef }
        L_0x0052:
            int r3 = r0.getPhoneType()     // Catch:{ all -> 0x00ef }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00ef }
            r4 = 10
            r1.a(r4, r3)     // Catch:{ all -> 0x00ef }
            java.lang.String r3 = r0.getNetworkOperator()     // Catch:{ all -> 0x00ef }
            java.lang.String r3 = com.startapp.a.b(r3)     // Catch:{ all -> 0x00ef }
            r4 = 11
            r1.a(r4, r3)     // Catch:{ all -> 0x00ef }
            java.lang.String r3 = r0.getNetworkOperatorName()     // Catch:{ all -> 0x00ef }
            java.lang.String r3 = com.startapp.a.b(r3)     // Catch:{ all -> 0x00ef }
            r4 = 12
            r1.a(r4, r3)     // Catch:{ all -> 0x00ef }
            com.startapp.i2<com.startapp.sdk.adsbase.remoteconfig.LocationMetadata> r3 = r5.f15902l     // Catch:{ all -> 0x00ef }
            java.lang.Object r3 = r3.a()     // Catch:{ all -> 0x00ef }
            com.startapp.sdk.adsbase.remoteconfig.LocationMetadata r3 = (com.startapp.sdk.adsbase.remoteconfig.LocationMetadata) r3     // Catch:{ all -> 0x00ef }
            if (r3 == 0) goto L_0x0092
            boolean r3 = r3.a()     // Catch:{ all -> 0x00ef }
            if (r3 == 0) goto L_0x0092
            android.content.Context r3 = r5.f17478a     // Catch:{ all -> 0x00ef }
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r3 = com.startapp.a0.a((android.content.Context) r3, (java.lang.String) r4)     // Catch:{ all -> 0x00ef }
            goto L_0x0093
        L_0x0092:
            r3 = 0
        L_0x0093:
            if (r3 == 0) goto L_0x00eb
            r3 = 29
            if (r2 < r3) goto L_0x00d4
            if (r6 == 0) goto L_0x00d4
            com.startapp.i2<com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata> r6 = r5.f15901k     // Catch:{ all -> 0x00ef }
            java.lang.Object r6 = r6.a()     // Catch:{ all -> 0x00ef }
            com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata r6 = (com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata) r6     // Catch:{ all -> 0x00ef }
            if (r6 == 0) goto L_0x00d4
            boolean r6 = r6.d()     // Catch:{ all -> 0x00ef }
            if (r6 == 0) goto L_0x00d4
            if (r2 < r3) goto L_0x00bf
            com.startapp.g8 r6 = new com.startapp.g8     // Catch:{ all -> 0x00b3 }
            r6.<init>(r5)     // Catch:{ all -> 0x00b3 }
            goto L_0x00c0
        L_0x00b3:
            r6 = move-exception
            r2 = 32
            boolean r2 = r5.a((int) r2)     // Catch:{ all -> 0x00c8 }
            if (r2 == 0) goto L_0x00bf
            com.startapp.i3.a((java.lang.Throwable) r6)     // Catch:{ all -> 0x00c8 }
        L_0x00bf:
            r6 = 0
        L_0x00c0:
            if (r6 == 0) goto L_0x00d4
            com.startapp.v2 r2 = r5.f15975f     // Catch:{ all -> 0x00c8 }
            r0.requestCellInfoUpdate(r2, r6)     // Catch:{ all -> 0x00c8 }
            goto L_0x00d4
        L_0x00c8:
            r6 = move-exception
            r2 = 64
            boolean r2 = r5.a((int) r2)     // Catch:{ all -> 0x00ef }
            if (r2 == 0) goto L_0x00d4
            com.startapp.i3.a((java.lang.Throwable) r6)     // Catch:{ all -> 0x00ef }
        L_0x00d4:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00ef }
            r2 = 17
            if (r6 < r2) goto L_0x00e4
            java.util.List r6 = r0.getAllCellInfo()     // Catch:{ all -> 0x00ef }
            if (r6 == 0) goto L_0x00eb
            r5.a((com.startapp.f8) r1, (java.util.List<android.telephony.CellInfo>) r6)     // Catch:{ all -> 0x00ef }
            goto L_0x00eb
        L_0x00e4:
            android.telephony.CellLocation r6 = r0.getCellLocation()     // Catch:{ all -> 0x00ef }
            r5.a((com.startapp.f8) r1, (android.telephony.CellLocation) r6)     // Catch:{ all -> 0x00ef }
        L_0x00eb:
            r5.b(r1)     // Catch:{ all -> 0x00ef }
            goto L_0x00fb
        L_0x00ef:
            r6 = move-exception
            r0 = 128(0x80, float:1.794E-43)
            boolean r0 = r5.a((int) r0)
            if (r0 == 0) goto L_0x00fb
            com.startapp.i3.a((java.lang.Throwable) r6)
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.h8.b(boolean):void");
    }

    public String c(Object obj) {
        return ((f8) obj).f15821a.toString();
    }

    public long d() {
        return 60000;
    }

    public boolean f() {
        TelephonyMetadata a10;
        if (!this.f15900j.c() || (a10 = this.f15901k.a()) == null || !a10.c()) {
            return false;
        }
        return true;
    }

    public void g() {
        b(true);
    }

    public Object c() {
        return f8.f15820b;
    }

    public final void a(f8 f8Var, CellLocation cellLocation) {
        if (cellLocation instanceof GsmCellLocation) {
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            f8Var.a(4, a.b(String.valueOf(gsmCellLocation.getCid())));
            f8Var.a(3, a.b(String.valueOf(gsmCellLocation.getLac())));
        } else if (cellLocation instanceof CdmaCellLocation) {
            CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
            f8Var.a(1, a.b(String.valueOf(cdmaCellLocation.getBaseStationLatitude())));
            f8Var.a(2, a.b(String.valueOf(cdmaCellLocation.getBaseStationLongitude())));
        }
    }

    public Object a(String str) {
        if (str != null) {
            f8 f8Var = f8.f15820b;
            try {
                return new f8(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static int a(CellInfo cellInfo) {
        CellSignalStrength cellSignalStrength;
        if (cellInfo instanceof CellInfoCdma) {
            cellSignalStrength = ((CellInfoCdma) cellInfo).getCellSignalStrength();
        } else if (cellInfo instanceof CellInfoGsm) {
            cellSignalStrength = ((CellInfoGsm) cellInfo).getCellSignalStrength();
        } else if (cellInfo instanceof CellInfoLte) {
            cellSignalStrength = ((CellInfoLte) cellInfo).getCellSignalStrength();
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29 && (cellInfo instanceof CellInfoNr)) {
                cellSignalStrength = ((CellInfoNr) cellInfo).getCellSignalStrength();
            } else if (i10 < 29 || !(cellInfo instanceof CellInfoTdscdma)) {
                cellSignalStrength = (i10 < 18 || !(cellInfo instanceof CellInfoWcdma)) ? null : ((CellInfoWcdma) cellInfo).getCellSignalStrength();
            } else {
                cellSignalStrength = ((CellInfoTdscdma) cellInfo).getCellSignalStrength();
            }
        }
        if (cellSignalStrength != null) {
            return cellSignalStrength.getLevel();
        }
        return 0;
    }

    public void a(f8 f8Var, List<CellInfo> list) {
        CellIdentityWcdma cellIdentity;
        int tac;
        int timingAdvance;
        int tac2;
        CellSignalStrengthGsm cellSignalStrength;
        int timingAdvance2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new a(this));
        f8Var.a(6, a.b(arrayList.toString()));
        Iterator it = arrayList.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            CellInfo cellInfo = (CellInfo) it.next();
            if (z10) {
                z10 = false;
                if (cellInfo instanceof CellInfoCdma) {
                    CellIdentityCdma cellIdentity2 = ((CellInfoCdma) cellInfo).getCellIdentity();
                    if (cellIdentity2 != null) {
                        int latitude = cellIdentity2.getLatitude();
                        int longitude = cellIdentity2.getLongitude();
                        if (!(latitude == Integer.MAX_VALUE || longitude == Integer.MAX_VALUE)) {
                            f8Var.a(1, a.b(String.valueOf(latitude)));
                            f8Var.a(2, a.b(String.valueOf(longitude)));
                        }
                    }
                } else if (cellInfo instanceof CellInfoGsm) {
                    CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                    CellIdentityGsm cellIdentity3 = cellInfoGsm.getCellIdentity();
                    if (cellIdentity3 != null) {
                        int lac = cellIdentity3.getLac();
                        if (lac != Integer.MAX_VALUE) {
                            f8Var.a(3, a.b(String.valueOf(lac)));
                        }
                        int cid = cellIdentity3.getCid();
                        if (cid != Integer.MAX_VALUE) {
                            f8Var.a(4, a.b(String.valueOf(cid)));
                        }
                    }
                    if (!(Build.VERSION.SDK_INT < 26 || (cellSignalStrength = cellInfoGsm.getCellSignalStrength()) == null || (timingAdvance2 = cellSignalStrength.getTimingAdvance()) == Integer.MAX_VALUE)) {
                        f8Var.a(13, String.valueOf(timingAdvance2));
                    }
                } else if (cellInfo instanceof CellInfoLte) {
                    CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                    CellIdentityLte cellIdentity4 = cellInfoLte.getCellIdentity();
                    if (!(cellIdentity4 == null || (tac2 = cellIdentity4.getTac()) == Integer.MAX_VALUE)) {
                        f8Var.a(5, a.b(String.valueOf(tac2)));
                    }
                    CellSignalStrengthLte cellSignalStrength2 = cellInfoLte.getCellSignalStrength();
                    if (!(cellSignalStrength2 == null || (timingAdvance = cellSignalStrength2.getTimingAdvance()) == Integer.MAX_VALUE)) {
                        f8Var.a(13, String.valueOf(timingAdvance));
                    }
                } else {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 29 && (cellInfo instanceof CellInfoNr)) {
                        CellIdentityNr cellIdentityNr = (CellIdentityNr) ((CellInfoNr) cellInfo).getCellIdentity();
                        if (!(cellIdentityNr == null || (tac = cellIdentityNr.getTac()) == Integer.MAX_VALUE)) {
                            f8Var.a(5, a.b(String.valueOf(tac)));
                        }
                    } else if (i10 >= 29 && (cellInfo instanceof CellInfoTdscdma)) {
                        CellIdentityTdscdma cellIdentity5 = ((CellInfoTdscdma) cellInfo).getCellIdentity();
                        if (cellIdentity5 != null) {
                            int lac2 = cellIdentity5.getLac();
                            if (lac2 != Integer.MAX_VALUE) {
                                f8Var.a(3, a.b(String.valueOf(lac2)));
                            }
                            int cid2 = cellIdentity5.getCid();
                            if (cid2 != Integer.MAX_VALUE) {
                                f8Var.a(4, a.b(String.valueOf(cid2)));
                            }
                        }
                    } else if (i10 >= 18 && (cellInfo instanceof CellInfoWcdma) && (cellIdentity = ((CellInfoWcdma) cellInfo).getCellIdentity()) != null) {
                        int lac3 = cellIdentity.getLac();
                        if (lac3 != Integer.MAX_VALUE) {
                            f8Var.a(3, a.b(String.valueOf(lac3)));
                        }
                        int cid3 = cellIdentity.getCid();
                        if (cid3 != Integer.MAX_VALUE) {
                            f8Var.a(4, a.b(String.valueOf(cid3)));
                        }
                    }
                }
            }
            if (!cellInfo.isRegistered()) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 29 && (cellInfo instanceof CellInfoNr)) {
                f8Var.a(14, 1);
            }
        }
    }
}
