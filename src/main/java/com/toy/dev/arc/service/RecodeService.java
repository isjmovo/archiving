package com.toy.dev.arc.service;

import com.toy.dev.arc.dto.ArcCreateDTO;
import com.toy.dev.arc.entity.Archive;
import com.toy.dev.arc.repository.ArchiveRepository;
import org.springframework.stereotype.Service;

@Service
public class RecodeService {
  private ArchiveRepository archiveRepository;

  public RecodeService(ArchiveRepository archiveRepository) {
    this.archiveRepository = archiveRepository;
  }

  public Integer insert(ArcCreateDTO arcCreateDTO) {
    Archive archive = Archive.builder()
        .title(arcCreateDTO.getTitle())
        .price(arcCreateDTO.getPrice())
        .build();

    archiveRepository.save(archive);

    return archive.getArcId();
  }
}