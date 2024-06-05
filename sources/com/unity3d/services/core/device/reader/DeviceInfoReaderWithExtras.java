package com.unity3d.services.core.device.reader;

import java.util.Map;

public class DeviceInfoReaderWithExtras implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final Map<String, String> _extras;

    public DeviceInfoReaderWithExtras(IDeviceInfoReader iDeviceInfoReader, Map<String, String> map) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._extras = map;
    }

    public Map<String, Object> getDeviceInfoData() {
        Map<String, String> map;
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        if (!(deviceInfoData == null || (map = this._extras) == null)) {
            deviceInfoData.putAll(map);
        }
        return deviceInfoData;
    }
}
