package com.unity3d.services.ads.token;

import android.util.Base64;
import com.unity3d.services.core.device.reader.DeviceInfoReaderCompressor;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.ExecutorService;

public class NativeTokenGenerator implements INativeTokenGenerator {
    private static final String DEFAULT_NATIVE_TOKEN_PREFIX = "1:";
    /* access modifiers changed from: private */
    public DeviceInfoReaderBuilder _deviceInfoReaderBuilder;
    private ExecutorService _executorService;
    /* access modifiers changed from: private */
    public String _prependStr;

    public NativeTokenGenerator(ExecutorService executorService, DeviceInfoReaderBuilder deviceInfoReaderBuilder) {
        this(executorService, deviceInfoReaderBuilder, DEFAULT_NATIVE_TOKEN_PREFIX);
    }

    public void generateToken(final INativeTokenGeneratorListener iNativeTokenGeneratorListener) {
        this._executorService.execute(new Runnable() {
            public void run() {
                try {
                    String encodeToString = Base64.encodeToString(new DeviceInfoReaderCompressor(NativeTokenGenerator.this._deviceInfoReaderBuilder.build()).getDeviceData(), 2);
                    if (NativeTokenGenerator.this._prependStr == null || NativeTokenGenerator.this._prependStr.isEmpty()) {
                        iNativeTokenGeneratorListener.onReady(encodeToString);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder(NativeTokenGenerator.this._prependStr.length() + encodeToString.length());
                    sb2.append(NativeTokenGenerator.this._prependStr);
                    sb2.append(encodeToString);
                    iNativeTokenGeneratorListener.onReady(sb2.toString());
                } catch (Exception e10) {
                    DeviceLog.exception("Unity Ads failed to generate token.", e10);
                    iNativeTokenGeneratorListener.onReady((String) null);
                }
            }
        });
    }

    public NativeTokenGenerator(ExecutorService executorService, DeviceInfoReaderBuilder deviceInfoReaderBuilder, String str) {
        this._executorService = executorService;
        this._deviceInfoReaderBuilder = deviceInfoReaderBuilder;
        this._prependStr = str;
    }
}
