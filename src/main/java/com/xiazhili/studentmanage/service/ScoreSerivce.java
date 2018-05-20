package com.xiazhili.studentmanage.service;

import com.xiazhili.studentmanage.bean.Score;
import org.springframework.data.domain.Page;

public interface ScoreSerivce {

    Page<Score> test(Integer first, Integer last);
}
