package ws.client;

import cn.nyc.study.ws.server.User;
import cn.nyc.study.ws.server.UserServiceProxy;
/**
 * eclipse 生成的客户端代码
 * wsdl 服务端地址：http://localhost:8080/soap/user?wsdl
 * 服务端见 springboot-study 地址： https://github.com/nieyc/springboot-study
 * @author nyc
 * @version 0.1 (2018年1月5日 下午2:46:11)
 * @since 0.1
 * @see 
 */
public class testClient {
	public static void main(String[] args) throws Exception { 		
		UserServiceProxy proxy=new UserServiceProxy();
		String a=	proxy.getName(21l);
		System.out.println(a);
		User u=proxy.getUser(21l);
		System.out.println(u.getEmail()); 
    }  
	
}
