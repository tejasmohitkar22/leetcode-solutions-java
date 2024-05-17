class Solution {
    public String defangIPaddr(String address) {
        String ipAddress = "";
        String[] str = address.split("\\.");
        for(int i = 0; i < str.length; i++){
            ipAddress += str[i];
            if (i < str.length - 1) {
            ipAddress += "[.]";
            }
        }
        return ipAddress;
    }
}