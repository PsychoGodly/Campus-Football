package com.unity3d.services.ads.token;

import com.applovin.mediation.MaxReward;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.GameSessionIdReader;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import sd.g;
import sd.k;
import sd.w;
import se.k0;
import se.v;

/* compiled from: InMemoryTokenStorage.kt */
public final class InMemoryTokenStorage implements TokenStorage, IServiceComponent {
    private final v<Integer> accessCounter = k0.a(-1);
    private final g asyncTokenStorage$delegate = i.b(k.NONE, new InMemoryTokenStorage$special$$inlined$inject$default$1(this, MaxReward.DEFAULT_LABEL));
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    private final v<String> initToken = k0.a(null);
    private final ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

    /* access modifiers changed from: private */
    public static final void _get_nativeGeneratedToken_$lambda$2(String str) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_NATIVE_DATA, str);
    }

    private final AsyncTokenStorage getAsyncTokenStorage() {
        return (AsyncTokenStorage) this.asyncTokenStorage$delegate.getValue();
    }

    private final void triggerTokenAvailable(boolean z10) {
        InitializeEventsMetricSender.getInstance().sdkTokenDidBecomeAvailableWithConfig(z10);
    }

    public void appendTokens(JSONArray jSONArray) throws JSONException {
        m.e(jSONArray, "tokens");
        this.accessCounter.a(-1, 0);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            this.queue.add(jSONArray.getString(i10));
        }
        if (length > 0) {
            triggerTokenAvailable(false);
            getAsyncTokenStorage().onTokenAvailable();
        }
    }

    public void createTokens(JSONArray jSONArray) throws JSONException {
        m.e(jSONArray, "tokens");
        deleteTokens();
        appendTokens(jSONArray);
    }

    public void deleteTokens() {
        Integer value;
        this.queue.clear();
        v<Integer> vVar = this.accessCounter;
        do {
            value = vVar.getValue();
            value.intValue();
        } while (!vVar.a(value, -1));
    }

    public w getNativeGeneratedToken() {
        new NativeTokenGenerator(this.executorService, new DeviceInfoReaderBuilder(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance()), (String) null).generateToken(a.f32072a);
        return w.f38141a;
    }

    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public String getToken() {
        Integer value;
        Number number;
        if (this.accessCounter.getValue().intValue() == -1) {
            return this.initToken.getValue();
        }
        if (this.queue.isEmpty()) {
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.QUEUE_EMPTY, new Object[0]);
            return null;
        }
        v<Integer> vVar = this.accessCounter;
        do {
            value = vVar.getValue();
            number = value;
        } while (!vVar.a(value, Integer.valueOf(number.intValue() + 1)));
        int intValue = number.intValue();
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_ACCESS, Integer.valueOf(intValue));
        return this.queue.poll();
    }

    public void setInitToken(String str) {
        String value;
        if (str != null) {
            v<String> vVar = this.initToken;
            do {
                value = vVar.getValue();
                String str2 = value;
            } while (!vVar.a(value, str));
            triggerTokenAvailable(true);
            getAsyncTokenStorage().onTokenAvailable();
        }
    }
}
