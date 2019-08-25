package com.lpl.springboot.nb3.conditional;

public class WindowsListService implements ListService {
    public String showListCmd() {
        return "dir";
    }
}
