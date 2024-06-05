package com.startapp;

import android.content.pm.PackageInfo;
import java.util.Comparator;

/* compiled from: Sta */
public class x7 implements Comparator<PackageInfo> {
    public int compare(Object obj, Object obj2) {
        int i10 = (((PackageInfo) obj).firstInstallTime > ((PackageInfo) obj2).firstInstallTime ? 1 : (((PackageInfo) obj).firstInstallTime == ((PackageInfo) obj2).firstInstallTime ? 0 : -1));
        if (i10 > 0) {
            return -1;
        }
        return i10 == 0 ? 0 : 1;
    }
}
