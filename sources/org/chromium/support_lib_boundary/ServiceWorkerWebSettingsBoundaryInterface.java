package org.chromium.support_lib_boundary;

import java.util.Set;

public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z10);

    void setAllowFileAccess(boolean z10);

    void setBlockNetworkLoads(boolean z10);

    void setCacheMode(int i10);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}
