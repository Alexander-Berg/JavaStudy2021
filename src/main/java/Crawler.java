import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Collection;

public class Crawler {


    public static class WebCrawlerExample {
        public static void main(String[] args) {
            String seedUrl = "https://example.com";
            int maxDepth = 2;

            crawl(seedUrl, maxDepth);
        }

        public static void crawl(String url, int depth) {
            if (depth <= 0) {
                return;
            }

            try {
                // Fetch the HTML content from the URL
                Document doc = Jsoup.connect(url).get();

                // Process the fetched HTML
                System.out.println("Crawling: " + url);

                // Extract links from the document
                Elements links = doc.select("a[href]");
                for (Element link : links) {
                    String nextUrl = link.absUrl("href");
                    crawl(nextUrl, depth - 1);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public Collection<Object> getCrawledUrls() {
            return null;
        }
    }

}
