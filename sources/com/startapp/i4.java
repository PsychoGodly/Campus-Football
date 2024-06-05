package com.startapp;

import com.startapp.sdk.jobs.JobRequest;

/* compiled from: Sta */
public class i4 {

    /* renamed from: a  reason: collision with root package name */
    public final l7 f15922a;

    /* renamed from: b  reason: collision with root package name */
    public final l7 f15923b;

    public i4(l7 l7Var, l7 l7Var2) {
        this.f15922a = l7Var;
        this.f15923b = l7Var2;
    }

    public boolean a(JobRequest... jobRequestArr) {
        boolean z10 = true;
        for (JobRequest jobRequest : jobRequestArr) {
            if (jobRequest.f17237d) {
                if (jobRequest.a(this.f15923b)) {
                }
            } else if (jobRequest.a(this.f15922a)) {
            }
            z10 = false;
        }
        return z10;
    }

    public boolean a(int i10) {
        if (!this.f15923b.a(i10)) {
            return this.f15922a.a(i10);
        }
        return true;
    }
}
