package org.dell.kube.pages;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    public String getPage() {
        return "YellowPages";
    }
}
