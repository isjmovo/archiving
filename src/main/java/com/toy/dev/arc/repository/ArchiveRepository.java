package com.toy.dev.arc.repository;

import com.toy.dev.arc.entity.Archive;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArchiveRepository extends JpaRepository<Archive, Integer> {
}
