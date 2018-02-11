package com.dengji85.self.blog.manager.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

public class MyShiroRealm extends AuthorizingRealm {
   
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("权限配置-->MyShiroRealm.doGetAuthorizationInfo()");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        
            authorizationInfo.addRole("admin");
                authorizationInfo.addStringPermission("userInfo:add");
               authorizationInfo.addStringPermission("userInfo:view");
        return authorizationInfo;
    }

    /*主要是用来进行身份认证的，也就是说验证用户输入的账号和密码是否正确。*/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException {
        System.out.println("MyShiroRealm.doGetAuthenticationInfo()");
        //获取用户的输入的账号.
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        String userName = upToken.getUsername();
        String userPwd = new String(upToken.getPassword());
        System.out.println(userName);
        System.out.println(userPwd);
        //通过username从数据库中查找 User对象，如果找到，没找到.
        //实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
      //  UserInfo userInfo = userInfoService.findByUsername(username);
        /*System.out.println("----->>userInfo="+userInfo);
        if(userInfo == null){
            return null;
        }*/
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                "admin", //用户名
                "cc1f2028f14f37b7e579d9dae8b287e3", //密码
                ByteSource.Util.bytes("**#"),
                getName()  //realm name
        );
       
        return authenticationInfo;
    }
    //cc1f2028f14f37b7e579d9dae8b287e3
    public static void main(String[] args) {  
        int hashIterations = 10000;//加密的次数  
        Object salt = "**#";//盐值  
        Object credentials = "123456";//密码  
        String hashAlgorithmName = "MD5";//加密方式  
        Object simpleHash = new SimpleHash(hashAlgorithmName, credentials,  
                salt, hashIterations);  
        System.out.println("加密后的值----->" + simpleHash);  
    }  

}