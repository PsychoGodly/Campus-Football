package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.BodyType;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import pe.i;
import pe.k0;
import sd.l;
import xd.d;

/* compiled from: AndroidExecuteAdViewerRequest.kt */
public final class AndroidExecuteAdViewerRequest implements ExecuteAdViewerRequest {
    /* access modifiers changed from: private */
    public final HttpClient httpClient;
    private final k0 ioDispatcher;

    /* compiled from: AndroidExecuteAdViewerRequest.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.unity3d.services.core.network.model.RequestType[] r0 = com.unity3d.services.core.network.model.RequestType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.unity3d.services.core.network.model.RequestType r1 = com.unity3d.services.core.network.model.RequestType.GET     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.unity3d.services.core.network.model.RequestType r1 = com.unity3d.services.core.network.model.RequestType.HEAD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.unity3d.services.core.network.model.RequestType r1 = com.unity3d.services.core.network.model.RequestType.POST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest.WhenMappings.<clinit>():void");
        }
    }

    public AndroidExecuteAdViewerRequest(k0 k0Var, HttpClient httpClient2) {
        m.e(k0Var, "ioDispatcher");
        m.e(httpClient2, "httpClient");
        this.ioDispatcher = k0Var;
        this.httpClient = httpClient2;
    }

    /* access modifiers changed from: private */
    public final HttpRequest createRequest(RequestType requestType, Object[] objArr) {
        Map<String, List<String>> map;
        Map<String, List<String>> map2;
        Object[] objArr2 = objArr;
        String str = (String) m.o(objArr2, 1);
        if (!(str == null || str.length() == 0)) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[requestType.ordinal()];
            if (i10 == 1 || i10 == 2) {
                JSONArray jSONArray = (JSONArray) m.o(objArr2, 2);
                Integer num = (Integer) m.o(objArr2, 3);
                Integer num2 = (Integer) m.o(objArr2, 4);
                if (jSONArray == null || (map = JSONArrayExtensionsKt.getHeadersMap(jSONArray)) == null) {
                    map = k0.g();
                }
                return new HttpRequest(str, (String) null, requestType, (Object) null, map, (Map) null, (BodyType) null, (String) null, (Integer) null, num != null ? num.intValue() : 30000, num2 != null ? num2.intValue() : 30000, 0, 0, false, (OperationType) null, (File) null, 0, 129514, (h) null);
            } else if (i10 == 3) {
                String str2 = (String) m.o(objArr2, 2);
                JSONArray jSONArray2 = (JSONArray) m.o(objArr2, 3);
                Integer num3 = (Integer) m.o(objArr2, 4);
                Integer num4 = (Integer) m.o(objArr2, 5);
                if (jSONArray2 == null || (map2 = JSONArrayExtensionsKt.getHeadersMap(jSONArray2)) == null) {
                    map2 = k0.g();
                }
                return new HttpRequest(str, (String) null, requestType, str2, map2, (Map) null, (BodyType) null, (String) null, (Integer) null, num3 != null ? num3.intValue() : 30000, num4 != null ? num4.intValue() : 30000, 0, 0, false, (OperationType) null, (File) null, 0, 129506, (h) null);
            } else {
                throw new l();
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public Object invoke(RequestType requestType, Object[] objArr, d<? super HttpResponse> dVar) {
        return i.g(this.ioDispatcher, new AndroidExecuteAdViewerRequest$invoke$2(this, requestType, objArr, (d<? super AndroidExecuteAdViewerRequest$invoke$2>) null), dVar);
    }
}
