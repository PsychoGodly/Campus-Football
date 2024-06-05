package com.applovin.mediation.adapter;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;

public interface MaxRewardedAdViewAdapter {
    void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, i iVar, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener);
}
