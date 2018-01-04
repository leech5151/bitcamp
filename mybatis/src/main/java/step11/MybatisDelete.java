package step11;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisDelete {
    public static void main(String[] args) throws Exception {
        
        ClassPathXmlApplicationContext iocContainer = 
                new ClassPathXmlApplicationContext("step11/application-context.xml");
        
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
        int count = boardDao.delete(12);

        System.out.printf("%d개가 삭제되었습니다.\n",count);
        
    }
}
