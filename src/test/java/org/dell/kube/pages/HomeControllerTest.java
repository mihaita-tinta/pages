package org.dell.kube.pages;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HomeControllerTest {

    String yellowPages = "YellowPages";

    @Test
    public void itSaysYellowPages() {

        HomeController controller = new HomeController(null);
        assertThat(controller.getPage()).contains(yellowPages);


    }

}
