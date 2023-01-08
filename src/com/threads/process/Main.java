package com.threads.process;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("notepad.exe");
        processBuilder.start();
       // Process process = new ProcessBuilder("notepad.exe").start();
    }
}
