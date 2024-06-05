package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class MediationAdapterRouter {
    private static final Map<String, MediationAdapterRouter> sharedInstances = new HashMap();
    private static final Object sharedInstancesLock = new Object();
    private final Map<String, List<MediationAdapterRouterListenerWrapper>> listeners = new HashMap();
    private final Object listenersLock = new Object();
    private final Set<MaxAdapter> loadedAdapters = Collections.synchronizedSet(new HashSet());
    protected MaxAdapter.OnCompletionListener mOnCompletionListener;
    private k mSdk;
    private final String mTag;
    private final Set<MaxAdapter> showingAdapters = Collections.synchronizedSet(new HashSet());

    private final class MediationAdapterRouterListenerWrapper {
        private View mAdView;
        private final MaxAdapter mAdapter;
        private final MaxAdapterListener mListener;
        private final RouterAdLoadType mLoadType;

        MediationAdapterRouterListenerWrapper(MaxAdapter maxAdapter, MaxAdapterListener maxAdapterListener, RouterAdLoadType routerAdLoadType, View view) {
            this.mAdapter = maxAdapter;
            this.mListener = maxAdapterListener;
            this.mLoadType = routerAdLoadType;
            this.mAdView = view;
        }

        /* access modifiers changed from: package-private */
        public View getAdView() {
            return this.mAdView;
        }

        /* access modifiers changed from: package-private */
        public MaxAdapter getAdapter() {
            return this.mAdapter;
        }

        /* access modifiers changed from: package-private */
        public MaxAdapterListener getListener() {
            return this.mListener;
        }

        /* access modifiers changed from: package-private */
        public RouterAdLoadType getLoadType() {
            return this.mLoadType;
        }

        /* access modifiers changed from: package-private */
        public void setAdView(View view) {
            this.mAdView = view;
        }
    }

    private enum RouterAdLoadType {
        INTERSTITIAL,
        APPOPEN,
        REWARDED,
        ADVIEW
    }

    protected MediationAdapterRouter() {
        String simpleName = getClass().getSimpleName();
        this.mTag = simpleName;
        if (AppLovinMediationProvider.MAX.equalsIgnoreCase(k.A0.Q())) {
            this.mSdk = k.A0;
        } else {
            t.h(simpleName, "Invalid mediation provider detected. Please set AppLovin SDK mediation provider to MAX via AppLovinSdk.getInstance(context).setMediationProvider( AppLovinMediationProvider.MAX )");
        }
    }

    private void addAdapter(MaxAdapter maxAdapter, MaxAdapterListener maxAdapterListener, String str, RouterAdLoadType routerAdLoadType, View view) {
        List list;
        synchronized (this.listenersLock) {
            MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper = new MediationAdapterRouterListenerWrapper(maxAdapter, maxAdapterListener, routerAdLoadType, view);
            if (this.listeners.get(str) != null) {
                list = this.listeners.get(str);
            } else {
                list = new ArrayList(1);
            }
            list.add(mediationAdapterRouterListenerWrapper);
            this.listeners.put(str, list);
        }
    }

    private List<MediationAdapterRouterListenerWrapper> getListenerWrappers(String str) {
        if (this.listeners.containsKey(str)) {
            return new ArrayList(this.listeners.get(str));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> getLoadingListenerWrappers(java.lang.String r5) {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r4.listenersLock
            monitor-enter(r1)
            java.util.List r5 = r4.getListenerWrappers(r5)     // Catch:{ all -> 0x0037 }
            if (r5 == 0) goto L_0x0034
            int r2 = r5.size()     // Catch:{ all -> 0x0037 }
            if (r2 <= 0) goto L_0x0034
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0037 }
        L_0x0018:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x0037 }
            com.applovin.mediation.adapters.MediationAdapterRouter$MediationAdapterRouterListenerWrapper r2 = (com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper) r2     // Catch:{ all -> 0x0037 }
            com.applovin.mediation.adapter.MaxAdapter r3 = r2.getAdapter()     // Catch:{ all -> 0x0037 }
            boolean r3 = r4.isAdLoaded(r3)     // Catch:{ all -> 0x0037 }
            if (r3 != 0) goto L_0x0018
            r0.add(r2)     // Catch:{ all -> 0x0037 }
            goto L_0x0018
        L_0x0032:
            monitor-exit(r1)     // Catch:{ all -> 0x0037 }
            return r0
        L_0x0034:
            monitor-exit(r1)     // Catch:{ all -> 0x0037 }
            r5 = 0
            return r5
        L_0x0037:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0037 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.MediationAdapterRouter.getLoadingListenerWrappers(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.applovin.mediation.adapters.MediationAdapterRouter getSharedInstance(java.lang.Class r5) {
        /*
            java.lang.Object r0 = sharedInstancesLock
            monitor-enter(r0)
            java.lang.String r1 = r5.getName()     // Catch:{ all -> 0x002c }
            java.util.Map<java.lang.String, com.applovin.mediation.adapters.MediationAdapterRouter> r2 = sharedInstances     // Catch:{ all -> 0x002c }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x002c }
            com.applovin.mediation.adapters.MediationAdapterRouter r2 = (com.applovin.mediation.adapters.MediationAdapterRouter) r2     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0025 }
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r4)     // Catch:{ all -> 0x0025 }
            r4 = 1
            r5.setAccessible(r4)     // Catch:{ all -> 0x0025 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0025 }
            java.lang.Object r5 = r5.newInstance(r3)     // Catch:{ all -> 0x0025 }
            com.applovin.mediation.adapters.MediationAdapterRouter r5 = (com.applovin.mediation.adapters.MediationAdapterRouter) r5     // Catch:{ all -> 0x0025 }
            r2 = r5
        L_0x0025:
            java.util.Map<java.lang.String, com.applovin.mediation.adapters.MediationAdapterRouter> r5 = sharedInstances     // Catch:{ all -> 0x002c }
            r5.put(r1, r2)     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r2
        L_0x002c:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.MediationAdapterRouter.getSharedInstance(java.lang.Class):com.applovin.mediation.adapters.MediationAdapterRouter");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> getShowingListenerWrappers(java.lang.String r5) {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r4.listenersLock
            monitor-enter(r1)
            java.util.List r5 = r4.getListenerWrappers(r5)     // Catch:{ all -> 0x0037 }
            if (r5 == 0) goto L_0x0034
            int r2 = r5.size()     // Catch:{ all -> 0x0037 }
            if (r2 <= 0) goto L_0x0034
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0037 }
        L_0x0018:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x0037 }
            com.applovin.mediation.adapters.MediationAdapterRouter$MediationAdapterRouterListenerWrapper r2 = (com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper) r2     // Catch:{ all -> 0x0037 }
            com.applovin.mediation.adapter.MaxAdapter r3 = r2.getAdapter()     // Catch:{ all -> 0x0037 }
            boolean r3 = r4.isAdShowing(r3)     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x0018
            r0.add(r2)     // Catch:{ all -> 0x0037 }
            goto L_0x0018
        L_0x0032:
            monitor-exit(r1)     // Catch:{ all -> 0x0037 }
            return r0
        L_0x0034:
            monitor-exit(r1)     // Catch:{ all -> 0x0037 }
            r5 = 0
            return r5
        L_0x0037:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0037 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.MediationAdapterRouter.getShowingListenerWrappers(java.lang.String):java.util.List");
    }

    private boolean isAdLoaded(MaxAdapter maxAdapter) {
        return this.loadedAdapters.contains(maxAdapter);
    }

    private boolean isAdShowing(MaxAdapter maxAdapter) {
        return this.showingAdapters.contains(maxAdapter);
    }

    public void addAdViewAdapter(MaxAdapter maxAdapter, MaxAdViewAdapterListener maxAdViewAdapterListener, String str, View view) {
        addAdapter(maxAdapter, maxAdViewAdapterListener, str, RouterAdLoadType.ADVIEW, view);
    }

    public void addAppOpenAdapter(MaxAdapter maxAdapter, MaxAppOpenAdapterListener maxAppOpenAdapterListener, String str) {
        addAdapter(maxAdapter, maxAppOpenAdapterListener, str, RouterAdLoadType.APPOPEN, (View) null);
    }

    public void addInterstitialAdapter(MaxAdapter maxAdapter, MaxInterstitialAdapterListener maxInterstitialAdapterListener, String str) {
        addAdapter(maxAdapter, maxInterstitialAdapterListener, str, RouterAdLoadType.INTERSTITIAL, (View) null);
    }

    public void addRewardedAdapter(MaxAdapter maxAdapter, MaxRewardedAdapterListener maxRewardedAdapterListener, String str) {
        addAdapter(maxAdapter, maxRewardedAdapterListener, str, RouterAdLoadType.REWARDED, (View) null);
    }

    public void addShowingAdapter(MaxAdapter maxAdapter) {
        this.showingAdapters.add(maxAdapter);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        return com.applovin.impl.mediation.MaxRewardImpl.createDefault();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.mediation.MaxReward getReward(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.listenersLock
            monitor-enter(r0)
            java.util.List r3 = r2.getListenerWrappers(r3)     // Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x0026
            int r1 = r3.size()     // Catch:{ all -> 0x002c }
            if (r1 <= 0) goto L_0x0026
            r1 = 0
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x002c }
            com.applovin.mediation.adapters.MediationAdapterRouter$MediationAdapterRouterListenerWrapper r3 = (com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper) r3     // Catch:{ all -> 0x002c }
            com.applovin.mediation.adapter.MaxAdapter r3 = r3.getAdapter()     // Catch:{ all -> 0x002c }
            boolean r1 = r3 instanceof com.applovin.mediation.adapters.MediationAdapterBase     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0026
            com.applovin.mediation.adapters.MediationAdapterBase r3 = (com.applovin.mediation.adapters.MediationAdapterBase) r3     // Catch:{ all -> 0x002c }
            com.applovin.mediation.MaxReward r3 = r3.getReward()     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r3
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            com.applovin.mediation.MaxReward r3 = com.applovin.impl.mediation.MaxRewardImpl.createDefault()
            return r3
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.MediationAdapterRouter.getReward(java.lang.String):com.applovin.mediation.MaxReward");
    }

    /* access modifiers changed from: package-private */
    public abstract void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener);

    /* access modifiers changed from: protected */
    public void log(String str) {
        k kVar = this.mSdk;
        if (kVar != null) {
            kVar.L();
            if (t.a()) {
                this.mSdk.L().d(this.mTag, str);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAdClicked(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers != null && showingListenerWrappers.size() > 0) {
            for (MediationAdapterRouterListenerWrapper next : showingListenerWrappers) {
                RouterAdLoadType loadType = next.getLoadType();
                MaxAdapterListener listener = next.getListener();
                if (loadType == RouterAdLoadType.INTERSTITIAL) {
                    log("Interstitial clicked");
                    ((MaxInterstitialAdapterListener) listener).onInterstitialAdClicked();
                } else if (loadType == RouterAdLoadType.APPOPEN) {
                    log("App open clicked");
                    ((MaxAppOpenAdapterListener) listener).onAppOpenAdClicked();
                } else if (loadType == RouterAdLoadType.REWARDED) {
                    log("Rewarded clicked");
                    ((MaxRewardedAdapterListener) listener).onRewardedAdClicked();
                } else if (loadType == RouterAdLoadType.ADVIEW) {
                    log("AdView clicked");
                    ((MaxAdViewAdapterListener) listener).onAdViewAdClicked();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAdDisplayFailed(String str, MaxAdapterError maxAdapterError) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers != null && showingListenerWrappers.size() > 0) {
            for (MediationAdapterRouterListenerWrapper next : showingListenerWrappers) {
                RouterAdLoadType loadType = next.getLoadType();
                MaxAdapterListener listener = next.getListener();
                if (loadType == RouterAdLoadType.INTERSTITIAL) {
                    log("Interstitial failed to display with error: " + maxAdapterError.toString());
                    ((MaxInterstitialAdapterListener) listener).onInterstitialAdDisplayFailed(maxAdapterError);
                } else if (loadType == RouterAdLoadType.APPOPEN) {
                    log("App open failed to display with error: " + maxAdapterError.toString());
                    ((MaxAppOpenAdapterListener) listener).onAppOpenAdDisplayFailed(maxAdapterError);
                } else if (loadType == RouterAdLoadType.REWARDED) {
                    log("Rewarded failed to display with error: " + maxAdapterError.toString());
                    ((MaxRewardedAdapterListener) listener).onRewardedAdDisplayFailed(maxAdapterError);
                } else if (loadType == RouterAdLoadType.ADVIEW) {
                    log("AdView failed to display with error: " + maxAdapterError.toString());
                    ((MaxAdViewAdapterListener) listener).onAdViewAdDisplayFailed(maxAdapterError);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAdDisplayed(String str) {
        onAdDisplayed(str, (Bundle) null);
    }

    /* access modifiers changed from: protected */
    public void onAdHidden(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers != null && showingListenerWrappers.size() > 0) {
            for (MediationAdapterRouterListenerWrapper next : showingListenerWrappers) {
                RouterAdLoadType loadType = next.getLoadType();
                MaxAdapterListener listener = next.getListener();
                if (loadType == RouterAdLoadType.INTERSTITIAL) {
                    log("Interstitial hidden");
                    ((MaxInterstitialAdapterListener) listener).onInterstitialAdHidden();
                } else if (loadType == RouterAdLoadType.APPOPEN) {
                    log("App open hidden");
                    ((MaxAppOpenAdapterListener) listener).onAppOpenAdHidden();
                } else if (loadType == RouterAdLoadType.REWARDED) {
                    log("Rewarded hidden");
                    ((MaxRewardedAdapterListener) listener).onRewardedAdHidden();
                } else if (loadType == RouterAdLoadType.ADVIEW) {
                    log("AdView hidden");
                    ((MaxAdViewAdapterListener) listener).onAdViewAdHidden();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAdLoadFailed(String str, MaxAdapterError maxAdapterError) {
        List<MediationAdapterRouterListenerWrapper> loadingListenerWrappers = getLoadingListenerWrappers(str);
        if (loadingListenerWrappers != null && loadingListenerWrappers.size() > 0) {
            for (MediationAdapterRouterListenerWrapper next : loadingListenerWrappers) {
                RouterAdLoadType loadType = next.getLoadType();
                MaxAdapterListener listener = next.getListener();
                if (loadType == RouterAdLoadType.INTERSTITIAL) {
                    log("Interstitial failed to load with error: " + maxAdapterError.toString());
                    ((MaxInterstitialAdapterListener) listener).onInterstitialAdLoadFailed(maxAdapterError);
                } else if (loadType == RouterAdLoadType.APPOPEN) {
                    log("App open failed to load with error: " + maxAdapterError.toString());
                    ((MaxAppOpenAdapterListener) listener).onAppOpenAdLoadFailed(maxAdapterError);
                } else if (loadType == RouterAdLoadType.REWARDED) {
                    log("Rewarded failed to load with error: " + maxAdapterError.toString());
                    ((MaxRewardedAdapterListener) listener).onRewardedAdLoadFailed(maxAdapterError);
                } else if (loadType == RouterAdLoadType.ADVIEW) {
                    log("AdView failed to load with error: " + maxAdapterError.toString());
                    ((MaxAdViewAdapterListener) listener).onAdViewAdLoadFailed(maxAdapterError);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAdLoaded(String str) {
        onAdLoaded(str, (Bundle) null);
    }

    /* access modifiers changed from: protected */
    public void onAdViewAdCollapsed(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers != null && showingListenerWrappers.size() > 0) {
            for (MediationAdapterRouterListenerWrapper next : showingListenerWrappers) {
                RouterAdLoadType loadType = next.getLoadType();
                MaxAdapterListener listener = next.getListener();
                if (loadType == RouterAdLoadType.ADVIEW) {
                    log("AdView collapsed");
                    ((MaxAdViewAdapterListener) listener).onAdViewAdCollapsed();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAdViewAdExpanded(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers != null && showingListenerWrappers.size() > 0) {
            for (MediationAdapterRouterListenerWrapper next : showingListenerWrappers) {
                RouterAdLoadType loadType = next.getLoadType();
                MaxAdapterListener listener = next.getListener();
                if (loadType == RouterAdLoadType.ADVIEW) {
                    log("AdView expanded");
                    ((MaxAdViewAdapterListener) listener).onAdViewAdExpanded();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onRewardedAdVideoCompleted(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers != null && showingListenerWrappers.size() > 0) {
            for (MediationAdapterRouterListenerWrapper next : showingListenerWrappers) {
                RouterAdLoadType loadType = next.getLoadType();
                MaxAdapterListener listener = next.getListener();
                if (loadType == RouterAdLoadType.REWARDED) {
                    log("Rewarded video completed");
                    ((MaxRewardedAdapterListener) listener).onRewardedAdVideoCompleted();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onRewardedAdVideoStarted(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers != null && showingListenerWrappers.size() > 0) {
            for (MediationAdapterRouterListenerWrapper next : showingListenerWrappers) {
                RouterAdLoadType loadType = next.getLoadType();
                MaxAdapterListener listener = next.getListener();
                if (loadType == RouterAdLoadType.REWARDED) {
                    log("Rewarded video started");
                    ((MaxRewardedAdapterListener) listener).onRewardedAdVideoStarted();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onUserRewarded(String str, MaxReward maxReward) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers != null && showingListenerWrappers.size() > 0) {
            for (MediationAdapterRouterListenerWrapper next : showingListenerWrappers) {
                RouterAdLoadType loadType = next.getLoadType();
                MaxAdapterListener listener = next.getListener();
                if (loadType == RouterAdLoadType.REWARDED) {
                    log("Rewarded user with reward: " + maxReward);
                    ((MaxRewardedAdapterListener) listener).onUserRewarded(maxReward);
                }
            }
        }
    }

    public void removeAdapter(MaxAdapter maxAdapter, String str) {
        this.loadedAdapters.remove(maxAdapter);
        this.showingAdapters.remove(maxAdapter);
        synchronized (this.listenersLock) {
            List list = this.listeners.get(str);
            if (list != null && list.size() > 0) {
                MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper = null;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper2 = (MediationAdapterRouterListenerWrapper) it.next();
                    if (mediationAdapterRouterListenerWrapper2.getAdapter() == maxAdapter) {
                        mediationAdapterRouterListenerWrapper = mediationAdapterRouterListenerWrapper2;
                        break;
                    }
                }
                if (mediationAdapterRouterListenerWrapper != null) {
                    list.remove(mediationAdapterRouterListenerWrapper);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean shouldAlwaysRewardUser(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.listenersLock
            monitor-enter(r0)
            java.util.List r4 = r3.getListenerWrappers(r4)     // Catch:{ all -> 0x0028 }
            r1 = 0
            if (r4 == 0) goto L_0x0026
            int r2 = r4.size()     // Catch:{ all -> 0x0028 }
            if (r2 <= 0) goto L_0x0026
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0028 }
            com.applovin.mediation.adapters.MediationAdapterRouter$MediationAdapterRouterListenerWrapper r4 = (com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper) r4     // Catch:{ all -> 0x0028 }
            com.applovin.mediation.adapter.MaxAdapter r4 = r4.getAdapter()     // Catch:{ all -> 0x0028 }
            boolean r2 = r4 instanceof com.applovin.mediation.adapters.MediationAdapterBase     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0026
            com.applovin.mediation.adapters.MediationAdapterBase r4 = (com.applovin.mediation.adapters.MediationAdapterBase) r4     // Catch:{ all -> 0x0028 }
            boolean r4 = r4.shouldAlwaysRewardUser()     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return r4
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return r1
        L_0x0028:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.MediationAdapterRouter.shouldAlwaysRewardUser(java.lang.String):boolean");
    }

    public void updateAdView(View view, String str) {
        synchronized (this.listenersLock) {
            List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
            if (listenerWrappers != null && listenerWrappers.size() > 0) {
                Iterator<MediationAdapterRouterListenerWrapper> it = listenerWrappers.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MediationAdapterRouterListenerWrapper next = it.next();
                    if (next.getAdView() == null) {
                        next.setAdView(view);
                        break;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAdDisplayed(String str, Bundle bundle) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers != null && showingListenerWrappers.size() > 0) {
            for (MediationAdapterRouterListenerWrapper next : showingListenerWrappers) {
                RouterAdLoadType loadType = next.getLoadType();
                MaxAdapterListener listener = next.getListener();
                if (loadType == RouterAdLoadType.INTERSTITIAL) {
                    log("Interstitial shown");
                    ((MaxInterstitialAdapterListener) listener).onInterstitialAdDisplayed(bundle);
                } else if (loadType == RouterAdLoadType.APPOPEN) {
                    log("App open shown");
                    ((MaxAppOpenAdapterListener) listener).onAppOpenAdDisplayed(bundle);
                } else if (loadType == RouterAdLoadType.REWARDED) {
                    log("Rewarded shown");
                    ((MaxRewardedAdapterListener) listener).onRewardedAdDisplayed(bundle);
                } else if (loadType == RouterAdLoadType.ADVIEW) {
                    log("AdView shown");
                    ((MaxAdViewAdapterListener) listener).onAdViewAdDisplayed(bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAdLoaded(String str, Bundle bundle) {
        List<MediationAdapterRouterListenerWrapper> loadingListenerWrappers = getLoadingListenerWrappers(str);
        if (loadingListenerWrappers != null && loadingListenerWrappers.size() > 0) {
            for (MediationAdapterRouterListenerWrapper next : loadingListenerWrappers) {
                this.loadedAdapters.add(next.getAdapter());
                RouterAdLoadType loadType = next.getLoadType();
                MaxAdapterListener listener = next.getListener();
                if (loadType == RouterAdLoadType.INTERSTITIAL) {
                    log("Interstitial loaded");
                    ((MaxInterstitialAdapterListener) listener).onInterstitialAdLoaded(bundle);
                } else if (loadType == RouterAdLoadType.APPOPEN) {
                    log("App open loaded");
                    ((MaxAppOpenAdapterListener) listener).onAppOpenAdLoaded(bundle);
                } else if (loadType == RouterAdLoadType.REWARDED) {
                    log("Rewarded loaded");
                    ((MaxRewardedAdapterListener) listener).onRewardedAdLoaded(bundle);
                } else if (loadType == RouterAdLoadType.ADVIEW) {
                    log("AdView loaded");
                    ((MaxAdViewAdapterListener) listener).onAdViewAdLoaded(next.getAdView(), bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void log(String str, Throwable th) {
        k kVar = this.mSdk;
        if (kVar != null) {
            kVar.L();
            if (t.a()) {
                this.mSdk.L().a(this.mTag, str, th);
            }
        }
    }
}
