//package cas.client.cas_client.config;
//
//
////import org.springframework.boot.autoconfigure.security.Http401AuthenticationEntryPoint;
//import com.kakawait.spring.boot.security.cas.autoconfigure.CasHttpSecurityConfigurer;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//        //User from memory
//        auth.inMemoryAuthentication()
//                .withUser("casuser").password("Mellon").roles("USER");
//
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http
//                .authorizeRequests()
//                .antMatchers("/unprotected").permitAll()
//                .antMatchers("/protected").authenticated();
//
//        CasHttpSecurityConfigurer.cas().configure(http);
////        http.exceptionHandling().authenticationEntryPoint(new Http401AuthenticationEntryPoint("CAS"));
//
//    }
//}
