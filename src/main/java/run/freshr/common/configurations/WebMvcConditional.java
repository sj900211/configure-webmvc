package run.freshr.common.configurations;

import static java.util.Objects.isNull;
import static org.springframework.http.HttpMethod.DELETE;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.http.HttpMethod.PUT;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import run.freshr.common.data.WebMvcData;
import run.freshr.common.properties.WebMvcProperties;

/**
 * Web MVC 설정
 *
 * @author FreshR
 * @apiNote application.properties 와 application.yml 에서 설정한 값과<br>
 *          기본 설정 값으로 Web MVC 데이터 객체 설정
 * @since 2024. 3. 27. 오후 1:15:29
 */
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(WebMvcProperties.class)
public class WebMvcConditional {

  /**
   * Web MVC 데이터 객체 설정
   *
   * @param properties application.properties 와 application.yml 에서 설정한 값
   * @return Web MVC 데이터 객체
   * @apiNote application.properties 와 application.yml 에서 설정한 값과<br>
   *          기본 설정 값으로 Web MVC 데이터 객체 설정
   * @author FreshR
   * @since 2024. 3. 26. 오후 5:12:17
   */
  @Bean
  @ConditionalOnMissingBean
  public WebMvcData webMvcData(WebMvcProperties properties) {
    Set<HttpMethod> corsMethods = Set.of(GET, POST, PUT, DELETE);
    List<HttpMethod> cors = properties.getCors();

    if (!isNull(cors) && !cors.isEmpty()) {
      corsMethods = new HashSet<>(cors);
    }

    return WebMvcData.builder()
        .corsMethods(corsMethods)
        .build();
  }

}
