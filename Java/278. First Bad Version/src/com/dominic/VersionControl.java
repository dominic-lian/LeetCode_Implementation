package com.dominic;

public class VersionControl {

    Boolean isBadVersion(int version) {
        if (version > 5) {
            return true;
        } else {
            return false;
        }
    }
}
