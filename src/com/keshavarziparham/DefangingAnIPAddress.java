package com.keshavarziparham;

/*
    Given a valid (IPv4) IP address, return a defanged version of that IP address.
    A defanged IP address replaces every period "." with "[.]".

    Constraints:
    The given address is a valid IPv4 address.
     */

public class DefangingAnIPAddress {

    public static void main(String[] args) {
        String address = "1.11.1.1";
        System.out.println(defrangIPaddr(address));
    }

    public static String defrangIPaddr1(String address){
        int i = 0;
        while (address.indexOf(i) != -1){
            if (address.indexOf(i) == '.'){
                //address.
            }
        }
        return null;
    }

    public static String defrangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
