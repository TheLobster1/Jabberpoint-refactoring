import java.io.IOException;

public class DemoWriter extends Writer{
    @Override
    public void write(Presentation presentation, String fileName) throws IOException {
        throw new IllegalStateException("Save As->Demo! called");
    }
}
