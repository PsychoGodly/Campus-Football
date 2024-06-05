package com.applovin.impl.mediation;

import com.applovin.mediation.MaxReward;

public class MaxRewardImpl implements MaxReward {

    /* renamed from: a  reason: collision with root package name */
    private final String f9395a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9396b;

    private MaxRewardImpl(int i10, String str) {
        if (i10 >= 0) {
            this.f9395a = str;
            this.f9396b = i10;
            return;
        }
        throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
    }

    public static MaxReward create(int i10, String str) {
        return new MaxRewardImpl(i10, str);
    }

    public static MaxReward createDefault() {
        return create(0, MaxReward.DEFAULT_LABEL);
    }

    public final int getAmount() {
        return this.f9396b;
    }

    public final String getLabel() {
        return this.f9395a;
    }

    public String toString() {
        return "MaxReward{amount=" + this.f9396b + ", label=" + this.f9395a + "}";
    }
}
