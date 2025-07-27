/* In code there are only three examples of URLS :
1- .com
2- .org
3- .pk
 */

import java.util.Scanner;

public class WebsiteURL {
    public static void main(String[] args) {
        System.out.println("Enter URL :");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".com")) {
            System.out.println("This is a Commercial Website...!!!");
        } else if (website.endsWith(".org")) {
            System.out.println("This is an Organisational Website...!!!");
        } else if (website.endsWith(".pk")) {
            System.out.println("This is a Pakistani Website...!!!");
        }
    }
}
