package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.j9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class MotionMetadata implements Serializable {
    private static final long serialVersionUID = 3936848659568026217L;
    private double apm = 3.0d;
    private double apr = 3600000.0d;
    private double aps = -2.0d;
    private double awh = 100.0d;
    private double awr = 1.0d;
    private boolean enabled = false;
    private double hpfgb = 10.0d;
    private double hpflb = 15.0d;
    private double hpflmb = 25.0d;
    private double hpfv = 1000.0d;
    private int ief = 0;
    private double iep = 0.0d;
    private double ipm = 0.0d;
    private double ipr = 20000.0d;
    private double ips = -4.0d;
    private double iwh = 100.0d;
    private double iwr = 1.0d;
    private int sampleLimit = 200;
    private String samplePeriod;
    private double vdmis = 1.0d;
    private double vma = 0.1d;

    public double a() {
        return this.apm;
    }

    public double b() {
        return this.apr;
    }

    public double c() {
        return this.aps;
    }

    public double d() {
        return this.awh;
    }

    public double e() {
        return this.awr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MotionMetadata motionMetadata = (MotionMetadata) obj;
        if (this.enabled == motionMetadata.enabled && this.ief == motionMetadata.ief && Double.compare(this.iep, motionMetadata.iep) == 0 && this.sampleLimit == motionMetadata.sampleLimit && Double.compare(this.hpfgb, motionMetadata.hpfgb) == 0 && Double.compare(this.hpflb, motionMetadata.hpflb) == 0 && Double.compare(this.hpflmb, motionMetadata.hpflmb) == 0 && Double.compare(this.hpfv, motionMetadata.hpfv) == 0 && Double.compare(this.vdmis, motionMetadata.vdmis) == 0 && Double.compare(this.vma, motionMetadata.vma) == 0 && Double.compare(this.awh, motionMetadata.awh) == 0 && Double.compare(this.awr, motionMetadata.awr) == 0 && Double.compare(this.apr, motionMetadata.apr) == 0 && Double.compare(this.apm, motionMetadata.apm) == 0 && Double.compare(this.aps, motionMetadata.aps) == 0 && Double.compare(this.iwh, motionMetadata.iwh) == 0 && Double.compare(this.iwr, motionMetadata.iwr) == 0 && Double.compare(this.ipr, motionMetadata.ipr) == 0 && Double.compare(this.ipm, motionMetadata.ipm) == 0 && Double.compare(this.ips, motionMetadata.ips) == 0 && j9.a(this.samplePeriod, motionMetadata.samplePeriod)) {
            return true;
        }
        return false;
    }

    public double f() {
        return this.hpfgb;
    }

    public double g() {
        return this.hpflb;
    }

    public double h() {
        return this.hpflmb;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Integer.valueOf(this.ief), Double.valueOf(this.iep), this.samplePeriod, Integer.valueOf(this.sampleLimit), Double.valueOf(this.hpfgb), Double.valueOf(this.hpflb), Double.valueOf(this.hpflmb), Double.valueOf(this.hpfv), Double.valueOf(this.vdmis), Double.valueOf(this.vma), Double.valueOf(this.awh), Double.valueOf(this.awr), Double.valueOf(this.apr), Double.valueOf(this.apm), Double.valueOf(this.aps), Double.valueOf(this.iwh), Double.valueOf(this.iwr), Double.valueOf(this.ipr), Double.valueOf(this.ipm), Double.valueOf(this.ips)};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }

    public double i() {
        return this.hpfv;
    }

    public int j() {
        return this.ief;
    }

    public double k() {
        return this.iep;
    }

    public double l() {
        return this.ipm;
    }

    public double m() {
        return this.ipr;
    }

    public double n() {
        return this.ips;
    }

    public double o() {
        return this.iwh;
    }

    public double p() {
        return this.iwr;
    }

    public int q() {
        return this.sampleLimit;
    }

    public String r() {
        return this.samplePeriod;
    }

    public double s() {
        return this.vdmis;
    }

    public double t() {
        return this.vma;
    }

    public boolean u() {
        return this.enabled;
    }
}
