package com.applovin.impl.sdk.array;

import android.os.Bundle;

public interface ArrayDirectDownloadAd {
    Bundle getDirectDownloadParameters();

    String getDirectDownloadToken();

    boolean isDirectDownloadEnabled();
}
