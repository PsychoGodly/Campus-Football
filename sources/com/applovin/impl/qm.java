package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapterError;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class qm extends xl {

    /* renamed from: h  reason: collision with root package name */
    private final String f11030h;

    /* renamed from: i  reason: collision with root package name */
    private final List f11031i;

    /* renamed from: j  reason: collision with root package name */
    private final ke f11032j;

    /* renamed from: k  reason: collision with root package name */
    private final Map f11033k;

    /* renamed from: l  reason: collision with root package name */
    private final Map f11034l;

    /* renamed from: m  reason: collision with root package name */
    private final Map f11035m;

    /* renamed from: n  reason: collision with root package name */
    private final MaxError f11036n;

    public qm(String str, List list, Map map, Map map2, MaxError maxError, ke keVar, k kVar, boolean z10) {
        super("TaskFireMediationPostbacks", kVar);
        MaxError maxError2;
        this.f11030h = str + "_urls";
        this.f11031i = list;
        this.f11033k = zp.a(map, kVar);
        this.f11034l = map2 == null ? new HashMap() : map2;
        if (maxError != null) {
            maxError2 = maxError;
        } else {
            maxError2 = new MaxErrorImpl(-1);
        }
        this.f11036n = maxError2;
        this.f11032j = keVar;
        HashMap hashMap = new HashMap(7);
        hashMap.put("AppLovin-Event-Type", str);
        if (z10 && keVar != null) {
            hashMap.put("AppLovin-Ad-Network-Name", keVar.c());
        }
        if (keVar instanceof be) {
            be beVar = (be) keVar;
            hashMap.put("AppLovin-Ad-Unit-Id", beVar.getAdUnitId());
            hashMap.put("AppLovin-Ad-Format", beVar.getFormat().getLabel());
            if (z10) {
                hashMap.put("AppLovin-Third-Party-Ad-Placement-Id", beVar.S());
            }
        }
        if (maxError != null) {
            hashMap.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            hashMap.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f11035m = hashMap;
    }

    private void a(String str, Map map) {
        b().Z().e(d.b().d(str).c("POST").a(this.f11035m).a(false).c(map).c(((Boolean) this.f13421a.a(qe.O7)).booleanValue()).a());
    }

    private String b(String str, Map map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull((String) map.get(str2)));
        }
        return str;
    }

    private Map e() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f13421a.a(qe.O6)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private List f() {
        List list = this.f11031i;
        if (list != null) {
            return list;
        }
        ke keVar = this.f11032j;
        if (keVar != null) {
            return keVar.b(this.f11030h);
        }
        return null;
    }

    public void run() {
        Map map;
        List<String> f10 = f();
        if (!CollectionUtils.isEmpty(f10)) {
            Map e10 = e();
            for (String b10 : f10) {
                Uri parse = Uri.parse(a(b(b10, this.f11033k), this.f11036n));
                Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                HashMap hashMap = new HashMap(this.f11034l);
                for (String next : parse.getQueryParameterNames()) {
                    String queryParameter = parse.getQueryParameter(next);
                    if (e10.containsKey(queryParameter)) {
                        ke keVar = this.f11032j;
                        if (keVar != null) {
                            hashMap.put(next, keVar.a((String) e10.get(queryParameter)));
                        }
                    } else {
                        clearQuery.appendQueryParameter(next, queryParameter);
                    }
                }
                if (((Boolean) this.f13421a.a(qe.I7)).booleanValue()) {
                    if (this.f13421a.y() != null) {
                        map = this.f13421a.y().a();
                    } else {
                        map = this.f13421a.x().e();
                    }
                    hashMap.putAll(map);
                }
                a(clearQuery.build().toString(), (Map) hashMap);
            }
        }
    }

    private String a(String str, MaxError maxError) {
        int i10;
        String str2;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            i10 = maxAdapterError.getMediatedNetworkErrorCode();
            str2 = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            i10 = 0;
            str2 = MaxReward.DEFAULT_LABEL;
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(i10)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(str2));
    }
}
