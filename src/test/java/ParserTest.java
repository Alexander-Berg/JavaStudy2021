import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
public class ParserTest {



    public class HtmlParserExampleTest {

        @Test
        public void testHtmlParser() {
            // Mock HTML content for testing
            String mockHtml = "<html><body><div id='content'><h1>Mock Heading</h1><p>Mock Paragraph</p></div></body></html>";

            // Mock Jsoup document for testing
            Document mockDocument = Jsoup.parse(mockHtml);

            // Mock Jsoup parse method
            JsoupWrapper mockJsoupWrapper = new JsoupWrapper(mockDocument);

            // Inject the mock JsoupWrapper instance
            Parser.HtmlParserExample parser = new Parser.HtmlParserExample();

            // Execute the parser
            parser.parse();

            // Assert the extracted heading and paragraph
            Assert.assertEquals("Mock Heading", parser.getExtractedHeading());
            Assert.assertEquals("Mock Paragraph", parser.getExtractedParagraph());
        }

        // Mock JsoupWrapper class for testing
        private static class JsoupWrapper {
            private final Document mockDocument;

            public JsoupWrapper(Document mockDocument) {
                this.mockDocument = mockDocument;
            }

            public Document parse(String html) {
                return mockDocument;
            }
        }
    }

}
