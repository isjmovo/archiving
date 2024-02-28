package com.toy.dev.arc.recode;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
public class Archive {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer arcId;

  @Column(length = 200)
  private String title;

  private Integer price;

  @CreationTimestamp
  private LocalDateTime insertDateTime;
}
