package com.toy.dev.arc.controller;

import com.toy.dev.arc.dto.ArcCreateDTO;
import com.toy.dev.arc.service.RecodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecodeController {
  @Autowired
  private RecodeService recodeService;

  @GetMapping("/rec/create")
  public String create() {
    return "rec/create";
  }

  @PostMapping("/book/create")
  public String insert(ArcCreateDTO arcCreateDTO) {
    Integer arcId = recodeService.insert(arcCreateDTO);

    return String.format("redirect:/rec/read/%s", arcId);
  }
}