package group1.art1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(OutputCaptureExtension.class)
public class AppTest {

    @Test
    void testHello(CapturedOutput capture) throws Exception {
        App.main(new String[]{});
        assertThat(capture.toString()).isEqualToIgnoringNewLines("Hello World!");
        system.out.println("in App Test class");
        // added a comment
        system.out.println("from HP Branch");
       
    }
}
