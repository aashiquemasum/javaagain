public class ChromeBrowser {
    public static void main(String[] args){
        System.out.println("Hi There");
       ChromeBrowser myChromeBrowser = new ChromeBrowser();
        myChromeBrowser.openChromeBrowser();
        myChromeBrowser.writeUrlInChromeAddressBar();
        myChromeBrowser.closeChromeBrowser();
        myChromeBrowser.openNewTabInChromeBrowser();
    }
    public void openChromeBrowser(){
        System.out.println("Open the Chrome browser");

    }
    public void writeUrlInChromeAddressBar(){
        System.out.println("Write an Url In chrome address bar");
    }
    public void closeChromeBrowser(){
        System.out.println("Close the Browser");
    }
    public void openNewTabInChromeBrowser(){
        System.out.println("Open a net tab in browser");
    }
}
