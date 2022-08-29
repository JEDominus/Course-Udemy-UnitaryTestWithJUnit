package org.undemy.junit;

import static org.junit.Assert.*;

//Library to simplify the search all matchers
import org.hamcrest.Matchers;
import org.junit.Test;

public class IntroductionToHamcrestMatchers {

    @Test
    public void initialHamcrestExample(){
        String string = "Hello World";

        assertThat(string, Matchers.is("Hello World"));
    }

}
