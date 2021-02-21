package com.jaffa.rpc.gradle.plugin;

public class JaffaRpcGradlePluginExtension {
    private String rootPath = "src/main/java/";

    public String getRootPath() {
        return rootPath;
    }

    public void setRootPath(String rootPath) {
        this.rootPath = rootPath;
    }
}
