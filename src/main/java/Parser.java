import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
public class Parser {

    public static class HtmlParserExample {
        public static void main(String[] args) {
            String html = "<html><body><div id='content'><h1>Hello, world!</h1><p>This is an example HTML document.</p></div></body></html>";

            // Parse the HTML document
            Document doc = Jsoup.parse(html);

            // Extract data from the parsed document
            Element contentDiv = doc.getElementById("content");
            String heading = contentDiv.select("h1").text();
            String paragraph = contentDiv.select("p").text();

            // Print the extracted data
            System.out.println("Heading: " + heading);
            System.out.println("Paragraph: " + paragraph);
        }

        public void parse() {
        }

        public String getExtractedHeading() {
            return null;
        }

        public String getExtractedParagraph() {
            return null;
        }
    }

}
