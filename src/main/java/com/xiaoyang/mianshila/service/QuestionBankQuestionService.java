package com.xiaoyang.mianshila.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoyang.mianshila.model.dto.questionBankQuestion.QuestionBankQuestionQueryRequest;
import com.xiaoyang.mianshila.model.entity.QuestionBankQuestion;
import com.xiaoyang.mianshila.model.entity.User;
import com.xiaoyang.mianshila.model.vo.QuestionBankQuestionVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 题库题目关联服务
 *
 * @author <a href="https://github.com/lizhangxyl">程序员小阳</a>

 */
public interface QuestionBankQuestionService extends IService<QuestionBankQuestion> {

    /**
     * 校验数据
     *
     * @param questionBankQuestion
     * @param add 对创建的数据进行校验
     */
    void validQuestionBankQuestion(QuestionBankQuestion questionBankQuestion, boolean add);

    /**
     * 获取查询条件
     *
     * @param questionBankQuestionQueryRequest
     * @return
     */
    QueryWrapper<QuestionBankQuestion> getQueryWrapper(QuestionBankQuestionQueryRequest questionBankQuestionQueryRequest);
    
    /**
     * 获取题库题目关联封装
     *
     * @param questionBankQuestion
     * @param request
     * @return
     */
    QuestionBankQuestionVO getQuestionBankQuestionVO(QuestionBankQuestion questionBankQuestion, HttpServletRequest request);

    /**
     * 分页获取题库题目关联封装
     *
     * @param questionBankQuestionPage
     * @param request
     * @return
     */
    Page<QuestionBankQuestionVO> getQuestionBankQuestionVOPage(Page<QuestionBankQuestion> questionBankQuestionPage, HttpServletRequest request);

    /**
     * 批量向题库添加数据
     * @param questionIdList
     * @param questionBankId
     * @param loginUser
     */
    public void batchAddQuestionsToBank(List<Long> questionIdList, Long questionBankId, User loginUser);

    public void batchAddQuestionsToBankInner(List<QuestionBankQuestion> questionBankQuestions);

    /**
     * 批量从题库移除题目
     * @param questionIdList
     * @param questionBankId
     */
    public void batchRemoveQuestionsFromBank(List<Long> questionIdList, Long questionBankId);
}
