import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class Scrapper {



    public static class WebScraperExample {
        public static void main(String[] args) {
            try {
                // Fetch the HTML content from a website
                Document doc = Jsoup.connect("https://example.com").get();

                // Extract data from the fetched HTML
                Elements headlines = doc.select("h1");
                for (Element headline : headlines) {
                    System.out.println("Headline: " + headline.text());
                }

                Elements links = doc.select("a");
                for (Element link : links) {
                    System.out.println("Link: " + link.attr("href"));
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public List<String> getScrapedHeadlines() {
            return null;
        }

        public List<String> getScrapedLinks() {
            return null;
        }

        public void scrape(String url) {
        }
    }

}
