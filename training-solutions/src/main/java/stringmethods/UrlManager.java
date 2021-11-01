package stringmethods;

import java.util.Locale;

public class UrlManager {
    private String protocol;
    private String host;
    private Integer port;
    private String path;
    private String query;

    public UrlManager(String url){
        String urlCut = url.trim();
//        url = url.trim();
        protocolFromUrl(urlCut);
//        hostFromUrl(url);
//        portFromUrl(url);
    }

    public void protocolFromUrl(String url){
        protocol = url.substring(0,url.indexOf(':')).toLowerCase();
        hostFromUrl(url.substring(url.indexOf("://") +3));
//        url = url.substring(url.indexOf("://") +3);
    }

//    public void hostFromUrl(String url){
//        host = url.substring(0,url.indexOf(':')).toLowerCase();
//        url = url.substring(url.indexOf(":") +1);
//    }

//    public void hostFromUrl(String url){
//        if (url.contains("/")) {
//        host = url.substring(0,url.indexOf('/')).toLowerCase();
//        portFromUrl(url.substring(url.indexOf("/") +1));
//
////        url = url.substring(url.indexOf("/") +1);
//
//        }else{
//            host = url.toLowerCase();
//            url = "";
//        }
//    }

    public void hostFromUrl(String url){
        if (url.contains("/")) {
            if (url.contains(":")) {
            host = url.substring(0,url.indexOf(':')).toLowerCase();
            port = Integer.parseInt(url.substring(url.indexOf(':')+1,url.indexOf('/')));

//        url = url.substring(url.indexOf("/") +1);
        }else {
                host = url.substring(0,url.indexOf('/')).toLowerCase();
                port = null;
            }
            url = url.substring(url.indexOf("/") +1);
//            pathFromUrl(url.substring(url.indexOf("/") +1));
        }else{
            host = url.toLowerCase();
            port = null;
            url = "";
        }
        pathFromUrl(url);
    }

//    public void portFromUrl(String url){
//        port = Integer.parseInt(url.substring(0,url.indexOf('/')));
//        url = url.substring(url.indexOf("/") +1);
//    }

    public void portFromUrl(String url){
        if(host.contains(":")) {
            port = Integer.parseInt(host.substring(url.indexOf(':')+1));
        }else{
            port = null;
        }
    }

    public void pathFromUrl(String url){
        if(!url.equals("")) {
            path = url.substring(0, url.indexOf('?'));
            url = url.substring(url.indexOf("?") + 1);
        }else{
            path = "not defined";
            url = "";
        }
        queryFromUrl(url);
    }

    public void queryFromUrl(String url){
        if(!url.equals("")) {
            query = url;
        }else{
            query = "not defined";
        }
    }

    public boolean hasProperty(String key){
        return query.contains(key);
    }

    public String getProperty(String key){
        if(hasProperty(key)){
            int start = query.indexOf("=",query.indexOf(key))+1;
            int end = query.indexOf("&",query.indexOf(key));
            return query.substring(start,end);
        }
        return "The key is not exists";
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public static void main(String[] args) {
        UrlManager urlM = new UrlManager("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");
        System.out.println("Protocol: " + urlM.getProtocol());
        System.out.println("Host: " + urlM.getHost());
        System.out.println("Portal: " + urlM.getPort());
        System.out.println("Path: " + urlM.getPath());
        System.out.println("Query: " + urlM.getQuery());
        UrlManager urlM2 = new UrlManager("https://earthquake.usgs.gov:100/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");
        System.out.println("Protocol: " + urlM2.getProtocol());
        System.out.println("Host: " + urlM2.getHost());
        System.out.println("Portal: " + urlM2.getPort());
        System.out.println("Path: " + urlM2.getPath());
        System.out.println("Query: " + urlM2.getQuery());
        UrlManager urlM3 = new UrlManager("https://earthquake.usgs.gov:100");
        System.out.println("Protocol: " + urlM3.getProtocol());
        System.out.println("Host: " + urlM3.getHost());
        System.out.println("Portal: " + urlM3.getPort());
        System.out.println("Path: " + urlM3.getPath());
        System.out.println("Query: " + urlM3.getQuery());

        System.out.println(urlM.hasProperty("date"));
        System.out.println(urlM.getProperty("format"));
    }

}
