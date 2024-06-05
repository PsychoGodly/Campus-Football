package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.reader.pii.NonBehavioralFlag;
import com.unity3d.services.core.device.reader.pii.NonBehavioralFlagReader;
import java.util.Map;

public class DeviceInfoReaderWithBehavioralFlag implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final NonBehavioralFlagReader _nonBehavioralFlagReader;

    public DeviceInfoReaderWithBehavioralFlag(IDeviceInfoReader iDeviceInfoReader, NonBehavioralFlagReader nonBehavioralFlagReader) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._nonBehavioralFlagReader = nonBehavioralFlagReader;
    }

    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        if (this._nonBehavioralFlagReader.getUserNonBehavioralFlag() != NonBehavioralFlag.UNKNOWN) {
            deviceInfoData.put(JsonStorageKeyNames.USER_NON_BEHAVIORAL_KEY, Boolean.valueOf(this._nonBehavioralFlagReader.getUserNonBehavioralFlag() == NonBehavioralFlag.TRUE));
        }
        return deviceInfoData;
    }
}
