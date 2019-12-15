通过增加 以下这两个页面 进行异常处理
house-web/src/main/resources/templates/error/404.ftl
house-web/src/main/resources/templates/error/500.ftl

自定义异常的辅助处理
/house-web/src/main/java/com/david/house/web/controller/Errorhandler.java

java.lang.IllegalAccessException: test
	at com.david.house.web.controller.HelloController.hello(HelloController.java:24) ~[classes/:na]
