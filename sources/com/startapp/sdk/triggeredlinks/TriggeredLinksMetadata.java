package com.startapp.sdk.triggeredlinks;

import android.app.Activity;
import com.startapp.d9;
import com.startapp.j9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class TriggeredLinksMetadata implements Serializable {
    private static final long serialVersionUID = 1082253451843108611L;
    @d9(complex = true, name = "AppEvents")
    private AppEventsMetadata appEvents;
    private boolean enabled = true;
    private int ief;
    private int smartRedirectTimeoutInSec = 10;
    @d9(name = "ThrottlingPublisherIDs", type = ArrayList.class, value = Integer.class)
    private List<Integer> throttlingPublisherIDs;
    private boolean triggeredLinkInfoEvent = true;

    public AppEventsMetadata a() {
        return this.appEvents;
    }

    public int b() {
        return this.ief;
    }

    public int c() {
        return this.smartRedirectTimeoutInSec;
    }

    public List<Integer> d() {
        return this.throttlingPublisherIDs;
    }

    public boolean e() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TriggeredLinksMetadata triggeredLinksMetadata = (TriggeredLinksMetadata) obj;
        if (this.enabled == triggeredLinksMetadata.enabled && this.smartRedirectTimeoutInSec == triggeredLinksMetadata.smartRedirectTimeoutInSec && this.triggeredLinkInfoEvent == triggeredLinksMetadata.triggeredLinkInfoEvent && this.ief == triggeredLinksMetadata.ief && j9.a(this.appEvents, triggeredLinksMetadata.appEvents) && j9.a(this.throttlingPublisherIDs, triggeredLinksMetadata.throttlingPublisherIDs)) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.triggeredLinkInfoEvent;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Integer.valueOf(this.smartRedirectTimeoutInSec), Boolean.valueOf(this.triggeredLinkInfoEvent), this.appEvents, this.throttlingPublisherIDs, Integer.valueOf(this.ief)};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }
}
