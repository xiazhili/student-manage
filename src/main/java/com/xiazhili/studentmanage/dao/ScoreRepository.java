package com.xiazhili.studentmanage.dao;

import com.xiazhili.studentmanage.bean.Score;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.awt.*;
import java.util.List;

public interface ScoreRepository extends JpaRepository<Score, String>, JpaSpecificationExecutor<Score> {

    List<Score> findAllByScoreBetween(Integer first, Integer last);

}
