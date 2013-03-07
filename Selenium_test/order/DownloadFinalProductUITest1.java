//package com.esoftsystems.f2.uitest.order;
//
//import com.google.common.annotations.Beta;
//import com.lazerycode.ebselen.EbselenCore;
//import com.lazerycode.ebselen.handlers.FileHandler;
//import org.apache.commons.httpclient.*;
//import org.apache.commons.httpclient.cookie.CookiePolicy;
//import org.apache.commons.httpclient.HttpClient;
//import org.apache.commons.httpclient.methods.GetMethod;
//
//import java.io.*;
//import java.net.URL;
//import java.util.Set;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//
//public class DownloadFinalProductUITest1 {
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(EbselenCore.class);
//    private WebDriver driver;
//    private String downloadPath = System.getProperty("java.io.tmpdir");
//
//    public void FileDownloader(WebDriver driverObject) {
//        this.driver = driverObject;
//    }
//
//    /**
//     * Get the current location that files will be downloaded to.
//     *
//     * @return The filepath that the file will be downloaded to.
//     */
//    public String getDownloadPath() {
//        return this.downloadPath;
//    }
//
//    /**
//     * Set the path that files will be downloaded to.
//     *
//     * @param filePath The filepath that the file will be downloaded to.
//     */
//    public void setDownloadPath(String filePath) {
//        this.downloadPath = filePath;
//    }
//
//
//    /**
//     * Load in all the cookies WebDriver currently knows about so that we can mimic the browser cookie state
//     *
//     * @param seleniumCookieSet
//     * @return
//     */
//    private HttpState mimicCookieState(Set<org.openqa.selenium.Cookie> seleniumCookieSet) {
//        HttpState mimicWebDriverCookieState = new HttpState();
//        for (org.openqa.selenium.Cookie seleniumCookie : seleniumCookieSet) {
//            Cookie httpClientCookie = new Cookie(seleniumCookie.getDomain(), seleniumCookie.getName(), seleniumCookie.getValue(), seleniumCookie.getPath(), seleniumCookie.getExpiry(), seleniumCookie.isSecure());
//            mimicWebDriverCookieState.addCookie(httpClientCookie);
//        }
//        return mimicWebDriverCookieState;
//    }
//
//    /**
//     * Mimic the WebDriver host configuration
//     *
//     * @param hostURL
//     * @return
//     */
//    private HostConfiguration mimicHostConfiguration(String hostURL, int hostPort) {
//        HostConfiguration hostConfig = new HostConfiguration();
//        hostConfig.setHost(hostURL, hostPort);
//        return hostConfig;
//    }
//
//    public String fileDownloader(WebElement element) throws Exception {
//        return downloader(element, "href");
//    }
//
//    public String imageDownloader(WebElement element) throws Exception {
//        return downloader(element, "src");
//    }
////http://dev.e2.esoftsystems.com.s3.amazonaws.com/b5/a5/52/2d-b472-4f96-b67c-f9a45256a80e?versionId=CQEHreUVziodMNee2QROzFH1ZU0ehWm6
//    public String downloader(WebElement element, String attribute) throws Exception {
//        //Assuming that getAttribute does some magic to return a fully qualified URL
//        String downloadLocation = element.getAttribute(attribute);
//        if (downloadLocation.trim().equals("")) {
//            throw new Exception("The element you have specified does not link to anything!");
//        }
//        URL downloadURL = new URL(downloadLocation);
//        HttpClient client = new HttpClient();
//        client.getParams().setCookiePolicy(CookiePolicy.RFC_2965);
//        client.setHostConfiguration(mimicHostConfiguration(downloadURL.getHost(), downloadURL.getPort()));
//        client.setState(mimicCookieState(driver.manage().getCookies()));
//        HttpMethod getRequest = new GetMethod(downloadURL.getPath());
//        FileHandler downloadedFile = new FileHandler(downloadPath + downloadURL.getFile().replaceFirst("/|\\\\", ""), true);
//        try {
//            int status = client.executeMethod(getRequest);
//            LOGGER.info("HTTP Status {} when getting '{}'", status, downloadURL.toExternalForm());
//            BufferedInputStream in = new BufferedInputStream(getRequest.getResponseBodyAsStream());
//            int offset = 0;
//            int len = 4096;
//            int bytes = 0;
//            byte[] block = new byte[len];
//            while ((bytes = in.read(block, offset, len)) > -1) {
//                downloadedFile.getWritableFileOutputStream().write(block, 0, bytes);
//            }
//            downloadedFile.close();
//            in.close();
//            LOGGER.info("File downloaded to '{}'", downloadedFile.getAbsoluteFile());
//        } catch (Exception Ex) {
//            LOGGER.error("Download failed: {}", Ex);
//            throw new Exception("Download failed!");
//        } finally {
//            getRequest.releaseConnection();
//        }
//        return downloadedFile.getAbsoluteFile();
//    }
//}
//
//
//
//
//
//
//
//
//
//
////
////package com.esoftsystems.f2.uitest.order;
////
////import java.util.regex.Pattern;
////import java.util.concurrent.TimeUnit;
////import org.junit.*;
////import static org.junit.Assert.*;
////import static org.hamcrest.CoreMatchers.*;
////import org.openqa.selenium.*;
////import org.openqa.selenium.firefox.FirefoxDriver;
////import org.openqa.selenium.support.ui.Select;
////
////public class DownloadFinalProductUITest {
////  private WebDriver driver;
////  private String baseUrl;
////  private boolean acceptNextAlert = true;
////  private StringBuffer verificationErrors = new StringBuffer();
////
////  @Before
////  public void setUp() throws Exception {
////    driver = new FirefoxDriver();
////    baseUrl = "http://localhost:8080/";
////    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////  }
////
////  @Test
////  public void testDownloadFinalProduct() throws Exception {
////    driver.get(baseUrl + "/f2/f2-frontend/#leftmenuitem.done.orders");
////    driver.findElement(By.id("id.button.download.ac4b2236-91a4-40b5-886b-42c451b57d21")).click();
////    driver.findElement(By.cssSelector("a > span")).click();
////  }
////
////  @After
////  public void tearDown() throws Exception {
////    driver.quit();
////    String verificationErrorString = verificationErrors.toString();
////    if (!"".equals(verificationErrorString)) {
////      fail(verificationErrorString);
////    }
////  }
////
////}
////
////
//
//
//
//
//
//
//
//
//
