package stringmethods;

import java.util.Locale;

public class UrlManager {
    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url){
        url = url.trim();
        protocolFromUrl(url);
        hostFromUrl(url);
        portFromUrl(url);
    }

    public void protocolFromUrl(String url){
        protocol = url.substring(0,url.indexOf(':')).toLowerCase();
        url = url.substring(url.indexOf("://") +3);
    }

    public void hostFromUrl(String url){
        host = url.substring(0,url.indexOf(':')).toLowerCase();
        url = url.substring(url.indexOf(":") +1);
    }

    public void portFromUrl(String url){
        port = Integer.parseInt(url.substring(0,url.indexOf('/')));
        url = url.substring(url.indexOf("/") +1);
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

}
