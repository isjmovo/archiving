package com.toy.dev.arc.recode;

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