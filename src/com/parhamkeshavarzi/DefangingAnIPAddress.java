package com.parhamkeshavarzi;

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
        System.out.println("Low level: " + defrangIPaddr1(address));
    }

    //Lower-level approach
    public static String defrangIPaddr1(String address) {
        int i = 0;
        StringBuilder addressNew = new StringBuilder();
        //System.out.println("Address index: " + address.charAt(i));
        while (i < (address.length() - 1)) {
            if (address.charAt(i) == '.') {
                addressNew.append("[.]");
            }
            else {
                addressNew.append(address.charAt(i));
            }
            i++;
        }
        return addressNew.toString();
    }

    public static String defrangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
