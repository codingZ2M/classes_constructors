package structural.design.pattern.proxy.pattern;

import java.util.Arrays;
import java.util.List;

class ProxyInternet implements Internet {
	
    private Internet internet = new RealInternet();
    private static List<String> bannedSites = Arrays.asList("abc.com", "xyz.com");

    public void connectTo(String site) {
        if (bannedSites.contains(site.toLowerCase())) {
            System.out.println("Access Denied to " + site);
        } else {
            internet.connectTo(site);
        }
    }
}