package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.Device;
import java.util.Map;
import kotlin.jvm.internal.m;

/* compiled from: DeviceInfoReaderWithAuid.kt */
public final class DeviceInfoReaderWithAuid implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;

    public DeviceInfoReaderWithAuid(IDeviceInfoReader iDeviceInfoReader) {
        m.e(iDeviceInfoReader, "_deviceInfoReader");
        this._deviceInfoReader = iDeviceInfoReader;
    }

    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        m.d(deviceInfoData, "_deviceInfoReader.deviceInfoData");
        String auid = Device.getAuid();
        if (auid != null) {
            deviceInfoData.put("auid", auid);
        }
        return deviceInfoData;
    }
}
