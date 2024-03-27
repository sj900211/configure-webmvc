package run.freshr.common.properties;

import java.util.List;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpMethod;

/**
 * Web MVC 속성 정의
 *
 * @author FreshR
 * @apiNote Web MVC 속성을 정의해서 application.properties 또는 application.yml 에서 사용할 수 있도록 설정
 * @since 2024. 3. 27. 오후 1:15:29
 */
@Data
@ConfigurationProperties("freshr.web")
public class WebMvcProperties {

  /**
   * CORS 허용 HTTP Method
   *
   * @apiNote CORS 허용 HTTP Method
   * @since 2024. 3. 27. 오후 1:15:29
   */
  private List<HttpMethod> cors;

}
