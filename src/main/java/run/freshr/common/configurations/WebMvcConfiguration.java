package run.freshr.common.configurations;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import run.freshr.common.data.WebMvcData;

/**
 * WebMVC 설정
 *
 * @author FreshR
 * @apiNote WebMVC 설정<br>
 *          Cross-Origin Resource Sharing 설정
 * @since 2024. 3. 27. 오전 11:29:46
 */
@Configuration
@RequiredArgsConstructor
public class WebMvcConfiguration implements WebMvcConfigurer {

  private final WebMvcData webMvcData;

  /**
   * 설정한 요청에 대해 CORS 허용
   *
   * @param registry registry
   * @apiNote 설정한 요청에 대해 CORS 허용
   * @author FreshR
   * @since 2024. 3. 27. 오전 11:29:46
   */
  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
        .allowedOrigins("*")
        .allowedMethods(webMvcData.getCorsMethods()
            .stream()
            .map(HttpMethod::name)
            .toArray(String[]::new));
  }

}
