import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ScrapperTest {


    public class WebScraperExampleTest {

        @Test
        public void testWebScraper() throws IOException {
            // Mock HTML content for testing
            String mockHtml = "<html><body>" +
                    "<h1>Headline 1</h1>" +
                    "<h1>Headline 2</h1>" +
                    "<a href='https://example.com/link1'>Link 1</a>" +
                    "<a href='https://example.com/link2'>Link 2</a>" +
                    "</body></html>";

            // Mock Jsoup document for testing
            Document mockDocument = Jsoup.parse(mockHtml);

            // Mock Jsoup connection
            JsoupWrapper mockJsoupWrapper = new JsoupWrapper(mockDocument);

            // Inject the mock JsoupWrapper instance
            Scrapper.WebScraperExample scraper;
            scraper = new Scrapper.WebScraperExample();

            // Execute the scraper
            scraper.scrape("https://example.com");

            // Assert the scraped headlines
            List<String> expectedHeadlines = Arrays.asList("Headline 1", "Headline 2");
            Assert.assertEquals(expectedHeadlines, scraper.getScrapedHeadlines());

            // Assert the scraped links
            List<String> expectedLinks = Arrays.asList("https://example.com/link1", "https://example.com/link2");
            Assert.assertEquals(expectedLinks, scraper.getScrapedLinks());
        }

        // Mock JsoupWrapper class for testing
        private static class JsoupWrapper {
            private final Document mockDocument;

            public JsoupWrapper(Document mockDocument) {
                this.mockDocument = mockDocument;
            }

            public Document connect(String url) throws IOException {
                return mockDocument;
            }
        }
    }

}
