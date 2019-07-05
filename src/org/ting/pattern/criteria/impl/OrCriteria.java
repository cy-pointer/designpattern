package org.ting.pattern.criteria.impl;

import org.ting.pattern.criteria.bean.Person;
import org.ting.pattern.criteria.inter.Criteria;

import java.util.List;

/**
 * 逻辑或过滤器
 *
 * @author 张韧炼
 * @create 2019-07-04 下午5:26
 **/
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
