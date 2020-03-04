import java.io.IOException;
// Copyright (c) DragonBook
public class Postfix {
    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();
        parser.expr();
        System.out.write('\n');
    }
}
