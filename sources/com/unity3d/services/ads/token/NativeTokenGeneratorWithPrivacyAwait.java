package com.unity3d.services.ads.token;

import android.os.ConditionVariable;
import com.unity3d.services.core.configuration.PrivacyConfig;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.misc.IObserver;
import java.util.concurrent.ExecutorService;

public class NativeTokenGeneratorWithPrivacyAwait implements INativeTokenGenerator {
    private final ExecutorService _executorService;
    /* access modifiers changed from: private */
    public final INativeTokenGenerator _nativeTokenGenerator;
    /* access modifiers changed from: private */
    public final ConditionVariable _privacyAwait = new ConditionVariable();
    /* access modifiers changed from: private */
    public final int _privacyAwaitTimeout;

    public NativeTokenGeneratorWithPrivacyAwait(ExecutorService executorService, INativeTokenGenerator iNativeTokenGenerator, int i10) {
        this._executorService = executorService;
        this._nativeTokenGenerator = iNativeTokenGenerator;
        this._privacyAwaitTimeout = i10;
    }

    public void generateToken(final INativeTokenGeneratorListener iNativeTokenGeneratorListener) {
        final AnonymousClass1 r02 = new IObserver<PrivacyConfig>() {
            public void updated(PrivacyConfig privacyConfig) {
                NativeTokenGeneratorWithPrivacyAwait.this._privacyAwait.open();
            }
        };
        PrivacyConfigStorage.getInstance().registerObserver(r02);
        this._executorService.execute(new Runnable() {
            public void run() {
                NativeTokenGeneratorWithPrivacyAwait.this._privacyAwait.block((long) NativeTokenGeneratorWithPrivacyAwait.this._privacyAwaitTimeout);
                PrivacyConfigStorage.getInstance().unregisterObserver(r02);
                NativeTokenGeneratorWithPrivacyAwait.this._nativeTokenGenerator.generateToken(iNativeTokenGeneratorListener);
            }
        });
    }
}
