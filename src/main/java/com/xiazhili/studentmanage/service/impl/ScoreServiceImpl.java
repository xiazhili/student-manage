package com.xiazhili.studentmanage.service.impl;

import com.xiazhili.studentmanage.bean.Score;
import com.xiazhili.studentmanage.dao.ScoreRepository;
import com.xiazhili.studentmanage.service.ScoreSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl implements ScoreSerivce {

    @Autowired
    private ScoreRepository scoreRepository;

    @Override
    public Page<Score> test(Integer first, Integer last) {
        System.out.println(scoreRepository.findAllByScoreBetween(first, last));
        return null;
    }
}
