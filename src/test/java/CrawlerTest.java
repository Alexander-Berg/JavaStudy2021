import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;


public class CrawlerTest {


    public class WebCrawlerTest {
        @Test
        public void testCrawl() throws IOException {
            // Mock HTML content for testing
            String mockHtml = "<html><body>" +
                    "<a href='https://example.com/page1'>Link 1</a>" +
                    "<a href='https://example.com/page2'>Link 2</a>" +
                    "</body></html>";

            // Mock Jsoup document for testing
            Document mockDocument = org.jsoup.Jsoup.parse(mockHtml);

            // Mock Jsoup connection
            org.jsoup.Connection mockConnection = org.mockito.Mockito.mock(org.jsoup.Connection.class);
            org.mockito.Mockito.when(mockConnection.get()).thenReturn(mockDocument);
            org.jsoup.Jsoup.connect(org.mockito.Mockito.anyString());

            // Test the crawl method
            Crawler.WebCrawlerExample crawler = new Crawler.WebCrawlerExample();
            crawler.crawl("https://example.com", 1);

            // Assert the crawled URLs
            Assert.assertEquals(2, crawler.getCrawledUrls().size());
            Assert.assertTrue(crawler.getCrawledUrls().contains("https://example.com/page1"));
            Assert.assertTrue(crawler.getCrawledUrls().contains("https://example.com/page2"));
        }
    }

}
