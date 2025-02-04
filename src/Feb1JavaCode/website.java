package Feb1JavaCode;

import java.util.Scanner;

public class website {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website");
        String web = sc.nextLine();
        website w= new website();
        String result=w.Web(web);
        System.out.println(result);

    }

    public String Web(String web) {
        String newweb = web.toLowerCase();

        if (newweb.contains(".com")) {
            return web + " is Commertial website";
        } else if (newweb.contains(".org")) {
            return web + " is non profit organization";
        } else if (newweb.contains(".edu")) {
            return web + " is educational institution";
        } else if (newweb.contains(".gov")) {
            return web + " is government website";
        } else if (newweb.contains(".net")) {
            return web + " is n/w related website";
        } else if (newweb.contains(".info")) {
            return web + " is informational website";
        } else {
            return web + " is unknown website";
        }
    }
}
