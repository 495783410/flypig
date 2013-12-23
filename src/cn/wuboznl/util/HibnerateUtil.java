package cn.wuboznl.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibnerateUtil {
	private static Session session = null;

	public static Session createSession() {
		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();
		session = factory.openSession();
		return session;
	}

	public  static void closeSession(Session session) {
		if (session != null) {
			session.close();
		}
	}

}
