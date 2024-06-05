package com.unity3d.services.core.device.reader;

import com.unity3d.ads.core.domain.GetAndroidAdPlayerContext;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.HashMap;
import java.util.Map;

public class MinimalDeviceInfoReader implements IDeviceInfoReader {
    final IGameSessionIdReader _gameSessionIdReader;

    public MinimalDeviceInfoReader(IGameSessionIdReader iGameSessionIdReader) {
        this._gameSessionIdReader = iGameSessionIdReader;
    }

    public Map<String, Object> getDeviceInfoData() {
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("sdkVersion", Integer.valueOf(SdkProperties.getVersionCode()));
        hashMap.put("sdkVersionName", SdkProperties.getVersionName());
        hashMap.put(ScarConstants.IDFI_KEY, Device.getIdfi());
        hashMap.put(JsonStorageKeyNames.GAME_SESSION_ID_NORMALIZED_KEY, this._gameSessionIdReader.getGameSessionIdAndStore());
        hashMap.put("ts", Long.valueOf(System.currentTimeMillis()));
        hashMap.put(GetAndroidAdPlayerContext.KEY_GAME_ID, ClientProperties.getGameId());
        return hashMap;
    }
}
