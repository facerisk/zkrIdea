package com.lpl.springboot.nb3.conditional;

public class LinuxListService implements ListService {
    public String showListCmd() {
        return "ls";
    }
}
