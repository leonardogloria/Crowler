import javax.net.ssl.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.X509Certificate;

/**
 * Created by lsilva on 26/01/2016.
 */
public class HttpUtil {

    private final String USER_AGENT = "Mozilla/5.0";

    public StringBuffer getHttpsRequest2(String idFabricante)throws  Exception{
        TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }
            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }
            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }
        };

        // Install the all-trusting trust manager
        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

        // Create all-trusting host name verifier
        HostnameVerifier allHostsValid = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };

        // Install the all-trusting host verifier
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        String urlContruida = "https://consultaca.com/fabricantes/" + idFabricante + "/";
        //System.out.println( urlContruida);
        URL url = new URL(urlContruida);
        URLConnection con = url.openConnection();
        Reader reader = new InputStreamReader(con.getInputStream());
        StringBuffer stf = new StringBuffer();
        while (true) {
            int ch = reader.read();
            if (ch==-1) {
                break;
            }
            stf.append((char) ch);
            //System.out.print((char)ch);
        }
        return stf;
    }


}




