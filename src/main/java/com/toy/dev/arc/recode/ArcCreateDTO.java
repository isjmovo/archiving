package com.toy.dev.arc.recode;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class ArcCreateDTO {
  @NonNull
  private String title;

  @NonNull
  private Integer price;
}