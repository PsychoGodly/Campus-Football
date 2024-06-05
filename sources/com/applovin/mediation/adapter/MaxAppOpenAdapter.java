package com.applovin.mediation.adapter;

import android.app.Activity;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;

public interface MaxAppOpenAdapter {
    void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener);

    void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener);
}
