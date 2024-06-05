package com.unity3d.ads.core.extensions;

import java.io.File;
import java.util.LinkedList;
import kotlin.jvm.internal.m;

/* compiled from: FileExtensions.kt */
public final class FileExtensionsKt {
    public static final long getDirectorySize(File file) {
        File[] listFiles;
        m.e(file, "<this>");
        long j10 = 0;
        if (!file.exists()) {
            return 0;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        while (true) {
            boolean z10 = true;
            if (!(!linkedList.isEmpty())) {
                return j10;
            }
            File file2 = (File) linkedList.remove(0);
            if (file2.exists() && (listFiles = file2.listFiles()) != null) {
                if (listFiles.length != 0) {
                    z10 = false;
                }
                if (!z10) {
                    for (File file3 : listFiles) {
                        if (file3.isDirectory()) {
                            m.d(file3, "child");
                            linkedList.add(file3);
                        } else {
                            j10 += file3.length();
                        }
                    }
                }
            }
        }
    }
}
