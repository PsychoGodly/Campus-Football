package com.startapp;

import com.startapp.simple.bloomfilter.codec.StringBuilderWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/* compiled from: Sta */
public class e3 {
    static {
        char c10 = File.separatorChar;
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter(4);
        PrintWriter printWriter = new PrintWriter(stringBuilderWriter);
        printWriter.println();
        stringBuilderWriter.toString();
        printWriter.close();
    }

    public static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
