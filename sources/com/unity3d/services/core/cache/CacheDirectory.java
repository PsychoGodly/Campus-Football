package com.unity3d.services.core.cache;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.unity3d.services.core.log.DeviceLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CacheDirectory {
    private static final String TEST_FILE_NAME = "UnityAdsTest.txt";
    private String _cacheDirName;
    private File _cacheDirectory = null;
    private boolean _initialized = false;
    private CacheDirectoryType _type = null;

    public CacheDirectory(String str) {
        this._cacheDirName = str;
    }

    private void createNoMediaFile(File file) {
        try {
            if (new File(file, ".nomedia").createNewFile()) {
                DeviceLog.debug("Successfully created .nomedia file");
            } else {
                DeviceLog.debug("Using existing .nomedia file");
            }
        } catch (Exception e10) {
            DeviceLog.exception("Failed to create .nomedia file", e10);
        }
    }

    public File createCacheDirectory(File file, String str) {
        if (file == null) {
            return null;
        }
        File file2 = new File(file, str);
        file2.mkdirs();
        if (file2.isDirectory()) {
            return file2;
        }
        return null;
    }

    public synchronized File getCacheDirectory(Context context) {
        File file;
        if (context == null) {
            return null;
        }
        if (this._initialized) {
            return this._cacheDirectory;
        }
        this._initialized = true;
        if (Build.VERSION.SDK_INT > 18) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                try {
                    file = createCacheDirectory(context.getExternalCacheDir(), this._cacheDirName);
                } catch (Exception e10) {
                    DeviceLog.exception("Creating external cache directory failed", e10);
                    file = null;
                }
                if (testCacheDirectory(file)) {
                    createNoMediaFile(file);
                    this._cacheDirectory = file;
                    this._type = CacheDirectoryType.EXTERNAL;
                    DeviceLog.debug("Unity Ads is using external cache directory: " + file.getAbsolutePath());
                    return this._cacheDirectory;
                }
            } else {
                DeviceLog.debug("External media not mounted");
            }
        }
        File filesDir = context.getFilesDir();
        if (testCacheDirectory(filesDir)) {
            this._cacheDirectory = filesDir;
            this._type = CacheDirectoryType.INTERNAL;
            DeviceLog.debug("Unity Ads is using internal cache directory: " + filesDir.getAbsolutePath());
            return this._cacheDirectory;
        }
        DeviceLog.error("Unity Ads failed to initialize cache directory");
        return null;
    }

    public CacheDirectoryType getType() {
        return this._type;
    }

    public boolean testCacheDirectory(File file) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        if (file != null && file.isDirectory()) {
            try {
                byte[] bytes = "test".getBytes("UTF-8");
                int length = bytes.length;
                byte[] bArr = new byte[length];
                File file2 = new File(file, TEST_FILE_NAME);
                fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                fileOutputStream.close();
                fileInputStream = new FileInputStream(file2);
                int read = fileInputStream.read(bArr, 0, length);
                fileInputStream.close();
                if (!file2.delete()) {
                    DeviceLog.debug("Failed to delete testfile " + file2.getAbsoluteFile());
                    return false;
                } else if (read != length) {
                    DeviceLog.debug("Read buffer size mismatch");
                    return false;
                } else if (new String(bArr, "UTF-8").equals("test")) {
                    return true;
                } else {
                    DeviceLog.debug("Read buffer content mismatch");
                    return false;
                }
            } catch (Exception e10) {
                DeviceLog.debug("Unity Ads exception while testing cache directory " + file.getAbsolutePath() + ": " + e10.getMessage());
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return false;
        throw th;
        throw th;
    }
}
