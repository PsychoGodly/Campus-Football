package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Map;

public class CreateWindowAction extends NavigationAction {
    boolean isDialog;
    int windowId;

    public CreateWindowAction(URLRequest uRLRequest, boolean z10, boolean z11, boolean z12, int i10, boolean z13) {
        super(uRLRequest, z10, z11, z12);
        this.windowId = i10;
        this.isDialog = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        CreateWindowAction createWindowAction = (CreateWindowAction) obj;
        if (this.windowId == createWindowAction.windowId && this.isDialog == createWindowAction.isDialog) {
            return true;
        }
        return false;
    }

    public int getWindowId() {
        return this.windowId;
    }

    public int hashCode() {
        return (((super.hashCode() * 31) + this.windowId) * 31) + (this.isDialog ? 1 : 0);
    }

    public boolean isDialog() {
        return this.isDialog;
    }

    public void setDialog(boolean z10) {
        this.isDialog = z10;
    }

    public void setWindowId(int i10) {
        this.windowId = i10;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("windowId", Integer.valueOf(this.windowId));
        map.put("isDialog", Boolean.valueOf(this.isDialog));
        map.put("windowFeatures", (Object) null);
        return map;
    }

    public String toString() {
        return "CreateWindowAction{windowId=" + this.windowId + ", isDialog=" + this.isDialog + ", request=" + this.request + ", isForMainFrame=" + this.isForMainFrame + ", hasGesture=" + this.hasGesture + ", isRedirect=" + this.isRedirect + '}';
    }
}
