package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {
    List<DnsEntry> dnsEntries = new ArrayList<>();

    private static class DnsEntry{
        private String name;
        private String ipAddress;

        public DnsEntry(String name, String ipAddress) {
            this.name = name;
            this.ipAddress = ipAddress;
        }
    }

    public void addEntry(String hostName, String hostIp){
        for(DnsEntry dnsEntry : dnsEntries){
            if(dnsEntry.ipAddress.equals(hostIp) || dnsEntry.name.equals(hostIp)){
                throw new IllegalArgumentException("Already exists");
            }
        }
        dnsEntries.add(new DnsEntry(hostName,hostIp));
    }

    public void removeEntryByName(String hostName){
        List<DnsEntry> dns = new ArrayList<>();
        for(DnsEntry dnsEntry : dnsEntries){
            if(dnsEntry.name.equals(hostName)){
                dns.add(dnsEntry);
            }
        }
        dnsEntries.removeAll(dns);
    }

    public void removeEntryByIp(String hostIp){
        List<DnsEntry> dns = new ArrayList<>();
        for(DnsEntry dnsEntry : dnsEntries){
            if(dnsEntry.ipAddress.equals(hostIp)){
                dns.add(dnsEntry);
            }
        }
        dnsEntries.removeAll(dns);
    }

    public String getIpByName(String hostName){
        for(DnsEntry dnsEntry : dnsEntries){
            if(dnsEntry.name.equals(hostName)){
                return dnsEntry.ipAddress;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public String getNameByIp(String hostIp){
        for(DnsEntry dnsEntry : dnsEntries){
            if(dnsEntry.ipAddress.equals(hostIp)){
                return dnsEntry.name;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }
}
