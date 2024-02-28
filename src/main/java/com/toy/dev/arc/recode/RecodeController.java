package com.toy.dev.arc.recode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecodeController {
  @GetMapping("/rec/create")
  public String create() {
    return "rec/create";
  }
}