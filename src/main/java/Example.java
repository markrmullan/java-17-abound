import com.withabound.Abound;
import com.withabound.AboundApiVersion;
import com.withabound.AboundConfig;
import com.withabound.AboundEnvironment;
import com.withabound.models.documents.ten99k.Form1099KDocumentRequest;

import java.io.IOException;
import java.util.Collections;

public class Example {
  public static void main(String... args) throws IOException {
    AboundConfig conf = new AboundConfig("asdf", "asdf", AboundEnvironment.SANDBOX, AboundApiVersion.V2);
    Abound abound = new Abound(conf);

    abound.documents().create("uasdf", Collections.singletonList(Form1099KDocumentRequest.builder().build()));
  }
}
