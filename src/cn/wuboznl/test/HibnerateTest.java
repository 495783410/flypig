package cn.wuboznl.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.wuboznl.bean.Teacher;
import cn.wuboznl.util.HibnerateUtil;

public class HibnerateTest {
	public static void main(String[] args) {

		Session session = HibnerateUtil.createSession();
		Transaction tx = null;
		tx = (Transaction) session.beginTransaction();
		try {
	
			Teacher teacher=new Teacher();
			teacher.setSalary("100000000");
			session.save(teacher);

			tx.commit();
		} catch (Exception ex) {
			System.out.println("Test");
			ex.printStackTrace();
		} finally {
			HibnerateUtil.closeSession(session);
		}

	}

}
