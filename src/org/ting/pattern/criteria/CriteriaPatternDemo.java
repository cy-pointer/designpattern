package org.ting.pattern.criteria;

import org.ting.pattern.criteria.bean.Person;
import org.ting.pattern.criteria.impl.*;
import org.ting.pattern.criteria.inter.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤演示
 *
 * @author 张韧炼
 * @create 2019-07-04 下午5:51
 **/
public class CriteriaPatternDemo {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males:");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales:");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males:");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females:");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("person:[Name:" + person.getName()
                    + ",Gender:" + person.getGender()
                    + ",Marital Status:" + person.getMaritalStatus()
                    + "]");
        }
    }
}
