package com.xiaoyang.mianshila.esdao;

import com.xiaoyang.mianshila.model.dto.question.QuestionEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 题目 ES 操作
 */
public interface QuestionEsDao
        extends ElasticsearchRepository<QuestionEsDTO, Long> {

}

