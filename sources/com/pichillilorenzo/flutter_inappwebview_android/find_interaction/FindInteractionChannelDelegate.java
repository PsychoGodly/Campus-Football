package com.pichillilorenzo.flutter_inappwebview_android.find_interaction;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.FindSession;
import java.util.HashMap;
import lc.j;
import lc.k;

public class FindInteractionChannelDelegate extends ChannelDelegateImpl {
    private FindInteractionController findInteractionController;

    public FindInteractionChannelDelegate(FindInteractionController findInteractionController2, k kVar) {
        super(kVar);
        this.findInteractionController = findInteractionController2;
    }

    public void dispose() {
        super.dispose();
        this.findInteractionController = null;
    }

    public void onFindResultReceived(int i10, int i11, boolean z10) {
        FindInteractionController findInteractionController2;
        k channel = getChannel();
        if (channel != null) {
            if (!(!z10 || (findInteractionController2 = this.findInteractionController) == null || findInteractionController2.webView == null)) {
                findInteractionController2.activeFindSession = new FindSession(i11, i10);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("activeMatchOrdinal", Integer.valueOf(i10));
            hashMap.put("numberOfMatches", Integer.valueOf(i11));
            hashMap.put("isDoneCounting", Boolean.valueOf(z10));
            channel.c("onFindResultReceived", hashMap);
        }
    }

    public void onMethodCall(j jVar, k.d dVar) {
        FindSession findSession;
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1008221461:
                if (str.equals("getSearchText")) {
                    c10 = 0;
                    break;
                }
                break;
            case -853211864:
                if (str.equals("findAll")) {
                    c10 = 1;
                    break;
                }
                break;
            case -679382964:
                if (str.equals("findNext")) {
                    c10 = 2;
                    break;
                }
                break;
            case -234090249:
                if (str.equals("setSearchText")) {
                    c10 = 3;
                    break;
                }
                break;
            case 817048102:
                if (str.equals("clearMatches")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2137531137:
                if (str.equals("getActiveFindSession")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                FindInteractionController findInteractionController2 = this.findInteractionController;
                if (findInteractionController2 != null) {
                    dVar.success(findInteractionController2.searchText);
                    return;
                } else {
                    dVar.success(Boolean.FALSE);
                    return;
                }
            case 1:
                if (this.findInteractionController != null) {
                    this.findInteractionController.findAll((String) jVar.a("find"));
                }
                dVar.success(Boolean.TRUE);
                return;
            case 2:
                if (this.findInteractionController != null) {
                    this.findInteractionController.findNext(((Boolean) jVar.a("forward")).booleanValue());
                }
                dVar.success(Boolean.TRUE);
                return;
            case 3:
                FindInteractionController findInteractionController3 = this.findInteractionController;
                if (findInteractionController3 != null) {
                    findInteractionController3.searchText = (String) jVar.a("searchText");
                    dVar.success(Boolean.TRUE);
                    return;
                }
                dVar.success(Boolean.FALSE);
                return;
            case 4:
                FindInteractionController findInteractionController4 = this.findInteractionController;
                if (findInteractionController4 != null) {
                    findInteractionController4.clearMatches();
                }
                dVar.success(Boolean.TRUE);
                return;
            case 5:
                FindInteractionController findInteractionController5 = this.findInteractionController;
                if (findInteractionController5 == null || (findSession = findInteractionController5.activeFindSession) == null) {
                    dVar.success((Object) null);
                    return;
                } else {
                    dVar.success(findSession.toMap());
                    return;
                }
            default:
                dVar.notImplemented();
                return;
        }
    }
}
