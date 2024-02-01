import java.io.IOException;

public abstract class Reader {
    public abstract Presentation read(String fileName) throws IOException;
}
