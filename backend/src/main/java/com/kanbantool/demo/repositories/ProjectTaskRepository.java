package com.kanbantool.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.kanbantool.demo.domain.ProjectTask;

public interface ProjectTaskRepository extends CrudRepository <ProjectTask, Long> {

}
