package org.onetoone.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String args[])throws Exception {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
            Instructor instructor = new Instructor("suju", "32");
            InstructorDetail instructorDetail = new InstructorDetail("youtube.com", "singing");
            instructor.setInstructorDetail(instructorDetail);

            SessionFactory sessionFactory=new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Instructor.class)
                    .addAnnotatedClass(InstructorDetail.class)
                    .buildSessionFactory();

            Session session=sessionFactory.getCurrentSession();
            session.beginTransaction();
            session.save(instructor);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
