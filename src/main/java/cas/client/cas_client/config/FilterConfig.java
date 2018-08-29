//package cas.client.cas_client.config;
//
//import com.kakawait.spring.security.cas.client.CasAuthorizationInterceptor;
//import com.kakawait.spring.security.cas.client.ticket.ProxyTicketProvider;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.Ordered;
//import org.springframework.security.cas.ServiceProperties;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.filter.ForwardedHeaderFilter;
//
//@Configuration
//public class FilterConfig {
//
//    @Bean
//    FilterRegistrationBean forwardedHeaderFilter() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new ForwardedHeaderFilter());
//        filterRegistrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE);
//        return filterRegistrationBean;
//    }
//
//    @Bean
//    RestTemplate casRestTemplate(ServiceProperties serviceProperties, ProxyTicketProvider proxyTicketProvider) {
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.getInterceptors().add(new CasAuthorizationInterceptor(serviceProperties, proxyTicketProvider));
//        return restTemplate;
//    }
//}
