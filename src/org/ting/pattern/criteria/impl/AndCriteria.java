package org.ting.pattern.criteria.impl;

import org.ting.pattern.criteria.bean.Person;
import org.ting.pattern.criteria.inter.Criteria;

import java.util.List;

/**
 * 逻辑与过滤器
 *
 * @author 张韧炼
 * @create 2019-07-04 下午4:58
 **/
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
