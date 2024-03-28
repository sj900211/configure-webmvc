# Configure > Web MVC
> Web MVC 설정 관리
> - ## [WebMvcConfiguration](./src/main/java/run/freshr/common/configurations/WebMvcConfiguration.java)
>> Web MVC 설정  
>> CORS 설정 외에는 없음
> - ## [WebMvcAutoConfiguration](./src/main/java/run/freshr/common/configurations/WebMvcAutoConfiguration.java)
>> WebMvcProperties 에 설정한 값으로 ExceptionsData 를 빌드한다.
> - ## [WebMvcProperties](./src/main/java/run/freshr/common/properties/WebMvcProperties.java)
>> 프로젝트에 따라 변경되는 Web MVC 항목의 정보를 변경할 수 있는 Properties 정의  
>> 프로젝트에서 사용할 때에는 application.yml 에서 각 정보를 변경할 수 있다.  
>> 현재는 CORS 설정외에는 없음
>> ``` yaml
>> freshr:
>>   web:
>>     cors:
>>       - GET
>>       - POST
>>       - PUT
>>       - DELETE
>>       - OPTION
>> ```
> - ## [WebMvcData](./src/main/java/run/freshr/common/data/WebMvcData.java)
>> WebMvcProperties 에 설정한 값으로 빌드되는 Class.  
>> 이 Class 로 Web MVC 를 설정하거나 프로젝트에서 사용