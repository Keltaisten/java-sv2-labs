package stringmethods;

import java.util.Locale;

public class UrlManager {
    private String protocol;
    private String host;
    private Integer port;
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

//    public void hostFromUrl(String url){
//        host = url.substring(0,url.indexOf(':')).toLowerCase();
//        url = url.substring(url.indexOf(":") +1);
//    }

    public void hostFromUrl(String url){
        if (url.contains("/")) {
        host = url.substring(0,url.indexOf('/')).toLowerCase();
        url = url.substring(url.indexOf("/") +1);
        }else{
            host = url.toLowerCase();
            url = "";
        }
    }

//    public void portFromUrl(String url){
//        port = Integer.parseInt(url.substring(0,url.indexOf('/')));
//        url = url.substring(url.indexOf("/") +1);
//    }

    public void portFromUrl(String url){
        if(host.contains(":")) {
            port = Integer.parseInt(host.substring(url.indexOf(':')+1));
        }
    }
    
    public void pathFromUrl(String url){
        if(!url.equals("")) {
            path = url.substring(0, url.indexOf('?'));
            url = url.substring(url.indexOf("?") + 1);
        }else{
            path = "";
        }
    }

    public void queryFromUrl(String url){
        if(!url.equals("")) {
            query = url;
        }else{
            query = "";
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

}
