package run.freshr.common.data;

import java.util.List;
import java.util.Set;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpMethod;

/**
 * Web MVC 데이터 모델
 *
 * @author FreshR
 * @apiNote Web MVC 데이터 모델
 * @since 2024. 3. 27. 오후 1:15:29
 */
@Data
@Builder
public class WebMvcData {

  /**
   * CORS 허용 HTTP Method
   *
   * @apiNote CORS 허용 HTTP Method
   * @since 2024. 3. 27. 오후 1:15:29
   */
  private Set<HttpMethod> corsMethods;

}
