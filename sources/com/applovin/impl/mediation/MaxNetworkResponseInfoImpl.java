package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;

public class MaxNetworkResponseInfoImpl implements MaxNetworkResponseInfo {

    /* renamed from: a  reason: collision with root package name */
    private final MaxNetworkResponseInfo.AdLoadState f9387a;

    /* renamed from: b  reason: collision with root package name */
    private final MaxMediatedNetworkInfo f9388b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f9389c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9390d;

    /* renamed from: e  reason: collision with root package name */
    private final long f9391e;

    /* renamed from: f  reason: collision with root package name */
    private final String f9392f;

    /* renamed from: g  reason: collision with root package name */
    private final MaxError f9393g;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9394a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState[] r0 = com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9394a = r0
                com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r1 = com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9394a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r1 = com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState.AD_LOADED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.a.<clinit>():void");
        }
    }

    public MaxNetworkResponseInfoImpl(MaxNetworkResponseInfo.AdLoadState adLoadState, MaxMediatedNetworkInfo maxMediatedNetworkInfo, Bundle bundle, boolean z10, long j10, String str, MaxError maxError) {
        this.f9387a = adLoadState;
        this.f9388b = maxMediatedNetworkInfo;
        this.f9389c = bundle;
        this.f9390d = z10;
        this.f9391e = j10;
        this.f9392f = str;
        this.f9393g = maxError;
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof MaxNetworkResponseInfoImpl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MaxNetworkResponseInfoImpl)) {
            return false;
        }
        MaxNetworkResponseInfoImpl maxNetworkResponseInfoImpl = (MaxNetworkResponseInfoImpl) obj;
        if (!maxNetworkResponseInfoImpl.canEqual(this) || isBidding() != maxNetworkResponseInfoImpl.isBidding() || getLatencyMillis() != maxNetworkResponseInfoImpl.getLatencyMillis()) {
            return false;
        }
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        MaxNetworkResponseInfo.AdLoadState adLoadState2 = maxNetworkResponseInfoImpl.getAdLoadState();
        if (adLoadState != null ? !adLoadState.equals(adLoadState2) : adLoadState2 != null) {
            return false;
        }
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        MaxMediatedNetworkInfo mediatedNetwork2 = maxNetworkResponseInfoImpl.getMediatedNetwork();
        if (mediatedNetwork != null ? !mediatedNetwork.equals(mediatedNetwork2) : mediatedNetwork2 != null) {
            return false;
        }
        Bundle credentials = getCredentials();
        Bundle credentials2 = maxNetworkResponseInfoImpl.getCredentials();
        if (credentials != null ? !credentials.equals(credentials2) : credentials2 != null) {
            return false;
        }
        String bCode = getBCode();
        String bCode2 = maxNetworkResponseInfoImpl.getBCode();
        if (bCode != null ? !bCode.equals(bCode2) : bCode2 != null) {
            return false;
        }
        MaxError error = getError();
        MaxError error2 = maxNetworkResponseInfoImpl.getError();
        return error != null ? error.equals(error2) : error2 == null;
    }

    public MaxNetworkResponseInfo.AdLoadState getAdLoadState() {
        return this.f9387a;
    }

    public String getBCode() {
        return this.f9392f;
    }

    public Bundle getCredentials() {
        return this.f9389c;
    }

    public MaxError getError() {
        return this.f9393g;
    }

    public long getLatencyMillis() {
        return this.f9391e;
    }

    public MaxMediatedNetworkInfo getMediatedNetwork() {
        return this.f9388b;
    }

    public int hashCode() {
        int i10 = isBidding() ? 79 : 97;
        long latencyMillis = getLatencyMillis();
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        int i11 = 43;
        int hashCode = ((((i10 + 59) * 59) + ((int) (latencyMillis ^ (latencyMillis >>> 32)))) * 59) + (adLoadState == null ? 43 : adLoadState.hashCode());
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        int hashCode2 = (hashCode * 59) + (mediatedNetwork == null ? 43 : mediatedNetwork.hashCode());
        Bundle credentials = getCredentials();
        int hashCode3 = (hashCode2 * 59) + (credentials == null ? 43 : credentials.hashCode());
        String bCode = getBCode();
        int hashCode4 = (hashCode3 * 59) + (bCode == null ? 43 : bCode.hashCode());
        MaxError error = getError();
        int i12 = hashCode4 * 59;
        if (error != null) {
            i11 = error.hashCode();
        }
        return i12 + i11;
    }

    public boolean isBidding() {
        return this.f9390d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0044, code lost:
        if (r1 != 2) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "MaxResponseInfo{adLoadState="
            r1.append(r2)
            com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r2 = r3.f9387a
            r1.append(r2)
            java.lang.String r2 = ", mediatedNetwork="
            r1.append(r2)
            com.applovin.mediation.MaxMediatedNetworkInfo r2 = r3.f9388b
            r1.append(r2)
            java.lang.String r2 = ", credentials="
            r1.append(r2)
            android.os.Bundle r2 = r3.f9389c
            r1.append(r2)
            java.lang.String r2 = ", isBidding="
            r1.append(r2)
            boolean r2 = r3.f9390d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            int[] r1 = com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.a.f9394a
            com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r2 = r3.f9387a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x0047
            r2 = 2
            if (r1 == r2) goto L_0x0051
            goto L_0x005b
        L_0x0047:
            java.lang.String r1 = ", error="
            r0.append(r1)
            com.applovin.mediation.MaxError r1 = r3.f9393g
            r0.append(r1)
        L_0x0051:
            java.lang.String r1 = ", latencyMillis="
            r0.append(r1)
            long r1 = r3.f9391e
            r0.append(r1)
        L_0x005b:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.toString():java.lang.String");
    }
}
