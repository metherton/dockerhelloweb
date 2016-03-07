package com.martinetherton;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by martin on 07/03/16.
 */
public class HelloControllerTest {

    @Test
    public void testIndex() {
        HelloController controller = new HelloController();
        Assert.assertThat(controller.index(), Matchers.is("Greetings from Martin and Spring boot"));
    }
}
