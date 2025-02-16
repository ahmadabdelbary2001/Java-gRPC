import junit.framework.TestCase;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import org.example.protoFiles.Book;

public class MessageSizesTest extends TestCase{
    // Helper method to create a sample Book object
    private Book buildBook() {
        // Create a Publisher object
        Book.Publisher publisher = Book.Publisher.newBuilder()
                .setName("Editions Ellipses")
                .setLocation("Paris")
                .build();

        // Create a Book object
        return Book.newBuilder()
                .setTitle("263 Exercices corriges de Mathematiques en speciales")
                .setAuthor("Omran Kouba")
                .setIsbn("978-2-7298-4564-3")
                .setPublicationYear(1995)
                .setCategory(Book.Category.SCIENCE)
                .setPublisher(publisher)
                .build();
    }

    public void testProtobufSize() {
        // Use the helper method to get the sample Book object
        Book book = buildBook();

        // Convert to Protobuf byte array
        byte[] protobufBytes = book.toByteArray();
        System.out.println("Protobuf size: " + protobufBytes.length);
    }

    public void testJsonSize() throws InvalidProtocolBufferException {
        // Use the helper method to get the sample Book object
        Book book = buildBook();

        // Convert to JSON
        String jsonString = JsonFormat.printer().print(book);
        System.out.println("JSON size: " + jsonString.getBytes().length);
    }
}